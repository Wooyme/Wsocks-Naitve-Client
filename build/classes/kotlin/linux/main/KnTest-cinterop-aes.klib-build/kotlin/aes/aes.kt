@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package aes

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import platform.posix.uint32_t
import platform.posix.uint8_tVar

// NOTE THIS FILE IS AUTO-GENERATED

fun AES_init_ctx(ctx: CValuesRef<AES_ctx>?, key: CValuesRef<uint8_tVar>?): Unit {
    memScoped {
        return kniBridge0(ctx?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue)
    }
}

fun AES_init_ctx_iv(ctx: CValuesRef<AES_ctx>?, key: CValuesRef<uint8_tVar>?, iv: CValuesRef<uint8_tVar>?): Unit {
    memScoped {
        return kniBridge1(ctx?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue)
    }
}

fun AES_ctx_set_iv(ctx: CValuesRef<AES_ctx>?, iv: CValuesRef<uint8_tVar>?): Unit {
    memScoped {
        return kniBridge2(ctx?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue)
    }
}

fun AES_ECB_encrypt(ctx: CValuesRef<AES_ctx>?, buf: CValuesRef<uint8_tVar>?): Unit {
    memScoped {
        return kniBridge3(ctx?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue)
    }
}

fun AES_ECB_decrypt(ctx: CValuesRef<AES_ctx>?, buf: CValuesRef<uint8_tVar>?): Unit {
    memScoped {
        return kniBridge4(ctx?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue)
    }
}

fun AES_CBC_encrypt_buffer(ctx: CValuesRef<AES_ctx>?, buf: CValuesRef<uint8_tVar>?, length: uint32_t): Unit {
    memScoped {
        return kniBridge5(ctx?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, length)
    }
}

fun AES_CBC_decrypt_buffer(ctx: CValuesRef<AES_ctx>?, buf: CValuesRef<uint8_tVar>?, length: uint32_t): Unit {
    memScoped {
        return kniBridge6(ctx?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, length)
    }
}

fun AES_CTR_xcrypt_buffer(ctx: CValuesRef<AES_ctx>?, buf: CValuesRef<uint8_tVar>?, length: uint32_t): Unit {
    memScoped {
        return kniBridge7(ctx?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, length)
    }
}

const val CBC: Int = 1

const val ECB: Int = 1

const val CTR: Int = 1

const val AES128: Int = 1

const val AES_BLOCKLEN: Int = 16

const val AES_KEYLEN: Int = 16

const val AES_keyExpSize: Int = 176

class AES_ctx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(192, 1)
    
    val RoundKey: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
    val Iv: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(176)
    
}

@SymbolName("aes_kniBridge0")
private external fun kniBridge0(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("aes_kniBridge1")
private external fun kniBridge1(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("aes_kniBridge2")
private external fun kniBridge2(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("aes_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("aes_kniBridge4")
private external fun kniBridge4(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("aes_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: NativePtr, p2: UInt): Unit
@SymbolName("aes_kniBridge6")
private external fun kniBridge6(p0: NativePtr, p1: NativePtr, p2: UInt): Unit
@SymbolName("aes_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr, p2: UInt): Unit
