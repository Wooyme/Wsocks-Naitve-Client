package data

import kotlinx.cinterop.*

class RawData(val uuid:String,val data:ByteArray) {
    fun toCValues():CValues<ByteVar>{
        val body = cValuesOf(uuid.toCharArray().size).getBytes()+uuid.toCharArray().map { it.toByte() }.toByteArray()+data
        val bytes = cValuesOf(Flag.RAW.ordinal).getBytes()+Aes.encrypt(body)
        return bytes.toCValues()
    }

}