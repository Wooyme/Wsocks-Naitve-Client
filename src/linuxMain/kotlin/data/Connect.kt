package data

import kotlinx.cinterop.*

class Connect(val uuid:String,val host:String,val port:Int) {
    fun toCValues():CValues<ByteVar>{
        val body = Aes.encrypt("""{"host":"$host","port":$port,"uuid":"$uuid"}""".toCharArray().map { it.toByte() }.toByteArray())
        val bytes = cValuesOf(Flag.CONNECT.ordinal).getBytes()+body
        return bytes.toCValues()
    }
}