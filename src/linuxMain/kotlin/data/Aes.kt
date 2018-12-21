package data

import openssl.*
import kotlinx.cinterop.*
import platform.posix.memcpy
import platform.posix.memset

@ThreadLocal
object Aes {
    val key = nativeHeap.allocArray<ByteVar>(16)
    val iv= nativeHeap.allocArray<ByteVar>(16)
    init {
        memset(key,0x06,16)
        memset(iv,0x05,16)
    }

    fun init(key:CArrayPointer<ByteVar>){
        memcpy(this.key,key,16)
    }

    fun encrypt(array: ByteArray):ByteArray{
        val outputSize = array.size + 16-array.size.rem(16)
        return memScoped {
            var cipherLen = 0
            val temp = allocArray<UByteVar>(outputSize)
            val ctx = EVP_CIPHER_CTX_new()!!
            EVP_CIPHER_CTX_set_padding(ctx, 1)
            EVP_EncryptInit_ex(
                ctx
                , EVP_aes_128_cbc()
                , null
                , key.reinterpret()
                , iv.reinterpret())
            val outputSizePtr = alloc<IntVar>().ptr
            EVP_EncryptUpdate(ctx.reinterpret(),temp, outputSizePtr,array.toCValues().ptr.reinterpret(),array.size)
            cipherLen+=outputSizePtr.pointed.value
            EVP_EncryptFinal_ex(ctx.reinterpret(),temp+outputSizePtr.pointed.value,outputSizePtr)
            cipherLen+=outputSizePtr.pointed.value
            EVP_CIPHER_CTX_free(ctx)
            temp.readBytes(outputSize)
        }
    }
    fun decrypt(array: ByteArray):ByteArray{
        return memScoped {
            val ctx = EVP_CIPHER_CTX_new()!!
            EVP_CIPHER_CTX_set_padding(ctx, 1)
            var cipherLen = 0
            val temp = allocArray<UByteVar>(array.size)
            EVP_DecryptInit_ex(ctx
                , EVP_aes_128_cbc()
                , null
                ,key.reinterpret()
                ,iv.reinterpret())
            val outputSizePtr = alloc<IntVar>().ptr
            EVP_DecryptUpdate(ctx.reinterpret(),temp, outputSizePtr
                ,array.toCValues().ptr.reinterpret(),array.size)
            cipherLen+=outputSizePtr.pointed.value

            EVP_DecryptFinal_ex(ctx.reinterpret()
                ,temp+outputSizePtr.pointed.value,outputSizePtr)
            cipherLen+=outputSizePtr.pointed.value
            EVP_CIPHER_CTX_free(ctx)
            temp.readBytes(cipherLen)
        }
    }
}