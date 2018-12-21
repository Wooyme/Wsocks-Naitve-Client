package core

import data.Aes
import data.Flag
import kotlinx.cinterop.*
import mongoose.*

@ExperimentalUnsignedTypes
@ThreadLocal
object Transport {
    lateinit var nc:CPointer<mg_connection>
    fun init(mgr:CPointer<mg_mgr>,user: String, pass: String, port: Int, address: String):Boolean {
        nc = mg_connect_ws(mgr, staticCFunction { ncp, ev, data ->
            handler(ncp!!, ev, data)
        }, "ws://$address:$port/$user/$pass", "proxy", null)?:return false
        return true
    }

    private fun handler(nc: CPointer<mg_connection>, ev: Int, data: COpaquePointer?) {
        when (ev) {
            MG_EV_CONNECT -> {
                val status = data!!.reinterpret<IntVar>().pointed.value
                if (status != 0) {
                    println("Connection failed with status: $status")
                }
            }
            MG_EV_WEBSOCKET_HANDSHAKE_DONE -> {
                println("Connected")
            }
            MG_EV_WEBSOCKET_FRAME -> {
                val wm: CPointer<websocket_message> = data!!.reinterpret()
                val raw = wm.pointed.data!!
                val flag = raw.reinterpret<IntVar>().pointed.value
                when(flag){
                    Flag.CONNECT_SUCCESS.ordinal->{

                        val uuid = Aes.decrypt((raw+4)!!.reinterpret<ByteVar>().readBytes(wm.pointed.size.toInt()-4)).map { it.toChar() }.toCharArray().let { String(it) }
                        val response = byteArrayOf(0x05,0x00,0x00,0x01,0x00,0x00,0x00,0x00,0x00,0x00).toCValues()
                        mg_send(Socks5.connectionMap[uuid],response,response.size)
                    }
                    Flag.RAW.ordinal->{
                        val decrypted = Aes.decrypt((raw+4)!!.readBytes(wm.pointed.size.toInt()-4))
                        val uuidLen = decrypted.getIntAt(0)
                        val uuid = decrypted.sliceArray(4 until 4+uuidLen).map { it.toChar() }.toCharArray().let { String(it) }
                        val bytes = decrypted.sliceArray(4+uuidLen until decrypted.size)
                        val con = Socks5.connectionMap[uuid]
                        if(con==null){
                            println("Con is null [$uuid]")
                            return
                        }
                        println("[RECV] UUID:$uuid")
                        mg_send(Socks5.connectionMap[uuid],bytes.toCValues(),bytes.size)
                    }
                    Flag.EXCEPTION.ordinal->{
                        val decrypted = Aes.decrypt((raw+4)!!.readBytes(wm.pointed.size.toInt()-4))
                        println(String(decrypted.map { it.toChar() }.toCharArray()))
                    }
                }
            }
            MG_EV_CLOSE->{
            }
        }
    }
}