package utils

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.get

fun CPointer<ByteVar>.toUShort() = ((this[0].toInt() and 255) shl 8)  + (this[1].toInt() and 255)
