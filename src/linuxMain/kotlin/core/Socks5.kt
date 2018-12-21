package core

import data.Connect
import data.RawData
import kotlinx.cinterop.*
import mongoose.*
import tray.g_uuid_string_random
import utils.toUShort

@ExperimentalUnsignedTypes
@ThreadLocal
object Socks5 {
    val connectionMap = HashMap<String, CPointer<mg_connection>>()
    private val reConnectionMap = HashMap<CPointer<mg_connection>, String>()
    fun init(mgr:CPointer<mg_mgr>,port: Int):Boolean {
        return mg_bind(mgr, port.toString(), staticCFunction { nc, ev, p ->
            handler(nc!!, ev, p)
        })!=null
    }

    fun clear(){
        connectionMap.clear()
        reConnectionMap.clear()
    }

    private fun handler(nc: CPointer<mg_connection>, ev: Int, p: COpaquePointer?) {
        when (ev) {
            MG_EV_RECV -> {
                val io = nc.pointed.recv_mbuf
                val buf = io.buf!!
                val len = io.len.toInt()
                when {
                    reConnectionMap.contains(nc) -> sendFrame(reConnectionMap[nc]!!, len, buf)
                    buf[1].toInt() + 2 == len -> onHandshake(nc)
                    else -> when (buf[1].toInt()) {
                        1 -> onConnect(nc, buf)
                        else -> {
                            val response = cValuesOf(0x05.toByte(), 0x07)
                            mg_send(nc, response, 2)
                        }
                    }
                }
                mbuf_remove(io.ptr, io.len)
            }
            MG_EV_CLOSE -> {
                val uuid = reConnectionMap.remove(nc)
                connectionMap.remove(uuid)
            }
        }
    }

    private fun onHandshake(nc: CPointer<mg_connection>) {
        val buf = cValuesOf(0x05.toByte(), 0x00)
        mg_send(nc, buf, 2)
    }

    private fun onConnect(nc: CPointer<mg_connection>, buf: CPointer<ByteVar>) {
        val atyp = buf[3].toInt()
        val (host, port) = when (atyp) {
            1 -> {
                (buf + 4)!!.readBytes(4).joinToString(".") { it.toUInt().toString() } to (buf + 8)!!.toUShort()
            }
            3 -> {
                val len = buf[4].toInt()
                String((buf + 5)!!.readBytes(len).map { it.toChar() }.toCharArray()) to (buf + 5 + len)!!.toUShort()
            }
            else -> {
                val response = cValuesOf(0x05.toByte(), 0x08)
                mg_send(nc, response, 2)
                return
            }
        }

        val uuid = g_uuid_string_random()!!.toKString()
        connectionMap[uuid] = nc
        reConnectionMap[nc] = uuid

        val request = Connect(uuid, host, port).toCValues()
        mg_send_websocket_frame(Transport.nc, WEBSOCKET_OP_BINARY, request, request.size.toULong())
    }

    private fun sendFrame(uuid: String, len: Int, buf: CPointer<ByteVar>) {
        val request = RawData(uuid, buf.readBytes(len)).toCValues()
        mg_send_websocket_frame(Transport.nc, WEBSOCKET_OP_BINARY, request, request.size.toULong())
    }
}