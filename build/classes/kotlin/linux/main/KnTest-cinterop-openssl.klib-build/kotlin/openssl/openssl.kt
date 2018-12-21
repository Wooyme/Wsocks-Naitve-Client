@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package openssl

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs.ASN1_ITEM_st
import cnames.structs.ASN1_TEMPLATE_st
import cnames.structs.ASN1_TLC_st
import cnames.structs.ASN1_VALUE_st
import cnames.structs.AUTHORITY_KEYID_st
import cnames.structs.DIST_POINT_st
import cnames.structs.ISSUING_DIST_POINT_st
import cnames.structs.NAME_CONSTRAINTS_st
import cnames.structs.X509_POLICY_CACHE_st
import cnames.structs.X509_POLICY_LEVEL_st
import cnames.structs.X509_POLICY_NODE_st
import cnames.structs.X509_POLICY_TREE_st
import cnames.structs.X509_VERIFY_PARAM_st
import cnames.structs.X509_algor_st
import cnames.structs.X509_crl_st
import cnames.structs.X509_name_st
import cnames.structs.X509_pubkey_st
import cnames.structs._IO_FILE_plus
import cnames.structs.__jmp_buf_tag
import cnames.structs.__locale_data
import cnames.structs.asn1_object_st
import cnames.structs.asn1_pctx_st
import cnames.structs.asn1_sctx_st
import cnames.structs.bignum_ctx
import cnames.structs.bignum_st
import cnames.structs.bio_addr_st
import cnames.structs.bio_addrinfo_st
import cnames.structs.bio_method_st
import cnames.structs.bio_st
import cnames.structs.bn_blinding_st
import cnames.structs.bn_gencb_st
import cnames.structs.bn_mont_ctx_st
import cnames.structs.bn_recp_ctx_st
import cnames.structs.buf_mem_st
import cnames.structs.comp_ctx_st
import cnames.structs.comp_method_st
import cnames.structs.conf_imodule_st
import cnames.structs.conf_module_st
import cnames.structs.ct_policy_eval_ctx_st
import cnames.structs.ctlog_st
import cnames.structs.ctlog_store_st
import cnames.structs.dh_method
import cnames.structs.dh_st
import cnames.structs.dsa_method
import cnames.structs.dsa_st
import cnames.structs.ec_key_method_st
import cnames.structs.ec_key_st
import cnames.structs.engine_st
import cnames.structs.evp_Encode_Ctx_st
import cnames.structs.evp_cipher_ctx_st
import cnames.structs.evp_cipher_st
import cnames.structs.evp_md_ctx_st
import cnames.structs.evp_md_st
import cnames.structs.evp_pkey_asn1_method_st
import cnames.structs.evp_pkey_ctx_st
import cnames.structs.evp_pkey_method_st
import cnames.structs.evp_pkey_st
import cnames.structs.hmac_ctx_st
import cnames.structs.hostent
import cnames.structs.lhash_node_st
import cnames.structs.lhash_st
import cnames.structs.ocsp_req_ctx_st
import cnames.structs.ocsp_responder_id_st
import cnames.structs.ocsp_response_st
import cnames.structs.ossl_init_settings_st
import cnames.structs.pkcs8_priv_key_info_st
import cnames.structs.rand_meth_st
import cnames.structs.rsa_meth_st
import cnames.structs.rsa_st
import cnames.structs.sct_ctx_st
import cnames.structs.sct_st
import cnames.structs.sigevent
import cnames.structs.ssl_ctx_st
import cnames.structs.ssl_dane_st
import cnames.structs.ssl_st
import cnames.structs.stack_st
import cnames.structs.stack_st_ASN1_GENERALSTRING
import cnames.structs.stack_st_ASN1_INTEGER
import cnames.structs.stack_st_ASN1_OBJECT
import cnames.structs.stack_st_ASN1_STRING_TABLE
import cnames.structs.stack_st_ASN1_TYPE
import cnames.structs.stack_st_ASN1_UTF8STRING
import cnames.structs.stack_st_BIO
import cnames.structs.stack_st_CONF_IMODULE
import cnames.structs.stack_st_CONF_MODULE
import cnames.structs.stack_st_CONF_VALUE
import cnames.structs.stack_st_OPENSSL_BLOCK
import cnames.structs.stack_st_OPENSSL_CSTRING
import cnames.structs.stack_st_OPENSSL_STRING
import cnames.structs.stack_st_X509_ALGOR
import cnames.structs.stack_st_void
import cnames.structs.ui_method_st
import cnames.structs.ui_st
import cnames.structs.v3_ext_ctx
import cnames.structs.x509_crl_method_st
import cnames.structs.x509_lookup_method_st
import cnames.structs.x509_lookup_st
import cnames.structs.x509_object_st
import cnames.structs.x509_revoked_st
import cnames.structs.x509_st
import cnames.structs.x509_store_ctx_st
import cnames.structs.x509_store_st
import platform.posix.__gnuc_va_list
import platform.posix.size_t
import platform.posix.size_tVar
import platform.posix.wchar_t
import platform.posix.wchar_tVar

// NOTE THIS FILE IS AUTO-GENERATED

fun imaxabs(__n: intmax_t): intmax_t {
    return kniBridge0(__n)
}

fun imaxdiv(__numer: intmax_t, __denom: intmax_t): CValue<imaxdiv_t> {
    val kniRetVal = nativeHeap.alloc<imaxdiv_t>()
    try {
        kniBridge1(__numer, __denom, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun strtoimax(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): intmax_t {
    memScoped {
        return kniBridge2(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun strtoumax(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): uintmax_t {
    memScoped {
        return kniBridge3(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun wcstoimax(__nptr: CValuesRef<__gwchar_tVar>?, __endptr: CValuesRef<CPointerVar<__gwchar_tVar>>?, __base: Int): intmax_t {
    memScoped {
        return kniBridge4(__nptr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun wcstoumax(__nptr: CValuesRef<__gwchar_tVar>?, __endptr: CValuesRef<CPointerVar<__gwchar_tVar>>?, __base: Int): uintmax_t {
    memScoped {
        return kniBridge5(__nptr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun __underflow(arg0: CValuesRef<_IO_FILE>?): Int {
    memScoped {
        return kniBridge6(arg0?.getPointer(memScope).rawValue)
    }
}

fun __uflow(arg0: CValuesRef<_IO_FILE>?): Int {
    memScoped {
        return kniBridge7(arg0?.getPointer(memScope).rawValue)
    }
}

fun __overflow(arg0: CValuesRef<_IO_FILE>?, arg1: Int): Int {
    memScoped {
        return kniBridge8(arg0?.getPointer(memScope).rawValue, arg1)
    }
}

fun _IO_getc(__fp: CValuesRef<_IO_FILE>?): Int {
    memScoped {
        return kniBridge9(__fp?.getPointer(memScope).rawValue)
    }
}

fun _IO_putc(__c: Int, __fp: CValuesRef<_IO_FILE>?): Int {
    memScoped {
        return kniBridge10(__c, __fp?.getPointer(memScope).rawValue)
    }
}

fun _IO_feof(__fp: CValuesRef<_IO_FILE>?): Int {
    memScoped {
        return kniBridge11(__fp?.getPointer(memScope).rawValue)
    }
}

fun _IO_ferror(__fp: CValuesRef<_IO_FILE>?): Int {
    memScoped {
        return kniBridge12(__fp?.getPointer(memScope).rawValue)
    }
}

fun _IO_peekc_locked(__fp: CValuesRef<_IO_FILE>?): Int {
    memScoped {
        return kniBridge13(__fp?.getPointer(memScope).rawValue)
    }
}

fun _IO_flockfile(arg0: CValuesRef<_IO_FILE>?): Unit {
    memScoped {
        return kniBridge14(arg0?.getPointer(memScope).rawValue)
    }
}

fun _IO_funlockfile(arg0: CValuesRef<_IO_FILE>?): Unit {
    memScoped {
        return kniBridge15(arg0?.getPointer(memScope).rawValue)
    }
}

@Deprecated("Unable to import this declaration", level = DeprecationLevel.ERROR)
external fun _IO_ftrylockfile(arg0: CValuesRef<_IO_FILE>?): Int

fun _IO_vfscanf(arg0: CValuesRef<_IO_FILE>?, arg1: String?, arg2: __gnuc_va_list?, arg3: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge17(arg0?.getPointer(memScope).rawValue, arg1?.cstr?.getPointer(memScope).rawValue, arg2.rawValue, arg3?.getPointer(memScope).rawValue)
    }
}

fun _IO_vfprintf(arg0: CValuesRef<_IO_FILE>?, arg1: String?, arg2: __gnuc_va_list?): Int {
    memScoped {
        return kniBridge18(arg0?.getPointer(memScope).rawValue, arg1?.cstr?.getPointer(memScope).rawValue, arg2.rawValue)
    }
}

fun _IO_padn(arg0: CValuesRef<_IO_FILE>?, arg1: Int, arg2: __ssize_t): __ssize_t {
    memScoped {
        return kniBridge19(arg0?.getPointer(memScope).rawValue, arg1, arg2)
    }
}

fun _IO_sgetn(arg0: CValuesRef<_IO_FILE>?, arg1: CValuesRef<*>?, arg2: size_t): size_t {
    memScoped {
        return kniBridge20(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue, arg2)
    }
}

fun _IO_seekoff(arg0: CValuesRef<_IO_FILE>?, arg1: __off64_t, arg2: Int, arg3: Int): __off64_t {
    memScoped {
        return kniBridge21(arg0?.getPointer(memScope).rawValue, arg1, arg2, arg3)
    }
}

fun _IO_seekpos(arg0: CValuesRef<_IO_FILE>?, arg1: __off64_t, arg2: Int): __off64_t {
    memScoped {
        return kniBridge22(arg0?.getPointer(memScope).rawValue, arg1, arg2)
    }
}

fun _IO_free_backup_area(arg0: CValuesRef<_IO_FILE>?): Unit {
    memScoped {
        return kniBridge23(arg0?.getPointer(memScope).rawValue)
    }
}

fun remove(__filename: String?): Int {
    memScoped {
        return kniBridge24(__filename?.cstr?.getPointer(memScope).rawValue)
    }
}

fun rename(__old: String?, __new: String?): Int {
    memScoped {
        return kniBridge25(__old?.cstr?.getPointer(memScope).rawValue, __new?.cstr?.getPointer(memScope).rawValue)
    }
}

fun renameat(__oldfd: Int, __old: String?, __newfd: Int, __new: String?): Int {
    memScoped {
        return kniBridge26(__oldfd, __old?.cstr?.getPointer(memScope).rawValue, __newfd, __new?.cstr?.getPointer(memScope).rawValue)
    }
}

fun tmpfile(): CPointer<FILE>? {
    return interpretCPointer<FILE>(kniBridge27())
}

fun tmpnam(__s: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge28(__s?.getPointer(memScope).rawValue))
    }
}

fun tmpnam_r(__s: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge29(__s?.getPointer(memScope).rawValue))
    }
}

fun tempnam(__dir: String?, __pfx: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge30(__dir?.cstr?.getPointer(memScope).rawValue, __pfx?.cstr?.getPointer(memScope).rawValue))
    }
}

fun fclose(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge31(__stream?.getPointer(memScope).rawValue)
    }
}

fun fflush(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge32(__stream?.getPointer(memScope).rawValue)
    }
}

fun fflush_unlocked(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge33(__stream?.getPointer(memScope).rawValue)
    }
}

fun fopen(__filename: String?, __modes: String?): CPointer<FILE>? {
    memScoped {
        return interpretCPointer<FILE>(kniBridge34(__filename?.cstr?.getPointer(memScope).rawValue, __modes?.cstr?.getPointer(memScope).rawValue))
    }
}

fun freopen(__filename: String?, __modes: String?, __stream: CValuesRef<FILE>?): CPointer<FILE>? {
    memScoped {
        return interpretCPointer<FILE>(kniBridge35(__filename?.cstr?.getPointer(memScope).rawValue, __modes?.cstr?.getPointer(memScope).rawValue, __stream?.getPointer(memScope).rawValue))
    }
}

fun fdopen(__fd: Int, __modes: String?): CPointer<FILE>? {
    memScoped {
        return interpretCPointer<FILE>(kniBridge36(__fd, __modes?.cstr?.getPointer(memScope).rawValue))
    }
}

fun fmemopen(__s: CValuesRef<*>?, __len: size_t, __modes: String?): CPointer<FILE>? {
    memScoped {
        return interpretCPointer<FILE>(kniBridge37(__s?.getPointer(memScope).rawValue, __len, __modes?.cstr?.getPointer(memScope).rawValue))
    }
}

fun open_memstream(__bufloc: CValuesRef<CPointerVar<ByteVar>>?, __sizeloc: CValuesRef<size_tVar>?): CPointer<FILE>? {
    memScoped {
        return interpretCPointer<FILE>(kniBridge38(__bufloc?.getPointer(memScope).rawValue, __sizeloc?.getPointer(memScope).rawValue))
    }
}

fun setbuf(__stream: CValuesRef<FILE>?, __buf: CValuesRef<ByteVar>?): Unit {
    memScoped {
        return kniBridge39(__stream?.getPointer(memScope).rawValue, __buf?.getPointer(memScope).rawValue)
    }
}

fun setvbuf(__stream: CValuesRef<FILE>?, __buf: CValuesRef<ByteVar>?, __modes: Int, __n: size_t): Int {
    memScoped {
        return kniBridge40(__stream?.getPointer(memScope).rawValue, __buf?.getPointer(memScope).rawValue, __modes, __n)
    }
}

fun setbuffer(__stream: CValuesRef<FILE>?, __buf: CValuesRef<ByteVar>?, __size: size_t): Unit {
    memScoped {
        return kniBridge41(__stream?.getPointer(memScope).rawValue, __buf?.getPointer(memScope).rawValue, __size)
    }
}

fun setlinebuf(__stream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge42(__stream?.getPointer(memScope).rawValue)
    }
}

fun fprintf(__stream: CValuesRef<FILE>?, __format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge43(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__stream?.getPointer(memScope), __format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun printf(__format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge44(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun sprintf(__s: CValuesRef<ByteVar>?, __format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge45(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__s?.getPointer(memScope), __format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun vfprintf(__s: CValuesRef<FILE>?, __format: String?, __arg: __gnuc_va_list?): Int {
    memScoped {
        return kniBridge46(__s?.getPointer(memScope).rawValue, __format?.cstr?.getPointer(memScope).rawValue, __arg.rawValue)
    }
}

fun vprintf(__format: String?, __arg: __gnuc_va_list?): Int {
    memScoped {
        return kniBridge47(__format?.cstr?.getPointer(memScope).rawValue, __arg.rawValue)
    }
}

fun vsprintf(__s: CValuesRef<ByteVar>?, __format: String?, __arg: __gnuc_va_list?): Int {
    memScoped {
        return kniBridge48(__s?.getPointer(memScope).rawValue, __format?.cstr?.getPointer(memScope).rawValue, __arg.rawValue)
    }
}

fun snprintf(__s: CValuesRef<ByteVar>?, __maxlen: size_t, __format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge49(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__s?.getPointer(memScope), __maxlen, __format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun vsnprintf(__s: CValuesRef<ByteVar>?, __maxlen: size_t, __format: String?, __arg: __gnuc_va_list?): Int {
    memScoped {
        return kniBridge50(__s?.getPointer(memScope).rawValue, __maxlen, __format?.cstr?.getPointer(memScope).rawValue, __arg.rawValue)
    }
}

fun vdprintf(__fd: Int, __fmt: String?, __arg: __gnuc_va_list?): Int {
    memScoped {
        return kniBridge51(__fd, __fmt?.cstr?.getPointer(memScope).rawValue, __arg.rawValue)
    }
}

fun dprintf(__fd: Int, __fmt: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge52(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__fd, __fmt?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun fscanf(__stream: CValuesRef<FILE>?, __format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge53(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__stream?.getPointer(memScope), __format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun scanf(__format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge54(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun sscanf(__s: String?, __format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge55(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__s?.cstr?.getPointer(memScope), __format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun vfscanf(__s: CValuesRef<FILE>?, __format: String?, __arg: __gnuc_va_list?): Int {
    memScoped {
        return kniBridge56(__s?.getPointer(memScope).rawValue, __format?.cstr?.getPointer(memScope).rawValue, __arg.rawValue)
    }
}

fun vscanf(__format: String?, __arg: __gnuc_va_list?): Int {
    memScoped {
        return kniBridge57(__format?.cstr?.getPointer(memScope).rawValue, __arg.rawValue)
    }
}

fun vsscanf(__s: String?, __format: String?, __arg: __gnuc_va_list?): Int {
    memScoped {
        return kniBridge58(__s?.cstr?.getPointer(memScope).rawValue, __format?.cstr?.getPointer(memScope).rawValue, __arg.rawValue)
    }
}

fun fgetc(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge59(__stream?.getPointer(memScope).rawValue)
    }
}

fun getc(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge60(__stream?.getPointer(memScope).rawValue)
    }
}

fun getchar(): Int {
    return kniBridge61()
}

fun getc_unlocked(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge62(__stream?.getPointer(memScope).rawValue)
    }
}

fun getchar_unlocked(): Int {
    return kniBridge63()
}

fun fgetc_unlocked(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge64(__stream?.getPointer(memScope).rawValue)
    }
}

fun fputc(__c: Int, __stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge65(__c, __stream?.getPointer(memScope).rawValue)
    }
}

fun putc(__c: Int, __stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge66(__c, __stream?.getPointer(memScope).rawValue)
    }
}

fun putchar(__c: Int): Int {
    return kniBridge67(__c)
}

fun fputc_unlocked(__c: Int, __stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge68(__c, __stream?.getPointer(memScope).rawValue)
    }
}

fun putc_unlocked(__c: Int, __stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge69(__c, __stream?.getPointer(memScope).rawValue)
    }
}

fun putchar_unlocked(__c: Int): Int {
    return kniBridge70(__c)
}

fun getw(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge71(__stream?.getPointer(memScope).rawValue)
    }
}

fun putw(__w: Int, __stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge72(__w, __stream?.getPointer(memScope).rawValue)
    }
}

fun fgets(__s: CValuesRef<ByteVar>?, __n: Int, __stream: CValuesRef<FILE>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge73(__s?.getPointer(memScope).rawValue, __n, __stream?.getPointer(memScope).rawValue))
    }
}

fun __getdelim(__lineptr: CValuesRef<CPointerVar<ByteVar>>?, __n: CValuesRef<size_tVar>?, __delimiter: Int, __stream: CValuesRef<FILE>?): __ssize_t {
    memScoped {
        return kniBridge74(__lineptr?.getPointer(memScope).rawValue, __n?.getPointer(memScope).rawValue, __delimiter, __stream?.getPointer(memScope).rawValue)
    }
}

fun getdelim(__lineptr: CValuesRef<CPointerVar<ByteVar>>?, __n: CValuesRef<size_tVar>?, __delimiter: Int, __stream: CValuesRef<FILE>?): __ssize_t {
    memScoped {
        return kniBridge75(__lineptr?.getPointer(memScope).rawValue, __n?.getPointer(memScope).rawValue, __delimiter, __stream?.getPointer(memScope).rawValue)
    }
}

fun getline(__lineptr: CValuesRef<CPointerVar<ByteVar>>?, __n: CValuesRef<size_tVar>?, __stream: CValuesRef<FILE>?): __ssize_t {
    memScoped {
        return kniBridge76(__lineptr?.getPointer(memScope).rawValue, __n?.getPointer(memScope).rawValue, __stream?.getPointer(memScope).rawValue)
    }
}

fun fputs(__s: String?, __stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge77(__s?.cstr?.getPointer(memScope).rawValue, __stream?.getPointer(memScope).rawValue)
    }
}

fun puts(__s: String?): Int {
    memScoped {
        return kniBridge78(__s?.cstr?.getPointer(memScope).rawValue)
    }
}

fun ungetc(__c: Int, __stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge79(__c, __stream?.getPointer(memScope).rawValue)
    }
}

fun fread(__ptr: CValuesRef<*>?, __size: size_t, __n: size_t, __stream: CValuesRef<FILE>?): size_t {
    memScoped {
        return kniBridge80(__ptr?.getPointer(memScope).rawValue, __size, __n, __stream?.getPointer(memScope).rawValue)
    }
}

fun fwrite(__ptr: CValuesRef<*>?, __size: size_t, __n: size_t, __s: CValuesRef<FILE>?): size_t {
    memScoped {
        return kniBridge81(__ptr?.getPointer(memScope).rawValue, __size, __n, __s?.getPointer(memScope).rawValue)
    }
}

fun fread_unlocked(__ptr: CValuesRef<*>?, __size: size_t, __n: size_t, __stream: CValuesRef<FILE>?): size_t {
    memScoped {
        return kniBridge82(__ptr?.getPointer(memScope).rawValue, __size, __n, __stream?.getPointer(memScope).rawValue)
    }
}

fun fwrite_unlocked(__ptr: CValuesRef<*>?, __size: size_t, __n: size_t, __stream: CValuesRef<FILE>?): size_t {
    memScoped {
        return kniBridge83(__ptr?.getPointer(memScope).rawValue, __size, __n, __stream?.getPointer(memScope).rawValue)
    }
}

fun fseek(__stream: CValuesRef<FILE>?, __off: Long, __whence: Int): Int {
    memScoped {
        return kniBridge84(__stream?.getPointer(memScope).rawValue, __off, __whence)
    }
}

fun ftell(__stream: CValuesRef<FILE>?): Long {
    memScoped {
        return kniBridge85(__stream?.getPointer(memScope).rawValue)
    }
}

fun rewind(__stream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge86(__stream?.getPointer(memScope).rawValue)
    }
}

fun fseeko(__stream: CValuesRef<FILE>?, __off: __off_t, __whence: Int): Int {
    memScoped {
        return kniBridge87(__stream?.getPointer(memScope).rawValue, __off, __whence)
    }
}

fun ftello(__stream: CValuesRef<FILE>?): __off_t {
    memScoped {
        return kniBridge88(__stream?.getPointer(memScope).rawValue)
    }
}

fun fgetpos(__stream: CValuesRef<FILE>?, __pos: CValuesRef<fpos_t>?): Int {
    memScoped {
        return kniBridge89(__stream?.getPointer(memScope).rawValue, __pos?.getPointer(memScope).rawValue)
    }
}

fun fsetpos(__stream: CValuesRef<FILE>?, __pos: CValuesRef<fpos_t>?): Int {
    memScoped {
        return kniBridge90(__stream?.getPointer(memScope).rawValue, __pos?.getPointer(memScope).rawValue)
    }
}

fun clearerr(__stream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge91(__stream?.getPointer(memScope).rawValue)
    }
}

fun feof(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge92(__stream?.getPointer(memScope).rawValue)
    }
}

fun ferror(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge93(__stream?.getPointer(memScope).rawValue)
    }
}

fun clearerr_unlocked(__stream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge94(__stream?.getPointer(memScope).rawValue)
    }
}

fun feof_unlocked(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge95(__stream?.getPointer(memScope).rawValue)
    }
}

fun ferror_unlocked(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge96(__stream?.getPointer(memScope).rawValue)
    }
}

fun perror(__s: String?): Unit {
    memScoped {
        return kniBridge97(__s?.cstr?.getPointer(memScope).rawValue)
    }
}

fun fileno(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge98(__stream?.getPointer(memScope).rawValue)
    }
}

fun fileno_unlocked(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge99(__stream?.getPointer(memScope).rawValue)
    }
}

fun popen(__command: String?, __modes: String?): CPointer<FILE>? {
    memScoped {
        return interpretCPointer<FILE>(kniBridge100(__command?.cstr?.getPointer(memScope).rawValue, __modes?.cstr?.getPointer(memScope).rawValue))
    }
}

fun pclose(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge101(__stream?.getPointer(memScope).rawValue)
    }
}

fun ctermid(__s: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge102(__s?.getPointer(memScope).rawValue))
    }
}

fun flockfile(__stream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge103(__stream?.getPointer(memScope).rawValue)
    }
}

fun ftrylockfile(__stream: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge104(__stream?.getPointer(memScope).rawValue)
    }
}

fun funlockfile(__stream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge105(__stream?.getPointer(memScope).rawValue)
    }
}

fun __ctype_get_mb_cur_max(): size_t {
    return kniBridge106()
}

fun atof(__nptr: String?): Double {
    memScoped {
        return kniBridge107(__nptr?.cstr?.getPointer(memScope).rawValue)
    }
}

fun atoi(__nptr: String?): Int {
    memScoped {
        return kniBridge108(__nptr?.cstr?.getPointer(memScope).rawValue)
    }
}

fun atol(__nptr: String?): Long {
    memScoped {
        return kniBridge109(__nptr?.cstr?.getPointer(memScope).rawValue)
    }
}

fun atoll(__nptr: String?): Long {
    memScoped {
        return kniBridge110(__nptr?.cstr?.getPointer(memScope).rawValue)
    }
}

fun strtod(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?): Double {
    memScoped {
        return kniBridge111(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue)
    }
}

fun strtof(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?): Float {
    memScoped {
        return kniBridge112(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue)
    }
}

fun strtol(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): Long {
    memScoped {
        return kniBridge113(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun strtoul(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): ULong {
    memScoped {
        return kniBridge114(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun strtoq(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): Long {
    memScoped {
        return kniBridge115(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun strtouq(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): ULong {
    memScoped {
        return kniBridge116(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun strtoll(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): Long {
    memScoped {
        return kniBridge117(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun strtoull(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): ULong {
    memScoped {
        return kniBridge118(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun l64a(__n: Long): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge119(__n))
}

fun a64l(__s: String?): Long {
    memScoped {
        return kniBridge120(__s?.cstr?.getPointer(memScope).rawValue)
    }
}

fun __uint16_identity(__x: __uint16_t): __uint16_t {
    return kniBridge121(__x)
}

fun __uint32_identity(__x: __uint32_t): __uint32_t {
    return kniBridge122(__x)
}

fun __uint64_identity(__x: __uint64_t): __uint64_t {
    return kniBridge123(__x)
}

fun select(__nfds: Int, __readfds: CValuesRef<fd_set>?, __writefds: CValuesRef<fd_set>?, __exceptfds: CValuesRef<fd_set>?, __timeout: CValuesRef<timeval>?): Int {
    memScoped {
        return kniBridge124(__nfds, __readfds?.getPointer(memScope).rawValue, __writefds?.getPointer(memScope).rawValue, __exceptfds?.getPointer(memScope).rawValue, __timeout?.getPointer(memScope).rawValue)
    }
}

fun pselect(__nfds: Int, __readfds: CValuesRef<fd_set>?, __writefds: CValuesRef<fd_set>?, __exceptfds: CValuesRef<fd_set>?, __timeout: CValuesRef<timespec>?, __sigmask: CValuesRef<__sigset_t>?): Int {
    memScoped {
        return kniBridge125(__nfds, __readfds?.getPointer(memScope).rawValue, __writefds?.getPointer(memScope).rawValue, __exceptfds?.getPointer(memScope).rawValue, __timeout?.getPointer(memScope).rawValue, __sigmask?.getPointer(memScope).rawValue)
    }
}

fun gnu_dev_major(__dev: __dev_t): UInt {
    return kniBridge126(__dev)
}

fun gnu_dev_minor(__dev: __dev_t): UInt {
    return kniBridge127(__dev)
}

fun gnu_dev_makedev(__major: UInt, __minor: UInt): __dev_t {
    return kniBridge128(__major, __minor)
}

fun random(): Long {
    return kniBridge129()
}

fun srandom(__seed: UInt): Unit {
    return kniBridge130(__seed)
}

fun initstate(__seed: UInt, __statebuf: CValuesRef<ByteVar>?, __statelen: size_t): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge131(__seed, __statebuf?.getPointer(memScope).rawValue, __statelen))
    }
}

fun setstate(__statebuf: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge132(__statebuf?.getPointer(memScope).rawValue))
    }
}

fun random_r(__buf: CValuesRef<random_data>?, __result: CValuesRef<int32_tVar>?): Int {
    memScoped {
        return kniBridge133(__buf?.getPointer(memScope).rawValue, __result?.getPointer(memScope).rawValue)
    }
}

fun srandom_r(__seed: UInt, __buf: CValuesRef<random_data>?): Int {
    memScoped {
        return kniBridge134(__seed, __buf?.getPointer(memScope).rawValue)
    }
}

fun initstate_r(__seed: UInt, __statebuf: CValuesRef<ByteVar>?, __statelen: size_t, __buf: CValuesRef<random_data>?): Int {
    memScoped {
        return kniBridge135(__seed, __statebuf?.getPointer(memScope).rawValue, __statelen, __buf?.getPointer(memScope).rawValue)
    }
}

fun setstate_r(__statebuf: CValuesRef<ByteVar>?, __buf: CValuesRef<random_data>?): Int {
    memScoped {
        return kniBridge136(__statebuf?.getPointer(memScope).rawValue, __buf?.getPointer(memScope).rawValue)
    }
}

fun rand(): Int {
    return kniBridge137()
}

fun srand(__seed: UInt): Unit {
    return kniBridge138(__seed)
}

fun rand_r(__seed: CValuesRef<UIntVar>?): Int {
    memScoped {
        return kniBridge139(__seed?.getPointer(memScope).rawValue)
    }
}

fun drand48(): Double {
    return kniBridge140()
}

fun erand48(__xsubi: CValuesRef<UShortVar>?): Double {
    memScoped {
        return kniBridge141(__xsubi?.getPointer(memScope).rawValue)
    }
}

fun lrand48(): Long {
    return kniBridge142()
}

fun nrand48(__xsubi: CValuesRef<UShortVar>?): Long {
    memScoped {
        return kniBridge143(__xsubi?.getPointer(memScope).rawValue)
    }
}

fun mrand48(): Long {
    return kniBridge144()
}

fun jrand48(__xsubi: CValuesRef<UShortVar>?): Long {
    memScoped {
        return kniBridge145(__xsubi?.getPointer(memScope).rawValue)
    }
}

fun srand48(__seedval: Long): Unit {
    return kniBridge146(__seedval)
}

fun seed48(__seed16v: CValuesRef<UShortVar>?): CPointer<UShortVar>? {
    memScoped {
        return interpretCPointer<UShortVar>(kniBridge147(__seed16v?.getPointer(memScope).rawValue))
    }
}

fun lcong48(__param: CValuesRef<UShortVar>?): Unit {
    memScoped {
        return kniBridge148(__param?.getPointer(memScope).rawValue)
    }
}

fun drand48_r(__buffer: CValuesRef<drand48_data>?, __result: CValuesRef<DoubleVar>?): Int {
    memScoped {
        return kniBridge149(__buffer?.getPointer(memScope).rawValue, __result?.getPointer(memScope).rawValue)
    }
}

fun erand48_r(__xsubi: CValuesRef<UShortVar>?, __buffer: CValuesRef<drand48_data>?, __result: CValuesRef<DoubleVar>?): Int {
    memScoped {
        return kniBridge150(__xsubi?.getPointer(memScope).rawValue, __buffer?.getPointer(memScope).rawValue, __result?.getPointer(memScope).rawValue)
    }
}

fun lrand48_r(__buffer: CValuesRef<drand48_data>?, __result: CValuesRef<LongVar>?): Int {
    memScoped {
        return kniBridge151(__buffer?.getPointer(memScope).rawValue, __result?.getPointer(memScope).rawValue)
    }
}

fun nrand48_r(__xsubi: CValuesRef<UShortVar>?, __buffer: CValuesRef<drand48_data>?, __result: CValuesRef<LongVar>?): Int {
    memScoped {
        return kniBridge152(__xsubi?.getPointer(memScope).rawValue, __buffer?.getPointer(memScope).rawValue, __result?.getPointer(memScope).rawValue)
    }
}

fun mrand48_r(__buffer: CValuesRef<drand48_data>?, __result: CValuesRef<LongVar>?): Int {
    memScoped {
        return kniBridge153(__buffer?.getPointer(memScope).rawValue, __result?.getPointer(memScope).rawValue)
    }
}

fun jrand48_r(__xsubi: CValuesRef<UShortVar>?, __buffer: CValuesRef<drand48_data>?, __result: CValuesRef<LongVar>?): Int {
    memScoped {
        return kniBridge154(__xsubi?.getPointer(memScope).rawValue, __buffer?.getPointer(memScope).rawValue, __result?.getPointer(memScope).rawValue)
    }
}

fun srand48_r(__seedval: Long, __buffer: CValuesRef<drand48_data>?): Int {
    memScoped {
        return kniBridge155(__seedval, __buffer?.getPointer(memScope).rawValue)
    }
}

fun seed48_r(__seed16v: CValuesRef<UShortVar>?, __buffer: CValuesRef<drand48_data>?): Int {
    memScoped {
        return kniBridge156(__seed16v?.getPointer(memScope).rawValue, __buffer?.getPointer(memScope).rawValue)
    }
}

fun lcong48_r(__param: CValuesRef<UShortVar>?, __buffer: CValuesRef<drand48_data>?): Int {
    memScoped {
        return kniBridge157(__param?.getPointer(memScope).rawValue, __buffer?.getPointer(memScope).rawValue)
    }
}

fun malloc(__size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge158(__size))
}

fun calloc(__nmemb: size_t, __size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge159(__nmemb, __size))
}

fun realloc(__ptr: CValuesRef<*>?, __size: size_t): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge160(__ptr?.getPointer(memScope).rawValue, __size))
    }
}

fun free(__ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge161(__ptr?.getPointer(memScope).rawValue)
    }
}

fun alloca(__size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge162(__size))
}

fun valloc(__size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge163(__size))
}

fun posix_memalign(__memptr: CValuesRef<COpaquePointerVar>?, __alignment: size_t, __size: size_t): Int {
    memScoped {
        return kniBridge164(__memptr?.getPointer(memScope).rawValue, __alignment, __size)
    }
}

fun aligned_alloc(__alignment: size_t, __size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge165(__alignment, __size))
}

fun abort(): Unit {
    return kniBridge166()
}

fun atexit(__func: CPointer<CFunction<() -> Unit>>?): Int {
    return kniBridge167(__func.rawValue)
}

fun at_quick_exit(__func: CPointer<CFunction<() -> Unit>>?): Int {
    return kniBridge168(__func.rawValue)
}

fun on_exit(__func: CPointer<CFunction<(Int, COpaquePointer?) -> Unit>>?, __arg: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge169(__func.rawValue, __arg?.getPointer(memScope).rawValue)
    }
}

fun exit(__status: Int): Unit {
    return kniBridge170(__status)
}

fun quick_exit(__status: Int): Unit {
    return kniBridge171(__status)
}

fun _Exit(__status: Int): Unit {
    return kniBridge172(__status)
}

fun getenv(__name: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge173(__name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun putenv(__string: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge174(__string?.getPointer(memScope).rawValue)
    }
}

fun setenv(__name: String?, __value: String?, __replace: Int): Int {
    memScoped {
        return kniBridge175(__name?.cstr?.getPointer(memScope).rawValue, __value?.cstr?.getPointer(memScope).rawValue, __replace)
    }
}

fun unsetenv(__name: String?): Int {
    memScoped {
        return kniBridge176(__name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun clearenv(): Int {
    return kniBridge177()
}

fun mktemp(__template: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge178(__template?.getPointer(memScope).rawValue))
    }
}

fun mkstemp(__template: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge179(__template?.getPointer(memScope).rawValue)
    }
}

fun mkstemps(__template: CValuesRef<ByteVar>?, __suffixlen: Int): Int {
    memScoped {
        return kniBridge180(__template?.getPointer(memScope).rawValue, __suffixlen)
    }
}

fun mkdtemp(__template: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge181(__template?.getPointer(memScope).rawValue))
    }
}

fun system(__command: String?): Int {
    memScoped {
        return kniBridge182(__command?.cstr?.getPointer(memScope).rawValue)
    }
}

fun realpath(__name: String?, __resolved: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge183(__name?.cstr?.getPointer(memScope).rawValue, __resolved?.getPointer(memScope).rawValue))
    }
}

fun bsearch(__key: CValuesRef<*>?, __base: CValuesRef<*>?, __nmemb: size_t, __size: size_t, __compar: __compar_fn_t?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge184(__key?.getPointer(memScope).rawValue, __base?.getPointer(memScope).rawValue, __nmemb, __size, __compar.rawValue))
    }
}

fun qsort(__base: CValuesRef<*>?, __nmemb: size_t, __size: size_t, __compar: __compar_fn_t?): Unit {
    memScoped {
        return kniBridge185(__base?.getPointer(memScope).rawValue, __nmemb, __size, __compar.rawValue)
    }
}

fun abs(__x: Int): Int {
    return kniBridge186(__x)
}

fun labs(__x: Long): Long {
    return kniBridge187(__x)
}

fun llabs(__x: Long): Long {
    return kniBridge188(__x)
}

fun div(__numer: Int, __denom: Int): CValue<div_t> {
    val kniRetVal = nativeHeap.alloc<div_t>()
    try {
        kniBridge189(__numer, __denom, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun ldiv(__numer: Long, __denom: Long): CValue<ldiv_t> {
    val kniRetVal = nativeHeap.alloc<ldiv_t>()
    try {
        kniBridge190(__numer, __denom, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun lldiv(__numer: Long, __denom: Long): CValue<lldiv_t> {
    val kniRetVal = nativeHeap.alloc<lldiv_t>()
    try {
        kniBridge191(__numer, __denom, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun ecvt(__value: Double, __ndigit: Int, __decpt: CValuesRef<IntVar>?, __sign: CValuesRef<IntVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge192(__value, __ndigit, __decpt?.getPointer(memScope).rawValue, __sign?.getPointer(memScope).rawValue))
    }
}

fun fcvt(__value: Double, __ndigit: Int, __decpt: CValuesRef<IntVar>?, __sign: CValuesRef<IntVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge193(__value, __ndigit, __decpt?.getPointer(memScope).rawValue, __sign?.getPointer(memScope).rawValue))
    }
}

fun gcvt(__value: Double, __ndigit: Int, __buf: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge194(__value, __ndigit, __buf?.getPointer(memScope).rawValue))
    }
}

fun ecvt_r(__value: Double, __ndigit: Int, __decpt: CValuesRef<IntVar>?, __sign: CValuesRef<IntVar>?, __buf: CValuesRef<ByteVar>?, __len: size_t): Int {
    memScoped {
        return kniBridge195(__value, __ndigit, __decpt?.getPointer(memScope).rawValue, __sign?.getPointer(memScope).rawValue, __buf?.getPointer(memScope).rawValue, __len)
    }
}

fun fcvt_r(__value: Double, __ndigit: Int, __decpt: CValuesRef<IntVar>?, __sign: CValuesRef<IntVar>?, __buf: CValuesRef<ByteVar>?, __len: size_t): Int {
    memScoped {
        return kniBridge196(__value, __ndigit, __decpt?.getPointer(memScope).rawValue, __sign?.getPointer(memScope).rawValue, __buf?.getPointer(memScope).rawValue, __len)
    }
}

fun mblen(__s: String?, __n: size_t): Int {
    memScoped {
        return kniBridge197(__s?.cstr?.getPointer(memScope).rawValue, __n)
    }
}

fun mbtowc(__pwc: CValuesRef<wchar_tVar>?, __s: String?, __n: size_t): Int {
    memScoped {
        return kniBridge198(__pwc?.getPointer(memScope).rawValue, __s?.cstr?.getPointer(memScope).rawValue, __n)
    }
}

fun wctomb(__s: CValuesRef<ByteVar>?, __wchar: wchar_t): Int {
    memScoped {
        return kniBridge199(__s?.getPointer(memScope).rawValue, __wchar)
    }
}

fun mbstowcs(__pwcs: CValuesRef<wchar_tVar>?, __s: String?, __n: size_t): size_t {
    memScoped {
        return kniBridge200(__pwcs?.getPointer(memScope).rawValue, __s?.cstr?.getPointer(memScope).rawValue, __n)
    }
}

fun wcstombs(__s: CValuesRef<ByteVar>?, __pwcs: CValuesRef<wchar_tVar>?, __n: size_t): size_t {
    memScoped {
        return kniBridge201(__s?.getPointer(memScope).rawValue, __pwcs?.getPointer(memScope).rawValue, __n)
    }
}

fun rpmatch(__response: String?): Int {
    memScoped {
        return kniBridge202(__response?.cstr?.getPointer(memScope).rawValue)
    }
}

fun getsubopt(__optionp: CValuesRef<CPointerVar<ByteVar>>?, __tokens: CValuesRef<CPointerVar<ByteVar>>?, __valuep: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge203(__optionp?.getPointer(memScope).rawValue, __tokens?.getPointer(memScope).rawValue, __valuep?.getPointer(memScope).rawValue)
    }
}

fun getloadavg(__loadavg: CValuesRef<DoubleVar>?, __nelem: Int): Int {
    memScoped {
        return kniBridge204(__loadavg?.getPointer(memScope).rawValue, __nelem)
    }
}

fun clock(): clock_t {
    return kniBridge205()
}

fun time(__timer: CValuesRef<time_tVar>?): time_t {
    memScoped {
        return kniBridge206(__timer?.getPointer(memScope).rawValue)
    }
}

fun difftime(__time1: time_t, __time0: time_t): Double {
    return kniBridge207(__time1, __time0)
}

fun mktime(__tp: CValuesRef<tm>?): time_t {
    memScoped {
        return kniBridge208(__tp?.getPointer(memScope).rawValue)
    }
}

fun strftime(__s: CValuesRef<ByteVar>?, __maxsize: size_t, __format: String?, __tp: CValuesRef<tm>?): size_t {
    memScoped {
        return kniBridge209(__s?.getPointer(memScope).rawValue, __maxsize, __format?.cstr?.getPointer(memScope).rawValue, __tp?.getPointer(memScope).rawValue)
    }
}

fun strftime_l(__s: CValuesRef<ByteVar>?, __maxsize: size_t, __format: String?, __tp: CValuesRef<tm>?, __loc: locale_t?): size_t {
    memScoped {
        return kniBridge210(__s?.getPointer(memScope).rawValue, __maxsize, __format?.cstr?.getPointer(memScope).rawValue, __tp?.getPointer(memScope).rawValue, __loc.rawValue)
    }
}

fun gmtime(__timer: CValuesRef<time_tVar>?): CPointer<tm>? {
    memScoped {
        return interpretCPointer<tm>(kniBridge211(__timer?.getPointer(memScope).rawValue))
    }
}

fun localtime(__timer: CValuesRef<time_tVar>?): CPointer<tm>? {
    memScoped {
        return interpretCPointer<tm>(kniBridge212(__timer?.getPointer(memScope).rawValue))
    }
}

fun gmtime_r(__timer: CValuesRef<time_tVar>?, __tp: CValuesRef<tm>?): CPointer<tm>? {
    memScoped {
        return interpretCPointer<tm>(kniBridge213(__timer?.getPointer(memScope).rawValue, __tp?.getPointer(memScope).rawValue))
    }
}

fun localtime_r(__timer: CValuesRef<time_tVar>?, __tp: CValuesRef<tm>?): CPointer<tm>? {
    memScoped {
        return interpretCPointer<tm>(kniBridge214(__timer?.getPointer(memScope).rawValue, __tp?.getPointer(memScope).rawValue))
    }
}

fun asctime(__tp: CValuesRef<tm>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge215(__tp?.getPointer(memScope).rawValue))
    }
}

fun ctime(__timer: CValuesRef<time_tVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge216(__timer?.getPointer(memScope).rawValue))
    }
}

fun asctime_r(__tp: CValuesRef<tm>?, __buf: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge217(__tp?.getPointer(memScope).rawValue, __buf?.getPointer(memScope).rawValue))
    }
}

fun ctime_r(__timer: CValuesRef<time_tVar>?, __buf: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge218(__timer?.getPointer(memScope).rawValue, __buf?.getPointer(memScope).rawValue))
    }
}

fun tzset(): Unit {
    return kniBridge219()
}

fun stime(__when: CValuesRef<time_tVar>?): Int {
    memScoped {
        return kniBridge220(__when?.getPointer(memScope).rawValue)
    }
}

fun timegm(__tp: CValuesRef<tm>?): time_t {
    memScoped {
        return kniBridge221(__tp?.getPointer(memScope).rawValue)
    }
}

fun timelocal(__tp: CValuesRef<tm>?): time_t {
    memScoped {
        return kniBridge222(__tp?.getPointer(memScope).rawValue)
    }
}

fun dysize(__year: Int): Int {
    return kniBridge223(__year)
}

fun nanosleep(__requested_time: CValuesRef<timespec>?, __remaining: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge224(__requested_time?.getPointer(memScope).rawValue, __remaining?.getPointer(memScope).rawValue)
    }
}

fun clock_getres(__clock_id: clockid_t, __res: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge225(__clock_id, __res?.getPointer(memScope).rawValue)
    }
}

fun clock_gettime(__clock_id: clockid_t, __tp: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge226(__clock_id, __tp?.getPointer(memScope).rawValue)
    }
}

fun clock_settime(__clock_id: clockid_t, __tp: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge227(__clock_id, __tp?.getPointer(memScope).rawValue)
    }
}

fun clock_nanosleep(__clock_id: clockid_t, __flags: Int, __req: CValuesRef<timespec>?, __rem: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge228(__clock_id, __flags, __req?.getPointer(memScope).rawValue, __rem?.getPointer(memScope).rawValue)
    }
}

fun clock_getcpuclockid(__pid: pid_t, __clock_id: CValuesRef<clockid_tVar>?): Int {
    memScoped {
        return kniBridge229(__pid, __clock_id?.getPointer(memScope).rawValue)
    }
}

fun timer_create(__clock_id: clockid_t, __evp: CValuesRef<sigevent>?, __timerid: CValuesRef<timer_tVar>?): Int {
    memScoped {
        return kniBridge230(__clock_id, __evp?.getPointer(memScope).rawValue, __timerid?.getPointer(memScope).rawValue)
    }
}

fun timer_delete(__timerid: timer_t?): Int {
    return kniBridge231(__timerid.rawValue)
}

fun timer_settime(__timerid: timer_t?, __flags: Int, __value: CValuesRef<itimerspec>?, __ovalue: CValuesRef<itimerspec>?): Int {
    memScoped {
        return kniBridge232(__timerid.rawValue, __flags, __value?.getPointer(memScope).rawValue, __ovalue?.getPointer(memScope).rawValue)
    }
}

fun timer_gettime(__timerid: timer_t?, __value: CValuesRef<itimerspec>?): Int {
    memScoped {
        return kniBridge233(__timerid.rawValue, __value?.getPointer(memScope).rawValue)
    }
}

fun timer_getoverrun(__timerid: timer_t?): Int {
    return kniBridge234(__timerid.rawValue)
}

fun timespec_get(__ts: CValuesRef<timespec>?, __base: Int): Int {
    memScoped {
        return kniBridge235(__ts?.getPointer(memScope).rawValue, __base)
    }
}

fun OPENSSL_sk_num(arg0: CValuesRef<OPENSSL_STACK>?): Int {
    memScoped {
        return kniBridge236(arg0?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_sk_value(arg0: CValuesRef<OPENSSL_STACK>?, arg1: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge237(arg0?.getPointer(memScope).rawValue, arg1))
    }
}

fun OPENSSL_sk_set(st: CValuesRef<OPENSSL_STACK>?, i: Int, data: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge238(st?.getPointer(memScope).rawValue, i, data?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_sk_new(cmp: OPENSSL_sk_compfunc?): CPointer<OPENSSL_STACK>? {
    return interpretCPointer<OPENSSL_STACK>(kniBridge239(cmp.rawValue))
}

fun OPENSSL_sk_new_null(): CPointer<OPENSSL_STACK>? {
    return interpretCPointer<OPENSSL_STACK>(kniBridge240())
}

fun OPENSSL_sk_free(arg0: CValuesRef<OPENSSL_STACK>?): Unit {
    memScoped {
        return kniBridge241(arg0?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_sk_pop_free(st: CValuesRef<OPENSSL_STACK>?, func: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge242(st?.getPointer(memScope).rawValue, func.rawValue)
    }
}

fun OPENSSL_sk_deep_copy(arg0: CValuesRef<OPENSSL_STACK>?, c: OPENSSL_sk_copyfunc?, f: OPENSSL_sk_freefunc?): CPointer<OPENSSL_STACK>? {
    memScoped {
        return interpretCPointer<OPENSSL_STACK>(kniBridge243(arg0?.getPointer(memScope).rawValue, c.rawValue, f.rawValue))
    }
}

fun OPENSSL_sk_insert(sk: CValuesRef<OPENSSL_STACK>?, data: CValuesRef<*>?, where: Int): Int {
    memScoped {
        return kniBridge244(sk?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, where)
    }
}

fun OPENSSL_sk_delete(st: CValuesRef<OPENSSL_STACK>?, loc: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge245(st?.getPointer(memScope).rawValue, loc))
    }
}

fun OPENSSL_sk_delete_ptr(st: CValuesRef<OPENSSL_STACK>?, p: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge246(st?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_sk_find(st: CValuesRef<OPENSSL_STACK>?, data: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge247(st?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_sk_find_ex(st: CValuesRef<OPENSSL_STACK>?, data: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge248(st?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_sk_push(st: CValuesRef<OPENSSL_STACK>?, data: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge249(st?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_sk_unshift(st: CValuesRef<OPENSSL_STACK>?, data: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge250(st?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_sk_shift(st: CValuesRef<OPENSSL_STACK>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge251(st?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_sk_pop(st: CValuesRef<OPENSSL_STACK>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge252(st?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_sk_zero(st: CValuesRef<OPENSSL_STACK>?): Unit {
    memScoped {
        return kniBridge253(st?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_sk_set_cmp_func(sk: CValuesRef<OPENSSL_STACK>?, cmp: OPENSSL_sk_compfunc?): OPENSSL_sk_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>(kniBridge254(sk?.getPointer(memScope).rawValue, cmp.rawValue))
    }
}

fun OPENSSL_sk_dup(st: CValuesRef<OPENSSL_STACK>?): CPointer<OPENSSL_STACK>? {
    memScoped {
        return interpretCPointer<OPENSSL_STACK>(kniBridge255(st?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_sk_sort(st: CValuesRef<OPENSSL_STACK>?): Unit {
    memScoped {
        return kniBridge256(st?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_sk_is_sorted(st: CValuesRef<OPENSSL_STACK>?): Int {
    memScoped {
        return kniBridge257(st?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_num(sk: CValuesRef<stack_st_OPENSSL_STRING>?): Int {
    memScoped {
        return kniBridge258(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_value(sk: CValuesRef<stack_st_OPENSSL_STRING>?, idx: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge259(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_OPENSSL_STRING_new(compare: sk_OPENSSL_STRING_compfunc?): CPointer<stack_st_OPENSSL_STRING>? {
    return interpretCPointer<stack_st_OPENSSL_STRING>(kniBridge260(compare.rawValue))
}

fun sk_OPENSSL_STRING_new_null(): CPointer<stack_st_OPENSSL_STRING>? {
    return interpretCPointer<stack_st_OPENSSL_STRING>(kniBridge261())
}

fun sk_OPENSSL_STRING_free(sk: CValuesRef<stack_st_OPENSSL_STRING>?): Unit {
    memScoped {
        return kniBridge262(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_zero(sk: CValuesRef<stack_st_OPENSSL_STRING>?): Unit {
    memScoped {
        return kniBridge263(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_delete(sk: CValuesRef<stack_st_OPENSSL_STRING>?, i: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge264(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_OPENSSL_STRING_delete_ptr(sk: CValuesRef<stack_st_OPENSSL_STRING>?, ptr: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge265(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_STRING_push(sk: CValuesRef<stack_st_OPENSSL_STRING>?, ptr: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge266(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_unshift(sk: CValuesRef<stack_st_OPENSSL_STRING>?, ptr: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge267(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_pop(sk: CValuesRef<stack_st_OPENSSL_STRING>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge268(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_STRING_shift(sk: CValuesRef<stack_st_OPENSSL_STRING>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge269(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_STRING_pop_free(sk: CValuesRef<stack_st_OPENSSL_STRING>?, freefunc: sk_OPENSSL_STRING_freefunc?): Unit {
    memScoped {
        return kniBridge270(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_OPENSSL_STRING_insert(sk: CValuesRef<stack_st_OPENSSL_STRING>?, ptr: CValuesRef<ByteVar>?, idx: Int): Int {
    memScoped {
        return kniBridge271(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_OPENSSL_STRING_set(sk: CValuesRef<stack_st_OPENSSL_STRING>?, idx: Int, ptr: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge272(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_STRING_find(sk: CValuesRef<stack_st_OPENSSL_STRING>?, ptr: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge273(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_find_ex(sk: CValuesRef<stack_st_OPENSSL_STRING>?, ptr: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge274(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_sort(sk: CValuesRef<stack_st_OPENSSL_STRING>?): Unit {
    memScoped {
        return kniBridge275(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_is_sorted(sk: CValuesRef<stack_st_OPENSSL_STRING>?): Int {
    memScoped {
        return kniBridge276(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_STRING_dup(sk: CValuesRef<stack_st_OPENSSL_STRING>?): CPointer<stack_st_OPENSSL_STRING>? {
    memScoped {
        return interpretCPointer<stack_st_OPENSSL_STRING>(kniBridge277(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_STRING_deep_copy(sk: CValuesRef<stack_st_OPENSSL_STRING>?, copyfunc: sk_OPENSSL_STRING_copyfunc?, freefunc: sk_OPENSSL_STRING_freefunc?): CPointer<stack_st_OPENSSL_STRING>? {
    memScoped {
        return interpretCPointer<stack_st_OPENSSL_STRING>(kniBridge278(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_OPENSSL_STRING_set_cmp_func(sk: CValuesRef<stack_st_OPENSSL_STRING>?, compare: sk_OPENSSL_STRING_compfunc?): sk_OPENSSL_STRING_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>(kniBridge279(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun sk_OPENSSL_CSTRING_num(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?): Int {
    memScoped {
        return kniBridge280(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_CSTRING_value(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, idx: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge281(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_OPENSSL_CSTRING_new(compare: sk_OPENSSL_CSTRING_compfunc?): CPointer<stack_st_OPENSSL_CSTRING>? {
    return interpretCPointer<stack_st_OPENSSL_CSTRING>(kniBridge282(compare.rawValue))
}

fun sk_OPENSSL_CSTRING_new_null(): CPointer<stack_st_OPENSSL_CSTRING>? {
    return interpretCPointer<stack_st_OPENSSL_CSTRING>(kniBridge283())
}

fun sk_OPENSSL_CSTRING_free(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?): Unit {
    memScoped {
        return kniBridge284(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_CSTRING_zero(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?): Unit {
    memScoped {
        return kniBridge285(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_CSTRING_delete(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, i: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge286(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_OPENSSL_CSTRING_delete_ptr(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, ptr: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge287(sk?.getPointer(memScope).rawValue, ptr?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_CSTRING_push(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, ptr: String?): Int {
    memScoped {
        return kniBridge288(sk?.getPointer(memScope).rawValue, ptr?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_CSTRING_unshift(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, ptr: String?): Int {
    memScoped {
        return kniBridge289(sk?.getPointer(memScope).rawValue, ptr?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_CSTRING_pop(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge290(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_CSTRING_shift(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge291(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_CSTRING_pop_free(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, freefunc: sk_OPENSSL_CSTRING_freefunc?): Unit {
    memScoped {
        return kniBridge292(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_OPENSSL_CSTRING_insert(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, ptr: String?, idx: Int): Int {
    memScoped {
        return kniBridge293(sk?.getPointer(memScope).rawValue, ptr?.cstr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_OPENSSL_CSTRING_set(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, idx: Int, ptr: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge294(sk?.getPointer(memScope).rawValue, idx, ptr?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_CSTRING_find(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, ptr: String?): Int {
    memScoped {
        return kniBridge295(sk?.getPointer(memScope).rawValue, ptr?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_CSTRING_find_ex(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, ptr: String?): Int {
    memScoped {
        return kniBridge296(sk?.getPointer(memScope).rawValue, ptr?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_CSTRING_sort(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?): Unit {
    memScoped {
        return kniBridge297(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_CSTRING_is_sorted(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?): Int {
    memScoped {
        return kniBridge298(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_CSTRING_dup(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?): CPointer<stack_st_OPENSSL_CSTRING>? {
    memScoped {
        return interpretCPointer<stack_st_OPENSSL_CSTRING>(kniBridge299(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_CSTRING_deep_copy(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, copyfunc: sk_OPENSSL_CSTRING_copyfunc?, freefunc: sk_OPENSSL_CSTRING_freefunc?): CPointer<stack_st_OPENSSL_CSTRING>? {
    memScoped {
        return interpretCPointer<stack_st_OPENSSL_CSTRING>(kniBridge300(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_OPENSSL_CSTRING_set_cmp_func(sk: CValuesRef<stack_st_OPENSSL_CSTRING>?, compare: sk_OPENSSL_CSTRING_compfunc?): sk_OPENSSL_CSTRING_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>(kniBridge301(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun sk_OPENSSL_BLOCK_num(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?): Int {
    memScoped {
        return kniBridge302(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_BLOCK_value(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, idx: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge303(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_OPENSSL_BLOCK_new(compare: sk_OPENSSL_BLOCK_compfunc?): CPointer<stack_st_OPENSSL_BLOCK>? {
    return interpretCPointer<stack_st_OPENSSL_BLOCK>(kniBridge304(compare.rawValue))
}

fun sk_OPENSSL_BLOCK_new_null(): CPointer<stack_st_OPENSSL_BLOCK>? {
    return interpretCPointer<stack_st_OPENSSL_BLOCK>(kniBridge305())
}

fun sk_OPENSSL_BLOCK_free(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?): Unit {
    memScoped {
        return kniBridge306(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_BLOCK_zero(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?): Unit {
    memScoped {
        return kniBridge307(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_BLOCK_delete(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, i: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge308(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_OPENSSL_BLOCK_delete_ptr(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, ptr: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge309(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_BLOCK_push(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge310(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_BLOCK_unshift(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge311(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_BLOCK_pop(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge312(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_BLOCK_shift(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge313(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_BLOCK_pop_free(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, freefunc: sk_OPENSSL_BLOCK_freefunc?): Unit {
    memScoped {
        return kniBridge314(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_OPENSSL_BLOCK_insert(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, ptr: CValuesRef<*>?, idx: Int): Int {
    memScoped {
        return kniBridge315(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_OPENSSL_BLOCK_set(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, idx: Int, ptr: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge316(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_BLOCK_find(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge317(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_BLOCK_find_ex(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge318(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_BLOCK_sort(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?): Unit {
    memScoped {
        return kniBridge319(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_BLOCK_is_sorted(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?): Int {
    memScoped {
        return kniBridge320(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_OPENSSL_BLOCK_dup(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?): CPointer<stack_st_OPENSSL_BLOCK>? {
    memScoped {
        return interpretCPointer<stack_st_OPENSSL_BLOCK>(kniBridge321(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_OPENSSL_BLOCK_deep_copy(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, copyfunc: sk_OPENSSL_BLOCK_copyfunc?, freefunc: sk_OPENSSL_BLOCK_freefunc?): CPointer<stack_st_OPENSSL_BLOCK>? {
    memScoped {
        return interpretCPointer<stack_st_OPENSSL_BLOCK>(kniBridge322(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_OPENSSL_BLOCK_set_cmp_func(sk: CValuesRef<stack_st_OPENSSL_BLOCK>?, compare: sk_OPENSSL_BLOCK_compfunc?): sk_OPENSSL_BLOCK_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<COpaquePointerVar>?, CPointer<COpaquePointerVar>?) -> Int>>(kniBridge323(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun CRYPTO_THREAD_lock_new(): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge324())
}

fun CRYPTO_THREAD_read_lock(lock: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge325(lock?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_THREAD_write_lock(lock: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge326(lock?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_THREAD_unlock(lock: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge327(lock?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_THREAD_lock_free(lock: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge328(lock?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_atomic_add(`val`: CValuesRef<IntVar>?, amount: Int, ret: CValuesRef<IntVar>?, lock: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge329(`val`?.getPointer(memScope).rawValue, amount, ret?.getPointer(memScope).rawValue, lock?.getPointer(memScope).rawValue)
    }
}

fun sk_void_num(sk: CValuesRef<stack_st_void>?): Int {
    memScoped {
        return kniBridge330(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_void_value(sk: CValuesRef<stack_st_void>?, idx: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge331(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_void_new(compare: sk_void_compfunc?): CPointer<stack_st_void>? {
    return interpretCPointer<stack_st_void>(kniBridge332(compare.rawValue))
}

fun sk_void_new_null(): CPointer<stack_st_void>? {
    return interpretCPointer<stack_st_void>(kniBridge333())
}

fun sk_void_free(sk: CValuesRef<stack_st_void>?): Unit {
    memScoped {
        return kniBridge334(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_void_zero(sk: CValuesRef<stack_st_void>?): Unit {
    memScoped {
        return kniBridge335(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_void_delete(sk: CValuesRef<stack_st_void>?, i: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge336(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_void_delete_ptr(sk: CValuesRef<stack_st_void>?, ptr: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge337(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_void_push(sk: CValuesRef<stack_st_void>?, ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge338(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_void_unshift(sk: CValuesRef<stack_st_void>?, ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge339(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_void_pop(sk: CValuesRef<stack_st_void>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge340(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_void_shift(sk: CValuesRef<stack_st_void>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge341(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_void_pop_free(sk: CValuesRef<stack_st_void>?, freefunc: sk_void_freefunc?): Unit {
    memScoped {
        return kniBridge342(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_void_insert(sk: CValuesRef<stack_st_void>?, ptr: CValuesRef<*>?, idx: Int): Int {
    memScoped {
        return kniBridge343(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_void_set(sk: CValuesRef<stack_st_void>?, idx: Int, ptr: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge344(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_void_find(sk: CValuesRef<stack_st_void>?, ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge345(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_void_find_ex(sk: CValuesRef<stack_st_void>?, ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge346(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_void_sort(sk: CValuesRef<stack_st_void>?): Unit {
    memScoped {
        return kniBridge347(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_void_is_sorted(sk: CValuesRef<stack_st_void>?): Int {
    memScoped {
        return kniBridge348(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_void_dup(sk: CValuesRef<stack_st_void>?): CPointer<stack_st_void>? {
    memScoped {
        return interpretCPointer<stack_st_void>(kniBridge349(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_void_deep_copy(sk: CValuesRef<stack_st_void>?, copyfunc: sk_void_copyfunc?, freefunc: sk_void_freefunc?): CPointer<stack_st_void>? {
    memScoped {
        return interpretCPointer<stack_st_void>(kniBridge350(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_void_set_cmp_func(sk: CValuesRef<stack_st_void>?, compare: sk_void_compfunc?): sk_void_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<COpaquePointerVar>?, CPointer<COpaquePointerVar>?) -> Int>>(kniBridge351(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun CRYPTO_mem_ctrl(mode: Int): Int {
    return kniBridge352(mode)
}

fun OPENSSL_strlcpy(dst: CValuesRef<ByteVar>?, src: String?, siz: size_t): size_t {
    memScoped {
        return kniBridge353(dst?.getPointer(memScope).rawValue, src?.cstr?.getPointer(memScope).rawValue, siz)
    }
}

fun OPENSSL_strlcat(dst: CValuesRef<ByteVar>?, src: String?, siz: size_t): size_t {
    memScoped {
        return kniBridge354(dst?.getPointer(memScope).rawValue, src?.cstr?.getPointer(memScope).rawValue, siz)
    }
}

fun OPENSSL_strnlen(str: String?, maxlen: size_t): size_t {
    memScoped {
        return kniBridge355(str?.cstr?.getPointer(memScope).rawValue, maxlen)
    }
}

fun OPENSSL_buf2hexstr(buffer: CValuesRef<UByteVar>?, len: Long): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge356(buffer?.getPointer(memScope).rawValue, len))
    }
}

fun OPENSSL_hexstr2buf(str: String?, len: CValuesRef<LongVar>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge357(str?.cstr?.getPointer(memScope).rawValue, len?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_hexchar2int(c: UByte): Int {
    return kniBridge358(c)
}

fun OpenSSL_version_num(): ULong {
    return kniBridge359()
}

fun OpenSSL_version(type: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge360(type))
}

fun OPENSSL_issetugid(): Int {
    return kniBridge361()
}

fun CRYPTO_get_ex_new_index(class_index: Int, argl: Long, argp: CValuesRef<*>?, new_func: CPointer<CRYPTO_EX_new>?, dup_func: CPointer<CRYPTO_EX_dup>?, free_func: CPointer<CRYPTO_EX_free>?): Int {
    memScoped {
        return kniBridge362(class_index, argl, argp?.getPointer(memScope).rawValue, new_func.rawValue, dup_func.rawValue, free_func.rawValue)
    }
}

fun CRYPTO_free_ex_index(class_index: Int, idx: Int): Int {
    return kniBridge363(class_index, idx)
}

fun CRYPTO_new_ex_data(class_index: Int, obj: CValuesRef<*>?, ad: CValuesRef<CRYPTO_EX_DATA>?): Int {
    memScoped {
        return kniBridge364(class_index, obj?.getPointer(memScope).rawValue, ad?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_dup_ex_data(class_index: Int, to: CValuesRef<CRYPTO_EX_DATA>?, from: CValuesRef<CRYPTO_EX_DATA>?): Int {
    memScoped {
        return kniBridge365(class_index, to?.getPointer(memScope).rawValue, from?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_free_ex_data(class_index: Int, obj: CValuesRef<*>?, ad: CValuesRef<CRYPTO_EX_DATA>?): Unit {
    memScoped {
        return kniBridge366(class_index, obj?.getPointer(memScope).rawValue, ad?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_set_ex_data(ad: CValuesRef<CRYPTO_EX_DATA>?, idx: Int, `val`: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge367(ad?.getPointer(memScope).rawValue, idx, `val`?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_get_ex_data(ad: CValuesRef<CRYPTO_EX_DATA>?, idx: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge368(ad?.getPointer(memScope).rawValue, idx))
    }
}

fun CRYPTO_set_mem_functions(m: CPointer<CFunction<(size_t, CPointer<ByteVar>?, Int) -> COpaquePointer?>>?, r: CPointer<CFunction<(COpaquePointer?, size_t, CPointer<ByteVar>?, Int) -> COpaquePointer?>>?, f: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Unit>>?): Int {
    return kniBridge369(m.rawValue, r.rawValue, f.rawValue)
}

fun CRYPTO_set_mem_debug(flag: Int): Int {
    return kniBridge370(flag)
}

fun CRYPTO_get_mem_functions(m: CValuesRef<CPointerVar<CFunction<(size_t, CPointer<ByteVar>?, Int) -> COpaquePointer?>>>?, r: CValuesRef<CPointerVar<CFunction<(COpaquePointer?, size_t, CPointer<ByteVar>?, Int) -> COpaquePointer?>>>?, f: CValuesRef<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Unit>>>?): Unit {
    memScoped {
        return kniBridge371(m?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, f?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_malloc(num: size_t, file: String?, line: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge372(num, file?.cstr?.getPointer(memScope).rawValue, line))
    }
}

fun CRYPTO_zalloc(num: size_t, file: String?, line: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge373(num, file?.cstr?.getPointer(memScope).rawValue, line))
    }
}

fun CRYPTO_memdup(str: CValuesRef<*>?, siz: size_t, file: String?, line: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge374(str?.getPointer(memScope).rawValue, siz, file?.cstr?.getPointer(memScope).rawValue, line))
    }
}

fun CRYPTO_strdup(str: String?, file: String?, line: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge375(str?.cstr?.getPointer(memScope).rawValue, file?.cstr?.getPointer(memScope).rawValue, line))
    }
}

fun CRYPTO_strndup(str: String?, s: size_t, file: String?, line: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge376(str?.cstr?.getPointer(memScope).rawValue, s, file?.cstr?.getPointer(memScope).rawValue, line))
    }
}

fun CRYPTO_free(ptr: CValuesRef<*>?, file: String?, line: Int): Unit {
    memScoped {
        return kniBridge377(ptr?.getPointer(memScope).rawValue, file?.cstr?.getPointer(memScope).rawValue, line)
    }
}

fun CRYPTO_clear_free(ptr: CValuesRef<*>?, num: size_t, file: String?, line: Int): Unit {
    memScoped {
        return kniBridge378(ptr?.getPointer(memScope).rawValue, num, file?.cstr?.getPointer(memScope).rawValue, line)
    }
}

fun CRYPTO_realloc(addr: CValuesRef<*>?, num: size_t, file: String?, line: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge379(addr?.getPointer(memScope).rawValue, num, file?.cstr?.getPointer(memScope).rawValue, line))
    }
}

fun CRYPTO_clear_realloc(addr: CValuesRef<*>?, old_num: size_t, num: size_t, file: String?, line: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge380(addr?.getPointer(memScope).rawValue, old_num, num, file?.cstr?.getPointer(memScope).rawValue, line))
    }
}

fun CRYPTO_secure_malloc_init(sz: size_t, minsize: Int): Int {
    return kniBridge381(sz, minsize)
}

fun CRYPTO_secure_malloc_done(): Int {
    return kniBridge382()
}

fun CRYPTO_secure_malloc(num: size_t, file: String?, line: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge383(num, file?.cstr?.getPointer(memScope).rawValue, line))
    }
}

fun CRYPTO_secure_zalloc(num: size_t, file: String?, line: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge384(num, file?.cstr?.getPointer(memScope).rawValue, line))
    }
}

fun CRYPTO_secure_free(ptr: CValuesRef<*>?, file: String?, line: Int): Unit {
    memScoped {
        return kniBridge385(ptr?.getPointer(memScope).rawValue, file?.cstr?.getPointer(memScope).rawValue, line)
    }
}

fun CRYPTO_secure_clear_free(ptr: CValuesRef<*>?, num: size_t, file: String?, line: Int): Unit {
    memScoped {
        return kniBridge386(ptr?.getPointer(memScope).rawValue, num, file?.cstr?.getPointer(memScope).rawValue, line)
    }
}

fun CRYPTO_secure_allocated(ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge387(ptr?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_secure_malloc_initialized(): Int {
    return kniBridge388()
}

fun CRYPTO_secure_actual_size(ptr: CValuesRef<*>?): size_t {
    memScoped {
        return kniBridge389(ptr?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_secure_used(): size_t {
    return kniBridge390()
}

fun OPENSSL_cleanse(ptr: CValuesRef<*>?, len: size_t): Unit {
    memScoped {
        return kniBridge391(ptr?.getPointer(memScope).rawValue, len)
    }
}

fun OPENSSL_die(assertion: String?, file: String?, line: Int): Unit {
    memScoped {
        return kniBridge392(assertion?.cstr?.getPointer(memScope).rawValue, file?.cstr?.getPointer(memScope).rawValue, line)
    }
}

fun OPENSSL_isservice(): Int {
    return kniBridge393()
}

fun FIPS_mode(): Int {
    return kniBridge394()
}

fun FIPS_mode_set(r: Int): Int {
    return kniBridge395(r)
}

fun OPENSSL_init(): Unit {
    return kniBridge396()
}

fun OPENSSL_gmtime(timer: CValuesRef<time_tVar>?, result: CValuesRef<tm>?): CPointer<tm>? {
    memScoped {
        return interpretCPointer<tm>(kniBridge397(timer?.getPointer(memScope).rawValue, result?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_gmtime_adj(tm: CValuesRef<tm>?, offset_day: Int, offset_sec: Long): Int {
    memScoped {
        return kniBridge398(tm?.getPointer(memScope).rawValue, offset_day, offset_sec)
    }
}

fun OPENSSL_gmtime_diff(pday: CValuesRef<IntVar>?, psec: CValuesRef<IntVar>?, from: CValuesRef<tm>?, to: CValuesRef<tm>?): Int {
    memScoped {
        return kniBridge399(pday?.getPointer(memScope).rawValue, psec?.getPointer(memScope).rawValue, from?.getPointer(memScope).rawValue, to?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_memcmp(in_a: CValuesRef<*>?, in_b: CValuesRef<*>?, len: size_t): Int {
    memScoped {
        return kniBridge400(in_a?.getPointer(memScope).rawValue, in_b?.getPointer(memScope).rawValue, len)
    }
}

fun OPENSSL_cleanup(): Unit {
    return kniBridge401()
}

fun OPENSSL_init_crypto(opts: uint64_t, settings: CValuesRef<OPENSSL_INIT_SETTINGS>?): Int {
    memScoped {
        return kniBridge402(opts, settings?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_atexit(handler: CPointer<CFunction<() -> Unit>>?): Int {
    return kniBridge403(handler.rawValue)
}

fun OPENSSL_thread_stop(): Unit {
    return kniBridge404()
}

fun OPENSSL_INIT_new(): CPointer<OPENSSL_INIT_SETTINGS>? {
    return interpretCPointer<OPENSSL_INIT_SETTINGS>(kniBridge405())
}

fun OPENSSL_INIT_set_config_appname(settings: CValuesRef<OPENSSL_INIT_SETTINGS>?, config_file: String?): Int {
    memScoped {
        return kniBridge406(settings?.getPointer(memScope).rawValue, config_file?.cstr?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_INIT_free(settings: CValuesRef<OPENSSL_INIT_SETTINGS>?): Unit {
    memScoped {
        return kniBridge407(settings?.getPointer(memScope).rawValue)
    }
}

fun __sched_cpucount(__setsize: size_t, __setp: CValuesRef<cpu_set_t>?): Int {
    memScoped {
        return kniBridge408(__setsize, __setp?.getPointer(memScope).rawValue)
    }
}

fun __sched_cpualloc(__count: size_t): CPointer<cpu_set_t>? {
    return interpretCPointer<cpu_set_t>(kniBridge409(__count))
}

fun __sched_cpufree(__set: CValuesRef<cpu_set_t>?): Unit {
    memScoped {
        return kniBridge410(__set?.getPointer(memScope).rawValue)
    }
}

fun sched_setparam(__pid: __pid_t, __param: CValuesRef<sched_param>?): Int {
    memScoped {
        return kniBridge411(__pid, __param?.getPointer(memScope).rawValue)
    }
}

fun sched_getparam(__pid: __pid_t, __param: CValuesRef<sched_param>?): Int {
    memScoped {
        return kniBridge412(__pid, __param?.getPointer(memScope).rawValue)
    }
}

fun sched_setscheduler(__pid: __pid_t, __policy: Int, __param: CValuesRef<sched_param>?): Int {
    memScoped {
        return kniBridge413(__pid, __policy, __param?.getPointer(memScope).rawValue)
    }
}

fun sched_getscheduler(__pid: __pid_t): Int {
    return kniBridge414(__pid)
}

fun sched_yield(): Int {
    return kniBridge415()
}

fun sched_get_priority_max(__algorithm: Int): Int {
    return kniBridge416(__algorithm)
}

fun sched_get_priority_min(__algorithm: Int): Int {
    return kniBridge417(__algorithm)
}

fun sched_rr_get_interval(__pid: __pid_t, __t: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge418(__pid, __t?.getPointer(memScope).rawValue)
    }
}

fun pthread_create(__newthread: CValuesRef<pthread_tVar>?, __attr: CValuesRef<pthread_attr_t>?, __start_routine: CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>?, __arg: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge419(__newthread?.getPointer(memScope).rawValue, __attr?.getPointer(memScope).rawValue, __start_routine.rawValue, __arg?.getPointer(memScope).rawValue)
    }
}

fun pthread_exit(__retval: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge420(__retval?.getPointer(memScope).rawValue)
    }
}

fun pthread_join(__th: pthread_t, __thread_return: CValuesRef<COpaquePointerVar>?): Int {
    memScoped {
        return kniBridge421(__th, __thread_return?.getPointer(memScope).rawValue)
    }
}

fun pthread_detach(__th: pthread_t): Int {
    return kniBridge422(__th)
}

fun pthread_self(): pthread_t {
    return kniBridge423()
}

fun pthread_equal(__thread1: pthread_t, __thread2: pthread_t): Int {
    return kniBridge424(__thread1, __thread2)
}

fun pthread_attr_init(__attr: CValuesRef<pthread_attr_t>?): Int {
    memScoped {
        return kniBridge425(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_destroy(__attr: CValuesRef<pthread_attr_t>?): Int {
    memScoped {
        return kniBridge426(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_getdetachstate(__attr: CValuesRef<pthread_attr_t>?, __detachstate: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge427(__attr?.getPointer(memScope).rawValue, __detachstate?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_setdetachstate(__attr: CValuesRef<pthread_attr_t>?, __detachstate: Int): Int {
    memScoped {
        return kniBridge428(__attr?.getPointer(memScope).rawValue, __detachstate)
    }
}

fun pthread_attr_getguardsize(__attr: CValuesRef<pthread_attr_t>?, __guardsize: CValuesRef<size_tVar>?): Int {
    memScoped {
        return kniBridge429(__attr?.getPointer(memScope).rawValue, __guardsize?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_setguardsize(__attr: CValuesRef<pthread_attr_t>?, __guardsize: size_t): Int {
    memScoped {
        return kniBridge430(__attr?.getPointer(memScope).rawValue, __guardsize)
    }
}

fun pthread_attr_getschedparam(__attr: CValuesRef<pthread_attr_t>?, __param: CValuesRef<sched_param>?): Int {
    memScoped {
        return kniBridge431(__attr?.getPointer(memScope).rawValue, __param?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_setschedparam(__attr: CValuesRef<pthread_attr_t>?, __param: CValuesRef<sched_param>?): Int {
    memScoped {
        return kniBridge432(__attr?.getPointer(memScope).rawValue, __param?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_getschedpolicy(__attr: CValuesRef<pthread_attr_t>?, __policy: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge433(__attr?.getPointer(memScope).rawValue, __policy?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_setschedpolicy(__attr: CValuesRef<pthread_attr_t>?, __policy: Int): Int {
    memScoped {
        return kniBridge434(__attr?.getPointer(memScope).rawValue, __policy)
    }
}

fun pthread_attr_getinheritsched(__attr: CValuesRef<pthread_attr_t>?, __inherit: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge435(__attr?.getPointer(memScope).rawValue, __inherit?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_setinheritsched(__attr: CValuesRef<pthread_attr_t>?, __inherit: Int): Int {
    memScoped {
        return kniBridge436(__attr?.getPointer(memScope).rawValue, __inherit)
    }
}

fun pthread_attr_getscope(__attr: CValuesRef<pthread_attr_t>?, __scope: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge437(__attr?.getPointer(memScope).rawValue, __scope?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_setscope(__attr: CValuesRef<pthread_attr_t>?, __scope: Int): Int {
    memScoped {
        return kniBridge438(__attr?.getPointer(memScope).rawValue, __scope)
    }
}

fun pthread_attr_getstackaddr(__attr: CValuesRef<pthread_attr_t>?, __stackaddr: CValuesRef<COpaquePointerVar>?): Int {
    memScoped {
        return kniBridge439(__attr?.getPointer(memScope).rawValue, __stackaddr?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_setstackaddr(__attr: CValuesRef<pthread_attr_t>?, __stackaddr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge440(__attr?.getPointer(memScope).rawValue, __stackaddr?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_getstacksize(__attr: CValuesRef<pthread_attr_t>?, __stacksize: CValuesRef<size_tVar>?): Int {
    memScoped {
        return kniBridge441(__attr?.getPointer(memScope).rawValue, __stacksize?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_setstacksize(__attr: CValuesRef<pthread_attr_t>?, __stacksize: size_t): Int {
    memScoped {
        return kniBridge442(__attr?.getPointer(memScope).rawValue, __stacksize)
    }
}

fun pthread_attr_getstack(__attr: CValuesRef<pthread_attr_t>?, __stackaddr: CValuesRef<COpaquePointerVar>?, __stacksize: CValuesRef<size_tVar>?): Int {
    memScoped {
        return kniBridge443(__attr?.getPointer(memScope).rawValue, __stackaddr?.getPointer(memScope).rawValue, __stacksize?.getPointer(memScope).rawValue)
    }
}

fun pthread_attr_setstack(__attr: CValuesRef<pthread_attr_t>?, __stackaddr: CValuesRef<*>?, __stacksize: size_t): Int {
    memScoped {
        return kniBridge444(__attr?.getPointer(memScope).rawValue, __stackaddr?.getPointer(memScope).rawValue, __stacksize)
    }
}

fun pthread_setschedparam(__target_thread: pthread_t, __policy: Int, __param: CValuesRef<sched_param>?): Int {
    memScoped {
        return kniBridge445(__target_thread, __policy, __param?.getPointer(memScope).rawValue)
    }
}

fun pthread_getschedparam(__target_thread: pthread_t, __policy: CValuesRef<IntVar>?, __param: CValuesRef<sched_param>?): Int {
    memScoped {
        return kniBridge446(__target_thread, __policy?.getPointer(memScope).rawValue, __param?.getPointer(memScope).rawValue)
    }
}

fun pthread_setschedprio(__target_thread: pthread_t, __prio: Int): Int {
    return kniBridge447(__target_thread, __prio)
}

fun pthread_once(__once_control: CValuesRef<pthread_once_tVar>?, __init_routine: CPointer<CFunction<() -> Unit>>?): Int {
    memScoped {
        return kniBridge448(__once_control?.getPointer(memScope).rawValue, __init_routine.rawValue)
    }
}

fun pthread_setcancelstate(__state: Int, __oldstate: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge449(__state, __oldstate?.getPointer(memScope).rawValue)
    }
}

fun pthread_setcanceltype(__type: Int, __oldtype: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge450(__type, __oldtype?.getPointer(memScope).rawValue)
    }
}

fun pthread_cancel(__th: pthread_t): Int {
    return kniBridge451(__th)
}

fun pthread_testcancel(): Unit {
    return kniBridge452()
}

fun __pthread_register_cancel(__buf: CValuesRef<__pthread_unwind_buf_t>?): Unit {
    memScoped {
        return kniBridge453(__buf?.getPointer(memScope).rawValue)
    }
}

fun __pthread_unregister_cancel(__buf: CValuesRef<__pthread_unwind_buf_t>?): Unit {
    memScoped {
        return kniBridge454(__buf?.getPointer(memScope).rawValue)
    }
}

fun __pthread_unwind_next(__buf: CValuesRef<__pthread_unwind_buf_t>?): Unit {
    memScoped {
        return kniBridge455(__buf?.getPointer(memScope).rawValue)
    }
}

fun __sigsetjmp(__env: CValuesRef<__jmp_buf_tag>?, __savemask: Int): Int {
    memScoped {
        return kniBridge456(__env?.getPointer(memScope).rawValue, __savemask)
    }
}

fun pthread_mutex_init(__mutex: CValuesRef<pthread_mutex_t>?, __mutexattr: CValuesRef<pthread_mutexattr_t>?): Int {
    memScoped {
        return kniBridge457(__mutex?.getPointer(memScope).rawValue, __mutexattr?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutex_destroy(__mutex: CValuesRef<pthread_mutex_t>?): Int {
    memScoped {
        return kniBridge458(__mutex?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutex_trylock(__mutex: CValuesRef<pthread_mutex_t>?): Int {
    memScoped {
        return kniBridge459(__mutex?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutex_lock(__mutex: CValuesRef<pthread_mutex_t>?): Int {
    memScoped {
        return kniBridge460(__mutex?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutex_timedlock(__mutex: CValuesRef<pthread_mutex_t>?, __abstime: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge461(__mutex?.getPointer(memScope).rawValue, __abstime?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutex_unlock(__mutex: CValuesRef<pthread_mutex_t>?): Int {
    memScoped {
        return kniBridge462(__mutex?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutex_getprioceiling(__mutex: CValuesRef<pthread_mutex_t>?, __prioceiling: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge463(__mutex?.getPointer(memScope).rawValue, __prioceiling?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutex_setprioceiling(__mutex: CValuesRef<pthread_mutex_t>?, __prioceiling: Int, __old_ceiling: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge464(__mutex?.getPointer(memScope).rawValue, __prioceiling, __old_ceiling?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutex_consistent(__mutex: CValuesRef<pthread_mutex_t>?): Int {
    memScoped {
        return kniBridge465(__mutex?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutexattr_init(__attr: CValuesRef<pthread_mutexattr_t>?): Int {
    memScoped {
        return kniBridge466(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutexattr_destroy(__attr: CValuesRef<pthread_mutexattr_t>?): Int {
    memScoped {
        return kniBridge467(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutexattr_getpshared(__attr: CValuesRef<pthread_mutexattr_t>?, __pshared: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge468(__attr?.getPointer(memScope).rawValue, __pshared?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutexattr_setpshared(__attr: CValuesRef<pthread_mutexattr_t>?, __pshared: Int): Int {
    memScoped {
        return kniBridge469(__attr?.getPointer(memScope).rawValue, __pshared)
    }
}

fun pthread_mutexattr_gettype(__attr: CValuesRef<pthread_mutexattr_t>?, __kind: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge470(__attr?.getPointer(memScope).rawValue, __kind?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutexattr_settype(__attr: CValuesRef<pthread_mutexattr_t>?, __kind: Int): Int {
    memScoped {
        return kniBridge471(__attr?.getPointer(memScope).rawValue, __kind)
    }
}

fun pthread_mutexattr_getprotocol(__attr: CValuesRef<pthread_mutexattr_t>?, __protocol: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge472(__attr?.getPointer(memScope).rawValue, __protocol?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutexattr_setprotocol(__attr: CValuesRef<pthread_mutexattr_t>?, __protocol: Int): Int {
    memScoped {
        return kniBridge473(__attr?.getPointer(memScope).rawValue, __protocol)
    }
}

fun pthread_mutexattr_getprioceiling(__attr: CValuesRef<pthread_mutexattr_t>?, __prioceiling: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge474(__attr?.getPointer(memScope).rawValue, __prioceiling?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutexattr_setprioceiling(__attr: CValuesRef<pthread_mutexattr_t>?, __prioceiling: Int): Int {
    memScoped {
        return kniBridge475(__attr?.getPointer(memScope).rawValue, __prioceiling)
    }
}

fun pthread_mutexattr_getrobust(__attr: CValuesRef<pthread_mutexattr_t>?, __robustness: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge476(__attr?.getPointer(memScope).rawValue, __robustness?.getPointer(memScope).rawValue)
    }
}

fun pthread_mutexattr_setrobust(__attr: CValuesRef<pthread_mutexattr_t>?, __robustness: Int): Int {
    memScoped {
        return kniBridge477(__attr?.getPointer(memScope).rawValue, __robustness)
    }
}

fun pthread_rwlock_init(__rwlock: CValuesRef<pthread_rwlock_t>?, __attr: CValuesRef<pthread_rwlockattr_t>?): Int {
    memScoped {
        return kniBridge478(__rwlock?.getPointer(memScope).rawValue, __attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlock_destroy(__rwlock: CValuesRef<pthread_rwlock_t>?): Int {
    memScoped {
        return kniBridge479(__rwlock?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlock_rdlock(__rwlock: CValuesRef<pthread_rwlock_t>?): Int {
    memScoped {
        return kniBridge480(__rwlock?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlock_tryrdlock(__rwlock: CValuesRef<pthread_rwlock_t>?): Int {
    memScoped {
        return kniBridge481(__rwlock?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlock_timedrdlock(__rwlock: CValuesRef<pthread_rwlock_t>?, __abstime: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge482(__rwlock?.getPointer(memScope).rawValue, __abstime?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlock_wrlock(__rwlock: CValuesRef<pthread_rwlock_t>?): Int {
    memScoped {
        return kniBridge483(__rwlock?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlock_trywrlock(__rwlock: CValuesRef<pthread_rwlock_t>?): Int {
    memScoped {
        return kniBridge484(__rwlock?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlock_timedwrlock(__rwlock: CValuesRef<pthread_rwlock_t>?, __abstime: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge485(__rwlock?.getPointer(memScope).rawValue, __abstime?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlock_unlock(__rwlock: CValuesRef<pthread_rwlock_t>?): Int {
    memScoped {
        return kniBridge486(__rwlock?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlockattr_init(__attr: CValuesRef<pthread_rwlockattr_t>?): Int {
    memScoped {
        return kniBridge487(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlockattr_destroy(__attr: CValuesRef<pthread_rwlockattr_t>?): Int {
    memScoped {
        return kniBridge488(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlockattr_getpshared(__attr: CValuesRef<pthread_rwlockattr_t>?, __pshared: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge489(__attr?.getPointer(memScope).rawValue, __pshared?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlockattr_setpshared(__attr: CValuesRef<pthread_rwlockattr_t>?, __pshared: Int): Int {
    memScoped {
        return kniBridge490(__attr?.getPointer(memScope).rawValue, __pshared)
    }
}

fun pthread_rwlockattr_getkind_np(__attr: CValuesRef<pthread_rwlockattr_t>?, __pref: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge491(__attr?.getPointer(memScope).rawValue, __pref?.getPointer(memScope).rawValue)
    }
}

fun pthread_rwlockattr_setkind_np(__attr: CValuesRef<pthread_rwlockattr_t>?, __pref: Int): Int {
    memScoped {
        return kniBridge492(__attr?.getPointer(memScope).rawValue, __pref)
    }
}

fun pthread_cond_init(__cond: CValuesRef<pthread_cond_t>?, __cond_attr: CValuesRef<pthread_condattr_t>?): Int {
    memScoped {
        return kniBridge493(__cond?.getPointer(memScope).rawValue, __cond_attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_cond_destroy(__cond: CValuesRef<pthread_cond_t>?): Int {
    memScoped {
        return kniBridge494(__cond?.getPointer(memScope).rawValue)
    }
}

fun pthread_cond_signal(__cond: CValuesRef<pthread_cond_t>?): Int {
    memScoped {
        return kniBridge495(__cond?.getPointer(memScope).rawValue)
    }
}

fun pthread_cond_broadcast(__cond: CValuesRef<pthread_cond_t>?): Int {
    memScoped {
        return kniBridge496(__cond?.getPointer(memScope).rawValue)
    }
}

fun pthread_cond_wait(__cond: CValuesRef<pthread_cond_t>?, __mutex: CValuesRef<pthread_mutex_t>?): Int {
    memScoped {
        return kniBridge497(__cond?.getPointer(memScope).rawValue, __mutex?.getPointer(memScope).rawValue)
    }
}

fun pthread_cond_timedwait(__cond: CValuesRef<pthread_cond_t>?, __mutex: CValuesRef<pthread_mutex_t>?, __abstime: CValuesRef<timespec>?): Int {
    memScoped {
        return kniBridge498(__cond?.getPointer(memScope).rawValue, __mutex?.getPointer(memScope).rawValue, __abstime?.getPointer(memScope).rawValue)
    }
}

fun pthread_condattr_init(__attr: CValuesRef<pthread_condattr_t>?): Int {
    memScoped {
        return kniBridge499(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_condattr_destroy(__attr: CValuesRef<pthread_condattr_t>?): Int {
    memScoped {
        return kniBridge500(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_condattr_getpshared(__attr: CValuesRef<pthread_condattr_t>?, __pshared: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge501(__attr?.getPointer(memScope).rawValue, __pshared?.getPointer(memScope).rawValue)
    }
}

fun pthread_condattr_setpshared(__attr: CValuesRef<pthread_condattr_t>?, __pshared: Int): Int {
    memScoped {
        return kniBridge502(__attr?.getPointer(memScope).rawValue, __pshared)
    }
}

fun pthread_condattr_getclock(__attr: CValuesRef<pthread_condattr_t>?, __clock_id: CValuesRef<__clockid_tVar>?): Int {
    memScoped {
        return kniBridge503(__attr?.getPointer(memScope).rawValue, __clock_id?.getPointer(memScope).rawValue)
    }
}

fun pthread_condattr_setclock(__attr: CValuesRef<pthread_condattr_t>?, __clock_id: __clockid_t): Int {
    memScoped {
        return kniBridge504(__attr?.getPointer(memScope).rawValue, __clock_id)
    }
}

fun pthread_spin_init(__lock: CValuesRef<pthread_spinlock_tVar>?, __pshared: Int): Int {
    memScoped {
        return kniBridge505(__lock?.getPointer(memScope).rawValue, __pshared)
    }
}

fun pthread_spin_destroy(__lock: CValuesRef<pthread_spinlock_tVar>?): Int {
    memScoped {
        return kniBridge506(__lock?.getPointer(memScope).rawValue)
    }
}

fun pthread_spin_lock(__lock: CValuesRef<pthread_spinlock_tVar>?): Int {
    memScoped {
        return kniBridge507(__lock?.getPointer(memScope).rawValue)
    }
}

fun pthread_spin_trylock(__lock: CValuesRef<pthread_spinlock_tVar>?): Int {
    memScoped {
        return kniBridge508(__lock?.getPointer(memScope).rawValue)
    }
}

fun pthread_spin_unlock(__lock: CValuesRef<pthread_spinlock_tVar>?): Int {
    memScoped {
        return kniBridge509(__lock?.getPointer(memScope).rawValue)
    }
}

fun pthread_barrier_init(__barrier: CValuesRef<pthread_barrier_t>?, __attr: CValuesRef<pthread_barrierattr_t>?, __count: UInt): Int {
    memScoped {
        return kniBridge510(__barrier?.getPointer(memScope).rawValue, __attr?.getPointer(memScope).rawValue, __count)
    }
}

fun pthread_barrier_destroy(__barrier: CValuesRef<pthread_barrier_t>?): Int {
    memScoped {
        return kniBridge511(__barrier?.getPointer(memScope).rawValue)
    }
}

fun pthread_barrier_wait(__barrier: CValuesRef<pthread_barrier_t>?): Int {
    memScoped {
        return kniBridge512(__barrier?.getPointer(memScope).rawValue)
    }
}

fun pthread_barrierattr_init(__attr: CValuesRef<pthread_barrierattr_t>?): Int {
    memScoped {
        return kniBridge513(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_barrierattr_destroy(__attr: CValuesRef<pthread_barrierattr_t>?): Int {
    memScoped {
        return kniBridge514(__attr?.getPointer(memScope).rawValue)
    }
}

fun pthread_barrierattr_getpshared(__attr: CValuesRef<pthread_barrierattr_t>?, __pshared: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge515(__attr?.getPointer(memScope).rawValue, __pshared?.getPointer(memScope).rawValue)
    }
}

fun pthread_barrierattr_setpshared(__attr: CValuesRef<pthread_barrierattr_t>?, __pshared: Int): Int {
    memScoped {
        return kniBridge516(__attr?.getPointer(memScope).rawValue, __pshared)
    }
}

fun pthread_key_create(__key: CValuesRef<pthread_key_tVar>?, __destr_function: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge517(__key?.getPointer(memScope).rawValue, __destr_function.rawValue)
    }
}

fun pthread_key_delete(__key: pthread_key_t): Int {
    return kniBridge518(__key)
}

fun pthread_getspecific(__key: pthread_key_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge519(__key))
}

fun pthread_setspecific(__key: pthread_key_t, __pointer: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge520(__key, __pointer?.getPointer(memScope).rawValue)
    }
}

fun pthread_getcpuclockid(__thread_id: pthread_t, __clock_id: CValuesRef<__clockid_tVar>?): Int {
    memScoped {
        return kniBridge521(__thread_id, __clock_id?.getPointer(memScope).rawValue)
    }
}

fun pthread_atfork(__prepare: CPointer<CFunction<() -> Unit>>?, __parent: CPointer<CFunction<() -> Unit>>?, __child: CPointer<CFunction<() -> Unit>>?): Int {
    return kniBridge522(__prepare.rawValue, __parent.rawValue, __child.rawValue)
}

fun CRYPTO_THREAD_run_once(once: CValuesRef<CRYPTO_ONCEVar>?, init: CPointer<CFunction<() -> Unit>>?): Int {
    memScoped {
        return kniBridge523(once?.getPointer(memScope).rawValue, init.rawValue)
    }
}

fun CRYPTO_THREAD_init_local(key: CValuesRef<CRYPTO_THREAD_LOCALVar>?, cleanup: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    memScoped {
        return kniBridge524(key?.getPointer(memScope).rawValue, cleanup.rawValue)
    }
}

fun CRYPTO_THREAD_get_local(key: CValuesRef<CRYPTO_THREAD_LOCALVar>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge525(key?.getPointer(memScope).rawValue))
    }
}

fun CRYPTO_THREAD_set_local(key: CValuesRef<CRYPTO_THREAD_LOCALVar>?, `val`: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge526(key?.getPointer(memScope).rawValue, `val`?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_THREAD_cleanup_local(key: CValuesRef<CRYPTO_THREAD_LOCALVar>?): Int {
    memScoped {
        return kniBridge527(key?.getPointer(memScope).rawValue)
    }
}

fun CRYPTO_THREAD_get_current_id(): CRYPTO_THREAD_ID {
    return kniBridge528()
}

fun CRYPTO_THREAD_compare_id(a: CRYPTO_THREAD_ID, b: CRYPTO_THREAD_ID): Int {
    return kniBridge529(a, b)
}

fun ERR_load_CRYPTO_strings(): Int {
    return kniBridge530()
}

fun BIO_get_new_index(): Int {
    return kniBridge531()
}

fun BIO_set_flags(b: CValuesRef<BIO>?, flags: Int): Unit {
    memScoped {
        return kniBridge532(b?.getPointer(memScope).rawValue, flags)
    }
}

fun BIO_test_flags(b: CValuesRef<BIO>?, flags: Int): Int {
    memScoped {
        return kniBridge533(b?.getPointer(memScope).rawValue, flags)
    }
}

fun BIO_clear_flags(b: CValuesRef<BIO>?, flags: Int): Unit {
    memScoped {
        return kniBridge534(b?.getPointer(memScope).rawValue, flags)
    }
}

fun BIO_get_callback(b: CValuesRef<BIO>?): BIO_callback_fn? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIO>?, Int, CPointer<ByteVar>?, Int, Long, Long) -> Long>>(kniBridge535(b?.getPointer(memScope).rawValue))
    }
}

fun BIO_set_callback(b: CValuesRef<BIO>?, callback: BIO_callback_fn?): Unit {
    memScoped {
        return kniBridge536(b?.getPointer(memScope).rawValue, callback.rawValue)
    }
}

fun BIO_get_callback_arg(b: CValuesRef<BIO>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge537(b?.getPointer(memScope).rawValue))
    }
}

fun BIO_set_callback_arg(b: CValuesRef<BIO>?, arg: CValuesRef<ByteVar>?): Unit {
    memScoped {
        return kniBridge538(b?.getPointer(memScope).rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun BIO_method_name(b: CValuesRef<BIO>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge539(b?.getPointer(memScope).rawValue))
    }
}

fun BIO_method_type(b: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge540(b?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_num(sk: CValuesRef<stack_st_BIO>?): Int {
    memScoped {
        return kniBridge541(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_value(sk: CValuesRef<stack_st_BIO>?, idx: Int): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge542(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_BIO_new(compare: sk_BIO_compfunc?): CPointer<stack_st_BIO>? {
    return interpretCPointer<stack_st_BIO>(kniBridge543(compare.rawValue))
}

fun sk_BIO_new_null(): CPointer<stack_st_BIO>? {
    return interpretCPointer<stack_st_BIO>(kniBridge544())
}

fun sk_BIO_free(sk: CValuesRef<stack_st_BIO>?): Unit {
    memScoped {
        return kniBridge545(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_zero(sk: CValuesRef<stack_st_BIO>?): Unit {
    memScoped {
        return kniBridge546(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_delete(sk: CValuesRef<stack_st_BIO>?, i: Int): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge547(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_BIO_delete_ptr(sk: CValuesRef<stack_st_BIO>?, ptr: CValuesRef<BIO>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge548(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_BIO_push(sk: CValuesRef<stack_st_BIO>?, ptr: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge549(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_unshift(sk: CValuesRef<stack_st_BIO>?, ptr: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge550(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_pop(sk: CValuesRef<stack_st_BIO>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge551(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_BIO_shift(sk: CValuesRef<stack_st_BIO>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge552(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_BIO_pop_free(sk: CValuesRef<stack_st_BIO>?, freefunc: sk_BIO_freefunc?): Unit {
    memScoped {
        return kniBridge553(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_BIO_insert(sk: CValuesRef<stack_st_BIO>?, ptr: CValuesRef<BIO>?, idx: Int): Int {
    memScoped {
        return kniBridge554(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_BIO_set(sk: CValuesRef<stack_st_BIO>?, idx: Int, ptr: CValuesRef<BIO>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge555(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_BIO_find(sk: CValuesRef<stack_st_BIO>?, ptr: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge556(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_find_ex(sk: CValuesRef<stack_st_BIO>?, ptr: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge557(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_sort(sk: CValuesRef<stack_st_BIO>?): Unit {
    memScoped {
        return kniBridge558(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_is_sorted(sk: CValuesRef<stack_st_BIO>?): Int {
    memScoped {
        return kniBridge559(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_BIO_dup(sk: CValuesRef<stack_st_BIO>?): CPointer<stack_st_BIO>? {
    memScoped {
        return interpretCPointer<stack_st_BIO>(kniBridge560(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_BIO_deep_copy(sk: CValuesRef<stack_st_BIO>?, copyfunc: sk_BIO_copyfunc?, freefunc: sk_BIO_freefunc?): CPointer<stack_st_BIO>? {
    memScoped {
        return interpretCPointer<stack_st_BIO>(kniBridge561(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_BIO_set_cmp_func(sk: CValuesRef<stack_st_BIO>?, compare: sk_BIO_compfunc?): sk_BIO_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<BIO>>?, CPointer<CPointerVar<BIO>>?) -> Int>>(kniBridge562(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun BIO_ctrl_pending(b: CValuesRef<BIO>?): size_t {
    memScoped {
        return kniBridge563(b?.getPointer(memScope).rawValue)
    }
}

fun BIO_ctrl_wpending(b: CValuesRef<BIO>?): size_t {
    memScoped {
        return kniBridge564(b?.getPointer(memScope).rawValue)
    }
}

fun BIO_ctrl_get_write_guarantee(b: CValuesRef<BIO>?): size_t {
    memScoped {
        return kniBridge565(b?.getPointer(memScope).rawValue)
    }
}

fun BIO_ctrl_get_read_request(b: CValuesRef<BIO>?): size_t {
    memScoped {
        return kniBridge566(b?.getPointer(memScope).rawValue)
    }
}

fun BIO_ctrl_reset_read_request(b: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge567(b?.getPointer(memScope).rawValue)
    }
}

fun BIO_set_ex_data(bio: CValuesRef<BIO>?, idx: Int, data: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge568(bio?.getPointer(memScope).rawValue, idx, data?.getPointer(memScope).rawValue)
    }
}

fun BIO_get_ex_data(bio: CValuesRef<BIO>?, idx: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge569(bio?.getPointer(memScope).rawValue, idx))
    }
}

fun BIO_number_read(bio: CValuesRef<BIO>?): uint64_t {
    memScoped {
        return kniBridge570(bio?.getPointer(memScope).rawValue)
    }
}

fun BIO_number_written(bio: CValuesRef<BIO>?): uint64_t {
    memScoped {
        return kniBridge571(bio?.getPointer(memScope).rawValue)
    }
}

fun BIO_asn1_set_prefix(b: CValuesRef<BIO>?, prefix: CPointer<asn1_ps_func>?, prefix_free: CPointer<asn1_ps_func>?): Int {
    memScoped {
        return kniBridge572(b?.getPointer(memScope).rawValue, prefix.rawValue, prefix_free.rawValue)
    }
}

fun BIO_asn1_get_prefix(b: CValuesRef<BIO>?, pprefix: CValuesRef<CPointerVar<asn1_ps_func>>?, pprefix_free: CValuesRef<CPointerVar<asn1_ps_func>>?): Int {
    memScoped {
        return kniBridge573(b?.getPointer(memScope).rawValue, pprefix?.getPointer(memScope).rawValue, pprefix_free?.getPointer(memScope).rawValue)
    }
}

fun BIO_asn1_set_suffix(b: CValuesRef<BIO>?, suffix: CPointer<asn1_ps_func>?, suffix_free: CPointer<asn1_ps_func>?): Int {
    memScoped {
        return kniBridge574(b?.getPointer(memScope).rawValue, suffix.rawValue, suffix_free.rawValue)
    }
}

fun BIO_asn1_get_suffix(b: CValuesRef<BIO>?, psuffix: CValuesRef<CPointerVar<asn1_ps_func>>?, psuffix_free: CValuesRef<CPointerVar<asn1_ps_func>>?): Int {
    memScoped {
        return kniBridge575(b?.getPointer(memScope).rawValue, psuffix?.getPointer(memScope).rawValue, psuffix_free?.getPointer(memScope).rawValue)
    }
}

fun BIO_s_file(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge576())
}

fun BIO_new_file(filename: String?, mode: String?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge577(filename?.cstr?.getPointer(memScope).rawValue, mode?.cstr?.getPointer(memScope).rawValue))
    }
}

fun BIO_new_fp(stream: CValuesRef<FILE>?, close_flag: Int): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge578(stream?.getPointer(memScope).rawValue, close_flag))
    }
}

fun BIO_new(type: CValuesRef<BIO_METHOD>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge579(type?.getPointer(memScope).rawValue))
    }
}

fun BIO_free(a: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge580(a?.getPointer(memScope).rawValue)
    }
}

fun BIO_set_data(a: CValuesRef<BIO>?, ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge581(a?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun BIO_get_data(a: CValuesRef<BIO>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge582(a?.getPointer(memScope).rawValue))
    }
}

fun BIO_set_init(a: CValuesRef<BIO>?, init: Int): Unit {
    memScoped {
        return kniBridge583(a?.getPointer(memScope).rawValue, init)
    }
}

fun BIO_get_init(a: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge584(a?.getPointer(memScope).rawValue)
    }
}

fun BIO_set_shutdown(a: CValuesRef<BIO>?, shut: Int): Unit {
    memScoped {
        return kniBridge585(a?.getPointer(memScope).rawValue, shut)
    }
}

fun BIO_get_shutdown(a: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge586(a?.getPointer(memScope).rawValue)
    }
}

fun BIO_vfree(a: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge587(a?.getPointer(memScope).rawValue)
    }
}

fun BIO_up_ref(a: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge588(a?.getPointer(memScope).rawValue)
    }
}

fun BIO_read(b: CValuesRef<BIO>?, data: CValuesRef<*>?, len: Int): Int {
    memScoped {
        return kniBridge589(b?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun BIO_gets(bp: CValuesRef<BIO>?, buf: CValuesRef<ByteVar>?, size: Int): Int {
    memScoped {
        return kniBridge590(bp?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, size)
    }
}

fun BIO_write(b: CValuesRef<BIO>?, data: CValuesRef<*>?, len: Int): Int {
    memScoped {
        return kniBridge591(b?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun BIO_puts(bp: CValuesRef<BIO>?, buf: String?): Int {
    memScoped {
        return kniBridge592(bp?.getPointer(memScope).rawValue, buf?.cstr?.getPointer(memScope).rawValue)
    }
}

fun BIO_indent(b: CValuesRef<BIO>?, indent: Int, max: Int): Int {
    memScoped {
        return kniBridge593(b?.getPointer(memScope).rawValue, indent, max)
    }
}

fun BIO_ctrl(bp: CValuesRef<BIO>?, cmd: Int, larg: Long, parg: CValuesRef<*>?): Long {
    memScoped {
        return kniBridge594(bp?.getPointer(memScope).rawValue, cmd, larg, parg?.getPointer(memScope).rawValue)
    }
}

fun BIO_callback_ctrl(b: CValuesRef<BIO>?, cmd: Int, fp: CPointer<CFunction<(CPointer<BIO>?, Int, CPointer<ByteVar>?, Int, Long, Long) -> Unit>>?): Long {
    memScoped {
        return kniBridge595(b?.getPointer(memScope).rawValue, cmd, fp.rawValue)
    }
}

fun BIO_ptr_ctrl(bp: CValuesRef<BIO>?, cmd: Int, larg: Long): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge596(bp?.getPointer(memScope).rawValue, cmd, larg))
    }
}

fun BIO_int_ctrl(bp: CValuesRef<BIO>?, cmd: Int, larg: Long, iarg: Int): Long {
    memScoped {
        return kniBridge597(bp?.getPointer(memScope).rawValue, cmd, larg, iarg)
    }
}

fun BIO_push(b: CValuesRef<BIO>?, append: CValuesRef<BIO>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge598(b?.getPointer(memScope).rawValue, append?.getPointer(memScope).rawValue))
    }
}

fun BIO_pop(b: CValuesRef<BIO>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge599(b?.getPointer(memScope).rawValue))
    }
}

fun BIO_free_all(a: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge600(a?.getPointer(memScope).rawValue)
    }
}

fun BIO_find_type(b: CValuesRef<BIO>?, bio_type: Int): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge601(b?.getPointer(memScope).rawValue, bio_type))
    }
}

fun BIO_next(b: CValuesRef<BIO>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge602(b?.getPointer(memScope).rawValue))
    }
}

fun BIO_set_next(b: CValuesRef<BIO>?, next: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge603(b?.getPointer(memScope).rawValue, next?.getPointer(memScope).rawValue)
    }
}

fun BIO_get_retry_BIO(bio: CValuesRef<BIO>?, reason: CValuesRef<IntVar>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge604(bio?.getPointer(memScope).rawValue, reason?.getPointer(memScope).rawValue))
    }
}

fun BIO_get_retry_reason(bio: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge605(bio?.getPointer(memScope).rawValue)
    }
}

fun BIO_set_retry_reason(bio: CValuesRef<BIO>?, reason: Int): Unit {
    memScoped {
        return kniBridge606(bio?.getPointer(memScope).rawValue, reason)
    }
}

fun BIO_dup_chain(`in`: CValuesRef<BIO>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge607(`in`?.getPointer(memScope).rawValue))
    }
}

fun BIO_nread0(bio: CValuesRef<BIO>?, buf: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge608(bio?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue)
    }
}

fun BIO_nread(bio: CValuesRef<BIO>?, buf: CValuesRef<CPointerVar<ByteVar>>?, num: Int): Int {
    memScoped {
        return kniBridge609(bio?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, num)
    }
}

fun BIO_nwrite0(bio: CValuesRef<BIO>?, buf: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge610(bio?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue)
    }
}

fun BIO_nwrite(bio: CValuesRef<BIO>?, buf: CValuesRef<CPointerVar<ByteVar>>?, num: Int): Int {
    memScoped {
        return kniBridge611(bio?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, num)
    }
}

fun BIO_debug_callback(bio: CValuesRef<BIO>?, cmd: Int, argp: String?, argi: Int, argl: Long, ret: Long): Long {
    memScoped {
        return kniBridge612(bio?.getPointer(memScope).rawValue, cmd, argp?.cstr?.getPointer(memScope).rawValue, argi, argl, ret)
    }
}

fun BIO_s_mem(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge613())
}

fun BIO_s_secmem(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge614())
}

fun BIO_new_mem_buf(buf: CValuesRef<*>?, len: Int): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge615(buf?.getPointer(memScope).rawValue, len))
    }
}

fun BIO_s_socket(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge616())
}

fun BIO_s_connect(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge617())
}

fun BIO_s_accept(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge618())
}

fun BIO_s_fd(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge619())
}

fun BIO_s_log(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge620())
}

fun BIO_s_bio(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge621())
}

fun BIO_s_null(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge622())
}

fun BIO_f_null(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge623())
}

fun BIO_f_buffer(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge624())
}

fun BIO_f_linebuffer(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge625())
}

fun BIO_f_nbio_test(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge626())
}

fun BIO_s_datagram(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge627())
}

fun BIO_dgram_non_fatal_error(error: Int): Int {
    return kniBridge628(error)
}

fun BIO_new_dgram(fd: Int, close_flag: Int): CPointer<BIO>? {
    return interpretCPointer<BIO>(kniBridge629(fd, close_flag))
}

fun BIO_sock_should_retry(i: Int): Int {
    return kniBridge630(i)
}

fun BIO_sock_non_fatal_error(error: Int): Int {
    return kniBridge631(error)
}

fun BIO_fd_should_retry(i: Int): Int {
    return kniBridge632(i)
}

fun BIO_fd_non_fatal_error(error: Int): Int {
    return kniBridge633(error)
}

fun BIO_dump_cb(cb: CPointer<CFunction<(COpaquePointer?, size_t, COpaquePointer?) -> Int>>?, u: CValuesRef<*>?, s: String?, len: Int): Int {
    memScoped {
        return kniBridge634(cb.rawValue, u?.getPointer(memScope).rawValue, s?.cstr?.getPointer(memScope).rawValue, len)
    }
}

fun BIO_dump_indent_cb(cb: CPointer<CFunction<(COpaquePointer?, size_t, COpaquePointer?) -> Int>>?, u: CValuesRef<*>?, s: String?, len: Int, indent: Int): Int {
    memScoped {
        return kniBridge635(cb.rawValue, u?.getPointer(memScope).rawValue, s?.cstr?.getPointer(memScope).rawValue, len, indent)
    }
}

fun BIO_dump(b: CValuesRef<BIO>?, bytes: String?, len: Int): Int {
    memScoped {
        return kniBridge636(b?.getPointer(memScope).rawValue, bytes?.cstr?.getPointer(memScope).rawValue, len)
    }
}

fun BIO_dump_indent(b: CValuesRef<BIO>?, bytes: String?, len: Int, indent: Int): Int {
    memScoped {
        return kniBridge637(b?.getPointer(memScope).rawValue, bytes?.cstr?.getPointer(memScope).rawValue, len, indent)
    }
}

fun BIO_dump_fp(fp: CValuesRef<FILE>?, s: String?, len: Int): Int {
    memScoped {
        return kniBridge638(fp?.getPointer(memScope).rawValue, s?.cstr?.getPointer(memScope).rawValue, len)
    }
}

fun BIO_dump_indent_fp(fp: CValuesRef<FILE>?, s: String?, len: Int, indent: Int): Int {
    memScoped {
        return kniBridge639(fp?.getPointer(memScope).rawValue, s?.cstr?.getPointer(memScope).rawValue, len, indent)
    }
}

fun BIO_hex_string(out: CValuesRef<BIO>?, indent: Int, width: Int, data: CValuesRef<UByteVar>?, datalen: Int): Int {
    memScoped {
        return kniBridge640(out?.getPointer(memScope).rawValue, indent, width, data?.getPointer(memScope).rawValue, datalen)
    }
}

fun BIO_ADDR_new(): CPointer<BIO_ADDR>? {
    return interpretCPointer<BIO_ADDR>(kniBridge641())
}

fun BIO_ADDR_rawmake(ap: CValuesRef<BIO_ADDR>?, family: Int, where: CValuesRef<*>?, wherelen: size_t, port: UShort): Int {
    memScoped {
        return kniBridge642(ap?.getPointer(memScope).rawValue, family, where?.getPointer(memScope).rawValue, wherelen, port)
    }
}

fun BIO_ADDR_free(arg0: CValuesRef<BIO_ADDR>?): Unit {
    memScoped {
        return kniBridge643(arg0?.getPointer(memScope).rawValue)
    }
}

fun BIO_ADDR_clear(ap: CValuesRef<BIO_ADDR>?): Unit {
    memScoped {
        return kniBridge644(ap?.getPointer(memScope).rawValue)
    }
}

fun BIO_ADDR_family(ap: CValuesRef<BIO_ADDR>?): Int {
    memScoped {
        return kniBridge645(ap?.getPointer(memScope).rawValue)
    }
}

fun BIO_ADDR_rawaddress(ap: CValuesRef<BIO_ADDR>?, p: CValuesRef<*>?, l: CValuesRef<size_tVar>?): Int {
    memScoped {
        return kniBridge646(ap?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, l?.getPointer(memScope).rawValue)
    }
}

fun BIO_ADDR_rawport(ap: CValuesRef<BIO_ADDR>?): UShort {
    memScoped {
        return kniBridge647(ap?.getPointer(memScope).rawValue)
    }
}

fun BIO_ADDR_hostname_string(ap: CValuesRef<BIO_ADDR>?, numeric: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge648(ap?.getPointer(memScope).rawValue, numeric))
    }
}

fun BIO_ADDR_service_string(ap: CValuesRef<BIO_ADDR>?, numeric: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge649(ap?.getPointer(memScope).rawValue, numeric))
    }
}

fun BIO_ADDR_path_string(ap: CValuesRef<BIO_ADDR>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge650(ap?.getPointer(memScope).rawValue))
    }
}

fun BIO_ADDRINFO_next(bai: CValuesRef<BIO_ADDRINFO>?): CPointer<BIO_ADDRINFO>? {
    memScoped {
        return interpretCPointer<BIO_ADDRINFO>(kniBridge651(bai?.getPointer(memScope).rawValue))
    }
}

fun BIO_ADDRINFO_family(bai: CValuesRef<BIO_ADDRINFO>?): Int {
    memScoped {
        return kniBridge652(bai?.getPointer(memScope).rawValue)
    }
}

fun BIO_ADDRINFO_socktype(bai: CValuesRef<BIO_ADDRINFO>?): Int {
    memScoped {
        return kniBridge653(bai?.getPointer(memScope).rawValue)
    }
}

fun BIO_ADDRINFO_protocol(bai: CValuesRef<BIO_ADDRINFO>?): Int {
    memScoped {
        return kniBridge654(bai?.getPointer(memScope).rawValue)
    }
}

fun BIO_ADDRINFO_address(bai: CValuesRef<BIO_ADDRINFO>?): CPointer<BIO_ADDR>? {
    memScoped {
        return interpretCPointer<BIO_ADDR>(kniBridge655(bai?.getPointer(memScope).rawValue))
    }
}

fun BIO_ADDRINFO_free(bai: CValuesRef<BIO_ADDRINFO>?): Unit {
    memScoped {
        return kniBridge656(bai?.getPointer(memScope).rawValue)
    }
}

fun BIO_parse_hostserv(hostserv: String?, host: CValuesRef<CPointerVar<ByteVar>>?, service: CValuesRef<CPointerVar<ByteVar>>?, hostserv_prio: BIO_hostserv_priorities): Int {
    memScoped {
        return kniBridge657(hostserv?.cstr?.getPointer(memScope).rawValue, host?.getPointer(memScope).rawValue, service?.getPointer(memScope).rawValue, hostserv_prio.value)
    }
}

fun BIO_lookup(host: String?, service: String?, lookup_type: BIO_lookup_type, family: Int, socktype: Int, res: CValuesRef<CPointerVar<BIO_ADDRINFO>>?): Int {
    memScoped {
        return kniBridge658(host?.cstr?.getPointer(memScope).rawValue, service?.cstr?.getPointer(memScope).rawValue, lookup_type.value, family, socktype, res?.getPointer(memScope).rawValue)
    }
}

fun BIO_sock_error(sock: Int): Int {
    return kniBridge659(sock)
}

fun BIO_socket_ioctl(fd: Int, type: Long, arg: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge660(fd, type, arg?.getPointer(memScope).rawValue)
    }
}

fun BIO_socket_nbio(fd: Int, mode: Int): Int {
    return kniBridge661(fd, mode)
}

fun BIO_sock_init(): Int {
    return kniBridge662()
}

fun BIO_set_tcp_ndelay(sock: Int, turn_on: Int): Int {
    return kniBridge663(sock, turn_on)
}

fun BIO_gethostbyname(name: String?): CPointer<hostent>? {
    memScoped {
        return interpretCPointer<hostent>(kniBridge664(name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun BIO_get_port(str: String?, port_ptr: CValuesRef<UShortVar>?): Int {
    memScoped {
        return kniBridge665(str?.cstr?.getPointer(memScope).rawValue, port_ptr?.getPointer(memScope).rawValue)
    }
}

fun BIO_get_host_ip(str: String?, ip: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge666(str?.cstr?.getPointer(memScope).rawValue, ip?.getPointer(memScope).rawValue)
    }
}

fun BIO_get_accept_socket(host_port: CValuesRef<ByteVar>?, mode: Int): Int {
    memScoped {
        return kniBridge667(host_port?.getPointer(memScope).rawValue, mode)
    }
}

fun BIO_accept(sock: Int, ip_port: CValuesRef<CPointerVar<ByteVar>>?): Int {
    memScoped {
        return kniBridge668(sock, ip_port?.getPointer(memScope).rawValue)
    }
}

fun BIO_sock_info(sock: Int, type: BIO_sock_info_type, info: CValuesRef<BIO_sock_info_u>?): Int {
    memScoped {
        return kniBridge669(sock, type.value, info?.getPointer(memScope).rawValue)
    }
}

fun BIO_socket(domain: Int, socktype: Int, protocol: Int, options: Int): Int {
    return kniBridge670(domain, socktype, protocol, options)
}

fun BIO_connect(sock: Int, addr: CValuesRef<BIO_ADDR>?, options: Int): Int {
    memScoped {
        return kniBridge671(sock, addr?.getPointer(memScope).rawValue, options)
    }
}

fun BIO_listen(sock: Int, addr: CValuesRef<BIO_ADDR>?, options: Int): Int {
    memScoped {
        return kniBridge672(sock, addr?.getPointer(memScope).rawValue, options)
    }
}

fun BIO_accept_ex(accept_sock: Int, addr: CValuesRef<BIO_ADDR>?, options: Int): Int {
    memScoped {
        return kniBridge673(accept_sock, addr?.getPointer(memScope).rawValue, options)
    }
}

fun BIO_closesocket(sock: Int): Int {
    return kniBridge674(sock)
}

fun BIO_new_socket(sock: Int, close_flag: Int): CPointer<BIO>? {
    return interpretCPointer<BIO>(kniBridge675(sock, close_flag))
}

fun BIO_new_connect(host_port: String?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge676(host_port?.cstr?.getPointer(memScope).rawValue))
    }
}

fun BIO_new_accept(host_port: String?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge677(host_port?.cstr?.getPointer(memScope).rawValue))
    }
}

fun BIO_new_fd(fd: Int, close_flag: Int): CPointer<BIO>? {
    return interpretCPointer<BIO>(kniBridge678(fd, close_flag))
}

fun BIO_new_bio_pair(bio1: CValuesRef<CPointerVar<BIO>>?, writebuf1: size_t, bio2: CValuesRef<CPointerVar<BIO>>?, writebuf2: size_t): Int {
    memScoped {
        return kniBridge679(bio1?.getPointer(memScope).rawValue, writebuf1, bio2?.getPointer(memScope).rawValue, writebuf2)
    }
}

fun BIO_copy_next_retry(b: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge680(b?.getPointer(memScope).rawValue)
    }
}

fun BIO_printf(bio: CValuesRef<BIO>?, format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge681(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(bio?.getPointer(memScope), format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun BIO_vprintf(bio: CValuesRef<BIO>?, format: String?, args: va_list?): Int {
    memScoped {
        return kniBridge682(bio?.getPointer(memScope).rawValue, format?.cstr?.getPointer(memScope).rawValue, args.rawValue)
    }
}

fun BIO_snprintf(buf: CValuesRef<ByteVar>?, n: size_t, format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge683(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(buf?.getPointer(memScope), n, format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun BIO_vsnprintf(buf: CValuesRef<ByteVar>?, n: size_t, format: String?, args: va_list?): Int {
    memScoped {
        return kniBridge684(buf?.getPointer(memScope).rawValue, n, format?.cstr?.getPointer(memScope).rawValue, args.rawValue)
    }
}

fun BIO_meth_new(type: Int, name: String?): CPointer<BIO_METHOD>? {
    memScoped {
        return interpretCPointer<BIO_METHOD>(kniBridge685(type, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun BIO_meth_free(biom: CValuesRef<BIO_METHOD>?): Unit {
    memScoped {
        return kniBridge686(biom?.getPointer(memScope).rawValue)
    }
}

fun BIO_meth_get_write(biom: CValuesRef<BIO_METHOD>?): CPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?, Int) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?, Int) -> Int>>(kniBridge687(biom?.getPointer(memScope).rawValue))
    }
}

fun BIO_meth_set_write(biom: CValuesRef<BIO_METHOD>?, write: CPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?, Int) -> Int>>?): Int {
    memScoped {
        return kniBridge688(biom?.getPointer(memScope).rawValue, write.rawValue)
    }
}

fun BIO_meth_get_read(biom: CValuesRef<BIO_METHOD>?): CPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?, Int) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?, Int) -> Int>>(kniBridge689(biom?.getPointer(memScope).rawValue))
    }
}

fun BIO_meth_set_read(biom: CValuesRef<BIO_METHOD>?, read: CPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?, Int) -> Int>>?): Int {
    memScoped {
        return kniBridge690(biom?.getPointer(memScope).rawValue, read.rawValue)
    }
}

fun BIO_meth_get_puts(biom: CValuesRef<BIO_METHOD>?): CPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?) -> Int>>(kniBridge691(biom?.getPointer(memScope).rawValue))
    }
}

fun BIO_meth_set_puts(biom: CValuesRef<BIO_METHOD>?, puts: CPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?) -> Int>>?): Int {
    memScoped {
        return kniBridge692(biom?.getPointer(memScope).rawValue, puts.rawValue)
    }
}

fun BIO_meth_get_gets(biom: CValuesRef<BIO_METHOD>?): CPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?, Int) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?, Int) -> Int>>(kniBridge693(biom?.getPointer(memScope).rawValue))
    }
}

fun BIO_meth_set_gets(biom: CValuesRef<BIO_METHOD>?, gets: CPointer<CFunction<(CPointer<BIO>?, CPointer<ByteVar>?, Int) -> Int>>?): Int {
    memScoped {
        return kniBridge694(biom?.getPointer(memScope).rawValue, gets.rawValue)
    }
}

fun BIO_meth_get_ctrl(biom: CValuesRef<BIO_METHOD>?): CPointer<CFunction<(CPointer<BIO>?, Int, Long, COpaquePointer?) -> Long>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIO>?, Int, Long, COpaquePointer?) -> Long>>(kniBridge695(biom?.getPointer(memScope).rawValue))
    }
}

fun BIO_meth_set_ctrl(biom: CValuesRef<BIO_METHOD>?, ctrl: CPointer<CFunction<(CPointer<BIO>?, Int, Long, COpaquePointer?) -> Long>>?): Int {
    memScoped {
        return kniBridge696(biom?.getPointer(memScope).rawValue, ctrl.rawValue)
    }
}

fun BIO_meth_get_create(bion: CValuesRef<BIO_METHOD>?): CPointer<CFunction<(CPointer<BIO>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIO>?) -> Int>>(kniBridge697(bion?.getPointer(memScope).rawValue))
    }
}

fun BIO_meth_set_create(biom: CValuesRef<BIO_METHOD>?, create: CPointer<CFunction<(CPointer<BIO>?) -> Int>>?): Int {
    memScoped {
        return kniBridge698(biom?.getPointer(memScope).rawValue, create.rawValue)
    }
}

fun BIO_meth_get_destroy(biom: CValuesRef<BIO_METHOD>?): CPointer<CFunction<(CPointer<BIO>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIO>?) -> Int>>(kniBridge699(biom?.getPointer(memScope).rawValue))
    }
}

fun BIO_meth_set_destroy(biom: CValuesRef<BIO_METHOD>?, destroy: CPointer<CFunction<(CPointer<BIO>?) -> Int>>?): Int {
    memScoped {
        return kniBridge700(biom?.getPointer(memScope).rawValue, destroy.rawValue)
    }
}

fun BIO_meth_get_callback_ctrl(biom: CValuesRef<BIO_METHOD>?): CPointer<CFunction<(CPointer<BIO>?, Int, CPointer<bio_info_cb>?) -> Long>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIO>?, Int, CPointer<bio_info_cb>?) -> Long>>(kniBridge701(biom?.getPointer(memScope).rawValue))
    }
}

fun BIO_meth_set_callback_ctrl(biom: CValuesRef<BIO_METHOD>?, callback_ctrl: CPointer<CFunction<(CPointer<BIO>?, Int, CPointer<bio_info_cb>?) -> Long>>?): Int {
    memScoped {
        return kniBridge702(biom?.getPointer(memScope).rawValue, callback_ctrl.rawValue)
    }
}

fun ERR_load_BIO_strings(): Int {
    return kniBridge703()
}

fun BN_set_flags(b: CValuesRef<BIGNUM>?, n: Int): Unit {
    memScoped {
        return kniBridge704(b?.getPointer(memScope).rawValue, n)
    }
}

fun BN_get_flags(b: CValuesRef<BIGNUM>?, n: Int): Int {
    memScoped {
        return kniBridge705(b?.getPointer(memScope).rawValue, n)
    }
}

fun BN_with_flags(dest: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, flags: Int): Unit {
    memScoped {
        return kniBridge706(dest?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, flags)
    }
}

fun BN_GENCB_call(cb: CValuesRef<BN_GENCB>?, a: Int, b: Int): Int {
    memScoped {
        return kniBridge707(cb?.getPointer(memScope).rawValue, a, b)
    }
}

fun BN_GENCB_new(): CPointer<BN_GENCB>? {
    return interpretCPointer<BN_GENCB>(kniBridge708())
}

fun BN_GENCB_free(cb: CValuesRef<BN_GENCB>?): Unit {
    memScoped {
        return kniBridge709(cb?.getPointer(memScope).rawValue)
    }
}

fun BN_GENCB_set_old(gencb: CValuesRef<BN_GENCB>?, callback: CPointer<CFunction<(Int, Int, COpaquePointer?) -> Unit>>?, cb_arg: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge710(gencb?.getPointer(memScope).rawValue, callback.rawValue, cb_arg?.getPointer(memScope).rawValue)
    }
}

fun BN_GENCB_set(gencb: CValuesRef<BN_GENCB>?, callback: CPointer<CFunction<(Int, Int, CPointer<BN_GENCB>?) -> Int>>?, cb_arg: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge711(gencb?.getPointer(memScope).rawValue, callback.rawValue, cb_arg?.getPointer(memScope).rawValue)
    }
}

fun BN_GENCB_get_arg(cb: CValuesRef<BN_GENCB>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge712(cb?.getPointer(memScope).rawValue))
    }
}

fun BN_abs_is_word(a: CValuesRef<BIGNUM>?, w: ULong): Int {
    memScoped {
        return kniBridge713(a?.getPointer(memScope).rawValue, w)
    }
}

fun BN_is_zero(a: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge714(a?.getPointer(memScope).rawValue)
    }
}

fun BN_is_one(a: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge715(a?.getPointer(memScope).rawValue)
    }
}

fun BN_is_word(a: CValuesRef<BIGNUM>?, w: ULong): Int {
    memScoped {
        return kniBridge716(a?.getPointer(memScope).rawValue, w)
    }
}

fun BN_is_odd(a: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge717(a?.getPointer(memScope).rawValue)
    }
}

fun BN_zero_ex(a: CValuesRef<BIGNUM>?): Unit {
    memScoped {
        return kniBridge718(a?.getPointer(memScope).rawValue)
    }
}

fun BN_value_one(): CPointer<BIGNUM>? {
    return interpretCPointer<BIGNUM>(kniBridge719())
}

fun BN_options(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge720())
}

fun BN_CTX_new(): CPointer<BN_CTX>? {
    return interpretCPointer<BN_CTX>(kniBridge721())
}

fun BN_CTX_secure_new(): CPointer<BN_CTX>? {
    return interpretCPointer<BN_CTX>(kniBridge722())
}

fun BN_CTX_free(c: CValuesRef<BN_CTX>?): Unit {
    memScoped {
        return kniBridge723(c?.getPointer(memScope).rawValue)
    }
}

fun BN_CTX_start(ctx: CValuesRef<BN_CTX>?): Unit {
    memScoped {
        return kniBridge724(ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_CTX_get(ctx: CValuesRef<BN_CTX>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge725(ctx?.getPointer(memScope).rawValue))
    }
}

fun BN_CTX_end(ctx: CValuesRef<BN_CTX>?): Unit {
    memScoped {
        return kniBridge726(ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_rand(rnd: CValuesRef<BIGNUM>?, bits: Int, top: Int, bottom: Int): Int {
    memScoped {
        return kniBridge727(rnd?.getPointer(memScope).rawValue, bits, top, bottom)
    }
}

fun BN_pseudo_rand(rnd: CValuesRef<BIGNUM>?, bits: Int, top: Int, bottom: Int): Int {
    memScoped {
        return kniBridge728(rnd?.getPointer(memScope).rawValue, bits, top, bottom)
    }
}

fun BN_rand_range(rnd: CValuesRef<BIGNUM>?, range: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge729(rnd?.getPointer(memScope).rawValue, range?.getPointer(memScope).rawValue)
    }
}

fun BN_pseudo_rand_range(rnd: CValuesRef<BIGNUM>?, range: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge730(rnd?.getPointer(memScope).rawValue, range?.getPointer(memScope).rawValue)
    }
}

fun BN_num_bits(a: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge731(a?.getPointer(memScope).rawValue)
    }
}

fun BN_num_bits_word(l: ULong): Int {
    return kniBridge732(l)
}

fun BN_security_bits(L: Int, N: Int): Int {
    return kniBridge733(L, N)
}

fun BN_new(): CPointer<BIGNUM>? {
    return interpretCPointer<BIGNUM>(kniBridge734())
}

fun BN_secure_new(): CPointer<BIGNUM>? {
    return interpretCPointer<BIGNUM>(kniBridge735())
}

fun BN_clear_free(a: CValuesRef<BIGNUM>?): Unit {
    memScoped {
        return kniBridge736(a?.getPointer(memScope).rawValue)
    }
}

fun BN_copy(a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge737(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue))
    }
}

fun BN_swap(a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?): Unit {
    memScoped {
        return kniBridge738(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun BN_bin2bn(s: CValuesRef<UByteVar>?, len: Int, ret: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge739(s?.getPointer(memScope).rawValue, len, ret?.getPointer(memScope).rawValue))
    }
}

fun BN_bn2bin(a: CValuesRef<BIGNUM>?, to: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge740(a?.getPointer(memScope).rawValue, to?.getPointer(memScope).rawValue)
    }
}

fun BN_bn2binpad(a: CValuesRef<BIGNUM>?, to: CValuesRef<UByteVar>?, tolen: Int): Int {
    memScoped {
        return kniBridge741(a?.getPointer(memScope).rawValue, to?.getPointer(memScope).rawValue, tolen)
    }
}

fun BN_lebin2bn(s: CValuesRef<UByteVar>?, len: Int, ret: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge742(s?.getPointer(memScope).rawValue, len, ret?.getPointer(memScope).rawValue))
    }
}

fun BN_bn2lebinpad(a: CValuesRef<BIGNUM>?, to: CValuesRef<UByteVar>?, tolen: Int): Int {
    memScoped {
        return kniBridge743(a?.getPointer(memScope).rawValue, to?.getPointer(memScope).rawValue, tolen)
    }
}

fun BN_mpi2bn(s: CValuesRef<UByteVar>?, len: Int, ret: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge744(s?.getPointer(memScope).rawValue, len, ret?.getPointer(memScope).rawValue))
    }
}

fun BN_bn2mpi(a: CValuesRef<BIGNUM>?, to: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge745(a?.getPointer(memScope).rawValue, to?.getPointer(memScope).rawValue)
    }
}

fun BN_sub(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge746(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun BN_usub(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge747(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun BN_uadd(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge748(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun BN_add(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge749(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun BN_mul(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge750(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_sqr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge751(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_set_negative(b: CValuesRef<BIGNUM>?, n: Int): Unit {
    memScoped {
        return kniBridge752(b?.getPointer(memScope).rawValue, n)
    }
}

fun BN_is_negative(b: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge753(b?.getPointer(memScope).rawValue)
    }
}

fun BN_div(dv: CValuesRef<BIGNUM>?, rem: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, d: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge754(dv?.getPointer(memScope).rawValue, rem?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_nnmod(r: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, d: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge755(r?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_add(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge756(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_add_quick(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge757(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_sub(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge758(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_sub_quick(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge759(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_mul(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge760(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_sqr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge761(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_lshift1(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge762(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_lshift1_quick(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge763(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_lshift(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, n: Int, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge764(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, n, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_lshift_quick(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, n: Int, m: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge765(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, n, m?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_word(a: CValuesRef<BIGNUM>?, w: ULong): ULong {
    memScoped {
        return kniBridge766(a?.getPointer(memScope).rawValue, w)
    }
}

fun BN_div_word(a: CValuesRef<BIGNUM>?, w: ULong): ULong {
    memScoped {
        return kniBridge767(a?.getPointer(memScope).rawValue, w)
    }
}

fun BN_mul_word(a: CValuesRef<BIGNUM>?, w: ULong): Int {
    memScoped {
        return kniBridge768(a?.getPointer(memScope).rawValue, w)
    }
}

fun BN_add_word(a: CValuesRef<BIGNUM>?, w: ULong): Int {
    memScoped {
        return kniBridge769(a?.getPointer(memScope).rawValue, w)
    }
}

fun BN_sub_word(a: CValuesRef<BIGNUM>?, w: ULong): Int {
    memScoped {
        return kniBridge770(a?.getPointer(memScope).rawValue, w)
    }
}

fun BN_set_word(a: CValuesRef<BIGNUM>?, w: ULong): Int {
    memScoped {
        return kniBridge771(a?.getPointer(memScope).rawValue, w)
    }
}

fun BN_get_word(a: CValuesRef<BIGNUM>?): ULong {
    memScoped {
        return kniBridge772(a?.getPointer(memScope).rawValue)
    }
}

fun BN_cmp(a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge773(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun BN_free(a: CValuesRef<BIGNUM>?): Unit {
    memScoped {
        return kniBridge774(a?.getPointer(memScope).rawValue)
    }
}

fun BN_is_bit_set(a: CValuesRef<BIGNUM>?, n: Int): Int {
    memScoped {
        return kniBridge775(a?.getPointer(memScope).rawValue, n)
    }
}

fun BN_lshift(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, n: Int): Int {
    memScoped {
        return kniBridge776(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, n)
    }
}

fun BN_lshift1(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge777(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun BN_exp(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge778(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_exp(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge779(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_exp_mont(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?, m_ctx: CValuesRef<BN_MONT_CTX>?): Int {
    memScoped {
        return kniBridge780(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue, m_ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_exp_mont_consttime(rr: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?, in_mont: CValuesRef<BN_MONT_CTX>?): Int {
    memScoped {
        return kniBridge781(rr?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue, in_mont?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_exp_mont_word(r: CValuesRef<BIGNUM>?, a: ULong, p: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?, m_ctx: CValuesRef<BN_MONT_CTX>?): Int {
    memScoped {
        return kniBridge782(r?.getPointer(memScope).rawValue, a, p?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue, m_ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_exp2_mont(r: CValuesRef<BIGNUM>?, a1: CValuesRef<BIGNUM>?, p1: CValuesRef<BIGNUM>?, a2: CValuesRef<BIGNUM>?, p2: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?, m_ctx: CValuesRef<BN_MONT_CTX>?): Int {
    memScoped {
        return kniBridge783(r?.getPointer(memScope).rawValue, a1?.getPointer(memScope).rawValue, p1?.getPointer(memScope).rawValue, a2?.getPointer(memScope).rawValue, p2?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue, m_ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_exp_simple(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge784(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mask_bits(a: CValuesRef<BIGNUM>?, n: Int): Int {
    memScoped {
        return kniBridge785(a?.getPointer(memScope).rawValue, n)
    }
}

fun BN_print_fp(fp: CValuesRef<FILE>?, a: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge786(fp?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun BN_print(bio: CValuesRef<BIO>?, a: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge787(bio?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun BN_reciprocal(r: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, len: Int, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge788(r?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, len, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_rshift(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, n: Int): Int {
    memScoped {
        return kniBridge789(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, n)
    }
}

fun BN_rshift1(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge790(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun BN_clear(a: CValuesRef<BIGNUM>?): Unit {
    memScoped {
        return kniBridge791(a?.getPointer(memScope).rawValue)
    }
}

fun BN_dup(a: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge792(a?.getPointer(memScope).rawValue))
    }
}

fun BN_ucmp(a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge793(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun BN_set_bit(a: CValuesRef<BIGNUM>?, n: Int): Int {
    memScoped {
        return kniBridge794(a?.getPointer(memScope).rawValue, n)
    }
}

fun BN_clear_bit(a: CValuesRef<BIGNUM>?, n: Int): Int {
    memScoped {
        return kniBridge795(a?.getPointer(memScope).rawValue, n)
    }
}

fun BN_bn2hex(a: CValuesRef<BIGNUM>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge796(a?.getPointer(memScope).rawValue))
    }
}

fun BN_bn2dec(a: CValuesRef<BIGNUM>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge797(a?.getPointer(memScope).rawValue))
    }
}

fun BN_hex2bn(a: CValuesRef<CPointerVar<BIGNUM>>?, str: String?): Int {
    memScoped {
        return kniBridge798(a?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun BN_dec2bn(a: CValuesRef<CPointerVar<BIGNUM>>?, str: String?): Int {
    memScoped {
        return kniBridge799(a?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun BN_asc2bn(a: CValuesRef<CPointerVar<BIGNUM>>?, str: String?): Int {
    memScoped {
        return kniBridge800(a?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun BN_gcd(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge801(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_kronecker(a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge802(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_inverse(ret: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, n: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge803(ret?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, n?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue))
    }
}

fun BN_mod_sqrt(ret: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, n: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge804(ret?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, n?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue))
    }
}

fun BN_consttime_swap(swap: ULong, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, nwords: Int): Unit {
    memScoped {
        return kniBridge805(swap, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, nwords)
    }
}

fun BN_generate_prime(ret: CValuesRef<BIGNUM>?, bits: Int, safe: Int, add: CValuesRef<BIGNUM>?, rem: CValuesRef<BIGNUM>?, callback: CPointer<CFunction<(Int, Int, COpaquePointer?) -> Unit>>?, cb_arg: CValuesRef<*>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge806(ret?.getPointer(memScope).rawValue, bits, safe, add?.getPointer(memScope).rawValue, rem?.getPointer(memScope).rawValue, callback.rawValue, cb_arg?.getPointer(memScope).rawValue))
    }
}

fun BN_is_prime(p: CValuesRef<BIGNUM>?, nchecks: Int, callback: CPointer<CFunction<(Int, Int, COpaquePointer?) -> Unit>>?, ctx: CValuesRef<BN_CTX>?, cb_arg: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge807(p?.getPointer(memScope).rawValue, nchecks, callback.rawValue, ctx?.getPointer(memScope).rawValue, cb_arg?.getPointer(memScope).rawValue)
    }
}

fun BN_is_prime_fasttest(p: CValuesRef<BIGNUM>?, nchecks: Int, callback: CPointer<CFunction<(Int, Int, COpaquePointer?) -> Unit>>?, ctx: CValuesRef<BN_CTX>?, cb_arg: CValuesRef<*>?, do_trial_division: Int): Int {
    memScoped {
        return kniBridge808(p?.getPointer(memScope).rawValue, nchecks, callback.rawValue, ctx?.getPointer(memScope).rawValue, cb_arg?.getPointer(memScope).rawValue, do_trial_division)
    }
}

fun BN_generate_prime_ex(ret: CValuesRef<BIGNUM>?, bits: Int, safe: Int, add: CValuesRef<BIGNUM>?, rem: CValuesRef<BIGNUM>?, cb: CValuesRef<BN_GENCB>?): Int {
    memScoped {
        return kniBridge809(ret?.getPointer(memScope).rawValue, bits, safe, add?.getPointer(memScope).rawValue, rem?.getPointer(memScope).rawValue, cb?.getPointer(memScope).rawValue)
    }
}

fun BN_is_prime_ex(p: CValuesRef<BIGNUM>?, nchecks: Int, ctx: CValuesRef<BN_CTX>?, cb: CValuesRef<BN_GENCB>?): Int {
    memScoped {
        return kniBridge810(p?.getPointer(memScope).rawValue, nchecks, ctx?.getPointer(memScope).rawValue, cb?.getPointer(memScope).rawValue)
    }
}

fun BN_is_prime_fasttest_ex(p: CValuesRef<BIGNUM>?, nchecks: Int, ctx: CValuesRef<BN_CTX>?, do_trial_division: Int, cb: CValuesRef<BN_GENCB>?): Int {
    memScoped {
        return kniBridge811(p?.getPointer(memScope).rawValue, nchecks, ctx?.getPointer(memScope).rawValue, do_trial_division, cb?.getPointer(memScope).rawValue)
    }
}

fun BN_X931_generate_Xpq(Xp: CValuesRef<BIGNUM>?, Xq: CValuesRef<BIGNUM>?, nbits: Int, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge812(Xp?.getPointer(memScope).rawValue, Xq?.getPointer(memScope).rawValue, nbits, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_X931_derive_prime_ex(p: CValuesRef<BIGNUM>?, p1: CValuesRef<BIGNUM>?, p2: CValuesRef<BIGNUM>?, Xp: CValuesRef<BIGNUM>?, Xp1: CValuesRef<BIGNUM>?, Xp2: CValuesRef<BIGNUM>?, e: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?, cb: CValuesRef<BN_GENCB>?): Int {
    memScoped {
        return kniBridge813(p?.getPointer(memScope).rawValue, p1?.getPointer(memScope).rawValue, p2?.getPointer(memScope).rawValue, Xp?.getPointer(memScope).rawValue, Xp1?.getPointer(memScope).rawValue, Xp2?.getPointer(memScope).rawValue, e?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue, cb?.getPointer(memScope).rawValue)
    }
}

fun BN_X931_generate_prime_ex(p: CValuesRef<BIGNUM>?, p1: CValuesRef<BIGNUM>?, p2: CValuesRef<BIGNUM>?, Xp1: CValuesRef<BIGNUM>?, Xp2: CValuesRef<BIGNUM>?, Xp: CValuesRef<BIGNUM>?, e: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?, cb: CValuesRef<BN_GENCB>?): Int {
    memScoped {
        return kniBridge814(p?.getPointer(memScope).rawValue, p1?.getPointer(memScope).rawValue, p2?.getPointer(memScope).rawValue, Xp1?.getPointer(memScope).rawValue, Xp2?.getPointer(memScope).rawValue, Xp?.getPointer(memScope).rawValue, e?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue, cb?.getPointer(memScope).rawValue)
    }
}

fun BN_MONT_CTX_new(): CPointer<BN_MONT_CTX>? {
    return interpretCPointer<BN_MONT_CTX>(kniBridge815())
}

fun BN_mod_mul_montgomery(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, mont: CValuesRef<BN_MONT_CTX>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge816(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, mont?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_to_montgomery(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, mont: CValuesRef<BN_MONT_CTX>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge817(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, mont?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_from_montgomery(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, mont: CValuesRef<BN_MONT_CTX>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge818(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, mont?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_MONT_CTX_free(mont: CValuesRef<BN_MONT_CTX>?): Unit {
    memScoped {
        return kniBridge819(mont?.getPointer(memScope).rawValue)
    }
}

fun BN_MONT_CTX_set(mont: CValuesRef<BN_MONT_CTX>?, mod: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge820(mont?.getPointer(memScope).rawValue, mod?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_MONT_CTX_copy(to: CValuesRef<BN_MONT_CTX>?, from: CValuesRef<BN_MONT_CTX>?): CPointer<BN_MONT_CTX>? {
    memScoped {
        return interpretCPointer<BN_MONT_CTX>(kniBridge821(to?.getPointer(memScope).rawValue, from?.getPointer(memScope).rawValue))
    }
}

fun BN_MONT_CTX_set_locked(pmont: CValuesRef<CPointerVar<BN_MONT_CTX>>?, lock: CValuesRef<*>?, mod: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): CPointer<BN_MONT_CTX>? {
    memScoped {
        return interpretCPointer<BN_MONT_CTX>(kniBridge822(pmont?.getPointer(memScope).rawValue, lock?.getPointer(memScope).rawValue, mod?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue))
    }
}

fun BN_BLINDING_new(A: CValuesRef<BIGNUM>?, Ai: CValuesRef<BIGNUM>?, mod: CValuesRef<BIGNUM>?): CPointer<BN_BLINDING>? {
    memScoped {
        return interpretCPointer<BN_BLINDING>(kniBridge823(A?.getPointer(memScope).rawValue, Ai?.getPointer(memScope).rawValue, mod?.getPointer(memScope).rawValue))
    }
}

fun BN_BLINDING_free(b: CValuesRef<BN_BLINDING>?): Unit {
    memScoped {
        return kniBridge824(b?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_update(b: CValuesRef<BN_BLINDING>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge825(b?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_convert(n: CValuesRef<BIGNUM>?, b: CValuesRef<BN_BLINDING>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge826(n?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_invert(n: CValuesRef<BIGNUM>?, b: CValuesRef<BN_BLINDING>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge827(n?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_convert_ex(n: CValuesRef<BIGNUM>?, r: CValuesRef<BIGNUM>?, b: CValuesRef<BN_BLINDING>?, arg3: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge828(n?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, arg3?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_invert_ex(n: CValuesRef<BIGNUM>?, r: CValuesRef<BIGNUM>?, b: CValuesRef<BN_BLINDING>?, arg3: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge829(n?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, arg3?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_is_current_thread(b: CValuesRef<BN_BLINDING>?): Int {
    memScoped {
        return kniBridge830(b?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_set_current_thread(b: CValuesRef<BN_BLINDING>?): Unit {
    memScoped {
        return kniBridge831(b?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_lock(b: CValuesRef<BN_BLINDING>?): Int {
    memScoped {
        return kniBridge832(b?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_unlock(b: CValuesRef<BN_BLINDING>?): Int {
    memScoped {
        return kniBridge833(b?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_get_flags(arg0: CValuesRef<BN_BLINDING>?): ULong {
    memScoped {
        return kniBridge834(arg0?.getPointer(memScope).rawValue)
    }
}

fun BN_BLINDING_set_flags(arg0: CValuesRef<BN_BLINDING>?, arg1: ULong): Unit {
    memScoped {
        return kniBridge835(arg0?.getPointer(memScope).rawValue, arg1)
    }
}

fun BN_BLINDING_create_param(b: CValuesRef<BN_BLINDING>?, e: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?, bn_mod_exp: CPointer<CFunction<(CPointer<BIGNUM>?, CPointer<BIGNUM>?, CPointer<BIGNUM>?, CPointer<BIGNUM>?, CPointer<BN_CTX>?, CPointer<BN_MONT_CTX>?) -> Int>>?, m_ctx: CValuesRef<BN_MONT_CTX>?): CPointer<BN_BLINDING>? {
    memScoped {
        return interpretCPointer<BN_BLINDING>(kniBridge836(b?.getPointer(memScope).rawValue, e?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue, bn_mod_exp.rawValue, m_ctx?.getPointer(memScope).rawValue))
    }
}

fun BN_set_params(mul: Int, high: Int, low: Int, mont: Int): Unit {
    return kniBridge837(mul, high, low, mont)
}

fun BN_get_params(which: Int): Int {
    return kniBridge838(which)
}

fun BN_RECP_CTX_new(): CPointer<BN_RECP_CTX>? {
    return interpretCPointer<BN_RECP_CTX>(kniBridge839())
}

fun BN_RECP_CTX_free(recp: CValuesRef<BN_RECP_CTX>?): Unit {
    memScoped {
        return kniBridge840(recp?.getPointer(memScope).rawValue)
    }
}

fun BN_RECP_CTX_set(recp: CValuesRef<BN_RECP_CTX>?, rdiv: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge841(recp?.getPointer(memScope).rawValue, rdiv?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_mul_reciprocal(r: CValuesRef<BIGNUM>?, x: CValuesRef<BIGNUM>?, y: CValuesRef<BIGNUM>?, recp: CValuesRef<BN_RECP_CTX>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge842(r?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue, y?.getPointer(memScope).rawValue, recp?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_mod_exp_recp(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge843(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_div_recp(dv: CValuesRef<BIGNUM>?, rem: CValuesRef<BIGNUM>?, m: CValuesRef<BIGNUM>?, recp: CValuesRef<BN_RECP_CTX>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge844(dv?.getPointer(memScope).rawValue, rem?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue, recp?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_add(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge845(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge846(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_mul(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge847(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_sqr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge848(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_inv(r: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge849(r?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_div(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge850(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_exp(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge851(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_sqrt(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge852(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_solve_quad(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge853(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_arr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge854(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_mul_arr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, p: CValuesRef<IntVar>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge855(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_sqr_arr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<IntVar>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge856(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_inv_arr(r: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, p: CValuesRef<IntVar>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge857(r?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_div_arr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, p: CValuesRef<IntVar>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge858(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_exp_arr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, b: CValuesRef<BIGNUM>?, p: CValuesRef<IntVar>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge859(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_sqrt_arr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<IntVar>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge860(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_mod_solve_quad_arr(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<IntVar>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge861(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_GF2m_poly2arr(a: CValuesRef<BIGNUM>?, p: CValuesRef<IntVar>?, max: Int): Int {
    memScoped {
        return kniBridge862(a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, max)
    }
}

fun BN_GF2m_arr2poly(p: CValuesRef<IntVar>?, a: CValuesRef<BIGNUM>?): Int {
    memScoped {
        return kniBridge863(p?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun BN_nist_mod_192(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge864(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_nist_mod_224(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge865(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_nist_mod_256(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge866(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_nist_mod_384(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge867(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_nist_mod_521(r: CValuesRef<BIGNUM>?, a: CValuesRef<BIGNUM>?, p: CValuesRef<BIGNUM>?, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge868(r?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_get0_nist_prime_192(): CPointer<BIGNUM>? {
    return interpretCPointer<BIGNUM>(kniBridge869())
}

fun BN_get0_nist_prime_224(): CPointer<BIGNUM>? {
    return interpretCPointer<BIGNUM>(kniBridge870())
}

fun BN_get0_nist_prime_256(): CPointer<BIGNUM>? {
    return interpretCPointer<BIGNUM>(kniBridge871())
}

fun BN_get0_nist_prime_384(): CPointer<BIGNUM>? {
    return interpretCPointer<BIGNUM>(kniBridge872())
}

fun BN_get0_nist_prime_521(): CPointer<BIGNUM>? {
    return interpretCPointer<BIGNUM>(kniBridge873())
}

fun BN_nist_mod_func(p: CValuesRef<BIGNUM>?): CPointer<CFunction<(CPointer<BIGNUM>?, CPointer<BIGNUM>?, CPointer<BIGNUM>?, CPointer<BN_CTX>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<BIGNUM>?, CPointer<BIGNUM>?, CPointer<BIGNUM>?, CPointer<BN_CTX>?) -> Int>>(kniBridge874(p?.getPointer(memScope).rawValue))
    }
}

fun BN_generate_dsa_nonce(out: CValuesRef<BIGNUM>?, range: CValuesRef<BIGNUM>?, priv: CValuesRef<BIGNUM>?, message: CValuesRef<UByteVar>?, message_len: size_t, ctx: CValuesRef<BN_CTX>?): Int {
    memScoped {
        return kniBridge875(out?.getPointer(memScope).rawValue, range?.getPointer(memScope).rawValue, priv?.getPointer(memScope).rawValue, message?.getPointer(memScope).rawValue, message_len, ctx?.getPointer(memScope).rawValue)
    }
}

fun BN_get_rfc2409_prime_768(bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge876(bn?.getPointer(memScope).rawValue))
    }
}

fun BN_get_rfc2409_prime_1024(bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge877(bn?.getPointer(memScope).rawValue))
    }
}

fun BN_get_rfc3526_prime_1536(bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge878(bn?.getPointer(memScope).rawValue))
    }
}

fun BN_get_rfc3526_prime_2048(bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge879(bn?.getPointer(memScope).rawValue))
    }
}

fun BN_get_rfc3526_prime_3072(bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge880(bn?.getPointer(memScope).rawValue))
    }
}

fun BN_get_rfc3526_prime_4096(bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge881(bn?.getPointer(memScope).rawValue))
    }
}

fun BN_get_rfc3526_prime_6144(bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge882(bn?.getPointer(memScope).rawValue))
    }
}

fun BN_get_rfc3526_prime_8192(bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge883(bn?.getPointer(memScope).rawValue))
    }
}

fun BN_bntest_rand(rnd: CValuesRef<BIGNUM>?, bits: Int, top: Int, bottom: Int): Int {
    memScoped {
        return kniBridge884(rnd?.getPointer(memScope).rawValue, bits, top, bottom)
    }
}

fun ERR_load_BN_strings(): Int {
    return kniBridge885()
}

fun sk_X509_ALGOR_num(sk: CValuesRef<stack_st_X509_ALGOR>?): Int {
    memScoped {
        return kniBridge886(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_X509_ALGOR_value(sk: CValuesRef<stack_st_X509_ALGOR>?, idx: Int): CPointer<X509_ALGOR>? {
    memScoped {
        return interpretCPointer<X509_ALGOR>(kniBridge887(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_X509_ALGOR_new(compare: sk_X509_ALGOR_compfunc?): CPointer<stack_st_X509_ALGOR>? {
    return interpretCPointer<stack_st_X509_ALGOR>(kniBridge888(compare.rawValue))
}

fun sk_X509_ALGOR_new_null(): CPointer<stack_st_X509_ALGOR>? {
    return interpretCPointer<stack_st_X509_ALGOR>(kniBridge889())
}

fun sk_X509_ALGOR_free(sk: CValuesRef<stack_st_X509_ALGOR>?): Unit {
    memScoped {
        return kniBridge890(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_X509_ALGOR_zero(sk: CValuesRef<stack_st_X509_ALGOR>?): Unit {
    memScoped {
        return kniBridge891(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_X509_ALGOR_delete(sk: CValuesRef<stack_st_X509_ALGOR>?, i: Int): CPointer<X509_ALGOR>? {
    memScoped {
        return interpretCPointer<X509_ALGOR>(kniBridge892(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_X509_ALGOR_delete_ptr(sk: CValuesRef<stack_st_X509_ALGOR>?, ptr: CValuesRef<X509_ALGOR>?): CPointer<X509_ALGOR>? {
    memScoped {
        return interpretCPointer<X509_ALGOR>(kniBridge893(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_X509_ALGOR_push(sk: CValuesRef<stack_st_X509_ALGOR>?, ptr: CValuesRef<X509_ALGOR>?): Int {
    memScoped {
        return kniBridge894(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_X509_ALGOR_unshift(sk: CValuesRef<stack_st_X509_ALGOR>?, ptr: CValuesRef<X509_ALGOR>?): Int {
    memScoped {
        return kniBridge895(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_X509_ALGOR_pop(sk: CValuesRef<stack_st_X509_ALGOR>?): CPointer<X509_ALGOR>? {
    memScoped {
        return interpretCPointer<X509_ALGOR>(kniBridge896(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_X509_ALGOR_shift(sk: CValuesRef<stack_st_X509_ALGOR>?): CPointer<X509_ALGOR>? {
    memScoped {
        return interpretCPointer<X509_ALGOR>(kniBridge897(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_X509_ALGOR_pop_free(sk: CValuesRef<stack_st_X509_ALGOR>?, freefunc: sk_X509_ALGOR_freefunc?): Unit {
    memScoped {
        return kniBridge898(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_X509_ALGOR_insert(sk: CValuesRef<stack_st_X509_ALGOR>?, ptr: CValuesRef<X509_ALGOR>?, idx: Int): Int {
    memScoped {
        return kniBridge899(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_X509_ALGOR_set(sk: CValuesRef<stack_st_X509_ALGOR>?, idx: Int, ptr: CValuesRef<X509_ALGOR>?): CPointer<X509_ALGOR>? {
    memScoped {
        return interpretCPointer<X509_ALGOR>(kniBridge900(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_X509_ALGOR_find(sk: CValuesRef<stack_st_X509_ALGOR>?, ptr: CValuesRef<X509_ALGOR>?): Int {
    memScoped {
        return kniBridge901(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_X509_ALGOR_find_ex(sk: CValuesRef<stack_st_X509_ALGOR>?, ptr: CValuesRef<X509_ALGOR>?): Int {
    memScoped {
        return kniBridge902(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_X509_ALGOR_sort(sk: CValuesRef<stack_st_X509_ALGOR>?): Unit {
    memScoped {
        return kniBridge903(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_X509_ALGOR_is_sorted(sk: CValuesRef<stack_st_X509_ALGOR>?): Int {
    memScoped {
        return kniBridge904(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_X509_ALGOR_dup(sk: CValuesRef<stack_st_X509_ALGOR>?): CPointer<stack_st_X509_ALGOR>? {
    memScoped {
        return interpretCPointer<stack_st_X509_ALGOR>(kniBridge905(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_X509_ALGOR_deep_copy(sk: CValuesRef<stack_st_X509_ALGOR>?, copyfunc: sk_X509_ALGOR_copyfunc?, freefunc: sk_X509_ALGOR_freefunc?): CPointer<stack_st_X509_ALGOR>? {
    memScoped {
        return interpretCPointer<stack_st_X509_ALGOR>(kniBridge906(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_X509_ALGOR_set_cmp_func(sk: CValuesRef<stack_st_X509_ALGOR>?, compare: sk_X509_ALGOR_compfunc?): sk_X509_ALGOR_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<X509_ALGOR>>?, CPointer<CPointerVar<X509_ALGOR>>?) -> Int>>(kniBridge907(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun sk_ASN1_STRING_TABLE_num(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?): Int {
    memScoped {
        return kniBridge908(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_value(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, idx: Int): CPointer<ASN1_STRING_TABLE>? {
    memScoped {
        return interpretCPointer<ASN1_STRING_TABLE>(kniBridge909(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_ASN1_STRING_TABLE_new(compare: sk_ASN1_STRING_TABLE_compfunc?): CPointer<stack_st_ASN1_STRING_TABLE>? {
    return interpretCPointer<stack_st_ASN1_STRING_TABLE>(kniBridge910(compare.rawValue))
}

fun sk_ASN1_STRING_TABLE_new_null(): CPointer<stack_st_ASN1_STRING_TABLE>? {
    return interpretCPointer<stack_st_ASN1_STRING_TABLE>(kniBridge911())
}

fun sk_ASN1_STRING_TABLE_free(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?): Unit {
    memScoped {
        return kniBridge912(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_zero(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?): Unit {
    memScoped {
        return kniBridge913(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_delete(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, i: Int): CPointer<ASN1_STRING_TABLE>? {
    memScoped {
        return interpretCPointer<ASN1_STRING_TABLE>(kniBridge914(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_ASN1_STRING_TABLE_delete_ptr(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, ptr: CValuesRef<ASN1_STRING_TABLE>?): CPointer<ASN1_STRING_TABLE>? {
    memScoped {
        return interpretCPointer<ASN1_STRING_TABLE>(kniBridge915(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_STRING_TABLE_push(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, ptr: CValuesRef<ASN1_STRING_TABLE>?): Int {
    memScoped {
        return kniBridge916(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_unshift(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, ptr: CValuesRef<ASN1_STRING_TABLE>?): Int {
    memScoped {
        return kniBridge917(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_pop(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?): CPointer<ASN1_STRING_TABLE>? {
    memScoped {
        return interpretCPointer<ASN1_STRING_TABLE>(kniBridge918(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_STRING_TABLE_shift(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?): CPointer<ASN1_STRING_TABLE>? {
    memScoped {
        return interpretCPointer<ASN1_STRING_TABLE>(kniBridge919(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_STRING_TABLE_pop_free(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, freefunc: sk_ASN1_STRING_TABLE_freefunc?): Unit {
    memScoped {
        return kniBridge920(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_insert(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, ptr: CValuesRef<ASN1_STRING_TABLE>?, idx: Int): Int {
    memScoped {
        return kniBridge921(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_ASN1_STRING_TABLE_set(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, idx: Int, ptr: CValuesRef<ASN1_STRING_TABLE>?): CPointer<ASN1_STRING_TABLE>? {
    memScoped {
        return interpretCPointer<ASN1_STRING_TABLE>(kniBridge922(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_STRING_TABLE_find(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, ptr: CValuesRef<ASN1_STRING_TABLE>?): Int {
    memScoped {
        return kniBridge923(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_find_ex(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, ptr: CValuesRef<ASN1_STRING_TABLE>?): Int {
    memScoped {
        return kniBridge924(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_sort(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?): Unit {
    memScoped {
        return kniBridge925(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_is_sorted(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?): Int {
    memScoped {
        return kniBridge926(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_STRING_TABLE_dup(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?): CPointer<stack_st_ASN1_STRING_TABLE>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_STRING_TABLE>(kniBridge927(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_STRING_TABLE_deep_copy(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, copyfunc: sk_ASN1_STRING_TABLE_copyfunc?, freefunc: sk_ASN1_STRING_TABLE_freefunc?): CPointer<stack_st_ASN1_STRING_TABLE>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_STRING_TABLE>(kniBridge928(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_ASN1_STRING_TABLE_set_cmp_func(sk: CValuesRef<stack_st_ASN1_STRING_TABLE>?, compare: sk_ASN1_STRING_TABLE_compfunc?): sk_ASN1_STRING_TABLE_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<ASN1_STRING_TABLE>>?, CPointer<CPointerVar<ASN1_STRING_TABLE>>?) -> Int>>(kniBridge929(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun sk_ASN1_INTEGER_num(sk: CValuesRef<stack_st_ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge930(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_INTEGER_value(sk: CValuesRef<stack_st_ASN1_INTEGER>?, idx: Int): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge931(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_ASN1_INTEGER_new(compare: sk_ASN1_INTEGER_compfunc?): CPointer<stack_st_ASN1_INTEGER>? {
    return interpretCPointer<stack_st_ASN1_INTEGER>(kniBridge932(compare.rawValue))
}

fun sk_ASN1_INTEGER_new_null(): CPointer<stack_st_ASN1_INTEGER>? {
    return interpretCPointer<stack_st_ASN1_INTEGER>(kniBridge933())
}

fun sk_ASN1_INTEGER_free(sk: CValuesRef<stack_st_ASN1_INTEGER>?): Unit {
    memScoped {
        return kniBridge934(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_INTEGER_zero(sk: CValuesRef<stack_st_ASN1_INTEGER>?): Unit {
    memScoped {
        return kniBridge935(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_INTEGER_delete(sk: CValuesRef<stack_st_ASN1_INTEGER>?, i: Int): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge936(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_ASN1_INTEGER_delete_ptr(sk: CValuesRef<stack_st_ASN1_INTEGER>?, ptr: CValuesRef<ASN1_INTEGER>?): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge937(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_INTEGER_push(sk: CValuesRef<stack_st_ASN1_INTEGER>?, ptr: CValuesRef<ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge938(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_INTEGER_unshift(sk: CValuesRef<stack_st_ASN1_INTEGER>?, ptr: CValuesRef<ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge939(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_INTEGER_pop(sk: CValuesRef<stack_st_ASN1_INTEGER>?): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge940(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_INTEGER_shift(sk: CValuesRef<stack_st_ASN1_INTEGER>?): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge941(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_INTEGER_pop_free(sk: CValuesRef<stack_st_ASN1_INTEGER>?, freefunc: sk_ASN1_INTEGER_freefunc?): Unit {
    memScoped {
        return kniBridge942(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_ASN1_INTEGER_insert(sk: CValuesRef<stack_st_ASN1_INTEGER>?, ptr: CValuesRef<ASN1_INTEGER>?, idx: Int): Int {
    memScoped {
        return kniBridge943(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_ASN1_INTEGER_set(sk: CValuesRef<stack_st_ASN1_INTEGER>?, idx: Int, ptr: CValuesRef<ASN1_INTEGER>?): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge944(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_INTEGER_find(sk: CValuesRef<stack_st_ASN1_INTEGER>?, ptr: CValuesRef<ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge945(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_INTEGER_find_ex(sk: CValuesRef<stack_st_ASN1_INTEGER>?, ptr: CValuesRef<ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge946(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_INTEGER_sort(sk: CValuesRef<stack_st_ASN1_INTEGER>?): Unit {
    memScoped {
        return kniBridge947(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_INTEGER_is_sorted(sk: CValuesRef<stack_st_ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge948(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_INTEGER_dup(sk: CValuesRef<stack_st_ASN1_INTEGER>?): CPointer<stack_st_ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_INTEGER>(kniBridge949(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_INTEGER_deep_copy(sk: CValuesRef<stack_st_ASN1_INTEGER>?, copyfunc: sk_ASN1_INTEGER_copyfunc?, freefunc: sk_ASN1_INTEGER_freefunc?): CPointer<stack_st_ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_INTEGER>(kniBridge950(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_ASN1_INTEGER_set_cmp_func(sk: CValuesRef<stack_st_ASN1_INTEGER>?, compare: sk_ASN1_INTEGER_compfunc?): sk_ASN1_INTEGER_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<ASN1_INTEGER>>?, CPointer<CPointerVar<ASN1_INTEGER>>?) -> Int>>(kniBridge951(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun sk_ASN1_GENERALSTRING_num(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?): Int {
    memScoped {
        return kniBridge952(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_value(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, idx: Int): CPointer<ASN1_GENERALSTRING>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALSTRING>(kniBridge953(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_ASN1_GENERALSTRING_new(compare: sk_ASN1_GENERALSTRING_compfunc?): CPointer<stack_st_ASN1_GENERALSTRING>? {
    return interpretCPointer<stack_st_ASN1_GENERALSTRING>(kniBridge954(compare.rawValue))
}

fun sk_ASN1_GENERALSTRING_new_null(): CPointer<stack_st_ASN1_GENERALSTRING>? {
    return interpretCPointer<stack_st_ASN1_GENERALSTRING>(kniBridge955())
}

fun sk_ASN1_GENERALSTRING_free(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?): Unit {
    memScoped {
        return kniBridge956(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_zero(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?): Unit {
    memScoped {
        return kniBridge957(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_delete(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, i: Int): CPointer<ASN1_GENERALSTRING>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALSTRING>(kniBridge958(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_ASN1_GENERALSTRING_delete_ptr(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, ptr: CValuesRef<ASN1_GENERALSTRING>?): CPointer<ASN1_GENERALSTRING>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALSTRING>(kniBridge959(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_GENERALSTRING_push(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, ptr: CValuesRef<ASN1_GENERALSTRING>?): Int {
    memScoped {
        return kniBridge960(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_unshift(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, ptr: CValuesRef<ASN1_GENERALSTRING>?): Int {
    memScoped {
        return kniBridge961(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_pop(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?): CPointer<ASN1_GENERALSTRING>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALSTRING>(kniBridge962(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_GENERALSTRING_shift(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?): CPointer<ASN1_GENERALSTRING>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALSTRING>(kniBridge963(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_GENERALSTRING_pop_free(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, freefunc: sk_ASN1_GENERALSTRING_freefunc?): Unit {
    memScoped {
        return kniBridge964(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_insert(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, ptr: CValuesRef<ASN1_GENERALSTRING>?, idx: Int): Int {
    memScoped {
        return kniBridge965(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_ASN1_GENERALSTRING_set(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, idx: Int, ptr: CValuesRef<ASN1_GENERALSTRING>?): CPointer<ASN1_GENERALSTRING>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALSTRING>(kniBridge966(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_GENERALSTRING_find(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, ptr: CValuesRef<ASN1_GENERALSTRING>?): Int {
    memScoped {
        return kniBridge967(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_find_ex(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, ptr: CValuesRef<ASN1_GENERALSTRING>?): Int {
    memScoped {
        return kniBridge968(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_sort(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?): Unit {
    memScoped {
        return kniBridge969(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_is_sorted(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?): Int {
    memScoped {
        return kniBridge970(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_GENERALSTRING_dup(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?): CPointer<stack_st_ASN1_GENERALSTRING>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_GENERALSTRING>(kniBridge971(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_GENERALSTRING_deep_copy(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, copyfunc: sk_ASN1_GENERALSTRING_copyfunc?, freefunc: sk_ASN1_GENERALSTRING_freefunc?): CPointer<stack_st_ASN1_GENERALSTRING>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_GENERALSTRING>(kniBridge972(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_ASN1_GENERALSTRING_set_cmp_func(sk: CValuesRef<stack_st_ASN1_GENERALSTRING>?, compare: sk_ASN1_GENERALSTRING_compfunc?): sk_ASN1_GENERALSTRING_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<ASN1_GENERALSTRING>>?, CPointer<CPointerVar<ASN1_GENERALSTRING>>?) -> Int>>(kniBridge973(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun sk_ASN1_UTF8STRING_num(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?): Int {
    memScoped {
        return kniBridge974(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_UTF8STRING_value(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, idx: Int): CPointer<ASN1_UTF8STRING>? {
    memScoped {
        return interpretCPointer<ASN1_UTF8STRING>(kniBridge975(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_ASN1_UTF8STRING_new(compare: sk_ASN1_UTF8STRING_compfunc?): CPointer<stack_st_ASN1_UTF8STRING>? {
    return interpretCPointer<stack_st_ASN1_UTF8STRING>(kniBridge976(compare.rawValue))
}

fun sk_ASN1_UTF8STRING_new_null(): CPointer<stack_st_ASN1_UTF8STRING>? {
    return interpretCPointer<stack_st_ASN1_UTF8STRING>(kniBridge977())
}

fun sk_ASN1_UTF8STRING_free(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?): Unit {
    memScoped {
        return kniBridge978(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_UTF8STRING_zero(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?): Unit {
    memScoped {
        return kniBridge979(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_UTF8STRING_delete(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, i: Int): CPointer<ASN1_UTF8STRING>? {
    memScoped {
        return interpretCPointer<ASN1_UTF8STRING>(kniBridge980(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_ASN1_UTF8STRING_delete_ptr(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, ptr: CValuesRef<ASN1_UTF8STRING>?): CPointer<ASN1_UTF8STRING>? {
    memScoped {
        return interpretCPointer<ASN1_UTF8STRING>(kniBridge981(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_UTF8STRING_push(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, ptr: CValuesRef<ASN1_UTF8STRING>?): Int {
    memScoped {
        return kniBridge982(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_UTF8STRING_unshift(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, ptr: CValuesRef<ASN1_UTF8STRING>?): Int {
    memScoped {
        return kniBridge983(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_UTF8STRING_pop(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?): CPointer<ASN1_UTF8STRING>? {
    memScoped {
        return interpretCPointer<ASN1_UTF8STRING>(kniBridge984(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_UTF8STRING_shift(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?): CPointer<ASN1_UTF8STRING>? {
    memScoped {
        return interpretCPointer<ASN1_UTF8STRING>(kniBridge985(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_UTF8STRING_pop_free(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, freefunc: sk_ASN1_UTF8STRING_freefunc?): Unit {
    memScoped {
        return kniBridge986(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_ASN1_UTF8STRING_insert(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, ptr: CValuesRef<ASN1_UTF8STRING>?, idx: Int): Int {
    memScoped {
        return kniBridge987(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_ASN1_UTF8STRING_set(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, idx: Int, ptr: CValuesRef<ASN1_UTF8STRING>?): CPointer<ASN1_UTF8STRING>? {
    memScoped {
        return interpretCPointer<ASN1_UTF8STRING>(kniBridge988(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_UTF8STRING_find(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, ptr: CValuesRef<ASN1_UTF8STRING>?): Int {
    memScoped {
        return kniBridge989(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_UTF8STRING_find_ex(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, ptr: CValuesRef<ASN1_UTF8STRING>?): Int {
    memScoped {
        return kniBridge990(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_UTF8STRING_sort(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?): Unit {
    memScoped {
        return kniBridge991(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_UTF8STRING_is_sorted(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?): Int {
    memScoped {
        return kniBridge992(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_UTF8STRING_dup(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?): CPointer<stack_st_ASN1_UTF8STRING>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_UTF8STRING>(kniBridge993(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_UTF8STRING_deep_copy(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, copyfunc: sk_ASN1_UTF8STRING_copyfunc?, freefunc: sk_ASN1_UTF8STRING_freefunc?): CPointer<stack_st_ASN1_UTF8STRING>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_UTF8STRING>(kniBridge994(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_ASN1_UTF8STRING_set_cmp_func(sk: CValuesRef<stack_st_ASN1_UTF8STRING>?, compare: sk_ASN1_UTF8STRING_compfunc?): sk_ASN1_UTF8STRING_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<ASN1_UTF8STRING>>?, CPointer<CPointerVar<ASN1_UTF8STRING>>?) -> Int>>(kniBridge995(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun sk_ASN1_TYPE_num(sk: CValuesRef<stack_st_ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge996(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_TYPE_value(sk: CValuesRef<stack_st_ASN1_TYPE>?, idx: Int): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge997(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_ASN1_TYPE_new(compare: sk_ASN1_TYPE_compfunc?): CPointer<stack_st_ASN1_TYPE>? {
    return interpretCPointer<stack_st_ASN1_TYPE>(kniBridge998(compare.rawValue))
}

fun sk_ASN1_TYPE_new_null(): CPointer<stack_st_ASN1_TYPE>? {
    return interpretCPointer<stack_st_ASN1_TYPE>(kniBridge999())
}

fun sk_ASN1_TYPE_free(sk: CValuesRef<stack_st_ASN1_TYPE>?): Unit {
    memScoped {
        return kniBridge1000(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_TYPE_zero(sk: CValuesRef<stack_st_ASN1_TYPE>?): Unit {
    memScoped {
        return kniBridge1001(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_TYPE_delete(sk: CValuesRef<stack_st_ASN1_TYPE>?, i: Int): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge1002(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_ASN1_TYPE_delete_ptr(sk: CValuesRef<stack_st_ASN1_TYPE>?, ptr: CValuesRef<ASN1_TYPE>?): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge1003(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_TYPE_push(sk: CValuesRef<stack_st_ASN1_TYPE>?, ptr: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1004(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_TYPE_unshift(sk: CValuesRef<stack_st_ASN1_TYPE>?, ptr: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1005(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_TYPE_pop(sk: CValuesRef<stack_st_ASN1_TYPE>?): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge1006(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_TYPE_shift(sk: CValuesRef<stack_st_ASN1_TYPE>?): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge1007(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_TYPE_pop_free(sk: CValuesRef<stack_st_ASN1_TYPE>?, freefunc: sk_ASN1_TYPE_freefunc?): Unit {
    memScoped {
        return kniBridge1008(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_ASN1_TYPE_insert(sk: CValuesRef<stack_st_ASN1_TYPE>?, ptr: CValuesRef<ASN1_TYPE>?, idx: Int): Int {
    memScoped {
        return kniBridge1009(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_ASN1_TYPE_set(sk: CValuesRef<stack_st_ASN1_TYPE>?, idx: Int, ptr: CValuesRef<ASN1_TYPE>?): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge1010(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_TYPE_find(sk: CValuesRef<stack_st_ASN1_TYPE>?, ptr: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1011(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_TYPE_find_ex(sk: CValuesRef<stack_st_ASN1_TYPE>?, ptr: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1012(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_TYPE_sort(sk: CValuesRef<stack_st_ASN1_TYPE>?): Unit {
    memScoped {
        return kniBridge1013(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_TYPE_is_sorted(sk: CValuesRef<stack_st_ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1014(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_TYPE_dup(sk: CValuesRef<stack_st_ASN1_TYPE>?): CPointer<stack_st_ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_TYPE>(kniBridge1015(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_TYPE_deep_copy(sk: CValuesRef<stack_st_ASN1_TYPE>?, copyfunc: sk_ASN1_TYPE_copyfunc?, freefunc: sk_ASN1_TYPE_freefunc?): CPointer<stack_st_ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_TYPE>(kniBridge1016(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_ASN1_TYPE_set_cmp_func(sk: CValuesRef<stack_st_ASN1_TYPE>?, compare: sk_ASN1_TYPE_compfunc?): sk_ASN1_TYPE_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<ASN1_TYPE>>?, CPointer<CPointerVar<ASN1_TYPE>>?) -> Int>>(kniBridge1017(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun d2i_ASN1_SEQUENCE_ANY(a: CValuesRef<CPointerVar<ASN1_SEQUENCE_ANY>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_SEQUENCE_ANY>? {
    memScoped {
        return interpretCPointer<ASN1_SEQUENCE_ANY>(kniBridge1018(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_SEQUENCE_ANY(a: CValuesRef<ASN1_SEQUENCE_ANY>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1019(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_SET_ANY(a: CValuesRef<CPointerVar<ASN1_SEQUENCE_ANY>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_SEQUENCE_ANY>? {
    memScoped {
        return interpretCPointer<ASN1_SEQUENCE_ANY>(kniBridge1020(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_SET_ANY(a: CValuesRef<ASN1_SEQUENCE_ANY>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1021(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TYPE_new(): CPointer<ASN1_TYPE>? {
    return interpretCPointer<ASN1_TYPE>(kniBridge1022())
}

fun ASN1_TYPE_free(a: CValuesRef<ASN1_TYPE>?): Unit {
    memScoped {
        return kniBridge1023(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_TYPE(a: CValuesRef<CPointerVar<ASN1_TYPE>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge1024(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_TYPE(a: CValuesRef<ASN1_TYPE>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1025(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TYPE_get(a: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1026(a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TYPE_set(a: CValuesRef<ASN1_TYPE>?, type: Int, value: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1027(a?.getPointer(memScope).rawValue, type, value?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TYPE_set1(a: CValuesRef<ASN1_TYPE>?, type: Int, value: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge1028(a?.getPointer(memScope).rawValue, type, value?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TYPE_cmp(a: CValuesRef<ASN1_TYPE>?, b: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1029(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TYPE_pack_sequence(it: CValuesRef<ASN1_ITEM>?, s: CValuesRef<*>?, t: CValuesRef<CPointerVar<ASN1_TYPE>>?): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge1030(it?.getPointer(memScope).rawValue, s?.getPointer(memScope).rawValue, t?.getPointer(memScope).rawValue))
    }
}

fun ASN1_TYPE_unpack_sequence(it: CValuesRef<ASN1_ITEM>?, t: CValuesRef<ASN1_TYPE>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1031(it?.getPointer(memScope).rawValue, t?.getPointer(memScope).rawValue))
    }
}

fun ASN1_OBJECT_new(): CPointer<ASN1_OBJECT>? {
    return interpretCPointer<ASN1_OBJECT>(kniBridge1032())
}

fun ASN1_OBJECT_free(a: CValuesRef<ASN1_OBJECT>?): Unit {
    memScoped {
        return kniBridge1033(a?.getPointer(memScope).rawValue)
    }
}

fun i2d_ASN1_OBJECT(a: CValuesRef<ASN1_OBJECT>?, pp: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1034(a?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_OBJECT(a: CValuesRef<CPointerVar<ASN1_OBJECT>>?, pp: CValuesRef<CPointerVar<UByteVar>>?, length: Long): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1035(a?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue, length))
    }
}

fun sk_ASN1_OBJECT_num(sk: CValuesRef<stack_st_ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1036(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_OBJECT_value(sk: CValuesRef<stack_st_ASN1_OBJECT>?, idx: Int): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1037(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_ASN1_OBJECT_new(compare: sk_ASN1_OBJECT_compfunc?): CPointer<stack_st_ASN1_OBJECT>? {
    return interpretCPointer<stack_st_ASN1_OBJECT>(kniBridge1038(compare.rawValue))
}

fun sk_ASN1_OBJECT_new_null(): CPointer<stack_st_ASN1_OBJECT>? {
    return interpretCPointer<stack_st_ASN1_OBJECT>(kniBridge1039())
}

fun sk_ASN1_OBJECT_free(sk: CValuesRef<stack_st_ASN1_OBJECT>?): Unit {
    memScoped {
        return kniBridge1040(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_OBJECT_zero(sk: CValuesRef<stack_st_ASN1_OBJECT>?): Unit {
    memScoped {
        return kniBridge1041(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_OBJECT_delete(sk: CValuesRef<stack_st_ASN1_OBJECT>?, i: Int): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1042(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_ASN1_OBJECT_delete_ptr(sk: CValuesRef<stack_st_ASN1_OBJECT>?, ptr: CValuesRef<ASN1_OBJECT>?): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1043(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_OBJECT_push(sk: CValuesRef<stack_st_ASN1_OBJECT>?, ptr: CValuesRef<ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1044(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_OBJECT_unshift(sk: CValuesRef<stack_st_ASN1_OBJECT>?, ptr: CValuesRef<ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1045(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_OBJECT_pop(sk: CValuesRef<stack_st_ASN1_OBJECT>?): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1046(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_OBJECT_shift(sk: CValuesRef<stack_st_ASN1_OBJECT>?): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1047(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_OBJECT_pop_free(sk: CValuesRef<stack_st_ASN1_OBJECT>?, freefunc: sk_ASN1_OBJECT_freefunc?): Unit {
    memScoped {
        return kniBridge1048(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_ASN1_OBJECT_insert(sk: CValuesRef<stack_st_ASN1_OBJECT>?, ptr: CValuesRef<ASN1_OBJECT>?, idx: Int): Int {
    memScoped {
        return kniBridge1049(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_ASN1_OBJECT_set(sk: CValuesRef<stack_st_ASN1_OBJECT>?, idx: Int, ptr: CValuesRef<ASN1_OBJECT>?): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1050(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_OBJECT_find(sk: CValuesRef<stack_st_ASN1_OBJECT>?, ptr: CValuesRef<ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1051(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_OBJECT_find_ex(sk: CValuesRef<stack_st_ASN1_OBJECT>?, ptr: CValuesRef<ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1052(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_OBJECT_sort(sk: CValuesRef<stack_st_ASN1_OBJECT>?): Unit {
    memScoped {
        return kniBridge1053(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_OBJECT_is_sorted(sk: CValuesRef<stack_st_ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1054(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_ASN1_OBJECT_dup(sk: CValuesRef<stack_st_ASN1_OBJECT>?): CPointer<stack_st_ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_OBJECT>(kniBridge1055(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_ASN1_OBJECT_deep_copy(sk: CValuesRef<stack_st_ASN1_OBJECT>?, copyfunc: sk_ASN1_OBJECT_copyfunc?, freefunc: sk_ASN1_OBJECT_freefunc?): CPointer<stack_st_ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<stack_st_ASN1_OBJECT>(kniBridge1056(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_ASN1_OBJECT_set_cmp_func(sk: CValuesRef<stack_st_ASN1_OBJECT>?, compare: sk_ASN1_OBJECT_compfunc?): sk_ASN1_OBJECT_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<ASN1_OBJECT>>?, CPointer<CPointerVar<ASN1_OBJECT>>?) -> Int>>(kniBridge1057(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun ASN1_STRING_new(): CPointer<ASN1_STRING>? {
    return interpretCPointer<ASN1_STRING>(kniBridge1058())
}

fun ASN1_STRING_free(a: CValuesRef<ASN1_STRING>?): Unit {
    memScoped {
        return kniBridge1059(a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_clear_free(a: CValuesRef<ASN1_STRING>?): Unit {
    memScoped {
        return kniBridge1060(a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_copy(dst: CValuesRef<ASN1_STRING>?, str: CValuesRef<ASN1_STRING>?): Int {
    memScoped {
        return kniBridge1061(dst?.getPointer(memScope).rawValue, str?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_dup(a: CValuesRef<ASN1_STRING>?): CPointer<ASN1_STRING>? {
    memScoped {
        return interpretCPointer<ASN1_STRING>(kniBridge1062(a?.getPointer(memScope).rawValue))
    }
}

fun ASN1_STRING_type_new(type: Int): CPointer<ASN1_STRING>? {
    return interpretCPointer<ASN1_STRING>(kniBridge1063(type))
}

fun ASN1_STRING_cmp(a: CValuesRef<ASN1_STRING>?, b: CValuesRef<ASN1_STRING>?): Int {
    memScoped {
        return kniBridge1064(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_set(str: CValuesRef<ASN1_STRING>?, data: CValuesRef<*>?, len: Int): Int {
    memScoped {
        return kniBridge1065(str?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun ASN1_STRING_set0(str: CValuesRef<ASN1_STRING>?, data: CValuesRef<*>?, len: Int): Unit {
    memScoped {
        return kniBridge1066(str?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun ASN1_STRING_length(x: CValuesRef<ASN1_STRING>?): Int {
    memScoped {
        return kniBridge1067(x?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_length_set(x: CValuesRef<ASN1_STRING>?, n: Int): Unit {
    memScoped {
        return kniBridge1068(x?.getPointer(memScope).rawValue, n)
    }
}

fun ASN1_STRING_type(x: CValuesRef<ASN1_STRING>?): Int {
    memScoped {
        return kniBridge1069(x?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_data(x: CValuesRef<ASN1_STRING>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge1070(x?.getPointer(memScope).rawValue))
    }
}

fun ASN1_STRING_get0_data(x: CValuesRef<ASN1_STRING>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge1071(x?.getPointer(memScope).rawValue))
    }
}

fun ASN1_BIT_STRING_new(): CPointer<ASN1_BIT_STRING>? {
    return interpretCPointer<ASN1_BIT_STRING>(kniBridge1072())
}

fun ASN1_BIT_STRING_free(a: CValuesRef<ASN1_BIT_STRING>?): Unit {
    memScoped {
        return kniBridge1073(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_BIT_STRING(a: CValuesRef<CPointerVar<ASN1_BIT_STRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_BIT_STRING>? {
    memScoped {
        return interpretCPointer<ASN1_BIT_STRING>(kniBridge1074(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_BIT_STRING(a: CValuesRef<ASN1_BIT_STRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1075(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_BIT_STRING_set(a: CValuesRef<ASN1_BIT_STRING>?, d: CValuesRef<UByteVar>?, length: Int): Int {
    memScoped {
        return kniBridge1076(a?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue, length)
    }
}

fun ASN1_BIT_STRING_set_bit(a: CValuesRef<ASN1_BIT_STRING>?, n: Int, value: Int): Int {
    memScoped {
        return kniBridge1077(a?.getPointer(memScope).rawValue, n, value)
    }
}

fun ASN1_BIT_STRING_get_bit(a: CValuesRef<ASN1_BIT_STRING>?, n: Int): Int {
    memScoped {
        return kniBridge1078(a?.getPointer(memScope).rawValue, n)
    }
}

fun ASN1_BIT_STRING_check(a: CValuesRef<ASN1_BIT_STRING>?, flags: CValuesRef<UByteVar>?, flags_len: Int): Int {
    memScoped {
        return kniBridge1079(a?.getPointer(memScope).rawValue, flags?.getPointer(memScope).rawValue, flags_len)
    }
}

fun ASN1_BIT_STRING_name_print(out: CValuesRef<BIO>?, bs: CValuesRef<ASN1_BIT_STRING>?, tbl: CValuesRef<BIT_STRING_BITNAME>?, indent: Int): Int {
    memScoped {
        return kniBridge1080(out?.getPointer(memScope).rawValue, bs?.getPointer(memScope).rawValue, tbl?.getPointer(memScope).rawValue, indent)
    }
}

fun ASN1_BIT_STRING_num_asc(name: String?, tbl: CValuesRef<BIT_STRING_BITNAME>?): Int {
    memScoped {
        return kniBridge1081(name?.cstr?.getPointer(memScope).rawValue, tbl?.getPointer(memScope).rawValue)
    }
}

fun ASN1_BIT_STRING_set_asc(bs: CValuesRef<ASN1_BIT_STRING>?, name: String?, value: Int, tbl: CValuesRef<BIT_STRING_BITNAME>?): Int {
    memScoped {
        return kniBridge1082(bs?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, value, tbl?.getPointer(memScope).rawValue)
    }
}

fun ASN1_INTEGER_new(): CPointer<ASN1_INTEGER>? {
    return interpretCPointer<ASN1_INTEGER>(kniBridge1083())
}

fun ASN1_INTEGER_free(a: CValuesRef<ASN1_INTEGER>?): Unit {
    memScoped {
        return kniBridge1084(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_INTEGER(a: CValuesRef<CPointerVar<ASN1_INTEGER>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge1085(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_INTEGER(a: CValuesRef<ASN1_INTEGER>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1086(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_UINTEGER(a: CValuesRef<CPointerVar<ASN1_INTEGER>>?, pp: CValuesRef<CPointerVar<UByteVar>>?, length: Long): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge1087(a?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue, length))
    }
}

fun ASN1_INTEGER_dup(x: CValuesRef<ASN1_INTEGER>?): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge1088(x?.getPointer(memScope).rawValue))
    }
}

fun ASN1_INTEGER_cmp(x: CValuesRef<ASN1_INTEGER>?, y: CValuesRef<ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge1089(x?.getPointer(memScope).rawValue, y?.getPointer(memScope).rawValue)
    }
}

fun ASN1_ENUMERATED_new(): CPointer<ASN1_ENUMERATED>? {
    return interpretCPointer<ASN1_ENUMERATED>(kniBridge1090())
}

fun ASN1_ENUMERATED_free(a: CValuesRef<ASN1_ENUMERATED>?): Unit {
    memScoped {
        return kniBridge1091(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_ENUMERATED(a: CValuesRef<CPointerVar<ASN1_ENUMERATED>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_ENUMERATED>? {
    memScoped {
        return interpretCPointer<ASN1_ENUMERATED>(kniBridge1092(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_ENUMERATED(a: CValuesRef<ASN1_ENUMERATED>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1093(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_UTCTIME_check(a: CValuesRef<ASN1_UTCTIME>?): Int {
    memScoped {
        return kniBridge1094(a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_UTCTIME_set(s: CValuesRef<ASN1_UTCTIME>?, t: time_t): CPointer<ASN1_UTCTIME>? {
    memScoped {
        return interpretCPointer<ASN1_UTCTIME>(kniBridge1095(s?.getPointer(memScope).rawValue, t))
    }
}

fun ASN1_UTCTIME_adj(s: CValuesRef<ASN1_UTCTIME>?, t: time_t, offset_day: Int, offset_sec: Long): CPointer<ASN1_UTCTIME>? {
    memScoped {
        return interpretCPointer<ASN1_UTCTIME>(kniBridge1096(s?.getPointer(memScope).rawValue, t, offset_day, offset_sec))
    }
}

fun ASN1_UTCTIME_set_string(s: CValuesRef<ASN1_UTCTIME>?, str: String?): Int {
    memScoped {
        return kniBridge1097(s?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun ASN1_UTCTIME_cmp_time_t(s: CValuesRef<ASN1_UTCTIME>?, t: time_t): Int {
    memScoped {
        return kniBridge1098(s?.getPointer(memScope).rawValue, t)
    }
}

fun ASN1_GENERALIZEDTIME_check(a: CValuesRef<ASN1_GENERALIZEDTIME>?): Int {
    memScoped {
        return kniBridge1099(a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_GENERALIZEDTIME_set(s: CValuesRef<ASN1_GENERALIZEDTIME>?, t: time_t): CPointer<ASN1_GENERALIZEDTIME>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALIZEDTIME>(kniBridge1100(s?.getPointer(memScope).rawValue, t))
    }
}

fun ASN1_GENERALIZEDTIME_adj(s: CValuesRef<ASN1_GENERALIZEDTIME>?, t: time_t, offset_day: Int, offset_sec: Long): CPointer<ASN1_GENERALIZEDTIME>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALIZEDTIME>(kniBridge1101(s?.getPointer(memScope).rawValue, t, offset_day, offset_sec))
    }
}

fun ASN1_GENERALIZEDTIME_set_string(s: CValuesRef<ASN1_GENERALIZEDTIME>?, str: String?): Int {
    memScoped {
        return kniBridge1102(s?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TIME_diff(pday: CValuesRef<IntVar>?, psec: CValuesRef<IntVar>?, from: CValuesRef<ASN1_TIME>?, to: CValuesRef<ASN1_TIME>?): Int {
    memScoped {
        return kniBridge1103(pday?.getPointer(memScope).rawValue, psec?.getPointer(memScope).rawValue, from?.getPointer(memScope).rawValue, to?.getPointer(memScope).rawValue)
    }
}

fun ASN1_OCTET_STRING_new(): CPointer<ASN1_OCTET_STRING>? {
    return interpretCPointer<ASN1_OCTET_STRING>(kniBridge1104())
}

fun ASN1_OCTET_STRING_free(a: CValuesRef<ASN1_OCTET_STRING>?): Unit {
    memScoped {
        return kniBridge1105(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_OCTET_STRING(a: CValuesRef<CPointerVar<ASN1_OCTET_STRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_OCTET_STRING>? {
    memScoped {
        return interpretCPointer<ASN1_OCTET_STRING>(kniBridge1106(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_OCTET_STRING(a: CValuesRef<ASN1_OCTET_STRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1107(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_OCTET_STRING_dup(a: CValuesRef<ASN1_OCTET_STRING>?): CPointer<ASN1_OCTET_STRING>? {
    memScoped {
        return interpretCPointer<ASN1_OCTET_STRING>(kniBridge1108(a?.getPointer(memScope).rawValue))
    }
}

fun ASN1_OCTET_STRING_cmp(a: CValuesRef<ASN1_OCTET_STRING>?, b: CValuesRef<ASN1_OCTET_STRING>?): Int {
    memScoped {
        return kniBridge1109(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun ASN1_OCTET_STRING_set(str: CValuesRef<ASN1_OCTET_STRING>?, data: CValuesRef<UByteVar>?, len: Int): Int {
    memScoped {
        return kniBridge1110(str?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun ASN1_VISIBLESTRING_new(): CPointer<ASN1_VISIBLESTRING>? {
    return interpretCPointer<ASN1_VISIBLESTRING>(kniBridge1111())
}

fun ASN1_VISIBLESTRING_free(a: CValuesRef<ASN1_VISIBLESTRING>?): Unit {
    memScoped {
        return kniBridge1112(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_VISIBLESTRING(a: CValuesRef<CPointerVar<ASN1_VISIBLESTRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_VISIBLESTRING>? {
    memScoped {
        return interpretCPointer<ASN1_VISIBLESTRING>(kniBridge1113(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_VISIBLESTRING(a: CValuesRef<ASN1_VISIBLESTRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1114(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_UNIVERSALSTRING_new(): CPointer<ASN1_UNIVERSALSTRING>? {
    return interpretCPointer<ASN1_UNIVERSALSTRING>(kniBridge1115())
}

fun ASN1_UNIVERSALSTRING_free(a: CValuesRef<ASN1_UNIVERSALSTRING>?): Unit {
    memScoped {
        return kniBridge1116(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_UNIVERSALSTRING(a: CValuesRef<CPointerVar<ASN1_UNIVERSALSTRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_UNIVERSALSTRING>? {
    memScoped {
        return interpretCPointer<ASN1_UNIVERSALSTRING>(kniBridge1117(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_UNIVERSALSTRING(a: CValuesRef<ASN1_UNIVERSALSTRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1118(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_UTF8STRING_new(): CPointer<ASN1_UTF8STRING>? {
    return interpretCPointer<ASN1_UTF8STRING>(kniBridge1119())
}

fun ASN1_UTF8STRING_free(a: CValuesRef<ASN1_UTF8STRING>?): Unit {
    memScoped {
        return kniBridge1120(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_UTF8STRING(a: CValuesRef<CPointerVar<ASN1_UTF8STRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_UTF8STRING>? {
    memScoped {
        return interpretCPointer<ASN1_UTF8STRING>(kniBridge1121(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_UTF8STRING(a: CValuesRef<ASN1_UTF8STRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1122(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_NULL_new(): CPointer<ASN1_NULLVar>? {
    return interpretCPointer<ASN1_NULLVar>(kniBridge1123())
}

fun ASN1_NULL_free(a: CValuesRef<ASN1_NULLVar>?): Unit {
    memScoped {
        return kniBridge1124(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_NULL(a: CValuesRef<CPointerVar<ASN1_NULLVar>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_NULLVar>? {
    memScoped {
        return interpretCPointer<ASN1_NULLVar>(kniBridge1125(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_NULL(a: CValuesRef<ASN1_NULLVar>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1126(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_BMPSTRING_new(): CPointer<ASN1_BMPSTRING>? {
    return interpretCPointer<ASN1_BMPSTRING>(kniBridge1127())
}

fun ASN1_BMPSTRING_free(a: CValuesRef<ASN1_BMPSTRING>?): Unit {
    memScoped {
        return kniBridge1128(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_BMPSTRING(a: CValuesRef<CPointerVar<ASN1_BMPSTRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_BMPSTRING>? {
    memScoped {
        return interpretCPointer<ASN1_BMPSTRING>(kniBridge1129(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_BMPSTRING(a: CValuesRef<ASN1_BMPSTRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1130(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun UTF8_getc(str: CValuesRef<UByteVar>?, len: Int, `val`: CValuesRef<ULongVar>?): Int {
    memScoped {
        return kniBridge1131(str?.getPointer(memScope).rawValue, len, `val`?.getPointer(memScope).rawValue)
    }
}

fun UTF8_putc(str: CValuesRef<UByteVar>?, len: Int, value: ULong): Int {
    memScoped {
        return kniBridge1132(str?.getPointer(memScope).rawValue, len, value)
    }
}

fun ASN1_PRINTABLE_new(): CPointer<ASN1_STRING>? {
    return interpretCPointer<ASN1_STRING>(kniBridge1133())
}

fun ASN1_PRINTABLE_free(a: CValuesRef<ASN1_STRING>?): Unit {
    memScoped {
        return kniBridge1134(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_PRINTABLE(a: CValuesRef<CPointerVar<ASN1_STRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_STRING>? {
    memScoped {
        return interpretCPointer<ASN1_STRING>(kniBridge1135(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_PRINTABLE(a: CValuesRef<ASN1_STRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1136(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun DIRECTORYSTRING_new(): CPointer<ASN1_STRING>? {
    return interpretCPointer<ASN1_STRING>(kniBridge1137())
}

fun DIRECTORYSTRING_free(a: CValuesRef<ASN1_STRING>?): Unit {
    memScoped {
        return kniBridge1138(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_DIRECTORYSTRING(a: CValuesRef<CPointerVar<ASN1_STRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_STRING>? {
    memScoped {
        return interpretCPointer<ASN1_STRING>(kniBridge1139(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_DIRECTORYSTRING(a: CValuesRef<ASN1_STRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1140(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun DISPLAYTEXT_new(): CPointer<ASN1_STRING>? {
    return interpretCPointer<ASN1_STRING>(kniBridge1141())
}

fun DISPLAYTEXT_free(a: CValuesRef<ASN1_STRING>?): Unit {
    memScoped {
        return kniBridge1142(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_DISPLAYTEXT(a: CValuesRef<CPointerVar<ASN1_STRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_STRING>? {
    memScoped {
        return interpretCPointer<ASN1_STRING>(kniBridge1143(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_DISPLAYTEXT(a: CValuesRef<ASN1_STRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1144(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_PRINTABLESTRING_new(): CPointer<ASN1_PRINTABLESTRING>? {
    return interpretCPointer<ASN1_PRINTABLESTRING>(kniBridge1145())
}

fun ASN1_PRINTABLESTRING_free(a: CValuesRef<ASN1_PRINTABLESTRING>?): Unit {
    memScoped {
        return kniBridge1146(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_PRINTABLESTRING(a: CValuesRef<CPointerVar<ASN1_PRINTABLESTRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_PRINTABLESTRING>? {
    memScoped {
        return interpretCPointer<ASN1_PRINTABLESTRING>(kniBridge1147(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_PRINTABLESTRING(a: CValuesRef<ASN1_PRINTABLESTRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1148(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_T61STRING_new(): CPointer<ASN1_T61STRING>? {
    return interpretCPointer<ASN1_T61STRING>(kniBridge1149())
}

fun ASN1_T61STRING_free(a: CValuesRef<ASN1_T61STRING>?): Unit {
    memScoped {
        return kniBridge1150(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_T61STRING(a: CValuesRef<CPointerVar<ASN1_T61STRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_T61STRING>? {
    memScoped {
        return interpretCPointer<ASN1_T61STRING>(kniBridge1151(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_T61STRING(a: CValuesRef<ASN1_T61STRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1152(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_IA5STRING_new(): CPointer<ASN1_IA5STRING>? {
    return interpretCPointer<ASN1_IA5STRING>(kniBridge1153())
}

fun ASN1_IA5STRING_free(a: CValuesRef<ASN1_IA5STRING>?): Unit {
    memScoped {
        return kniBridge1154(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_IA5STRING(a: CValuesRef<CPointerVar<ASN1_IA5STRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_IA5STRING>? {
    memScoped {
        return interpretCPointer<ASN1_IA5STRING>(kniBridge1155(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_IA5STRING(a: CValuesRef<ASN1_IA5STRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1156(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_GENERALSTRING_new(): CPointer<ASN1_GENERALSTRING>? {
    return interpretCPointer<ASN1_GENERALSTRING>(kniBridge1157())
}

fun ASN1_GENERALSTRING_free(a: CValuesRef<ASN1_GENERALSTRING>?): Unit {
    memScoped {
        return kniBridge1158(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_GENERALSTRING(a: CValuesRef<CPointerVar<ASN1_GENERALSTRING>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_GENERALSTRING>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALSTRING>(kniBridge1159(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_GENERALSTRING(a: CValuesRef<ASN1_GENERALSTRING>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1160(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_UTCTIME_new(): CPointer<ASN1_UTCTIME>? {
    return interpretCPointer<ASN1_UTCTIME>(kniBridge1161())
}

fun ASN1_UTCTIME_free(a: CValuesRef<ASN1_UTCTIME>?): Unit {
    memScoped {
        return kniBridge1162(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_UTCTIME(a: CValuesRef<CPointerVar<ASN1_UTCTIME>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_UTCTIME>? {
    memScoped {
        return interpretCPointer<ASN1_UTCTIME>(kniBridge1163(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_UTCTIME(a: CValuesRef<ASN1_UTCTIME>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1164(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_GENERALIZEDTIME_new(): CPointer<ASN1_GENERALIZEDTIME>? {
    return interpretCPointer<ASN1_GENERALIZEDTIME>(kniBridge1165())
}

fun ASN1_GENERALIZEDTIME_free(a: CValuesRef<ASN1_GENERALIZEDTIME>?): Unit {
    memScoped {
        return kniBridge1166(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_GENERALIZEDTIME(a: CValuesRef<CPointerVar<ASN1_GENERALIZEDTIME>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_GENERALIZEDTIME>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALIZEDTIME>(kniBridge1167(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_GENERALIZEDTIME(a: CValuesRef<ASN1_GENERALIZEDTIME>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1168(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TIME_new(): CPointer<ASN1_TIME>? {
    return interpretCPointer<ASN1_TIME>(kniBridge1169())
}

fun ASN1_TIME_free(a: CValuesRef<ASN1_TIME>?): Unit {
    memScoped {
        return kniBridge1170(a?.getPointer(memScope).rawValue)
    }
}

fun d2i_ASN1_TIME(a: CValuesRef<CPointerVar<ASN1_TIME>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long): CPointer<ASN1_TIME>? {
    memScoped {
        return interpretCPointer<ASN1_TIME>(kniBridge1171(a?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len))
    }
}

fun i2d_ASN1_TIME(a: CValuesRef<ASN1_TIME>?, out: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1172(a?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TIME_set(s: CValuesRef<ASN1_TIME>?, t: time_t): CPointer<ASN1_TIME>? {
    memScoped {
        return interpretCPointer<ASN1_TIME>(kniBridge1173(s?.getPointer(memScope).rawValue, t))
    }
}

fun ASN1_TIME_adj(s: CValuesRef<ASN1_TIME>?, t: time_t, offset_day: Int, offset_sec: Long): CPointer<ASN1_TIME>? {
    memScoped {
        return interpretCPointer<ASN1_TIME>(kniBridge1174(s?.getPointer(memScope).rawValue, t, offset_day, offset_sec))
    }
}

fun ASN1_TIME_check(t: CValuesRef<ASN1_TIME>?): Int {
    memScoped {
        return kniBridge1175(t?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TIME_to_generalizedtime(t: CValuesRef<ASN1_TIME>?, out: CValuesRef<CPointerVar<ASN1_GENERALIZEDTIME>>?): CPointer<ASN1_GENERALIZEDTIME>? {
    memScoped {
        return interpretCPointer<ASN1_GENERALIZEDTIME>(kniBridge1176(t?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue))
    }
}

fun ASN1_TIME_set_string(s: CValuesRef<ASN1_TIME>?, str: String?): Int {
    memScoped {
        return kniBridge1177(s?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun i2a_ASN1_INTEGER(bp: CValuesRef<BIO>?, a: CValuesRef<ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge1178(bp?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun a2i_ASN1_INTEGER(bp: CValuesRef<BIO>?, bs: CValuesRef<ASN1_INTEGER>?, buf: CValuesRef<ByteVar>?, size: Int): Int {
    memScoped {
        return kniBridge1179(bp?.getPointer(memScope).rawValue, bs?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, size)
    }
}

fun i2a_ASN1_ENUMERATED(bp: CValuesRef<BIO>?, a: CValuesRef<ASN1_ENUMERATED>?): Int {
    memScoped {
        return kniBridge1180(bp?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun a2i_ASN1_ENUMERATED(bp: CValuesRef<BIO>?, bs: CValuesRef<ASN1_ENUMERATED>?, buf: CValuesRef<ByteVar>?, size: Int): Int {
    memScoped {
        return kniBridge1181(bp?.getPointer(memScope).rawValue, bs?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, size)
    }
}

fun i2a_ASN1_OBJECT(bp: CValuesRef<BIO>?, a: CValuesRef<ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1182(bp?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun a2i_ASN1_STRING(bp: CValuesRef<BIO>?, bs: CValuesRef<ASN1_STRING>?, buf: CValuesRef<ByteVar>?, size: Int): Int {
    memScoped {
        return kniBridge1183(bp?.getPointer(memScope).rawValue, bs?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, size)
    }
}

fun i2a_ASN1_STRING(bp: CValuesRef<BIO>?, a: CValuesRef<ASN1_STRING>?, type: Int): Int {
    memScoped {
        return kniBridge1184(bp?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, type)
    }
}

fun i2t_ASN1_OBJECT(buf: CValuesRef<ByteVar>?, buf_len: Int, a: CValuesRef<ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1185(buf?.getPointer(memScope).rawValue, buf_len, a?.getPointer(memScope).rawValue)
    }
}

fun a2d_ASN1_OBJECT(out: CValuesRef<UByteVar>?, olen: Int, buf: String?, num: Int): Int {
    memScoped {
        return kniBridge1186(out?.getPointer(memScope).rawValue, olen, buf?.cstr?.getPointer(memScope).rawValue, num)
    }
}

fun ASN1_OBJECT_create(nid: Int, data: CValuesRef<UByteVar>?, len: Int, sn: String?, ln: String?): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1187(nid, data?.getPointer(memScope).rawValue, len, sn?.cstr?.getPointer(memScope).rawValue, ln?.cstr?.getPointer(memScope).rawValue))
    }
}

fun ASN1_INTEGER_get_int64(pr: CValuesRef<int64_tVar>?, a: CValuesRef<ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge1188(pr?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_INTEGER_set_int64(a: CValuesRef<ASN1_INTEGER>?, r: int64_t): Int {
    memScoped {
        return kniBridge1189(a?.getPointer(memScope).rawValue, r)
    }
}

fun ASN1_INTEGER_get_uint64(pr: CValuesRef<uint64_tVar>?, a: CValuesRef<ASN1_INTEGER>?): Int {
    memScoped {
        return kniBridge1190(pr?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_INTEGER_set_uint64(a: CValuesRef<ASN1_INTEGER>?, r: uint64_t): Int {
    memScoped {
        return kniBridge1191(a?.getPointer(memScope).rawValue, r)
    }
}

fun ASN1_INTEGER_set(a: CValuesRef<ASN1_INTEGER>?, v: Long): Int {
    memScoped {
        return kniBridge1192(a?.getPointer(memScope).rawValue, v)
    }
}

fun ASN1_INTEGER_get(a: CValuesRef<ASN1_INTEGER>?): Long {
    memScoped {
        return kniBridge1193(a?.getPointer(memScope).rawValue)
    }
}

fun BN_to_ASN1_INTEGER(bn: CValuesRef<BIGNUM>?, ai: CValuesRef<ASN1_INTEGER>?): CPointer<ASN1_INTEGER>? {
    memScoped {
        return interpretCPointer<ASN1_INTEGER>(kniBridge1194(bn?.getPointer(memScope).rawValue, ai?.getPointer(memScope).rawValue))
    }
}

fun ASN1_INTEGER_to_BN(ai: CValuesRef<ASN1_INTEGER>?, bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge1195(ai?.getPointer(memScope).rawValue, bn?.getPointer(memScope).rawValue))
    }
}

fun ASN1_ENUMERATED_get_int64(pr: CValuesRef<int64_tVar>?, a: CValuesRef<ASN1_ENUMERATED>?): Int {
    memScoped {
        return kniBridge1196(pr?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_ENUMERATED_set_int64(a: CValuesRef<ASN1_ENUMERATED>?, r: int64_t): Int {
    memScoped {
        return kniBridge1197(a?.getPointer(memScope).rawValue, r)
    }
}

fun ASN1_ENUMERATED_set(a: CValuesRef<ASN1_ENUMERATED>?, v: Long): Int {
    memScoped {
        return kniBridge1198(a?.getPointer(memScope).rawValue, v)
    }
}

fun ASN1_ENUMERATED_get(a: CValuesRef<ASN1_ENUMERATED>?): Long {
    memScoped {
        return kniBridge1199(a?.getPointer(memScope).rawValue)
    }
}

fun BN_to_ASN1_ENUMERATED(bn: CValuesRef<BIGNUM>?, ai: CValuesRef<ASN1_ENUMERATED>?): CPointer<ASN1_ENUMERATED>? {
    memScoped {
        return interpretCPointer<ASN1_ENUMERATED>(kniBridge1200(bn?.getPointer(memScope).rawValue, ai?.getPointer(memScope).rawValue))
    }
}

fun ASN1_ENUMERATED_to_BN(ai: CValuesRef<ASN1_ENUMERATED>?, bn: CValuesRef<BIGNUM>?): CPointer<BIGNUM>? {
    memScoped {
        return interpretCPointer<BIGNUM>(kniBridge1201(ai?.getPointer(memScope).rawValue, bn?.getPointer(memScope).rawValue))
    }
}

fun ASN1_PRINTABLE_type(s: CValuesRef<UByteVar>?, max: Int): Int {
    memScoped {
        return kniBridge1202(s?.getPointer(memScope).rawValue, max)
    }
}

fun ASN1_tag2bit(tag: Int): ULong {
    return kniBridge1203(tag)
}

fun ASN1_get_object(pp: CValuesRef<CPointerVar<UByteVar>>?, plength: CValuesRef<LongVar>?, ptag: CValuesRef<IntVar>?, pclass: CValuesRef<IntVar>?, omax: Long): Int {
    memScoped {
        return kniBridge1204(pp?.getPointer(memScope).rawValue, plength?.getPointer(memScope).rawValue, ptag?.getPointer(memScope).rawValue, pclass?.getPointer(memScope).rawValue, omax)
    }
}

fun ASN1_check_infinite_end(p: CValuesRef<CPointerVar<UByteVar>>?, len: Long): Int {
    memScoped {
        return kniBridge1205(p?.getPointer(memScope).rawValue, len)
    }
}

fun ASN1_const_check_infinite_end(p: CValuesRef<CPointerVar<UByteVar>>?, len: Long): Int {
    memScoped {
        return kniBridge1206(p?.getPointer(memScope).rawValue, len)
    }
}

fun ASN1_put_object(pp: CValuesRef<CPointerVar<UByteVar>>?, constructed: Int, length: Int, tag: Int, xclass: Int): Unit {
    memScoped {
        return kniBridge1207(pp?.getPointer(memScope).rawValue, constructed, length, tag, xclass)
    }
}

fun ASN1_put_eoc(pp: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1208(pp?.getPointer(memScope).rawValue)
    }
}

fun ASN1_object_size(constructed: Int, length: Int, tag: Int): Int {
    return kniBridge1209(constructed, length, tag)
}

fun ASN1_dup(i2d: CPointer<i2d_of_void>?, d2i: CPointer<d2i_of_void>?, x: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1210(i2d.rawValue, d2i.rawValue, x?.getPointer(memScope).rawValue))
    }
}

fun ASN1_item_dup(it: CValuesRef<ASN1_ITEM>?, x: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1211(it?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue))
    }
}

fun ASN1_d2i_fp(xnew: CPointer<CFunction<() -> COpaquePointer?>>?, d2i: CPointer<d2i_of_void>?, `in`: CValuesRef<FILE>?, x: CValuesRef<COpaquePointerVar>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1212(xnew.rawValue, d2i.rawValue, `in`?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue))
    }
}

fun ASN1_item_d2i_fp(it: CValuesRef<ASN1_ITEM>?, `in`: CValuesRef<FILE>?, x: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1213(it?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue))
    }
}

fun ASN1_i2d_fp(i2d: CPointer<i2d_of_void>?, out: CValuesRef<FILE>?, x: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge1214(i2d.rawValue, out?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue)
    }
}

fun ASN1_item_i2d_fp(it: CValuesRef<ASN1_ITEM>?, out: CValuesRef<FILE>?, x: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge1215(it?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_print_ex_fp(fp: CValuesRef<FILE>?, str: CValuesRef<ASN1_STRING>?, flags: ULong): Int {
    memScoped {
        return kniBridge1216(fp?.getPointer(memScope).rawValue, str?.getPointer(memScope).rawValue, flags)
    }
}

fun ASN1_STRING_to_UTF8(out: CValuesRef<CPointerVar<UByteVar>>?, `in`: CValuesRef<ASN1_STRING>?): Int {
    memScoped {
        return kniBridge1217(out?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue)
    }
}

fun ASN1_d2i_bio(xnew: CPointer<CFunction<() -> COpaquePointer?>>?, d2i: CPointer<d2i_of_void>?, `in`: CValuesRef<BIO>?, x: CValuesRef<COpaquePointerVar>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1218(xnew.rawValue, d2i.rawValue, `in`?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue))
    }
}

fun ASN1_item_d2i_bio(it: CValuesRef<ASN1_ITEM>?, `in`: CValuesRef<BIO>?, x: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1219(it?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue))
    }
}

fun ASN1_i2d_bio(i2d: CPointer<i2d_of_void>?, out: CValuesRef<BIO>?, x: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge1220(i2d.rawValue, out?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue)
    }
}

fun ASN1_item_i2d_bio(it: CValuesRef<ASN1_ITEM>?, out: CValuesRef<BIO>?, x: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge1221(it?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue)
    }
}

fun ASN1_UTCTIME_print(fp: CValuesRef<BIO>?, a: CValuesRef<ASN1_UTCTIME>?): Int {
    memScoped {
        return kniBridge1222(fp?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_GENERALIZEDTIME_print(fp: CValuesRef<BIO>?, a: CValuesRef<ASN1_GENERALIZEDTIME>?): Int {
    memScoped {
        return kniBridge1223(fp?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TIME_print(fp: CValuesRef<BIO>?, a: CValuesRef<ASN1_TIME>?): Int {
    memScoped {
        return kniBridge1224(fp?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_print(bp: CValuesRef<BIO>?, v: CValuesRef<ASN1_STRING>?): Int {
    memScoped {
        return kniBridge1225(bp?.getPointer(memScope).rawValue, v?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_print_ex(out: CValuesRef<BIO>?, str: CValuesRef<ASN1_STRING>?, flags: ULong): Int {
    memScoped {
        return kniBridge1226(out?.getPointer(memScope).rawValue, str?.getPointer(memScope).rawValue, flags)
    }
}

fun ASN1_buf_print(bp: CValuesRef<BIO>?, buf: CValuesRef<UByteVar>?, buflen: size_t, off: Int): Int {
    memScoped {
        return kniBridge1227(bp?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, buflen, off)
    }
}

fun ASN1_bn_print(bp: CValuesRef<BIO>?, number: String?, num: CValuesRef<BIGNUM>?, buf: CValuesRef<UByteVar>?, off: Int): Int {
    memScoped {
        return kniBridge1228(bp?.getPointer(memScope).rawValue, number?.cstr?.getPointer(memScope).rawValue, num?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, off)
    }
}

fun ASN1_parse(bp: CValuesRef<BIO>?, pp: CValuesRef<UByteVar>?, len: Long, indent: Int): Int {
    memScoped {
        return kniBridge1229(bp?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue, len, indent)
    }
}

fun ASN1_parse_dump(bp: CValuesRef<BIO>?, pp: CValuesRef<UByteVar>?, len: Long, indent: Int, dump: Int): Int {
    memScoped {
        return kniBridge1230(bp?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue, len, indent, dump)
    }
}

fun ASN1_tag2str(tag: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge1231(tag))
}

fun ASN1_UNIVERSALSTRING_to_string(s: CValuesRef<ASN1_UNIVERSALSTRING>?): Int {
    memScoped {
        return kniBridge1232(s?.getPointer(memScope).rawValue)
    }
}

fun ASN1_TYPE_set_octetstring(a: CValuesRef<ASN1_TYPE>?, data: CValuesRef<UByteVar>?, len: Int): Int {
    memScoped {
        return kniBridge1233(a?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun ASN1_TYPE_get_octetstring(a: CValuesRef<ASN1_TYPE>?, data: CValuesRef<UByteVar>?, max_len: Int): Int {
    memScoped {
        return kniBridge1234(a?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, max_len)
    }
}

fun ASN1_TYPE_set_int_octetstring(a: CValuesRef<ASN1_TYPE>?, num: Long, data: CValuesRef<UByteVar>?, len: Int): Int {
    memScoped {
        return kniBridge1235(a?.getPointer(memScope).rawValue, num, data?.getPointer(memScope).rawValue, len)
    }
}

fun ASN1_TYPE_get_int_octetstring(a: CValuesRef<ASN1_TYPE>?, num: CValuesRef<LongVar>?, data: CValuesRef<UByteVar>?, max_len: Int): Int {
    memScoped {
        return kniBridge1236(a?.getPointer(memScope).rawValue, num?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, max_len)
    }
}

fun ASN1_item_unpack(oct: CValuesRef<ASN1_STRING>?, it: CValuesRef<ASN1_ITEM>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1237(oct?.getPointer(memScope).rawValue, it?.getPointer(memScope).rawValue))
    }
}

fun ASN1_item_pack(obj: CValuesRef<*>?, it: CValuesRef<ASN1_ITEM>?, oct: CValuesRef<CPointerVar<ASN1_OCTET_STRING>>?): CPointer<ASN1_STRING>? {
    memScoped {
        return interpretCPointer<ASN1_STRING>(kniBridge1238(obj?.getPointer(memScope).rawValue, it?.getPointer(memScope).rawValue, oct?.getPointer(memScope).rawValue))
    }
}

fun ASN1_STRING_set_default_mask(mask: ULong): Unit {
    return kniBridge1239(mask)
}

fun ASN1_STRING_set_default_mask_asc(p: String?): Int {
    memScoped {
        return kniBridge1240(p?.cstr?.getPointer(memScope).rawValue)
    }
}

fun ASN1_STRING_get_default_mask(): ULong {
    return kniBridge1241()
}

fun ASN1_mbstring_copy(out: CValuesRef<CPointerVar<ASN1_STRING>>?, `in`: CValuesRef<UByteVar>?, len: Int, inform: Int, mask: ULong): Int {
    memScoped {
        return kniBridge1242(out?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len, inform, mask)
    }
}

fun ASN1_mbstring_ncopy(out: CValuesRef<CPointerVar<ASN1_STRING>>?, `in`: CValuesRef<UByteVar>?, len: Int, inform: Int, mask: ULong, minsize: Long, maxsize: Long): Int {
    memScoped {
        return kniBridge1243(out?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len, inform, mask, minsize, maxsize)
    }
}

fun ASN1_STRING_set_by_NID(out: CValuesRef<CPointerVar<ASN1_STRING>>?, `in`: CValuesRef<UByteVar>?, inlen: Int, inform: Int, nid: Int): CPointer<ASN1_STRING>? {
    memScoped {
        return interpretCPointer<ASN1_STRING>(kniBridge1244(out?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, inlen, inform, nid))
    }
}

fun ASN1_STRING_TABLE_get(nid: Int): CPointer<ASN1_STRING_TABLE>? {
    return interpretCPointer<ASN1_STRING_TABLE>(kniBridge1245(nid))
}

fun ASN1_STRING_TABLE_add(arg0: Int, arg1: Long, arg2: Long, arg3: ULong, arg4: ULong): Int {
    return kniBridge1246(arg0, arg1, arg2, arg3, arg4)
}

fun ASN1_STRING_TABLE_cleanup(): Unit {
    return kniBridge1247()
}

fun ASN1_item_new(it: CValuesRef<ASN1_ITEM>?): CPointer<ASN1_VALUE>? {
    memScoped {
        return interpretCPointer<ASN1_VALUE>(kniBridge1248(it?.getPointer(memScope).rawValue))
    }
}

fun ASN1_item_free(`val`: CValuesRef<ASN1_VALUE>?, it: CValuesRef<ASN1_ITEM>?): Unit {
    memScoped {
        return kniBridge1249(`val`?.getPointer(memScope).rawValue, it?.getPointer(memScope).rawValue)
    }
}

fun ASN1_item_d2i(`val`: CValuesRef<CPointerVar<ASN1_VALUE>>?, `in`: CValuesRef<CPointerVar<UByteVar>>?, len: Long, it: CValuesRef<ASN1_ITEM>?): CPointer<ASN1_VALUE>? {
    memScoped {
        return interpretCPointer<ASN1_VALUE>(kniBridge1250(`val`?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, len, it?.getPointer(memScope).rawValue))
    }
}

fun ASN1_item_i2d(`val`: CValuesRef<ASN1_VALUE>?, out: CValuesRef<CPointerVar<UByteVar>>?, it: CValuesRef<ASN1_ITEM>?): Int {
    memScoped {
        return kniBridge1251(`val`?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, it?.getPointer(memScope).rawValue)
    }
}

fun ASN1_item_ndef_i2d(`val`: CValuesRef<ASN1_VALUE>?, out: CValuesRef<CPointerVar<UByteVar>>?, it: CValuesRef<ASN1_ITEM>?): Int {
    memScoped {
        return kniBridge1252(`val`?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, it?.getPointer(memScope).rawValue)
    }
}

fun ASN1_add_oid_module(): Unit {
    return kniBridge1253()
}

fun ASN1_add_stable_module(): Unit {
    return kniBridge1254()
}

fun ASN1_generate_nconf(str: String?, nconf: CValuesRef<CONF>?): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge1255(str?.cstr?.getPointer(memScope).rawValue, nconf?.getPointer(memScope).rawValue))
    }
}

fun ASN1_generate_v3(str: String?, cnf: CValuesRef<X509V3_CTX>?): CPointer<ASN1_TYPE>? {
    memScoped {
        return interpretCPointer<ASN1_TYPE>(kniBridge1256(str?.cstr?.getPointer(memScope).rawValue, cnf?.getPointer(memScope).rawValue))
    }
}

fun ASN1_str2mask(str: String?, pmask: CValuesRef<ULongVar>?): Int {
    memScoped {
        return kniBridge1257(str?.cstr?.getPointer(memScope).rawValue, pmask?.getPointer(memScope).rawValue)
    }
}

fun ASN1_item_print(out: CValuesRef<BIO>?, ifld: CValuesRef<ASN1_VALUE>?, indent: Int, it: CValuesRef<ASN1_ITEM>?, pctx: CValuesRef<ASN1_PCTX>?): Int {
    memScoped {
        return kniBridge1258(out?.getPointer(memScope).rawValue, ifld?.getPointer(memScope).rawValue, indent, it?.getPointer(memScope).rawValue, pctx?.getPointer(memScope).rawValue)
    }
}

fun ASN1_PCTX_new(): CPointer<ASN1_PCTX>? {
    return interpretCPointer<ASN1_PCTX>(kniBridge1259())
}

fun ASN1_PCTX_free(p: CValuesRef<ASN1_PCTX>?): Unit {
    memScoped {
        return kniBridge1260(p?.getPointer(memScope).rawValue)
    }
}

fun ASN1_PCTX_get_flags(p: CValuesRef<ASN1_PCTX>?): ULong {
    memScoped {
        return kniBridge1261(p?.getPointer(memScope).rawValue)
    }
}

fun ASN1_PCTX_set_flags(p: CValuesRef<ASN1_PCTX>?, flags: ULong): Unit {
    memScoped {
        return kniBridge1262(p?.getPointer(memScope).rawValue, flags)
    }
}

fun ASN1_PCTX_get_nm_flags(p: CValuesRef<ASN1_PCTX>?): ULong {
    memScoped {
        return kniBridge1263(p?.getPointer(memScope).rawValue)
    }
}

fun ASN1_PCTX_set_nm_flags(p: CValuesRef<ASN1_PCTX>?, flags: ULong): Unit {
    memScoped {
        return kniBridge1264(p?.getPointer(memScope).rawValue, flags)
    }
}

fun ASN1_PCTX_get_cert_flags(p: CValuesRef<ASN1_PCTX>?): ULong {
    memScoped {
        return kniBridge1265(p?.getPointer(memScope).rawValue)
    }
}

fun ASN1_PCTX_set_cert_flags(p: CValuesRef<ASN1_PCTX>?, flags: ULong): Unit {
    memScoped {
        return kniBridge1266(p?.getPointer(memScope).rawValue, flags)
    }
}

fun ASN1_PCTX_get_oid_flags(p: CValuesRef<ASN1_PCTX>?): ULong {
    memScoped {
        return kniBridge1267(p?.getPointer(memScope).rawValue)
    }
}

fun ASN1_PCTX_set_oid_flags(p: CValuesRef<ASN1_PCTX>?, flags: ULong): Unit {
    memScoped {
        return kniBridge1268(p?.getPointer(memScope).rawValue, flags)
    }
}

fun ASN1_PCTX_get_str_flags(p: CValuesRef<ASN1_PCTX>?): ULong {
    memScoped {
        return kniBridge1269(p?.getPointer(memScope).rawValue)
    }
}

fun ASN1_PCTX_set_str_flags(p: CValuesRef<ASN1_PCTX>?, flags: ULong): Unit {
    memScoped {
        return kniBridge1270(p?.getPointer(memScope).rawValue, flags)
    }
}

fun ASN1_SCTX_new(scan_cb: CPointer<CFunction<(CPointer<ASN1_SCTX>?) -> Int>>?): CPointer<ASN1_SCTX>? {
    return interpretCPointer<ASN1_SCTX>(kniBridge1271(scan_cb.rawValue))
}

fun ASN1_SCTX_free(p: CValuesRef<ASN1_SCTX>?): Unit {
    memScoped {
        return kniBridge1272(p?.getPointer(memScope).rawValue)
    }
}

fun ASN1_SCTX_get_item(p: CValuesRef<ASN1_SCTX>?): CPointer<ASN1_ITEM>? {
    memScoped {
        return interpretCPointer<ASN1_ITEM>(kniBridge1273(p?.getPointer(memScope).rawValue))
    }
}

fun ASN1_SCTX_get_template(p: CValuesRef<ASN1_SCTX>?): CPointer<ASN1_TEMPLATE>? {
    memScoped {
        return interpretCPointer<ASN1_TEMPLATE>(kniBridge1274(p?.getPointer(memScope).rawValue))
    }
}

fun ASN1_SCTX_get_flags(p: CValuesRef<ASN1_SCTX>?): ULong {
    memScoped {
        return kniBridge1275(p?.getPointer(memScope).rawValue)
    }
}

fun ASN1_SCTX_set_app_data(p: CValuesRef<ASN1_SCTX>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1276(p?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun ASN1_SCTX_get_app_data(p: CValuesRef<ASN1_SCTX>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1277(p?.getPointer(memScope).rawValue))
    }
}

fun BIO_f_asn1(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge1278())
}

fun BIO_new_NDEF(out: CValuesRef<BIO>?, `val`: CValuesRef<ASN1_VALUE>?, it: CValuesRef<ASN1_ITEM>?): CPointer<BIO>? {
    memScoped {
        return interpretCPointer<BIO>(kniBridge1279(out?.getPointer(memScope).rawValue, `val`?.getPointer(memScope).rawValue, it?.getPointer(memScope).rawValue))
    }
}

fun i2d_ASN1_bio_stream(out: CValuesRef<BIO>?, `val`: CValuesRef<ASN1_VALUE>?, `in`: CValuesRef<BIO>?, flags: Int, it: CValuesRef<ASN1_ITEM>?): Int {
    memScoped {
        return kniBridge1280(out?.getPointer(memScope).rawValue, `val`?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, flags, it?.getPointer(memScope).rawValue)
    }
}

fun PEM_write_bio_ASN1_stream(out: CValuesRef<BIO>?, `val`: CValuesRef<ASN1_VALUE>?, `in`: CValuesRef<BIO>?, flags: Int, hdr: String?, it: CValuesRef<ASN1_ITEM>?): Int {
    memScoped {
        return kniBridge1281(out?.getPointer(memScope).rawValue, `val`?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, flags, hdr?.cstr?.getPointer(memScope).rawValue, it?.getPointer(memScope).rawValue)
    }
}

fun SMIME_write_ASN1(bio: CValuesRef<BIO>?, `val`: CValuesRef<ASN1_VALUE>?, data: CValuesRef<BIO>?, flags: Int, ctype_nid: Int, econt_nid: Int, mdalgs: CValuesRef<stack_st_X509_ALGOR>?, it: CValuesRef<ASN1_ITEM>?): Int {
    memScoped {
        return kniBridge1282(bio?.getPointer(memScope).rawValue, `val`?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, flags, ctype_nid, econt_nid, mdalgs?.getPointer(memScope).rawValue, it?.getPointer(memScope).rawValue)
    }
}

fun SMIME_read_ASN1(bio: CValuesRef<BIO>?, bcont: CValuesRef<CPointerVar<BIO>>?, it: CValuesRef<ASN1_ITEM>?): CPointer<ASN1_VALUE>? {
    memScoped {
        return interpretCPointer<ASN1_VALUE>(kniBridge1283(bio?.getPointer(memScope).rawValue, bcont?.getPointer(memScope).rawValue, it?.getPointer(memScope).rawValue))
    }
}

fun SMIME_crlf_copy(`in`: CValuesRef<BIO>?, out: CValuesRef<BIO>?, flags: Int): Int {
    memScoped {
        return kniBridge1284(`in`?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, flags)
    }
}

fun SMIME_text(`in`: CValuesRef<BIO>?, out: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge1285(`in`?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun ERR_load_ASN1_strings(): Int {
    return kniBridge1286()
}

fun OBJ_NAME_init(): Int {
    return kniBridge1287()
}

fun OBJ_NAME_new_index(hash_func: CPointer<CFunction<(CPointer<ByteVar>?) -> ULong>>?, cmp_func: CPointer<CFunction<(CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>?, free_func: CPointer<CFunction<(CPointer<ByteVar>?, Int, CPointer<ByteVar>?) -> Unit>>?): Int {
    return kniBridge1288(hash_func.rawValue, cmp_func.rawValue, free_func.rawValue)
}

fun OBJ_NAME_get(name: String?, type: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge1289(name?.cstr?.getPointer(memScope).rawValue, type))
    }
}

fun OBJ_NAME_add(name: String?, type: Int, data: String?): Int {
    memScoped {
        return kniBridge1290(name?.cstr?.getPointer(memScope).rawValue, type, data?.cstr?.getPointer(memScope).rawValue)
    }
}

fun OBJ_NAME_remove(name: String?, type: Int): Int {
    memScoped {
        return kniBridge1291(name?.cstr?.getPointer(memScope).rawValue, type)
    }
}

fun OBJ_NAME_cleanup(type: Int): Unit {
    return kniBridge1292(type)
}

fun OBJ_NAME_do_all(type: Int, fn: CPointer<CFunction<(CPointer<OBJ_NAME>?, COpaquePointer?) -> Unit>>?, arg: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1293(type, fn.rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun OBJ_NAME_do_all_sorted(type: Int, fn: CPointer<CFunction<(CPointer<OBJ_NAME>?, COpaquePointer?) -> Unit>>?, arg: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1294(type, fn.rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun OBJ_dup(o: CValuesRef<ASN1_OBJECT>?): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1295(o?.getPointer(memScope).rawValue))
    }
}

fun OBJ_nid2obj(n: Int): CPointer<ASN1_OBJECT>? {
    return interpretCPointer<ASN1_OBJECT>(kniBridge1296(n))
}

fun OBJ_nid2ln(n: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge1297(n))
}

fun OBJ_nid2sn(n: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge1298(n))
}

fun OBJ_obj2nid(o: CValuesRef<ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1299(o?.getPointer(memScope).rawValue)
    }
}

fun OBJ_txt2obj(s: String?, no_name: Int): CPointer<ASN1_OBJECT>? {
    memScoped {
        return interpretCPointer<ASN1_OBJECT>(kniBridge1300(s?.cstr?.getPointer(memScope).rawValue, no_name))
    }
}

fun OBJ_obj2txt(buf: CValuesRef<ByteVar>?, buf_len: Int, a: CValuesRef<ASN1_OBJECT>?, no_name: Int): Int {
    memScoped {
        return kniBridge1301(buf?.getPointer(memScope).rawValue, buf_len, a?.getPointer(memScope).rawValue, no_name)
    }
}

fun OBJ_txt2nid(s: String?): Int {
    memScoped {
        return kniBridge1302(s?.cstr?.getPointer(memScope).rawValue)
    }
}

fun OBJ_ln2nid(s: String?): Int {
    memScoped {
        return kniBridge1303(s?.cstr?.getPointer(memScope).rawValue)
    }
}

fun OBJ_sn2nid(s: String?): Int {
    memScoped {
        return kniBridge1304(s?.cstr?.getPointer(memScope).rawValue)
    }
}

fun OBJ_cmp(a: CValuesRef<ASN1_OBJECT>?, b: CValuesRef<ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1305(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun OBJ_bsearch_(key: CValuesRef<*>?, base: CValuesRef<*>?, num: Int, size: Int, cmp: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1306(key?.getPointer(memScope).rawValue, base?.getPointer(memScope).rawValue, num, size, cmp.rawValue))
    }
}

fun OBJ_bsearch_ex_(key: CValuesRef<*>?, base: CValuesRef<*>?, num: Int, size: Int, cmp: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>?, flags: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1307(key?.getPointer(memScope).rawValue, base?.getPointer(memScope).rawValue, num, size, cmp.rawValue, flags))
    }
}

fun OBJ_new_nid(num: Int): Int {
    return kniBridge1308(num)
}

fun OBJ_add_object(obj: CValuesRef<ASN1_OBJECT>?): Int {
    memScoped {
        return kniBridge1309(obj?.getPointer(memScope).rawValue)
    }
}

fun OBJ_create(oid: String?, sn: String?, ln: String?): Int {
    memScoped {
        return kniBridge1310(oid?.cstr?.getPointer(memScope).rawValue, sn?.cstr?.getPointer(memScope).rawValue, ln?.cstr?.getPointer(memScope).rawValue)
    }
}

fun OBJ_create_objects(`in`: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge1311(`in`?.getPointer(memScope).rawValue)
    }
}

fun OBJ_length(obj: CValuesRef<ASN1_OBJECT>?): size_t {
    memScoped {
        return kniBridge1312(obj?.getPointer(memScope).rawValue)
    }
}

fun OBJ_get0_data(obj: CValuesRef<ASN1_OBJECT>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge1313(obj?.getPointer(memScope).rawValue))
    }
}

fun OBJ_find_sigid_algs(signid: Int, pdig_nid: CValuesRef<IntVar>?, ppkey_nid: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1314(signid, pdig_nid?.getPointer(memScope).rawValue, ppkey_nid?.getPointer(memScope).rawValue)
    }
}

fun OBJ_find_sigid_by_algs(psignid: CValuesRef<IntVar>?, dig_nid: Int, pkey_nid: Int): Int {
    memScoped {
        return kniBridge1315(psignid?.getPointer(memScope).rawValue, dig_nid, pkey_nid)
    }
}

fun OBJ_add_sigid(signid: Int, dig_id: Int, pkey_id: Int): Int {
    return kniBridge1316(signid, dig_id, pkey_id)
}

fun OBJ_sigid_free(): Unit {
    return kniBridge1317()
}

fun ERR_load_OBJ_strings(): Int {
    return kniBridge1318()
}

fun EVP_MD_meth_new(md_type: Int, pkey_type: Int): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1319(md_type, pkey_type))
}

fun EVP_MD_meth_dup(md: CValuesRef<EVP_MD>?): CPointer<EVP_MD>? {
    memScoped {
        return interpretCPointer<EVP_MD>(kniBridge1320(md?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_meth_free(md: CValuesRef<EVP_MD>?): Unit {
    memScoped {
        return kniBridge1321(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_meth_set_input_blocksize(md: CValuesRef<EVP_MD>?, blocksize: Int): Int {
    memScoped {
        return kniBridge1322(md?.getPointer(memScope).rawValue, blocksize)
    }
}

fun EVP_MD_meth_set_result_size(md: CValuesRef<EVP_MD>?, resultsize: Int): Int {
    memScoped {
        return kniBridge1323(md?.getPointer(memScope).rawValue, resultsize)
    }
}

fun EVP_MD_meth_set_app_datasize(md: CValuesRef<EVP_MD>?, datasize: Int): Int {
    memScoped {
        return kniBridge1324(md?.getPointer(memScope).rawValue, datasize)
    }
}

fun EVP_MD_meth_set_flags(md: CValuesRef<EVP_MD>?, flags: ULong): Int {
    memScoped {
        return kniBridge1325(md?.getPointer(memScope).rawValue, flags)
    }
}

fun EVP_MD_meth_set_init(md: CValuesRef<EVP_MD>?, init: CPointer<CFunction<(CPointer<EVP_MD_CTX>?) -> Int>>?): Int {
    memScoped {
        return kniBridge1326(md?.getPointer(memScope).rawValue, init.rawValue)
    }
}

fun EVP_MD_meth_set_update(md: CValuesRef<EVP_MD>?, update: CPointer<CFunction<(CPointer<EVP_MD_CTX>?, COpaquePointer?, size_t) -> Int>>?): Int {
    memScoped {
        return kniBridge1327(md?.getPointer(memScope).rawValue, update.rawValue)
    }
}

fun EVP_MD_meth_set_final(md: CValuesRef<EVP_MD>?, final: CPointer<CFunction<(CPointer<EVP_MD_CTX>?, CPointer<UByteVar>?) -> Int>>?): Int {
    memScoped {
        return kniBridge1328(md?.getPointer(memScope).rawValue, final.rawValue)
    }
}

fun EVP_MD_meth_set_copy(md: CValuesRef<EVP_MD>?, copy: CPointer<CFunction<(CPointer<EVP_MD_CTX>?, CPointer<EVP_MD_CTX>?) -> Int>>?): Int {
    memScoped {
        return kniBridge1329(md?.getPointer(memScope).rawValue, copy.rawValue)
    }
}

fun EVP_MD_meth_set_cleanup(md: CValuesRef<EVP_MD>?, cleanup: CPointer<CFunction<(CPointer<EVP_MD_CTX>?) -> Int>>?): Int {
    memScoped {
        return kniBridge1330(md?.getPointer(memScope).rawValue, cleanup.rawValue)
    }
}

fun EVP_MD_meth_set_ctrl(md: CValuesRef<EVP_MD>?, ctrl: CPointer<CFunction<(CPointer<EVP_MD_CTX>?, Int, Int, COpaquePointer?) -> Int>>?): Int {
    memScoped {
        return kniBridge1331(md?.getPointer(memScope).rawValue, ctrl.rawValue)
    }
}

fun EVP_MD_meth_get_input_blocksize(md: CValuesRef<EVP_MD>?): Int {
    memScoped {
        return kniBridge1332(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_meth_get_result_size(md: CValuesRef<EVP_MD>?): Int {
    memScoped {
        return kniBridge1333(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_meth_get_app_datasize(md: CValuesRef<EVP_MD>?): Int {
    memScoped {
        return kniBridge1334(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_meth_get_flags(md: CValuesRef<EVP_MD>?): ULong {
    memScoped {
        return kniBridge1335(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_meth_get_init(md: CValuesRef<EVP_MD>?): CPointer<CFunction<(CPointer<EVP_MD_CTX>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_MD_CTX>?) -> Int>>(kniBridge1336(md?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_meth_get_update(md: CValuesRef<EVP_MD>?): CPointer<CFunction<(CPointer<EVP_MD_CTX>?, COpaquePointer?, size_t) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_MD_CTX>?, COpaquePointer?, size_t) -> Int>>(kniBridge1337(md?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_meth_get_final(md: CValuesRef<EVP_MD>?): CPointer<CFunction<(CPointer<EVP_MD_CTX>?, CPointer<UByteVar>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_MD_CTX>?, CPointer<UByteVar>?) -> Int>>(kniBridge1338(md?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_meth_get_copy(md: CValuesRef<EVP_MD>?): CPointer<CFunction<(CPointer<EVP_MD_CTX>?, CPointer<EVP_MD_CTX>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_MD_CTX>?, CPointer<EVP_MD_CTX>?) -> Int>>(kniBridge1339(md?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_meth_get_cleanup(md: CValuesRef<EVP_MD>?): CPointer<CFunction<(CPointer<EVP_MD_CTX>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_MD_CTX>?) -> Int>>(kniBridge1340(md?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_meth_get_ctrl(md: CValuesRef<EVP_MD>?): CPointer<CFunction<(CPointer<EVP_MD_CTX>?, Int, Int, COpaquePointer?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_MD_CTX>?, Int, Int, COpaquePointer?) -> Int>>(kniBridge1341(md?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_meth_new(cipher_type: Int, block_size: Int, key_len: Int): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1342(cipher_type, block_size, key_len))
}

fun EVP_CIPHER_meth_dup(cipher: CValuesRef<EVP_CIPHER>?): CPointer<EVP_CIPHER>? {
    memScoped {
        return interpretCPointer<EVP_CIPHER>(kniBridge1343(cipher?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_meth_free(cipher: CValuesRef<EVP_CIPHER>?): Unit {
    memScoped {
        return kniBridge1344(cipher?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_meth_set_iv_length(cipher: CValuesRef<EVP_CIPHER>?, iv_len: Int): Int {
    memScoped {
        return kniBridge1345(cipher?.getPointer(memScope).rawValue, iv_len)
    }
}

fun EVP_CIPHER_meth_set_flags(cipher: CValuesRef<EVP_CIPHER>?, flags: ULong): Int {
    memScoped {
        return kniBridge1346(cipher?.getPointer(memScope).rawValue, flags)
    }
}

fun EVP_CIPHER_meth_set_impl_ctx_size(cipher: CValuesRef<EVP_CIPHER>?, ctx_size: Int): Int {
    memScoped {
        return kniBridge1347(cipher?.getPointer(memScope).rawValue, ctx_size)
    }
}

fun EVP_CIPHER_meth_set_init(cipher: CValuesRef<EVP_CIPHER>?, init: CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<UByteVar>?, CPointer<UByteVar>?, Int) -> Int>>?): Int {
    memScoped {
        return kniBridge1348(cipher?.getPointer(memScope).rawValue, init.rawValue)
    }
}

fun EVP_CIPHER_meth_set_do_cipher(cipher: CValuesRef<EVP_CIPHER>?, do_cipher: CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<UByteVar>?, CPointer<UByteVar>?, size_t) -> Int>>?): Int {
    memScoped {
        return kniBridge1349(cipher?.getPointer(memScope).rawValue, do_cipher.rawValue)
    }
}

fun EVP_CIPHER_meth_set_cleanup(cipher: CValuesRef<EVP_CIPHER>?, cleanup: CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?) -> Int>>?): Int {
    memScoped {
        return kniBridge1350(cipher?.getPointer(memScope).rawValue, cleanup.rawValue)
    }
}

fun EVP_CIPHER_meth_set_set_asn1_params(cipher: CValuesRef<EVP_CIPHER>?, set_asn1_parameters: CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<ASN1_TYPE>?) -> Int>>?): Int {
    memScoped {
        return kniBridge1351(cipher?.getPointer(memScope).rawValue, set_asn1_parameters.rawValue)
    }
}

fun EVP_CIPHER_meth_set_get_asn1_params(cipher: CValuesRef<EVP_CIPHER>?, get_asn1_parameters: CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<ASN1_TYPE>?) -> Int>>?): Int {
    memScoped {
        return kniBridge1352(cipher?.getPointer(memScope).rawValue, get_asn1_parameters.rawValue)
    }
}

fun EVP_CIPHER_meth_set_ctrl(cipher: CValuesRef<EVP_CIPHER>?, ctrl: CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, Int, Int, COpaquePointer?) -> Int>>?): Int {
    memScoped {
        return kniBridge1353(cipher?.getPointer(memScope).rawValue, ctrl.rawValue)
    }
}

fun EVP_CIPHER_meth_get_init(cipher: CValuesRef<EVP_CIPHER>?): CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<UByteVar>?, CPointer<UByteVar>?, Int) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<UByteVar>?, CPointer<UByteVar>?, Int) -> Int>>(kniBridge1354(cipher?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_meth_get_do_cipher(cipher: CValuesRef<EVP_CIPHER>?): CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<UByteVar>?, CPointer<UByteVar>?, size_t) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<UByteVar>?, CPointer<UByteVar>?, size_t) -> Int>>(kniBridge1355(cipher?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_meth_get_cleanup(cipher: CValuesRef<EVP_CIPHER>?): CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?) -> Int>>(kniBridge1356(cipher?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_meth_get_set_asn1_params(cipher: CValuesRef<EVP_CIPHER>?): CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<ASN1_TYPE>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<ASN1_TYPE>?) -> Int>>(kniBridge1357(cipher?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_meth_get_get_asn1_params(cipher: CValuesRef<EVP_CIPHER>?): CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<ASN1_TYPE>?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<ASN1_TYPE>?) -> Int>>(kniBridge1358(cipher?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_meth_get_ctrl(cipher: CValuesRef<EVP_CIPHER>?): CPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, Int, Int, COpaquePointer?) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_CIPHER_CTX>?, Int, Int, COpaquePointer?) -> Int>>(kniBridge1359(cipher?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_type(md: CValuesRef<EVP_MD>?): Int {
    memScoped {
        return kniBridge1360(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_pkey_type(md: CValuesRef<EVP_MD>?): Int {
    memScoped {
        return kniBridge1361(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_size(md: CValuesRef<EVP_MD>?): Int {
    memScoped {
        return kniBridge1362(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_block_size(md: CValuesRef<EVP_MD>?): Int {
    memScoped {
        return kniBridge1363(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_flags(md: CValuesRef<EVP_MD>?): ULong {
    memScoped {
        return kniBridge1364(md?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_CTX_md(ctx: CValuesRef<EVP_MD_CTX>?): CPointer<EVP_MD>? {
    memScoped {
        return interpretCPointer<EVP_MD>(kniBridge1365(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_CTX_update_fn(ctx: CValuesRef<EVP_MD_CTX>?): CPointer<CFunction<(CPointer<EVP_MD_CTX>?, COpaquePointer?, size_t) -> Int>>? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<EVP_MD_CTX>?, COpaquePointer?, size_t) -> Int>>(kniBridge1366(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_CTX_set_update_fn(ctx: CValuesRef<EVP_MD_CTX>?, update: CPointer<CFunction<(CPointer<EVP_MD_CTX>?, COpaquePointer?, size_t) -> Int>>?): Unit {
    memScoped {
        return kniBridge1367(ctx?.getPointer(memScope).rawValue, update.rawValue)
    }
}

fun EVP_MD_CTX_pkey_ctx(ctx: CValuesRef<EVP_MD_CTX>?): CPointer<EVP_PKEY_CTX>? {
    memScoped {
        return interpretCPointer<EVP_PKEY_CTX>(kniBridge1368(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_MD_CTX_md_data(ctx: CValuesRef<EVP_MD_CTX>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1369(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_nid(cipher: CValuesRef<EVP_CIPHER>?): Int {
    memScoped {
        return kniBridge1370(cipher?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_block_size(cipher: CValuesRef<EVP_CIPHER>?): Int {
    memScoped {
        return kniBridge1371(cipher?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_impl_ctx_size(cipher: CValuesRef<EVP_CIPHER>?): Int {
    memScoped {
        return kniBridge1372(cipher?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_key_length(cipher: CValuesRef<EVP_CIPHER>?): Int {
    memScoped {
        return kniBridge1373(cipher?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_iv_length(cipher: CValuesRef<EVP_CIPHER>?): Int {
    memScoped {
        return kniBridge1374(cipher?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_flags(cipher: CValuesRef<EVP_CIPHER>?): ULong {
    memScoped {
        return kniBridge1375(cipher?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_cipher(ctx: CValuesRef<EVP_CIPHER_CTX>?): CPointer<EVP_CIPHER>? {
    memScoped {
        return interpretCPointer<EVP_CIPHER>(kniBridge1376(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_CTX_encrypting(ctx: CValuesRef<EVP_CIPHER_CTX>?): Int {
    memScoped {
        return kniBridge1377(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_nid(ctx: CValuesRef<EVP_CIPHER_CTX>?): Int {
    memScoped {
        return kniBridge1378(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_block_size(ctx: CValuesRef<EVP_CIPHER_CTX>?): Int {
    memScoped {
        return kniBridge1379(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_key_length(ctx: CValuesRef<EVP_CIPHER_CTX>?): Int {
    memScoped {
        return kniBridge1380(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_iv_length(ctx: CValuesRef<EVP_CIPHER_CTX>?): Int {
    memScoped {
        return kniBridge1381(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_iv(ctx: CValuesRef<EVP_CIPHER_CTX>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge1382(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_CTX_original_iv(ctx: CValuesRef<EVP_CIPHER_CTX>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge1383(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_CTX_iv_noconst(ctx: CValuesRef<EVP_CIPHER_CTX>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge1384(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_CTX_buf_noconst(ctx: CValuesRef<EVP_CIPHER_CTX>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge1385(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_CTX_num(ctx: CValuesRef<EVP_CIPHER_CTX>?): Int {
    memScoped {
        return kniBridge1386(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_set_num(ctx: CValuesRef<EVP_CIPHER_CTX>?, num: Int): Unit {
    memScoped {
        return kniBridge1387(ctx?.getPointer(memScope).rawValue, num)
    }
}

fun EVP_CIPHER_CTX_copy(out: CValuesRef<EVP_CIPHER_CTX>?, `in`: CValuesRef<EVP_CIPHER_CTX>?): Int {
    memScoped {
        return kniBridge1388(out?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_get_app_data(ctx: CValuesRef<EVP_CIPHER_CTX>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1389(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_CTX_set_app_data(ctx: CValuesRef<EVP_CIPHER_CTX>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1390(ctx?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_get_cipher_data(ctx: CValuesRef<EVP_CIPHER_CTX>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1391(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_CTX_set_cipher_data(ctx: CValuesRef<EVP_CIPHER_CTX>?, cipher_data: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1392(ctx?.getPointer(memScope).rawValue, cipher_data?.getPointer(memScope).rawValue))
    }
}

fun EVP_Cipher(c: CValuesRef<EVP_CIPHER_CTX>?, out: CValuesRef<UByteVar>?, `in`: CValuesRef<UByteVar>?, inl: UInt): Int {
    memScoped {
        return kniBridge1393(c?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, inl)
    }
}

fun EVP_MD_CTX_ctrl(ctx: CValuesRef<EVP_MD_CTX>?, cmd: Int, p1: Int, p2: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge1394(ctx?.getPointer(memScope).rawValue, cmd, p1, p2?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_CTX_new(): CPointer<EVP_MD_CTX>? {
    return interpretCPointer<EVP_MD_CTX>(kniBridge1395())
}

fun EVP_MD_CTX_reset(ctx: CValuesRef<EVP_MD_CTX>?): Int {
    memScoped {
        return kniBridge1396(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_CTX_free(ctx: CValuesRef<EVP_MD_CTX>?): Unit {
    memScoped {
        return kniBridge1397(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_CTX_copy_ex(out: CValuesRef<EVP_MD_CTX>?, `in`: CValuesRef<EVP_MD_CTX>?): Int {
    memScoped {
        return kniBridge1398(out?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_CTX_set_flags(ctx: CValuesRef<EVP_MD_CTX>?, flags: Int): Unit {
    memScoped {
        return kniBridge1399(ctx?.getPointer(memScope).rawValue, flags)
    }
}

fun EVP_MD_CTX_clear_flags(ctx: CValuesRef<EVP_MD_CTX>?, flags: Int): Unit {
    memScoped {
        return kniBridge1400(ctx?.getPointer(memScope).rawValue, flags)
    }
}

fun EVP_MD_CTX_test_flags(ctx: CValuesRef<EVP_MD_CTX>?, flags: Int): Int {
    memScoped {
        return kniBridge1401(ctx?.getPointer(memScope).rawValue, flags)
    }
}

fun EVP_DigestInit_ex(ctx: CValuesRef<EVP_MD_CTX>?, type: CValuesRef<EVP_MD>?, impl: CValuesRef<ENGINE>?): Int {
    memScoped {
        return kniBridge1402(ctx?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue, impl?.getPointer(memScope).rawValue)
    }
}

fun EVP_DigestUpdate(ctx: CValuesRef<EVP_MD_CTX>?, d: CValuesRef<*>?, cnt: size_t): Int {
    memScoped {
        return kniBridge1403(ctx?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue, cnt)
    }
}

fun EVP_DigestFinal_ex(ctx: CValuesRef<EVP_MD_CTX>?, md: CValuesRef<UByteVar>?, s: CValuesRef<UIntVar>?): Int {
    memScoped {
        return kniBridge1404(ctx?.getPointer(memScope).rawValue, md?.getPointer(memScope).rawValue, s?.getPointer(memScope).rawValue)
    }
}

fun EVP_Digest(data: CValuesRef<*>?, count: size_t, md: CValuesRef<UByteVar>?, size: CValuesRef<UIntVar>?, type: CValuesRef<EVP_MD>?, impl: CValuesRef<ENGINE>?): Int {
    memScoped {
        return kniBridge1405(data?.getPointer(memScope).rawValue, count, md?.getPointer(memScope).rawValue, size?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue, impl?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_CTX_copy(out: CValuesRef<EVP_MD_CTX>?, `in`: CValuesRef<EVP_MD_CTX>?): Int {
    memScoped {
        return kniBridge1406(out?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue)
    }
}

fun EVP_DigestInit(ctx: CValuesRef<EVP_MD_CTX>?, type: CValuesRef<EVP_MD>?): Int {
    memScoped {
        return kniBridge1407(ctx?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue)
    }
}

fun EVP_DigestFinal(ctx: CValuesRef<EVP_MD_CTX>?, md: CValuesRef<UByteVar>?, s: CValuesRef<UIntVar>?): Int {
    memScoped {
        return kniBridge1408(ctx?.getPointer(memScope).rawValue, md?.getPointer(memScope).rawValue, s?.getPointer(memScope).rawValue)
    }
}

fun EVP_read_pw_string(buf: CValuesRef<ByteVar>?, length: Int, prompt: String?, verify: Int): Int {
    memScoped {
        return kniBridge1409(buf?.getPointer(memScope).rawValue, length, prompt?.cstr?.getPointer(memScope).rawValue, verify)
    }
}

fun EVP_read_pw_string_min(buf: CValuesRef<ByteVar>?, minlen: Int, maxlen: Int, prompt: String?, verify: Int): Int {
    memScoped {
        return kniBridge1410(buf?.getPointer(memScope).rawValue, minlen, maxlen, prompt?.cstr?.getPointer(memScope).rawValue, verify)
    }
}

fun EVP_set_pw_prompt(prompt: String?): Unit {
    memScoped {
        return kniBridge1411(prompt?.cstr?.getPointer(memScope).rawValue)
    }
}

fun EVP_get_pw_prompt(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge1412())
}

fun EVP_BytesToKey(type: CValuesRef<EVP_CIPHER>?, md: CValuesRef<EVP_MD>?, salt: CValuesRef<UByteVar>?, data: CValuesRef<UByteVar>?, datal: Int, count: Int, key: CValuesRef<UByteVar>?, iv: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge1413(type?.getPointer(memScope).rawValue, md?.getPointer(memScope).rawValue, salt?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, datal, count, key?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_set_flags(ctx: CValuesRef<EVP_CIPHER_CTX>?, flags: Int): Unit {
    memScoped {
        return kniBridge1414(ctx?.getPointer(memScope).rawValue, flags)
    }
}

fun EVP_CIPHER_CTX_clear_flags(ctx: CValuesRef<EVP_CIPHER_CTX>?, flags: Int): Unit {
    memScoped {
        return kniBridge1415(ctx?.getPointer(memScope).rawValue, flags)
    }
}

fun EVP_CIPHER_CTX_test_flags(ctx: CValuesRef<EVP_CIPHER_CTX>?, flags: Int): Int {
    memScoped {
        return kniBridge1416(ctx?.getPointer(memScope).rawValue, flags)
    }
}

fun EVP_EncryptInit(ctx: CValuesRef<EVP_CIPHER_CTX>?, cipher: CValuesRef<EVP_CIPHER>?, key: CValuesRef<UByteVar>?, iv: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge1417(ctx?.getPointer(memScope).rawValue, cipher?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue)
    }
}

fun EVP_EncryptInit_ex(ctx: CValuesRef<EVP_CIPHER_CTX>?, cipher: CValuesRef<EVP_CIPHER>?, impl: CValuesRef<ENGINE>?, key: CValuesRef<UByteVar>?, iv: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge1418(ctx?.getPointer(memScope).rawValue, cipher?.getPointer(memScope).rawValue, impl?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue)
    }
}

fun EVP_EncryptUpdate(ctx: CValuesRef<EVP_CIPHER_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?, `in`: CValuesRef<UByteVar>?, inl: Int): Int {
    memScoped {
        return kniBridge1419(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, inl)
    }
}

fun EVP_EncryptFinal_ex(ctx: CValuesRef<EVP_CIPHER_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1420(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_EncryptFinal(ctx: CValuesRef<EVP_CIPHER_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1421(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_DecryptInit(ctx: CValuesRef<EVP_CIPHER_CTX>?, cipher: CValuesRef<EVP_CIPHER>?, key: CValuesRef<UByteVar>?, iv: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge1422(ctx?.getPointer(memScope).rawValue, cipher?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue)
    }
}

fun EVP_DecryptInit_ex(ctx: CValuesRef<EVP_CIPHER_CTX>?, cipher: CValuesRef<EVP_CIPHER>?, impl: CValuesRef<ENGINE>?, key: CValuesRef<UByteVar>?, iv: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge1423(ctx?.getPointer(memScope).rawValue, cipher?.getPointer(memScope).rawValue, impl?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue)
    }
}

fun EVP_DecryptUpdate(ctx: CValuesRef<EVP_CIPHER_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?, `in`: CValuesRef<UByteVar>?, inl: Int): Int {
    memScoped {
        return kniBridge1424(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, inl)
    }
}

fun EVP_DecryptFinal(ctx: CValuesRef<EVP_CIPHER_CTX>?, outm: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1425(ctx?.getPointer(memScope).rawValue, outm?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_DecryptFinal_ex(ctx: CValuesRef<EVP_CIPHER_CTX>?, outm: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1426(ctx?.getPointer(memScope).rawValue, outm?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_CipherInit(ctx: CValuesRef<EVP_CIPHER_CTX>?, cipher: CValuesRef<EVP_CIPHER>?, key: CValuesRef<UByteVar>?, iv: CValuesRef<UByteVar>?, enc: Int): Int {
    memScoped {
        return kniBridge1427(ctx?.getPointer(memScope).rawValue, cipher?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue, enc)
    }
}

fun EVP_CipherInit_ex(ctx: CValuesRef<EVP_CIPHER_CTX>?, cipher: CValuesRef<EVP_CIPHER>?, impl: CValuesRef<ENGINE>?, key: CValuesRef<UByteVar>?, iv: CValuesRef<UByteVar>?, enc: Int): Int {
    memScoped {
        return kniBridge1428(ctx?.getPointer(memScope).rawValue, cipher?.getPointer(memScope).rawValue, impl?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue, enc)
    }
}

fun EVP_CipherUpdate(ctx: CValuesRef<EVP_CIPHER_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?, `in`: CValuesRef<UByteVar>?, inl: Int): Int {
    memScoped {
        return kniBridge1429(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, inl)
    }
}

fun EVP_CipherFinal(ctx: CValuesRef<EVP_CIPHER_CTX>?, outm: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1430(ctx?.getPointer(memScope).rawValue, outm?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_CipherFinal_ex(ctx: CValuesRef<EVP_CIPHER_CTX>?, outm: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1431(ctx?.getPointer(memScope).rawValue, outm?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_SignFinal(ctx: CValuesRef<EVP_MD_CTX>?, md: CValuesRef<UByteVar>?, s: CValuesRef<UIntVar>?, pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1432(ctx?.getPointer(memScope).rawValue, md?.getPointer(memScope).rawValue, s?.getPointer(memScope).rawValue, pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_VerifyFinal(ctx: CValuesRef<EVP_MD_CTX>?, sigbuf: CValuesRef<UByteVar>?, siglen: UInt, pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1433(ctx?.getPointer(memScope).rawValue, sigbuf?.getPointer(memScope).rawValue, siglen, pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_DigestSignInit(ctx: CValuesRef<EVP_MD_CTX>?, pctx: CValuesRef<CPointerVar<EVP_PKEY_CTX>>?, type: CValuesRef<EVP_MD>?, e: CValuesRef<ENGINE>?, pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1434(ctx?.getPointer(memScope).rawValue, pctx?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue, e?.getPointer(memScope).rawValue, pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_DigestSignFinal(ctx: CValuesRef<EVP_MD_CTX>?, sigret: CValuesRef<UByteVar>?, siglen: CValuesRef<size_tVar>?): Int {
    memScoped {
        return kniBridge1435(ctx?.getPointer(memScope).rawValue, sigret?.getPointer(memScope).rawValue, siglen?.getPointer(memScope).rawValue)
    }
}

fun EVP_DigestVerifyInit(ctx: CValuesRef<EVP_MD_CTX>?, pctx: CValuesRef<CPointerVar<EVP_PKEY_CTX>>?, type: CValuesRef<EVP_MD>?, e: CValuesRef<ENGINE>?, pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1436(ctx?.getPointer(memScope).rawValue, pctx?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue, e?.getPointer(memScope).rawValue, pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_DigestVerifyFinal(ctx: CValuesRef<EVP_MD_CTX>?, sig: CValuesRef<UByteVar>?, siglen: size_t): Int {
    memScoped {
        return kniBridge1437(ctx?.getPointer(memScope).rawValue, sig?.getPointer(memScope).rawValue, siglen)
    }
}

fun EVP_OpenInit(ctx: CValuesRef<EVP_CIPHER_CTX>?, type: CValuesRef<EVP_CIPHER>?, ek: CValuesRef<UByteVar>?, ekl: Int, iv: CValuesRef<UByteVar>?, priv: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1438(ctx?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue, ek?.getPointer(memScope).rawValue, ekl, iv?.getPointer(memScope).rawValue, priv?.getPointer(memScope).rawValue)
    }
}

fun EVP_OpenFinal(ctx: CValuesRef<EVP_CIPHER_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1439(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_SealInit(ctx: CValuesRef<EVP_CIPHER_CTX>?, type: CValuesRef<EVP_CIPHER>?, ek: CValuesRef<CPointerVar<UByteVar>>?, ekl: CValuesRef<IntVar>?, iv: CValuesRef<UByteVar>?, pubk: CValuesRef<CPointerVar<EVP_PKEY>>?, npubk: Int): Int {
    memScoped {
        return kniBridge1440(ctx?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue, ek?.getPointer(memScope).rawValue, ekl?.getPointer(memScope).rawValue, iv?.getPointer(memScope).rawValue, pubk?.getPointer(memScope).rawValue, npubk)
    }
}

fun EVP_SealFinal(ctx: CValuesRef<EVP_CIPHER_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1441(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_ENCODE_CTX_new(): CPointer<EVP_ENCODE_CTX>? {
    return interpretCPointer<EVP_ENCODE_CTX>(kniBridge1442())
}

fun EVP_ENCODE_CTX_free(ctx: CValuesRef<EVP_ENCODE_CTX>?): Unit {
    memScoped {
        return kniBridge1443(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_ENCODE_CTX_copy(dctx: CValuesRef<EVP_ENCODE_CTX>?, sctx: CValuesRef<EVP_ENCODE_CTX>?): Int {
    memScoped {
        return kniBridge1444(dctx?.getPointer(memScope).rawValue, sctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_ENCODE_CTX_num(ctx: CValuesRef<EVP_ENCODE_CTX>?): Int {
    memScoped {
        return kniBridge1445(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_EncodeInit(ctx: CValuesRef<EVP_ENCODE_CTX>?): Unit {
    memScoped {
        return kniBridge1446(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_EncodeUpdate(ctx: CValuesRef<EVP_ENCODE_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?, `in`: CValuesRef<UByteVar>?, inl: Int): Int {
    memScoped {
        return kniBridge1447(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, inl)
    }
}

fun EVP_EncodeFinal(ctx: CValuesRef<EVP_ENCODE_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge1448(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_EncodeBlock(t: CValuesRef<UByteVar>?, f: CValuesRef<UByteVar>?, n: Int): Int {
    memScoped {
        return kniBridge1449(t?.getPointer(memScope).rawValue, f?.getPointer(memScope).rawValue, n)
    }
}

fun EVP_DecodeInit(ctx: CValuesRef<EVP_ENCODE_CTX>?): Unit {
    memScoped {
        return kniBridge1450(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_DecodeUpdate(ctx: CValuesRef<EVP_ENCODE_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?, `in`: CValuesRef<UByteVar>?, inl: Int): Int {
    memScoped {
        return kniBridge1451(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, inl)
    }
}

fun EVP_DecodeFinal(ctx: CValuesRef<EVP_ENCODE_CTX>?, out: CValuesRef<UByteVar>?, outl: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1452(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outl?.getPointer(memScope).rawValue)
    }
}

fun EVP_DecodeBlock(t: CValuesRef<UByteVar>?, f: CValuesRef<UByteVar>?, n: Int): Int {
    memScoped {
        return kniBridge1453(t?.getPointer(memScope).rawValue, f?.getPointer(memScope).rawValue, n)
    }
}

fun EVP_CIPHER_CTX_new(): CPointer<EVP_CIPHER_CTX>? {
    return interpretCPointer<EVP_CIPHER_CTX>(kniBridge1454())
}

fun EVP_CIPHER_CTX_reset(c: CValuesRef<EVP_CIPHER_CTX>?): Int {
    memScoped {
        return kniBridge1455(c?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_free(c: CValuesRef<EVP_CIPHER_CTX>?): Unit {
    memScoped {
        return kniBridge1456(c?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_set_key_length(x: CValuesRef<EVP_CIPHER_CTX>?, keylen: Int): Int {
    memScoped {
        return kniBridge1457(x?.getPointer(memScope).rawValue, keylen)
    }
}

fun EVP_CIPHER_CTX_set_padding(c: CValuesRef<EVP_CIPHER_CTX>?, pad: Int): Int {
    memScoped {
        return kniBridge1458(c?.getPointer(memScope).rawValue, pad)
    }
}

fun EVP_CIPHER_CTX_ctrl(ctx: CValuesRef<EVP_CIPHER_CTX>?, type: Int, arg: Int, ptr: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge1459(ctx?.getPointer(memScope).rawValue, type, arg, ptr?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_CTX_rand_key(ctx: CValuesRef<EVP_CIPHER_CTX>?, key: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge1460(ctx?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue)
    }
}

fun BIO_f_md(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge1461())
}

fun BIO_f_base64(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge1462())
}

fun BIO_f_cipher(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge1463())
}

fun BIO_f_reliable(): CPointer<BIO_METHOD>? {
    return interpretCPointer<BIO_METHOD>(kniBridge1464())
}

fun BIO_set_cipher(b: CValuesRef<BIO>?, c: CValuesRef<EVP_CIPHER>?, k: CValuesRef<UByteVar>?, i: CValuesRef<UByteVar>?, enc: Int): Int {
    memScoped {
        return kniBridge1465(b?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue, k?.getPointer(memScope).rawValue, i?.getPointer(memScope).rawValue, enc)
    }
}

fun EVP_md_null(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1466())
}

fun EVP_md4(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1467())
}

fun EVP_md5(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1468())
}

fun EVP_md5_sha1(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1469())
}

fun EVP_blake2b512(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1470())
}

fun EVP_blake2s256(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1471())
}

fun EVP_sha1(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1472())
}

fun EVP_sha224(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1473())
}

fun EVP_sha256(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1474())
}

fun EVP_sha384(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1475())
}

fun EVP_sha512(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1476())
}

fun EVP_ripemd160(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1477())
}

fun EVP_whirlpool(): CPointer<EVP_MD>? {
    return interpretCPointer<EVP_MD>(kniBridge1478())
}

fun EVP_enc_null(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1479())
}

fun EVP_des_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1480())
}

fun EVP_des_ede(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1481())
}

fun EVP_des_ede3(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1482())
}

fun EVP_des_ede_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1483())
}

fun EVP_des_ede3_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1484())
}

fun EVP_des_cfb64(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1485())
}

fun EVP_des_cfb1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1486())
}

fun EVP_des_cfb8(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1487())
}

fun EVP_des_ede_cfb64(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1488())
}

fun EVP_des_ede3_cfb64(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1489())
}

fun EVP_des_ede3_cfb1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1490())
}

fun EVP_des_ede3_cfb8(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1491())
}

fun EVP_des_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1492())
}

fun EVP_des_ede_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1493())
}

fun EVP_des_ede3_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1494())
}

fun EVP_des_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1495())
}

fun EVP_des_ede_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1496())
}

fun EVP_des_ede3_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1497())
}

fun EVP_desx_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1498())
}

fun EVP_des_ede3_wrap(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1499())
}

fun EVP_rc4(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1500())
}

fun EVP_rc4_40(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1501())
}

fun EVP_rc4_hmac_md5(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1502())
}

fun EVP_rc2_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1503())
}

fun EVP_rc2_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1504())
}

fun EVP_rc2_40_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1505())
}

fun EVP_rc2_64_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1506())
}

fun EVP_rc2_cfb64(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1507())
}

fun EVP_rc2_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1508())
}

fun EVP_bf_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1509())
}

fun EVP_bf_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1510())
}

fun EVP_bf_cfb64(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1511())
}

fun EVP_bf_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1512())
}

fun EVP_cast5_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1513())
}

fun EVP_cast5_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1514())
}

fun EVP_cast5_cfb64(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1515())
}

fun EVP_cast5_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1516())
}

fun EVP_aes_128_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1517())
}

fun EVP_aes_128_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1518())
}

fun EVP_aes_128_cfb1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1519())
}

fun EVP_aes_128_cfb8(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1520())
}

fun EVP_aes_128_cfb128(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1521())
}

fun EVP_aes_128_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1522())
}

fun EVP_aes_128_ctr(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1523())
}

fun EVP_aes_128_ccm(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1524())
}

fun EVP_aes_128_gcm(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1525())
}

fun EVP_aes_128_xts(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1526())
}

fun EVP_aes_128_wrap(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1527())
}

fun EVP_aes_128_wrap_pad(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1528())
}

fun EVP_aes_128_ocb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1529())
}

fun EVP_aes_192_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1530())
}

fun EVP_aes_192_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1531())
}

fun EVP_aes_192_cfb1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1532())
}

fun EVP_aes_192_cfb8(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1533())
}

fun EVP_aes_192_cfb128(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1534())
}

fun EVP_aes_192_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1535())
}

fun EVP_aes_192_ctr(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1536())
}

fun EVP_aes_192_ccm(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1537())
}

fun EVP_aes_192_gcm(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1538())
}

fun EVP_aes_192_wrap(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1539())
}

fun EVP_aes_192_wrap_pad(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1540())
}

fun EVP_aes_192_ocb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1541())
}

fun EVP_aes_256_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1542())
}

fun EVP_aes_256_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1543())
}

fun EVP_aes_256_cfb1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1544())
}

fun EVP_aes_256_cfb8(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1545())
}

fun EVP_aes_256_cfb128(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1546())
}

fun EVP_aes_256_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1547())
}

fun EVP_aes_256_ctr(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1548())
}

fun EVP_aes_256_ccm(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1549())
}

fun EVP_aes_256_gcm(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1550())
}

fun EVP_aes_256_xts(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1551())
}

fun EVP_aes_256_wrap(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1552())
}

fun EVP_aes_256_wrap_pad(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1553())
}

fun EVP_aes_256_ocb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1554())
}

fun EVP_aes_128_cbc_hmac_sha1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1555())
}

fun EVP_aes_256_cbc_hmac_sha1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1556())
}

fun EVP_aes_128_cbc_hmac_sha256(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1557())
}

fun EVP_aes_256_cbc_hmac_sha256(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1558())
}

fun EVP_camellia_128_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1559())
}

fun EVP_camellia_128_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1560())
}

fun EVP_camellia_128_cfb1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1561())
}

fun EVP_camellia_128_cfb8(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1562())
}

fun EVP_camellia_128_cfb128(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1563())
}

fun EVP_camellia_128_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1564())
}

fun EVP_camellia_128_ctr(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1565())
}

fun EVP_camellia_192_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1566())
}

fun EVP_camellia_192_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1567())
}

fun EVP_camellia_192_cfb1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1568())
}

fun EVP_camellia_192_cfb8(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1569())
}

fun EVP_camellia_192_cfb128(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1570())
}

fun EVP_camellia_192_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1571())
}

fun EVP_camellia_192_ctr(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1572())
}

fun EVP_camellia_256_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1573())
}

fun EVP_camellia_256_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1574())
}

fun EVP_camellia_256_cfb1(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1575())
}

fun EVP_camellia_256_cfb8(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1576())
}

fun EVP_camellia_256_cfb128(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1577())
}

fun EVP_camellia_256_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1578())
}

fun EVP_camellia_256_ctr(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1579())
}

fun EVP_chacha20(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1580())
}

fun EVP_chacha20_poly1305(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1581())
}

fun EVP_seed_ecb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1582())
}

fun EVP_seed_cbc(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1583())
}

fun EVP_seed_cfb128(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1584())
}

fun EVP_seed_ofb(): CPointer<EVP_CIPHER>? {
    return interpretCPointer<EVP_CIPHER>(kniBridge1585())
}

fun EVP_add_cipher(cipher: CValuesRef<EVP_CIPHER>?): Int {
    memScoped {
        return kniBridge1586(cipher?.getPointer(memScope).rawValue)
    }
}

fun EVP_add_digest(digest: CValuesRef<EVP_MD>?): Int {
    memScoped {
        return kniBridge1587(digest?.getPointer(memScope).rawValue)
    }
}

fun EVP_get_cipherbyname(name: String?): CPointer<EVP_CIPHER>? {
    memScoped {
        return interpretCPointer<EVP_CIPHER>(kniBridge1588(name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun EVP_get_digestbyname(name: String?): CPointer<EVP_MD>? {
    memScoped {
        return interpretCPointer<EVP_MD>(kniBridge1589(name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun EVP_CIPHER_do_all(fn: CPointer<CFunction<(CPointer<EVP_CIPHER>?, CPointer<ByteVar>?, CPointer<ByteVar>?, COpaquePointer?) -> Unit>>?, arg: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1590(fn.rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_do_all_sorted(fn: CPointer<CFunction<(CPointer<EVP_CIPHER>?, CPointer<ByteVar>?, CPointer<ByteVar>?, COpaquePointer?) -> Unit>>?, arg: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1591(fn.rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_do_all(fn: CPointer<CFunction<(CPointer<EVP_MD>?, CPointer<ByteVar>?, CPointer<ByteVar>?, COpaquePointer?) -> Unit>>?, arg: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1592(fn.rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun EVP_MD_do_all_sorted(fn: CPointer<CFunction<(CPointer<EVP_MD>?, CPointer<ByteVar>?, CPointer<ByteVar>?, COpaquePointer?) -> Unit>>?, arg: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1593(fn.rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_decrypt_old(dec_key: CValuesRef<UByteVar>?, enc_key: CValuesRef<UByteVar>?, enc_key_len: Int, private_key: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1594(dec_key?.getPointer(memScope).rawValue, enc_key?.getPointer(memScope).rawValue, enc_key_len, private_key?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_encrypt_old(enc_key: CValuesRef<UByteVar>?, key: CValuesRef<UByteVar>?, key_len: Int, pub_key: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1595(enc_key?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, key_len, pub_key?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_type(type: Int): Int {
    return kniBridge1596(type)
}

fun EVP_PKEY_id(pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1597(pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_base_id(pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1598(pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_bits(pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1599(pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_security_bits(pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1600(pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_size(pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1601(pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_set_type(pkey: CValuesRef<EVP_PKEY>?, type: Int): Int {
    memScoped {
        return kniBridge1602(pkey?.getPointer(memScope).rawValue, type)
    }
}

fun EVP_PKEY_set_type_str(pkey: CValuesRef<EVP_PKEY>?, str: String?, len: Int): Int {
    memScoped {
        return kniBridge1603(pkey?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue, len)
    }
}

fun EVP_PKEY_set1_engine(pkey: CValuesRef<EVP_PKEY>?, e: CValuesRef<ENGINE>?): Int {
    memScoped {
        return kniBridge1604(pkey?.getPointer(memScope).rawValue, e?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_assign(pkey: CValuesRef<EVP_PKEY>?, type: Int, key: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge1605(pkey?.getPointer(memScope).rawValue, type, key?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_get0(pkey: CValuesRef<EVP_PKEY>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1606(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_get0_hmac(pkey: CValuesRef<EVP_PKEY>?, len: CValuesRef<size_tVar>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge1607(pkey?.getPointer(memScope).rawValue, len?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_set1_RSA(pkey: CValuesRef<EVP_PKEY>?, key: CValuesRef<rsa_st>?): Int {
    memScoped {
        return kniBridge1608(pkey?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_get0_RSA(pkey: CValuesRef<EVP_PKEY>?): CPointer<rsa_st>? {
    memScoped {
        return interpretCPointer<rsa_st>(kniBridge1609(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_get1_RSA(pkey: CValuesRef<EVP_PKEY>?): CPointer<rsa_st>? {
    memScoped {
        return interpretCPointer<rsa_st>(kniBridge1610(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_set1_DSA(pkey: CValuesRef<EVP_PKEY>?, key: CValuesRef<dsa_st>?): Int {
    memScoped {
        return kniBridge1611(pkey?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_get0_DSA(pkey: CValuesRef<EVP_PKEY>?): CPointer<dsa_st>? {
    memScoped {
        return interpretCPointer<dsa_st>(kniBridge1612(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_get1_DSA(pkey: CValuesRef<EVP_PKEY>?): CPointer<dsa_st>? {
    memScoped {
        return interpretCPointer<dsa_st>(kniBridge1613(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_set1_DH(pkey: CValuesRef<EVP_PKEY>?, key: CValuesRef<dh_st>?): Int {
    memScoped {
        return kniBridge1614(pkey?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_get0_DH(pkey: CValuesRef<EVP_PKEY>?): CPointer<dh_st>? {
    memScoped {
        return interpretCPointer<dh_st>(kniBridge1615(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_get1_DH(pkey: CValuesRef<EVP_PKEY>?): CPointer<dh_st>? {
    memScoped {
        return interpretCPointer<dh_st>(kniBridge1616(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_set1_EC_KEY(pkey: CValuesRef<EVP_PKEY>?, key: CValuesRef<ec_key_st>?): Int {
    memScoped {
        return kniBridge1617(pkey?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_get0_EC_KEY(pkey: CValuesRef<EVP_PKEY>?): CPointer<ec_key_st>? {
    memScoped {
        return interpretCPointer<ec_key_st>(kniBridge1618(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_get1_EC_KEY(pkey: CValuesRef<EVP_PKEY>?): CPointer<ec_key_st>? {
    memScoped {
        return interpretCPointer<ec_key_st>(kniBridge1619(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_new(): CPointer<EVP_PKEY>? {
    return interpretCPointer<EVP_PKEY>(kniBridge1620())
}

fun EVP_PKEY_up_ref(pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1621(pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_free(pkey: CValuesRef<EVP_PKEY>?): Unit {
    memScoped {
        return kniBridge1622(pkey?.getPointer(memScope).rawValue)
    }
}

fun d2i_PublicKey(type: Int, a: CValuesRef<CPointerVar<EVP_PKEY>>?, pp: CValuesRef<CPointerVar<UByteVar>>?, length: Long): CPointer<EVP_PKEY>? {
    memScoped {
        return interpretCPointer<EVP_PKEY>(kniBridge1623(type, a?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue, length))
    }
}

fun i2d_PublicKey(a: CValuesRef<EVP_PKEY>?, pp: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1624(a?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue)
    }
}

fun d2i_PrivateKey(type: Int, a: CValuesRef<CPointerVar<EVP_PKEY>>?, pp: CValuesRef<CPointerVar<UByteVar>>?, length: Long): CPointer<EVP_PKEY>? {
    memScoped {
        return interpretCPointer<EVP_PKEY>(kniBridge1625(type, a?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue, length))
    }
}

fun d2i_AutoPrivateKey(a: CValuesRef<CPointerVar<EVP_PKEY>>?, pp: CValuesRef<CPointerVar<UByteVar>>?, length: Long): CPointer<EVP_PKEY>? {
    memScoped {
        return interpretCPointer<EVP_PKEY>(kniBridge1626(a?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue, length))
    }
}

fun i2d_PrivateKey(a: CValuesRef<EVP_PKEY>?, pp: CValuesRef<CPointerVar<UByteVar>>?): Int {
    memScoped {
        return kniBridge1627(a?.getPointer(memScope).rawValue, pp?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_copy_parameters(to: CValuesRef<EVP_PKEY>?, from: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1628(to?.getPointer(memScope).rawValue, from?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_missing_parameters(pkey: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1629(pkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_save_parameters(pkey: CValuesRef<EVP_PKEY>?, mode: Int): Int {
    memScoped {
        return kniBridge1630(pkey?.getPointer(memScope).rawValue, mode)
    }
}

fun EVP_PKEY_cmp_parameters(a: CValuesRef<EVP_PKEY>?, b: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1631(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_cmp(a: CValuesRef<EVP_PKEY>?, b: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1632(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_print_public(out: CValuesRef<BIO>?, pkey: CValuesRef<EVP_PKEY>?, indent: Int, pctx: CValuesRef<ASN1_PCTX>?): Int {
    memScoped {
        return kniBridge1633(out?.getPointer(memScope).rawValue, pkey?.getPointer(memScope).rawValue, indent, pctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_print_private(out: CValuesRef<BIO>?, pkey: CValuesRef<EVP_PKEY>?, indent: Int, pctx: CValuesRef<ASN1_PCTX>?): Int {
    memScoped {
        return kniBridge1634(out?.getPointer(memScope).rawValue, pkey?.getPointer(memScope).rawValue, indent, pctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_print_params(out: CValuesRef<BIO>?, pkey: CValuesRef<EVP_PKEY>?, indent: Int, pctx: CValuesRef<ASN1_PCTX>?): Int {
    memScoped {
        return kniBridge1635(out?.getPointer(memScope).rawValue, pkey?.getPointer(memScope).rawValue, indent, pctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_get_default_digest_nid(pkey: CValuesRef<EVP_PKEY>?, pnid: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge1636(pkey?.getPointer(memScope).rawValue, pnid?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_set1_tls_encodedpoint(pkey: CValuesRef<EVP_PKEY>?, pt: CValuesRef<UByteVar>?, ptlen: size_t): Int {
    memScoped {
        return kniBridge1637(pkey?.getPointer(memScope).rawValue, pt?.getPointer(memScope).rawValue, ptlen)
    }
}

fun EVP_PKEY_get1_tls_encodedpoint(pkey: CValuesRef<EVP_PKEY>?, ppt: CValuesRef<CPointerVar<UByteVar>>?): size_t {
    memScoped {
        return kniBridge1638(pkey?.getPointer(memScope).rawValue, ppt?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_type(ctx: CValuesRef<EVP_CIPHER>?): Int {
    memScoped {
        return kniBridge1639(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_param_to_asn1(c: CValuesRef<EVP_CIPHER_CTX>?, type: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1640(c?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_asn1_to_param(c: CValuesRef<EVP_CIPHER_CTX>?, type: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1641(c?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_set_asn1_iv(c: CValuesRef<EVP_CIPHER_CTX>?, type: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1642(c?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue)
    }
}

fun EVP_CIPHER_get_asn1_iv(c: CValuesRef<EVP_CIPHER_CTX>?, type: CValuesRef<ASN1_TYPE>?): Int {
    memScoped {
        return kniBridge1643(c?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue)
    }
}

fun PKCS5_PBE_keyivgen(ctx: CValuesRef<EVP_CIPHER_CTX>?, pass: String?, passlen: Int, param: CValuesRef<ASN1_TYPE>?, cipher: CValuesRef<EVP_CIPHER>?, md: CValuesRef<EVP_MD>?, en_de: Int): Int {
    memScoped {
        return kniBridge1644(ctx?.getPointer(memScope).rawValue, pass?.cstr?.getPointer(memScope).rawValue, passlen, param?.getPointer(memScope).rawValue, cipher?.getPointer(memScope).rawValue, md?.getPointer(memScope).rawValue, en_de)
    }
}

fun PKCS5_PBKDF2_HMAC_SHA1(pass: String?, passlen: Int, salt: CValuesRef<UByteVar>?, saltlen: Int, iter: Int, keylen: Int, out: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge1645(pass?.cstr?.getPointer(memScope).rawValue, passlen, salt?.getPointer(memScope).rawValue, saltlen, iter, keylen, out?.getPointer(memScope).rawValue)
    }
}

fun PKCS5_PBKDF2_HMAC(pass: String?, passlen: Int, salt: CValuesRef<UByteVar>?, saltlen: Int, iter: Int, digest: CValuesRef<EVP_MD>?, keylen: Int, out: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge1646(pass?.cstr?.getPointer(memScope).rawValue, passlen, salt?.getPointer(memScope).rawValue, saltlen, iter, digest?.getPointer(memScope).rawValue, keylen, out?.getPointer(memScope).rawValue)
    }
}

fun PKCS5_v2_PBE_keyivgen(ctx: CValuesRef<EVP_CIPHER_CTX>?, pass: String?, passlen: Int, param: CValuesRef<ASN1_TYPE>?, cipher: CValuesRef<EVP_CIPHER>?, md: CValuesRef<EVP_MD>?, en_de: Int): Int {
    memScoped {
        return kniBridge1647(ctx?.getPointer(memScope).rawValue, pass?.cstr?.getPointer(memScope).rawValue, passlen, param?.getPointer(memScope).rawValue, cipher?.getPointer(memScope).rawValue, md?.getPointer(memScope).rawValue, en_de)
    }
}

fun EVP_PBE_scrypt(pass: String?, passlen: size_t, salt: CValuesRef<UByteVar>?, saltlen: size_t, N: uint64_t, r: uint64_t, p: uint64_t, maxmem: uint64_t, key: CValuesRef<UByteVar>?, keylen: size_t): Int {
    memScoped {
        return kniBridge1648(pass?.cstr?.getPointer(memScope).rawValue, passlen, salt?.getPointer(memScope).rawValue, saltlen, N, r, p, maxmem, key?.getPointer(memScope).rawValue, keylen)
    }
}

fun PKCS5_v2_scrypt_keyivgen(ctx: CValuesRef<EVP_CIPHER_CTX>?, pass: String?, passlen: Int, param: CValuesRef<ASN1_TYPE>?, c: CValuesRef<EVP_CIPHER>?, md: CValuesRef<EVP_MD>?, en_de: Int): Int {
    memScoped {
        return kniBridge1649(ctx?.getPointer(memScope).rawValue, pass?.cstr?.getPointer(memScope).rawValue, passlen, param?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue, md?.getPointer(memScope).rawValue, en_de)
    }
}

fun PKCS5_PBE_add(): Unit {
    return kniBridge1650()
}

fun EVP_PBE_CipherInit(pbe_obj: CValuesRef<ASN1_OBJECT>?, pass: String?, passlen: Int, param: CValuesRef<ASN1_TYPE>?, ctx: CValuesRef<EVP_CIPHER_CTX>?, en_de: Int): Int {
    memScoped {
        return kniBridge1651(pbe_obj?.getPointer(memScope).rawValue, pass?.cstr?.getPointer(memScope).rawValue, passlen, param?.getPointer(memScope).rawValue, ctx?.getPointer(memScope).rawValue, en_de)
    }
}

fun EVP_PBE_alg_add_type(pbe_type: Int, pbe_nid: Int, cipher_nid: Int, md_nid: Int, keygen: CPointer<EVP_PBE_KEYGEN>?): Int {
    return kniBridge1652(pbe_type, pbe_nid, cipher_nid, md_nid, keygen.rawValue)
}

fun EVP_PBE_alg_add(nid: Int, cipher: CValuesRef<EVP_CIPHER>?, md: CValuesRef<EVP_MD>?, keygen: CPointer<EVP_PBE_KEYGEN>?): Int {
    memScoped {
        return kniBridge1653(nid, cipher?.getPointer(memScope).rawValue, md?.getPointer(memScope).rawValue, keygen.rawValue)
    }
}

fun EVP_PBE_find(type: Int, pbe_nid: Int, pcnid: CValuesRef<IntVar>?, pmnid: CValuesRef<IntVar>?, pkeygen: CValuesRef<CPointerVar<EVP_PBE_KEYGEN>>?): Int {
    memScoped {
        return kniBridge1654(type, pbe_nid, pcnid?.getPointer(memScope).rawValue, pmnid?.getPointer(memScope).rawValue, pkeygen?.getPointer(memScope).rawValue)
    }
}

fun EVP_PBE_cleanup(): Unit {
    return kniBridge1655()
}

fun EVP_PBE_get(ptype: CValuesRef<IntVar>?, ppbe_nid: CValuesRef<IntVar>?, num: size_t): Int {
    memScoped {
        return kniBridge1656(ptype?.getPointer(memScope).rawValue, ppbe_nid?.getPointer(memScope).rawValue, num)
    }
}

fun EVP_PKEY_asn1_get_count(): Int {
    return kniBridge1657()
}

fun EVP_PKEY_asn1_get0(idx: Int): CPointer<EVP_PKEY_ASN1_METHOD>? {
    return interpretCPointer<EVP_PKEY_ASN1_METHOD>(kniBridge1658(idx))
}

fun EVP_PKEY_asn1_find(pe: CValuesRef<CPointerVar<ENGINE>>?, type: Int): CPointer<EVP_PKEY_ASN1_METHOD>? {
    memScoped {
        return interpretCPointer<EVP_PKEY_ASN1_METHOD>(kniBridge1659(pe?.getPointer(memScope).rawValue, type))
    }
}

fun EVP_PKEY_asn1_find_str(pe: CValuesRef<CPointerVar<ENGINE>>?, str: String?, len: Int): CPointer<EVP_PKEY_ASN1_METHOD>? {
    memScoped {
        return interpretCPointer<EVP_PKEY_ASN1_METHOD>(kniBridge1660(pe?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue, len))
    }
}

fun EVP_PKEY_asn1_add0(ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?): Int {
    memScoped {
        return kniBridge1661(ameth?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_asn1_add_alias(to: Int, from: Int): Int {
    return kniBridge1662(to, from)
}

fun EVP_PKEY_asn1_get0_info(ppkey_id: CValuesRef<IntVar>?, pkey_base_id: CValuesRef<IntVar>?, ppkey_flags: CValuesRef<IntVar>?, pinfo: CValuesRef<CPointerVar<ByteVar>>?, ppem_str: CValuesRef<CPointerVar<ByteVar>>?, ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?): Int {
    memScoped {
        return kniBridge1663(ppkey_id?.getPointer(memScope).rawValue, pkey_base_id?.getPointer(memScope).rawValue, ppkey_flags?.getPointer(memScope).rawValue, pinfo?.getPointer(memScope).rawValue, ppem_str?.getPointer(memScope).rawValue, ameth?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_get0_asn1(pkey: CValuesRef<EVP_PKEY>?): CPointer<EVP_PKEY_ASN1_METHOD>? {
    memScoped {
        return interpretCPointer<EVP_PKEY_ASN1_METHOD>(kniBridge1664(pkey?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_asn1_new(id: Int, flags: Int, pem_str: String?, info: String?): CPointer<EVP_PKEY_ASN1_METHOD>? {
    memScoped {
        return interpretCPointer<EVP_PKEY_ASN1_METHOD>(kniBridge1665(id, flags, pem_str?.cstr?.getPointer(memScope).rawValue, info?.cstr?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_asn1_copy(dst: CValuesRef<EVP_PKEY_ASN1_METHOD>?, src: CValuesRef<EVP_PKEY_ASN1_METHOD>?): Unit {
    memScoped {
        return kniBridge1666(dst?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_asn1_free(ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?): Unit {
    memScoped {
        return kniBridge1667(ameth?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_asn1_set_public(ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?, pub_decode: CPointer<CFunction<(CPointer<EVP_PKEY>?, CPointer<X509_PUBKEY>?) -> Int>>?, pub_encode: CPointer<CFunction<(CPointer<X509_PUBKEY>?, CPointer<EVP_PKEY>?) -> Int>>?, pub_cmp: CPointer<CFunction<(CPointer<EVP_PKEY>?, CPointer<EVP_PKEY>?) -> Int>>?, pub_print: CPointer<CFunction<(CPointer<BIO>?, CPointer<EVP_PKEY>?, Int, CPointer<ASN1_PCTX>?) -> Int>>?, pkey_size: CPointer<CFunction<(CPointer<EVP_PKEY>?) -> Int>>?, pkey_bits: CPointer<CFunction<(CPointer<EVP_PKEY>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1668(ameth?.getPointer(memScope).rawValue, pub_decode.rawValue, pub_encode.rawValue, pub_cmp.rawValue, pub_print.rawValue, pkey_size.rawValue, pkey_bits.rawValue)
    }
}

fun EVP_PKEY_asn1_set_private(ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?, priv_decode: CPointer<CFunction<(CPointer<EVP_PKEY>?, CPointer<PKCS8_PRIV_KEY_INFO>?) -> Int>>?, priv_encode: CPointer<CFunction<(CPointer<PKCS8_PRIV_KEY_INFO>?, CPointer<EVP_PKEY>?) -> Int>>?, priv_print: CPointer<CFunction<(CPointer<BIO>?, CPointer<EVP_PKEY>?, Int, CPointer<ASN1_PCTX>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1669(ameth?.getPointer(memScope).rawValue, priv_decode.rawValue, priv_encode.rawValue, priv_print.rawValue)
    }
}

fun EVP_PKEY_asn1_set_param(ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?, param_decode: CPointer<CFunction<(CPointer<EVP_PKEY>?, CPointer<CPointerVar<UByteVar>>?, Int) -> Int>>?, param_encode: CPointer<CFunction<(CPointer<EVP_PKEY>?, CPointer<CPointerVar<UByteVar>>?) -> Int>>?, param_missing: CPointer<CFunction<(CPointer<EVP_PKEY>?) -> Int>>?, param_copy: CPointer<CFunction<(CPointer<EVP_PKEY>?, CPointer<EVP_PKEY>?) -> Int>>?, param_cmp: CPointer<CFunction<(CPointer<EVP_PKEY>?, CPointer<EVP_PKEY>?) -> Int>>?, param_print: CPointer<CFunction<(CPointer<BIO>?, CPointer<EVP_PKEY>?, Int, CPointer<ASN1_PCTX>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1670(ameth?.getPointer(memScope).rawValue, param_decode.rawValue, param_encode.rawValue, param_missing.rawValue, param_copy.rawValue, param_cmp.rawValue, param_print.rawValue)
    }
}

fun EVP_PKEY_asn1_set_free(ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?, pkey_free: CPointer<CFunction<(CPointer<EVP_PKEY>?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge1671(ameth?.getPointer(memScope).rawValue, pkey_free.rawValue)
    }
}

fun EVP_PKEY_asn1_set_ctrl(ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?, pkey_ctrl: CPointer<CFunction<(CPointer<EVP_PKEY>?, Int, Long, COpaquePointer?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1672(ameth?.getPointer(memScope).rawValue, pkey_ctrl.rawValue)
    }
}

fun EVP_PKEY_asn1_set_item(ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?, item_verify: CPointer<CFunction<(CPointer<EVP_MD_CTX>?, CPointer<ASN1_ITEM>?, COpaquePointer?, CPointer<X509_ALGOR>?, CPointer<ASN1_BIT_STRING>?, CPointer<EVP_PKEY>?) -> Int>>?, item_sign: CPointer<CFunction<(CPointer<EVP_MD_CTX>?, CPointer<ASN1_ITEM>?, COpaquePointer?, CPointer<X509_ALGOR>?, CPointer<X509_ALGOR>?, CPointer<ASN1_BIT_STRING>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1673(ameth?.getPointer(memScope).rawValue, item_verify.rawValue, item_sign.rawValue)
    }
}

fun EVP_PKEY_asn1_set_security_bits(ameth: CValuesRef<EVP_PKEY_ASN1_METHOD>?, pkey_security_bits: CPointer<CFunction<(CPointer<EVP_PKEY>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1674(ameth?.getPointer(memScope).rawValue, pkey_security_bits.rawValue)
    }
}

fun EVP_PKEY_meth_find(type: Int): CPointer<EVP_PKEY_METHOD>? {
    return interpretCPointer<EVP_PKEY_METHOD>(kniBridge1675(type))
}

fun EVP_PKEY_meth_new(id: Int, flags: Int): CPointer<EVP_PKEY_METHOD>? {
    return interpretCPointer<EVP_PKEY_METHOD>(kniBridge1676(id, flags))
}

fun EVP_PKEY_meth_get0_info(ppkey_id: CValuesRef<IntVar>?, pflags: CValuesRef<IntVar>?, meth: CValuesRef<EVP_PKEY_METHOD>?): Unit {
    memScoped {
        return kniBridge1677(ppkey_id?.getPointer(memScope).rawValue, pflags?.getPointer(memScope).rawValue, meth?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_copy(dst: CValuesRef<EVP_PKEY_METHOD>?, src: CValuesRef<EVP_PKEY_METHOD>?): Unit {
    memScoped {
        return kniBridge1678(dst?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_free(pmeth: CValuesRef<EVP_PKEY_METHOD>?): Unit {
    memScoped {
        return kniBridge1679(pmeth?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_add0(pmeth: CValuesRef<EVP_PKEY_METHOD>?): Int {
    memScoped {
        return kniBridge1680(pmeth?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_new(pkey: CValuesRef<EVP_PKEY>?, e: CValuesRef<ENGINE>?): CPointer<EVP_PKEY_CTX>? {
    memScoped {
        return interpretCPointer<EVP_PKEY_CTX>(kniBridge1681(pkey?.getPointer(memScope).rawValue, e?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_CTX_new_id(id: Int, e: CValuesRef<ENGINE>?): CPointer<EVP_PKEY_CTX>? {
    memScoped {
        return interpretCPointer<EVP_PKEY_CTX>(kniBridge1682(id, e?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_CTX_dup(ctx: CValuesRef<EVP_PKEY_CTX>?): CPointer<EVP_PKEY_CTX>? {
    memScoped {
        return interpretCPointer<EVP_PKEY_CTX>(kniBridge1683(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_CTX_free(ctx: CValuesRef<EVP_PKEY_CTX>?): Unit {
    memScoped {
        return kniBridge1684(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_ctrl(ctx: CValuesRef<EVP_PKEY_CTX>?, keytype: Int, optype: Int, cmd: Int, p1: Int, p2: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge1685(ctx?.getPointer(memScope).rawValue, keytype, optype, cmd, p1, p2?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_ctrl_str(ctx: CValuesRef<EVP_PKEY_CTX>?, type: String?, value: String?): Int {
    memScoped {
        return kniBridge1686(ctx?.getPointer(memScope).rawValue, type?.cstr?.getPointer(memScope).rawValue, value?.cstr?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_str2ctrl(ctx: CValuesRef<EVP_PKEY_CTX>?, cmd: Int, str: String?): Int {
    memScoped {
        return kniBridge1687(ctx?.getPointer(memScope).rawValue, cmd, str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_hex2ctrl(ctx: CValuesRef<EVP_PKEY_CTX>?, cmd: Int, hex: String?): Int {
    memScoped {
        return kniBridge1688(ctx?.getPointer(memScope).rawValue, cmd, hex?.cstr?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_get_operation(ctx: CValuesRef<EVP_PKEY_CTX>?): Int {
    memScoped {
        return kniBridge1689(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_set0_keygen_info(ctx: CValuesRef<EVP_PKEY_CTX>?, dat: CValuesRef<IntVar>?, datlen: Int): Unit {
    memScoped {
        return kniBridge1690(ctx?.getPointer(memScope).rawValue, dat?.getPointer(memScope).rawValue, datlen)
    }
}

fun EVP_PKEY_new_mac_key(type: Int, e: CValuesRef<ENGINE>?, key: CValuesRef<UByteVar>?, keylen: Int): CPointer<EVP_PKEY>? {
    memScoped {
        return interpretCPointer<EVP_PKEY>(kniBridge1691(type, e?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, keylen))
    }
}

fun EVP_PKEY_CTX_set_data(ctx: CValuesRef<EVP_PKEY_CTX>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1692(ctx?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_get_data(ctx: CValuesRef<EVP_PKEY_CTX>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1693(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_CTX_get0_pkey(ctx: CValuesRef<EVP_PKEY_CTX>?): CPointer<EVP_PKEY>? {
    memScoped {
        return interpretCPointer<EVP_PKEY>(kniBridge1694(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_CTX_get0_peerkey(ctx: CValuesRef<EVP_PKEY_CTX>?): CPointer<EVP_PKEY>? {
    memScoped {
        return interpretCPointer<EVP_PKEY>(kniBridge1695(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_CTX_set_app_data(ctx: CValuesRef<EVP_PKEY_CTX>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1696(ctx?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_get_app_data(ctx: CValuesRef<EVP_PKEY_CTX>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1697(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_sign_init(ctx: CValuesRef<EVP_PKEY_CTX>?): Int {
    memScoped {
        return kniBridge1698(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_sign(ctx: CValuesRef<EVP_PKEY_CTX>?, sig: CValuesRef<UByteVar>?, siglen: CValuesRef<size_tVar>?, tbs: CValuesRef<UByteVar>?, tbslen: size_t): Int {
    memScoped {
        return kniBridge1699(ctx?.getPointer(memScope).rawValue, sig?.getPointer(memScope).rawValue, siglen?.getPointer(memScope).rawValue, tbs?.getPointer(memScope).rawValue, tbslen)
    }
}

fun EVP_PKEY_verify_init(ctx: CValuesRef<EVP_PKEY_CTX>?): Int {
    memScoped {
        return kniBridge1700(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_verify(ctx: CValuesRef<EVP_PKEY_CTX>?, sig: CValuesRef<UByteVar>?, siglen: size_t, tbs: CValuesRef<UByteVar>?, tbslen: size_t): Int {
    memScoped {
        return kniBridge1701(ctx?.getPointer(memScope).rawValue, sig?.getPointer(memScope).rawValue, siglen, tbs?.getPointer(memScope).rawValue, tbslen)
    }
}

fun EVP_PKEY_verify_recover_init(ctx: CValuesRef<EVP_PKEY_CTX>?): Int {
    memScoped {
        return kniBridge1702(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_verify_recover(ctx: CValuesRef<EVP_PKEY_CTX>?, rout: CValuesRef<UByteVar>?, routlen: CValuesRef<size_tVar>?, sig: CValuesRef<UByteVar>?, siglen: size_t): Int {
    memScoped {
        return kniBridge1703(ctx?.getPointer(memScope).rawValue, rout?.getPointer(memScope).rawValue, routlen?.getPointer(memScope).rawValue, sig?.getPointer(memScope).rawValue, siglen)
    }
}

fun EVP_PKEY_encrypt_init(ctx: CValuesRef<EVP_PKEY_CTX>?): Int {
    memScoped {
        return kniBridge1704(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_encrypt(ctx: CValuesRef<EVP_PKEY_CTX>?, out: CValuesRef<UByteVar>?, outlen: CValuesRef<size_tVar>?, `in`: CValuesRef<UByteVar>?, inlen: size_t): Int {
    memScoped {
        return kniBridge1705(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outlen?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, inlen)
    }
}

fun EVP_PKEY_decrypt_init(ctx: CValuesRef<EVP_PKEY_CTX>?): Int {
    memScoped {
        return kniBridge1706(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_decrypt(ctx: CValuesRef<EVP_PKEY_CTX>?, out: CValuesRef<UByteVar>?, outlen: CValuesRef<size_tVar>?, `in`: CValuesRef<UByteVar>?, inlen: size_t): Int {
    memScoped {
        return kniBridge1707(ctx?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue, outlen?.getPointer(memScope).rawValue, `in`?.getPointer(memScope).rawValue, inlen)
    }
}

fun EVP_PKEY_derive_init(ctx: CValuesRef<EVP_PKEY_CTX>?): Int {
    memScoped {
        return kniBridge1708(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_derive_set_peer(ctx: CValuesRef<EVP_PKEY_CTX>?, peer: CValuesRef<EVP_PKEY>?): Int {
    memScoped {
        return kniBridge1709(ctx?.getPointer(memScope).rawValue, peer?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_derive(ctx: CValuesRef<EVP_PKEY_CTX>?, key: CValuesRef<UByteVar>?, keylen: CValuesRef<size_tVar>?): Int {
    memScoped {
        return kniBridge1710(ctx?.getPointer(memScope).rawValue, key?.getPointer(memScope).rawValue, keylen?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_paramgen_init(ctx: CValuesRef<EVP_PKEY_CTX>?): Int {
    memScoped {
        return kniBridge1711(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_paramgen(ctx: CValuesRef<EVP_PKEY_CTX>?, ppkey: CValuesRef<CPointerVar<EVP_PKEY>>?): Int {
    memScoped {
        return kniBridge1712(ctx?.getPointer(memScope).rawValue, ppkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_keygen_init(ctx: CValuesRef<EVP_PKEY_CTX>?): Int {
    memScoped {
        return kniBridge1713(ctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_keygen(ctx: CValuesRef<EVP_PKEY_CTX>?, ppkey: CValuesRef<CPointerVar<EVP_PKEY>>?): Int {
    memScoped {
        return kniBridge1714(ctx?.getPointer(memScope).rawValue, ppkey?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_CTX_set_cb(ctx: CValuesRef<EVP_PKEY_CTX>?, cb: CPointer<EVP_PKEY_gen_cb>?): Unit {
    memScoped {
        return kniBridge1715(ctx?.getPointer(memScope).rawValue, cb.rawValue)
    }
}

fun EVP_PKEY_CTX_get_cb(ctx: CValuesRef<EVP_PKEY_CTX>?): CPointer<EVP_PKEY_gen_cb>? {
    memScoped {
        return interpretCPointer<EVP_PKEY_gen_cb>(kniBridge1716(ctx?.getPointer(memScope).rawValue))
    }
}

fun EVP_PKEY_CTX_get_keygen_info(ctx: CValuesRef<EVP_PKEY_CTX>?, idx: Int): Int {
    memScoped {
        return kniBridge1717(ctx?.getPointer(memScope).rawValue, idx)
    }
}

fun EVP_PKEY_meth_set_init(pmeth: CValuesRef<EVP_PKEY_METHOD>?, init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1718(pmeth?.getPointer(memScope).rawValue, init.rawValue)
    }
}

fun EVP_PKEY_meth_set_copy(pmeth: CValuesRef<EVP_PKEY_METHOD>?, copy: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_PKEY_CTX>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1719(pmeth?.getPointer(memScope).rawValue, copy.rawValue)
    }
}

fun EVP_PKEY_meth_set_cleanup(pmeth: CValuesRef<EVP_PKEY_METHOD>?, cleanup: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge1720(pmeth?.getPointer(memScope).rawValue, cleanup.rawValue)
    }
}

fun EVP_PKEY_meth_set_paramgen(pmeth: CValuesRef<EVP_PKEY_METHOD>?, paramgen_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>?, paramgen: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_PKEY>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1721(pmeth?.getPointer(memScope).rawValue, paramgen_init.rawValue, paramgen.rawValue)
    }
}

fun EVP_PKEY_meth_set_keygen(pmeth: CValuesRef<EVP_PKEY_METHOD>?, keygen_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>?, keygen: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_PKEY>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1722(pmeth?.getPointer(memScope).rawValue, keygen_init.rawValue, keygen.rawValue)
    }
}

fun EVP_PKEY_meth_set_sign(pmeth: CValuesRef<EVP_PKEY_METHOD>?, sign_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>?, sign: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<UByteVar>?, size_t) -> Int>>?): Unit {
    memScoped {
        return kniBridge1723(pmeth?.getPointer(memScope).rawValue, sign_init.rawValue, sign.rawValue)
    }
}

fun EVP_PKEY_meth_set_verify(pmeth: CValuesRef<EVP_PKEY_METHOD>?, verify_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>?, verify: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, size_t, CPointer<UByteVar>?, size_t) -> Int>>?): Unit {
    memScoped {
        return kniBridge1724(pmeth?.getPointer(memScope).rawValue, verify_init.rawValue, verify.rawValue)
    }
}

fun EVP_PKEY_meth_set_verify_recover(pmeth: CValuesRef<EVP_PKEY_METHOD>?, verify_recover_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>?, verify_recover: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<UByteVar>?, size_t) -> Int>>?): Unit {
    memScoped {
        return kniBridge1725(pmeth?.getPointer(memScope).rawValue, verify_recover_init.rawValue, verify_recover.rawValue)
    }
}

fun EVP_PKEY_meth_set_signctx(pmeth: CValuesRef<EVP_PKEY_METHOD>?, signctx_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_MD_CTX>?) -> Int>>?, signctx: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<EVP_MD_CTX>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1726(pmeth?.getPointer(memScope).rawValue, signctx_init.rawValue, signctx.rawValue)
    }
}

fun EVP_PKEY_meth_set_verifyctx(pmeth: CValuesRef<EVP_PKEY_METHOD>?, verifyctx_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_MD_CTX>?) -> Int>>?, verifyctx: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, Int, CPointer<EVP_MD_CTX>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1727(pmeth?.getPointer(memScope).rawValue, verifyctx_init.rawValue, verifyctx.rawValue)
    }
}

fun EVP_PKEY_meth_set_encrypt(pmeth: CValuesRef<EVP_PKEY_METHOD>?, encrypt_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>?, encryptfn: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<UByteVar>?, size_t) -> Int>>?): Unit {
    memScoped {
        return kniBridge1728(pmeth?.getPointer(memScope).rawValue, encrypt_init.rawValue, encryptfn.rawValue)
    }
}

fun EVP_PKEY_meth_set_decrypt(pmeth: CValuesRef<EVP_PKEY_METHOD>?, decrypt_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>?, decrypt: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<UByteVar>?, size_t) -> Int>>?): Unit {
    memScoped {
        return kniBridge1729(pmeth?.getPointer(memScope).rawValue, decrypt_init.rawValue, decrypt.rawValue)
    }
}

fun EVP_PKEY_meth_set_derive(pmeth: CValuesRef<EVP_PKEY_METHOD>?, derive_init: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>?, derive: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1730(pmeth?.getPointer(memScope).rawValue, derive_init.rawValue, derive.rawValue)
    }
}

fun EVP_PKEY_meth_set_ctrl(pmeth: CValuesRef<EVP_PKEY_METHOD>?, ctrl: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, Int, Int, COpaquePointer?) -> Int>>?, ctrl_str: CPointer<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>?): Unit {
    memScoped {
        return kniBridge1731(pmeth?.getPointer(memScope).rawValue, ctrl.rawValue, ctrl_str.rawValue)
    }
}

fun EVP_PKEY_meth_get_init(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pinit: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1732(pmeth?.getPointer(memScope).rawValue, pinit?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_copy(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pcopy: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_PKEY_CTX>?) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1733(pmeth?.getPointer(memScope).rawValue, pcopy?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_cleanup(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pcleanup: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Unit>>>?): Unit {
    memScoped {
        return kniBridge1734(pmeth?.getPointer(memScope).rawValue, pcleanup?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_paramgen(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pparamgen_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>>?, pparamgen: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_PKEY>?) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1735(pmeth?.getPointer(memScope).rawValue, pparamgen_init?.getPointer(memScope).rawValue, pparamgen?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_keygen(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pkeygen_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>>?, pkeygen: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_PKEY>?) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1736(pmeth?.getPointer(memScope).rawValue, pkeygen_init?.getPointer(memScope).rawValue, pkeygen?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_sign(pmeth: CValuesRef<EVP_PKEY_METHOD>?, psign_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>>?, psign: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<UByteVar>?, size_t) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1737(pmeth?.getPointer(memScope).rawValue, psign_init?.getPointer(memScope).rawValue, psign?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_verify(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pverify_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>>?, pverify: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, size_t, CPointer<UByteVar>?, size_t) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1738(pmeth?.getPointer(memScope).rawValue, pverify_init?.getPointer(memScope).rawValue, pverify?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_verify_recover(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pverify_recover_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>>?, pverify_recover: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<UByteVar>?, size_t) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1739(pmeth?.getPointer(memScope).rawValue, pverify_recover_init?.getPointer(memScope).rawValue, pverify_recover?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_signctx(pmeth: CValuesRef<EVP_PKEY_METHOD>?, psignctx_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_MD_CTX>?) -> Int>>>?, psignctx: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<EVP_MD_CTX>?) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1740(pmeth?.getPointer(memScope).rawValue, psignctx_init?.getPointer(memScope).rawValue, psignctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_verifyctx(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pverifyctx_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<EVP_MD_CTX>?) -> Int>>>?, pverifyctx: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, Int, CPointer<EVP_MD_CTX>?) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1741(pmeth?.getPointer(memScope).rawValue, pverifyctx_init?.getPointer(memScope).rawValue, pverifyctx?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_encrypt(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pencrypt_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>>?, pencryptfn: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<UByteVar>?, size_t) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1742(pmeth?.getPointer(memScope).rawValue, pencrypt_init?.getPointer(memScope).rawValue, pencryptfn?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_decrypt(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pdecrypt_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>>?, pdecrypt: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?, CPointer<UByteVar>?, size_t) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1743(pmeth?.getPointer(memScope).rawValue, pdecrypt_init?.getPointer(memScope).rawValue, pdecrypt?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_derive(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pderive_init: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>>>?, pderive: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<UByteVar>?, CPointer<size_tVar>?) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1744(pmeth?.getPointer(memScope).rawValue, pderive_init?.getPointer(memScope).rawValue, pderive?.getPointer(memScope).rawValue)
    }
}

fun EVP_PKEY_meth_get_ctrl(pmeth: CValuesRef<EVP_PKEY_METHOD>?, pctrl: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, Int, Int, COpaquePointer?) -> Int>>>?, pctrl_str: CValuesRef<CPointerVar<CFunction<(CPointer<EVP_PKEY_CTX>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>>?): Unit {
    memScoped {
        return kniBridge1745(pmeth?.getPointer(memScope).rawValue, pctrl?.getPointer(memScope).rawValue, pctrl_str?.getPointer(memScope).rawValue)
    }
}

fun EVP_add_alg_module(): Unit {
    return kniBridge1746()
}

fun ERR_load_EVP_strings(): Int {
    return kniBridge1747()
}

fun OPENSSL_LH_error(lh: CValuesRef<OPENSSL_LHASH>?): Int {
    memScoped {
        return kniBridge1748(lh?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_new(h: OPENSSL_LH_HASHFUNC?, c: OPENSSL_LH_COMPFUNC?): CPointer<OPENSSL_LHASH>? {
    return interpretCPointer<OPENSSL_LHASH>(kniBridge1749(h.rawValue, c.rawValue))
}

fun OPENSSL_LH_free(lh: CValuesRef<OPENSSL_LHASH>?): Unit {
    memScoped {
        return kniBridge1750(lh?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_insert(lh: CValuesRef<OPENSSL_LHASH>?, data: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1751(lh?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_LH_delete(lh: CValuesRef<OPENSSL_LHASH>?, data: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1752(lh?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_LH_retrieve(lh: CValuesRef<OPENSSL_LHASH>?, data: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1753(lh?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue))
    }
}

fun OPENSSL_LH_doall(lh: CValuesRef<OPENSSL_LHASH>?, func: OPENSSL_LH_DOALL_FUNC?): Unit {
    memScoped {
        return kniBridge1754(lh?.getPointer(memScope).rawValue, func.rawValue)
    }
}

fun OPENSSL_LH_doall_arg(lh: CValuesRef<OPENSSL_LHASH>?, func: OPENSSL_LH_DOALL_FUNCARG?, arg: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1755(lh?.getPointer(memScope).rawValue, func.rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_strhash(c: String?): ULong {
    memScoped {
        return kniBridge1756(c?.cstr?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_num_items(lh: CValuesRef<OPENSSL_LHASH>?): ULong {
    memScoped {
        return kniBridge1757(lh?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_get_down_load(lh: CValuesRef<OPENSSL_LHASH>?): ULong {
    memScoped {
        return kniBridge1758(lh?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_set_down_load(lh: CValuesRef<OPENSSL_LHASH>?, down_load: ULong): Unit {
    memScoped {
        return kniBridge1759(lh?.getPointer(memScope).rawValue, down_load)
    }
}

fun OPENSSL_LH_stats(lh: CValuesRef<OPENSSL_LHASH>?, fp: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge1760(lh?.getPointer(memScope).rawValue, fp?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_node_stats(lh: CValuesRef<OPENSSL_LHASH>?, fp: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge1761(lh?.getPointer(memScope).rawValue, fp?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_node_usage_stats(lh: CValuesRef<OPENSSL_LHASH>?, fp: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge1762(lh?.getPointer(memScope).rawValue, fp?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_stats_bio(lh: CValuesRef<OPENSSL_LHASH>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1763(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_node_stats_bio(lh: CValuesRef<OPENSSL_LHASH>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1764(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_LH_node_usage_stats_bio(lh: CValuesRef<OPENSSL_LHASH>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1765(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_STRING_new(hfn: CPointer<CFunction<(CPointer<OPENSSL_STRINGVar>?) -> ULong>>?, cfn: CPointer<CFunction<(CPointer<OPENSSL_STRINGVar>?, CPointer<OPENSSL_STRINGVar>?) -> Int>>?): CPointer<lhash_st_OPENSSL_STRING>? {
    return interpretCPointer<lhash_st_OPENSSL_STRING>(kniBridge1766(hfn.rawValue, cfn.rawValue))
}

fun lh_OPENSSL_STRING_free(lh: CValuesRef<lhash_st_OPENSSL_STRING>?): Unit {
    memScoped {
        return kniBridge1767(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_STRING_insert(lh: CValuesRef<lhash_st_OPENSSL_STRING>?, d: CValuesRef<OPENSSL_STRINGVar>?): CPointer<OPENSSL_STRINGVar>? {
    memScoped {
        return interpretCPointer<OPENSSL_STRINGVar>(kniBridge1768(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_OPENSSL_STRING_delete(lh: CValuesRef<lhash_st_OPENSSL_STRING>?, d: CValuesRef<OPENSSL_STRINGVar>?): CPointer<OPENSSL_STRINGVar>? {
    memScoped {
        return interpretCPointer<OPENSSL_STRINGVar>(kniBridge1769(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_OPENSSL_STRING_retrieve(lh: CValuesRef<lhash_st_OPENSSL_STRING>?, d: CValuesRef<OPENSSL_STRINGVar>?): CPointer<OPENSSL_STRINGVar>? {
    memScoped {
        return interpretCPointer<OPENSSL_STRINGVar>(kniBridge1770(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_OPENSSL_STRING_error(lh: CValuesRef<lhash_st_OPENSSL_STRING>?): Int {
    memScoped {
        return kniBridge1771(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_STRING_num_items(lh: CValuesRef<lhash_st_OPENSSL_STRING>?): ULong {
    memScoped {
        return kniBridge1772(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_STRING_node_stats_bio(lh: CValuesRef<lhash_st_OPENSSL_STRING>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1773(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_STRING_node_usage_stats_bio(lh: CValuesRef<lhash_st_OPENSSL_STRING>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1774(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_STRING_stats_bio(lh: CValuesRef<lhash_st_OPENSSL_STRING>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1775(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_STRING_get_down_load(lh: CValuesRef<lhash_st_OPENSSL_STRING>?): ULong {
    memScoped {
        return kniBridge1776(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_STRING_set_down_load(lh: CValuesRef<lhash_st_OPENSSL_STRING>?, dl: ULong): Unit {
    memScoped {
        return kniBridge1777(lh?.getPointer(memScope).rawValue, dl)
    }
}

fun lh_OPENSSL_STRING_doall(lh: CValuesRef<lhash_st_OPENSSL_STRING>?, doall: CPointer<CFunction<(CPointer<OPENSSL_STRINGVar>?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge1778(lh?.getPointer(memScope).rawValue, doall.rawValue)
    }
}

fun lh_OPENSSL_CSTRING_new(hfn: CPointer<CFunction<(CPointer<OPENSSL_CSTRINGVar>?) -> ULong>>?, cfn: CPointer<CFunction<(CPointer<OPENSSL_CSTRINGVar>?, CPointer<OPENSSL_CSTRINGVar>?) -> Int>>?): CPointer<lhash_st_OPENSSL_CSTRING>? {
    return interpretCPointer<lhash_st_OPENSSL_CSTRING>(kniBridge1779(hfn.rawValue, cfn.rawValue))
}

fun lh_OPENSSL_CSTRING_free(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?): Unit {
    memScoped {
        return kniBridge1780(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_CSTRING_insert(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?, d: CValuesRef<OPENSSL_CSTRINGVar>?): CPointer<OPENSSL_CSTRINGVar>? {
    memScoped {
        return interpretCPointer<OPENSSL_CSTRINGVar>(kniBridge1781(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_OPENSSL_CSTRING_delete(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?, d: CValuesRef<OPENSSL_CSTRINGVar>?): CPointer<OPENSSL_CSTRINGVar>? {
    memScoped {
        return interpretCPointer<OPENSSL_CSTRINGVar>(kniBridge1782(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_OPENSSL_CSTRING_retrieve(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?, d: CValuesRef<OPENSSL_CSTRINGVar>?): CPointer<OPENSSL_CSTRINGVar>? {
    memScoped {
        return interpretCPointer<OPENSSL_CSTRINGVar>(kniBridge1783(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_OPENSSL_CSTRING_error(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?): Int {
    memScoped {
        return kniBridge1784(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_CSTRING_num_items(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?): ULong {
    memScoped {
        return kniBridge1785(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_CSTRING_node_stats_bio(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1786(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_CSTRING_node_usage_stats_bio(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1787(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_CSTRING_stats_bio(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1788(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_CSTRING_get_down_load(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?): ULong {
    memScoped {
        return kniBridge1789(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_OPENSSL_CSTRING_set_down_load(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?, dl: ULong): Unit {
    memScoped {
        return kniBridge1790(lh?.getPointer(memScope).rawValue, dl)
    }
}

fun lh_OPENSSL_CSTRING_doall(lh: CValuesRef<lhash_st_OPENSSL_CSTRING>?, doall: CPointer<CFunction<(CPointer<OPENSSL_CSTRINGVar>?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge1791(lh?.getPointer(memScope).rawValue, doall.rawValue)
    }
}

fun __errno_location(): CPointer<IntVar>? {
    return interpretCPointer<IntVar>(kniBridge1792())
}

fun lh_ERR_STRING_DATA_new(hfn: CPointer<CFunction<(CPointer<ERR_STRING_DATA>?) -> ULong>>?, cfn: CPointer<CFunction<(CPointer<ERR_STRING_DATA>?, CPointer<ERR_STRING_DATA>?) -> Int>>?): CPointer<lhash_st_ERR_STRING_DATA>? {
    return interpretCPointer<lhash_st_ERR_STRING_DATA>(kniBridge1793(hfn.rawValue, cfn.rawValue))
}

fun lh_ERR_STRING_DATA_free(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?): Unit {
    memScoped {
        return kniBridge1794(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_ERR_STRING_DATA_insert(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?, d: CValuesRef<ERR_STRING_DATA>?): CPointer<ERR_STRING_DATA>? {
    memScoped {
        return interpretCPointer<ERR_STRING_DATA>(kniBridge1795(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_ERR_STRING_DATA_delete(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?, d: CValuesRef<ERR_STRING_DATA>?): CPointer<ERR_STRING_DATA>? {
    memScoped {
        return interpretCPointer<ERR_STRING_DATA>(kniBridge1796(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_ERR_STRING_DATA_retrieve(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?, d: CValuesRef<ERR_STRING_DATA>?): CPointer<ERR_STRING_DATA>? {
    memScoped {
        return interpretCPointer<ERR_STRING_DATA>(kniBridge1797(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_ERR_STRING_DATA_error(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?): Int {
    memScoped {
        return kniBridge1798(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_ERR_STRING_DATA_num_items(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?): ULong {
    memScoped {
        return kniBridge1799(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_ERR_STRING_DATA_node_stats_bio(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1800(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_ERR_STRING_DATA_node_usage_stats_bio(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1801(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_ERR_STRING_DATA_stats_bio(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1802(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_ERR_STRING_DATA_get_down_load(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?): ULong {
    memScoped {
        return kniBridge1803(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_ERR_STRING_DATA_set_down_load(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?, dl: ULong): Unit {
    memScoped {
        return kniBridge1804(lh?.getPointer(memScope).rawValue, dl)
    }
}

fun lh_ERR_STRING_DATA_doall(lh: CValuesRef<lhash_st_ERR_STRING_DATA>?, doall: CPointer<CFunction<(CPointer<ERR_STRING_DATA>?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge1805(lh?.getPointer(memScope).rawValue, doall.rawValue)
    }
}

fun ERR_put_error(lib: Int, func: Int, reason: Int, file: String?, line: Int): Unit {
    memScoped {
        return kniBridge1806(lib, func, reason, file?.cstr?.getPointer(memScope).rawValue, line)
    }
}

fun ERR_set_error_data(data: CValuesRef<ByteVar>?, flags: Int): Unit {
    memScoped {
        return kniBridge1807(data?.getPointer(memScope).rawValue, flags)
    }
}

fun ERR_get_error(): ULong {
    return kniBridge1808()
}

fun ERR_get_error_line(file: CValuesRef<CPointerVar<ByteVar>>?, line: CValuesRef<IntVar>?): ULong {
    memScoped {
        return kniBridge1809(file?.getPointer(memScope).rawValue, line?.getPointer(memScope).rawValue)
    }
}

fun ERR_get_error_line_data(file: CValuesRef<CPointerVar<ByteVar>>?, line: CValuesRef<IntVar>?, data: CValuesRef<CPointerVar<ByteVar>>?, flags: CValuesRef<IntVar>?): ULong {
    memScoped {
        return kniBridge1810(file?.getPointer(memScope).rawValue, line?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, flags?.getPointer(memScope).rawValue)
    }
}

fun ERR_peek_error(): ULong {
    return kniBridge1811()
}

fun ERR_peek_error_line(file: CValuesRef<CPointerVar<ByteVar>>?, line: CValuesRef<IntVar>?): ULong {
    memScoped {
        return kniBridge1812(file?.getPointer(memScope).rawValue, line?.getPointer(memScope).rawValue)
    }
}

fun ERR_peek_error_line_data(file: CValuesRef<CPointerVar<ByteVar>>?, line: CValuesRef<IntVar>?, data: CValuesRef<CPointerVar<ByteVar>>?, flags: CValuesRef<IntVar>?): ULong {
    memScoped {
        return kniBridge1813(file?.getPointer(memScope).rawValue, line?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, flags?.getPointer(memScope).rawValue)
    }
}

fun ERR_peek_last_error(): ULong {
    return kniBridge1814()
}

fun ERR_peek_last_error_line(file: CValuesRef<CPointerVar<ByteVar>>?, line: CValuesRef<IntVar>?): ULong {
    memScoped {
        return kniBridge1815(file?.getPointer(memScope).rawValue, line?.getPointer(memScope).rawValue)
    }
}

fun ERR_peek_last_error_line_data(file: CValuesRef<CPointerVar<ByteVar>>?, line: CValuesRef<IntVar>?, data: CValuesRef<CPointerVar<ByteVar>>?, flags: CValuesRef<IntVar>?): ULong {
    memScoped {
        return kniBridge1816(file?.getPointer(memScope).rawValue, line?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, flags?.getPointer(memScope).rawValue)
    }
}

fun ERR_clear_error(): Unit {
    return kniBridge1817()
}

fun ERR_error_string(e: ULong, buf: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge1818(e, buf?.getPointer(memScope).rawValue))
    }
}

fun ERR_error_string_n(e: ULong, buf: CValuesRef<ByteVar>?, len: size_t): Unit {
    memScoped {
        return kniBridge1819(e, buf?.getPointer(memScope).rawValue, len)
    }
}

fun ERR_lib_error_string(e: ULong): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge1820(e))
}

fun ERR_func_error_string(e: ULong): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge1821(e))
}

fun ERR_reason_error_string(e: ULong): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge1822(e))
}

fun ERR_print_errors_cb(cb: CPointer<CFunction<(CPointer<ByteVar>?, size_t, COpaquePointer?) -> Int>>?, u: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1823(cb.rawValue, u?.getPointer(memScope).rawValue)
    }
}

fun ERR_print_errors_fp(fp: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge1824(fp?.getPointer(memScope).rawValue)
    }
}

fun ERR_print_errors(bp: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1825(bp?.getPointer(memScope).rawValue)
    }
}

fun ERR_add_error_data(num: Int, vararg variadicArguments: Any?): Unit {
    memScoped {
        callWithVarargs(kniBridge1826(), nativeNullPtr, FFI_TYPE_KIND_VOID, arrayOf(num), variadicArguments, memScope)
    }
}

fun ERR_add_error_vdata(num: Int, args: va_list?): Unit {
    return kniBridge1827(num, args.rawValue)
}

fun ERR_load_strings(lib: Int, str: CValuesRef<ERR_STRING_DATA>?): Int {
    memScoped {
        return kniBridge1828(lib, str?.getPointer(memScope).rawValue)
    }
}

fun ERR_unload_strings(lib: Int, str: CValuesRef<ERR_STRING_DATA>?): Int {
    memScoped {
        return kniBridge1829(lib, str?.getPointer(memScope).rawValue)
    }
}

fun ERR_load_ERR_strings(): Int {
    return kniBridge1830()
}

fun ERR_remove_thread_state(arg0: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1831(arg0?.getPointer(memScope).rawValue)
    }
}

fun ERR_remove_state(pid: ULong): Unit {
    return kniBridge1832(pid)
}

fun ERR_get_state(): CPointer<ERR_STATE>? {
    return interpretCPointer<ERR_STATE>(kniBridge1833())
}

fun ERR_get_next_error_library(): Int {
    return kniBridge1834()
}

fun ERR_set_mark(): Int {
    return kniBridge1835()
}

fun ERR_pop_to_mark(): Int {
    return kniBridge1836()
}

fun sk_CONF_VALUE_num(sk: CValuesRef<stack_st_CONF_VALUE>?): Int {
    memScoped {
        return kniBridge1837(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_VALUE_value(sk: CValuesRef<stack_st_CONF_VALUE>?, idx: Int): CPointer<CONF_VALUE>? {
    memScoped {
        return interpretCPointer<CONF_VALUE>(kniBridge1838(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_CONF_VALUE_new(compare: sk_CONF_VALUE_compfunc?): CPointer<stack_st_CONF_VALUE>? {
    return interpretCPointer<stack_st_CONF_VALUE>(kniBridge1839(compare.rawValue))
}

fun sk_CONF_VALUE_new_null(): CPointer<stack_st_CONF_VALUE>? {
    return interpretCPointer<stack_st_CONF_VALUE>(kniBridge1840())
}

fun sk_CONF_VALUE_free(sk: CValuesRef<stack_st_CONF_VALUE>?): Unit {
    memScoped {
        return kniBridge1841(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_VALUE_zero(sk: CValuesRef<stack_st_CONF_VALUE>?): Unit {
    memScoped {
        return kniBridge1842(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_VALUE_delete(sk: CValuesRef<stack_st_CONF_VALUE>?, i: Int): CPointer<CONF_VALUE>? {
    memScoped {
        return interpretCPointer<CONF_VALUE>(kniBridge1843(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_CONF_VALUE_delete_ptr(sk: CValuesRef<stack_st_CONF_VALUE>?, ptr: CValuesRef<CONF_VALUE>?): CPointer<CONF_VALUE>? {
    memScoped {
        return interpretCPointer<CONF_VALUE>(kniBridge1844(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_VALUE_push(sk: CValuesRef<stack_st_CONF_VALUE>?, ptr: CValuesRef<CONF_VALUE>?): Int {
    memScoped {
        return kniBridge1845(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_VALUE_unshift(sk: CValuesRef<stack_st_CONF_VALUE>?, ptr: CValuesRef<CONF_VALUE>?): Int {
    memScoped {
        return kniBridge1846(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_VALUE_pop(sk: CValuesRef<stack_st_CONF_VALUE>?): CPointer<CONF_VALUE>? {
    memScoped {
        return interpretCPointer<CONF_VALUE>(kniBridge1847(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_VALUE_shift(sk: CValuesRef<stack_st_CONF_VALUE>?): CPointer<CONF_VALUE>? {
    memScoped {
        return interpretCPointer<CONF_VALUE>(kniBridge1848(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_VALUE_pop_free(sk: CValuesRef<stack_st_CONF_VALUE>?, freefunc: sk_CONF_VALUE_freefunc?): Unit {
    memScoped {
        return kniBridge1849(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_CONF_VALUE_insert(sk: CValuesRef<stack_st_CONF_VALUE>?, ptr: CValuesRef<CONF_VALUE>?, idx: Int): Int {
    memScoped {
        return kniBridge1850(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_CONF_VALUE_set(sk: CValuesRef<stack_st_CONF_VALUE>?, idx: Int, ptr: CValuesRef<CONF_VALUE>?): CPointer<CONF_VALUE>? {
    memScoped {
        return interpretCPointer<CONF_VALUE>(kniBridge1851(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_VALUE_find(sk: CValuesRef<stack_st_CONF_VALUE>?, ptr: CValuesRef<CONF_VALUE>?): Int {
    memScoped {
        return kniBridge1852(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_VALUE_find_ex(sk: CValuesRef<stack_st_CONF_VALUE>?, ptr: CValuesRef<CONF_VALUE>?): Int {
    memScoped {
        return kniBridge1853(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_VALUE_sort(sk: CValuesRef<stack_st_CONF_VALUE>?): Unit {
    memScoped {
        return kniBridge1854(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_VALUE_is_sorted(sk: CValuesRef<stack_st_CONF_VALUE>?): Int {
    memScoped {
        return kniBridge1855(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_VALUE_dup(sk: CValuesRef<stack_st_CONF_VALUE>?): CPointer<stack_st_CONF_VALUE>? {
    memScoped {
        return interpretCPointer<stack_st_CONF_VALUE>(kniBridge1856(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_VALUE_deep_copy(sk: CValuesRef<stack_st_CONF_VALUE>?, copyfunc: sk_CONF_VALUE_copyfunc?, freefunc: sk_CONF_VALUE_freefunc?): CPointer<stack_st_CONF_VALUE>? {
    memScoped {
        return interpretCPointer<stack_st_CONF_VALUE>(kniBridge1857(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_CONF_VALUE_set_cmp_func(sk: CValuesRef<stack_st_CONF_VALUE>?, compare: sk_CONF_VALUE_compfunc?): sk_CONF_VALUE_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<CONF_VALUE>>?, CPointer<CPointerVar<CONF_VALUE>>?) -> Int>>(kniBridge1858(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun lh_CONF_VALUE_new(hfn: CPointer<CFunction<(CPointer<CONF_VALUE>?) -> ULong>>?, cfn: CPointer<CFunction<(CPointer<CONF_VALUE>?, CPointer<CONF_VALUE>?) -> Int>>?): CPointer<lhash_st_CONF_VALUE>? {
    return interpretCPointer<lhash_st_CONF_VALUE>(kniBridge1859(hfn.rawValue, cfn.rawValue))
}

fun lh_CONF_VALUE_free(lh: CValuesRef<lhash_st_CONF_VALUE>?): Unit {
    memScoped {
        return kniBridge1860(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_CONF_VALUE_insert(lh: CValuesRef<lhash_st_CONF_VALUE>?, d: CValuesRef<CONF_VALUE>?): CPointer<CONF_VALUE>? {
    memScoped {
        return interpretCPointer<CONF_VALUE>(kniBridge1861(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_CONF_VALUE_delete(lh: CValuesRef<lhash_st_CONF_VALUE>?, d: CValuesRef<CONF_VALUE>?): CPointer<CONF_VALUE>? {
    memScoped {
        return interpretCPointer<CONF_VALUE>(kniBridge1862(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_CONF_VALUE_retrieve(lh: CValuesRef<lhash_st_CONF_VALUE>?, d: CValuesRef<CONF_VALUE>?): CPointer<CONF_VALUE>? {
    memScoped {
        return interpretCPointer<CONF_VALUE>(kniBridge1863(lh?.getPointer(memScope).rawValue, d?.getPointer(memScope).rawValue))
    }
}

fun lh_CONF_VALUE_error(lh: CValuesRef<lhash_st_CONF_VALUE>?): Int {
    memScoped {
        return kniBridge1864(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_CONF_VALUE_num_items(lh: CValuesRef<lhash_st_CONF_VALUE>?): ULong {
    memScoped {
        return kniBridge1865(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_CONF_VALUE_node_stats_bio(lh: CValuesRef<lhash_st_CONF_VALUE>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1866(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_CONF_VALUE_node_usage_stats_bio(lh: CValuesRef<lhash_st_CONF_VALUE>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1867(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_CONF_VALUE_stats_bio(lh: CValuesRef<lhash_st_CONF_VALUE>?, out: CValuesRef<BIO>?): Unit {
    memScoped {
        return kniBridge1868(lh?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun lh_CONF_VALUE_get_down_load(lh: CValuesRef<lhash_st_CONF_VALUE>?): ULong {
    memScoped {
        return kniBridge1869(lh?.getPointer(memScope).rawValue)
    }
}

fun lh_CONF_VALUE_set_down_load(lh: CValuesRef<lhash_st_CONF_VALUE>?, dl: ULong): Unit {
    memScoped {
        return kniBridge1870(lh?.getPointer(memScope).rawValue, dl)
    }
}

fun lh_CONF_VALUE_doall(lh: CValuesRef<lhash_st_CONF_VALUE>?, doall: CPointer<CFunction<(CPointer<CONF_VALUE>?) -> Unit>>?): Unit {
    memScoped {
        return kniBridge1871(lh?.getPointer(memScope).rawValue, doall.rawValue)
    }
}

fun sk_CONF_MODULE_num(sk: CValuesRef<stack_st_CONF_MODULE>?): Int {
    memScoped {
        return kniBridge1872(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_MODULE_value(sk: CValuesRef<stack_st_CONF_MODULE>?, idx: Int): CPointer<CONF_MODULE>? {
    memScoped {
        return interpretCPointer<CONF_MODULE>(kniBridge1873(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_CONF_MODULE_new(compare: sk_CONF_MODULE_compfunc?): CPointer<stack_st_CONF_MODULE>? {
    return interpretCPointer<stack_st_CONF_MODULE>(kniBridge1874(compare.rawValue))
}

fun sk_CONF_MODULE_new_null(): CPointer<stack_st_CONF_MODULE>? {
    return interpretCPointer<stack_st_CONF_MODULE>(kniBridge1875())
}

fun sk_CONF_MODULE_free(sk: CValuesRef<stack_st_CONF_MODULE>?): Unit {
    memScoped {
        return kniBridge1876(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_MODULE_zero(sk: CValuesRef<stack_st_CONF_MODULE>?): Unit {
    memScoped {
        return kniBridge1877(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_MODULE_delete(sk: CValuesRef<stack_st_CONF_MODULE>?, i: Int): CPointer<CONF_MODULE>? {
    memScoped {
        return interpretCPointer<CONF_MODULE>(kniBridge1878(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_CONF_MODULE_delete_ptr(sk: CValuesRef<stack_st_CONF_MODULE>?, ptr: CValuesRef<CONF_MODULE>?): CPointer<CONF_MODULE>? {
    memScoped {
        return interpretCPointer<CONF_MODULE>(kniBridge1879(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_MODULE_push(sk: CValuesRef<stack_st_CONF_MODULE>?, ptr: CValuesRef<CONF_MODULE>?): Int {
    memScoped {
        return kniBridge1880(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_MODULE_unshift(sk: CValuesRef<stack_st_CONF_MODULE>?, ptr: CValuesRef<CONF_MODULE>?): Int {
    memScoped {
        return kniBridge1881(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_MODULE_pop(sk: CValuesRef<stack_st_CONF_MODULE>?): CPointer<CONF_MODULE>? {
    memScoped {
        return interpretCPointer<CONF_MODULE>(kniBridge1882(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_MODULE_shift(sk: CValuesRef<stack_st_CONF_MODULE>?): CPointer<CONF_MODULE>? {
    memScoped {
        return interpretCPointer<CONF_MODULE>(kniBridge1883(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_MODULE_pop_free(sk: CValuesRef<stack_st_CONF_MODULE>?, freefunc: sk_CONF_MODULE_freefunc?): Unit {
    memScoped {
        return kniBridge1884(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_CONF_MODULE_insert(sk: CValuesRef<stack_st_CONF_MODULE>?, ptr: CValuesRef<CONF_MODULE>?, idx: Int): Int {
    memScoped {
        return kniBridge1885(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_CONF_MODULE_set(sk: CValuesRef<stack_st_CONF_MODULE>?, idx: Int, ptr: CValuesRef<CONF_MODULE>?): CPointer<CONF_MODULE>? {
    memScoped {
        return interpretCPointer<CONF_MODULE>(kniBridge1886(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_MODULE_find(sk: CValuesRef<stack_st_CONF_MODULE>?, ptr: CValuesRef<CONF_MODULE>?): Int {
    memScoped {
        return kniBridge1887(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_MODULE_find_ex(sk: CValuesRef<stack_st_CONF_MODULE>?, ptr: CValuesRef<CONF_MODULE>?): Int {
    memScoped {
        return kniBridge1888(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_MODULE_sort(sk: CValuesRef<stack_st_CONF_MODULE>?): Unit {
    memScoped {
        return kniBridge1889(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_MODULE_is_sorted(sk: CValuesRef<stack_st_CONF_MODULE>?): Int {
    memScoped {
        return kniBridge1890(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_MODULE_dup(sk: CValuesRef<stack_st_CONF_MODULE>?): CPointer<stack_st_CONF_MODULE>? {
    memScoped {
        return interpretCPointer<stack_st_CONF_MODULE>(kniBridge1891(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_MODULE_deep_copy(sk: CValuesRef<stack_st_CONF_MODULE>?, copyfunc: sk_CONF_MODULE_copyfunc?, freefunc: sk_CONF_MODULE_freefunc?): CPointer<stack_st_CONF_MODULE>? {
    memScoped {
        return interpretCPointer<stack_st_CONF_MODULE>(kniBridge1892(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_CONF_MODULE_set_cmp_func(sk: CValuesRef<stack_st_CONF_MODULE>?, compare: sk_CONF_MODULE_compfunc?): sk_CONF_MODULE_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<CONF_MODULE>>?, CPointer<CPointerVar<CONF_MODULE>>?) -> Int>>(kniBridge1893(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun sk_CONF_IMODULE_num(sk: CValuesRef<stack_st_CONF_IMODULE>?): Int {
    memScoped {
        return kniBridge1894(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_IMODULE_value(sk: CValuesRef<stack_st_CONF_IMODULE>?, idx: Int): CPointer<CONF_IMODULE>? {
    memScoped {
        return interpretCPointer<CONF_IMODULE>(kniBridge1895(sk?.getPointer(memScope).rawValue, idx))
    }
}

fun sk_CONF_IMODULE_new(compare: sk_CONF_IMODULE_compfunc?): CPointer<stack_st_CONF_IMODULE>? {
    return interpretCPointer<stack_st_CONF_IMODULE>(kniBridge1896(compare.rawValue))
}

fun sk_CONF_IMODULE_new_null(): CPointer<stack_st_CONF_IMODULE>? {
    return interpretCPointer<stack_st_CONF_IMODULE>(kniBridge1897())
}

fun sk_CONF_IMODULE_free(sk: CValuesRef<stack_st_CONF_IMODULE>?): Unit {
    memScoped {
        return kniBridge1898(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_IMODULE_zero(sk: CValuesRef<stack_st_CONF_IMODULE>?): Unit {
    memScoped {
        return kniBridge1899(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_IMODULE_delete(sk: CValuesRef<stack_st_CONF_IMODULE>?, i: Int): CPointer<CONF_IMODULE>? {
    memScoped {
        return interpretCPointer<CONF_IMODULE>(kniBridge1900(sk?.getPointer(memScope).rawValue, i))
    }
}

fun sk_CONF_IMODULE_delete_ptr(sk: CValuesRef<stack_st_CONF_IMODULE>?, ptr: CValuesRef<CONF_IMODULE>?): CPointer<CONF_IMODULE>? {
    memScoped {
        return interpretCPointer<CONF_IMODULE>(kniBridge1901(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_IMODULE_push(sk: CValuesRef<stack_st_CONF_IMODULE>?, ptr: CValuesRef<CONF_IMODULE>?): Int {
    memScoped {
        return kniBridge1902(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_IMODULE_unshift(sk: CValuesRef<stack_st_CONF_IMODULE>?, ptr: CValuesRef<CONF_IMODULE>?): Int {
    memScoped {
        return kniBridge1903(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_IMODULE_pop(sk: CValuesRef<stack_st_CONF_IMODULE>?): CPointer<CONF_IMODULE>? {
    memScoped {
        return interpretCPointer<CONF_IMODULE>(kniBridge1904(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_IMODULE_shift(sk: CValuesRef<stack_st_CONF_IMODULE>?): CPointer<CONF_IMODULE>? {
    memScoped {
        return interpretCPointer<CONF_IMODULE>(kniBridge1905(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_IMODULE_pop_free(sk: CValuesRef<stack_st_CONF_IMODULE>?, freefunc: sk_CONF_IMODULE_freefunc?): Unit {
    memScoped {
        return kniBridge1906(sk?.getPointer(memScope).rawValue, freefunc.rawValue)
    }
}

fun sk_CONF_IMODULE_insert(sk: CValuesRef<stack_st_CONF_IMODULE>?, ptr: CValuesRef<CONF_IMODULE>?, idx: Int): Int {
    memScoped {
        return kniBridge1907(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue, idx)
    }
}

fun sk_CONF_IMODULE_set(sk: CValuesRef<stack_st_CONF_IMODULE>?, idx: Int, ptr: CValuesRef<CONF_IMODULE>?): CPointer<CONF_IMODULE>? {
    memScoped {
        return interpretCPointer<CONF_IMODULE>(kniBridge1908(sk?.getPointer(memScope).rawValue, idx, ptr?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_IMODULE_find(sk: CValuesRef<stack_st_CONF_IMODULE>?, ptr: CValuesRef<CONF_IMODULE>?): Int {
    memScoped {
        return kniBridge1909(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_IMODULE_find_ex(sk: CValuesRef<stack_st_CONF_IMODULE>?, ptr: CValuesRef<CONF_IMODULE>?): Int {
    memScoped {
        return kniBridge1910(sk?.getPointer(memScope).rawValue, ptr?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_IMODULE_sort(sk: CValuesRef<stack_st_CONF_IMODULE>?): Unit {
    memScoped {
        return kniBridge1911(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_IMODULE_is_sorted(sk: CValuesRef<stack_st_CONF_IMODULE>?): Int {
    memScoped {
        return kniBridge1912(sk?.getPointer(memScope).rawValue)
    }
}

fun sk_CONF_IMODULE_dup(sk: CValuesRef<stack_st_CONF_IMODULE>?): CPointer<stack_st_CONF_IMODULE>? {
    memScoped {
        return interpretCPointer<stack_st_CONF_IMODULE>(kniBridge1913(sk?.getPointer(memScope).rawValue))
    }
}

fun sk_CONF_IMODULE_deep_copy(sk: CValuesRef<stack_st_CONF_IMODULE>?, copyfunc: sk_CONF_IMODULE_copyfunc?, freefunc: sk_CONF_IMODULE_freefunc?): CPointer<stack_st_CONF_IMODULE>? {
    memScoped {
        return interpretCPointer<stack_st_CONF_IMODULE>(kniBridge1914(sk?.getPointer(memScope).rawValue, copyfunc.rawValue, freefunc.rawValue))
    }
}

fun sk_CONF_IMODULE_set_cmp_func(sk: CValuesRef<stack_st_CONF_IMODULE>?, compare: sk_CONF_IMODULE_compfunc?): sk_CONF_IMODULE_compfunc? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<CPointerVar<CONF_IMODULE>>?, CPointer<CPointerVar<CONF_IMODULE>>?) -> Int>>(kniBridge1915(sk?.getPointer(memScope).rawValue, compare.rawValue))
    }
}

fun CONF_set_default_method(meth: CValuesRef<CONF_METHOD>?): Int {
    memScoped {
        return kniBridge1916(meth?.getPointer(memScope).rawValue)
    }
}

fun CONF_set_nconf(conf: CValuesRef<CONF>?, hash: CValuesRef<lhash_st_CONF_VALUE>?): Unit {
    memScoped {
        return kniBridge1917(conf?.getPointer(memScope).rawValue, hash?.getPointer(memScope).rawValue)
    }
}

fun CONF_load(conf: CValuesRef<lhash_st_CONF_VALUE>?, file: String?, eline: CValuesRef<LongVar>?): CPointer<lhash_st_CONF_VALUE>? {
    memScoped {
        return interpretCPointer<lhash_st_CONF_VALUE>(kniBridge1918(conf?.getPointer(memScope).rawValue, file?.cstr?.getPointer(memScope).rawValue, eline?.getPointer(memScope).rawValue))
    }
}

fun CONF_load_fp(conf: CValuesRef<lhash_st_CONF_VALUE>?, fp: CValuesRef<FILE>?, eline: CValuesRef<LongVar>?): CPointer<lhash_st_CONF_VALUE>? {
    memScoped {
        return interpretCPointer<lhash_st_CONF_VALUE>(kniBridge1919(conf?.getPointer(memScope).rawValue, fp?.getPointer(memScope).rawValue, eline?.getPointer(memScope).rawValue))
    }
}

fun CONF_load_bio(conf: CValuesRef<lhash_st_CONF_VALUE>?, bp: CValuesRef<BIO>?, eline: CValuesRef<LongVar>?): CPointer<lhash_st_CONF_VALUE>? {
    memScoped {
        return interpretCPointer<lhash_st_CONF_VALUE>(kniBridge1920(conf?.getPointer(memScope).rawValue, bp?.getPointer(memScope).rawValue, eline?.getPointer(memScope).rawValue))
    }
}

fun CONF_get_section(conf: CValuesRef<lhash_st_CONF_VALUE>?, section: String?): CPointer<stack_st_CONF_VALUE>? {
    memScoped {
        return interpretCPointer<stack_st_CONF_VALUE>(kniBridge1921(conf?.getPointer(memScope).rawValue, section?.cstr?.getPointer(memScope).rawValue))
    }
}

fun CONF_get_string(conf: CValuesRef<lhash_st_CONF_VALUE>?, group: String?, name: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge1922(conf?.getPointer(memScope).rawValue, group?.cstr?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun CONF_get_number(conf: CValuesRef<lhash_st_CONF_VALUE>?, group: String?, name: String?): Long {
    memScoped {
        return kniBridge1923(conf?.getPointer(memScope).rawValue, group?.cstr?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun CONF_free(conf: CValuesRef<lhash_st_CONF_VALUE>?): Unit {
    memScoped {
        return kniBridge1924(conf?.getPointer(memScope).rawValue)
    }
}

fun CONF_dump_fp(conf: CValuesRef<lhash_st_CONF_VALUE>?, out: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge1925(conf?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun CONF_dump_bio(conf: CValuesRef<lhash_st_CONF_VALUE>?, out: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge1926(conf?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_config(config_name: String?): Unit {
    memScoped {
        return kniBridge1927(config_name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun NCONF_new(meth: CValuesRef<CONF_METHOD>?): CPointer<CONF>? {
    memScoped {
        return interpretCPointer<CONF>(kniBridge1928(meth?.getPointer(memScope).rawValue))
    }
}

fun NCONF_default(): CPointer<CONF_METHOD>? {
    return interpretCPointer<CONF_METHOD>(kniBridge1929())
}

fun NCONF_WIN32(): CPointer<CONF_METHOD>? {
    return interpretCPointer<CONF_METHOD>(kniBridge1930())
}

fun NCONF_free(conf: CValuesRef<CONF>?): Unit {
    memScoped {
        return kniBridge1931(conf?.getPointer(memScope).rawValue)
    }
}

fun NCONF_free_data(conf: CValuesRef<CONF>?): Unit {
    memScoped {
        return kniBridge1932(conf?.getPointer(memScope).rawValue)
    }
}

fun NCONF_load(conf: CValuesRef<CONF>?, file: String?, eline: CValuesRef<LongVar>?): Int {
    memScoped {
        return kniBridge1933(conf?.getPointer(memScope).rawValue, file?.cstr?.getPointer(memScope).rawValue, eline?.getPointer(memScope).rawValue)
    }
}

fun NCONF_load_fp(conf: CValuesRef<CONF>?, fp: CValuesRef<FILE>?, eline: CValuesRef<LongVar>?): Int {
    memScoped {
        return kniBridge1934(conf?.getPointer(memScope).rawValue, fp?.getPointer(memScope).rawValue, eline?.getPointer(memScope).rawValue)
    }
}

fun NCONF_load_bio(conf: CValuesRef<CONF>?, bp: CValuesRef<BIO>?, eline: CValuesRef<LongVar>?): Int {
    memScoped {
        return kniBridge1935(conf?.getPointer(memScope).rawValue, bp?.getPointer(memScope).rawValue, eline?.getPointer(memScope).rawValue)
    }
}

fun NCONF_get_section(conf: CValuesRef<CONF>?, section: String?): CPointer<stack_st_CONF_VALUE>? {
    memScoped {
        return interpretCPointer<stack_st_CONF_VALUE>(kniBridge1936(conf?.getPointer(memScope).rawValue, section?.cstr?.getPointer(memScope).rawValue))
    }
}

fun NCONF_get_string(conf: CValuesRef<CONF>?, group: String?, name: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge1937(conf?.getPointer(memScope).rawValue, group?.cstr?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun NCONF_get_number_e(conf: CValuesRef<CONF>?, group: String?, name: String?, result: CValuesRef<LongVar>?): Int {
    memScoped {
        return kniBridge1938(conf?.getPointer(memScope).rawValue, group?.cstr?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, result?.getPointer(memScope).rawValue)
    }
}

fun NCONF_dump_fp(conf: CValuesRef<CONF>?, out: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge1939(conf?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun NCONF_dump_bio(conf: CValuesRef<CONF>?, out: CValuesRef<BIO>?): Int {
    memScoped {
        return kniBridge1940(conf?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun CONF_modules_load(cnf: CValuesRef<CONF>?, appname: String?, flags: ULong): Int {
    memScoped {
        return kniBridge1941(cnf?.getPointer(memScope).rawValue, appname?.cstr?.getPointer(memScope).rawValue, flags)
    }
}

fun CONF_modules_load_file(filename: String?, appname: String?, flags: ULong): Int {
    memScoped {
        return kniBridge1942(filename?.cstr?.getPointer(memScope).rawValue, appname?.cstr?.getPointer(memScope).rawValue, flags)
    }
}

fun CONF_modules_unload(all: Int): Unit {
    return kniBridge1943(all)
}

fun CONF_modules_finish(): Unit {
    return kniBridge1944()
}

fun CONF_module_add(name: String?, ifunc: CPointer<conf_init_func>?, ffunc: CPointer<conf_finish_func>?): Int {
    memScoped {
        return kniBridge1945(name?.cstr?.getPointer(memScope).rawValue, ifunc.rawValue, ffunc.rawValue)
    }
}

fun CONF_imodule_get_name(md: CValuesRef<CONF_IMODULE>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge1946(md?.getPointer(memScope).rawValue))
    }
}

fun CONF_imodule_get_value(md: CValuesRef<CONF_IMODULE>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge1947(md?.getPointer(memScope).rawValue))
    }
}

fun CONF_imodule_get_usr_data(md: CValuesRef<CONF_IMODULE>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1948(md?.getPointer(memScope).rawValue))
    }
}

fun CONF_imodule_set_usr_data(md: CValuesRef<CONF_IMODULE>?, usr_data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1949(md?.getPointer(memScope).rawValue, usr_data?.getPointer(memScope).rawValue)
    }
}

fun CONF_imodule_get_module(md: CValuesRef<CONF_IMODULE>?): CPointer<CONF_MODULE>? {
    memScoped {
        return interpretCPointer<CONF_MODULE>(kniBridge1950(md?.getPointer(memScope).rawValue))
    }
}

fun CONF_imodule_get_flags(md: CValuesRef<CONF_IMODULE>?): ULong {
    memScoped {
        return kniBridge1951(md?.getPointer(memScope).rawValue)
    }
}

fun CONF_imodule_set_flags(md: CValuesRef<CONF_IMODULE>?, flags: ULong): Unit {
    memScoped {
        return kniBridge1952(md?.getPointer(memScope).rawValue, flags)
    }
}

fun CONF_module_get_usr_data(pmod: CValuesRef<CONF_MODULE>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge1953(pmod?.getPointer(memScope).rawValue))
    }
}

fun CONF_module_set_usr_data(pmod: CValuesRef<CONF_MODULE>?, usr_data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge1954(pmod?.getPointer(memScope).rawValue, usr_data?.getPointer(memScope).rawValue)
    }
}

fun CONF_get1_default_config_file(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge1955())
}

fun CONF_parse_list(list: String?, sep: Int, nospc: Int, list_cb: CPointer<CFunction<(CPointer<ByteVar>?, Int, COpaquePointer?) -> Int>>?, arg: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge1956(list?.cstr?.getPointer(memScope).rawValue, sep, nospc, list_cb.rawValue, arg?.getPointer(memScope).rawValue)
    }
}

fun OPENSSL_load_builtin_modules(): Unit {
    return kniBridge1957()
}

fun ERR_load_CONF_strings(): Int {
    return kniBridge1958()
}

fun MD5_Init(c: CValuesRef<MD5_CTX>?): Int {
    memScoped {
        return kniBridge1959(c?.getPointer(memScope).rawValue)
    }
}

fun MD5_Update(c: CValuesRef<MD5_CTX>?, data: CValuesRef<*>?, len: size_t): Int {
    memScoped {
        return kniBridge1960(c?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun MD5_Final(md: CValuesRef<UByteVar>?, c: CValuesRef<MD5_CTX>?): Int {
    memScoped {
        return kniBridge1961(md?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue)
    }
}

fun MD5(d: CValuesRef<UByteVar>?, n: size_t, md: CValuesRef<UByteVar>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge1962(d?.getPointer(memScope).rawValue, n, md?.getPointer(memScope).rawValue))
    }
}

fun MD5_Transform(c: CValuesRef<MD5_CTX>?, b: CValuesRef<UByteVar>?): Unit {
    memScoped {
        return kniBridge1963(c?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

val OPENSSL_FILE: String get() = "\u002Ftmp\u002Ftmp2663120572902106232.c"

const val OPENSSL_LINE: Int = 1

const val OPENSSL_MIN_API: Int = 0

const val OPENSSL_API_COMPAT: Int = 0

const val _LIBC_LIMITS_H_: Int = 1

const val _FEATURES_H: Int = 1

const val _DEFAULT_SOURCE: Int = 1

const val __USE_ISOC11: Int = 1

const val __USE_ISOC99: Int = 1

const val __USE_ISOC95: Int = 1

const val __USE_POSIX_IMPLICITLY: Int = 1

const val _POSIX_SOURCE: Int = 1

const val _POSIX_C_SOURCE: Long = 200809

const val __USE_POSIX: Int = 1

const val __USE_POSIX2: Int = 1

const val __USE_POSIX199309: Int = 1

const val __USE_POSIX199506: Int = 1

const val __USE_XOPEN2K: Int = 1

const val __USE_XOPEN2K8: Int = 1

const val _ATFILE_SOURCE: Int = 1

const val __USE_MISC: Int = 1

const val __USE_ATFILE: Int = 1

const val __USE_FORTIFY_LEVEL: Int = 0

const val __GLIBC_USE_DEPRECATED_GETS: Int = 0

const val _STDC_PREDEF_H: Int = 1

const val __STDC_IEC_559__: Int = 1

const val __STDC_IEC_559_COMPLEX__: Int = 1

const val __STDC_ISO_10646__: Long = 201706

const val __STDC_NO_THREADS__: Int = 1

const val __GNU_LIBRARY__: Int = 6

const val __GLIBC__: Int = 2

const val __GLIBC_MINOR__: Int = 27

const val _SYS_CDEFS_H: Int = 1

const val __glibc_c99_flexarr_available: Int = 1

const val __WORDSIZE: Int = 64

const val __WORDSIZE_TIME64_COMPAT32: Int = 1

const val __SYSCALL_WORDSIZE: Int = 64

const val __HAVE_GENERIC_SELECTION: Int = 1

const val __GLIBC_USE_LIB_EXT2: Int = 0

const val __GLIBC_USE_IEC_60559_BFP_EXT: Int = 0

const val __GLIBC_USE_IEC_60559_FUNCS_EXT: Int = 0

const val __GLIBC_USE_IEC_60559_TYPES_EXT: Int = 0

const val MB_LEN_MAX: Int = 16

const val _BITS_POSIX1_LIM_H: Int = 1

const val _POSIX_AIO_LISTIO_MAX: Int = 2

const val _POSIX_AIO_MAX: Int = 1

const val _POSIX_ARG_MAX: Int = 4096

const val _POSIX_CHILD_MAX: Int = 25

const val _POSIX_DELAYTIMER_MAX: Int = 32

const val _POSIX_HOST_NAME_MAX: Int = 255

const val _POSIX_LINK_MAX: Int = 8

const val _POSIX_LOGIN_NAME_MAX: Int = 9

const val _POSIX_MAX_CANON: Int = 255

const val _POSIX_MAX_INPUT: Int = 255

const val _POSIX_MQ_OPEN_MAX: Int = 8

const val _POSIX_MQ_PRIO_MAX: Int = 32

const val _POSIX_NAME_MAX: Int = 14

const val _POSIX_NGROUPS_MAX: Int = 8

const val _POSIX_OPEN_MAX: Int = 20

const val _POSIX_PATH_MAX: Int = 256

const val _POSIX_PIPE_BUF: Int = 512

const val _POSIX_RE_DUP_MAX: Int = 255

const val _POSIX_RTSIG_MAX: Int = 8

const val _POSIX_SEM_NSEMS_MAX: Int = 256

const val _POSIX_SEM_VALUE_MAX: Int = 32767

const val _POSIX_SIGQUEUE_MAX: Int = 32

const val _POSIX_SSIZE_MAX: Int = 32767

const val _POSIX_STREAM_MAX: Int = 8

const val _POSIX_SYMLINK_MAX: Int = 255

const val _POSIX_SYMLOOP_MAX: Int = 8

const val _POSIX_TIMER_MAX: Int = 32

const val _POSIX_TTY_NAME_MAX: Int = 9

const val _POSIX_TZNAME_MAX: Int = 6

const val _POSIX_CLOCKRES_MIN: Int = 20000000

const val NGROUPS_MAX: Int = 65536

const val MAX_CANON: Int = 255

const val MAX_INPUT: Int = 255

const val NAME_MAX: Int = 255

const val PATH_MAX: Int = 4096

const val PIPE_BUF: Int = 4096

const val XATTR_NAME_MAX: Int = 255

const val XATTR_SIZE_MAX: Int = 65536

const val XATTR_LIST_MAX: Int = 65536

const val RTSIG_MAX: Int = 32

const val _POSIX_THREAD_KEYS_MAX: Int = 128

const val PTHREAD_KEYS_MAX: Int = 1024

const val _POSIX_THREAD_DESTRUCTOR_ITERATIONS: Int = 4

const val PTHREAD_DESTRUCTOR_ITERATIONS: Int = 4

const val _POSIX_THREAD_THREADS_MAX: Int = 64

const val AIO_PRIO_DELTA_MAX: Int = 20

const val PTHREAD_STACK_MIN: Int = 16384

const val DELAYTIMER_MAX: Int = 2147483647

const val TTY_NAME_MAX: Int = 32

const val LOGIN_NAME_MAX: Int = 256

const val HOST_NAME_MAX: Int = 64

const val MQ_PRIO_MAX: Int = 32768

const val SEM_VALUE_MAX: Int = 2147483647

const val SSIZE_MAX: Long = 9223372036854775807

const val _BITS_POSIX2_LIM_H: Int = 1

const val _POSIX2_BC_BASE_MAX: Int = 99

const val _POSIX2_BC_DIM_MAX: Int = 2048

const val _POSIX2_BC_SCALE_MAX: Int = 99

const val _POSIX2_BC_STRING_MAX: Int = 1000

const val _POSIX2_COLL_WEIGHTS_MAX: Int = 2

const val _POSIX2_EXPR_NEST_MAX: Int = 32

const val _POSIX2_LINE_MAX: Int = 2048

const val _POSIX2_RE_DUP_MAX: Int = 255

const val _POSIX2_CHARCLASS_NAME_MAX: Int = 14

const val BC_BASE_MAX: Int = 99

const val BC_DIM_MAX: Int = 2048

const val BC_SCALE_MAX: Int = 99

const val BC_STRING_MAX: Int = 1000

const val COLL_WEIGHTS_MAX: Int = 255

const val EXPR_NEST_MAX: Int = 32

const val LINE_MAX: Int = 2048

const val CHARCLASS_NAME_MAX: Int = 2048

const val RE_DUP_MAX: Int = 32767

const val OSSL_SSIZE_MAX: Long = 9223372036854775807

const val _INTTYPES_H: Int = 1

const val _STDINT_H: Int = 1

const val _BITS_TYPES_H: Int = 1

const val _BITS_TYPESIZES_H: Int = 1

const val __OFF_T_MATCHES_OFF64_T: Int = 1

const val __INO_T_MATCHES_INO64_T: Int = 1

const val __RLIM_T_MATCHES_RLIM64_T: Int = 1

const val __FD_SETSIZE: Int = 1024

const val _BITS_WCHAR_H: Int = 1

const val __WCHAR_MAX: Int = 2147483647

const val __WCHAR_MIN: Int = -2147483648

const val _BITS_STDINT_INTN_H: Int = 1

const val _BITS_STDINT_UINTN_H: Int = 1

const val INT8_MIN: Int = -128

const val INT16_MIN: Int = -32768

const val INT32_MIN: Int = -2147483648

const val INT64_MIN: Long = -9223372036854775807 - 1

const val INT8_MAX: Int = 127

const val INT16_MAX: Int = 32767

const val INT32_MAX: Int = 2147483647

const val INT64_MAX: Long = 9223372036854775807

const val UINT8_MAX: Int = 255

const val UINT16_MAX: Int = 65535

const val UINT32_MAX: UInt = 4294967295u

const val UINT64_MAX: ULong = 18446744073709551615u

const val INT_LEAST8_MIN: Int = -128

const val INT_LEAST16_MIN: Int = -32768

const val INT_LEAST32_MIN: Int = -2147483648

const val INT_LEAST64_MIN: Long = -9223372036854775807 - 1

const val INT_LEAST8_MAX: Int = 127

const val INT_LEAST16_MAX: Int = 32767

const val INT_LEAST32_MAX: Int = 2147483647

const val INT_LEAST64_MAX: Long = 9223372036854775807

const val UINT_LEAST8_MAX: Int = 255

const val UINT_LEAST16_MAX: Int = 65535

const val UINT_LEAST32_MAX: UInt = 4294967295u

const val UINT_LEAST64_MAX: ULong = 18446744073709551615u

const val INT_FAST8_MIN: Int = -128

const val INT_FAST16_MIN: Long = -9223372036854775807 - 1

const val INT_FAST32_MIN: Long = -9223372036854775807 - 1

const val INT_FAST64_MIN: Long = -9223372036854775807 - 1

const val INT_FAST8_MAX: Int = 127

const val INT_FAST16_MAX: Long = 9223372036854775807

const val INT_FAST32_MAX: Long = 9223372036854775807

const val INT_FAST64_MAX: Long = 9223372036854775807

const val UINT_FAST8_MAX: Int = 255

const val UINT_FAST16_MAX: ULong = 18446744073709551615u

const val UINT_FAST32_MAX: ULong = 18446744073709551615u

const val UINT_FAST64_MAX: ULong = 18446744073709551615u

const val INTPTR_MIN: Long = -9223372036854775807 - 1

const val INTPTR_MAX: Long = 9223372036854775807

const val UINTPTR_MAX: ULong = 18446744073709551615u

const val INTMAX_MIN: Long = -9223372036854775807 - 1

const val INTMAX_MAX: Long = 9223372036854775807

const val UINTMAX_MAX: ULong = 18446744073709551615u

const val PTRDIFF_MIN: Long = -9223372036854775807 - 1

const val PTRDIFF_MAX: Long = 9223372036854775807

const val SIG_ATOMIC_MIN: Int = -2147483648

const val SIG_ATOMIC_MAX: Int = 2147483647

const val SIZE_MAX: ULong = 18446744073709551615u

const val WCHAR_MIN: Int = -2147483648

const val WCHAR_MAX: Int = 2147483647

const val WINT_MIN: UInt = 0u

const val WINT_MAX: UInt = 4294967295u

const val ____gwchar_t_defined: Int = 1

val __PRI64_PREFIX: String get() = "l"

val __PRIPTR_PREFIX: String get() = "l"

val PRId8: String get() = "d"

val PRId16: String get() = "d"

val PRId32: String get() = "d"

val PRId64: String get() = "ld"

val PRIdLEAST8: String get() = "d"

val PRIdLEAST16: String get() = "d"

val PRIdLEAST32: String get() = "d"

val PRIdLEAST64: String get() = "ld"

val PRIdFAST8: String get() = "d"

val PRIdFAST16: String get() = "ld"

val PRIdFAST32: String get() = "ld"

val PRIdFAST64: String get() = "ld"

val PRIi8: String get() = "i"

val PRIi16: String get() = "i"

val PRIi32: String get() = "i"

val PRIi64: String get() = "li"

val PRIiLEAST8: String get() = "i"

val PRIiLEAST16: String get() = "i"

val PRIiLEAST32: String get() = "i"

val PRIiLEAST64: String get() = "li"

val PRIiFAST8: String get() = "i"

val PRIiFAST16: String get() = "li"

val PRIiFAST32: String get() = "li"

val PRIiFAST64: String get() = "li"

val PRIo8: String get() = "o"

val PRIo16: String get() = "o"

val PRIo32: String get() = "o"

val PRIo64: String get() = "lo"

val PRIoLEAST8: String get() = "o"

val PRIoLEAST16: String get() = "o"

val PRIoLEAST32: String get() = "o"

val PRIoLEAST64: String get() = "lo"

val PRIoFAST8: String get() = "o"

val PRIoFAST16: String get() = "lo"

val PRIoFAST32: String get() = "lo"

val PRIoFAST64: String get() = "lo"

val PRIu8: String get() = "u"

val PRIu16: String get() = "u"

val PRIu32: String get() = "u"

val PRIu64: String get() = "lu"

val PRIuLEAST8: String get() = "u"

val PRIuLEAST16: String get() = "u"

val PRIuLEAST32: String get() = "u"

val PRIuLEAST64: String get() = "lu"

val PRIuFAST8: String get() = "u"

val PRIuFAST16: String get() = "lu"

val PRIuFAST32: String get() = "lu"

val PRIuFAST64: String get() = "lu"

val PRIx8: String get() = "x"

val PRIx16: String get() = "x"

val PRIx32: String get() = "x"

val PRIx64: String get() = "lx"

val PRIxLEAST8: String get() = "x"

val PRIxLEAST16: String get() = "x"

val PRIxLEAST32: String get() = "x"

val PRIxLEAST64: String get() = "lx"

val PRIxFAST8: String get() = "x"

val PRIxFAST16: String get() = "lx"

val PRIxFAST32: String get() = "lx"

val PRIxFAST64: String get() = "lx"

val PRIX8: String get() = "X"

val PRIX16: String get() = "X"

val PRIX32: String get() = "X"

val PRIX64: String get() = "lX"

val PRIXLEAST8: String get() = "X"

val PRIXLEAST16: String get() = "X"

val PRIXLEAST32: String get() = "X"

val PRIXLEAST64: String get() = "lX"

val PRIXFAST8: String get() = "X"

val PRIXFAST16: String get() = "lX"

val PRIXFAST32: String get() = "lX"

val PRIXFAST64: String get() = "lX"

val PRIdMAX: String get() = "ld"

val PRIiMAX: String get() = "li"

val PRIoMAX: String get() = "lo"

val PRIuMAX: String get() = "lu"

val PRIxMAX: String get() = "lx"

val PRIXMAX: String get() = "lX"

val PRIdPTR: String get() = "ld"

val PRIiPTR: String get() = "li"

val PRIoPTR: String get() = "lo"

val PRIuPTR: String get() = "lu"

val PRIxPTR: String get() = "lx"

val PRIXPTR: String get() = "lX"

val SCNd8: String get() = "hhd"

val SCNd16: String get() = "hd"

val SCNd32: String get() = "d"

val SCNd64: String get() = "ld"

val SCNdLEAST8: String get() = "hhd"

val SCNdLEAST16: String get() = "hd"

val SCNdLEAST32: String get() = "d"

val SCNdLEAST64: String get() = "ld"

val SCNdFAST8: String get() = "hhd"

val SCNdFAST16: String get() = "ld"

val SCNdFAST32: String get() = "ld"

val SCNdFAST64: String get() = "ld"

val SCNi8: String get() = "hhi"

val SCNi16: String get() = "hi"

val SCNi32: String get() = "i"

val SCNi64: String get() = "li"

val SCNiLEAST8: String get() = "hhi"

val SCNiLEAST16: String get() = "hi"

val SCNiLEAST32: String get() = "i"

val SCNiLEAST64: String get() = "li"

val SCNiFAST8: String get() = "hhi"

val SCNiFAST16: String get() = "li"

val SCNiFAST32: String get() = "li"

val SCNiFAST64: String get() = "li"

val SCNu8: String get() = "hhu"

val SCNu16: String get() = "hu"

val SCNu32: String get() = "u"

val SCNu64: String get() = "lu"

val SCNuLEAST8: String get() = "hhu"

val SCNuLEAST16: String get() = "hu"

val SCNuLEAST32: String get() = "u"

val SCNuLEAST64: String get() = "lu"

val SCNuFAST8: String get() = "hhu"

val SCNuFAST16: String get() = "lu"

val SCNuFAST32: String get() = "lu"

val SCNuFAST64: String get() = "lu"

val SCNo8: String get() = "hho"

val SCNo16: String get() = "ho"

val SCNo32: String get() = "o"

val SCNo64: String get() = "lo"

val SCNoLEAST8: String get() = "hho"

val SCNoLEAST16: String get() = "ho"

val SCNoLEAST32: String get() = "o"

val SCNoLEAST64: String get() = "lo"

val SCNoFAST8: String get() = "hho"

val SCNoFAST16: String get() = "lo"

val SCNoFAST32: String get() = "lo"

val SCNoFAST64: String get() = "lo"

val SCNx8: String get() = "hhx"

val SCNx16: String get() = "hx"

val SCNx32: String get() = "x"

val SCNx64: String get() = "lx"

val SCNxLEAST8: String get() = "hhx"

val SCNxLEAST16: String get() = "hx"

val SCNxLEAST32: String get() = "x"

val SCNxLEAST64: String get() = "lx"

val SCNxFAST8: String get() = "hhx"

val SCNxFAST16: String get() = "lx"

val SCNxFAST32: String get() = "lx"

val SCNxFAST64: String get() = "lx"

val SCNdMAX: String get() = "ld"

val SCNiMAX: String get() = "li"

val SCNoMAX: String get() = "lo"

val SCNuMAX: String get() = "lu"

val SCNxMAX: String get() = "lx"

val SCNdPTR: String get() = "ld"

val SCNiPTR: String get() = "li"

val SCNoPTR: String get() = "lo"

val SCNuPTR: String get() = "lu"

val SCNxPTR: String get() = "lx"

const val _STDIO_H: Int = 1

const val ____FILE_defined: Int = 1

const val __FILE_defined: Int = 1

const val _BITS_LIBIO_H: Int = 1

const val _BITS_G_CONFIG_H: Int = 1

const val ____mbstate_t_defined: Int = 1

const val _G_HAVE_MMAP: Int = 1

const val _G_HAVE_MREMAP: Int = 1

const val _G_IO_IO_FILE_VERSION: Int = 131073

const val _G_BUFSIZ: Int = 8192

const val _IO_BUFSIZ: Int = 8192

const val _IO_UNIFIED_JUMPTABLES: Int = 1

const val EOF: Int = -1

const val _IOS_INPUT: Int = 1

const val _IOS_OUTPUT: Int = 2

const val _IOS_ATEND: Int = 4

const val _IOS_APPEND: Int = 8

const val _IOS_TRUNC: Int = 16

const val _IOS_NOCREATE: Int = 32

const val _IOS_NOREPLACE: Int = 64

const val _IOS_BIN: Int = 128

const val _IO_MAGIC: UInt = 4222418944u

const val _OLD_STDIO_MAGIC: UInt = 4206624768u

const val _IO_MAGIC_MASK: UInt = 4294901760u

const val _IO_USER_BUF: Int = 1

const val _IO_UNBUFFERED: Int = 2

const val _IO_NO_READS: Int = 4

const val _IO_NO_WRITES: Int = 8

const val _IO_EOF_SEEN: Int = 16

const val _IO_ERR_SEEN: Int = 32

const val _IO_DELETE_DONT_CLOSE: Int = 64

const val _IO_LINKED: Int = 128

const val _IO_IN_BACKUP: Int = 256

const val _IO_LINE_BUF: Int = 512

const val _IO_TIED_PUT_GET: Int = 1024

const val _IO_CURRENTLY_PUTTING: Int = 2048

const val _IO_IS_APPENDING: Int = 4096

const val _IO_IS_FILEBUF: Int = 8192

const val _IO_BAD_SEEN: Int = 16384

const val _IO_USER_LOCK: Int = 32768

const val _IO_FLAGS2_MMAP: Int = 1

const val _IO_FLAGS2_NOTCANCEL: Int = 2

const val _IO_FLAGS2_USER_WBUF: Int = 8

const val _IO_SKIPWS: Int = 1

const val _IO_LEFT: Int = 2

const val _IO_RIGHT: Int = 4

const val _IO_INTERNAL: Int = 8

const val _IO_DEC: Int = 16

const val _IO_OCT: Int = 32

const val _IO_HEX: Int = 64

const val _IO_SHOWBASE: Int = 128

const val _IO_SHOWPOINT: Int = 256

const val _IO_UPPERCASE: Int = 512

const val _IO_SHOWPOS: Int = 1024

const val _IO_SCIENTIFIC: Int = 2048

const val _IO_FIXED: Int = 4096

const val _IO_UNITBUF: Int = 8192

const val _IO_STDIO: Int = 16384

const val _IO_DONT_CLOSE: Int = 32768

const val _IO_BOOLALPHA: Int = 65536

const val _IOFBF: Int = 0

const val _IOLBF: Int = 1

const val _IONBF: Int = 2

const val BUFSIZ: Int = 8192

const val SEEK_SET: Int = 0

const val SEEK_CUR: Int = 1

const val SEEK_END: Int = 2

val P_tmpdir: String get() = "\u002Ftmp"

const val _BITS_STDIO_LIM_H: Int = 1

const val L_tmpnam: Int = 20

const val TMP_MAX: Int = 238328

const val FILENAME_MAX: Int = 4096

const val L_ctermid: Int = 9

const val FOPEN_MAX: Int = 16

const val _STDLIB_H: Int = 1

const val WNOHANG: Int = 1

const val WUNTRACED: Int = 2

const val WSTOPPED: Int = 2

const val WEXITED: Int = 4

const val WCONTINUED: Int = 8

const val WNOWAIT: Int = 16777216

const val __WNOTHREAD: Int = 536870912

const val __WALL: Int = 1073741824

const val __WCLONE: UInt = 2147483648u

const val __ENUM_IDTYPE_T: Int = 1

const val __W_CONTINUED: Int = 65535

const val __WCOREFLAG: Int = 128

const val __HAVE_FLOAT128: Int = 0

const val __HAVE_DISTINCT_FLOAT128: Int = 0

const val __HAVE_FLOAT64X: Int = 1

const val __HAVE_FLOAT64X_LONG_DOUBLE: Int = 1

const val __HAVE_FLOAT16: Int = 0

const val __HAVE_FLOAT32: Int = 1

const val __HAVE_FLOAT64: Int = 1

const val __HAVE_FLOAT32X: Int = 1

const val __HAVE_FLOAT128X: Int = 0

const val __HAVE_DISTINCT_FLOAT16: Int = 0

const val __HAVE_DISTINCT_FLOAT32: Int = 0

const val __HAVE_DISTINCT_FLOAT64: Int = 0

const val __HAVE_DISTINCT_FLOAT32X: Int = 0

const val __HAVE_DISTINCT_FLOAT64X: Int = 0

const val __HAVE_DISTINCT_FLOAT128X: Int = 0

const val __HAVE_FLOATN_NOT_TYPEDEF: Int = 0

const val __ldiv_t_defined: Int = 1

const val __lldiv_t_defined: Int = 1

const val RAND_MAX: Int = 2147483647

const val EXIT_FAILURE: Int = 1

const val EXIT_SUCCESS: Int = 0

const val _SYS_TYPES_H: Int = 1

const val __clock_t_defined: Int = 1

const val __clockid_t_defined: Int = 1

const val __time_t_defined: Int = 1

const val __timer_t_defined: Int = 1

const val __BIT_TYPES_DEFINED__: Int = 1

const val _ENDIAN_H: Int = 1

const val __LITTLE_ENDIAN: Int = 1234

const val __BIG_ENDIAN: Int = 4321

const val __PDP_ENDIAN: Int = 3412

const val __BYTE_ORDER: Int = 1234

const val __FLOAT_WORD_ORDER: Int = 1234

const val LITTLE_ENDIAN: Int = 1234

const val BIG_ENDIAN: Int = 4321

const val PDP_ENDIAN: Int = 3412

const val BYTE_ORDER: Int = 1234

const val _BITS_BYTESWAP_H: Int = 1

const val _BITS_UINTN_IDENTITY_H: Int = 1

const val _SYS_SELECT_H: Int = 1

val __FD_ZERO_STOS: String get() = "stosq"

const val __sigset_t_defined: Int = 1

const val _SIGSET_NWORDS: ULong = 16u

const val __timeval_defined: Int = 1

const val __timespec_defined: Int = 1

const val __NFDBITS: Int = 64

const val FD_SETSIZE: Int = 1024

const val NFDBITS: Int = 64

const val _SYS_SYSMACROS_H: Int = 1

const val _BITS_SYSMACROS_H: Int = 1

const val _BITS_PTHREADTYPES_COMMON_H: Int = 1

const val _THREAD_SHARED_TYPES_H: Int = 1

const val _BITS_PTHREADTYPES_ARCH_H: Int = 1

const val __SIZEOF_PTHREAD_MUTEX_T: Int = 40

const val __SIZEOF_PTHREAD_ATTR_T: Int = 56

const val __SIZEOF_PTHREAD_RWLOCK_T: Int = 56

const val __SIZEOF_PTHREAD_BARRIER_T: Int = 32

const val __SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

const val __SIZEOF_PTHREAD_COND_T: Int = 48

const val __SIZEOF_PTHREAD_CONDATTR_T: Int = 4

const val __SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

const val __SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

const val __PTHREAD_MUTEX_LOCK_ELISION: Int = 1

const val __PTHREAD_MUTEX_NUSERS_AFTER_KIND: Int = 0

const val __PTHREAD_MUTEX_USE_UNION: Int = 0

const val __PTHREAD_RWLOCK_INT_FLAGS_SHARED: Int = 1

const val __PTHREAD_MUTEX_HAVE_PREV: Int = 1

const val __have_pthread_attr_t: Int = 1

const val _ALLOCA_H: Int = 1

const val _TIME_H: Int = 1

const val _BITS_TIME_H: Int = 1

const val CLOCKS_PER_SEC: __clock_t = 1000000

const val CLOCK_REALTIME: Int = 0

const val CLOCK_MONOTONIC: Int = 1

const val CLOCK_PROCESS_CPUTIME_ID: Int = 2

const val CLOCK_THREAD_CPUTIME_ID: Int = 3

const val CLOCK_MONOTONIC_RAW: Int = 4

const val CLOCK_REALTIME_COARSE: Int = 5

const val CLOCK_MONOTONIC_COARSE: Int = 6

const val CLOCK_BOOTTIME: Int = 7

const val CLOCK_REALTIME_ALARM: Int = 8

const val CLOCK_BOOTTIME_ALARM: Int = 9

const val CLOCK_TAI: Int = 11

const val TIMER_ABSTIME: Int = 1

const val __struct_tm_defined: Int = 1

const val __itimerspec_defined: Int = 1

const val _BITS_TYPES_LOCALE_T_H: Int = 1

const val _BITS_TYPES___LOCALE_T_H: Int = 1

const val TIME_UTC: Int = 1

const val OPENSSL_VERSION_NUMBER: Long = 269484159

val OPENSSL_VERSION_TEXT: String get() = "OpenSSL 1.1.0g  2 Nov 2017"

val SHLIB_VERSION_HISTORY: String get() = ""

val SHLIB_VERSION_NUMBER: String get() = "1.1"

const val SSLEAY_VERSION_NUMBER: Long = 269484159

const val SSLEAY_VERSION: Int = 0

const val SSLEAY_CFLAGS: Int = 1

const val SSLEAY_BUILT_ON: Int = 2

const val SSLEAY_PLATFORM: Int = 3

const val SSLEAY_DIR: Int = 4

const val CRYPTO_MEM_CHECK_OFF: Int = 0

const val CRYPTO_MEM_CHECK_ON: Int = 1

const val CRYPTO_MEM_CHECK_ENABLE: Int = 2

const val CRYPTO_MEM_CHECK_DISABLE: Int = 3

const val CRYPTO_EX_INDEX_SSL: Int = 0

const val CRYPTO_EX_INDEX_SSL_CTX: Int = 1

const val CRYPTO_EX_INDEX_SSL_SESSION: Int = 2

const val CRYPTO_EX_INDEX_X509: Int = 3

const val CRYPTO_EX_INDEX_X509_STORE: Int = 4

const val CRYPTO_EX_INDEX_X509_STORE_CTX: Int = 5

const val CRYPTO_EX_INDEX_DH: Int = 6

const val CRYPTO_EX_INDEX_DSA: Int = 7

const val CRYPTO_EX_INDEX_EC_KEY: Int = 8

const val CRYPTO_EX_INDEX_RSA: Int = 9

const val CRYPTO_EX_INDEX_ENGINE: Int = 10

const val CRYPTO_EX_INDEX_UI: Int = 11

const val CRYPTO_EX_INDEX_BIO: Int = 12

const val CRYPTO_EX_INDEX_APP: Int = 13

const val CRYPTO_EX_INDEX__COUNT: Int = 14

const val OPENSSL_VERSION: Int = 0

const val OPENSSL_CFLAGS: Int = 1

const val OPENSSL_BUILT_ON: Int = 2

const val OPENSSL_PLATFORM: Int = 3

const val OPENSSL_DIR: Int = 4

const val OPENSSL_ENGINES_DIR: Int = 5

const val CRYPTO_LOCK: Int = 1

const val CRYPTO_UNLOCK: Int = 2

const val CRYPTO_READ: Int = 4

const val CRYPTO_WRITE: Int = 8

const val OPENSSL_INIT_NO_LOAD_CRYPTO_STRINGS: Long = 1

const val OPENSSL_INIT_LOAD_CRYPTO_STRINGS: Long = 2

const val OPENSSL_INIT_ADD_ALL_CIPHERS: Long = 4

const val OPENSSL_INIT_ADD_ALL_DIGESTS: Long = 8

const val OPENSSL_INIT_NO_ADD_ALL_CIPHERS: Long = 16

const val OPENSSL_INIT_NO_ADD_ALL_DIGESTS: Long = 32

const val OPENSSL_INIT_LOAD_CONFIG: Long = 64

const val OPENSSL_INIT_NO_LOAD_CONFIG: Long = 128

const val OPENSSL_INIT_ASYNC: Long = 256

const val OPENSSL_INIT_ENGINE_RDRAND: Long = 512

const val OPENSSL_INIT_ENGINE_DYNAMIC: Long = 1024

const val OPENSSL_INIT_ENGINE_OPENSSL: Long = 2048

const val OPENSSL_INIT_ENGINE_CRYPTODEV: Long = 4096

const val OPENSSL_INIT_ENGINE_CAPI: Long = 8192

const val OPENSSL_INIT_ENGINE_PADLOCK: Long = 16384

const val OPENSSL_INIT_ENGINE_AFALG: Long = 32768

const val OPENSSL_INIT_ENGINE_ALL_BUILTIN: Long = 30208

const val _PTHREAD_H: Int = 1

const val _SCHED_H: Int = 1

const val _BITS_SCHED_H: Int = 1

const val SCHED_OTHER: Int = 0

const val SCHED_FIFO: Int = 1

const val SCHED_RR: Int = 2

const val _BITS_CPU_SET_H: Int = 1

const val __CPU_SETSIZE: Int = 1024

const val __NCPUBITS: ULong = 64u

const val _BITS_SETJMP_H: Int = 1

const val PTHREAD_CREATE_JOINABLE: Int = 0

const val PTHREAD_CREATE_DETACHED: Int = 1

const val PTHREAD_INHERIT_SCHED: Int = 0

const val PTHREAD_EXPLICIT_SCHED: Int = 1

const val PTHREAD_SCOPE_SYSTEM: Int = 0

const val PTHREAD_SCOPE_PROCESS: Int = 1

const val PTHREAD_PROCESS_PRIVATE: Int = 0

const val PTHREAD_PROCESS_SHARED: Int = 1

const val PTHREAD_CANCEL_ENABLE: Int = 0

const val PTHREAD_CANCEL_DISABLE: Int = 1

const val PTHREAD_CANCEL_DEFERRED: Int = 0

const val PTHREAD_CANCEL_ASYNCHRONOUS: Int = 1

const val PTHREAD_ONCE_INIT: Int = 0

const val PTHREAD_BARRIER_SERIAL_THREAD: Int = -1

const val CRYPTO_ONCE_STATIC_INIT: Int = 0

const val CRYPTO_F_CRYPTO_DUP_EX_DATA: Int = 110

const val CRYPTO_F_CRYPTO_FREE_EX_DATA: Int = 111

const val CRYPTO_F_CRYPTO_GET_EX_NEW_INDEX: Int = 100

const val CRYPTO_F_CRYPTO_MEMDUP: Int = 115

const val CRYPTO_F_CRYPTO_NEW_EX_DATA: Int = 112

const val CRYPTO_F_CRYPTO_SET_EX_DATA: Int = 102

const val CRYPTO_F_FIPS_MODE_SET: Int = 109

const val CRYPTO_F_GET_AND_LOCK: Int = 113

const val CRYPTO_F_OPENSSL_BUF2HEXSTR: Int = 117

const val CRYPTO_F_OPENSSL_HEXSTR2BUF: Int = 118

const val CRYPTO_F_OPENSSL_INIT_CRYPTO: Int = 116

const val CRYPTO_R_FIPS_MODE_NOT_SUPPORTED: Int = 101

const val CRYPTO_R_ILLEGAL_HEX_DIGIT: Int = 102

const val CRYPTO_R_ODD_NUMBER_OF_DIGITS: Int = 103

const val BIO_TYPE_DESCRIPTOR: Int = 256

const val BIO_TYPE_FILTER: Int = 512

const val BIO_TYPE_SOURCE_SINK: Int = 1024

const val BIO_TYPE_NONE: Int = 0

const val BIO_TYPE_MEM: Int = 1025

const val BIO_TYPE_FILE: Int = 1026

const val BIO_TYPE_FD: Int = 1284

const val BIO_TYPE_SOCKET: Int = 1285

const val BIO_TYPE_NULL: Int = 1030

const val BIO_TYPE_SSL: Int = 519

const val BIO_TYPE_MD: Int = 520

const val BIO_TYPE_BUFFER: Int = 521

const val BIO_TYPE_CIPHER: Int = 522

const val BIO_TYPE_BASE64: Int = 523

const val BIO_TYPE_CONNECT: Int = 1292

const val BIO_TYPE_ACCEPT: Int = 1293

const val BIO_TYPE_NBIO_TEST: Int = 528

const val BIO_TYPE_NULL_FILTER: Int = 529

const val BIO_TYPE_BIO: Int = 1043

const val BIO_TYPE_LINEBUFFER: Int = 532

const val BIO_TYPE_DGRAM: Int = 1301

const val BIO_TYPE_ASN1: Int = 534

const val BIO_TYPE_COMP: Int = 535

const val BIO_TYPE_START: Int = 128

const val BIO_NOCLOSE: Int = 0

const val BIO_CLOSE: Int = 1

const val BIO_CTRL_RESET: Int = 1

const val BIO_CTRL_EOF: Int = 2

const val BIO_CTRL_INFO: Int = 3

const val BIO_CTRL_SET: Int = 4

const val BIO_CTRL_GET: Int = 5

const val BIO_CTRL_PUSH: Int = 6

const val BIO_CTRL_POP: Int = 7

const val BIO_CTRL_GET_CLOSE: Int = 8

const val BIO_CTRL_SET_CLOSE: Int = 9

const val BIO_CTRL_PENDING: Int = 10

const val BIO_CTRL_FLUSH: Int = 11

const val BIO_CTRL_DUP: Int = 12

const val BIO_CTRL_WPENDING: Int = 13

const val BIO_CTRL_SET_CALLBACK: Int = 14

const val BIO_CTRL_GET_CALLBACK: Int = 15

const val BIO_CTRL_SET_FILENAME: Int = 30

const val BIO_CTRL_DGRAM_CONNECT: Int = 31

const val BIO_CTRL_DGRAM_SET_CONNECTED: Int = 32

const val BIO_CTRL_DGRAM_SET_RECV_TIMEOUT: Int = 33

const val BIO_CTRL_DGRAM_GET_RECV_TIMEOUT: Int = 34

const val BIO_CTRL_DGRAM_SET_SEND_TIMEOUT: Int = 35

const val BIO_CTRL_DGRAM_GET_SEND_TIMEOUT: Int = 36

const val BIO_CTRL_DGRAM_GET_RECV_TIMER_EXP: Int = 37

const val BIO_CTRL_DGRAM_GET_SEND_TIMER_EXP: Int = 38

const val BIO_CTRL_DGRAM_MTU_DISCOVER: Int = 39

const val BIO_CTRL_DGRAM_QUERY_MTU: Int = 40

const val BIO_CTRL_DGRAM_GET_FALLBACK_MTU: Int = 47

const val BIO_CTRL_DGRAM_GET_MTU: Int = 41

const val BIO_CTRL_DGRAM_SET_MTU: Int = 42

const val BIO_CTRL_DGRAM_MTU_EXCEEDED: Int = 43

const val BIO_CTRL_DGRAM_GET_PEER: Int = 46

const val BIO_CTRL_DGRAM_SET_PEER: Int = 44

const val BIO_CTRL_DGRAM_SET_NEXT_TIMEOUT: Int = 45

const val BIO_CTRL_DGRAM_SET_DONT_FRAG: Int = 48

const val BIO_CTRL_DGRAM_GET_MTU_OVERHEAD: Int = 49

const val BIO_CTRL_DGRAM_SCTP_SET_IN_HANDSHAKE: Int = 50

const val BIO_CTRL_DGRAM_SET_PEEK_MODE: Int = 71

const val BIO_FP_READ: Int = 2

const val BIO_FP_WRITE: Int = 4

const val BIO_FP_APPEND: Int = 8

const val BIO_FP_TEXT: Int = 16

const val BIO_FLAGS_READ: Int = 1

const val BIO_FLAGS_WRITE: Int = 2

const val BIO_FLAGS_IO_SPECIAL: Int = 4

const val BIO_FLAGS_RWS: Int = 7

const val BIO_FLAGS_SHOULD_RETRY: Int = 8

const val BIO_FLAGS_UPLINK: Int = 0

const val BIO_FLAGS_BASE64_NO_NL: Int = 256

const val BIO_FLAGS_MEM_RDONLY: Int = 512

const val BIO_FLAGS_NONCLEAR_RST: Int = 1024

const val BIO_RR_SSL_X509_LOOKUP: Int = 1

const val BIO_RR_CONNECT: Int = 2

const val BIO_RR_ACCEPT: Int = 3

const val BIO_CB_FREE: Int = 1

const val BIO_CB_READ: Int = 2

const val BIO_CB_WRITE: Int = 3

const val BIO_CB_PUTS: Int = 4

const val BIO_CB_GETS: Int = 5

const val BIO_CB_CTRL: Int = 6

const val BIO_CB_RETURN: Int = 128

const val BIO_C_SET_CONNECT: Int = 100

const val BIO_C_DO_STATE_MACHINE: Int = 101

const val BIO_C_SET_NBIO: Int = 102

const val BIO_C_SET_FD: Int = 104

const val BIO_C_GET_FD: Int = 105

const val BIO_C_SET_FILE_PTR: Int = 106

const val BIO_C_GET_FILE_PTR: Int = 107

const val BIO_C_SET_FILENAME: Int = 108

const val BIO_C_SET_SSL: Int = 109

const val BIO_C_GET_SSL: Int = 110

const val BIO_C_SET_MD: Int = 111

const val BIO_C_GET_MD: Int = 112

const val BIO_C_GET_CIPHER_STATUS: Int = 113

const val BIO_C_SET_BUF_MEM: Int = 114

const val BIO_C_GET_BUF_MEM_PTR: Int = 115

const val BIO_C_GET_BUFF_NUM_LINES: Int = 116

const val BIO_C_SET_BUFF_SIZE: Int = 117

const val BIO_C_SET_ACCEPT: Int = 118

const val BIO_C_SSL_MODE: Int = 119

const val BIO_C_GET_MD_CTX: Int = 120

const val BIO_C_SET_BUFF_READ_DATA: Int = 122

const val BIO_C_GET_CONNECT: Int = 123

const val BIO_C_GET_ACCEPT: Int = 124

const val BIO_C_SET_SSL_RENEGOTIATE_BYTES: Int = 125

const val BIO_C_GET_SSL_NUM_RENEGOTIATES: Int = 126

const val BIO_C_SET_SSL_RENEGOTIATE_TIMEOUT: Int = 127

const val BIO_C_FILE_SEEK: Int = 128

const val BIO_C_GET_CIPHER_CTX: Int = 129

const val BIO_C_SET_BUF_MEM_EOF_RETURN: Int = 130

const val BIO_C_SET_BIND_MODE: Int = 131

const val BIO_C_GET_BIND_MODE: Int = 132

const val BIO_C_FILE_TELL: Int = 133

const val BIO_C_GET_SOCKS: Int = 134

const val BIO_C_SET_SOCKS: Int = 135

const val BIO_C_SET_WRITE_BUF_SIZE: Int = 136

const val BIO_C_GET_WRITE_BUF_SIZE: Int = 137

const val BIO_C_MAKE_BIO_PAIR: Int = 138

const val BIO_C_DESTROY_BIO_PAIR: Int = 139

const val BIO_C_GET_WRITE_GUARANTEE: Int = 140

const val BIO_C_GET_READ_REQUEST: Int = 141

const val BIO_C_SHUTDOWN_WR: Int = 142

const val BIO_C_NREAD0: Int = 143

const val BIO_C_NREAD: Int = 144

const val BIO_C_NWRITE0: Int = 145

const val BIO_C_NWRITE: Int = 146

const val BIO_C_RESET_READ_REQUEST: Int = 147

const val BIO_C_SET_MD_CTX: Int = 148

const val BIO_C_SET_PREFIX: Int = 149

const val BIO_C_GET_PREFIX: Int = 150

const val BIO_C_SET_SUFFIX: Int = 151

const val BIO_C_GET_SUFFIX: Int = 152

const val BIO_C_SET_EX_ARG: Int = 153

const val BIO_C_GET_EX_ARG: Int = 154

const val BIO_C_SET_CONNECT_MODE: Int = 155

const val BIO_FAMILY_IPV4: Int = 4

const val BIO_FAMILY_IPV6: Int = 6

const val BIO_FAMILY_IPANY: Int = 256

const val BIO_BIND_NORMAL: Int = 0

const val BIO_BIND_REUSEADDR: Int = 1

const val BIO_BIND_REUSEADDR_IF_UNUSED: Int = 1

const val BIO_SOCK_REUSEADDR: Int = 1

const val BIO_SOCK_V6_ONLY: Int = 2

const val BIO_SOCK_KEEPALIVE: Int = 4

const val BIO_SOCK_NONBLOCK: Int = 8

const val BIO_SOCK_NODELAY: Int = 16

const val BIO_F_ACPT_STATE: Int = 100

const val BIO_F_ADDR_STRINGS: Int = 134

const val BIO_F_BIO_ACCEPT: Int = 101

const val BIO_F_BIO_ACCEPT_EX: Int = 137

const val BIO_F_BIO_ADDR_NEW: Int = 144

const val BIO_F_BIO_CALLBACK_CTRL: Int = 131

const val BIO_F_BIO_CONNECT: Int = 138

const val BIO_F_BIO_CTRL: Int = 103

const val BIO_F_BIO_GETS: Int = 104

const val BIO_F_BIO_GET_HOST_IP: Int = 106

const val BIO_F_BIO_GET_NEW_INDEX: Int = 102

const val BIO_F_BIO_GET_PORT: Int = 107

const val BIO_F_BIO_LISTEN: Int = 139

const val BIO_F_BIO_LOOKUP: Int = 135

const val BIO_F_BIO_MAKE_PAIR: Int = 121

const val BIO_F_BIO_NEW: Int = 108

const val BIO_F_BIO_NEW_FILE: Int = 109

const val BIO_F_BIO_NEW_MEM_BUF: Int = 126

const val BIO_F_BIO_NREAD: Int = 123

const val BIO_F_BIO_NREAD0: Int = 124

const val BIO_F_BIO_NWRITE: Int = 125

const val BIO_F_BIO_NWRITE0: Int = 122

const val BIO_F_BIO_PARSE_HOSTSERV: Int = 136

const val BIO_F_BIO_PUTS: Int = 110

const val BIO_F_BIO_READ: Int = 111

const val BIO_F_BIO_SOCKET: Int = 140

const val BIO_F_BIO_SOCKET_NBIO: Int = 142

const val BIO_F_BIO_SOCK_INFO: Int = 141

const val BIO_F_BIO_SOCK_INIT: Int = 112

const val BIO_F_BIO_WRITE: Int = 113

const val BIO_F_BUFFER_CTRL: Int = 114

const val BIO_F_CONN_CTRL: Int = 127

const val BIO_F_CONN_STATE: Int = 115

const val BIO_F_DGRAM_SCTP_READ: Int = 132

const val BIO_F_DGRAM_SCTP_WRITE: Int = 133

const val BIO_F_FILE_CTRL: Int = 116

const val BIO_F_FILE_READ: Int = 130

const val BIO_F_LINEBUFFER_CTRL: Int = 129

const val BIO_F_MEM_WRITE: Int = 117

const val BIO_F_SSL_NEW: Int = 118

const val BIO_R_ACCEPT_ERROR: Int = 100

const val BIO_R_ADDRINFO_ADDR_IS_NOT_AF_INET: Int = 141

const val BIO_R_AMBIGUOUS_HOST_OR_SERVICE: Int = 129

const val BIO_R_BAD_FOPEN_MODE: Int = 101

const val BIO_R_BROKEN_PIPE: Int = 124

const val BIO_R_CONNECT_ERROR: Int = 103

const val BIO_R_GETHOSTBYNAME_ADDR_IS_NOT_AF_INET: Int = 107

const val BIO_R_GETSOCKNAME_ERROR: Int = 132

const val BIO_R_GETSOCKNAME_TRUNCATED_ADDRESS: Int = 133

const val BIO_R_GETTING_SOCKTYPE: Int = 134

const val BIO_R_INVALID_ARGUMENT: Int = 125

const val BIO_R_INVALID_SOCKET: Int = 135

const val BIO_R_IN_USE: Int = 123

const val BIO_R_LISTEN_V6_ONLY: Int = 136

const val BIO_R_LOOKUP_RETURNED_NOTHING: Int = 142

const val BIO_R_MALFORMED_HOST_OR_SERVICE: Int = 130

const val BIO_R_NBIO_CONNECT_ERROR: Int = 110

const val BIO_R_NO_ACCEPT_ADDR_OR_SERVICE_SPECIFIED: Int = 143

const val BIO_R_NO_HOSTNAME_OR_SERVICE_SPECIFIED: Int = 144

const val BIO_R_NO_PORT_DEFINED: Int = 113

const val BIO_R_NO_SUCH_FILE: Int = 128

const val BIO_R_NULL_PARAMETER: Int = 115

const val BIO_R_UNABLE_TO_BIND_SOCKET: Int = 117

const val BIO_R_UNABLE_TO_CREATE_SOCKET: Int = 118

const val BIO_R_UNABLE_TO_KEEPALIVE: Int = 137

const val BIO_R_UNABLE_TO_LISTEN_SOCKET: Int = 119

const val BIO_R_UNABLE_TO_NODELAY: Int = 138

const val BIO_R_UNABLE_TO_REUSEADDR: Int = 139

const val BIO_R_UNAVAILABLE_IP_FAMILY: Int = 145

const val BIO_R_UNINITIALIZED: Int = 120

const val BIO_R_UNKNOWN_INFO_TYPE: Int = 140

const val BIO_R_UNSUPPORTED_IP_FAMILY: Int = 146

const val BIO_R_UNSUPPORTED_METHOD: Int = 121

const val BIO_R_UNSUPPORTED_PROTOCOL_FAMILY: Int = 131

const val BIO_R_WRITE_TO_READ_ONLY_BIO: Int = 126

const val BIO_R_WSASTARTUP: Int = 122

const val EVP_MAX_MD_SIZE: Int = 64

const val EVP_MAX_KEY_LENGTH: Int = 64

const val EVP_MAX_IV_LENGTH: Int = 16

const val EVP_MAX_BLOCK_LENGTH: Int = 32

const val PKCS5_SALT_LEN: Int = 8

const val PKCS5_DEFAULT_ITER: Int = 2048

val SN_undef: String get() = "UNDEF"

val LN_undef: String get() = "undefined"

const val NID_undef: Int = 0

const val OBJ_undef: Long = 0

val SN_itu_t: String get() = "ITU\u002DT"

val LN_itu_t: String get() = "itu\u002Dt"

const val NID_itu_t: Int = 645

const val OBJ_itu_t: Long = 0

const val NID_ccitt: Int = 404

const val OBJ_ccitt: Long = 0

val SN_iso: String get() = "ISO"

val LN_iso: String get() = "iso"

const val NID_iso: Int = 181

const val OBJ_iso: Long = 1

val SN_joint_iso_itu_t: String get() = "JOINT\u002DISO\u002DITU\u002DT"

val LN_joint_iso_itu_t: String get() = "joint\u002Diso\u002Ditu\u002Dt"

const val NID_joint_iso_itu_t: Int = 646

const val OBJ_joint_iso_itu_t: Long = 2

const val NID_joint_iso_ccitt: Int = 393

const val OBJ_joint_iso_ccitt: Long = 2

val SN_member_body: String get() = "member\u002Dbody"

val LN_member_body: String get() = "ISO Member Body"

const val NID_member_body: Int = 182

val SN_identified_organization: String get() = "identified\u002Dorganization"

const val NID_identified_organization: Int = 676

val SN_hmac_md5: String get() = "HMAC\u002DMD5"

val LN_hmac_md5: String get() = "hmac\u002Dmd5"

const val NID_hmac_md5: Int = 780

val SN_hmac_sha1: String get() = "HMAC\u002DSHA1"

val LN_hmac_sha1: String get() = "hmac\u002Dsha1"

const val NID_hmac_sha1: Int = 781

val SN_certicom_arc: String get() = "certicom\u002Darc"

const val NID_certicom_arc: Int = 677

val SN_international_organizations: String get() = "international\u002Dorganizations"

val LN_international_organizations: String get() = "International Organizations"

const val NID_international_organizations: Int = 647

val SN_wap: String get() = "wap"

const val NID_wap: Int = 678

val SN_wap_wsg: String get() = "wap\u002Dwsg"

const val NID_wap_wsg: Int = 679

val SN_selected_attribute_types: String get() = "selected\u002Dattribute\u002Dtypes"

val LN_selected_attribute_types: String get() = "Selected Attribute Types"

const val NID_selected_attribute_types: Int = 394

val SN_clearance: String get() = "clearance"

const val NID_clearance: Int = 395

val SN_ISO_US: String get() = "ISO\u002DUS"

val LN_ISO_US: String get() = "ISO US Member Body"

const val NID_ISO_US: Int = 183

val SN_X9_57: String get() = "X9\u002D57"

val LN_X9_57: String get() = "X9.57"

const val NID_X9_57: Int = 184

val SN_X9cm: String get() = "X9cm"

val LN_X9cm: String get() = "X9.57 CM \u003F"

const val NID_X9cm: Int = 185

val SN_dsa: String get() = "DSA"

val LN_dsa: String get() = "dsaEncryption"

const val NID_dsa: Int = 116

val SN_dsaWithSHA1: String get() = "DSA\u002DSHA1"

val LN_dsaWithSHA1: String get() = "dsaWithSHA1"

const val NID_dsaWithSHA1: Int = 113

val SN_ansi_X9_62: String get() = "ansi\u002DX9\u002D62"

val LN_ansi_X9_62: String get() = "ANSI X9.62"

const val NID_ansi_X9_62: Int = 405

val SN_X9_62_prime_field: String get() = "prime\u002Dfield"

const val NID_X9_62_prime_field: Int = 406

val SN_X9_62_characteristic_two_field: String get() = "characteristic\u002Dtwo\u002Dfield"

const val NID_X9_62_characteristic_two_field: Int = 407

val SN_X9_62_id_characteristic_two_basis: String get() = "id\u002Dcharacteristic\u002Dtwo\u002Dbasis"

const val NID_X9_62_id_characteristic_two_basis: Int = 680

val SN_X9_62_onBasis: String get() = "onBasis"

const val NID_X9_62_onBasis: Int = 681

val SN_X9_62_tpBasis: String get() = "tpBasis"

const val NID_X9_62_tpBasis: Int = 682

val SN_X9_62_ppBasis: String get() = "ppBasis"

const val NID_X9_62_ppBasis: Int = 683

val SN_X9_62_id_ecPublicKey: String get() = "id\u002DecPublicKey"

const val NID_X9_62_id_ecPublicKey: Int = 408

val SN_X9_62_c2pnb163v1: String get() = "c2pnb163v1"

const val NID_X9_62_c2pnb163v1: Int = 684

val SN_X9_62_c2pnb163v2: String get() = "c2pnb163v2"

const val NID_X9_62_c2pnb163v2: Int = 685

val SN_X9_62_c2pnb163v3: String get() = "c2pnb163v3"

const val NID_X9_62_c2pnb163v3: Int = 686

val SN_X9_62_c2pnb176v1: String get() = "c2pnb176v1"

const val NID_X9_62_c2pnb176v1: Int = 687

val SN_X9_62_c2tnb191v1: String get() = "c2tnb191v1"

const val NID_X9_62_c2tnb191v1: Int = 688

val SN_X9_62_c2tnb191v2: String get() = "c2tnb191v2"

const val NID_X9_62_c2tnb191v2: Int = 689

val SN_X9_62_c2tnb191v3: String get() = "c2tnb191v3"

const val NID_X9_62_c2tnb191v3: Int = 690

val SN_X9_62_c2onb191v4: String get() = "c2onb191v4"

const val NID_X9_62_c2onb191v4: Int = 691

val SN_X9_62_c2onb191v5: String get() = "c2onb191v5"

const val NID_X9_62_c2onb191v5: Int = 692

val SN_X9_62_c2pnb208w1: String get() = "c2pnb208w1"

const val NID_X9_62_c2pnb208w1: Int = 693

val SN_X9_62_c2tnb239v1: String get() = "c2tnb239v1"

const val NID_X9_62_c2tnb239v1: Int = 694

val SN_X9_62_c2tnb239v2: String get() = "c2tnb239v2"

const val NID_X9_62_c2tnb239v2: Int = 695

val SN_X9_62_c2tnb239v3: String get() = "c2tnb239v3"

const val NID_X9_62_c2tnb239v3: Int = 696

val SN_X9_62_c2onb239v4: String get() = "c2onb239v4"

const val NID_X9_62_c2onb239v4: Int = 697

val SN_X9_62_c2onb239v5: String get() = "c2onb239v5"

const val NID_X9_62_c2onb239v5: Int = 698

val SN_X9_62_c2pnb272w1: String get() = "c2pnb272w1"

const val NID_X9_62_c2pnb272w1: Int = 699

val SN_X9_62_c2pnb304w1: String get() = "c2pnb304w1"

const val NID_X9_62_c2pnb304w1: Int = 700

val SN_X9_62_c2tnb359v1: String get() = "c2tnb359v1"

const val NID_X9_62_c2tnb359v1: Int = 701

val SN_X9_62_c2pnb368w1: String get() = "c2pnb368w1"

const val NID_X9_62_c2pnb368w1: Int = 702

val SN_X9_62_c2tnb431r1: String get() = "c2tnb431r1"

const val NID_X9_62_c2tnb431r1: Int = 703

val SN_X9_62_prime192v1: String get() = "prime192v1"

const val NID_X9_62_prime192v1: Int = 409

val SN_X9_62_prime192v2: String get() = "prime192v2"

const val NID_X9_62_prime192v2: Int = 410

val SN_X9_62_prime192v3: String get() = "prime192v3"

const val NID_X9_62_prime192v3: Int = 411

val SN_X9_62_prime239v1: String get() = "prime239v1"

const val NID_X9_62_prime239v1: Int = 412

val SN_X9_62_prime239v2: String get() = "prime239v2"

const val NID_X9_62_prime239v2: Int = 413

val SN_X9_62_prime239v3: String get() = "prime239v3"

const val NID_X9_62_prime239v3: Int = 414

val SN_X9_62_prime256v1: String get() = "prime256v1"

const val NID_X9_62_prime256v1: Int = 415

val SN_ecdsa_with_SHA1: String get() = "ecdsa\u002Dwith\u002DSHA1"

const val NID_ecdsa_with_SHA1: Int = 416

val SN_ecdsa_with_Recommended: String get() = "ecdsa\u002Dwith\u002DRecommended"

const val NID_ecdsa_with_Recommended: Int = 791

val SN_ecdsa_with_Specified: String get() = "ecdsa\u002Dwith\u002DSpecified"

const val NID_ecdsa_with_Specified: Int = 792

val SN_ecdsa_with_SHA224: String get() = "ecdsa\u002Dwith\u002DSHA224"

const val NID_ecdsa_with_SHA224: Int = 793

val SN_ecdsa_with_SHA256: String get() = "ecdsa\u002Dwith\u002DSHA256"

const val NID_ecdsa_with_SHA256: Int = 794

val SN_ecdsa_with_SHA384: String get() = "ecdsa\u002Dwith\u002DSHA384"

const val NID_ecdsa_with_SHA384: Int = 795

val SN_ecdsa_with_SHA512: String get() = "ecdsa\u002Dwith\u002DSHA512"

const val NID_ecdsa_with_SHA512: Int = 796

val SN_secp112r1: String get() = "secp112r1"

const val NID_secp112r1: Int = 704

val SN_secp112r2: String get() = "secp112r2"

const val NID_secp112r2: Int = 705

val SN_secp128r1: String get() = "secp128r1"

const val NID_secp128r1: Int = 706

val SN_secp128r2: String get() = "secp128r2"

const val NID_secp128r2: Int = 707

val SN_secp160k1: String get() = "secp160k1"

const val NID_secp160k1: Int = 708

val SN_secp160r1: String get() = "secp160r1"

const val NID_secp160r1: Int = 709

val SN_secp160r2: String get() = "secp160r2"

const val NID_secp160r2: Int = 710

val SN_secp192k1: String get() = "secp192k1"

const val NID_secp192k1: Int = 711

val SN_secp224k1: String get() = "secp224k1"

const val NID_secp224k1: Int = 712

val SN_secp224r1: String get() = "secp224r1"

const val NID_secp224r1: Int = 713

val SN_secp256k1: String get() = "secp256k1"

const val NID_secp256k1: Int = 714

val SN_secp384r1: String get() = "secp384r1"

const val NID_secp384r1: Int = 715

val SN_secp521r1: String get() = "secp521r1"

const val NID_secp521r1: Int = 716

val SN_sect113r1: String get() = "sect113r1"

const val NID_sect113r1: Int = 717

val SN_sect113r2: String get() = "sect113r2"

const val NID_sect113r2: Int = 718

val SN_sect131r1: String get() = "sect131r1"

const val NID_sect131r1: Int = 719

val SN_sect131r2: String get() = "sect131r2"

const val NID_sect131r2: Int = 720

val SN_sect163k1: String get() = "sect163k1"

const val NID_sect163k1: Int = 721

val SN_sect163r1: String get() = "sect163r1"

const val NID_sect163r1: Int = 722

val SN_sect163r2: String get() = "sect163r2"

const val NID_sect163r2: Int = 723

val SN_sect193r1: String get() = "sect193r1"

const val NID_sect193r1: Int = 724

val SN_sect193r2: String get() = "sect193r2"

const val NID_sect193r2: Int = 725

val SN_sect233k1: String get() = "sect233k1"

const val NID_sect233k1: Int = 726

val SN_sect233r1: String get() = "sect233r1"

const val NID_sect233r1: Int = 727

val SN_sect239k1: String get() = "sect239k1"

const val NID_sect239k1: Int = 728

val SN_sect283k1: String get() = "sect283k1"

const val NID_sect283k1: Int = 729

val SN_sect283r1: String get() = "sect283r1"

const val NID_sect283r1: Int = 730

val SN_sect409k1: String get() = "sect409k1"

const val NID_sect409k1: Int = 731

val SN_sect409r1: String get() = "sect409r1"

const val NID_sect409r1: Int = 732

val SN_sect571k1: String get() = "sect571k1"

const val NID_sect571k1: Int = 733

val SN_sect571r1: String get() = "sect571r1"

const val NID_sect571r1: Int = 734

val SN_wap_wsg_idm_ecid_wtls1: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls1"

const val NID_wap_wsg_idm_ecid_wtls1: Int = 735

val SN_wap_wsg_idm_ecid_wtls3: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls3"

const val NID_wap_wsg_idm_ecid_wtls3: Int = 736

val SN_wap_wsg_idm_ecid_wtls4: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls4"

const val NID_wap_wsg_idm_ecid_wtls4: Int = 737

val SN_wap_wsg_idm_ecid_wtls5: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls5"

const val NID_wap_wsg_idm_ecid_wtls5: Int = 738

val SN_wap_wsg_idm_ecid_wtls6: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls6"

const val NID_wap_wsg_idm_ecid_wtls6: Int = 739

val SN_wap_wsg_idm_ecid_wtls7: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls7"

const val NID_wap_wsg_idm_ecid_wtls7: Int = 740

val SN_wap_wsg_idm_ecid_wtls8: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls8"

const val NID_wap_wsg_idm_ecid_wtls8: Int = 741

val SN_wap_wsg_idm_ecid_wtls9: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls9"

const val NID_wap_wsg_idm_ecid_wtls9: Int = 742

val SN_wap_wsg_idm_ecid_wtls10: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls10"

const val NID_wap_wsg_idm_ecid_wtls10: Int = 743

val SN_wap_wsg_idm_ecid_wtls11: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls11"

const val NID_wap_wsg_idm_ecid_wtls11: Int = 744

val SN_wap_wsg_idm_ecid_wtls12: String get() = "wap\u002Dwsg\u002Didm\u002Decid\u002Dwtls12"

const val NID_wap_wsg_idm_ecid_wtls12: Int = 745

val SN_cast5_cbc: String get() = "CAST5\u002DCBC"

val LN_cast5_cbc: String get() = "cast5\u002Dcbc"

const val NID_cast5_cbc: Int = 108

val SN_cast5_ecb: String get() = "CAST5\u002DECB"

val LN_cast5_ecb: String get() = "cast5\u002Decb"

const val NID_cast5_ecb: Int = 109

val SN_cast5_cfb64: String get() = "CAST5\u002DCFB"

val LN_cast5_cfb64: String get() = "cast5\u002Dcfb"

const val NID_cast5_cfb64: Int = 110

val SN_cast5_ofb64: String get() = "CAST5\u002DOFB"

val LN_cast5_ofb64: String get() = "cast5\u002Dofb"

const val NID_cast5_ofb64: Int = 111

val LN_pbeWithMD5AndCast5_CBC: String get() = "pbeWithMD5AndCast5CBC"

const val NID_pbeWithMD5AndCast5_CBC: Int = 112

val SN_id_PasswordBasedMAC: String get() = "id\u002DPasswordBasedMAC"

val LN_id_PasswordBasedMAC: String get() = "password based MAC"

const val NID_id_PasswordBasedMAC: Int = 782

val SN_id_DHBasedMac: String get() = "id\u002DDHBasedMac"

val LN_id_DHBasedMac: String get() = "Diffie\u002DHellman based MAC"

const val NID_id_DHBasedMac: Int = 783

val SN_rsadsi: String get() = "rsadsi"

val LN_rsadsi: String get() = "RSA Data Security, Inc."

const val NID_rsadsi: Int = 1

val SN_pkcs: String get() = "pkcs"

val LN_pkcs: String get() = "RSA Data Security, Inc. PKCS"

const val NID_pkcs: Int = 2

val SN_pkcs1: String get() = "pkcs1"

const val NID_pkcs1: Int = 186

val LN_rsaEncryption: String get() = "rsaEncryption"

const val NID_rsaEncryption: Int = 6

val SN_md2WithRSAEncryption: String get() = "RSA\u002DMD2"

val LN_md2WithRSAEncryption: String get() = "md2WithRSAEncryption"

const val NID_md2WithRSAEncryption: Int = 7

val SN_md4WithRSAEncryption: String get() = "RSA\u002DMD4"

val LN_md4WithRSAEncryption: String get() = "md4WithRSAEncryption"

const val NID_md4WithRSAEncryption: Int = 396

val SN_md5WithRSAEncryption: String get() = "RSA\u002DMD5"

val LN_md5WithRSAEncryption: String get() = "md5WithRSAEncryption"

const val NID_md5WithRSAEncryption: Int = 8

val SN_sha1WithRSAEncryption: String get() = "RSA\u002DSHA1"

val LN_sha1WithRSAEncryption: String get() = "sha1WithRSAEncryption"

const val NID_sha1WithRSAEncryption: Int = 65

val SN_rsaesOaep: String get() = "RSAES\u002DOAEP"

val LN_rsaesOaep: String get() = "rsaesOaep"

const val NID_rsaesOaep: Int = 919

val SN_mgf1: String get() = "MGF1"

val LN_mgf1: String get() = "mgf1"

const val NID_mgf1: Int = 911

val SN_pSpecified: String get() = "PSPECIFIED"

val LN_pSpecified: String get() = "pSpecified"

const val NID_pSpecified: Int = 935

val SN_rsassaPss: String get() = "RSASSA\u002DPSS"

val LN_rsassaPss: String get() = "rsassaPss"

const val NID_rsassaPss: Int = 912

val SN_sha256WithRSAEncryption: String get() = "RSA\u002DSHA256"

val LN_sha256WithRSAEncryption: String get() = "sha256WithRSAEncryption"

const val NID_sha256WithRSAEncryption: Int = 668

val SN_sha384WithRSAEncryption: String get() = "RSA\u002DSHA384"

val LN_sha384WithRSAEncryption: String get() = "sha384WithRSAEncryption"

const val NID_sha384WithRSAEncryption: Int = 669

val SN_sha512WithRSAEncryption: String get() = "RSA\u002DSHA512"

val LN_sha512WithRSAEncryption: String get() = "sha512WithRSAEncryption"

const val NID_sha512WithRSAEncryption: Int = 670

val SN_sha224WithRSAEncryption: String get() = "RSA\u002DSHA224"

val LN_sha224WithRSAEncryption: String get() = "sha224WithRSAEncryption"

const val NID_sha224WithRSAEncryption: Int = 671

val SN_pkcs3: String get() = "pkcs3"

const val NID_pkcs3: Int = 27

val LN_dhKeyAgreement: String get() = "dhKeyAgreement"

const val NID_dhKeyAgreement: Int = 28

val SN_pkcs5: String get() = "pkcs5"

const val NID_pkcs5: Int = 187

val SN_pbeWithMD2AndDES_CBC: String get() = "PBE\u002DMD2\u002DDES"

val LN_pbeWithMD2AndDES_CBC: String get() = "pbeWithMD2AndDES\u002DCBC"

const val NID_pbeWithMD2AndDES_CBC: Int = 9

val SN_pbeWithMD5AndDES_CBC: String get() = "PBE\u002DMD5\u002DDES"

val LN_pbeWithMD5AndDES_CBC: String get() = "pbeWithMD5AndDES\u002DCBC"

const val NID_pbeWithMD5AndDES_CBC: Int = 10

val SN_pbeWithMD2AndRC2_CBC: String get() = "PBE\u002DMD2\u002DRC2\u002D64"

val LN_pbeWithMD2AndRC2_CBC: String get() = "pbeWithMD2AndRC2\u002DCBC"

const val NID_pbeWithMD2AndRC2_CBC: Int = 168

val SN_pbeWithMD5AndRC2_CBC: String get() = "PBE\u002DMD5\u002DRC2\u002D64"

val LN_pbeWithMD5AndRC2_CBC: String get() = "pbeWithMD5AndRC2\u002DCBC"

const val NID_pbeWithMD5AndRC2_CBC: Int = 169

val SN_pbeWithSHA1AndDES_CBC: String get() = "PBE\u002DSHA1\u002DDES"

val LN_pbeWithSHA1AndDES_CBC: String get() = "pbeWithSHA1AndDES\u002DCBC"

const val NID_pbeWithSHA1AndDES_CBC: Int = 170

val SN_pbeWithSHA1AndRC2_CBC: String get() = "PBE\u002DSHA1\u002DRC2\u002D64"

val LN_pbeWithSHA1AndRC2_CBC: String get() = "pbeWithSHA1AndRC2\u002DCBC"

const val NID_pbeWithSHA1AndRC2_CBC: Int = 68

val LN_id_pbkdf2: String get() = "PBKDF2"

const val NID_id_pbkdf2: Int = 69

val LN_pbes2: String get() = "PBES2"

const val NID_pbes2: Int = 161

val LN_pbmac1: String get() = "PBMAC1"

const val NID_pbmac1: Int = 162

val SN_pkcs7: String get() = "pkcs7"

const val NID_pkcs7: Int = 20

val LN_pkcs7_data: String get() = "pkcs7\u002Ddata"

const val NID_pkcs7_data: Int = 21

val LN_pkcs7_signed: String get() = "pkcs7\u002DsignedData"

const val NID_pkcs7_signed: Int = 22

val LN_pkcs7_enveloped: String get() = "pkcs7\u002DenvelopedData"

const val NID_pkcs7_enveloped: Int = 23

val LN_pkcs7_signedAndEnveloped: String get() = "pkcs7\u002DsignedAndEnvelopedData"

const val NID_pkcs7_signedAndEnveloped: Int = 24

val LN_pkcs7_digest: String get() = "pkcs7\u002DdigestData"

const val NID_pkcs7_digest: Int = 25

val LN_pkcs7_encrypted: String get() = "pkcs7\u002DencryptedData"

const val NID_pkcs7_encrypted: Int = 26

val SN_pkcs9: String get() = "pkcs9"

const val NID_pkcs9: Int = 47

val LN_pkcs9_emailAddress: String get() = "emailAddress"

const val NID_pkcs9_emailAddress: Int = 48

val LN_pkcs9_unstructuredName: String get() = "unstructuredName"

const val NID_pkcs9_unstructuredName: Int = 49

val LN_pkcs9_contentType: String get() = "contentType"

const val NID_pkcs9_contentType: Int = 50

val LN_pkcs9_messageDigest: String get() = "messageDigest"

const val NID_pkcs9_messageDigest: Int = 51

val LN_pkcs9_signingTime: String get() = "signingTime"

const val NID_pkcs9_signingTime: Int = 52

val LN_pkcs9_countersignature: String get() = "countersignature"

const val NID_pkcs9_countersignature: Int = 53

val LN_pkcs9_challengePassword: String get() = "challengePassword"

const val NID_pkcs9_challengePassword: Int = 54

val LN_pkcs9_unstructuredAddress: String get() = "unstructuredAddress"

const val NID_pkcs9_unstructuredAddress: Int = 55

val LN_pkcs9_extCertAttributes: String get() = "extendedCertificateAttributes"

const val NID_pkcs9_extCertAttributes: Int = 56

val SN_ext_req: String get() = "extReq"

val LN_ext_req: String get() = "Extension Request"

const val NID_ext_req: Int = 172

val SN_SMIMECapabilities: String get() = "SMIME\u002DCAPS"

val LN_SMIMECapabilities: String get() = "S\u002FMIME Capabilities"

const val NID_SMIMECapabilities: Int = 167

val SN_SMIME: String get() = "SMIME"

val LN_SMIME: String get() = "S\u002FMIME"

const val NID_SMIME: Int = 188

val SN_id_smime_mod: String get() = "id\u002Dsmime\u002Dmod"

const val NID_id_smime_mod: Int = 189

val SN_id_smime_ct: String get() = "id\u002Dsmime\u002Dct"

const val NID_id_smime_ct: Int = 190

val SN_id_smime_aa: String get() = "id\u002Dsmime\u002Daa"

const val NID_id_smime_aa: Int = 191

val SN_id_smime_alg: String get() = "id\u002Dsmime\u002Dalg"

const val NID_id_smime_alg: Int = 192

val SN_id_smime_cd: String get() = "id\u002Dsmime\u002Dcd"

const val NID_id_smime_cd: Int = 193

val SN_id_smime_spq: String get() = "id\u002Dsmime\u002Dspq"

const val NID_id_smime_spq: Int = 194

val SN_id_smime_cti: String get() = "id\u002Dsmime\u002Dcti"

const val NID_id_smime_cti: Int = 195

val SN_id_smime_mod_cms: String get() = "id\u002Dsmime\u002Dmod\u002Dcms"

const val NID_id_smime_mod_cms: Int = 196

val SN_id_smime_mod_ess: String get() = "id\u002Dsmime\u002Dmod\u002Dess"

const val NID_id_smime_mod_ess: Int = 197

val SN_id_smime_mod_oid: String get() = "id\u002Dsmime\u002Dmod\u002Doid"

const val NID_id_smime_mod_oid: Int = 198

val SN_id_smime_mod_msg_v3: String get() = "id\u002Dsmime\u002Dmod\u002Dmsg\u002Dv3"

const val NID_id_smime_mod_msg_v3: Int = 199

val SN_id_smime_mod_ets_eSignature_88: String get() = "id\u002Dsmime\u002Dmod\u002Dets\u002DeSignature\u002D88"

const val NID_id_smime_mod_ets_eSignature_88: Int = 200

val SN_id_smime_mod_ets_eSignature_97: String get() = "id\u002Dsmime\u002Dmod\u002Dets\u002DeSignature\u002D97"

const val NID_id_smime_mod_ets_eSignature_97: Int = 201

val SN_id_smime_mod_ets_eSigPolicy_88: String get() = "id\u002Dsmime\u002Dmod\u002Dets\u002DeSigPolicy\u002D88"

const val NID_id_smime_mod_ets_eSigPolicy_88: Int = 202

val SN_id_smime_mod_ets_eSigPolicy_97: String get() = "id\u002Dsmime\u002Dmod\u002Dets\u002DeSigPolicy\u002D97"

const val NID_id_smime_mod_ets_eSigPolicy_97: Int = 203

val SN_id_smime_ct_receipt: String get() = "id\u002Dsmime\u002Dct\u002Dreceipt"

const val NID_id_smime_ct_receipt: Int = 204

val SN_id_smime_ct_authData: String get() = "id\u002Dsmime\u002Dct\u002DauthData"

const val NID_id_smime_ct_authData: Int = 205

val SN_id_smime_ct_publishCert: String get() = "id\u002Dsmime\u002Dct\u002DpublishCert"

const val NID_id_smime_ct_publishCert: Int = 206

val SN_id_smime_ct_TSTInfo: String get() = "id\u002Dsmime\u002Dct\u002DTSTInfo"

const val NID_id_smime_ct_TSTInfo: Int = 207

val SN_id_smime_ct_TDTInfo: String get() = "id\u002Dsmime\u002Dct\u002DTDTInfo"

const val NID_id_smime_ct_TDTInfo: Int = 208

val SN_id_smime_ct_contentInfo: String get() = "id\u002Dsmime\u002Dct\u002DcontentInfo"

const val NID_id_smime_ct_contentInfo: Int = 209

val SN_id_smime_ct_DVCSRequestData: String get() = "id\u002Dsmime\u002Dct\u002DDVCSRequestData"

const val NID_id_smime_ct_DVCSRequestData: Int = 210

val SN_id_smime_ct_DVCSResponseData: String get() = "id\u002Dsmime\u002Dct\u002DDVCSResponseData"

const val NID_id_smime_ct_DVCSResponseData: Int = 211

val SN_id_smime_ct_compressedData: String get() = "id\u002Dsmime\u002Dct\u002DcompressedData"

const val NID_id_smime_ct_compressedData: Int = 786

val SN_id_smime_ct_contentCollection: String get() = "id\u002Dsmime\u002Dct\u002DcontentCollection"

const val NID_id_smime_ct_contentCollection: Int = 1058

val SN_id_smime_ct_authEnvelopedData: String get() = "id\u002Dsmime\u002Dct\u002DauthEnvelopedData"

const val NID_id_smime_ct_authEnvelopedData: Int = 1059

val SN_id_ct_asciiTextWithCRLF: String get() = "id\u002Dct\u002DasciiTextWithCRLF"

const val NID_id_ct_asciiTextWithCRLF: Int = 787

val SN_id_ct_xml: String get() = "id\u002Dct\u002Dxml"

const val NID_id_ct_xml: Int = 1060

val SN_id_smime_aa_receiptRequest: String get() = "id\u002Dsmime\u002Daa\u002DreceiptRequest"

const val NID_id_smime_aa_receiptRequest: Int = 212

val SN_id_smime_aa_securityLabel: String get() = "id\u002Dsmime\u002Daa\u002DsecurityLabel"

const val NID_id_smime_aa_securityLabel: Int = 213

val SN_id_smime_aa_mlExpandHistory: String get() = "id\u002Dsmime\u002Daa\u002DmlExpandHistory"

const val NID_id_smime_aa_mlExpandHistory: Int = 214

val SN_id_smime_aa_contentHint: String get() = "id\u002Dsmime\u002Daa\u002DcontentHint"

const val NID_id_smime_aa_contentHint: Int = 215

val SN_id_smime_aa_msgSigDigest: String get() = "id\u002Dsmime\u002Daa\u002DmsgSigDigest"

const val NID_id_smime_aa_msgSigDigest: Int = 216

val SN_id_smime_aa_encapContentType: String get() = "id\u002Dsmime\u002Daa\u002DencapContentType"

const val NID_id_smime_aa_encapContentType: Int = 217

val SN_id_smime_aa_contentIdentifier: String get() = "id\u002Dsmime\u002Daa\u002DcontentIdentifier"

const val NID_id_smime_aa_contentIdentifier: Int = 218

val SN_id_smime_aa_macValue: String get() = "id\u002Dsmime\u002Daa\u002DmacValue"

const val NID_id_smime_aa_macValue: Int = 219

val SN_id_smime_aa_equivalentLabels: String get() = "id\u002Dsmime\u002Daa\u002DequivalentLabels"

const val NID_id_smime_aa_equivalentLabels: Int = 220

val SN_id_smime_aa_contentReference: String get() = "id\u002Dsmime\u002Daa\u002DcontentReference"

const val NID_id_smime_aa_contentReference: Int = 221

val SN_id_smime_aa_encrypKeyPref: String get() = "id\u002Dsmime\u002Daa\u002DencrypKeyPref"

const val NID_id_smime_aa_encrypKeyPref: Int = 222

val SN_id_smime_aa_signingCertificate: String get() = "id\u002Dsmime\u002Daa\u002DsigningCertificate"

const val NID_id_smime_aa_signingCertificate: Int = 223

val SN_id_smime_aa_smimeEncryptCerts: String get() = "id\u002Dsmime\u002Daa\u002DsmimeEncryptCerts"

const val NID_id_smime_aa_smimeEncryptCerts: Int = 224

val SN_id_smime_aa_timeStampToken: String get() = "id\u002Dsmime\u002Daa\u002DtimeStampToken"

const val NID_id_smime_aa_timeStampToken: Int = 225

val SN_id_smime_aa_ets_sigPolicyId: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DsigPolicyId"

const val NID_id_smime_aa_ets_sigPolicyId: Int = 226

val SN_id_smime_aa_ets_commitmentType: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DcommitmentType"

const val NID_id_smime_aa_ets_commitmentType: Int = 227

val SN_id_smime_aa_ets_signerLocation: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DsignerLocation"

const val NID_id_smime_aa_ets_signerLocation: Int = 228

val SN_id_smime_aa_ets_signerAttr: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DsignerAttr"

const val NID_id_smime_aa_ets_signerAttr: Int = 229

val SN_id_smime_aa_ets_otherSigCert: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DotherSigCert"

const val NID_id_smime_aa_ets_otherSigCert: Int = 230

val SN_id_smime_aa_ets_contentTimestamp: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DcontentTimestamp"

const val NID_id_smime_aa_ets_contentTimestamp: Int = 231

val SN_id_smime_aa_ets_CertificateRefs: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DCertificateRefs"

const val NID_id_smime_aa_ets_CertificateRefs: Int = 232

val SN_id_smime_aa_ets_RevocationRefs: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DRevocationRefs"

const val NID_id_smime_aa_ets_RevocationRefs: Int = 233

val SN_id_smime_aa_ets_certValues: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DcertValues"

const val NID_id_smime_aa_ets_certValues: Int = 234

val SN_id_smime_aa_ets_revocationValues: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DrevocationValues"

const val NID_id_smime_aa_ets_revocationValues: Int = 235

val SN_id_smime_aa_ets_escTimeStamp: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DescTimeStamp"

const val NID_id_smime_aa_ets_escTimeStamp: Int = 236

val SN_id_smime_aa_ets_certCRLTimestamp: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DcertCRLTimestamp"

const val NID_id_smime_aa_ets_certCRLTimestamp: Int = 237

val SN_id_smime_aa_ets_archiveTimeStamp: String get() = "id\u002Dsmime\u002Daa\u002Dets\u002DarchiveTimeStamp"

const val NID_id_smime_aa_ets_archiveTimeStamp: Int = 238

val SN_id_smime_aa_signatureType: String get() = "id\u002Dsmime\u002Daa\u002DsignatureType"

const val NID_id_smime_aa_signatureType: Int = 239

val SN_id_smime_aa_dvcs_dvc: String get() = "id\u002Dsmime\u002Daa\u002Ddvcs\u002Ddvc"

const val NID_id_smime_aa_dvcs_dvc: Int = 240

val SN_id_smime_alg_ESDHwith3DES: String get() = "id\u002Dsmime\u002Dalg\u002DESDHwith3DES"

const val NID_id_smime_alg_ESDHwith3DES: Int = 241

val SN_id_smime_alg_ESDHwithRC2: String get() = "id\u002Dsmime\u002Dalg\u002DESDHwithRC2"

const val NID_id_smime_alg_ESDHwithRC2: Int = 242

val SN_id_smime_alg_3DESwrap: String get() = "id\u002Dsmime\u002Dalg\u002D3DESwrap"

const val NID_id_smime_alg_3DESwrap: Int = 243

val SN_id_smime_alg_RC2wrap: String get() = "id\u002Dsmime\u002Dalg\u002DRC2wrap"

const val NID_id_smime_alg_RC2wrap: Int = 244

val SN_id_smime_alg_ESDH: String get() = "id\u002Dsmime\u002Dalg\u002DESDH"

const val NID_id_smime_alg_ESDH: Int = 245

val SN_id_smime_alg_CMS3DESwrap: String get() = "id\u002Dsmime\u002Dalg\u002DCMS3DESwrap"

const val NID_id_smime_alg_CMS3DESwrap: Int = 246

val SN_id_smime_alg_CMSRC2wrap: String get() = "id\u002Dsmime\u002Dalg\u002DCMSRC2wrap"

const val NID_id_smime_alg_CMSRC2wrap: Int = 247

val SN_id_alg_PWRI_KEK: String get() = "id\u002Dalg\u002DPWRI\u002DKEK"

const val NID_id_alg_PWRI_KEK: Int = 893

val SN_id_smime_cd_ldap: String get() = "id\u002Dsmime\u002Dcd\u002Dldap"

const val NID_id_smime_cd_ldap: Int = 248

val SN_id_smime_spq_ets_sqt_uri: String get() = "id\u002Dsmime\u002Dspq\u002Dets\u002Dsqt\u002Duri"

const val NID_id_smime_spq_ets_sqt_uri: Int = 249

val SN_id_smime_spq_ets_sqt_unotice: String get() = "id\u002Dsmime\u002Dspq\u002Dets\u002Dsqt\u002Dunotice"

const val NID_id_smime_spq_ets_sqt_unotice: Int = 250

val SN_id_smime_cti_ets_proofOfOrigin: String get() = "id\u002Dsmime\u002Dcti\u002Dets\u002DproofOfOrigin"

const val NID_id_smime_cti_ets_proofOfOrigin: Int = 251

val SN_id_smime_cti_ets_proofOfReceipt: String get() = "id\u002Dsmime\u002Dcti\u002Dets\u002DproofOfReceipt"

const val NID_id_smime_cti_ets_proofOfReceipt: Int = 252

val SN_id_smime_cti_ets_proofOfDelivery: String get() = "id\u002Dsmime\u002Dcti\u002Dets\u002DproofOfDelivery"

const val NID_id_smime_cti_ets_proofOfDelivery: Int = 253

val SN_id_smime_cti_ets_proofOfSender: String get() = "id\u002Dsmime\u002Dcti\u002Dets\u002DproofOfSender"

const val NID_id_smime_cti_ets_proofOfSender: Int = 254

val SN_id_smime_cti_ets_proofOfApproval: String get() = "id\u002Dsmime\u002Dcti\u002Dets\u002DproofOfApproval"

const val NID_id_smime_cti_ets_proofOfApproval: Int = 255

val SN_id_smime_cti_ets_proofOfCreation: String get() = "id\u002Dsmime\u002Dcti\u002Dets\u002DproofOfCreation"

const val NID_id_smime_cti_ets_proofOfCreation: Int = 256

val LN_friendlyName: String get() = "friendlyName"

const val NID_friendlyName: Int = 156

val LN_localKeyID: String get() = "localKeyID"

const val NID_localKeyID: Int = 157

val SN_ms_csp_name: String get() = "CSPName"

val LN_ms_csp_name: String get() = "Microsoft CSP Name"

const val NID_ms_csp_name: Int = 417

val SN_LocalKeySet: String get() = "LocalKeySet"

val LN_LocalKeySet: String get() = "Microsoft Local Key set"

const val NID_LocalKeySet: Int = 856

val LN_x509Certificate: String get() = "x509Certificate"

const val NID_x509Certificate: Int = 158

val LN_sdsiCertificate: String get() = "sdsiCertificate"

const val NID_sdsiCertificate: Int = 159

val LN_x509Crl: String get() = "x509Crl"

const val NID_x509Crl: Int = 160

val SN_pbe_WithSHA1And128BitRC4: String get() = "PBE\u002DSHA1\u002DRC4\u002D128"

val LN_pbe_WithSHA1And128BitRC4: String get() = "pbeWithSHA1And128BitRC4"

const val NID_pbe_WithSHA1And128BitRC4: Int = 144

val SN_pbe_WithSHA1And40BitRC4: String get() = "PBE\u002DSHA1\u002DRC4\u002D40"

val LN_pbe_WithSHA1And40BitRC4: String get() = "pbeWithSHA1And40BitRC4"

const val NID_pbe_WithSHA1And40BitRC4: Int = 145

val SN_pbe_WithSHA1And3_Key_TripleDES_CBC: String get() = "PBE\u002DSHA1\u002D3DES"

val LN_pbe_WithSHA1And3_Key_TripleDES_CBC: String get() = "pbeWithSHA1And3\u002DKeyTripleDES\u002DCBC"

const val NID_pbe_WithSHA1And3_Key_TripleDES_CBC: Int = 146

val SN_pbe_WithSHA1And2_Key_TripleDES_CBC: String get() = "PBE\u002DSHA1\u002D2DES"

val LN_pbe_WithSHA1And2_Key_TripleDES_CBC: String get() = "pbeWithSHA1And2\u002DKeyTripleDES\u002DCBC"

const val NID_pbe_WithSHA1And2_Key_TripleDES_CBC: Int = 147

val SN_pbe_WithSHA1And128BitRC2_CBC: String get() = "PBE\u002DSHA1\u002DRC2\u002D128"

val LN_pbe_WithSHA1And128BitRC2_CBC: String get() = "pbeWithSHA1And128BitRC2\u002DCBC"

const val NID_pbe_WithSHA1And128BitRC2_CBC: Int = 148

val SN_pbe_WithSHA1And40BitRC2_CBC: String get() = "PBE\u002DSHA1\u002DRC2\u002D40"

val LN_pbe_WithSHA1And40BitRC2_CBC: String get() = "pbeWithSHA1And40BitRC2\u002DCBC"

const val NID_pbe_WithSHA1And40BitRC2_CBC: Int = 149

val LN_keyBag: String get() = "keyBag"

const val NID_keyBag: Int = 150

val LN_pkcs8ShroudedKeyBag: String get() = "pkcs8ShroudedKeyBag"

const val NID_pkcs8ShroudedKeyBag: Int = 151

val LN_certBag: String get() = "certBag"

const val NID_certBag: Int = 152

val LN_crlBag: String get() = "crlBag"

const val NID_crlBag: Int = 153

val LN_secretBag: String get() = "secretBag"

const val NID_secretBag: Int = 154

val LN_safeContentsBag: String get() = "safeContentsBag"

const val NID_safeContentsBag: Int = 155

val SN_md2: String get() = "MD2"

val LN_md2: String get() = "md2"

const val NID_md2: Int = 3

val SN_md4: String get() = "MD4"

val LN_md4: String get() = "md4"

const val NID_md4: Int = 257

val SN_md5: String get() = "MD5"

val LN_md5: String get() = "md5"

const val NID_md5: Int = 4

val SN_md5_sha1: String get() = "MD5\u002DSHA1"

val LN_md5_sha1: String get() = "md5\u002Dsha1"

const val NID_md5_sha1: Int = 114

val LN_hmacWithMD5: String get() = "hmacWithMD5"

const val NID_hmacWithMD5: Int = 797

val LN_hmacWithSHA1: String get() = "hmacWithSHA1"

const val NID_hmacWithSHA1: Int = 163

val LN_hmacWithSHA224: String get() = "hmacWithSHA224"

const val NID_hmacWithSHA224: Int = 798

val LN_hmacWithSHA256: String get() = "hmacWithSHA256"

const val NID_hmacWithSHA256: Int = 799

val LN_hmacWithSHA384: String get() = "hmacWithSHA384"

const val NID_hmacWithSHA384: Int = 800

val LN_hmacWithSHA512: String get() = "hmacWithSHA512"

const val NID_hmacWithSHA512: Int = 801

val SN_rc2_cbc: String get() = "RC2\u002DCBC"

val LN_rc2_cbc: String get() = "rc2\u002Dcbc"

const val NID_rc2_cbc: Int = 37

val SN_rc2_ecb: String get() = "RC2\u002DECB"

val LN_rc2_ecb: String get() = "rc2\u002Decb"

const val NID_rc2_ecb: Int = 38

val SN_rc2_cfb64: String get() = "RC2\u002DCFB"

val LN_rc2_cfb64: String get() = "rc2\u002Dcfb"

const val NID_rc2_cfb64: Int = 39

val SN_rc2_ofb64: String get() = "RC2\u002DOFB"

val LN_rc2_ofb64: String get() = "rc2\u002Dofb"

const val NID_rc2_ofb64: Int = 40

val SN_rc2_40_cbc: String get() = "RC2\u002D40\u002DCBC"

val LN_rc2_40_cbc: String get() = "rc2\u002D40\u002Dcbc"

const val NID_rc2_40_cbc: Int = 98

val SN_rc2_64_cbc: String get() = "RC2\u002D64\u002DCBC"

val LN_rc2_64_cbc: String get() = "rc2\u002D64\u002Dcbc"

const val NID_rc2_64_cbc: Int = 166

val SN_rc4: String get() = "RC4"

val LN_rc4: String get() = "rc4"

const val NID_rc4: Int = 5

val SN_rc4_40: String get() = "RC4\u002D40"

val LN_rc4_40: String get() = "rc4\u002D40"

const val NID_rc4_40: Int = 97

val SN_des_ede3_cbc: String get() = "DES\u002DEDE3\u002DCBC"

val LN_des_ede3_cbc: String get() = "des\u002Dede3\u002Dcbc"

const val NID_des_ede3_cbc: Int = 44

val SN_rc5_cbc: String get() = "RC5\u002DCBC"

val LN_rc5_cbc: String get() = "rc5\u002Dcbc"

const val NID_rc5_cbc: Int = 120

val SN_rc5_ecb: String get() = "RC5\u002DECB"

val LN_rc5_ecb: String get() = "rc5\u002Decb"

const val NID_rc5_ecb: Int = 121

val SN_rc5_cfb64: String get() = "RC5\u002DCFB"

val LN_rc5_cfb64: String get() = "rc5\u002Dcfb"

const val NID_rc5_cfb64: Int = 122

val SN_rc5_ofb64: String get() = "RC5\u002DOFB"

val LN_rc5_ofb64: String get() = "rc5\u002Dofb"

const val NID_rc5_ofb64: Int = 123

val SN_ms_ext_req: String get() = "msExtReq"

val LN_ms_ext_req: String get() = "Microsoft Extension Request"

const val NID_ms_ext_req: Int = 171

val SN_ms_code_ind: String get() = "msCodeInd"

val LN_ms_code_ind: String get() = "Microsoft Individual Code Signing"

const val NID_ms_code_ind: Int = 134

val SN_ms_code_com: String get() = "msCodeCom"

val LN_ms_code_com: String get() = "Microsoft Commercial Code Signing"

const val NID_ms_code_com: Int = 135

val SN_ms_ctl_sign: String get() = "msCTLSign"

val LN_ms_ctl_sign: String get() = "Microsoft Trust List Signing"

const val NID_ms_ctl_sign: Int = 136

val SN_ms_sgc: String get() = "msSGC"

val LN_ms_sgc: String get() = "Microsoft Server Gated Crypto"

const val NID_ms_sgc: Int = 137

val SN_ms_efs: String get() = "msEFS"

val LN_ms_efs: String get() = "Microsoft Encrypted File System"

const val NID_ms_efs: Int = 138

val SN_ms_smartcard_login: String get() = "msSmartcardLogin"

val LN_ms_smartcard_login: String get() = "Microsoft Smartcardlogin"

const val NID_ms_smartcard_login: Int = 648

val SN_ms_upn: String get() = "msUPN"

val LN_ms_upn: String get() = "Microsoft Universal Principal Name"

const val NID_ms_upn: Int = 649

val SN_idea_cbc: String get() = "IDEA\u002DCBC"

val LN_idea_cbc: String get() = "idea\u002Dcbc"

const val NID_idea_cbc: Int = 34

val SN_idea_ecb: String get() = "IDEA\u002DECB"

val LN_idea_ecb: String get() = "idea\u002Decb"

const val NID_idea_ecb: Int = 36

val SN_idea_cfb64: String get() = "IDEA\u002DCFB"

val LN_idea_cfb64: String get() = "idea\u002Dcfb"

const val NID_idea_cfb64: Int = 35

val SN_idea_ofb64: String get() = "IDEA\u002DOFB"

val LN_idea_ofb64: String get() = "idea\u002Dofb"

const val NID_idea_ofb64: Int = 46

val SN_bf_cbc: String get() = "BF\u002DCBC"

val LN_bf_cbc: String get() = "bf\u002Dcbc"

const val NID_bf_cbc: Int = 91

val SN_bf_ecb: String get() = "BF\u002DECB"

val LN_bf_ecb: String get() = "bf\u002Decb"

const val NID_bf_ecb: Int = 92

val SN_bf_cfb64: String get() = "BF\u002DCFB"

val LN_bf_cfb64: String get() = "bf\u002Dcfb"

const val NID_bf_cfb64: Int = 93

val SN_bf_ofb64: String get() = "BF\u002DOFB"

val LN_bf_ofb64: String get() = "bf\u002Dofb"

const val NID_bf_ofb64: Int = 94

val SN_id_pkix: String get() = "PKIX"

const val NID_id_pkix: Int = 127

val SN_id_pkix_mod: String get() = "id\u002Dpkix\u002Dmod"

const val NID_id_pkix_mod: Int = 258

val SN_id_pe: String get() = "id\u002Dpe"

const val NID_id_pe: Int = 175

val SN_id_qt: String get() = "id\u002Dqt"

const val NID_id_qt: Int = 259

val SN_id_kp: String get() = "id\u002Dkp"

const val NID_id_kp: Int = 128

val SN_id_it: String get() = "id\u002Dit"

const val NID_id_it: Int = 260

val SN_id_pkip: String get() = "id\u002Dpkip"

const val NID_id_pkip: Int = 261

val SN_id_alg: String get() = "id\u002Dalg"

const val NID_id_alg: Int = 262

val SN_id_cmc: String get() = "id\u002Dcmc"

const val NID_id_cmc: Int = 263

val SN_id_on: String get() = "id\u002Don"

const val NID_id_on: Int = 264

val SN_id_pda: String get() = "id\u002Dpda"

const val NID_id_pda: Int = 265

val SN_id_aca: String get() = "id\u002Daca"

const val NID_id_aca: Int = 266

val SN_id_qcs: String get() = "id\u002Dqcs"

const val NID_id_qcs: Int = 267

val SN_id_cct: String get() = "id\u002Dcct"

const val NID_id_cct: Int = 268

val SN_id_ppl: String get() = "id\u002Dppl"

const val NID_id_ppl: Int = 662

val SN_id_ad: String get() = "id\u002Dad"

const val NID_id_ad: Int = 176

val SN_id_pkix1_explicit_88: String get() = "id\u002Dpkix1\u002Dexplicit\u002D88"

const val NID_id_pkix1_explicit_88: Int = 269

val SN_id_pkix1_implicit_88: String get() = "id\u002Dpkix1\u002Dimplicit\u002D88"

const val NID_id_pkix1_implicit_88: Int = 270

val SN_id_pkix1_explicit_93: String get() = "id\u002Dpkix1\u002Dexplicit\u002D93"

const val NID_id_pkix1_explicit_93: Int = 271

val SN_id_pkix1_implicit_93: String get() = "id\u002Dpkix1\u002Dimplicit\u002D93"

const val NID_id_pkix1_implicit_93: Int = 272

val SN_id_mod_crmf: String get() = "id\u002Dmod\u002Dcrmf"

const val NID_id_mod_crmf: Int = 273

val SN_id_mod_cmc: String get() = "id\u002Dmod\u002Dcmc"

const val NID_id_mod_cmc: Int = 274

val SN_id_mod_kea_profile_88: String get() = "id\u002Dmod\u002Dkea\u002Dprofile\u002D88"

const val NID_id_mod_kea_profile_88: Int = 275

val SN_id_mod_kea_profile_93: String get() = "id\u002Dmod\u002Dkea\u002Dprofile\u002D93"

const val NID_id_mod_kea_profile_93: Int = 276

val SN_id_mod_cmp: String get() = "id\u002Dmod\u002Dcmp"

const val NID_id_mod_cmp: Int = 277

val SN_id_mod_qualified_cert_88: String get() = "id\u002Dmod\u002Dqualified\u002Dcert\u002D88"

const val NID_id_mod_qualified_cert_88: Int = 278

val SN_id_mod_qualified_cert_93: String get() = "id\u002Dmod\u002Dqualified\u002Dcert\u002D93"

const val NID_id_mod_qualified_cert_93: Int = 279

val SN_id_mod_attribute_cert: String get() = "id\u002Dmod\u002Dattribute\u002Dcert"

const val NID_id_mod_attribute_cert: Int = 280

val SN_id_mod_timestamp_protocol: String get() = "id\u002Dmod\u002Dtimestamp\u002Dprotocol"

const val NID_id_mod_timestamp_protocol: Int = 281

val SN_id_mod_ocsp: String get() = "id\u002Dmod\u002Docsp"

const val NID_id_mod_ocsp: Int = 282

val SN_id_mod_dvcs: String get() = "id\u002Dmod\u002Ddvcs"

const val NID_id_mod_dvcs: Int = 283

val SN_id_mod_cmp2000: String get() = "id\u002Dmod\u002Dcmp2000"

const val NID_id_mod_cmp2000: Int = 284

val SN_info_access: String get() = "authorityInfoAccess"

val LN_info_access: String get() = "Authority Information Access"

const val NID_info_access: Int = 177

val SN_biometricInfo: String get() = "biometricInfo"

val LN_biometricInfo: String get() = "Biometric Info"

const val NID_biometricInfo: Int = 285

val SN_qcStatements: String get() = "qcStatements"

const val NID_qcStatements: Int = 286

val SN_ac_auditEntity: String get() = "ac\u002DauditEntity"

const val NID_ac_auditEntity: Int = 287

val SN_ac_targeting: String get() = "ac\u002Dtargeting"

const val NID_ac_targeting: Int = 288

val SN_aaControls: String get() = "aaControls"

const val NID_aaControls: Int = 289

val SN_sbgp_ipAddrBlock: String get() = "sbgp\u002DipAddrBlock"

const val NID_sbgp_ipAddrBlock: Int = 290

val SN_sbgp_autonomousSysNum: String get() = "sbgp\u002DautonomousSysNum"

const val NID_sbgp_autonomousSysNum: Int = 291

val SN_sbgp_routerIdentifier: String get() = "sbgp\u002DrouterIdentifier"

const val NID_sbgp_routerIdentifier: Int = 292

val SN_ac_proxying: String get() = "ac\u002Dproxying"

const val NID_ac_proxying: Int = 397

val SN_sinfo_access: String get() = "subjectInfoAccess"

val LN_sinfo_access: String get() = "Subject Information Access"

const val NID_sinfo_access: Int = 398

val SN_proxyCertInfo: String get() = "proxyCertInfo"

val LN_proxyCertInfo: String get() = "Proxy Certificate Information"

const val NID_proxyCertInfo: Int = 663

val SN_tlsfeature: String get() = "tlsfeature"

val LN_tlsfeature: String get() = "TLS Feature"

const val NID_tlsfeature: Int = 1020

val SN_id_qt_cps: String get() = "id\u002Dqt\u002Dcps"

val LN_id_qt_cps: String get() = "Policy Qualifier CPS"

const val NID_id_qt_cps: Int = 164

val SN_id_qt_unotice: String get() = "id\u002Dqt\u002Dunotice"

val LN_id_qt_unotice: String get() = "Policy Qualifier User Notice"

const val NID_id_qt_unotice: Int = 165

val SN_textNotice: String get() = "textNotice"

const val NID_textNotice: Int = 293

val SN_server_auth: String get() = "serverAuth"

val LN_server_auth: String get() = "TLS Web Server Authentication"

const val NID_server_auth: Int = 129

val SN_client_auth: String get() = "clientAuth"

val LN_client_auth: String get() = "TLS Web Client Authentication"

const val NID_client_auth: Int = 130

val SN_code_sign: String get() = "codeSigning"

val LN_code_sign: String get() = "Code Signing"

const val NID_code_sign: Int = 131

val SN_email_protect: String get() = "emailProtection"

val LN_email_protect: String get() = "E\u002Dmail Protection"

const val NID_email_protect: Int = 132

val SN_ipsecEndSystem: String get() = "ipsecEndSystem"

val LN_ipsecEndSystem: String get() = "IPSec End System"

const val NID_ipsecEndSystem: Int = 294

val SN_ipsecTunnel: String get() = "ipsecTunnel"

val LN_ipsecTunnel: String get() = "IPSec Tunnel"

const val NID_ipsecTunnel: Int = 295

val SN_ipsecUser: String get() = "ipsecUser"

val LN_ipsecUser: String get() = "IPSec User"

const val NID_ipsecUser: Int = 296

val SN_time_stamp: String get() = "timeStamping"

val LN_time_stamp: String get() = "Time Stamping"

const val NID_time_stamp: Int = 133

val SN_OCSP_sign: String get() = "OCSPSigning"

val LN_OCSP_sign: String get() = "OCSP Signing"

const val NID_OCSP_sign: Int = 180

val SN_dvcs: String get() = "DVCS"

val LN_dvcs: String get() = "dvcs"

const val NID_dvcs: Int = 297

val SN_ipsec_IKE: String get() = "ipsecIKE"

val LN_ipsec_IKE: String get() = "ipsec Internet Key Exchange"

const val NID_ipsec_IKE: Int = 1022

val SN_capwapAC: String get() = "capwapAC"

val LN_capwapAC: String get() = "Ctrl\u002Fprovision WAP Access"

const val NID_capwapAC: Int = 1023

val SN_capwapWTP: String get() = "capwapWTP"

val LN_capwapWTP: String get() = "Ctrl\u002FProvision WAP Termination"

const val NID_capwapWTP: Int = 1024

val SN_sshClient: String get() = "secureShellClient"

val LN_sshClient: String get() = "SSH Client"

const val NID_sshClient: Int = 1025

val SN_sshServer: String get() = "secureShellServer"

val LN_sshServer: String get() = "SSH Server"

const val NID_sshServer: Int = 1026

val SN_sendRouter: String get() = "sendRouter"

val LN_sendRouter: String get() = "Send Router"

const val NID_sendRouter: Int = 1027

val SN_sendProxiedRouter: String get() = "sendProxiedRouter"

val LN_sendProxiedRouter: String get() = "Send Proxied Router"

const val NID_sendProxiedRouter: Int = 1028

val SN_sendOwner: String get() = "sendOwner"

val LN_sendOwner: String get() = "Send Owner"

const val NID_sendOwner: Int = 1029

val SN_sendProxiedOwner: String get() = "sendProxiedOwner"

val LN_sendProxiedOwner: String get() = "Send Proxied Owner"

const val NID_sendProxiedOwner: Int = 1030

val SN_id_it_caProtEncCert: String get() = "id\u002Dit\u002DcaProtEncCert"

const val NID_id_it_caProtEncCert: Int = 298

val SN_id_it_signKeyPairTypes: String get() = "id\u002Dit\u002DsignKeyPairTypes"

const val NID_id_it_signKeyPairTypes: Int = 299

val SN_id_it_encKeyPairTypes: String get() = "id\u002Dit\u002DencKeyPairTypes"

const val NID_id_it_encKeyPairTypes: Int = 300

val SN_id_it_preferredSymmAlg: String get() = "id\u002Dit\u002DpreferredSymmAlg"

const val NID_id_it_preferredSymmAlg: Int = 301

val SN_id_it_caKeyUpdateInfo: String get() = "id\u002Dit\u002DcaKeyUpdateInfo"

const val NID_id_it_caKeyUpdateInfo: Int = 302

val SN_id_it_currentCRL: String get() = "id\u002Dit\u002DcurrentCRL"

const val NID_id_it_currentCRL: Int = 303

val SN_id_it_unsupportedOIDs: String get() = "id\u002Dit\u002DunsupportedOIDs"

const val NID_id_it_unsupportedOIDs: Int = 304

val SN_id_it_subscriptionRequest: String get() = "id\u002Dit\u002DsubscriptionRequest"

const val NID_id_it_subscriptionRequest: Int = 305

val SN_id_it_subscriptionResponse: String get() = "id\u002Dit\u002DsubscriptionResponse"

const val NID_id_it_subscriptionResponse: Int = 306

val SN_id_it_keyPairParamReq: String get() = "id\u002Dit\u002DkeyPairParamReq"

const val NID_id_it_keyPairParamReq: Int = 307

val SN_id_it_keyPairParamRep: String get() = "id\u002Dit\u002DkeyPairParamRep"

const val NID_id_it_keyPairParamRep: Int = 308

val SN_id_it_revPassphrase: String get() = "id\u002Dit\u002DrevPassphrase"

const val NID_id_it_revPassphrase: Int = 309

val SN_id_it_implicitConfirm: String get() = "id\u002Dit\u002DimplicitConfirm"

const val NID_id_it_implicitConfirm: Int = 310

val SN_id_it_confirmWaitTime: String get() = "id\u002Dit\u002DconfirmWaitTime"

const val NID_id_it_confirmWaitTime: Int = 311

val SN_id_it_origPKIMessage: String get() = "id\u002Dit\u002DorigPKIMessage"

const val NID_id_it_origPKIMessage: Int = 312

val SN_id_it_suppLangTags: String get() = "id\u002Dit\u002DsuppLangTags"

const val NID_id_it_suppLangTags: Int = 784

val SN_id_regCtrl: String get() = "id\u002DregCtrl"

const val NID_id_regCtrl: Int = 313

val SN_id_regInfo: String get() = "id\u002DregInfo"

const val NID_id_regInfo: Int = 314

val SN_id_regCtrl_regToken: String get() = "id\u002DregCtrl\u002DregToken"

const val NID_id_regCtrl_regToken: Int = 315

val SN_id_regCtrl_authenticator: String get() = "id\u002DregCtrl\u002Dauthenticator"

const val NID_id_regCtrl_authenticator: Int = 316

val SN_id_regCtrl_pkiPublicationInfo: String get() = "id\u002DregCtrl\u002DpkiPublicationInfo"

const val NID_id_regCtrl_pkiPublicationInfo: Int = 317

val SN_id_regCtrl_pkiArchiveOptions: String get() = "id\u002DregCtrl\u002DpkiArchiveOptions"

const val NID_id_regCtrl_pkiArchiveOptions: Int = 318

val SN_id_regCtrl_oldCertID: String get() = "id\u002DregCtrl\u002DoldCertID"

const val NID_id_regCtrl_oldCertID: Int = 319

val SN_id_regCtrl_protocolEncrKey: String get() = "id\u002DregCtrl\u002DprotocolEncrKey"

const val NID_id_regCtrl_protocolEncrKey: Int = 320

val SN_id_regInfo_utf8Pairs: String get() = "id\u002DregInfo\u002Dutf8Pairs"

const val NID_id_regInfo_utf8Pairs: Int = 321

val SN_id_regInfo_certReq: String get() = "id\u002DregInfo\u002DcertReq"

const val NID_id_regInfo_certReq: Int = 322

val SN_id_alg_des40: String get() = "id\u002Dalg\u002Ddes40"

const val NID_id_alg_des40: Int = 323

val SN_id_alg_noSignature: String get() = "id\u002Dalg\u002DnoSignature"

const val NID_id_alg_noSignature: Int = 324

val SN_id_alg_dh_sig_hmac_sha1: String get() = "id\u002Dalg\u002Ddh\u002Dsig\u002Dhmac\u002Dsha1"

const val NID_id_alg_dh_sig_hmac_sha1: Int = 325

val SN_id_alg_dh_pop: String get() = "id\u002Dalg\u002Ddh\u002Dpop"

const val NID_id_alg_dh_pop: Int = 326

val SN_id_cmc_statusInfo: String get() = "id\u002Dcmc\u002DstatusInfo"

const val NID_id_cmc_statusInfo: Int = 327

val SN_id_cmc_identification: String get() = "id\u002Dcmc\u002Didentification"

const val NID_id_cmc_identification: Int = 328

val SN_id_cmc_identityProof: String get() = "id\u002Dcmc\u002DidentityProof"

const val NID_id_cmc_identityProof: Int = 329

val SN_id_cmc_dataReturn: String get() = "id\u002Dcmc\u002DdataReturn"

const val NID_id_cmc_dataReturn: Int = 330

val SN_id_cmc_transactionId: String get() = "id\u002Dcmc\u002DtransactionId"

const val NID_id_cmc_transactionId: Int = 331

val SN_id_cmc_senderNonce: String get() = "id\u002Dcmc\u002DsenderNonce"

const val NID_id_cmc_senderNonce: Int = 332

val SN_id_cmc_recipientNonce: String get() = "id\u002Dcmc\u002DrecipientNonce"

const val NID_id_cmc_recipientNonce: Int = 333

val SN_id_cmc_addExtensions: String get() = "id\u002Dcmc\u002DaddExtensions"

const val NID_id_cmc_addExtensions: Int = 334

val SN_id_cmc_encryptedPOP: String get() = "id\u002Dcmc\u002DencryptedPOP"

const val NID_id_cmc_encryptedPOP: Int = 335

val SN_id_cmc_decryptedPOP: String get() = "id\u002Dcmc\u002DdecryptedPOP"

const val NID_id_cmc_decryptedPOP: Int = 336

val SN_id_cmc_lraPOPWitness: String get() = "id\u002Dcmc\u002DlraPOPWitness"

const val NID_id_cmc_lraPOPWitness: Int = 337

val SN_id_cmc_getCert: String get() = "id\u002Dcmc\u002DgetCert"

const val NID_id_cmc_getCert: Int = 338

val SN_id_cmc_getCRL: String get() = "id\u002Dcmc\u002DgetCRL"

const val NID_id_cmc_getCRL: Int = 339

val SN_id_cmc_revokeRequest: String get() = "id\u002Dcmc\u002DrevokeRequest"

const val NID_id_cmc_revokeRequest: Int = 340

val SN_id_cmc_regInfo: String get() = "id\u002Dcmc\u002DregInfo"

const val NID_id_cmc_regInfo: Int = 341

val SN_id_cmc_responseInfo: String get() = "id\u002Dcmc\u002DresponseInfo"

const val NID_id_cmc_responseInfo: Int = 342

val SN_id_cmc_queryPending: String get() = "id\u002Dcmc\u002DqueryPending"

const val NID_id_cmc_queryPending: Int = 343

val SN_id_cmc_popLinkRandom: String get() = "id\u002Dcmc\u002DpopLinkRandom"

const val NID_id_cmc_popLinkRandom: Int = 344

val SN_id_cmc_popLinkWitness: String get() = "id\u002Dcmc\u002DpopLinkWitness"

const val NID_id_cmc_popLinkWitness: Int = 345

val SN_id_cmc_confirmCertAcceptance: String get() = "id\u002Dcmc\u002DconfirmCertAcceptance"

const val NID_id_cmc_confirmCertAcceptance: Int = 346

val SN_id_on_personalData: String get() = "id\u002Don\u002DpersonalData"

const val NID_id_on_personalData: Int = 347

val SN_id_on_permanentIdentifier: String get() = "id\u002Don\u002DpermanentIdentifier"

val LN_id_on_permanentIdentifier: String get() = "Permanent Identifier"

const val NID_id_on_permanentIdentifier: Int = 858

val SN_id_pda_dateOfBirth: String get() = "id\u002Dpda\u002DdateOfBirth"

const val NID_id_pda_dateOfBirth: Int = 348

val SN_id_pda_placeOfBirth: String get() = "id\u002Dpda\u002DplaceOfBirth"

const val NID_id_pda_placeOfBirth: Int = 349

val SN_id_pda_gender: String get() = "id\u002Dpda\u002Dgender"

const val NID_id_pda_gender: Int = 351

val SN_id_pda_countryOfCitizenship: String get() = "id\u002Dpda\u002DcountryOfCitizenship"

const val NID_id_pda_countryOfCitizenship: Int = 352

val SN_id_pda_countryOfResidence: String get() = "id\u002Dpda\u002DcountryOfResidence"

const val NID_id_pda_countryOfResidence: Int = 353

val SN_id_aca_authenticationInfo: String get() = "id\u002Daca\u002DauthenticationInfo"

const val NID_id_aca_authenticationInfo: Int = 354

val SN_id_aca_accessIdentity: String get() = "id\u002Daca\u002DaccessIdentity"

const val NID_id_aca_accessIdentity: Int = 355

val SN_id_aca_chargingIdentity: String get() = "id\u002Daca\u002DchargingIdentity"

const val NID_id_aca_chargingIdentity: Int = 356

val SN_id_aca_group: String get() = "id\u002Daca\u002Dgroup"

const val NID_id_aca_group: Int = 357

val SN_id_aca_role: String get() = "id\u002Daca\u002Drole"

const val NID_id_aca_role: Int = 358

val SN_id_aca_encAttrs: String get() = "id\u002Daca\u002DencAttrs"

const val NID_id_aca_encAttrs: Int = 399

val SN_id_qcs_pkixQCSyntax_v1: String get() = "id\u002Dqcs\u002DpkixQCSyntax\u002Dv1"

const val NID_id_qcs_pkixQCSyntax_v1: Int = 359

val SN_id_cct_crs: String get() = "id\u002Dcct\u002Dcrs"

const val NID_id_cct_crs: Int = 360

val SN_id_cct_PKIData: String get() = "id\u002Dcct\u002DPKIData"

const val NID_id_cct_PKIData: Int = 361

val SN_id_cct_PKIResponse: String get() = "id\u002Dcct\u002DPKIResponse"

const val NID_id_cct_PKIResponse: Int = 362

val SN_id_ppl_anyLanguage: String get() = "id\u002Dppl\u002DanyLanguage"

val LN_id_ppl_anyLanguage: String get() = "Any language"

const val NID_id_ppl_anyLanguage: Int = 664

val SN_id_ppl_inheritAll: String get() = "id\u002Dppl\u002DinheritAll"

val LN_id_ppl_inheritAll: String get() = "Inherit all"

const val NID_id_ppl_inheritAll: Int = 665

val SN_Independent: String get() = "id\u002Dppl\u002Dindependent"

val LN_Independent: String get() = "Independent"

const val NID_Independent: Int = 667

val SN_ad_OCSP: String get() = "OCSP"

val LN_ad_OCSP: String get() = "OCSP"

const val NID_ad_OCSP: Int = 178

val SN_ad_ca_issuers: String get() = "caIssuers"

val LN_ad_ca_issuers: String get() = "CA Issuers"

const val NID_ad_ca_issuers: Int = 179

val SN_ad_timeStamping: String get() = "ad_timestamping"

val LN_ad_timeStamping: String get() = "AD Time Stamping"

const val NID_ad_timeStamping: Int = 363

val SN_ad_dvcs: String get() = "AD_DVCS"

val LN_ad_dvcs: String get() = "ad dvcs"

const val NID_ad_dvcs: Int = 364

val SN_caRepository: String get() = "caRepository"

val LN_caRepository: String get() = "CA Repository"

const val NID_caRepository: Int = 785

val SN_id_pkix_OCSP_basic: String get() = "basicOCSPResponse"

val LN_id_pkix_OCSP_basic: String get() = "Basic OCSP Response"

const val NID_id_pkix_OCSP_basic: Int = 365

val SN_id_pkix_OCSP_Nonce: String get() = "Nonce"

val LN_id_pkix_OCSP_Nonce: String get() = "OCSP Nonce"

const val NID_id_pkix_OCSP_Nonce: Int = 366

val SN_id_pkix_OCSP_CrlID: String get() = "CrlID"

val LN_id_pkix_OCSP_CrlID: String get() = "OCSP CRL ID"

const val NID_id_pkix_OCSP_CrlID: Int = 367

val SN_id_pkix_OCSP_acceptableResponses: String get() = "acceptableResponses"

val LN_id_pkix_OCSP_acceptableResponses: String get() = "Acceptable OCSP Responses"

const val NID_id_pkix_OCSP_acceptableResponses: Int = 368

val SN_id_pkix_OCSP_noCheck: String get() = "noCheck"

val LN_id_pkix_OCSP_noCheck: String get() = "OCSP No Check"

const val NID_id_pkix_OCSP_noCheck: Int = 369

val SN_id_pkix_OCSP_archiveCutoff: String get() = "archiveCutoff"

val LN_id_pkix_OCSP_archiveCutoff: String get() = "OCSP Archive Cutoff"

const val NID_id_pkix_OCSP_archiveCutoff: Int = 370

val SN_id_pkix_OCSP_serviceLocator: String get() = "serviceLocator"

val LN_id_pkix_OCSP_serviceLocator: String get() = "OCSP Service Locator"

const val NID_id_pkix_OCSP_serviceLocator: Int = 371

val SN_id_pkix_OCSP_extendedStatus: String get() = "extendedStatus"

val LN_id_pkix_OCSP_extendedStatus: String get() = "Extended OCSP Status"

const val NID_id_pkix_OCSP_extendedStatus: Int = 372

val SN_id_pkix_OCSP_valid: String get() = "valid"

const val NID_id_pkix_OCSP_valid: Int = 373

val SN_id_pkix_OCSP_path: String get() = "path"

const val NID_id_pkix_OCSP_path: Int = 374

val SN_id_pkix_OCSP_trustRoot: String get() = "trustRoot"

val LN_id_pkix_OCSP_trustRoot: String get() = "Trust Root"

const val NID_id_pkix_OCSP_trustRoot: Int = 375

val SN_algorithm: String get() = "algorithm"

val LN_algorithm: String get() = "algorithm"

const val NID_algorithm: Int = 376

val SN_md5WithRSA: String get() = "RSA\u002DNP\u002DMD5"

val LN_md5WithRSA: String get() = "md5WithRSA"

const val NID_md5WithRSA: Int = 104

val SN_des_ecb: String get() = "DES\u002DECB"

val LN_des_ecb: String get() = "des\u002Decb"

const val NID_des_ecb: Int = 29

val SN_des_cbc: String get() = "DES\u002DCBC"

val LN_des_cbc: String get() = "des\u002Dcbc"

const val NID_des_cbc: Int = 31

val SN_des_ofb64: String get() = "DES\u002DOFB"

val LN_des_ofb64: String get() = "des\u002Dofb"

const val NID_des_ofb64: Int = 45

val SN_des_cfb64: String get() = "DES\u002DCFB"

val LN_des_cfb64: String get() = "des\u002Dcfb"

const val NID_des_cfb64: Int = 30

val SN_rsaSignature: String get() = "rsaSignature"

const val NID_rsaSignature: Int = 377

val SN_dsa_2: String get() = "DSA\u002Dold"

val LN_dsa_2: String get() = "dsaEncryption\u002Dold"

const val NID_dsa_2: Int = 67

val SN_dsaWithSHA: String get() = "DSA\u002DSHA"

val LN_dsaWithSHA: String get() = "dsaWithSHA"

const val NID_dsaWithSHA: Int = 66

val SN_shaWithRSAEncryption: String get() = "RSA\u002DSHA"

val LN_shaWithRSAEncryption: String get() = "shaWithRSAEncryption"

const val NID_shaWithRSAEncryption: Int = 42

val SN_des_ede_ecb: String get() = "DES\u002DEDE"

val LN_des_ede_ecb: String get() = "des\u002Dede"

const val NID_des_ede_ecb: Int = 32

val SN_des_ede3_ecb: String get() = "DES\u002DEDE3"

val LN_des_ede3_ecb: String get() = "des\u002Dede3"

const val NID_des_ede3_ecb: Int = 33

val SN_des_ede_cbc: String get() = "DES\u002DEDE\u002DCBC"

val LN_des_ede_cbc: String get() = "des\u002Dede\u002Dcbc"

const val NID_des_ede_cbc: Int = 43

val SN_des_ede_cfb64: String get() = "DES\u002DEDE\u002DCFB"

val LN_des_ede_cfb64: String get() = "des\u002Dede\u002Dcfb"

const val NID_des_ede_cfb64: Int = 60

val SN_des_ede3_cfb64: String get() = "DES\u002DEDE3\u002DCFB"

val LN_des_ede3_cfb64: String get() = "des\u002Dede3\u002Dcfb"

const val NID_des_ede3_cfb64: Int = 61

val SN_des_ede_ofb64: String get() = "DES\u002DEDE\u002DOFB"

val LN_des_ede_ofb64: String get() = "des\u002Dede\u002Dofb"

const val NID_des_ede_ofb64: Int = 62

val SN_des_ede3_ofb64: String get() = "DES\u002DEDE3\u002DOFB"

val LN_des_ede3_ofb64: String get() = "des\u002Dede3\u002Dofb"

const val NID_des_ede3_ofb64: Int = 63

val SN_desx_cbc: String get() = "DESX\u002DCBC"

val LN_desx_cbc: String get() = "desx\u002Dcbc"

const val NID_desx_cbc: Int = 80

val SN_sha: String get() = "SHA"

val LN_sha: String get() = "sha"

const val NID_sha: Int = 41

val SN_sha1: String get() = "SHA1"

val LN_sha1: String get() = "sha1"

const val NID_sha1: Int = 64

val SN_dsaWithSHA1_2: String get() = "DSA\u002DSHA1\u002Dold"

val LN_dsaWithSHA1_2: String get() = "dsaWithSHA1\u002Dold"

const val NID_dsaWithSHA1_2: Int = 70

val SN_sha1WithRSA: String get() = "RSA\u002DSHA1\u002D2"

val LN_sha1WithRSA: String get() = "sha1WithRSA"

const val NID_sha1WithRSA: Int = 115

val SN_ripemd160: String get() = "RIPEMD160"

val LN_ripemd160: String get() = "ripemd160"

const val NID_ripemd160: Int = 117

val SN_ripemd160WithRSA: String get() = "RSA\u002DRIPEMD160"

val LN_ripemd160WithRSA: String get() = "ripemd160WithRSA"

const val NID_ripemd160WithRSA: Int = 119

val SN_blake2b512: String get() = "BLAKE2b512"

val LN_blake2b512: String get() = "blake2b512"

const val NID_blake2b512: Int = 1056

val SN_blake2s256: String get() = "BLAKE2s256"

val LN_blake2s256: String get() = "blake2s256"

const val NID_blake2s256: Int = 1057

val SN_sxnet: String get() = "SXNetID"

val LN_sxnet: String get() = "Strong Extranet ID"

const val NID_sxnet: Int = 143

val SN_X500: String get() = "X500"

val LN_X500: String get() = "directory services \u0028X.500\u0029"

const val NID_X500: Int = 11

val SN_X509: String get() = "X509"

const val NID_X509: Int = 12

val SN_commonName: String get() = "CN"

val LN_commonName: String get() = "commonName"

const val NID_commonName: Int = 13

val SN_surname: String get() = "SN"

val LN_surname: String get() = "surname"

const val NID_surname: Int = 100

val LN_serialNumber: String get() = "serialNumber"

const val NID_serialNumber: Int = 105

val SN_countryName: String get() = "C"

val LN_countryName: String get() = "countryName"

const val NID_countryName: Int = 14

val SN_localityName: String get() = "L"

val LN_localityName: String get() = "localityName"

const val NID_localityName: Int = 15

val SN_stateOrProvinceName: String get() = "ST"

val LN_stateOrProvinceName: String get() = "stateOrProvinceName"

const val NID_stateOrProvinceName: Int = 16

val SN_streetAddress: String get() = "street"

val LN_streetAddress: String get() = "streetAddress"

const val NID_streetAddress: Int = 660

val SN_organizationName: String get() = "O"

val LN_organizationName: String get() = "organizationName"

const val NID_organizationName: Int = 17

val SN_organizationalUnitName: String get() = "OU"

val LN_organizationalUnitName: String get() = "organizationalUnitName"

const val NID_organizationalUnitName: Int = 18

val SN_title: String get() = "title"

val LN_title: String get() = "title"

const val NID_title: Int = 106

val LN_description: String get() = "description"

const val NID_description: Int = 107

val LN_searchGuide: String get() = "searchGuide"

const val NID_searchGuide: Int = 859

val LN_businessCategory: String get() = "businessCategory"

const val NID_businessCategory: Int = 860

val LN_postalAddress: String get() = "postalAddress"

const val NID_postalAddress: Int = 861

val LN_postalCode: String get() = "postalCode"

const val NID_postalCode: Int = 661

val LN_postOfficeBox: String get() = "postOfficeBox"

const val NID_postOfficeBox: Int = 862

val LN_physicalDeliveryOfficeName: String get() = "physicalDeliveryOfficeName"

const val NID_physicalDeliveryOfficeName: Int = 863

val LN_telephoneNumber: String get() = "telephoneNumber"

const val NID_telephoneNumber: Int = 864

val LN_telexNumber: String get() = "telexNumber"

const val NID_telexNumber: Int = 865

val LN_teletexTerminalIdentifier: String get() = "teletexTerminalIdentifier"

const val NID_teletexTerminalIdentifier: Int = 866

val LN_facsimileTelephoneNumber: String get() = "facsimileTelephoneNumber"

const val NID_facsimileTelephoneNumber: Int = 867

val LN_x121Address: String get() = "x121Address"

const val NID_x121Address: Int = 868

val LN_internationaliSDNNumber: String get() = "internationaliSDNNumber"

const val NID_internationaliSDNNumber: Int = 869

val LN_registeredAddress: String get() = "registeredAddress"

const val NID_registeredAddress: Int = 870

val LN_destinationIndicator: String get() = "destinationIndicator"

const val NID_destinationIndicator: Int = 871

val LN_preferredDeliveryMethod: String get() = "preferredDeliveryMethod"

const val NID_preferredDeliveryMethod: Int = 872

val LN_presentationAddress: String get() = "presentationAddress"

const val NID_presentationAddress: Int = 873

val LN_supportedApplicationContext: String get() = "supportedApplicationContext"

const val NID_supportedApplicationContext: Int = 874

val SN_member: String get() = "member"

const val NID_member: Int = 875

val SN_owner: String get() = "owner"

const val NID_owner: Int = 876

val LN_roleOccupant: String get() = "roleOccupant"

const val NID_roleOccupant: Int = 877

val SN_seeAlso: String get() = "seeAlso"

const val NID_seeAlso: Int = 878

val LN_userPassword: String get() = "userPassword"

const val NID_userPassword: Int = 879

val LN_userCertificate: String get() = "userCertificate"

const val NID_userCertificate: Int = 880

val LN_cACertificate: String get() = "cACertificate"

const val NID_cACertificate: Int = 881

val LN_authorityRevocationList: String get() = "authorityRevocationList"

const val NID_authorityRevocationList: Int = 882

val LN_certificateRevocationList: String get() = "certificateRevocationList"

const val NID_certificateRevocationList: Int = 883

val LN_crossCertificatePair: String get() = "crossCertificatePair"

const val NID_crossCertificatePair: Int = 884

val SN_name: String get() = "name"

val LN_name: String get() = "name"

const val NID_name: Int = 173

val SN_givenName: String get() = "GN"

val LN_givenName: String get() = "givenName"

const val NID_givenName: Int = 99

val SN_initials: String get() = "initials"

val LN_initials: String get() = "initials"

const val NID_initials: Int = 101

val LN_generationQualifier: String get() = "generationQualifier"

const val NID_generationQualifier: Int = 509

val LN_x500UniqueIdentifier: String get() = "x500UniqueIdentifier"

const val NID_x500UniqueIdentifier: Int = 503

val SN_dnQualifier: String get() = "dnQualifier"

val LN_dnQualifier: String get() = "dnQualifier"

const val NID_dnQualifier: Int = 174

val LN_enhancedSearchGuide: String get() = "enhancedSearchGuide"

const val NID_enhancedSearchGuide: Int = 885

val LN_protocolInformation: String get() = "protocolInformation"

const val NID_protocolInformation: Int = 886

val LN_distinguishedName: String get() = "distinguishedName"

const val NID_distinguishedName: Int = 887

val LN_uniqueMember: String get() = "uniqueMember"

const val NID_uniqueMember: Int = 888

val LN_houseIdentifier: String get() = "houseIdentifier"

const val NID_houseIdentifier: Int = 889

val LN_supportedAlgorithms: String get() = "supportedAlgorithms"

const val NID_supportedAlgorithms: Int = 890

val LN_deltaRevocationList: String get() = "deltaRevocationList"

const val NID_deltaRevocationList: Int = 891

val SN_dmdName: String get() = "dmdName"

const val NID_dmdName: Int = 892

val LN_pseudonym: String get() = "pseudonym"

const val NID_pseudonym: Int = 510

val SN_role: String get() = "role"

val LN_role: String get() = "role"

const val NID_role: Int = 400

val SN_X500algorithms: String get() = "X500algorithms"

val LN_X500algorithms: String get() = "directory services \u002D algorithms"

const val NID_X500algorithms: Int = 378

val SN_rsa: String get() = "RSA"

val LN_rsa: String get() = "rsa"

const val NID_rsa: Int = 19

val SN_mdc2WithRSA: String get() = "RSA\u002DMDC2"

val LN_mdc2WithRSA: String get() = "mdc2WithRSA"

const val NID_mdc2WithRSA: Int = 96

val SN_mdc2: String get() = "MDC2"

val LN_mdc2: String get() = "mdc2"

const val NID_mdc2: Int = 95

val SN_id_ce: String get() = "id\u002Dce"

const val NID_id_ce: Int = 81

val SN_subject_directory_attributes: String get() = "subjectDirectoryAttributes"

val LN_subject_directory_attributes: String get() = "X509v3 Subject Directory Attributes"

const val NID_subject_directory_attributes: Int = 769

val SN_subject_key_identifier: String get() = "subjectKeyIdentifier"

val LN_subject_key_identifier: String get() = "X509v3 Subject Key Identifier"

const val NID_subject_key_identifier: Int = 82

val SN_key_usage: String get() = "keyUsage"

val LN_key_usage: String get() = "X509v3 Key Usage"

const val NID_key_usage: Int = 83

val SN_private_key_usage_period: String get() = "privateKeyUsagePeriod"

val LN_private_key_usage_period: String get() = "X509v3 Private Key Usage Period"

const val NID_private_key_usage_period: Int = 84

val SN_subject_alt_name: String get() = "subjectAltName"

val LN_subject_alt_name: String get() = "X509v3 Subject Alternative Name"

const val NID_subject_alt_name: Int = 85

val SN_issuer_alt_name: String get() = "issuerAltName"

val LN_issuer_alt_name: String get() = "X509v3 Issuer Alternative Name"

const val NID_issuer_alt_name: Int = 86

val SN_basic_constraints: String get() = "basicConstraints"

val LN_basic_constraints: String get() = "X509v3 Basic Constraints"

const val NID_basic_constraints: Int = 87

val SN_crl_number: String get() = "crlNumber"

val LN_crl_number: String get() = "X509v3 CRL Number"

const val NID_crl_number: Int = 88

val SN_crl_reason: String get() = "CRLReason"

val LN_crl_reason: String get() = "X509v3 CRL Reason Code"

const val NID_crl_reason: Int = 141

val SN_invalidity_date: String get() = "invalidityDate"

val LN_invalidity_date: String get() = "Invalidity Date"

const val NID_invalidity_date: Int = 142

val SN_delta_crl: String get() = "deltaCRL"

val LN_delta_crl: String get() = "X509v3 Delta CRL Indicator"

const val NID_delta_crl: Int = 140

val SN_issuing_distribution_point: String get() = "issuingDistributionPoint"

val LN_issuing_distribution_point: String get() = "X509v3 Issuing Distribution Point"

const val NID_issuing_distribution_point: Int = 770

val SN_certificate_issuer: String get() = "certificateIssuer"

val LN_certificate_issuer: String get() = "X509v3 Certificate Issuer"

const val NID_certificate_issuer: Int = 771

val SN_name_constraints: String get() = "nameConstraints"

val LN_name_constraints: String get() = "X509v3 Name Constraints"

const val NID_name_constraints: Int = 666

val SN_crl_distribution_points: String get() = "crlDistributionPoints"

val LN_crl_distribution_points: String get() = "X509v3 CRL Distribution Points"

const val NID_crl_distribution_points: Int = 103

val SN_certificate_policies: String get() = "certificatePolicies"

val LN_certificate_policies: String get() = "X509v3 Certificate Policies"

const val NID_certificate_policies: Int = 89

val SN_any_policy: String get() = "anyPolicy"

val LN_any_policy: String get() = "X509v3 Any Policy"

const val NID_any_policy: Int = 746

val SN_policy_mappings: String get() = "policyMappings"

val LN_policy_mappings: String get() = "X509v3 Policy Mappings"

const val NID_policy_mappings: Int = 747

val SN_authority_key_identifier: String get() = "authorityKeyIdentifier"

val LN_authority_key_identifier: String get() = "X509v3 Authority Key Identifier"

const val NID_authority_key_identifier: Int = 90

val SN_policy_constraints: String get() = "policyConstraints"

val LN_policy_constraints: String get() = "X509v3 Policy Constraints"

const val NID_policy_constraints: Int = 401

val SN_ext_key_usage: String get() = "extendedKeyUsage"

val LN_ext_key_usage: String get() = "X509v3 Extended Key Usage"

const val NID_ext_key_usage: Int = 126

val SN_freshest_crl: String get() = "freshestCRL"

val LN_freshest_crl: String get() = "X509v3 Freshest CRL"

const val NID_freshest_crl: Int = 857

val SN_inhibit_any_policy: String get() = "inhibitAnyPolicy"

val LN_inhibit_any_policy: String get() = "X509v3 Inhibit Any Policy"

const val NID_inhibit_any_policy: Int = 748

val SN_target_information: String get() = "targetInformation"

val LN_target_information: String get() = "X509v3 AC Targeting"

const val NID_target_information: Int = 402

val SN_no_rev_avail: String get() = "noRevAvail"

val LN_no_rev_avail: String get() = "X509v3 No Revocation Available"

const val NID_no_rev_avail: Int = 403

val SN_anyExtendedKeyUsage: String get() = "anyExtendedKeyUsage"

val LN_anyExtendedKeyUsage: String get() = "Any Extended Key Usage"

const val NID_anyExtendedKeyUsage: Int = 910

val SN_netscape: String get() = "Netscape"

val LN_netscape: String get() = "Netscape Communications Corp."

const val NID_netscape: Int = 57

val SN_netscape_cert_extension: String get() = "nsCertExt"

val LN_netscape_cert_extension: String get() = "Netscape Certificate Extension"

const val NID_netscape_cert_extension: Int = 58

val SN_netscape_data_type: String get() = "nsDataType"

val LN_netscape_data_type: String get() = "Netscape Data Type"

const val NID_netscape_data_type: Int = 59

val SN_netscape_cert_type: String get() = "nsCertType"

val LN_netscape_cert_type: String get() = "Netscape Cert Type"

const val NID_netscape_cert_type: Int = 71

val SN_netscape_base_url: String get() = "nsBaseUrl"

val LN_netscape_base_url: String get() = "Netscape Base Url"

const val NID_netscape_base_url: Int = 72

val SN_netscape_revocation_url: String get() = "nsRevocationUrl"

val LN_netscape_revocation_url: String get() = "Netscape Revocation Url"

const val NID_netscape_revocation_url: Int = 73

val SN_netscape_ca_revocation_url: String get() = "nsCaRevocationUrl"

val LN_netscape_ca_revocation_url: String get() = "Netscape CA Revocation Url"

const val NID_netscape_ca_revocation_url: Int = 74

val SN_netscape_renewal_url: String get() = "nsRenewalUrl"

val LN_netscape_renewal_url: String get() = "Netscape Renewal Url"

const val NID_netscape_renewal_url: Int = 75

val SN_netscape_ca_policy_url: String get() = "nsCaPolicyUrl"

val LN_netscape_ca_policy_url: String get() = "Netscape CA Policy Url"

const val NID_netscape_ca_policy_url: Int = 76

val SN_netscape_ssl_server_name: String get() = "nsSslServerName"

val LN_netscape_ssl_server_name: String get() = "Netscape SSL Server Name"

const val NID_netscape_ssl_server_name: Int = 77

val SN_netscape_comment: String get() = "nsComment"

val LN_netscape_comment: String get() = "Netscape Comment"

const val NID_netscape_comment: Int = 78

val SN_netscape_cert_sequence: String get() = "nsCertSequence"

val LN_netscape_cert_sequence: String get() = "Netscape Certificate Sequence"

const val NID_netscape_cert_sequence: Int = 79

val SN_ns_sgc: String get() = "nsSGC"

val LN_ns_sgc: String get() = "Netscape Server Gated Crypto"

const val NID_ns_sgc: Int = 139

val SN_org: String get() = "ORG"

val LN_org: String get() = "org"

const val NID_org: Int = 379

val SN_dod: String get() = "DOD"

val LN_dod: String get() = "dod"

const val NID_dod: Int = 380

val SN_iana: String get() = "IANA"

val LN_iana: String get() = "iana"

const val NID_iana: Int = 381

val SN_Directory: String get() = "directory"

val LN_Directory: String get() = "Directory"

const val NID_Directory: Int = 382

val SN_Management: String get() = "mgmt"

val LN_Management: String get() = "Management"

const val NID_Management: Int = 383

val SN_Experimental: String get() = "experimental"

val LN_Experimental: String get() = "Experimental"

const val NID_Experimental: Int = 384

val SN_Private: String get() = "private"

val LN_Private: String get() = "Private"

const val NID_Private: Int = 385

val SN_Security: String get() = "security"

val LN_Security: String get() = "Security"

const val NID_Security: Int = 386

val SN_SNMPv2: String get() = "snmpv2"

val LN_SNMPv2: String get() = "SNMPv2"

const val NID_SNMPv2: Int = 387

val LN_Mail: String get() = "Mail"

const val NID_Mail: Int = 388

val SN_Enterprises: String get() = "enterprises"

val LN_Enterprises: String get() = "Enterprises"

const val NID_Enterprises: Int = 389

val SN_dcObject: String get() = "dcobject"

val LN_dcObject: String get() = "dcObject"

const val NID_dcObject: Int = 390

val SN_mime_mhs: String get() = "mime\u002Dmhs"

val LN_mime_mhs: String get() = "MIME MHS"

const val NID_mime_mhs: Int = 504

val SN_mime_mhs_headings: String get() = "mime\u002Dmhs\u002Dheadings"

val LN_mime_mhs_headings: String get() = "mime\u002Dmhs\u002Dheadings"

const val NID_mime_mhs_headings: Int = 505

val SN_mime_mhs_bodies: String get() = "mime\u002Dmhs\u002Dbodies"

val LN_mime_mhs_bodies: String get() = "mime\u002Dmhs\u002Dbodies"

const val NID_mime_mhs_bodies: Int = 506

val SN_id_hex_partial_message: String get() = "id\u002Dhex\u002Dpartial\u002Dmessage"

val LN_id_hex_partial_message: String get() = "id\u002Dhex\u002Dpartial\u002Dmessage"

const val NID_id_hex_partial_message: Int = 507

val SN_id_hex_multipart_message: String get() = "id\u002Dhex\u002Dmultipart\u002Dmessage"

val LN_id_hex_multipart_message: String get() = "id\u002Dhex\u002Dmultipart\u002Dmessage"

const val NID_id_hex_multipart_message: Int = 508

val SN_zlib_compression: String get() = "ZLIB"

val LN_zlib_compression: String get() = "zlib compression"

const val NID_zlib_compression: Int = 125

val SN_aes_128_ecb: String get() = "AES\u002D128\u002DECB"

val LN_aes_128_ecb: String get() = "aes\u002D128\u002Decb"

const val NID_aes_128_ecb: Int = 418

val SN_aes_128_cbc: String get() = "AES\u002D128\u002DCBC"

val LN_aes_128_cbc: String get() = "aes\u002D128\u002Dcbc"

const val NID_aes_128_cbc: Int = 419

val SN_aes_128_ofb128: String get() = "AES\u002D128\u002DOFB"

val LN_aes_128_ofb128: String get() = "aes\u002D128\u002Dofb"

const val NID_aes_128_ofb128: Int = 420

val SN_aes_128_cfb128: String get() = "AES\u002D128\u002DCFB"

val LN_aes_128_cfb128: String get() = "aes\u002D128\u002Dcfb"

const val NID_aes_128_cfb128: Int = 421

val SN_id_aes128_wrap: String get() = "id\u002Daes128\u002Dwrap"

const val NID_id_aes128_wrap: Int = 788

val SN_aes_128_gcm: String get() = "id\u002Daes128\u002DGCM"

val LN_aes_128_gcm: String get() = "aes\u002D128\u002Dgcm"

const val NID_aes_128_gcm: Int = 895

val SN_aes_128_ccm: String get() = "id\u002Daes128\u002DCCM"

val LN_aes_128_ccm: String get() = "aes\u002D128\u002Dccm"

const val NID_aes_128_ccm: Int = 896

val SN_id_aes128_wrap_pad: String get() = "id\u002Daes128\u002Dwrap\u002Dpad"

const val NID_id_aes128_wrap_pad: Int = 897

val SN_aes_192_ecb: String get() = "AES\u002D192\u002DECB"

val LN_aes_192_ecb: String get() = "aes\u002D192\u002Decb"

const val NID_aes_192_ecb: Int = 422

val SN_aes_192_cbc: String get() = "AES\u002D192\u002DCBC"

val LN_aes_192_cbc: String get() = "aes\u002D192\u002Dcbc"

const val NID_aes_192_cbc: Int = 423

val SN_aes_192_ofb128: String get() = "AES\u002D192\u002DOFB"

val LN_aes_192_ofb128: String get() = "aes\u002D192\u002Dofb"

const val NID_aes_192_ofb128: Int = 424

val SN_aes_192_cfb128: String get() = "AES\u002D192\u002DCFB"

val LN_aes_192_cfb128: String get() = "aes\u002D192\u002Dcfb"

const val NID_aes_192_cfb128: Int = 425

val SN_id_aes192_wrap: String get() = "id\u002Daes192\u002Dwrap"

const val NID_id_aes192_wrap: Int = 789

val SN_aes_192_gcm: String get() = "id\u002Daes192\u002DGCM"

val LN_aes_192_gcm: String get() = "aes\u002D192\u002Dgcm"

const val NID_aes_192_gcm: Int = 898

val SN_aes_192_ccm: String get() = "id\u002Daes192\u002DCCM"

val LN_aes_192_ccm: String get() = "aes\u002D192\u002Dccm"

const val NID_aes_192_ccm: Int = 899

val SN_id_aes192_wrap_pad: String get() = "id\u002Daes192\u002Dwrap\u002Dpad"

const val NID_id_aes192_wrap_pad: Int = 900

val SN_aes_256_ecb: String get() = "AES\u002D256\u002DECB"

val LN_aes_256_ecb: String get() = "aes\u002D256\u002Decb"

const val NID_aes_256_ecb: Int = 426

val SN_aes_256_cbc: String get() = "AES\u002D256\u002DCBC"

val LN_aes_256_cbc: String get() = "aes\u002D256\u002Dcbc"

const val NID_aes_256_cbc: Int = 427

val SN_aes_256_ofb128: String get() = "AES\u002D256\u002DOFB"

val LN_aes_256_ofb128: String get() = "aes\u002D256\u002Dofb"

const val NID_aes_256_ofb128: Int = 428

val SN_aes_256_cfb128: String get() = "AES\u002D256\u002DCFB"

val LN_aes_256_cfb128: String get() = "aes\u002D256\u002Dcfb"

const val NID_aes_256_cfb128: Int = 429

val SN_id_aes256_wrap: String get() = "id\u002Daes256\u002Dwrap"

const val NID_id_aes256_wrap: Int = 790

val SN_aes_256_gcm: String get() = "id\u002Daes256\u002DGCM"

val LN_aes_256_gcm: String get() = "aes\u002D256\u002Dgcm"

const val NID_aes_256_gcm: Int = 901

val SN_aes_256_ccm: String get() = "id\u002Daes256\u002DCCM"

val LN_aes_256_ccm: String get() = "aes\u002D256\u002Dccm"

const val NID_aes_256_ccm: Int = 902

val SN_id_aes256_wrap_pad: String get() = "id\u002Daes256\u002Dwrap\u002Dpad"

const val NID_id_aes256_wrap_pad: Int = 903

val SN_aes_128_cfb1: String get() = "AES\u002D128\u002DCFB1"

val LN_aes_128_cfb1: String get() = "aes\u002D128\u002Dcfb1"

const val NID_aes_128_cfb1: Int = 650

val SN_aes_192_cfb1: String get() = "AES\u002D192\u002DCFB1"

val LN_aes_192_cfb1: String get() = "aes\u002D192\u002Dcfb1"

const val NID_aes_192_cfb1: Int = 651

val SN_aes_256_cfb1: String get() = "AES\u002D256\u002DCFB1"

val LN_aes_256_cfb1: String get() = "aes\u002D256\u002Dcfb1"

const val NID_aes_256_cfb1: Int = 652

val SN_aes_128_cfb8: String get() = "AES\u002D128\u002DCFB8"

val LN_aes_128_cfb8: String get() = "aes\u002D128\u002Dcfb8"

const val NID_aes_128_cfb8: Int = 653

val SN_aes_192_cfb8: String get() = "AES\u002D192\u002DCFB8"

val LN_aes_192_cfb8: String get() = "aes\u002D192\u002Dcfb8"

const val NID_aes_192_cfb8: Int = 654

val SN_aes_256_cfb8: String get() = "AES\u002D256\u002DCFB8"

val LN_aes_256_cfb8: String get() = "aes\u002D256\u002Dcfb8"

const val NID_aes_256_cfb8: Int = 655

val SN_aes_128_ctr: String get() = "AES\u002D128\u002DCTR"

val LN_aes_128_ctr: String get() = "aes\u002D128\u002Dctr"

const val NID_aes_128_ctr: Int = 904

val SN_aes_192_ctr: String get() = "AES\u002D192\u002DCTR"

val LN_aes_192_ctr: String get() = "aes\u002D192\u002Dctr"

const val NID_aes_192_ctr: Int = 905

val SN_aes_256_ctr: String get() = "AES\u002D256\u002DCTR"

val LN_aes_256_ctr: String get() = "aes\u002D256\u002Dctr"

const val NID_aes_256_ctr: Int = 906

val SN_aes_128_ocb: String get() = "AES\u002D128\u002DOCB"

val LN_aes_128_ocb: String get() = "aes\u002D128\u002Docb"

const val NID_aes_128_ocb: Int = 958

val SN_aes_192_ocb: String get() = "AES\u002D192\u002DOCB"

val LN_aes_192_ocb: String get() = "aes\u002D192\u002Docb"

const val NID_aes_192_ocb: Int = 959

val SN_aes_256_ocb: String get() = "AES\u002D256\u002DOCB"

val LN_aes_256_ocb: String get() = "aes\u002D256\u002Docb"

const val NID_aes_256_ocb: Int = 960

val SN_aes_128_xts: String get() = "AES\u002D128\u002DXTS"

val LN_aes_128_xts: String get() = "aes\u002D128\u002Dxts"

const val NID_aes_128_xts: Int = 913

val SN_aes_256_xts: String get() = "AES\u002D256\u002DXTS"

val LN_aes_256_xts: String get() = "aes\u002D256\u002Dxts"

const val NID_aes_256_xts: Int = 914

val SN_des_cfb1: String get() = "DES\u002DCFB1"

val LN_des_cfb1: String get() = "des\u002Dcfb1"

const val NID_des_cfb1: Int = 656

val SN_des_cfb8: String get() = "DES\u002DCFB8"

val LN_des_cfb8: String get() = "des\u002Dcfb8"

const val NID_des_cfb8: Int = 657

val SN_des_ede3_cfb1: String get() = "DES\u002DEDE3\u002DCFB1"

val LN_des_ede3_cfb1: String get() = "des\u002Dede3\u002Dcfb1"

const val NID_des_ede3_cfb1: Int = 658

val SN_des_ede3_cfb8: String get() = "DES\u002DEDE3\u002DCFB8"

val LN_des_ede3_cfb8: String get() = "des\u002Dede3\u002Dcfb8"

const val NID_des_ede3_cfb8: Int = 659

val SN_sha256: String get() = "SHA256"

val LN_sha256: String get() = "sha256"

const val NID_sha256: Int = 672

val SN_sha384: String get() = "SHA384"

val LN_sha384: String get() = "sha384"

const val NID_sha384: Int = 673

val SN_sha512: String get() = "SHA512"

val LN_sha512: String get() = "sha512"

const val NID_sha512: Int = 674

val SN_sha224: String get() = "SHA224"

val LN_sha224: String get() = "sha224"

const val NID_sha224: Int = 675

val SN_dsa_with_SHA224: String get() = "dsa_with_SHA224"

const val NID_dsa_with_SHA224: Int = 802

val SN_dsa_with_SHA256: String get() = "dsa_with_SHA256"

const val NID_dsa_with_SHA256: Int = 803

val SN_hold_instruction_code: String get() = "holdInstructionCode"

val LN_hold_instruction_code: String get() = "Hold Instruction Code"

const val NID_hold_instruction_code: Int = 430

val SN_hold_instruction_none: String get() = "holdInstructionNone"

val LN_hold_instruction_none: String get() = "Hold Instruction None"

const val NID_hold_instruction_none: Int = 431

val SN_hold_instruction_call_issuer: String get() = "holdInstructionCallIssuer"

val LN_hold_instruction_call_issuer: String get() = "Hold Instruction Call Issuer"

const val NID_hold_instruction_call_issuer: Int = 432

val SN_hold_instruction_reject: String get() = "holdInstructionReject"

val LN_hold_instruction_reject: String get() = "Hold Instruction Reject"

const val NID_hold_instruction_reject: Int = 433

val SN_data: String get() = "data"

const val NID_data: Int = 434

val SN_pss: String get() = "pss"

const val NID_pss: Int = 435

val SN_ucl: String get() = "ucl"

const val NID_ucl: Int = 436

val SN_pilot: String get() = "pilot"

const val NID_pilot: Int = 437

val LN_pilotAttributeType: String get() = "pilotAttributeType"

const val NID_pilotAttributeType: Int = 438

val LN_pilotAttributeSyntax: String get() = "pilotAttributeSyntax"

const val NID_pilotAttributeSyntax: Int = 439

val LN_pilotObjectClass: String get() = "pilotObjectClass"

const val NID_pilotObjectClass: Int = 440

val LN_pilotGroups: String get() = "pilotGroups"

const val NID_pilotGroups: Int = 441

val LN_iA5StringSyntax: String get() = "iA5StringSyntax"

const val NID_iA5StringSyntax: Int = 442

val LN_caseIgnoreIA5StringSyntax: String get() = "caseIgnoreIA5StringSyntax"

const val NID_caseIgnoreIA5StringSyntax: Int = 443

val LN_pilotObject: String get() = "pilotObject"

const val NID_pilotObject: Int = 444

val LN_pilotPerson: String get() = "pilotPerson"

const val NID_pilotPerson: Int = 445

val SN_account: String get() = "account"

const val NID_account: Int = 446

val SN_document: String get() = "document"

const val NID_document: Int = 447

val SN_room: String get() = "room"

const val NID_room: Int = 448

val LN_documentSeries: String get() = "documentSeries"

const val NID_documentSeries: Int = 449

val SN_Domain: String get() = "domain"

val LN_Domain: String get() = "Domain"

const val NID_Domain: Int = 392

val LN_rFC822localPart: String get() = "rFC822localPart"

const val NID_rFC822localPart: Int = 450

val LN_dNSDomain: String get() = "dNSDomain"

const val NID_dNSDomain: Int = 451

val LN_domainRelatedObject: String get() = "domainRelatedObject"

const val NID_domainRelatedObject: Int = 452

val LN_friendlyCountry: String get() = "friendlyCountry"

const val NID_friendlyCountry: Int = 453

val LN_simpleSecurityObject: String get() = "simpleSecurityObject"

const val NID_simpleSecurityObject: Int = 454

val LN_pilotOrganization: String get() = "pilotOrganization"

const val NID_pilotOrganization: Int = 455

val LN_pilotDSA: String get() = "pilotDSA"

const val NID_pilotDSA: Int = 456

val LN_qualityLabelledData: String get() = "qualityLabelledData"

const val NID_qualityLabelledData: Int = 457

val SN_userId: String get() = "UID"

val LN_userId: String get() = "userId"

const val NID_userId: Int = 458

val LN_textEncodedORAddress: String get() = "textEncodedORAddress"

const val NID_textEncodedORAddress: Int = 459

val SN_rfc822Mailbox: String get() = "mail"

val LN_rfc822Mailbox: String get() = "rfc822Mailbox"

const val NID_rfc822Mailbox: Int = 460

val SN_info: String get() = "info"

const val NID_info: Int = 461

val LN_favouriteDrink: String get() = "favouriteDrink"

const val NID_favouriteDrink: Int = 462

val LN_roomNumber: String get() = "roomNumber"

const val NID_roomNumber: Int = 463

val SN_photo: String get() = "photo"

const val NID_photo: Int = 464

val LN_userClass: String get() = "userClass"

const val NID_userClass: Int = 465

val SN_host: String get() = "host"

const val NID_host: Int = 466

val SN_manager: String get() = "manager"

const val NID_manager: Int = 467

val LN_documentIdentifier: String get() = "documentIdentifier"

const val NID_documentIdentifier: Int = 468

val LN_documentTitle: String get() = "documentTitle"

const val NID_documentTitle: Int = 469

val LN_documentVersion: String get() = "documentVersion"

const val NID_documentVersion: Int = 470

val LN_documentAuthor: String get() = "documentAuthor"

const val NID_documentAuthor: Int = 471

val LN_documentLocation: String get() = "documentLocation"

const val NID_documentLocation: Int = 472

val LN_homeTelephoneNumber: String get() = "homeTelephoneNumber"

const val NID_homeTelephoneNumber: Int = 473

val SN_secretary: String get() = "secretary"

const val NID_secretary: Int = 474

val LN_otherMailbox: String get() = "otherMailbox"

const val NID_otherMailbox: Int = 475

val LN_lastModifiedTime: String get() = "lastModifiedTime"

const val NID_lastModifiedTime: Int = 476

val LN_lastModifiedBy: String get() = "lastModifiedBy"

const val NID_lastModifiedBy: Int = 477

val SN_domainComponent: String get() = "DC"

val LN_domainComponent: String get() = "domainComponent"

const val NID_domainComponent: Int = 391

val LN_aRecord: String get() = "aRecord"

const val NID_aRecord: Int = 478

val LN_pilotAttributeType27: String get() = "pilotAttributeType27"

const val NID_pilotAttributeType27: Int = 479

val LN_mXRecord: String get() = "mXRecord"

const val NID_mXRecord: Int = 480

val LN_nSRecord: String get() = "nSRecord"

const val NID_nSRecord: Int = 481

val LN_sOARecord: String get() = "sOARecord"

const val NID_sOARecord: Int = 482

val LN_cNAMERecord: String get() = "cNAMERecord"

const val NID_cNAMERecord: Int = 483

val LN_associatedDomain: String get() = "associatedDomain"

const val NID_associatedDomain: Int = 484

val LN_associatedName: String get() = "associatedName"

const val NID_associatedName: Int = 485

val LN_homePostalAddress: String get() = "homePostalAddress"

const val NID_homePostalAddress: Int = 486

val LN_personalTitle: String get() = "personalTitle"

const val NID_personalTitle: Int = 487

val LN_mobileTelephoneNumber: String get() = "mobileTelephoneNumber"

const val NID_mobileTelephoneNumber: Int = 488

val LN_pagerTelephoneNumber: String get() = "pagerTelephoneNumber"

const val NID_pagerTelephoneNumber: Int = 489

val LN_friendlyCountryName: String get() = "friendlyCountryName"

const val NID_friendlyCountryName: Int = 490

val SN_uniqueIdentifier: String get() = "uid"

val LN_uniqueIdentifier: String get() = "uniqueIdentifier"

const val NID_uniqueIdentifier: Int = 102

val LN_organizationalStatus: String get() = "organizationalStatus"

const val NID_organizationalStatus: Int = 491

val LN_janetMailbox: String get() = "janetMailbox"

const val NID_janetMailbox: Int = 492

val LN_mailPreferenceOption: String get() = "mailPreferenceOption"

const val NID_mailPreferenceOption: Int = 493

val LN_buildingName: String get() = "buildingName"

const val NID_buildingName: Int = 494

val LN_dSAQuality: String get() = "dSAQuality"

const val NID_dSAQuality: Int = 495

val LN_singleLevelQuality: String get() = "singleLevelQuality"

const val NID_singleLevelQuality: Int = 496

val LN_subtreeMinimumQuality: String get() = "subtreeMinimumQuality"

const val NID_subtreeMinimumQuality: Int = 497

val LN_subtreeMaximumQuality: String get() = "subtreeMaximumQuality"

const val NID_subtreeMaximumQuality: Int = 498

val LN_personalSignature: String get() = "personalSignature"

const val NID_personalSignature: Int = 499

val LN_dITRedirect: String get() = "dITRedirect"

const val NID_dITRedirect: Int = 500

val SN_audio: String get() = "audio"

const val NID_audio: Int = 501

val LN_documentPublisher: String get() = "documentPublisher"

const val NID_documentPublisher: Int = 502

val SN_id_set: String get() = "id\u002Dset"

val LN_id_set: String get() = "Secure Electronic Transactions"

const val NID_id_set: Int = 512

val SN_set_ctype: String get() = "set\u002Dctype"

val LN_set_ctype: String get() = "content types"

const val NID_set_ctype: Int = 513

val SN_set_msgExt: String get() = "set\u002DmsgExt"

val LN_set_msgExt: String get() = "message extensions"

const val NID_set_msgExt: Int = 514

val SN_set_attr: String get() = "set\u002Dattr"

const val NID_set_attr: Int = 515

val SN_set_policy: String get() = "set\u002Dpolicy"

const val NID_set_policy: Int = 516

val SN_set_certExt: String get() = "set\u002DcertExt"

val LN_set_certExt: String get() = "certificate extensions"

const val NID_set_certExt: Int = 517

val SN_set_brand: String get() = "set\u002Dbrand"

const val NID_set_brand: Int = 518

val SN_setct_PANData: String get() = "setct\u002DPANData"

const val NID_setct_PANData: Int = 519

val SN_setct_PANToken: String get() = "setct\u002DPANToken"

const val NID_setct_PANToken: Int = 520

val SN_setct_PANOnly: String get() = "setct\u002DPANOnly"

const val NID_setct_PANOnly: Int = 521

val SN_setct_OIData: String get() = "setct\u002DOIData"

const val NID_setct_OIData: Int = 522

val SN_setct_PI: String get() = "setct\u002DPI"

const val NID_setct_PI: Int = 523

val SN_setct_PIData: String get() = "setct\u002DPIData"

const val NID_setct_PIData: Int = 524

val SN_setct_PIDataUnsigned: String get() = "setct\u002DPIDataUnsigned"

const val NID_setct_PIDataUnsigned: Int = 525

val SN_setct_HODInput: String get() = "setct\u002DHODInput"

const val NID_setct_HODInput: Int = 526

val SN_setct_AuthResBaggage: String get() = "setct\u002DAuthResBaggage"

const val NID_setct_AuthResBaggage: Int = 527

val SN_setct_AuthRevReqBaggage: String get() = "setct\u002DAuthRevReqBaggage"

const val NID_setct_AuthRevReqBaggage: Int = 528

val SN_setct_AuthRevResBaggage: String get() = "setct\u002DAuthRevResBaggage"

const val NID_setct_AuthRevResBaggage: Int = 529

val SN_setct_CapTokenSeq: String get() = "setct\u002DCapTokenSeq"

const val NID_setct_CapTokenSeq: Int = 530

val SN_setct_PInitResData: String get() = "setct\u002DPInitResData"

const val NID_setct_PInitResData: Int = 531

val SN_setct_PI_TBS: String get() = "setct\u002DPI\u002DTBS"

const val NID_setct_PI_TBS: Int = 532

val SN_setct_PResData: String get() = "setct\u002DPResData"

const val NID_setct_PResData: Int = 533

val SN_setct_AuthReqTBS: String get() = "setct\u002DAuthReqTBS"

const val NID_setct_AuthReqTBS: Int = 534

val SN_setct_AuthResTBS: String get() = "setct\u002DAuthResTBS"

const val NID_setct_AuthResTBS: Int = 535

val SN_setct_AuthResTBSX: String get() = "setct\u002DAuthResTBSX"

const val NID_setct_AuthResTBSX: Int = 536

val SN_setct_AuthTokenTBS: String get() = "setct\u002DAuthTokenTBS"

const val NID_setct_AuthTokenTBS: Int = 537

val SN_setct_CapTokenData: String get() = "setct\u002DCapTokenData"

const val NID_setct_CapTokenData: Int = 538

val SN_setct_CapTokenTBS: String get() = "setct\u002DCapTokenTBS"

const val NID_setct_CapTokenTBS: Int = 539

val SN_setct_AcqCardCodeMsg: String get() = "setct\u002DAcqCardCodeMsg"

const val NID_setct_AcqCardCodeMsg: Int = 540

val SN_setct_AuthRevReqTBS: String get() = "setct\u002DAuthRevReqTBS"

const val NID_setct_AuthRevReqTBS: Int = 541

val SN_setct_AuthRevResData: String get() = "setct\u002DAuthRevResData"

const val NID_setct_AuthRevResData: Int = 542

val SN_setct_AuthRevResTBS: String get() = "setct\u002DAuthRevResTBS"

const val NID_setct_AuthRevResTBS: Int = 543

val SN_setct_CapReqTBS: String get() = "setct\u002DCapReqTBS"

const val NID_setct_CapReqTBS: Int = 544

val SN_setct_CapReqTBSX: String get() = "setct\u002DCapReqTBSX"

const val NID_setct_CapReqTBSX: Int = 545

val SN_setct_CapResData: String get() = "setct\u002DCapResData"

const val NID_setct_CapResData: Int = 546

val SN_setct_CapRevReqTBS: String get() = "setct\u002DCapRevReqTBS"

const val NID_setct_CapRevReqTBS: Int = 547

val SN_setct_CapRevReqTBSX: String get() = "setct\u002DCapRevReqTBSX"

const val NID_setct_CapRevReqTBSX: Int = 548

val SN_setct_CapRevResData: String get() = "setct\u002DCapRevResData"

const val NID_setct_CapRevResData: Int = 549

val SN_setct_CredReqTBS: String get() = "setct\u002DCredReqTBS"

const val NID_setct_CredReqTBS: Int = 550

val SN_setct_CredReqTBSX: String get() = "setct\u002DCredReqTBSX"

const val NID_setct_CredReqTBSX: Int = 551

val SN_setct_CredResData: String get() = "setct\u002DCredResData"

const val NID_setct_CredResData: Int = 552

val SN_setct_CredRevReqTBS: String get() = "setct\u002DCredRevReqTBS"

const val NID_setct_CredRevReqTBS: Int = 553

val SN_setct_CredRevReqTBSX: String get() = "setct\u002DCredRevReqTBSX"

const val NID_setct_CredRevReqTBSX: Int = 554

val SN_setct_CredRevResData: String get() = "setct\u002DCredRevResData"

const val NID_setct_CredRevResData: Int = 555

val SN_setct_PCertReqData: String get() = "setct\u002DPCertReqData"

const val NID_setct_PCertReqData: Int = 556

val SN_setct_PCertResTBS: String get() = "setct\u002DPCertResTBS"

const val NID_setct_PCertResTBS: Int = 557

val SN_setct_BatchAdminReqData: String get() = "setct\u002DBatchAdminReqData"

const val NID_setct_BatchAdminReqData: Int = 558

val SN_setct_BatchAdminResData: String get() = "setct\u002DBatchAdminResData"

const val NID_setct_BatchAdminResData: Int = 559

val SN_setct_CardCInitResTBS: String get() = "setct\u002DCardCInitResTBS"

const val NID_setct_CardCInitResTBS: Int = 560

val SN_setct_MeAqCInitResTBS: String get() = "setct\u002DMeAqCInitResTBS"

const val NID_setct_MeAqCInitResTBS: Int = 561

val SN_setct_RegFormResTBS: String get() = "setct\u002DRegFormResTBS"

const val NID_setct_RegFormResTBS: Int = 562

val SN_setct_CertReqData: String get() = "setct\u002DCertReqData"

const val NID_setct_CertReqData: Int = 563

val SN_setct_CertReqTBS: String get() = "setct\u002DCertReqTBS"

const val NID_setct_CertReqTBS: Int = 564

val SN_setct_CertResData: String get() = "setct\u002DCertResData"

const val NID_setct_CertResData: Int = 565

val SN_setct_CertInqReqTBS: String get() = "setct\u002DCertInqReqTBS"

const val NID_setct_CertInqReqTBS: Int = 566

val SN_setct_ErrorTBS: String get() = "setct\u002DErrorTBS"

const val NID_setct_ErrorTBS: Int = 567

val SN_setct_PIDualSignedTBE: String get() = "setct\u002DPIDualSignedTBE"

const val NID_setct_PIDualSignedTBE: Int = 568

val SN_setct_PIUnsignedTBE: String get() = "setct\u002DPIUnsignedTBE"

const val NID_setct_PIUnsignedTBE: Int = 569

val SN_setct_AuthReqTBE: String get() = "setct\u002DAuthReqTBE"

const val NID_setct_AuthReqTBE: Int = 570

val SN_setct_AuthResTBE: String get() = "setct\u002DAuthResTBE"

const val NID_setct_AuthResTBE: Int = 571

val SN_setct_AuthResTBEX: String get() = "setct\u002DAuthResTBEX"

const val NID_setct_AuthResTBEX: Int = 572

val SN_setct_AuthTokenTBE: String get() = "setct\u002DAuthTokenTBE"

const val NID_setct_AuthTokenTBE: Int = 573

val SN_setct_CapTokenTBE: String get() = "setct\u002DCapTokenTBE"

const val NID_setct_CapTokenTBE: Int = 574

val SN_setct_CapTokenTBEX: String get() = "setct\u002DCapTokenTBEX"

const val NID_setct_CapTokenTBEX: Int = 575

val SN_setct_AcqCardCodeMsgTBE: String get() = "setct\u002DAcqCardCodeMsgTBE"

const val NID_setct_AcqCardCodeMsgTBE: Int = 576

val SN_setct_AuthRevReqTBE: String get() = "setct\u002DAuthRevReqTBE"

const val NID_setct_AuthRevReqTBE: Int = 577

val SN_setct_AuthRevResTBE: String get() = "setct\u002DAuthRevResTBE"

const val NID_setct_AuthRevResTBE: Int = 578

val SN_setct_AuthRevResTBEB: String get() = "setct\u002DAuthRevResTBEB"

const val NID_setct_AuthRevResTBEB: Int = 579

val SN_setct_CapReqTBE: String get() = "setct\u002DCapReqTBE"

const val NID_setct_CapReqTBE: Int = 580

val SN_setct_CapReqTBEX: String get() = "setct\u002DCapReqTBEX"

const val NID_setct_CapReqTBEX: Int = 581

val SN_setct_CapResTBE: String get() = "setct\u002DCapResTBE"

const val NID_setct_CapResTBE: Int = 582

val SN_setct_CapRevReqTBE: String get() = "setct\u002DCapRevReqTBE"

const val NID_setct_CapRevReqTBE: Int = 583

val SN_setct_CapRevReqTBEX: String get() = "setct\u002DCapRevReqTBEX"

const val NID_setct_CapRevReqTBEX: Int = 584

val SN_setct_CapRevResTBE: String get() = "setct\u002DCapRevResTBE"

const val NID_setct_CapRevResTBE: Int = 585

val SN_setct_CredReqTBE: String get() = "setct\u002DCredReqTBE"

const val NID_setct_CredReqTBE: Int = 586

val SN_setct_CredReqTBEX: String get() = "setct\u002DCredReqTBEX"

const val NID_setct_CredReqTBEX: Int = 587

val SN_setct_CredResTBE: String get() = "setct\u002DCredResTBE"

const val NID_setct_CredResTBE: Int = 588

val SN_setct_CredRevReqTBE: String get() = "setct\u002DCredRevReqTBE"

const val NID_setct_CredRevReqTBE: Int = 589

val SN_setct_CredRevReqTBEX: String get() = "setct\u002DCredRevReqTBEX"

const val NID_setct_CredRevReqTBEX: Int = 590

val SN_setct_CredRevResTBE: String get() = "setct\u002DCredRevResTBE"

const val NID_setct_CredRevResTBE: Int = 591

val SN_setct_BatchAdminReqTBE: String get() = "setct\u002DBatchAdminReqTBE"

const val NID_setct_BatchAdminReqTBE: Int = 592

val SN_setct_BatchAdminResTBE: String get() = "setct\u002DBatchAdminResTBE"

const val NID_setct_BatchAdminResTBE: Int = 593

val SN_setct_RegFormReqTBE: String get() = "setct\u002DRegFormReqTBE"

const val NID_setct_RegFormReqTBE: Int = 594

val SN_setct_CertReqTBE: String get() = "setct\u002DCertReqTBE"

const val NID_setct_CertReqTBE: Int = 595

val SN_setct_CertReqTBEX: String get() = "setct\u002DCertReqTBEX"

const val NID_setct_CertReqTBEX: Int = 596

val SN_setct_CertResTBE: String get() = "setct\u002DCertResTBE"

const val NID_setct_CertResTBE: Int = 597

val SN_setct_CRLNotificationTBS: String get() = "setct\u002DCRLNotificationTBS"

const val NID_setct_CRLNotificationTBS: Int = 598

val SN_setct_CRLNotificationResTBS: String get() = "setct\u002DCRLNotificationResTBS"

const val NID_setct_CRLNotificationResTBS: Int = 599

val SN_setct_BCIDistributionTBS: String get() = "setct\u002DBCIDistributionTBS"

const val NID_setct_BCIDistributionTBS: Int = 600

val SN_setext_genCrypt: String get() = "setext\u002DgenCrypt"

val LN_setext_genCrypt: String get() = "generic cryptogram"

const val NID_setext_genCrypt: Int = 601

val SN_setext_miAuth: String get() = "setext\u002DmiAuth"

val LN_setext_miAuth: String get() = "merchant initiated auth"

const val NID_setext_miAuth: Int = 602

val SN_setext_pinSecure: String get() = "setext\u002DpinSecure"

const val NID_setext_pinSecure: Int = 603

val SN_setext_pinAny: String get() = "setext\u002DpinAny"

const val NID_setext_pinAny: Int = 604

val SN_setext_track2: String get() = "setext\u002Dtrack2"

const val NID_setext_track2: Int = 605

val SN_setext_cv: String get() = "setext\u002Dcv"

val LN_setext_cv: String get() = "additional verification"

const val NID_setext_cv: Int = 606

val SN_set_policy_root: String get() = "set\u002Dpolicy\u002Droot"

const val NID_set_policy_root: Int = 607

val SN_setCext_hashedRoot: String get() = "setCext\u002DhashedRoot"

const val NID_setCext_hashedRoot: Int = 608

val SN_setCext_certType: String get() = "setCext\u002DcertType"

const val NID_setCext_certType: Int = 609

val SN_setCext_merchData: String get() = "setCext\u002DmerchData"

const val NID_setCext_merchData: Int = 610

val SN_setCext_cCertRequired: String get() = "setCext\u002DcCertRequired"

const val NID_setCext_cCertRequired: Int = 611

val SN_setCext_tunneling: String get() = "setCext\u002Dtunneling"

const val NID_setCext_tunneling: Int = 612

val SN_setCext_setExt: String get() = "setCext\u002DsetExt"

const val NID_setCext_setExt: Int = 613

val SN_setCext_setQualf: String get() = "setCext\u002DsetQualf"

const val NID_setCext_setQualf: Int = 614

val SN_setCext_PGWYcapabilities: String get() = "setCext\u002DPGWYcapabilities"

const val NID_setCext_PGWYcapabilities: Int = 615

val SN_setCext_TokenIdentifier: String get() = "setCext\u002DTokenIdentifier"

const val NID_setCext_TokenIdentifier: Int = 616

val SN_setCext_Track2Data: String get() = "setCext\u002DTrack2Data"

const val NID_setCext_Track2Data: Int = 617

val SN_setCext_TokenType: String get() = "setCext\u002DTokenType"

const val NID_setCext_TokenType: Int = 618

val SN_setCext_IssuerCapabilities: String get() = "setCext\u002DIssuerCapabilities"

const val NID_setCext_IssuerCapabilities: Int = 619

val SN_setAttr_Cert: String get() = "setAttr\u002DCert"

const val NID_setAttr_Cert: Int = 620

val SN_setAttr_PGWYcap: String get() = "setAttr\u002DPGWYcap"

val LN_setAttr_PGWYcap: String get() = "payment gateway capabilities"

const val NID_setAttr_PGWYcap: Int = 621

val SN_setAttr_TokenType: String get() = "setAttr\u002DTokenType"

const val NID_setAttr_TokenType: Int = 622

val SN_setAttr_IssCap: String get() = "setAttr\u002DIssCap"

val LN_setAttr_IssCap: String get() = "issuer capabilities"

const val NID_setAttr_IssCap: Int = 623

val SN_set_rootKeyThumb: String get() = "set\u002DrootKeyThumb"

const val NID_set_rootKeyThumb: Int = 624

val SN_set_addPolicy: String get() = "set\u002DaddPolicy"

const val NID_set_addPolicy: Int = 625

val SN_setAttr_Token_EMV: String get() = "setAttr\u002DToken\u002DEMV"

const val NID_setAttr_Token_EMV: Int = 626

val SN_setAttr_Token_B0Prime: String get() = "setAttr\u002DToken\u002DB0Prime"

const val NID_setAttr_Token_B0Prime: Int = 627

val SN_setAttr_IssCap_CVM: String get() = "setAttr\u002DIssCap\u002DCVM"

const val NID_setAttr_IssCap_CVM: Int = 628

val SN_setAttr_IssCap_T2: String get() = "setAttr\u002DIssCap\u002DT2"

const val NID_setAttr_IssCap_T2: Int = 629

val SN_setAttr_IssCap_Sig: String get() = "setAttr\u002DIssCap\u002DSig"

const val NID_setAttr_IssCap_Sig: Int = 630

val SN_setAttr_GenCryptgrm: String get() = "setAttr\u002DGenCryptgrm"

val LN_setAttr_GenCryptgrm: String get() = "generate cryptogram"

const val NID_setAttr_GenCryptgrm: Int = 631

val SN_setAttr_T2Enc: String get() = "setAttr\u002DT2Enc"

val LN_setAttr_T2Enc: String get() = "encrypted track 2"

const val NID_setAttr_T2Enc: Int = 632

val SN_setAttr_T2cleartxt: String get() = "setAttr\u002DT2cleartxt"

val LN_setAttr_T2cleartxt: String get() = "cleartext track 2"

const val NID_setAttr_T2cleartxt: Int = 633

val SN_setAttr_TokICCsig: String get() = "setAttr\u002DTokICCsig"

val LN_setAttr_TokICCsig: String get() = "ICC or token signature"

const val NID_setAttr_TokICCsig: Int = 634

val SN_setAttr_SecDevSig: String get() = "setAttr\u002DSecDevSig"

val LN_setAttr_SecDevSig: String get() = "secure device signature"

const val NID_setAttr_SecDevSig: Int = 635

val SN_set_brand_IATA_ATA: String get() = "set\u002Dbrand\u002DIATA\u002DATA"

const val NID_set_brand_IATA_ATA: Int = 636

val SN_set_brand_Diners: String get() = "set\u002Dbrand\u002DDiners"

const val NID_set_brand_Diners: Int = 637

val SN_set_brand_AmericanExpress: String get() = "set\u002Dbrand\u002DAmericanExpress"

const val NID_set_brand_AmericanExpress: Int = 638

val SN_set_brand_JCB: String get() = "set\u002Dbrand\u002DJCB"

const val NID_set_brand_JCB: Int = 639

val SN_set_brand_Visa: String get() = "set\u002Dbrand\u002DVisa"

const val NID_set_brand_Visa: Int = 640

val SN_set_brand_MasterCard: String get() = "set\u002Dbrand\u002DMasterCard"

const val NID_set_brand_MasterCard: Int = 641

val SN_set_brand_Novus: String get() = "set\u002Dbrand\u002DNovus"

const val NID_set_brand_Novus: Int = 642

val SN_des_cdmf: String get() = "DES\u002DCDMF"

val LN_des_cdmf: String get() = "des\u002Dcdmf"

const val NID_des_cdmf: Int = 643

val SN_rsaOAEPEncryptionSET: String get() = "rsaOAEPEncryptionSET"

const val NID_rsaOAEPEncryptionSET: Int = 644

val SN_ipsec3: String get() = "Oakley\u002DEC2N\u002D3"

val LN_ipsec3: String get() = "ipsec3"

const val NID_ipsec3: Int = 749

val SN_ipsec4: String get() = "Oakley\u002DEC2N\u002D4"

val LN_ipsec4: String get() = "ipsec4"

const val NID_ipsec4: Int = 750

val SN_whirlpool: String get() = "whirlpool"

const val NID_whirlpool: Int = 804

val SN_cryptopro: String get() = "cryptopro"

const val NID_cryptopro: Int = 805

val SN_cryptocom: String get() = "cryptocom"

const val NID_cryptocom: Int = 806

val SN_id_tc26: String get() = "id\u002Dtc26"

const val NID_id_tc26: Int = 974

val SN_id_GostR3411_94_with_GostR3410_2001: String get() = "id\u002DGostR3411\u002D94\u002Dwith\u002DGostR3410\u002D2001"

val LN_id_GostR3411_94_with_GostR3410_2001: String get() = "GOST R 34.11\u002D94 with GOST R 34.10\u002D2001"

const val NID_id_GostR3411_94_with_GostR3410_2001: Int = 807

val SN_id_GostR3411_94_with_GostR3410_94: String get() = "id\u002DGostR3411\u002D94\u002Dwith\u002DGostR3410\u002D94"

val LN_id_GostR3411_94_with_GostR3410_94: String get() = "GOST R 34.11\u002D94 with GOST R 34.10\u002D94"

const val NID_id_GostR3411_94_with_GostR3410_94: Int = 808

val SN_id_GostR3411_94: String get() = "md_gost94"

val LN_id_GostR3411_94: String get() = "GOST R 34.11\u002D94"

const val NID_id_GostR3411_94: Int = 809

val SN_id_HMACGostR3411_94: String get() = "id\u002DHMACGostR3411\u002D94"

val LN_id_HMACGostR3411_94: String get() = "HMAC GOST 34.11\u002D94"

const val NID_id_HMACGostR3411_94: Int = 810

val SN_id_GostR3410_2001: String get() = "gost2001"

val LN_id_GostR3410_2001: String get() = "GOST R 34.10\u002D2001"

const val NID_id_GostR3410_2001: Int = 811

val SN_id_GostR3410_94: String get() = "gost94"

val LN_id_GostR3410_94: String get() = "GOST R 34.10\u002D94"

const val NID_id_GostR3410_94: Int = 812

val SN_id_Gost28147_89: String get() = "gost89"

val LN_id_Gost28147_89: String get() = "GOST 28147\u002D89"

const val NID_id_Gost28147_89: Int = 813

val SN_gost89_cnt: String get() = "gost89\u002Dcnt"

const val NID_gost89_cnt: Int = 814

val SN_gost89_cnt_12: String get() = "gost89\u002Dcnt\u002D12"

const val NID_gost89_cnt_12: Int = 975

val SN_gost89_cbc: String get() = "gost89\u002Dcbc"

const val NID_gost89_cbc: Int = 1009

val SN_gost89_ecb: String get() = "gost89\u002Decb"

const val NID_gost89_ecb: Int = 1010

val SN_gost89_ctr: String get() = "gost89\u002Dctr"

const val NID_gost89_ctr: Int = 1011

val SN_id_Gost28147_89_MAC: String get() = "gost\u002Dmac"

val LN_id_Gost28147_89_MAC: String get() = "GOST 28147\u002D89 MAC"

const val NID_id_Gost28147_89_MAC: Int = 815

val SN_gost_mac_12: String get() = "gost\u002Dmac\u002D12"

const val NID_gost_mac_12: Int = 976

val SN_id_GostR3411_94_prf: String get() = "prf\u002Dgostr3411\u002D94"

val LN_id_GostR3411_94_prf: String get() = "GOST R 34.11\u002D94 PRF"

const val NID_id_GostR3411_94_prf: Int = 816

val SN_id_GostR3410_2001DH: String get() = "id\u002DGostR3410\u002D2001DH"

val LN_id_GostR3410_2001DH: String get() = "GOST R 34.10\u002D2001 DH"

const val NID_id_GostR3410_2001DH: Int = 817

val SN_id_GostR3410_94DH: String get() = "id\u002DGostR3410\u002D94DH"

val LN_id_GostR3410_94DH: String get() = "GOST R 34.10\u002D94 DH"

const val NID_id_GostR3410_94DH: Int = 818

val SN_id_Gost28147_89_CryptoPro_KeyMeshing: String get() = "id\u002DGost28147\u002D89\u002DCryptoPro\u002DKeyMeshing"

const val NID_id_Gost28147_89_CryptoPro_KeyMeshing: Int = 819

val SN_id_Gost28147_89_None_KeyMeshing: String get() = "id\u002DGost28147\u002D89\u002DNone\u002DKeyMeshing"

const val NID_id_Gost28147_89_None_KeyMeshing: Int = 820

val SN_id_GostR3411_94_TestParamSet: String get() = "id\u002DGostR3411\u002D94\u002DTestParamSet"

const val NID_id_GostR3411_94_TestParamSet: Int = 821

val SN_id_GostR3411_94_CryptoProParamSet: String get() = "id\u002DGostR3411\u002D94\u002DCryptoProParamSet"

const val NID_id_GostR3411_94_CryptoProParamSet: Int = 822

val SN_id_Gost28147_89_TestParamSet: String get() = "id\u002DGost28147\u002D89\u002DTestParamSet"

const val NID_id_Gost28147_89_TestParamSet: Int = 823

val SN_id_Gost28147_89_CryptoPro_A_ParamSet: String get() = "id\u002DGost28147\u002D89\u002DCryptoPro\u002DA\u002DParamSet"

const val NID_id_Gost28147_89_CryptoPro_A_ParamSet: Int = 824

val SN_id_Gost28147_89_CryptoPro_B_ParamSet: String get() = "id\u002DGost28147\u002D89\u002DCryptoPro\u002DB\u002DParamSet"

const val NID_id_Gost28147_89_CryptoPro_B_ParamSet: Int = 825

val SN_id_Gost28147_89_CryptoPro_C_ParamSet: String get() = "id\u002DGost28147\u002D89\u002DCryptoPro\u002DC\u002DParamSet"

const val NID_id_Gost28147_89_CryptoPro_C_ParamSet: Int = 826

val SN_id_Gost28147_89_CryptoPro_D_ParamSet: String get() = "id\u002DGost28147\u002D89\u002DCryptoPro\u002DD\u002DParamSet"

const val NID_id_Gost28147_89_CryptoPro_D_ParamSet: Int = 827

val SN_id_Gost28147_89_CryptoPro_Oscar_1_1_ParamSet: String get() = "id\u002DGost28147\u002D89\u002DCryptoPro\u002DOscar\u002D1\u002D1\u002DParamSet"

const val NID_id_Gost28147_89_CryptoPro_Oscar_1_1_ParamSet: Int = 828

val SN_id_Gost28147_89_CryptoPro_Oscar_1_0_ParamSet: String get() = "id\u002DGost28147\u002D89\u002DCryptoPro\u002DOscar\u002D1\u002D0\u002DParamSet"

const val NID_id_Gost28147_89_CryptoPro_Oscar_1_0_ParamSet: Int = 829

val SN_id_Gost28147_89_CryptoPro_RIC_1_ParamSet: String get() = "id\u002DGost28147\u002D89\u002DCryptoPro\u002DRIC\u002D1\u002DParamSet"

const val NID_id_Gost28147_89_CryptoPro_RIC_1_ParamSet: Int = 830

val SN_id_GostR3410_94_TestParamSet: String get() = "id\u002DGostR3410\u002D94\u002DTestParamSet"

const val NID_id_GostR3410_94_TestParamSet: Int = 831

val SN_id_GostR3410_94_CryptoPro_A_ParamSet: String get() = "id\u002DGostR3410\u002D94\u002DCryptoPro\u002DA\u002DParamSet"

const val NID_id_GostR3410_94_CryptoPro_A_ParamSet: Int = 832

val SN_id_GostR3410_94_CryptoPro_B_ParamSet: String get() = "id\u002DGostR3410\u002D94\u002DCryptoPro\u002DB\u002DParamSet"

const val NID_id_GostR3410_94_CryptoPro_B_ParamSet: Int = 833

val SN_id_GostR3410_94_CryptoPro_C_ParamSet: String get() = "id\u002DGostR3410\u002D94\u002DCryptoPro\u002DC\u002DParamSet"

const val NID_id_GostR3410_94_CryptoPro_C_ParamSet: Int = 834

val SN_id_GostR3410_94_CryptoPro_D_ParamSet: String get() = "id\u002DGostR3410\u002D94\u002DCryptoPro\u002DD\u002DParamSet"

const val NID_id_GostR3410_94_CryptoPro_D_ParamSet: Int = 835

val SN_id_GostR3410_94_CryptoPro_XchA_ParamSet: String get() = "id\u002DGostR3410\u002D94\u002DCryptoPro\u002DXchA\u002DParamSet"

const val NID_id_GostR3410_94_CryptoPro_XchA_ParamSet: Int = 836

val SN_id_GostR3410_94_CryptoPro_XchB_ParamSet: String get() = "id\u002DGostR3410\u002D94\u002DCryptoPro\u002DXchB\u002DParamSet"

const val NID_id_GostR3410_94_CryptoPro_XchB_ParamSet: Int = 837

val SN_id_GostR3410_94_CryptoPro_XchC_ParamSet: String get() = "id\u002DGostR3410\u002D94\u002DCryptoPro\u002DXchC\u002DParamSet"

const val NID_id_GostR3410_94_CryptoPro_XchC_ParamSet: Int = 838

val SN_id_GostR3410_2001_TestParamSet: String get() = "id\u002DGostR3410\u002D2001\u002DTestParamSet"

const val NID_id_GostR3410_2001_TestParamSet: Int = 839

val SN_id_GostR3410_2001_CryptoPro_A_ParamSet: String get() = "id\u002DGostR3410\u002D2001\u002DCryptoPro\u002DA\u002DParamSet"

const val NID_id_GostR3410_2001_CryptoPro_A_ParamSet: Int = 840

val SN_id_GostR3410_2001_CryptoPro_B_ParamSet: String get() = "id\u002DGostR3410\u002D2001\u002DCryptoPro\u002DB\u002DParamSet"

const val NID_id_GostR3410_2001_CryptoPro_B_ParamSet: Int = 841

val SN_id_GostR3410_2001_CryptoPro_C_ParamSet: String get() = "id\u002DGostR3410\u002D2001\u002DCryptoPro\u002DC\u002DParamSet"

const val NID_id_GostR3410_2001_CryptoPro_C_ParamSet: Int = 842

val SN_id_GostR3410_2001_CryptoPro_XchA_ParamSet: String get() = "id\u002DGostR3410\u002D2001\u002DCryptoPro\u002DXchA\u002DParamSet"

const val NID_id_GostR3410_2001_CryptoPro_XchA_ParamSet: Int = 843

val SN_id_GostR3410_2001_CryptoPro_XchB_ParamSet: String get() = "id\u002DGostR3410\u002D2001\u002DCryptoPro\u002DXchB\u002DParamSet"

const val NID_id_GostR3410_2001_CryptoPro_XchB_ParamSet: Int = 844

val SN_id_GostR3410_94_a: String get() = "id\u002DGostR3410\u002D94\u002Da"

const val NID_id_GostR3410_94_a: Int = 845

val SN_id_GostR3410_94_aBis: String get() = "id\u002DGostR3410\u002D94\u002DaBis"

const val NID_id_GostR3410_94_aBis: Int = 846

val SN_id_GostR3410_94_b: String get() = "id\u002DGostR3410\u002D94\u002Db"

const val NID_id_GostR3410_94_b: Int = 847

val SN_id_GostR3410_94_bBis: String get() = "id\u002DGostR3410\u002D94\u002DbBis"

const val NID_id_GostR3410_94_bBis: Int = 848

val SN_id_Gost28147_89_cc: String get() = "id\u002DGost28147\u002D89\u002Dcc"

val LN_id_Gost28147_89_cc: String get() = "GOST 28147\u002D89 Cryptocom ParamSet"

const val NID_id_Gost28147_89_cc: Int = 849

val SN_id_GostR3410_94_cc: String get() = "gost94cc"

val LN_id_GostR3410_94_cc: String get() = "GOST 34.10\u002D94 Cryptocom"

const val NID_id_GostR3410_94_cc: Int = 850

val SN_id_GostR3410_2001_cc: String get() = "gost2001cc"

val LN_id_GostR3410_2001_cc: String get() = "GOST 34.10\u002D2001 Cryptocom"

const val NID_id_GostR3410_2001_cc: Int = 851

val SN_id_GostR3411_94_with_GostR3410_94_cc: String get() = "id\u002DGostR3411\u002D94\u002Dwith\u002DGostR3410\u002D94\u002Dcc"

val LN_id_GostR3411_94_with_GostR3410_94_cc: String get() = "GOST R 34.11\u002D94 with GOST R 34.10\u002D94 Cryptocom"

const val NID_id_GostR3411_94_with_GostR3410_94_cc: Int = 852

val SN_id_GostR3411_94_with_GostR3410_2001_cc: String get() = "id\u002DGostR3411\u002D94\u002Dwith\u002DGostR3410\u002D2001\u002Dcc"

val LN_id_GostR3411_94_with_GostR3410_2001_cc: String get() = "GOST R 34.11\u002D94 with GOST R 34.10\u002D2001 Cryptocom"

const val NID_id_GostR3411_94_with_GostR3410_2001_cc: Int = 853

val SN_id_GostR3410_2001_ParamSet_cc: String get() = "id\u002DGostR3410\u002D2001\u002DParamSet\u002Dcc"

val LN_id_GostR3410_2001_ParamSet_cc: String get() = "GOST R 3410\u002D2001 Parameter Set Cryptocom"

const val NID_id_GostR3410_2001_ParamSet_cc: Int = 854

val SN_id_tc26_algorithms: String get() = "id\u002Dtc26\u002Dalgorithms"

const val NID_id_tc26_algorithms: Int = 977

val SN_id_tc26_sign: String get() = "id\u002Dtc26\u002Dsign"

const val NID_id_tc26_sign: Int = 978

val SN_id_GostR3410_2012_256: String get() = "gost2012_256"

val LN_id_GostR3410_2012_256: String get() = "GOST R 34.10\u002D2012 with 256 bit modulus"

const val NID_id_GostR3410_2012_256: Int = 979

val SN_id_GostR3410_2012_512: String get() = "gost2012_512"

val LN_id_GostR3410_2012_512: String get() = "GOST R 34.10\u002D2012 with 512 bit modulus"

const val NID_id_GostR3410_2012_512: Int = 980

val SN_id_tc26_digest: String get() = "id\u002Dtc26\u002Ddigest"

const val NID_id_tc26_digest: Int = 981

val SN_id_GostR3411_2012_256: String get() = "md_gost12_256"

val LN_id_GostR3411_2012_256: String get() = "GOST R 34.11\u002D2012 with 256 bit hash"

const val NID_id_GostR3411_2012_256: Int = 982

val SN_id_GostR3411_2012_512: String get() = "md_gost12_512"

val LN_id_GostR3411_2012_512: String get() = "GOST R 34.11\u002D2012 with 512 bit hash"

const val NID_id_GostR3411_2012_512: Int = 983

val SN_id_tc26_signwithdigest: String get() = "id\u002Dtc26\u002Dsignwithdigest"

const val NID_id_tc26_signwithdigest: Int = 984

val SN_id_tc26_signwithdigest_gost3410_2012_256: String get() = "id\u002Dtc26\u002Dsignwithdigest\u002Dgost3410\u002D2012\u002D256"

val LN_id_tc26_signwithdigest_gost3410_2012_256: String get() = "GOST R 34.10\u002D2012 with GOST R 34.11\u002D2012 \u0028256 bit\u0029"

const val NID_id_tc26_signwithdigest_gost3410_2012_256: Int = 985

val SN_id_tc26_signwithdigest_gost3410_2012_512: String get() = "id\u002Dtc26\u002Dsignwithdigest\u002Dgost3410\u002D2012\u002D512"

val LN_id_tc26_signwithdigest_gost3410_2012_512: String get() = "GOST R 34.10\u002D2012 with GOST R 34.11\u002D2012 \u0028512 bit\u0029"

const val NID_id_tc26_signwithdigest_gost3410_2012_512: Int = 986

val SN_id_tc26_mac: String get() = "id\u002Dtc26\u002Dmac"

const val NID_id_tc26_mac: Int = 987

val SN_id_tc26_hmac_gost_3411_2012_256: String get() = "id\u002Dtc26\u002Dhmac\u002Dgost\u002D3411\u002D2012\u002D256"

val LN_id_tc26_hmac_gost_3411_2012_256: String get() = "HMAC GOST 34.11\u002D2012 256 bit"

const val NID_id_tc26_hmac_gost_3411_2012_256: Int = 988

val SN_id_tc26_hmac_gost_3411_2012_512: String get() = "id\u002Dtc26\u002Dhmac\u002Dgost\u002D3411\u002D2012\u002D512"

val LN_id_tc26_hmac_gost_3411_2012_512: String get() = "HMAC GOST 34.11\u002D2012 512 bit"

const val NID_id_tc26_hmac_gost_3411_2012_512: Int = 989

val SN_id_tc26_cipher: String get() = "id\u002Dtc26\u002Dcipher"

const val NID_id_tc26_cipher: Int = 990

val SN_id_tc26_agreement: String get() = "id\u002Dtc26\u002Dagreement"

const val NID_id_tc26_agreement: Int = 991

val SN_id_tc26_agreement_gost_3410_2012_256: String get() = "id\u002Dtc26\u002Dagreement\u002Dgost\u002D3410\u002D2012\u002D256"

const val NID_id_tc26_agreement_gost_3410_2012_256: Int = 992

val SN_id_tc26_agreement_gost_3410_2012_512: String get() = "id\u002Dtc26\u002Dagreement\u002Dgost\u002D3410\u002D2012\u002D512"

const val NID_id_tc26_agreement_gost_3410_2012_512: Int = 993

val SN_id_tc26_constants: String get() = "id\u002Dtc26\u002Dconstants"

const val NID_id_tc26_constants: Int = 994

val SN_id_tc26_sign_constants: String get() = "id\u002Dtc26\u002Dsign\u002Dconstants"

const val NID_id_tc26_sign_constants: Int = 995

val SN_id_tc26_gost_3410_2012_512_constants: String get() = "id\u002Dtc26\u002Dgost\u002D3410\u002D2012\u002D512\u002Dconstants"

const val NID_id_tc26_gost_3410_2012_512_constants: Int = 996

val SN_id_tc26_gost_3410_2012_512_paramSetTest: String get() = "id\u002Dtc26\u002Dgost\u002D3410\u002D2012\u002D512\u002DparamSetTest"

val LN_id_tc26_gost_3410_2012_512_paramSetTest: String get() = "GOST R 34.10\u002D2012 \u0028512 bit\u0029 testing parameter set"

const val NID_id_tc26_gost_3410_2012_512_paramSetTest: Int = 997

val SN_id_tc26_gost_3410_2012_512_paramSetA: String get() = "id\u002Dtc26\u002Dgost\u002D3410\u002D2012\u002D512\u002DparamSetA"

val LN_id_tc26_gost_3410_2012_512_paramSetA: String get() = "GOST R 34.10\u002D2012 \u0028512 bit\u0029 ParamSet A"

const val NID_id_tc26_gost_3410_2012_512_paramSetA: Int = 998

val SN_id_tc26_gost_3410_2012_512_paramSetB: String get() = "id\u002Dtc26\u002Dgost\u002D3410\u002D2012\u002D512\u002DparamSetB"

val LN_id_tc26_gost_3410_2012_512_paramSetB: String get() = "GOST R 34.10\u002D2012 \u0028512 bit\u0029 ParamSet B"

const val NID_id_tc26_gost_3410_2012_512_paramSetB: Int = 999

val SN_id_tc26_digest_constants: String get() = "id\u002Dtc26\u002Ddigest\u002Dconstants"

const val NID_id_tc26_digest_constants: Int = 1000

val SN_id_tc26_cipher_constants: String get() = "id\u002Dtc26\u002Dcipher\u002Dconstants"

const val NID_id_tc26_cipher_constants: Int = 1001

val SN_id_tc26_gost_28147_constants: String get() = "id\u002Dtc26\u002Dgost\u002D28147\u002Dconstants"

const val NID_id_tc26_gost_28147_constants: Int = 1002

val SN_id_tc26_gost_28147_param_Z: String get() = "id\u002Dtc26\u002Dgost\u002D28147\u002Dparam\u002DZ"

val LN_id_tc26_gost_28147_param_Z: String get() = "GOST 28147\u002D89 TC26 parameter set"

const val NID_id_tc26_gost_28147_param_Z: Int = 1003

val SN_INN: String get() = "INN"

val LN_INN: String get() = "INN"

const val NID_INN: Int = 1004

val SN_OGRN: String get() = "OGRN"

val LN_OGRN: String get() = "OGRN"

const val NID_OGRN: Int = 1005

val SN_SNILS: String get() = "SNILS"

val LN_SNILS: String get() = "SNILS"

const val NID_SNILS: Int = 1006

val SN_subjectSignTool: String get() = "subjectSignTool"

val LN_subjectSignTool: String get() = "Signing Tool of Subject"

const val NID_subjectSignTool: Int = 1007

val SN_issuerSignTool: String get() = "issuerSignTool"

val LN_issuerSignTool: String get() = "Signing Tool of Issuer"

const val NID_issuerSignTool: Int = 1008

val SN_grasshopper_ecb: String get() = "grasshopper\u002Decb"

const val NID_grasshopper_ecb: Int = 1012

val SN_grasshopper_ctr: String get() = "grasshopper\u002Dctr"

const val NID_grasshopper_ctr: Int = 1013

val SN_grasshopper_ofb: String get() = "grasshopper\u002Dofb"

const val NID_grasshopper_ofb: Int = 1014

val SN_grasshopper_cbc: String get() = "grasshopper\u002Dcbc"

const val NID_grasshopper_cbc: Int = 1015

val SN_grasshopper_cfb: String get() = "grasshopper\u002Dcfb"

const val NID_grasshopper_cfb: Int = 1016

val SN_grasshopper_mac: String get() = "grasshopper\u002Dmac"

const val NID_grasshopper_mac: Int = 1017

val SN_camellia_128_cbc: String get() = "CAMELLIA\u002D128\u002DCBC"

val LN_camellia_128_cbc: String get() = "camellia\u002D128\u002Dcbc"

const val NID_camellia_128_cbc: Int = 751

val SN_camellia_192_cbc: String get() = "CAMELLIA\u002D192\u002DCBC"

val LN_camellia_192_cbc: String get() = "camellia\u002D192\u002Dcbc"

const val NID_camellia_192_cbc: Int = 752

val SN_camellia_256_cbc: String get() = "CAMELLIA\u002D256\u002DCBC"

val LN_camellia_256_cbc: String get() = "camellia\u002D256\u002Dcbc"

const val NID_camellia_256_cbc: Int = 753

val SN_id_camellia128_wrap: String get() = "id\u002Dcamellia128\u002Dwrap"

const val NID_id_camellia128_wrap: Int = 907

val SN_id_camellia192_wrap: String get() = "id\u002Dcamellia192\u002Dwrap"

const val NID_id_camellia192_wrap: Int = 908

val SN_id_camellia256_wrap: String get() = "id\u002Dcamellia256\u002Dwrap"

const val NID_id_camellia256_wrap: Int = 909

val SN_camellia_128_ecb: String get() = "CAMELLIA\u002D128\u002DECB"

val LN_camellia_128_ecb: String get() = "camellia\u002D128\u002Decb"

const val NID_camellia_128_ecb: Int = 754

val SN_camellia_128_ofb128: String get() = "CAMELLIA\u002D128\u002DOFB"

val LN_camellia_128_ofb128: String get() = "camellia\u002D128\u002Dofb"

const val NID_camellia_128_ofb128: Int = 766

val SN_camellia_128_cfb128: String get() = "CAMELLIA\u002D128\u002DCFB"

val LN_camellia_128_cfb128: String get() = "camellia\u002D128\u002Dcfb"

const val NID_camellia_128_cfb128: Int = 757

val SN_camellia_128_gcm: String get() = "CAMELLIA\u002D128\u002DGCM"

val LN_camellia_128_gcm: String get() = "camellia\u002D128\u002Dgcm"

const val NID_camellia_128_gcm: Int = 961

val SN_camellia_128_ccm: String get() = "CAMELLIA\u002D128\u002DCCM"

val LN_camellia_128_ccm: String get() = "camellia\u002D128\u002Dccm"

const val NID_camellia_128_ccm: Int = 962

val SN_camellia_128_ctr: String get() = "CAMELLIA\u002D128\u002DCTR"

val LN_camellia_128_ctr: String get() = "camellia\u002D128\u002Dctr"

const val NID_camellia_128_ctr: Int = 963

val SN_camellia_128_cmac: String get() = "CAMELLIA\u002D128\u002DCMAC"

val LN_camellia_128_cmac: String get() = "camellia\u002D128\u002Dcmac"

const val NID_camellia_128_cmac: Int = 964

val SN_camellia_192_ecb: String get() = "CAMELLIA\u002D192\u002DECB"

val LN_camellia_192_ecb: String get() = "camellia\u002D192\u002Decb"

const val NID_camellia_192_ecb: Int = 755

val SN_camellia_192_ofb128: String get() = "CAMELLIA\u002D192\u002DOFB"

val LN_camellia_192_ofb128: String get() = "camellia\u002D192\u002Dofb"

const val NID_camellia_192_ofb128: Int = 767

val SN_camellia_192_cfb128: String get() = "CAMELLIA\u002D192\u002DCFB"

val LN_camellia_192_cfb128: String get() = "camellia\u002D192\u002Dcfb"

const val NID_camellia_192_cfb128: Int = 758

val SN_camellia_192_gcm: String get() = "CAMELLIA\u002D192\u002DGCM"

val LN_camellia_192_gcm: String get() = "camellia\u002D192\u002Dgcm"

const val NID_camellia_192_gcm: Int = 965

val SN_camellia_192_ccm: String get() = "CAMELLIA\u002D192\u002DCCM"

val LN_camellia_192_ccm: String get() = "camellia\u002D192\u002Dccm"

const val NID_camellia_192_ccm: Int = 966

val SN_camellia_192_ctr: String get() = "CAMELLIA\u002D192\u002DCTR"

val LN_camellia_192_ctr: String get() = "camellia\u002D192\u002Dctr"

const val NID_camellia_192_ctr: Int = 967

val SN_camellia_192_cmac: String get() = "CAMELLIA\u002D192\u002DCMAC"

val LN_camellia_192_cmac: String get() = "camellia\u002D192\u002Dcmac"

const val NID_camellia_192_cmac: Int = 968

val SN_camellia_256_ecb: String get() = "CAMELLIA\u002D256\u002DECB"

val LN_camellia_256_ecb: String get() = "camellia\u002D256\u002Decb"

const val NID_camellia_256_ecb: Int = 756

val SN_camellia_256_ofb128: String get() = "CAMELLIA\u002D256\u002DOFB"

val LN_camellia_256_ofb128: String get() = "camellia\u002D256\u002Dofb"

const val NID_camellia_256_ofb128: Int = 768

val SN_camellia_256_cfb128: String get() = "CAMELLIA\u002D256\u002DCFB"

val LN_camellia_256_cfb128: String get() = "camellia\u002D256\u002Dcfb"

const val NID_camellia_256_cfb128: Int = 759

val SN_camellia_256_gcm: String get() = "CAMELLIA\u002D256\u002DGCM"

val LN_camellia_256_gcm: String get() = "camellia\u002D256\u002Dgcm"

const val NID_camellia_256_gcm: Int = 969

val SN_camellia_256_ccm: String get() = "CAMELLIA\u002D256\u002DCCM"

val LN_camellia_256_ccm: String get() = "camellia\u002D256\u002Dccm"

const val NID_camellia_256_ccm: Int = 970

val SN_camellia_256_ctr: String get() = "CAMELLIA\u002D256\u002DCTR"

val LN_camellia_256_ctr: String get() = "camellia\u002D256\u002Dctr"

const val NID_camellia_256_ctr: Int = 971

val SN_camellia_256_cmac: String get() = "CAMELLIA\u002D256\u002DCMAC"

val LN_camellia_256_cmac: String get() = "camellia\u002D256\u002Dcmac"

const val NID_camellia_256_cmac: Int = 972

val SN_camellia_128_cfb1: String get() = "CAMELLIA\u002D128\u002DCFB1"

val LN_camellia_128_cfb1: String get() = "camellia\u002D128\u002Dcfb1"

const val NID_camellia_128_cfb1: Int = 760

val SN_camellia_192_cfb1: String get() = "CAMELLIA\u002D192\u002DCFB1"

val LN_camellia_192_cfb1: String get() = "camellia\u002D192\u002Dcfb1"

const val NID_camellia_192_cfb1: Int = 761

val SN_camellia_256_cfb1: String get() = "CAMELLIA\u002D256\u002DCFB1"

val LN_camellia_256_cfb1: String get() = "camellia\u002D256\u002Dcfb1"

const val NID_camellia_256_cfb1: Int = 762

val SN_camellia_128_cfb8: String get() = "CAMELLIA\u002D128\u002DCFB8"

val LN_camellia_128_cfb8: String get() = "camellia\u002D128\u002Dcfb8"

const val NID_camellia_128_cfb8: Int = 763

val SN_camellia_192_cfb8: String get() = "CAMELLIA\u002D192\u002DCFB8"

val LN_camellia_192_cfb8: String get() = "camellia\u002D192\u002Dcfb8"

const val NID_camellia_192_cfb8: Int = 764

val SN_camellia_256_cfb8: String get() = "CAMELLIA\u002D256\u002DCFB8"

val LN_camellia_256_cfb8: String get() = "camellia\u002D256\u002Dcfb8"

const val NID_camellia_256_cfb8: Int = 765

val SN_kisa: String get() = "KISA"

val LN_kisa: String get() = "kisa"

const val NID_kisa: Int = 773

val SN_seed_ecb: String get() = "SEED\u002DECB"

val LN_seed_ecb: String get() = "seed\u002Decb"

const val NID_seed_ecb: Int = 776

val SN_seed_cbc: String get() = "SEED\u002DCBC"

val LN_seed_cbc: String get() = "seed\u002Dcbc"

const val NID_seed_cbc: Int = 777

val SN_seed_cfb128: String get() = "SEED\u002DCFB"

val LN_seed_cfb128: String get() = "seed\u002Dcfb"

const val NID_seed_cfb128: Int = 779

val SN_seed_ofb128: String get() = "SEED\u002DOFB"

val LN_seed_ofb128: String get() = "seed\u002Dofb"

const val NID_seed_ofb128: Int = 778

val SN_hmac: String get() = "HMAC"

val LN_hmac: String get() = "hmac"

const val NID_hmac: Int = 855

val SN_cmac: String get() = "CMAC"

val LN_cmac: String get() = "cmac"

const val NID_cmac: Int = 894

val SN_rc4_hmac_md5: String get() = "RC4\u002DHMAC\u002DMD5"

val LN_rc4_hmac_md5: String get() = "rc4\u002Dhmac\u002Dmd5"

const val NID_rc4_hmac_md5: Int = 915

val SN_aes_128_cbc_hmac_sha1: String get() = "AES\u002D128\u002DCBC\u002DHMAC\u002DSHA1"

val LN_aes_128_cbc_hmac_sha1: String get() = "aes\u002D128\u002Dcbc\u002Dhmac\u002Dsha1"

const val NID_aes_128_cbc_hmac_sha1: Int = 916

val SN_aes_192_cbc_hmac_sha1: String get() = "AES\u002D192\u002DCBC\u002DHMAC\u002DSHA1"

val LN_aes_192_cbc_hmac_sha1: String get() = "aes\u002D192\u002Dcbc\u002Dhmac\u002Dsha1"

const val NID_aes_192_cbc_hmac_sha1: Int = 917

val SN_aes_256_cbc_hmac_sha1: String get() = "AES\u002D256\u002DCBC\u002DHMAC\u002DSHA1"

val LN_aes_256_cbc_hmac_sha1: String get() = "aes\u002D256\u002Dcbc\u002Dhmac\u002Dsha1"

const val NID_aes_256_cbc_hmac_sha1: Int = 918

val SN_aes_128_cbc_hmac_sha256: String get() = "AES\u002D128\u002DCBC\u002DHMAC\u002DSHA256"

val LN_aes_128_cbc_hmac_sha256: String get() = "aes\u002D128\u002Dcbc\u002Dhmac\u002Dsha256"

const val NID_aes_128_cbc_hmac_sha256: Int = 948

val SN_aes_192_cbc_hmac_sha256: String get() = "AES\u002D192\u002DCBC\u002DHMAC\u002DSHA256"

val LN_aes_192_cbc_hmac_sha256: String get() = "aes\u002D192\u002Dcbc\u002Dhmac\u002Dsha256"

const val NID_aes_192_cbc_hmac_sha256: Int = 949

val SN_aes_256_cbc_hmac_sha256: String get() = "AES\u002D256\u002DCBC\u002DHMAC\u002DSHA256"

val LN_aes_256_cbc_hmac_sha256: String get() = "aes\u002D256\u002Dcbc\u002Dhmac\u002Dsha256"

const val NID_aes_256_cbc_hmac_sha256: Int = 950

val SN_chacha20_poly1305: String get() = "ChaCha20\u002DPoly1305"

val LN_chacha20_poly1305: String get() = "chacha20\u002Dpoly1305"

const val NID_chacha20_poly1305: Int = 1018

val SN_chacha20: String get() = "ChaCha20"

val LN_chacha20: String get() = "chacha20"

const val NID_chacha20: Int = 1019

val SN_dhpublicnumber: String get() = "dhpublicnumber"

val LN_dhpublicnumber: String get() = "X9.42 DH"

const val NID_dhpublicnumber: Int = 920

val SN_brainpoolP160r1: String get() = "brainpoolP160r1"

const val NID_brainpoolP160r1: Int = 921

val SN_brainpoolP160t1: String get() = "brainpoolP160t1"

const val NID_brainpoolP160t1: Int = 922

val SN_brainpoolP192r1: String get() = "brainpoolP192r1"

const val NID_brainpoolP192r1: Int = 923

val SN_brainpoolP192t1: String get() = "brainpoolP192t1"

const val NID_brainpoolP192t1: Int = 924

val SN_brainpoolP224r1: String get() = "brainpoolP224r1"

const val NID_brainpoolP224r1: Int = 925

val SN_brainpoolP224t1: String get() = "brainpoolP224t1"

const val NID_brainpoolP224t1: Int = 926

val SN_brainpoolP256r1: String get() = "brainpoolP256r1"

const val NID_brainpoolP256r1: Int = 927

val SN_brainpoolP256t1: String get() = "brainpoolP256t1"

const val NID_brainpoolP256t1: Int = 928

val SN_brainpoolP320r1: String get() = "brainpoolP320r1"

const val NID_brainpoolP320r1: Int = 929

val SN_brainpoolP320t1: String get() = "brainpoolP320t1"

const val NID_brainpoolP320t1: Int = 930

val SN_brainpoolP384r1: String get() = "brainpoolP384r1"

const val NID_brainpoolP384r1: Int = 931

val SN_brainpoolP384t1: String get() = "brainpoolP384t1"

const val NID_brainpoolP384t1: Int = 932

val SN_brainpoolP512r1: String get() = "brainpoolP512r1"

const val NID_brainpoolP512r1: Int = 933

val SN_brainpoolP512t1: String get() = "brainpoolP512t1"

const val NID_brainpoolP512t1: Int = 934

val SN_dhSinglePass_stdDH_sha1kdf_scheme: String get() = "dhSinglePass\u002DstdDH\u002Dsha1kdf\u002Dscheme"

const val NID_dhSinglePass_stdDH_sha1kdf_scheme: Int = 936

val SN_dhSinglePass_stdDH_sha224kdf_scheme: String get() = "dhSinglePass\u002DstdDH\u002Dsha224kdf\u002Dscheme"

const val NID_dhSinglePass_stdDH_sha224kdf_scheme: Int = 937

val SN_dhSinglePass_stdDH_sha256kdf_scheme: String get() = "dhSinglePass\u002DstdDH\u002Dsha256kdf\u002Dscheme"

const val NID_dhSinglePass_stdDH_sha256kdf_scheme: Int = 938

val SN_dhSinglePass_stdDH_sha384kdf_scheme: String get() = "dhSinglePass\u002DstdDH\u002Dsha384kdf\u002Dscheme"

const val NID_dhSinglePass_stdDH_sha384kdf_scheme: Int = 939

val SN_dhSinglePass_stdDH_sha512kdf_scheme: String get() = "dhSinglePass\u002DstdDH\u002Dsha512kdf\u002Dscheme"

const val NID_dhSinglePass_stdDH_sha512kdf_scheme: Int = 940

val SN_dhSinglePass_cofactorDH_sha1kdf_scheme: String get() = "dhSinglePass\u002DcofactorDH\u002Dsha1kdf\u002Dscheme"

const val NID_dhSinglePass_cofactorDH_sha1kdf_scheme: Int = 941

val SN_dhSinglePass_cofactorDH_sha224kdf_scheme: String get() = "dhSinglePass\u002DcofactorDH\u002Dsha224kdf\u002Dscheme"

const val NID_dhSinglePass_cofactorDH_sha224kdf_scheme: Int = 942

val SN_dhSinglePass_cofactorDH_sha256kdf_scheme: String get() = "dhSinglePass\u002DcofactorDH\u002Dsha256kdf\u002Dscheme"

const val NID_dhSinglePass_cofactorDH_sha256kdf_scheme: Int = 943

val SN_dhSinglePass_cofactorDH_sha384kdf_scheme: String get() = "dhSinglePass\u002DcofactorDH\u002Dsha384kdf\u002Dscheme"

const val NID_dhSinglePass_cofactorDH_sha384kdf_scheme: Int = 944

val SN_dhSinglePass_cofactorDH_sha512kdf_scheme: String get() = "dhSinglePass\u002DcofactorDH\u002Dsha512kdf\u002Dscheme"

const val NID_dhSinglePass_cofactorDH_sha512kdf_scheme: Int = 945

val SN_dh_std_kdf: String get() = "dh\u002Dstd\u002Dkdf"

const val NID_dh_std_kdf: Int = 946

val SN_dh_cofactor_kdf: String get() = "dh\u002Dcofactor\u002Dkdf"

const val NID_dh_cofactor_kdf: Int = 947

val SN_ct_precert_scts: String get() = "ct_precert_scts"

val LN_ct_precert_scts: String get() = "CT Precertificate SCTs"

const val NID_ct_precert_scts: Int = 951

val SN_ct_precert_poison: String get() = "ct_precert_poison"

val LN_ct_precert_poison: String get() = "CT Precertificate Poison"

const val NID_ct_precert_poison: Int = 952

val SN_ct_precert_signer: String get() = "ct_precert_signer"

val LN_ct_precert_signer: String get() = "CT Precertificate Signer"

const val NID_ct_precert_signer: Int = 953

val SN_ct_cert_scts: String get() = "ct_cert_scts"

val LN_ct_cert_scts: String get() = "CT Certificate SCTs"

const val NID_ct_cert_scts: Int = 954

val SN_jurisdictionLocalityName: String get() = "jurisdictionL"

val LN_jurisdictionLocalityName: String get() = "jurisdictionLocalityName"

const val NID_jurisdictionLocalityName: Int = 955

val SN_jurisdictionStateOrProvinceName: String get() = "jurisdictionST"

val LN_jurisdictionStateOrProvinceName: String get() = "jurisdictionStateOrProvinceName"

const val NID_jurisdictionStateOrProvinceName: Int = 956

val SN_jurisdictionCountryName: String get() = "jurisdictionC"

val LN_jurisdictionCountryName: String get() = "jurisdictionCountryName"

const val NID_jurisdictionCountryName: Int = 957

val SN_id_scrypt: String get() = "id\u002Dscrypt"

const val NID_id_scrypt: Int = 973

val SN_tls1_prf: String get() = "TLS1\u002DPRF"

val LN_tls1_prf: String get() = "tls1\u002Dprf"

const val NID_tls1_prf: Int = 1021

val SN_hkdf: String get() = "HKDF"

val LN_hkdf: String get() = "hkdf"

const val NID_hkdf: Int = 1036

val SN_id_pkinit: String get() = "id\u002Dpkinit"

const val NID_id_pkinit: Int = 1031

val SN_pkInitClientAuth: String get() = "pkInitClientAuth"

val LN_pkInitClientAuth: String get() = "PKINIT Client Auth"

const val NID_pkInitClientAuth: Int = 1032

val SN_pkInitKDC: String get() = "pkInitKDC"

val LN_pkInitKDC: String get() = "Signing KDC Response"

const val NID_pkInitKDC: Int = 1033

val SN_X25519: String get() = "X25519"

const val NID_X25519: Int = 1034

val SN_X448: String get() = "X448"

const val NID_X448: Int = 1035

val SN_kx_rsa: String get() = "KxRSA"

val LN_kx_rsa: String get() = "kx\u002Drsa"

const val NID_kx_rsa: Int = 1037

val SN_kx_ecdhe: String get() = "KxECDHE"

val LN_kx_ecdhe: String get() = "kx\u002Decdhe"

const val NID_kx_ecdhe: Int = 1038

val SN_kx_dhe: String get() = "KxDHE"

val LN_kx_dhe: String get() = "kx\u002Ddhe"

const val NID_kx_dhe: Int = 1039

val SN_kx_ecdhe_psk: String get() = "KxECDHE\u002DPSK"

val LN_kx_ecdhe_psk: String get() = "kx\u002Decdhe\u002Dpsk"

const val NID_kx_ecdhe_psk: Int = 1040

val SN_kx_dhe_psk: String get() = "KxDHE\u002DPSK"

val LN_kx_dhe_psk: String get() = "kx\u002Ddhe\u002Dpsk"

const val NID_kx_dhe_psk: Int = 1041

val SN_kx_rsa_psk: String get() = "KxRSA_PSK"

val LN_kx_rsa_psk: String get() = "kx\u002Drsa\u002Dpsk"

const val NID_kx_rsa_psk: Int = 1042

val SN_kx_psk: String get() = "KxPSK"

val LN_kx_psk: String get() = "kx\u002Dpsk"

const val NID_kx_psk: Int = 1043

val SN_kx_srp: String get() = "KxSRP"

val LN_kx_srp: String get() = "kx\u002Dsrp"

const val NID_kx_srp: Int = 1044

val SN_kx_gost: String get() = "KxGOST"

val LN_kx_gost: String get() = "kx\u002Dgost"

const val NID_kx_gost: Int = 1045

val SN_auth_rsa: String get() = "AuthRSA"

val LN_auth_rsa: String get() = "auth\u002Drsa"

const val NID_auth_rsa: Int = 1046

val SN_auth_ecdsa: String get() = "AuthECDSA"

val LN_auth_ecdsa: String get() = "auth\u002Decdsa"

const val NID_auth_ecdsa: Int = 1047

val SN_auth_psk: String get() = "AuthPSK"

val LN_auth_psk: String get() = "auth\u002Dpsk"

const val NID_auth_psk: Int = 1048

val SN_auth_dss: String get() = "AuthDSS"

val LN_auth_dss: String get() = "auth\u002Ddss"

const val NID_auth_dss: Int = 1049

val SN_auth_gost01: String get() = "AuthGOST01"

val LN_auth_gost01: String get() = "auth\u002Dgost01"

const val NID_auth_gost01: Int = 1050

val SN_auth_gost12: String get() = "AuthGOST12"

val LN_auth_gost12: String get() = "auth\u002Dgost12"

const val NID_auth_gost12: Int = 1051

val SN_auth_srp: String get() = "AuthSRP"

val LN_auth_srp: String get() = "auth\u002Dsrp"

const val NID_auth_srp: Int = 1052

val SN_auth_null: String get() = "AuthNULL"

val LN_auth_null: String get() = "auth\u002Dnull"

const val NID_auth_null: Int = 1053

const val BN_BYTES: Int = 8

const val BN_BITS2: Int = 64

const val BN_BITS: Int = 128

const val BN_TBIT: ULong = 9223372036854775808u

const val BN_FLG_MALLOCED: Int = 1

const val BN_FLG_STATIC_DATA: Int = 2

const val BN_FLG_CONSTTIME: Int = 4

const val BN_FLG_SECURE: Int = 8

const val BN_FLG_EXP_CONSTTIME: Int = 4

const val BN_FLG_FREE: Int = 32768

const val BN_RAND_TOP_ANY: Int = -1

const val BN_RAND_TOP_ONE: Int = 0

const val BN_RAND_TOP_TWO: Int = 1

const val BN_RAND_BOTTOM_ANY: Int = 0

const val BN_RAND_BOTTOM_ODD: Int = 1

const val BN_prime_checks: Int = 0

const val BN_BLINDING_NO_UPDATE: Int = 1

const val BN_BLINDING_NO_RECREATE: Int = 2

const val BN_F_BNRAND: Int = 127

const val BN_F_BN_BLINDING_CONVERT_EX: Int = 100

const val BN_F_BN_BLINDING_CREATE_PARAM: Int = 128

const val BN_F_BN_BLINDING_INVERT_EX: Int = 101

const val BN_F_BN_BLINDING_NEW: Int = 102

const val BN_F_BN_BLINDING_UPDATE: Int = 103

const val BN_F_BN_BN2DEC: Int = 104

const val BN_F_BN_BN2HEX: Int = 105

const val BN_F_BN_COMPUTE_WNAF: Int = 142

const val BN_F_BN_CTX_GET: Int = 116

const val BN_F_BN_CTX_NEW: Int = 106

const val BN_F_BN_CTX_START: Int = 129

const val BN_F_BN_DIV: Int = 107

const val BN_F_BN_DIV_RECP: Int = 130

const val BN_F_BN_EXP: Int = 123

const val BN_F_BN_EXPAND_INTERNAL: Int = 120

const val BN_F_BN_GENCB_NEW: Int = 143

const val BN_F_BN_GENERATE_DSA_NONCE: Int = 140

const val BN_F_BN_GENERATE_PRIME_EX: Int = 141

const val BN_F_BN_GF2M_MOD: Int = 131

const val BN_F_BN_GF2M_MOD_EXP: Int = 132

const val BN_F_BN_GF2M_MOD_MUL: Int = 133

const val BN_F_BN_GF2M_MOD_SOLVE_QUAD: Int = 134

const val BN_F_BN_GF2M_MOD_SOLVE_QUAD_ARR: Int = 135

const val BN_F_BN_GF2M_MOD_SQR: Int = 136

const val BN_F_BN_GF2M_MOD_SQRT: Int = 137

const val BN_F_BN_LSHIFT: Int = 145

const val BN_F_BN_MOD_EXP2_MONT: Int = 118

const val BN_F_BN_MOD_EXP_MONT: Int = 109

const val BN_F_BN_MOD_EXP_MONT_CONSTTIME: Int = 124

const val BN_F_BN_MOD_EXP_MONT_WORD: Int = 117

const val BN_F_BN_MOD_EXP_RECP: Int = 125

const val BN_F_BN_MOD_EXP_SIMPLE: Int = 126

const val BN_F_BN_MOD_INVERSE: Int = 110

const val BN_F_BN_MOD_INVERSE_NO_BRANCH: Int = 139

const val BN_F_BN_MOD_LSHIFT_QUICK: Int = 119

const val BN_F_BN_MOD_SQRT: Int = 121

const val BN_F_BN_MPI2BN: Int = 112

const val BN_F_BN_NEW: Int = 113

const val BN_F_BN_RAND: Int = 114

const val BN_F_BN_RAND_RANGE: Int = 122

const val BN_F_BN_RSHIFT: Int = 146

const val BN_F_BN_SET_WORDS: Int = 144

const val BN_F_BN_USUB: Int = 115

const val BN_R_ARG2_LT_ARG3: Int = 100

const val BN_R_BAD_RECIPROCAL: Int = 101

const val BN_R_BIGNUM_TOO_LONG: Int = 114

const val BN_R_BITS_TOO_SMALL: Int = 118

const val BN_R_CALLED_WITH_EVEN_MODULUS: Int = 102

const val BN_R_DIV_BY_ZERO: Int = 103

const val BN_R_ENCODING_ERROR: Int = 104

const val BN_R_EXPAND_ON_STATIC_BIGNUM_DATA: Int = 105

const val BN_R_INPUT_NOT_REDUCED: Int = 110

const val BN_R_INVALID_LENGTH: Int = 106

const val BN_R_INVALID_RANGE: Int = 115

const val BN_R_INVALID_SHIFT: Int = 119

const val BN_R_NOT_A_SQUARE: Int = 111

const val BN_R_NOT_INITIALIZED: Int = 107

const val BN_R_NO_INVERSE: Int = 108

const val BN_R_NO_SOLUTION: Int = 116

const val BN_R_PRIVATE_KEY_TOO_LARGE: Int = 117

const val BN_R_P_IS_NOT_PRIME: Int = 112

const val BN_R_TOO_MANY_ITERATIONS: Int = 113

const val BN_R_TOO_MANY_TEMPORARY_VARIABLES: Int = 109

const val V_ASN1_UNIVERSAL: Int = 0

const val V_ASN1_APPLICATION: Int = 64

const val V_ASN1_CONTEXT_SPECIFIC: Int = 128

const val V_ASN1_PRIVATE: Int = 192

const val V_ASN1_CONSTRUCTED: Int = 32

const val V_ASN1_PRIMITIVE_TAG: Int = 31

const val V_ASN1_PRIMATIVE_TAG: Int = 31

const val V_ASN1_APP_CHOOSE: Int = -2

const val V_ASN1_OTHER: Int = -3

const val V_ASN1_ANY: Int = -4

const val V_ASN1_UNDEF: Int = -1

const val V_ASN1_EOC: Int = 0

const val V_ASN1_BOOLEAN: Int = 1

const val V_ASN1_INTEGER: Int = 2

const val V_ASN1_BIT_STRING: Int = 3

const val V_ASN1_OCTET_STRING: Int = 4

const val V_ASN1_NULL: Int = 5

const val V_ASN1_OBJECT: Int = 6

const val V_ASN1_OBJECT_DESCRIPTOR: Int = 7

const val V_ASN1_EXTERNAL: Int = 8

const val V_ASN1_REAL: Int = 9

const val V_ASN1_ENUMERATED: Int = 10

const val V_ASN1_UTF8STRING: Int = 12

const val V_ASN1_SEQUENCE: Int = 16

const val V_ASN1_SET: Int = 17

const val V_ASN1_NUMERICSTRING: Int = 18

const val V_ASN1_PRINTABLESTRING: Int = 19

const val V_ASN1_T61STRING: Int = 20

const val V_ASN1_TELETEXSTRING: Int = 20

const val V_ASN1_VIDEOTEXSTRING: Int = 21

const val V_ASN1_IA5STRING: Int = 22

const val V_ASN1_UTCTIME: Int = 23

const val V_ASN1_GENERALIZEDTIME: Int = 24

const val V_ASN1_GRAPHICSTRING: Int = 25

const val V_ASN1_ISO64STRING: Int = 26

const val V_ASN1_VISIBLESTRING: Int = 26

const val V_ASN1_GENERALSTRING: Int = 27

const val V_ASN1_UNIVERSALSTRING: Int = 28

const val V_ASN1_BMPSTRING: Int = 30

const val V_ASN1_NEG: Int = 256

const val V_ASN1_NEG_INTEGER: Int = 258

const val V_ASN1_NEG_ENUMERATED: Int = 266

const val B_ASN1_NUMERICSTRING: Int = 1

const val B_ASN1_PRINTABLESTRING: Int = 2

const val B_ASN1_T61STRING: Int = 4

const val B_ASN1_TELETEXSTRING: Int = 4

const val B_ASN1_VIDEOTEXSTRING: Int = 8

const val B_ASN1_IA5STRING: Int = 16

const val B_ASN1_GRAPHICSTRING: Int = 32

const val B_ASN1_ISO64STRING: Int = 64

const val B_ASN1_VISIBLESTRING: Int = 64

const val B_ASN1_GENERALSTRING: Int = 128

const val B_ASN1_UNIVERSALSTRING: Int = 256

const val B_ASN1_OCTET_STRING: Int = 512

const val B_ASN1_BIT_STRING: Int = 1024

const val B_ASN1_BMPSTRING: Int = 2048

const val B_ASN1_UNKNOWN: Int = 4096

const val B_ASN1_UTF8STRING: Int = 8192

const val B_ASN1_UTCTIME: Int = 16384

const val B_ASN1_GENERALIZEDTIME: Int = 32768

const val B_ASN1_SEQUENCE: Int = 65536

const val MBSTRING_FLAG: Int = 4096

const val MBSTRING_UTF8: Int = 4096

const val MBSTRING_ASC: Int = 4097

const val MBSTRING_BMP: Int = 4098

const val MBSTRING_UNIV: Int = 4100

const val SMIME_OLDMIME: Int = 1024

const val SMIME_CRLFEOL: Int = 2048

const val SMIME_STREAM: Int = 4096

const val ASN1_STRING_FLAG_BITS_LEFT: Int = 8

const val ASN1_STRING_FLAG_NDEF: Int = 16

const val ASN1_STRING_FLAG_CONT: Int = 32

const val ASN1_STRING_FLAG_MSTRING: Int = 64

const val ASN1_STRING_FLAG_EMBED: Int = 128

const val ASN1_LONG_UNDEF: Long = 2147483647

const val STABLE_FLAGS_MALLOC: Int = 1

const val STABLE_FLAGS_CLEAR: Int = 1

const val STABLE_NO_MASK: Int = 2

const val DIRSTRING_TYPE: Int = 10246

const val PKCS9STRING_TYPE: Int = 10262

const val ub_name: Int = 32768

const val ub_common_name: Int = 64

const val ub_locality_name: Int = 128

const val ub_state_name: Int = 128

const val ub_organization_name: Int = 64

const val ub_organization_unit_name: Int = 64

const val ub_title: Int = 64

const val ub_email_address: Int = 128

const val ASN1_STRFLGS_ESC_2253: Int = 1

const val ASN1_STRFLGS_ESC_CTRL: Int = 2

const val ASN1_STRFLGS_ESC_MSB: Int = 4

const val ASN1_STRFLGS_ESC_QUOTE: Int = 8

const val CHARTYPE_PRINTABLESTRING: Int = 16

const val CHARTYPE_FIRST_ESC_2253: Int = 32

const val CHARTYPE_LAST_ESC_2253: Int = 64

const val ASN1_STRFLGS_UTF8_CONVERT: Int = 16

const val ASN1_STRFLGS_IGNORE_TYPE: Int = 32

const val ASN1_STRFLGS_SHOW_TYPE: Int = 64

const val ASN1_STRFLGS_DUMP_ALL: Int = 128

const val ASN1_STRFLGS_DUMP_UNKNOWN: Int = 256

const val ASN1_STRFLGS_DUMP_DER: Int = 512

const val ASN1_STRFLGS_ESC_2254: Int = 1024

const val ASN1_STRFLGS_RFC2253: Int = 791

const val B_ASN1_TIME: Int = 49152

const val B_ASN1_PRINTABLE: Int = 81175

const val B_ASN1_DIRECTORYSTRING: Int = 10502

const val B_ASN1_DISPLAYTEXT: Int = 10320

const val ASN1_PCTX_FLAGS_SHOW_ABSENT: Int = 1

const val ASN1_PCTX_FLAGS_SHOW_SEQUENCE: Int = 2

const val ASN1_PCTX_FLAGS_SHOW_SSOF: Int = 4

const val ASN1_PCTX_FLAGS_SHOW_TYPE: Int = 8

const val ASN1_PCTX_FLAGS_NO_ANY_TYPE: Int = 16

const val ASN1_PCTX_FLAGS_NO_MSTRING_TYPE: Int = 32

const val ASN1_PCTX_FLAGS_NO_FIELD_NAME: Int = 64

const val ASN1_PCTX_FLAGS_SHOW_FIELD_STRUCT_NAME: Int = 128

const val ASN1_PCTX_FLAGS_NO_STRUCT_NAME: Int = 256

const val ASN1_F_A2D_ASN1_OBJECT: Int = 100

const val ASN1_F_A2I_ASN1_INTEGER: Int = 102

const val ASN1_F_A2I_ASN1_STRING: Int = 103

const val ASN1_F_APPEND_EXP: Int = 176

const val ASN1_F_ASN1_BIT_STRING_SET_BIT: Int = 183

const val ASN1_F_ASN1_CB: Int = 177

const val ASN1_F_ASN1_CHECK_TLEN: Int = 104

const val ASN1_F_ASN1_COLLECT: Int = 106

const val ASN1_F_ASN1_D2I_EX_PRIMITIVE: Int = 108

const val ASN1_F_ASN1_D2I_FP: Int = 109

const val ASN1_F_ASN1_D2I_READ_BIO: Int = 107

const val ASN1_F_ASN1_DIGEST: Int = 184

const val ASN1_F_ASN1_DO_ADB: Int = 110

const val ASN1_F_ASN1_DO_LOCK: Int = 233

const val ASN1_F_ASN1_DUP: Int = 111

const val ASN1_F_ASN1_EX_C2I: Int = 204

const val ASN1_F_ASN1_FIND_END: Int = 190

const val ASN1_F_ASN1_GENERALIZEDTIME_ADJ: Int = 216

const val ASN1_F_ASN1_GENERATE_V3: Int = 178

const val ASN1_F_ASN1_GET_INT64: Int = 224

const val ASN1_F_ASN1_GET_OBJECT: Int = 114

const val ASN1_F_ASN1_GET_UINT64: Int = 225

const val ASN1_F_ASN1_I2D_BIO: Int = 116

const val ASN1_F_ASN1_I2D_FP: Int = 117

const val ASN1_F_ASN1_ITEM_D2I_FP: Int = 206

const val ASN1_F_ASN1_ITEM_DUP: Int = 191

const val ASN1_F_ASN1_ITEM_EMBED_D2I: Int = 120

const val ASN1_F_ASN1_ITEM_EMBED_NEW: Int = 121

const val ASN1_F_ASN1_ITEM_I2D_BIO: Int = 192

const val ASN1_F_ASN1_ITEM_I2D_FP: Int = 193

const val ASN1_F_ASN1_ITEM_PACK: Int = 198

const val ASN1_F_ASN1_ITEM_SIGN: Int = 195

const val ASN1_F_ASN1_ITEM_SIGN_CTX: Int = 220

const val ASN1_F_ASN1_ITEM_UNPACK: Int = 199

const val ASN1_F_ASN1_ITEM_VERIFY: Int = 197

const val ASN1_F_ASN1_MBSTRING_NCOPY: Int = 122

const val ASN1_F_ASN1_OBJECT_NEW: Int = 123

const val ASN1_F_ASN1_OUTPUT_DATA: Int = 214

const val ASN1_F_ASN1_PCTX_NEW: Int = 205

const val ASN1_F_ASN1_SCTX_NEW: Int = 221

const val ASN1_F_ASN1_SIGN: Int = 128

const val ASN1_F_ASN1_STR2TYPE: Int = 179

const val ASN1_F_ASN1_STRING_GET_INT64: Int = 227

const val ASN1_F_ASN1_STRING_GET_UINT64: Int = 230

const val ASN1_F_ASN1_STRING_SET: Int = 186

const val ASN1_F_ASN1_STRING_TABLE_ADD: Int = 129

const val ASN1_F_ASN1_STRING_TO_BN: Int = 228

const val ASN1_F_ASN1_STRING_TYPE_NEW: Int = 130

const val ASN1_F_ASN1_TEMPLATE_EX_D2I: Int = 132

const val ASN1_F_ASN1_TEMPLATE_NEW: Int = 133

const val ASN1_F_ASN1_TEMPLATE_NOEXP_D2I: Int = 131

const val ASN1_F_ASN1_TIME_ADJ: Int = 217

const val ASN1_F_ASN1_TYPE_GET_INT_OCTETSTRING: Int = 134

const val ASN1_F_ASN1_TYPE_GET_OCTETSTRING: Int = 135

const val ASN1_F_ASN1_UTCTIME_ADJ: Int = 218

const val ASN1_F_ASN1_VERIFY: Int = 137

const val ASN1_F_B64_READ_ASN1: Int = 209

const val ASN1_F_B64_WRITE_ASN1: Int = 210

const val ASN1_F_BIO_NEW_NDEF: Int = 208

const val ASN1_F_BITSTR_CB: Int = 180

const val ASN1_F_BN_TO_ASN1_STRING: Int = 229

const val ASN1_F_C2I_ASN1_BIT_STRING: Int = 189

const val ASN1_F_C2I_ASN1_INTEGER: Int = 194

const val ASN1_F_C2I_ASN1_OBJECT: Int = 196

const val ASN1_F_C2I_IBUF: Int = 226

const val ASN1_F_C2I_UINT64_INT: Int = 101

const val ASN1_F_COLLECT_DATA: Int = 140

const val ASN1_F_D2I_ASN1_OBJECT: Int = 147

const val ASN1_F_D2I_ASN1_UINTEGER: Int = 150

const val ASN1_F_D2I_AUTOPRIVATEKEY: Int = 207

const val ASN1_F_D2I_PRIVATEKEY: Int = 154

const val ASN1_F_D2I_PUBLICKEY: Int = 155

const val ASN1_F_DO_TCREATE: Int = 222

const val ASN1_F_I2D_ASN1_BIO_STREAM: Int = 211

const val ASN1_F_I2D_DSA_PUBKEY: Int = 161

const val ASN1_F_I2D_EC_PUBKEY: Int = 181

const val ASN1_F_I2D_PRIVATEKEY: Int = 163

const val ASN1_F_I2D_PUBLICKEY: Int = 164

const val ASN1_F_I2D_RSA_PUBKEY: Int = 165

const val ASN1_F_LONG_C2I: Int = 166

const val ASN1_F_OID_MODULE_INIT: Int = 174

const val ASN1_F_PARSE_TAGGING: Int = 182

const val ASN1_F_PKCS5_PBE2_SET_IV: Int = 167

const val ASN1_F_PKCS5_PBE2_SET_SCRYPT: Int = 231

const val ASN1_F_PKCS5_PBE_SET: Int = 202

const val ASN1_F_PKCS5_PBE_SET0_ALGOR: Int = 215

const val ASN1_F_PKCS5_PBKDF2_SET: Int = 219

const val ASN1_F_PKCS5_SCRYPT_SET: Int = 232

const val ASN1_F_SMIME_READ_ASN1: Int = 212

const val ASN1_F_SMIME_TEXT: Int = 213

const val ASN1_F_STBL_MODULE_INIT: Int = 223

const val ASN1_F_UINT32_C2I: Int = 105

const val ASN1_F_UINT64_C2I: Int = 112

const val ASN1_F_X509_CRL_ADD0_REVOKED: Int = 169

const val ASN1_F_X509_INFO_NEW: Int = 170

const val ASN1_F_X509_NAME_ENCODE: Int = 203

const val ASN1_F_X509_NAME_EX_D2I: Int = 158

const val ASN1_F_X509_NAME_EX_NEW: Int = 171

const val ASN1_F_X509_PKEY_NEW: Int = 173

const val ASN1_R_ADDING_OBJECT: Int = 171

const val ASN1_R_ASN1_PARSE_ERROR: Int = 203

const val ASN1_R_ASN1_SIG_PARSE_ERROR: Int = 204

const val ASN1_R_AUX_ERROR: Int = 100

const val ASN1_R_BAD_OBJECT_HEADER: Int = 102

const val ASN1_R_BMPSTRING_IS_WRONG_LENGTH: Int = 214

const val ASN1_R_BN_LIB: Int = 105

const val ASN1_R_BOOLEAN_IS_WRONG_LENGTH: Int = 106

const val ASN1_R_BUFFER_TOO_SMALL: Int = 107

const val ASN1_R_CIPHER_HAS_NO_OBJECT_IDENTIFIER: Int = 108

const val ASN1_R_CONTEXT_NOT_INITIALISED: Int = 217

const val ASN1_R_DATA_IS_WRONG: Int = 109

const val ASN1_R_DECODE_ERROR: Int = 110

const val ASN1_R_DEPTH_EXCEEDED: Int = 174

const val ASN1_R_DIGEST_AND_KEY_TYPE_NOT_SUPPORTED: Int = 198

const val ASN1_R_ENCODE_ERROR: Int = 112

const val ASN1_R_ERROR_GETTING_TIME: Int = 173

const val ASN1_R_ERROR_LOADING_SECTION: Int = 172

const val ASN1_R_ERROR_SETTING_CIPHER_PARAMS: Int = 114

const val ASN1_R_EXPECTING_AN_INTEGER: Int = 115

const val ASN1_R_EXPECTING_AN_OBJECT: Int = 116

const val ASN1_R_EXPLICIT_LENGTH_MISMATCH: Int = 119

const val ASN1_R_EXPLICIT_TAG_NOT_CONSTRUCTED: Int = 120

const val ASN1_R_FIELD_MISSING: Int = 121

const val ASN1_R_FIRST_NUM_TOO_LARGE: Int = 122

const val ASN1_R_HEADER_TOO_LONG: Int = 123

const val ASN1_R_ILLEGAL_BITSTRING_FORMAT: Int = 175

const val ASN1_R_ILLEGAL_BOOLEAN: Int = 176

const val ASN1_R_ILLEGAL_CHARACTERS: Int = 124

const val ASN1_R_ILLEGAL_FORMAT: Int = 177

const val ASN1_R_ILLEGAL_HEX: Int = 178

const val ASN1_R_ILLEGAL_IMPLICIT_TAG: Int = 179

const val ASN1_R_ILLEGAL_INTEGER: Int = 180

const val ASN1_R_ILLEGAL_NEGATIVE_VALUE: Int = 226

const val ASN1_R_ILLEGAL_NESTED_TAGGING: Int = 181

const val ASN1_R_ILLEGAL_NULL: Int = 125

const val ASN1_R_ILLEGAL_NULL_VALUE: Int = 182

const val ASN1_R_ILLEGAL_OBJECT: Int = 183

const val ASN1_R_ILLEGAL_OPTIONAL_ANY: Int = 126

const val ASN1_R_ILLEGAL_OPTIONS_ON_ITEM_TEMPLATE: Int = 170

const val ASN1_R_ILLEGAL_PADDING: Int = 221

const val ASN1_R_ILLEGAL_TAGGED_ANY: Int = 127

const val ASN1_R_ILLEGAL_TIME_VALUE: Int = 184

const val ASN1_R_ILLEGAL_ZERO_CONTENT: Int = 222

const val ASN1_R_INTEGER_NOT_ASCII_FORMAT: Int = 185

const val ASN1_R_INTEGER_TOO_LARGE_FOR_LONG: Int = 128

const val ASN1_R_INVALID_BIT_STRING_BITS_LEFT: Int = 220

const val ASN1_R_INVALID_BMPSTRING_LENGTH: Int = 129

const val ASN1_R_INVALID_DIGIT: Int = 130

const val ASN1_R_INVALID_MIME_TYPE: Int = 205

const val ASN1_R_INVALID_MODIFIER: Int = 186

const val ASN1_R_INVALID_NUMBER: Int = 187

const val ASN1_R_INVALID_OBJECT_ENCODING: Int = 216

const val ASN1_R_INVALID_SCRYPT_PARAMETERS: Int = 227

const val ASN1_R_INVALID_SEPARATOR: Int = 131

const val ASN1_R_INVALID_STRING_TABLE_VALUE: Int = 218

const val ASN1_R_INVALID_UNIVERSALSTRING_LENGTH: Int = 133

const val ASN1_R_INVALID_UTF8STRING: Int = 134

const val ASN1_R_INVALID_VALUE: Int = 219

const val ASN1_R_LIST_ERROR: Int = 188

const val ASN1_R_MIME_NO_CONTENT_TYPE: Int = 206

const val ASN1_R_MIME_PARSE_ERROR: Int = 207

const val ASN1_R_MIME_SIG_PARSE_ERROR: Int = 208

const val ASN1_R_MISSING_EOC: Int = 137

const val ASN1_R_MISSING_SECOND_NUMBER: Int = 138

const val ASN1_R_MISSING_VALUE: Int = 189

const val ASN1_R_MSTRING_NOT_UNIVERSAL: Int = 139

const val ASN1_R_MSTRING_WRONG_TAG: Int = 140

const val ASN1_R_NESTED_ASN1_STRING: Int = 197

const val ASN1_R_NESTED_TOO_DEEP: Int = 201

const val ASN1_R_NON_HEX_CHARACTERS: Int = 141

const val ASN1_R_NOT_ASCII_FORMAT: Int = 190

const val ASN1_R_NOT_ENOUGH_DATA: Int = 142

const val ASN1_R_NO_CONTENT_TYPE: Int = 209

const val ASN1_R_NO_MATCHING_CHOICE_TYPE: Int = 143

const val ASN1_R_NO_MULTIPART_BODY_FAILURE: Int = 210

const val ASN1_R_NO_MULTIPART_BOUNDARY: Int = 211

const val ASN1_R_NO_SIG_CONTENT_TYPE: Int = 212

const val ASN1_R_NULL_IS_WRONG_LENGTH: Int = 144

const val ASN1_R_OBJECT_NOT_ASCII_FORMAT: Int = 191

const val ASN1_R_ODD_NUMBER_OF_CHARS: Int = 145

const val ASN1_R_SECOND_NUMBER_TOO_LARGE: Int = 147

const val ASN1_R_SEQUENCE_LENGTH_MISMATCH: Int = 148

const val ASN1_R_SEQUENCE_NOT_CONSTRUCTED: Int = 149

const val ASN1_R_SEQUENCE_OR_SET_NEEDS_CONFIG: Int = 192

const val ASN1_R_SHORT_LINE: Int = 150

const val ASN1_R_SIG_INVALID_MIME_TYPE: Int = 213

const val ASN1_R_STREAMING_NOT_SUPPORTED: Int = 202

const val ASN1_R_STRING_TOO_LONG: Int = 151

const val ASN1_R_STRING_TOO_SHORT: Int = 152

const val ASN1_R_THE_ASN1_OBJECT_IDENTIFIER_IS_NOT_KNOWN_FOR_THIS_MD: Int = 154

const val ASN1_R_TIME_NOT_ASCII_FORMAT: Int = 193

const val ASN1_R_TOO_LARGE: Int = 223

const val ASN1_R_TOO_LONG: Int = 155

const val ASN1_R_TOO_SMALL: Int = 224

const val ASN1_R_TYPE_NOT_CONSTRUCTED: Int = 156

const val ASN1_R_TYPE_NOT_PRIMITIVE: Int = 195

const val ASN1_R_UNEXPECTED_EOC: Int = 159

const val ASN1_R_UNIVERSALSTRING_IS_WRONG_LENGTH: Int = 215

const val ASN1_R_UNKNOWN_FORMAT: Int = 160

const val ASN1_R_UNKNOWN_MESSAGE_DIGEST_ALGORITHM: Int = 161

const val ASN1_R_UNKNOWN_OBJECT_TYPE: Int = 162

const val ASN1_R_UNKNOWN_PUBLIC_KEY_TYPE: Int = 163

const val ASN1_R_UNKNOWN_SIGNATURE_ALGORITHM: Int = 199

const val ASN1_R_UNKNOWN_TAG: Int = 194

const val ASN1_R_UNSUPPORTED_ANY_DEFINED_BY_TYPE: Int = 164

const val ASN1_R_UNSUPPORTED_PUBLIC_KEY_TYPE: Int = 167

const val ASN1_R_UNSUPPORTED_TYPE: Int = 196

const val ASN1_R_WRONG_INTEGER_TYPE: Int = 225

const val ASN1_R_WRONG_PUBLIC_KEY_TYPE: Int = 200

const val ASN1_R_WRONG_TAG: Int = 168

const val OBJ_NAME_TYPE_UNDEF: Int = 0

const val OBJ_NAME_TYPE_MD_METH: Int = 1

const val OBJ_NAME_TYPE_CIPHER_METH: Int = 2

const val OBJ_NAME_TYPE_PKEY_METH: Int = 3

const val OBJ_NAME_TYPE_COMP_METH: Int = 4

const val OBJ_NAME_TYPE_NUM: Int = 5

const val OBJ_NAME_ALIAS: Int = 32768

const val OBJ_BSEARCH_VALUE_ON_NOMATCH: Int = 1

const val OBJ_BSEARCH_FIRST_VALUE_ON_MATCH: Int = 2

const val OBJ_F_OBJ_ADD_OBJECT: Int = 105

const val OBJ_F_OBJ_CREATE: Int = 100

const val OBJ_F_OBJ_DUP: Int = 101

const val OBJ_F_OBJ_NAME_NEW_INDEX: Int = 106

const val OBJ_F_OBJ_NID2LN: Int = 102

const val OBJ_F_OBJ_NID2OBJ: Int = 103

const val OBJ_F_OBJ_NID2SN: Int = 104

const val OBJ_R_OID_EXISTS: Int = 102

const val OBJ_R_UNKNOWN_NID: Int = 101

const val EVP_PK_RSA: Int = 1

const val EVP_PK_DSA: Int = 2

const val EVP_PK_DH: Int = 4

const val EVP_PK_EC: Int = 8

const val EVP_PKT_SIGN: Int = 16

const val EVP_PKT_ENC: Int = 32

const val EVP_PKT_EXCH: Int = 64

const val EVP_PKS_RSA: Int = 256

const val EVP_PKS_DSA: Int = 512

const val EVP_PKS_EC: Int = 1024

const val EVP_PKEY_NONE: Int = 0

const val EVP_PKEY_RSA: Int = 6

const val EVP_PKEY_RSA2: Int = 19

const val EVP_PKEY_DSA: Int = 116

const val EVP_PKEY_DSA1: Int = 67

const val EVP_PKEY_DSA2: Int = 66

const val EVP_PKEY_DSA3: Int = 113

const val EVP_PKEY_DSA4: Int = 70

const val EVP_PKEY_DH: Int = 28

const val EVP_PKEY_DHX: Int = 920

const val EVP_PKEY_EC: Int = 408

const val EVP_PKEY_HMAC: Int = 855

const val EVP_PKEY_CMAC: Int = 894

const val EVP_PKEY_TLS1_PRF: Int = 1021

const val EVP_PKEY_HKDF: Int = 1036

const val EVP_PKEY_MO_SIGN: Int = 1

const val EVP_PKEY_MO_VERIFY: Int = 2

const val EVP_PKEY_MO_ENCRYPT: Int = 4

const val EVP_PKEY_MO_DECRYPT: Int = 8

const val EVP_MD_FLAG_ONESHOT: Int = 1

const val EVP_MD_FLAG_DIGALGID_MASK: Int = 24

const val EVP_MD_FLAG_DIGALGID_NULL: Int = 0

const val EVP_MD_FLAG_DIGALGID_ABSENT: Int = 8

const val EVP_MD_FLAG_DIGALGID_CUSTOM: Int = 24

const val EVP_MD_FLAG_FIPS: Int = 1024

const val EVP_MD_CTRL_DIGALGID: Int = 1

const val EVP_MD_CTRL_MICALG: Int = 2

const val EVP_MD_CTRL_ALG_CTRL: Int = 4096

const val EVP_MD_CTX_FLAG_ONESHOT: Int = 1

const val EVP_MD_CTX_FLAG_CLEANED: Int = 2

const val EVP_MD_CTX_FLAG_REUSE: Int = 4

const val EVP_MD_CTX_FLAG_NON_FIPS_ALLOW: Int = 8

const val EVP_MD_CTX_FLAG_PAD_MASK: Int = 240

const val EVP_MD_CTX_FLAG_PAD_PKCS1: Int = 0

const val EVP_MD_CTX_FLAG_PAD_X931: Int = 16

const val EVP_MD_CTX_FLAG_PAD_PSS: Int = 32

const val EVP_MD_CTX_FLAG_NO_INIT: Int = 256

const val EVP_MD_CTX_FLAG_FINALISE: Int = 512

const val EVP_CIPH_STREAM_CIPHER: Int = 0

const val EVP_CIPH_ECB_MODE: Int = 1

const val EVP_CIPH_CBC_MODE: Int = 2

const val EVP_CIPH_CFB_MODE: Int = 3

const val EVP_CIPH_OFB_MODE: Int = 4

const val EVP_CIPH_CTR_MODE: Int = 5

const val EVP_CIPH_GCM_MODE: Int = 6

const val EVP_CIPH_CCM_MODE: Int = 7

const val EVP_CIPH_XTS_MODE: Int = 65537

const val EVP_CIPH_WRAP_MODE: Int = 65538

const val EVP_CIPH_OCB_MODE: Int = 65539

const val EVP_CIPH_MODE: Int = 983047

const val EVP_CIPH_VARIABLE_LENGTH: Int = 8

const val EVP_CIPH_CUSTOM_IV: Int = 16

const val EVP_CIPH_ALWAYS_CALL_INIT: Int = 32

const val EVP_CIPH_CTRL_INIT: Int = 64

const val EVP_CIPH_CUSTOM_KEY_LENGTH: Int = 128

const val EVP_CIPH_NO_PADDING: Int = 256

const val EVP_CIPH_RAND_KEY: Int = 512

const val EVP_CIPH_CUSTOM_COPY: Int = 1024

const val EVP_CIPH_FLAG_DEFAULT_ASN1: Int = 4096

const val EVP_CIPH_FLAG_LENGTH_BITS: Int = 8192

const val EVP_CIPH_FLAG_FIPS: Int = 16384

const val EVP_CIPH_FLAG_NON_FIPS_ALLOW: Int = 32768

const val EVP_CIPH_FLAG_CUSTOM_CIPHER: Int = 1048576

const val EVP_CIPH_FLAG_AEAD_CIPHER: Int = 2097152

const val EVP_CIPH_FLAG_TLS1_1_MULTIBLOCK: Int = 4194304

const val EVP_CIPH_FLAG_PIPELINE: Int = 8388608

const val EVP_CIPHER_CTX_FLAG_WRAP_ALLOW: Int = 1

const val EVP_CTRL_INIT: Int = 0

const val EVP_CTRL_SET_KEY_LENGTH: Int = 1

const val EVP_CTRL_GET_RC2_KEY_BITS: Int = 2

const val EVP_CTRL_SET_RC2_KEY_BITS: Int = 3

const val EVP_CTRL_GET_RC5_ROUNDS: Int = 4

const val EVP_CTRL_SET_RC5_ROUNDS: Int = 5

const val EVP_CTRL_RAND_KEY: Int = 6

const val EVP_CTRL_PBE_PRF_NID: Int = 7

const val EVP_CTRL_COPY: Int = 8

const val EVP_CTRL_AEAD_SET_IVLEN: Int = 9

const val EVP_CTRL_AEAD_GET_TAG: Int = 16

const val EVP_CTRL_AEAD_SET_TAG: Int = 17

const val EVP_CTRL_AEAD_SET_IV_FIXED: Int = 18

const val EVP_CTRL_GCM_SET_IVLEN: Int = 9

const val EVP_CTRL_GCM_GET_TAG: Int = 16

const val EVP_CTRL_GCM_SET_TAG: Int = 17

const val EVP_CTRL_GCM_SET_IV_FIXED: Int = 18

const val EVP_CTRL_GCM_IV_GEN: Int = 19

const val EVP_CTRL_CCM_SET_IVLEN: Int = 9

const val EVP_CTRL_CCM_GET_TAG: Int = 16

const val EVP_CTRL_CCM_SET_TAG: Int = 17

const val EVP_CTRL_CCM_SET_IV_FIXED: Int = 18

const val EVP_CTRL_CCM_SET_L: Int = 20

const val EVP_CTRL_CCM_SET_MSGLEN: Int = 21

const val EVP_CTRL_AEAD_TLS1_AAD: Int = 22

const val EVP_CTRL_AEAD_SET_MAC_KEY: Int = 23

const val EVP_CTRL_GCM_SET_IV_INV: Int = 24

const val EVP_CTRL_TLS1_1_MULTIBLOCK_AAD: Int = 25

const val EVP_CTRL_TLS1_1_MULTIBLOCK_ENCRYPT: Int = 26

const val EVP_CTRL_TLS1_1_MULTIBLOCK_DECRYPT: Int = 27

const val EVP_CTRL_TLS1_1_MULTIBLOCK_MAX_BUFSIZE: Int = 28

const val EVP_CTRL_SSL3_MASTER_SECRET: Int = 29

const val EVP_CTRL_SET_SBOX: Int = 30

const val EVP_CTRL_SBOX_USED: Int = 31

const val EVP_CTRL_KEY_MESH: Int = 32

const val EVP_CTRL_BLOCK_PADDING_MODE: Int = 33

const val EVP_CTRL_SET_PIPELINE_OUTPUT_BUFS: Int = 34

const val EVP_CTRL_SET_PIPELINE_INPUT_BUFS: Int = 35

const val EVP_CTRL_SET_PIPELINE_INPUT_LENS: Int = 36

const val EVP_PADDING_PKCS7: Int = 1

const val EVP_PADDING_ISO7816_4: Int = 2

const val EVP_PADDING_ANSI923: Int = 3

const val EVP_PADDING_ISO10126: Int = 4

const val EVP_PADDING_ZERO: Int = 5

const val EVP_AEAD_TLS1_AAD_LEN: Int = 13

const val EVP_GCM_TLS_FIXED_IV_LEN: Int = 4

const val EVP_GCM_TLS_EXPLICIT_IV_LEN: Int = 8

const val EVP_GCM_TLS_TAG_LEN: Int = 16

const val EVP_CCM_TLS_FIXED_IV_LEN: Int = 4

const val EVP_CCM_TLS_EXPLICIT_IV_LEN: Int = 8

const val EVP_PBE_TYPE_OUTER: Int = 0

const val EVP_PBE_TYPE_PRF: Int = 1

const val EVP_PBE_TYPE_KDF: Int = 2

const val ASN1_PKEY_ALIAS: Int = 1

const val ASN1_PKEY_DYNAMIC: Int = 2

const val ASN1_PKEY_SIGPARAM_NULL: Int = 4

const val ASN1_PKEY_CTRL_PKCS7_SIGN: Int = 1

const val ASN1_PKEY_CTRL_PKCS7_ENCRYPT: Int = 2

const val ASN1_PKEY_CTRL_DEFAULT_MD_NID: Int = 3

const val ASN1_PKEY_CTRL_CMS_SIGN: Int = 5

const val ASN1_PKEY_CTRL_CMS_ENVELOPE: Int = 7

const val ASN1_PKEY_CTRL_CMS_RI_TYPE: Int = 8

const val ASN1_PKEY_CTRL_SET1_TLS_ENCPT: Int = 9

const val ASN1_PKEY_CTRL_GET1_TLS_ENCPT: Int = 10

const val EVP_PKEY_OP_UNDEFINED: Int = 0

const val EVP_PKEY_OP_PARAMGEN: Int = 2

const val EVP_PKEY_OP_KEYGEN: Int = 4

const val EVP_PKEY_OP_SIGN: Int = 8

const val EVP_PKEY_OP_VERIFY: Int = 16

const val EVP_PKEY_OP_VERIFYRECOVER: Int = 32

const val EVP_PKEY_OP_SIGNCTX: Int = 64

const val EVP_PKEY_OP_VERIFYCTX: Int = 128

const val EVP_PKEY_OP_ENCRYPT: Int = 256

const val EVP_PKEY_OP_DECRYPT: Int = 512

const val EVP_PKEY_OP_DERIVE: Int = 1024

const val EVP_PKEY_OP_TYPE_SIG: Int = 248

const val EVP_PKEY_OP_TYPE_CRYPT: Int = 768

const val EVP_PKEY_OP_TYPE_NOGEN: Int = 2040

const val EVP_PKEY_OP_TYPE_GEN: Int = 6

const val EVP_PKEY_CTRL_MD: Int = 1

const val EVP_PKEY_CTRL_PEER_KEY: Int = 2

const val EVP_PKEY_CTRL_PKCS7_ENCRYPT: Int = 3

const val EVP_PKEY_CTRL_PKCS7_DECRYPT: Int = 4

const val EVP_PKEY_CTRL_PKCS7_SIGN: Int = 5

const val EVP_PKEY_CTRL_SET_MAC_KEY: Int = 6

const val EVP_PKEY_CTRL_DIGESTINIT: Int = 7

const val EVP_PKEY_CTRL_SET_IV: Int = 8

const val EVP_PKEY_CTRL_CMS_ENCRYPT: Int = 9

const val EVP_PKEY_CTRL_CMS_DECRYPT: Int = 10

const val EVP_PKEY_CTRL_CMS_SIGN: Int = 11

const val EVP_PKEY_CTRL_CIPHER: Int = 12

const val EVP_PKEY_CTRL_GET_MD: Int = 13

const val EVP_PKEY_ALG_CTRL: Int = 4096

const val EVP_PKEY_FLAG_AUTOARGLEN: Int = 2

const val EVP_PKEY_FLAG_SIGCTX_CUSTOM: Int = 4

const val EVP_F_AESNI_INIT_KEY: Int = 165

const val EVP_F_AES_INIT_KEY: Int = 133

const val EVP_F_AES_OCB_CIPHER: Int = 169

const val EVP_F_AES_T4_INIT_KEY: Int = 178

const val EVP_F_AES_WRAP_CIPHER: Int = 170

const val EVP_F_ALG_MODULE_INIT: Int = 177

const val EVP_F_CAMELLIA_INIT_KEY: Int = 159

const val EVP_F_CHACHA20_POLY1305_CTRL: Int = 182

const val EVP_F_CMLL_T4_INIT_KEY: Int = 179

const val EVP_F_DES_EDE3_WRAP_CIPHER: Int = 171

const val EVP_F_DO_SIGVER_INIT: Int = 161

const val EVP_F_EVP_CIPHERINIT_EX: Int = 123

const val EVP_F_EVP_CIPHER_CTX_COPY: Int = 163

const val EVP_F_EVP_CIPHER_CTX_CTRL: Int = 124

const val EVP_F_EVP_CIPHER_CTX_SET_KEY_LENGTH: Int = 122

const val EVP_F_EVP_DECRYPTFINAL_EX: Int = 101

const val EVP_F_EVP_DECRYPTUPDATE: Int = 166

const val EVP_F_EVP_DIGESTINIT_EX: Int = 128

const val EVP_F_EVP_ENCRYPTFINAL_EX: Int = 127

const val EVP_F_EVP_ENCRYPTUPDATE: Int = 167

const val EVP_F_EVP_MD_CTX_COPY_EX: Int = 110

const val EVP_F_EVP_MD_SIZE: Int = 162

const val EVP_F_EVP_OPENINIT: Int = 102

const val EVP_F_EVP_PBE_ALG_ADD: Int = 115

const val EVP_F_EVP_PBE_ALG_ADD_TYPE: Int = 160

const val EVP_F_EVP_PBE_CIPHERINIT: Int = 116

const val EVP_F_EVP_PBE_SCRYPT: Int = 181

const val EVP_F_EVP_PKCS82PKEY: Int = 111

const val EVP_F_EVP_PKEY2PKCS8: Int = 113

const val EVP_F_EVP_PKEY_ASN1_ADD0: Int = 168

const val EVP_F_EVP_PKEY_COPY_PARAMETERS: Int = 103

const val EVP_F_EVP_PKEY_CTX_CTRL: Int = 137

const val EVP_F_EVP_PKEY_CTX_CTRL_STR: Int = 150

const val EVP_F_EVP_PKEY_CTX_DUP: Int = 156

const val EVP_F_EVP_PKEY_DECRYPT: Int = 104

const val EVP_F_EVP_PKEY_DECRYPT_INIT: Int = 138

const val EVP_F_EVP_PKEY_DECRYPT_OLD: Int = 151

const val EVP_F_EVP_PKEY_DERIVE: Int = 153

const val EVP_F_EVP_PKEY_DERIVE_INIT: Int = 154

const val EVP_F_EVP_PKEY_DERIVE_SET_PEER: Int = 155

const val EVP_F_EVP_PKEY_ENCRYPT: Int = 105

const val EVP_F_EVP_PKEY_ENCRYPT_INIT: Int = 139

const val EVP_F_EVP_PKEY_ENCRYPT_OLD: Int = 152

const val EVP_F_EVP_PKEY_GET0_DH: Int = 119

const val EVP_F_EVP_PKEY_GET0_DSA: Int = 120

const val EVP_F_EVP_PKEY_GET0_EC_KEY: Int = 131

const val EVP_F_EVP_PKEY_GET0_HMAC: Int = 183

const val EVP_F_EVP_PKEY_GET0_RSA: Int = 121

const val EVP_F_EVP_PKEY_KEYGEN: Int = 146

const val EVP_F_EVP_PKEY_KEYGEN_INIT: Int = 147

const val EVP_F_EVP_PKEY_NEW: Int = 106

const val EVP_F_EVP_PKEY_PARAMGEN: Int = 148

const val EVP_F_EVP_PKEY_PARAMGEN_INIT: Int = 149

const val EVP_F_EVP_PKEY_SET1_ENGINE: Int = 187

const val EVP_F_EVP_PKEY_SIGN: Int = 140

const val EVP_F_EVP_PKEY_SIGN_INIT: Int = 141

const val EVP_F_EVP_PKEY_VERIFY: Int = 142

const val EVP_F_EVP_PKEY_VERIFY_INIT: Int = 143

const val EVP_F_EVP_PKEY_VERIFY_RECOVER: Int = 144

const val EVP_F_EVP_PKEY_VERIFY_RECOVER_INIT: Int = 145

const val EVP_F_EVP_SIGNFINAL: Int = 107

const val EVP_F_EVP_VERIFYFINAL: Int = 108

const val EVP_F_INT_CTX_NEW: Int = 157

const val EVP_F_PKCS5_PBE_KEYIVGEN: Int = 117

const val EVP_F_PKCS5_V2_PBE_KEYIVGEN: Int = 118

const val EVP_F_PKCS5_V2_PBKDF2_KEYIVGEN: Int = 164

const val EVP_F_PKCS5_V2_SCRYPT_KEYIVGEN: Int = 180

const val EVP_F_PKEY_SET_TYPE: Int = 158

const val EVP_F_RC2_MAGIC_TO_METH: Int = 109

const val EVP_F_RC5_CTRL: Int = 125

const val EVP_R_AES_KEY_SETUP_FAILED: Int = 143

const val EVP_R_BAD_DECRYPT: Int = 100

const val EVP_R_BUFFER_TOO_SMALL: Int = 155

const val EVP_R_CAMELLIA_KEY_SETUP_FAILED: Int = 157

const val EVP_R_CIPHER_PARAMETER_ERROR: Int = 122

const val EVP_R_COMMAND_NOT_SUPPORTED: Int = 147

const val EVP_R_COPY_ERROR: Int = 173

const val EVP_R_CTRL_NOT_IMPLEMENTED: Int = 132

const val EVP_R_CTRL_OPERATION_NOT_IMPLEMENTED: Int = 133

const val EVP_R_DATA_NOT_MULTIPLE_OF_BLOCK_LENGTH: Int = 138

const val EVP_R_DECODE_ERROR: Int = 114

const val EVP_R_DIFFERENT_KEY_TYPES: Int = 101

const val EVP_R_DIFFERENT_PARAMETERS: Int = 153

const val EVP_R_ERROR_LOADING_SECTION: Int = 165

const val EVP_R_ERROR_SETTING_FIPS_MODE: Int = 166

const val EVP_R_EXPECTING_AN_HMAC_KEY: Int = 174

const val EVP_R_EXPECTING_AN_RSA_KEY: Int = 127

const val EVP_R_EXPECTING_A_DH_KEY: Int = 128

const val EVP_R_EXPECTING_A_DSA_KEY: Int = 129

const val EVP_R_EXPECTING_A_EC_KEY: Int = 142

const val EVP_R_FIPS_MODE_NOT_SUPPORTED: Int = 167

const val EVP_R_ILLEGAL_SCRYPT_PARAMETERS: Int = 171

const val EVP_R_INITIALIZATION_ERROR: Int = 134

const val EVP_R_INPUT_NOT_INITIALIZED: Int = 111

const val EVP_R_INVALID_DIGEST: Int = 152

const val EVP_R_INVALID_FIPS_MODE: Int = 168

const val EVP_R_INVALID_KEY: Int = 163

const val EVP_R_INVALID_KEY_LENGTH: Int = 130

const val EVP_R_INVALID_OPERATION: Int = 148

const val EVP_R_KEYGEN_FAILURE: Int = 120

const val EVP_R_MEMORY_LIMIT_EXCEEDED: Int = 172

const val EVP_R_MESSAGE_DIGEST_IS_NULL: Int = 159

const val EVP_R_METHOD_NOT_SUPPORTED: Int = 144

const val EVP_R_MISSING_PARAMETERS: Int = 103

const val EVP_R_NO_CIPHER_SET: Int = 131

const val EVP_R_NO_DEFAULT_DIGEST: Int = 158

const val EVP_R_NO_DIGEST_SET: Int = 139

const val EVP_R_NO_KEY_SET: Int = 154

const val EVP_R_NO_OPERATION_SET: Int = 149

const val EVP_R_OPERATION_NOT_SUPPORTED_FOR_THIS_KEYTYPE: Int = 150

const val EVP_R_OPERATON_NOT_INITIALIZED: Int = 151

const val EVP_R_PARTIALLY_OVERLAPPING: Int = 162

const val EVP_R_PKEY_ASN1_METHOD_ALREADY_REGISTERED: Int = 164

const val EVP_R_PRIVATE_KEY_DECODE_ERROR: Int = 145

const val EVP_R_PRIVATE_KEY_ENCODE_ERROR: Int = 146

const val EVP_R_PUBLIC_KEY_NOT_RSA: Int = 106

const val EVP_R_UNKNOWN_CIPHER: Int = 160

const val EVP_R_UNKNOWN_DIGEST: Int = 161

const val EVP_R_UNKNOWN_OPTION: Int = 169

const val EVP_R_UNKNOWN_PBE_ALGORITHM: Int = 121

const val EVP_R_UNSUPPORTED_ALGORITHM: Int = 156

const val EVP_R_UNSUPPORTED_CIPHER: Int = 107

const val EVP_R_UNSUPPORTED_KEYLENGTH: Int = 123

const val EVP_R_UNSUPPORTED_KEY_DERIVATION_FUNCTION: Int = 124

const val EVP_R_UNSUPPORTED_KEY_SIZE: Int = 108

const val EVP_R_UNSUPPORTED_NUMBER_OF_ROUNDS: Int = 135

const val EVP_R_UNSUPPORTED_PRF: Int = 125

const val EVP_R_UNSUPPORTED_PRIVATE_KEY_ALGORITHM: Int = 118

const val EVP_R_UNSUPPORTED_SALT_TYPE: Int = 126

const val EVP_R_WRAP_MODE_NOT_ALLOWED: Int = 170

const val EVP_R_WRONG_FINAL_BLOCK_LENGTH: Int = 109

const val LH_LOAD_MULT: Int = 256

const val _ERRNO_H: Int = 1

const val _BITS_ERRNO_H: Int = 1

const val EPERM: Int = 1

const val ENOENT: Int = 2

const val ESRCH: Int = 3

const val EINTR: Int = 4

const val EIO: Int = 5

const val ENXIO: Int = 6

const val E2BIG: Int = 7

const val ENOEXEC: Int = 8

const val EBADF: Int = 9

const val ECHILD: Int = 10

const val EAGAIN: Int = 11

const val ENOMEM: Int = 12

const val EACCES: Int = 13

const val EFAULT: Int = 14

const val ENOTBLK: Int = 15

const val EBUSY: Int = 16

const val EEXIST: Int = 17

const val EXDEV: Int = 18

const val ENODEV: Int = 19

const val ENOTDIR: Int = 20

const val EISDIR: Int = 21

const val EINVAL: Int = 22

const val ENFILE: Int = 23

const val EMFILE: Int = 24

const val ENOTTY: Int = 25

const val ETXTBSY: Int = 26

const val EFBIG: Int = 27

const val ENOSPC: Int = 28

const val ESPIPE: Int = 29

const val EROFS: Int = 30

const val EMLINK: Int = 31

const val EPIPE: Int = 32

const val EDOM: Int = 33

const val ERANGE: Int = 34

const val EDEADLK: Int = 35

const val ENAMETOOLONG: Int = 36

const val ENOLCK: Int = 37

const val ENOSYS: Int = 38

const val ENOTEMPTY: Int = 39

const val ELOOP: Int = 40

const val EWOULDBLOCK: Int = 11

const val ENOMSG: Int = 42

const val EIDRM: Int = 43

const val ECHRNG: Int = 44

const val EL2NSYNC: Int = 45

const val EL3HLT: Int = 46

const val EL3RST: Int = 47

const val ELNRNG: Int = 48

const val EUNATCH: Int = 49

const val ENOCSI: Int = 50

const val EL2HLT: Int = 51

const val EBADE: Int = 52

const val EBADR: Int = 53

const val EXFULL: Int = 54

const val ENOANO: Int = 55

const val EBADRQC: Int = 56

const val EBADSLT: Int = 57

const val EDEADLOCK: Int = 35

const val EBFONT: Int = 59

const val ENOSTR: Int = 60

const val ENODATA: Int = 61

const val ETIME: Int = 62

const val ENOSR: Int = 63

const val ENONET: Int = 64

const val ENOPKG: Int = 65

const val EREMOTE: Int = 66

const val ENOLINK: Int = 67

const val EADV: Int = 68

const val ESRMNT: Int = 69

const val ECOMM: Int = 70

const val EPROTO: Int = 71

const val EMULTIHOP: Int = 72

const val EDOTDOT: Int = 73

const val EBADMSG: Int = 74

const val EOVERFLOW: Int = 75

const val ENOTUNIQ: Int = 76

const val EBADFD: Int = 77

const val EREMCHG: Int = 78

const val ELIBACC: Int = 79

const val ELIBBAD: Int = 80

const val ELIBSCN: Int = 81

const val ELIBMAX: Int = 82

const val ELIBEXEC: Int = 83

const val EILSEQ: Int = 84

const val ERESTART: Int = 85

const val ESTRPIPE: Int = 86

const val EUSERS: Int = 87

const val ENOTSOCK: Int = 88

const val EDESTADDRREQ: Int = 89

const val EMSGSIZE: Int = 90

const val EPROTOTYPE: Int = 91

const val ENOPROTOOPT: Int = 92

const val EPROTONOSUPPORT: Int = 93

const val ESOCKTNOSUPPORT: Int = 94

const val EOPNOTSUPP: Int = 95

const val EPFNOSUPPORT: Int = 96

const val EAFNOSUPPORT: Int = 97

const val EADDRINUSE: Int = 98

const val EADDRNOTAVAIL: Int = 99

const val ENETDOWN: Int = 100

const val ENETUNREACH: Int = 101

const val ENETRESET: Int = 102

const val ECONNABORTED: Int = 103

const val ECONNRESET: Int = 104

const val ENOBUFS: Int = 105

const val EISCONN: Int = 106

const val ENOTCONN: Int = 107

const val ESHUTDOWN: Int = 108

const val ETOOMANYREFS: Int = 109

const val ETIMEDOUT: Int = 110

const val ECONNREFUSED: Int = 111

const val EHOSTDOWN: Int = 112

const val EHOSTUNREACH: Int = 113

const val EALREADY: Int = 114

const val EINPROGRESS: Int = 115

const val ESTALE: Int = 116

const val EUCLEAN: Int = 117

const val ENOTNAM: Int = 118

const val ENAVAIL: Int = 119

const val EISNAM: Int = 120

const val EREMOTEIO: Int = 121

const val EDQUOT: Int = 122

const val ENOMEDIUM: Int = 123

const val EMEDIUMTYPE: Int = 124

const val ECANCELED: Int = 125

const val ENOKEY: Int = 126

const val EKEYEXPIRED: Int = 127

const val EKEYREVOKED: Int = 128

const val EKEYREJECTED: Int = 129

const val EOWNERDEAD: Int = 130

const val ENOTRECOVERABLE: Int = 131

const val ERFKILL: Int = 132

const val EHWPOISON: Int = 133

const val ENOTSUP: Int = 95

const val ERR_TXT_MALLOCED: Int = 1

const val ERR_TXT_STRING: Int = 2

const val ERR_FLAG_MARK: Int = 1

const val ERR_NUM_ERRORS: Int = 16

const val ERR_LIB_NONE: Int = 1

const val ERR_LIB_SYS: Int = 2

const val ERR_LIB_BN: Int = 3

const val ERR_LIB_RSA: Int = 4

const val ERR_LIB_DH: Int = 5

const val ERR_LIB_EVP: Int = 6

const val ERR_LIB_BUF: Int = 7

const val ERR_LIB_OBJ: Int = 8

const val ERR_LIB_PEM: Int = 9

const val ERR_LIB_DSA: Int = 10

const val ERR_LIB_X509: Int = 11

const val ERR_LIB_ASN1: Int = 13

const val ERR_LIB_CONF: Int = 14

const val ERR_LIB_CRYPTO: Int = 15

const val ERR_LIB_EC: Int = 16

const val ERR_LIB_SSL: Int = 20

const val ERR_LIB_BIO: Int = 32

const val ERR_LIB_PKCS7: Int = 33

const val ERR_LIB_X509V3: Int = 34

const val ERR_LIB_PKCS12: Int = 35

const val ERR_LIB_RAND: Int = 36

const val ERR_LIB_DSO: Int = 37

const val ERR_LIB_ENGINE: Int = 38

const val ERR_LIB_OCSP: Int = 39

const val ERR_LIB_UI: Int = 40

const val ERR_LIB_COMP: Int = 41

const val ERR_LIB_ECDSA: Int = 42

const val ERR_LIB_ECDH: Int = 43

const val ERR_LIB_STORE: Int = 44

const val ERR_LIB_FIPS: Int = 45

const val ERR_LIB_CMS: Int = 46

const val ERR_LIB_TS: Int = 47

const val ERR_LIB_HMAC: Int = 48

const val ERR_LIB_CT: Int = 50

const val ERR_LIB_ASYNC: Int = 51

const val ERR_LIB_KDF: Int = 52

const val ERR_LIB_USER: Int = 128

const val SYS_F_FOPEN: Int = 1

const val SYS_F_CONNECT: Int = 2

const val SYS_F_GETSERVBYNAME: Int = 3

const val SYS_F_SOCKET: Int = 4

const val SYS_F_IOCTLSOCKET: Int = 5

const val SYS_F_BIND: Int = 6

const val SYS_F_LISTEN: Int = 7

const val SYS_F_ACCEPT: Int = 8

const val SYS_F_WSASTARTUP: Int = 9

const val SYS_F_OPENDIR: Int = 10

const val SYS_F_FREAD: Int = 11

const val SYS_F_GETADDRINFO: Int = 12

const val SYS_F_GETNAMEINFO: Int = 13

const val SYS_F_SETSOCKOPT: Int = 14

const val SYS_F_GETSOCKOPT: Int = 15

const val SYS_F_GETSOCKNAME: Int = 16

const val SYS_F_GETHOSTBYNAME: Int = 17

const val SYS_F_FFLUSH: Int = 18

const val ERR_R_SYS_LIB: Int = 2

const val ERR_R_BN_LIB: Int = 3

const val ERR_R_RSA_LIB: Int = 4

const val ERR_R_DH_LIB: Int = 5

const val ERR_R_EVP_LIB: Int = 6

const val ERR_R_BUF_LIB: Int = 7

const val ERR_R_OBJ_LIB: Int = 8

const val ERR_R_PEM_LIB: Int = 9

const val ERR_R_DSA_LIB: Int = 10

const val ERR_R_X509_LIB: Int = 11

const val ERR_R_ASN1_LIB: Int = 13

const val ERR_R_EC_LIB: Int = 16

const val ERR_R_BIO_LIB: Int = 32

const val ERR_R_PKCS7_LIB: Int = 33

const val ERR_R_X509V3_LIB: Int = 34

const val ERR_R_ENGINE_LIB: Int = 38

const val ERR_R_ECDSA_LIB: Int = 42

const val ERR_R_NESTED_ASN1_ERROR: Int = 58

const val ERR_R_MISSING_ASN1_EOS: Int = 63

const val ERR_R_FATAL: Int = 64

const val ERR_R_MALLOC_FAILURE: Int = 65

const val ERR_R_SHOULD_NOT_HAVE_BEEN_CALLED: Int = 66

const val ERR_R_PASSED_NULL_PARAMETER: Int = 67

const val ERR_R_INTERNAL_ERROR: Int = 68

const val ERR_R_DISABLED: Int = 69

const val ERR_R_INIT_FAIL: Int = 70

const val ERR_R_PASSED_INVALID_ARGUMENT: Int = 7

const val CONF_MFLAGS_IGNORE_ERRORS: Int = 1

const val CONF_MFLAGS_IGNORE_RETURN_CODES: Int = 2

const val CONF_MFLAGS_SILENT: Int = 4

const val CONF_MFLAGS_NO_DSO: Int = 8

const val CONF_MFLAGS_IGNORE_MISSING_FILE: Int = 16

const val CONF_MFLAGS_DEFAULT_SECTION: Int = 32

const val CONF_F_CONF_DUMP_FP: Int = 104

const val CONF_F_CONF_LOAD: Int = 100

const val CONF_F_CONF_LOAD_FP: Int = 103

const val CONF_F_CONF_PARSE_LIST: Int = 119

const val CONF_F_DEF_LOAD: Int = 120

const val CONF_F_DEF_LOAD_BIO: Int = 121

const val CONF_F_MODULE_INIT: Int = 115

const val CONF_F_MODULE_LOAD_DSO: Int = 117

const val CONF_F_MODULE_RUN: Int = 118

const val CONF_F_NCONF_DUMP_BIO: Int = 105

const val CONF_F_NCONF_DUMP_FP: Int = 106

const val CONF_F_NCONF_GET_NUMBER_E: Int = 112

const val CONF_F_NCONF_GET_SECTION: Int = 108

const val CONF_F_NCONF_GET_STRING: Int = 109

const val CONF_F_NCONF_LOAD: Int = 113

const val CONF_F_NCONF_LOAD_BIO: Int = 110

const val CONF_F_NCONF_LOAD_FP: Int = 114

const val CONF_F_NCONF_NEW: Int = 111

const val CONF_F_STR_COPY: Int = 101

const val CONF_R_ERROR_LOADING_DSO: Int = 110

const val CONF_R_LIST_CANNOT_BE_NULL: Int = 115

const val CONF_R_MISSING_CLOSE_SQUARE_BRACKET: Int = 100

const val CONF_R_MISSING_EQUAL_SIGN: Int = 101

const val CONF_R_MISSING_INIT_FUNCTION: Int = 112

const val CONF_R_MODULE_INITIALIZATION_ERROR: Int = 109

const val CONF_R_NO_CLOSE_BRACE: Int = 102

const val CONF_R_NO_CONF: Int = 105

const val CONF_R_NO_CONF_OR_ENVIRONMENT_VARIABLE: Int = 106

const val CONF_R_NO_SECTION: Int = 107

const val CONF_R_NO_SUCH_FILE: Int = 114

const val CONF_R_NO_VALUE: Int = 108

const val CONF_R_UNABLE_TO_CREATE_NEW_SECTION: Int = 103

const val CONF_R_UNKNOWN_MODULE_NAME: Int = 113

const val CONF_R_VARIABLE_EXPANSION_TOO_LONG: Int = 116

const val CONF_R_VARIABLE_HAS_NO_VALUE: Int = 104

const val MD5_CBLOCK: Int = 64

const val MD5_LBLOCK: Int = 16

const val MD5_DIGEST_LENGTH: Int = 16

val _IO_stdin: CPointer<_IO_FILE>?
    get() = interpretCPointer<_IO_FILE>(kniBridge1964())

val _IO_stdout: CPointer<_IO_FILE>?
    get() = interpretCPointer<_IO_FILE>(kniBridge1965())

val _IO_stderr: CPointer<_IO_FILE>?
    get() = interpretCPointer<_IO_FILE>(kniBridge1966())

val stdin: CPointer<_IO_FILE>?
    get() = interpretCPointer<_IO_FILE>(kniBridge1967())

val stdout: CPointer<_IO_FILE>?
    get() = interpretCPointer<_IO_FILE>(kniBridge1968())

val stderr: CPointer<_IO_FILE>?
    get() = interpretCPointer<_IO_FILE>(kniBridge1969())

val MB_CUR_MAX: size_t
    get() = kniBridge1970()

val sk_num: CPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Int>>(kniBridge1971())

val sk_value: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, Int) -> COpaquePointer?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, Int) -> COpaquePointer?>>(kniBridge1972())

val sk_set: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, Int, COpaquePointer?) -> COpaquePointer?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, Int, COpaquePointer?) -> COpaquePointer?>>(kniBridge1973())

val sk_new: CPointer<CFunction<(OPENSSL_sk_compfunc?) -> CPointer<OPENSSL_STACK>?>>?
    get() = interpretCPointer<CFunction<(OPENSSL_sk_compfunc?) -> CPointer<OPENSSL_STACK>?>>(kniBridge1974())

val sk_new_null: CPointer<CFunction<() -> CPointer<OPENSSL_STACK>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<OPENSSL_STACK>?>>(kniBridge1975())

val sk_free: CPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Unit>>(kniBridge1976())

val sk_pop_free: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, CPointer<CFunction<(COpaquePointer?) -> Unit>>?) -> Unit>>(kniBridge1977())

val sk_deep_copy: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, OPENSSL_sk_copyfunc?, OPENSSL_sk_freefunc?) -> CPointer<OPENSSL_STACK>?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, OPENSSL_sk_copyfunc?, OPENSSL_sk_freefunc?) -> CPointer<OPENSSL_STACK>?>>(kniBridge1978())

val sk_insert: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?, Int) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?, Int) -> Int>>(kniBridge1979())

val sk_delete: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, Int) -> COpaquePointer?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, Int) -> COpaquePointer?>>(kniBridge1980())

val sk_delete_ptr: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> COpaquePointer?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> COpaquePointer?>>(kniBridge1981())

val sk_find: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> Int>>(kniBridge1982())

val sk_find_ex: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> Int>>(kniBridge1983())

val sk_push: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> Int>>(kniBridge1984())

val sk_unshift: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, COpaquePointer?) -> Int>>(kniBridge1985())

val sk_shift: CPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> COpaquePointer?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> COpaquePointer?>>(kniBridge1986())

val sk_pop: CPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> COpaquePointer?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> COpaquePointer?>>(kniBridge1987())

val sk_zero: CPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Unit>>(kniBridge1988())

val sk_set_cmp_func: CPointer<CFunction<(CPointer<OPENSSL_STACK>?, OPENSSL_sk_compfunc?) -> OPENSSL_sk_compfunc?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?, OPENSSL_sk_compfunc?) -> OPENSSL_sk_compfunc?>>(kniBridge1989())

val sk_dup: CPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> CPointer<OPENSSL_STACK>?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> CPointer<OPENSSL_STACK>?>>(kniBridge1990())

val sk_sort: CPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Unit>>(kniBridge1991())

val sk_is_sorted: CPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_STACK>?) -> Int>>(kniBridge1992())

val SSLeay: CPointer<CFunction<() -> ULong>>?
    get() = interpretCPointer<CFunction<() -> ULong>>(kniBridge1993())

val SSLeay_version: CPointer<CFunction<(Int) -> CPointer<ByteVar>?>>?
    get() = interpretCPointer<CFunction<(Int) -> CPointer<ByteVar>?>>(kniBridge1994())

val PTHREAD_CANCELED: COpaquePointer?
    get() = interpretCPointer<COpaque>(kniBridge1995())

val get_rfc2409_prime_768: CPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>?
    get() = interpretCPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>(kniBridge1996())

val get_rfc2409_prime_1024: CPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>?
    get() = interpretCPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>(kniBridge1997())

val get_rfc3526_prime_1536: CPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>?
    get() = interpretCPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>(kniBridge1998())

val get_rfc3526_prime_2048: CPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>?
    get() = interpretCPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>(kniBridge1999())

val get_rfc3526_prime_3072: CPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>?
    get() = interpretCPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>(kniBridge2000())

val get_rfc3526_prime_4096: CPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>?
    get() = interpretCPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>(kniBridge2001())

val get_rfc3526_prime_6144: CPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>?
    get() = interpretCPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>(kniBridge2002())

val get_rfc3526_prime_8192: CPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>?
    get() = interpretCPointer<CFunction<(CPointer<BIGNUM>?) -> CPointer<BIGNUM>?>>(kniBridge2003())

val EVP_des_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2004())

val EVP_des_ede_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2005())

val EVP_des_ede3_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2006())

val EVP_rc2_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2007())

val EVP_bf_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2008())

val EVP_cast5_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2009())

val EVP_aes_128_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2010())

val EVP_aes_192_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2011())

val EVP_aes_256_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2012())

val EVP_camellia_128_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2013())

val EVP_camellia_192_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2014())

val EVP_camellia_256_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2015())

val EVP_seed_cfb: CPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>?
    get() = interpretCPointer<CFunction<() -> CPointer<EVP_CIPHER>?>>(kniBridge2016())

val lh_error: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?) -> Int>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?) -> Int>>(kniBridge2017())

val lh_free: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?) -> Unit>>(kniBridge2018())

val lh_insert: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, COpaquePointer?) -> COpaquePointer?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, COpaquePointer?) -> COpaquePointer?>>(kniBridge2019())

val lh_delete: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, COpaquePointer?) -> COpaquePointer?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, COpaquePointer?) -> COpaquePointer?>>(kniBridge2020())

val lh_retrieve: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, COpaquePointer?) -> COpaquePointer?>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, COpaquePointer?) -> COpaquePointer?>>(kniBridge2021())

val lh_doall: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, OPENSSL_LH_DOALL_FUNC?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, OPENSSL_LH_DOALL_FUNC?) -> Unit>>(kniBridge2022())

val lh_doall_arg: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, OPENSSL_LH_DOALL_FUNCARG?, COpaquePointer?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, OPENSSL_LH_DOALL_FUNCARG?, COpaquePointer?) -> Unit>>(kniBridge2023())

val lh_strhash: CPointer<CFunction<(CPointer<ByteVar>?) -> ULong>>?
    get() = interpretCPointer<CFunction<(CPointer<ByteVar>?) -> ULong>>(kniBridge2024())

val lh_num_items: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?) -> ULong>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?) -> ULong>>(kniBridge2025())

val lh_stats: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<FILE>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<FILE>?) -> Unit>>(kniBridge2026())

val lh_node_stats: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<FILE>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<FILE>?) -> Unit>>(kniBridge2027())

val lh_node_usage_stats: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<FILE>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<FILE>?) -> Unit>>(kniBridge2028())

val lh_stats_bio: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<BIO>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<BIO>?) -> Unit>>(kniBridge2029())

val lh_node_stats_bio: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<BIO>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<BIO>?) -> Unit>>(kniBridge2030())

val lh_node_usage_stats_bio: CPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<BIO>?) -> Unit>>?
    get() = interpretCPointer<CFunction<(CPointer<OPENSSL_LHASH>?, CPointer<BIO>?) -> Unit>>(kniBridge2031())

val errno: Int
    get() = kniBridge2032()

val _IO_2_1_stdin_: _IO_FILE_plus
    get() = interpretPointed<_IO_FILE_plus>(kniBridge2033())

val _IO_2_1_stdout_: _IO_FILE_plus
    get() = interpretPointed<_IO_FILE_plus>(kniBridge2034())

val _IO_2_1_stderr_: _IO_FILE_plus
    get() = interpretPointed<_IO_FILE_plus>(kniBridge2035())

var stdin_: CPointer<_IO_FILE>?
    get() = interpretCPointer<_IO_FILE>(kniBridge2036())
    set(value) { kniBridge2037(value.rawValue) }

var stdout_: CPointer<_IO_FILE>?
    get() = interpretCPointer<_IO_FILE>(kniBridge2038())
    set(value) { kniBridge2039(value.rawValue) }

var stderr_: CPointer<_IO_FILE>?
    get() = interpretCPointer<_IO_FILE>(kniBridge2040())
    set(value) { kniBridge2041(value.rawValue) }

var sys_nerr: Int
    get() = kniBridge2042()
    set(value) { kniBridge2043(value) }

val sys_errlist: CArrayPointer<CPointerVar<ByteVar>>
    get() = interpretCPointer<CPointerVar<ByteVar>>(kniBridge2044())!!

val __tzname: CArrayPointer<CPointerVar<ByteVar>>
    get() = interpretCPointer<CPointerVar<ByteVar>>(kniBridge2045())!!

var __daylight: Int
    get() = kniBridge2046()
    set(value) { kniBridge2047(value) }

var __timezone: Long
    get() = kniBridge2048()
    set(value) { kniBridge2049(value) }

val tzname: CArrayPointer<CPointerVar<ByteVar>>
    get() = interpretCPointer<CPointerVar<ByteVar>>(kniBridge2050())!!

var daylight: Int
    get() = kniBridge2051()
    set(value) { kniBridge2052(value) }

var timezone: Long
    get() = kniBridge2053()
    set(value) { kniBridge2054(value) }

val ASN1_SEQUENCE_ANY_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2055())

val ASN1_SET_ANY_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2056())

val ASN1_ANY_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2057())

val ASN1_OBJECT_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2058())

val ASN1_BIT_STRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2059())

val ASN1_INTEGER_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2060())

val ASN1_ENUMERATED_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2061())

val ASN1_OCTET_STRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2062())

val ASN1_VISIBLESTRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2063())

val ASN1_UNIVERSALSTRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2064())

val ASN1_UTF8STRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2065())

val ASN1_NULL_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2066())

val ASN1_BMPSTRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2067())

val ASN1_PRINTABLE_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2068())

val DIRECTORYSTRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2069())

val DISPLAYTEXT_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2070())

val ASN1_PRINTABLESTRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2071())

val ASN1_T61STRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2072())

val ASN1_IA5STRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2073())

val ASN1_GENERALSTRING_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2074())

val ASN1_UTCTIME_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2075())

val ASN1_GENERALIZEDTIME_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2076())

val ASN1_TIME_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2077())

val ASN1_OCTET_STRING_NDEF_it: ASN1_ITEM
    get() = interpretPointed<ASN1_ITEM>(kniBridge2078())

class __fsid_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    val __val: CArrayPointer<IntVar>
        get() = arrayMemberAt(0)
    
}

class imaxdiv_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var quot: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    var rem: Long
        get() = memberAt<LongVar>(8).value
        set(value) { memberAt<LongVar>(8).value = value }
    
}

class asn1_string_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var length: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var type: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var data: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(8).value
        set(value) { memberAt<CPointerVar<UByteVar>>(8).value = value }
    
    var flags: Long
        get() = memberAt<LongVar>(16).value
        set(value) { memberAt<LongVar>(16).value = value }
    
}

















































class conf_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var meth: CPointer<CONF_METHOD>?
        get() = memberAt<CPointerVar<CONF_METHOD>>(0).value
        set(value) { memberAt<CPointerVar<CONF_METHOD>>(0).value = value }
    
    var meth_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var data: CPointer<lhash_st_CONF_VALUE>?
        get() = memberAt<CPointerVar<lhash_st_CONF_VALUE>>(16).value
        set(value) { memberAt<CPointerVar<lhash_st_CONF_VALUE>>(16).value = value }
    
}

class conf_method_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(80, 8)
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var create: CPointer<CFunction<(CPointer<CONF_METHOD>?) -> CPointer<CONF>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CONF_METHOD>?) -> CPointer<CONF>?>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CONF_METHOD>?) -> CPointer<CONF>?>>>(8).value = value }
    
    var init: CPointer<CFunction<(CPointer<CONF>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CONF>?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CONF>?) -> Int>>>(16).value = value }
    
    var destroy: CPointer<CFunction<(CPointer<CONF>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CONF>?) -> Int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CONF>?) -> Int>>>(24).value = value }
    
    var destroy_data: CPointer<CFunction<(CPointer<CONF>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CONF>?) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CONF>?) -> Int>>>(32).value = value }
    
    var load_bio: CPointer<CFunction<(CPointer<CONF>?, CPointer<BIO>?, CPointer<LongVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CONF>?, CPointer<BIO>?, CPointer<LongVar>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CONF>?, CPointer<BIO>?, CPointer<LongVar>?) -> Int>>>(40).value = value }
    
    var dump: CPointer<CFunction<(CPointer<CONF>?, CPointer<BIO>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CONF>?, CPointer<BIO>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CONF>?, CPointer<BIO>?) -> Int>>>(48).value = value }
    
    var is_number: CPointer<CFunction<(CPointer<CONF>?, Byte) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CONF>?, Byte) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CONF>?, Byte) -> Int>>>(56).value = value }
    
    var to_int: CPointer<CFunction<(CPointer<CONF>?, Byte) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CONF>?, Byte) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CONF>?, Byte) -> Int>>>(64).value = value }
    
    var load: CPointer<CFunction<(CPointer<CONF>?, CPointer<ByteVar>?, CPointer<LongVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<CONF>?, CPointer<ByteVar>?, CPointer<LongVar>?) -> Int>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<CONF>?, CPointer<ByteVar>?, CPointer<LongVar>?) -> Int>>>(72).value = value }
    
}

class lhash_st_CONF_VALUE(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    val dummy: lh_CONF_VALUE_dummy
        get() = memberAt(0)
    
}

class lh_CONF_VALUE_dummy(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var d1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var d2: ULong
        get() = memberAt<ULongVar>(0).value
        set(value) { memberAt<ULongVar>(0).value = value }
    
    var d3: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

















class crypto_ex_data_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var sk: CPointer<stack_st_void>?
        get() = memberAt<CPointerVar<stack_st_void>>(0).value
        set(value) { memberAt<CPointerVar<stack_st_void>>(0).value = value }
    
}










class _IO_FILE(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(216, 8)
    
    var _flags: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var _IO_read_ptr: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var _IO_read_end: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var _IO_read_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var _IO_write_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
    var _IO_write_ptr: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var _IO_write_end: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(48).value
        set(value) { memberAt<CPointerVar<ByteVar>>(48).value = value }
    
    var _IO_buf_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(56).value
        set(value) { memberAt<CPointerVar<ByteVar>>(56).value = value }
    
    var _IO_buf_end: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(64).value
        set(value) { memberAt<CPointerVar<ByteVar>>(64).value = value }
    
    var _IO_save_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(72).value
        set(value) { memberAt<CPointerVar<ByteVar>>(72).value = value }
    
    var _IO_backup_base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(80).value
        set(value) { memberAt<CPointerVar<ByteVar>>(80).value = value }
    
    var _IO_save_end: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(88).value
        set(value) { memberAt<CPointerVar<ByteVar>>(88).value = value }
    
    var _markers: CPointer<_IO_marker>?
        get() = memberAt<CPointerVar<_IO_marker>>(96).value
        set(value) { memberAt<CPointerVar<_IO_marker>>(96).value = value }
    
    var _chain: CPointer<_IO_FILE>?
        get() = memberAt<CPointerVar<_IO_FILE>>(104).value
        set(value) { memberAt<CPointerVar<_IO_FILE>>(104).value = value }
    
    var _fileno: Int
        get() = memberAt<IntVar>(112).value
        set(value) { memberAt<IntVar>(112).value = value }
    
    var _flags2: Int
        get() = memberAt<IntVar>(116).value
        set(value) { memberAt<IntVar>(116).value = value }
    
    var _old_offset: __off_t
        get() = memberAt<__off_tVar>(120).value
        set(value) { memberAt<__off_tVar>(120).value = value }
    
    var _cur_column: UShort
        get() = memberAt<UShortVar>(128).value
        set(value) { memberAt<UShortVar>(128).value = value }
    
    var _vtable_offset: Byte
        get() = memberAt<ByteVar>(130).value
        set(value) { memberAt<ByteVar>(130).value = value }
    
    val _shortbuf: CArrayPointer<ByteVar>
        get() = arrayMemberAt(131)
    
    var _lock: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(136).value
        set(value) { memberAt<COpaquePointerVar>(136).value = value }
    
    var _offset: __off64_t
        get() = memberAt<__off64_tVar>(144).value
        set(value) { memberAt<__off64_tVar>(144).value = value }
    
    var __pad1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(152).value
        set(value) { memberAt<COpaquePointerVar>(152).value = value }
    
    var __pad2: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(160).value
        set(value) { memberAt<COpaquePointerVar>(160).value = value }
    
    var __pad3: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(168).value
        set(value) { memberAt<COpaquePointerVar>(168).value = value }
    
    var __pad4: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(176).value
        set(value) { memberAt<COpaquePointerVar>(176).value = value }
    
    var __pad5: size_t
        get() = memberAt<size_tVar>(184).value
        set(value) { memberAt<size_tVar>(184).value = value }
    
    var _mode: Int
        get() = memberAt<IntVar>(192).value
        set(value) { memberAt<IntVar>(192).value = value }
    
    val _unused2: CArrayPointer<ByteVar>
        get() = arrayMemberAt(196)
    
}

class _IO_marker(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var _next: CPointer<_IO_marker>?
        get() = memberAt<CPointerVar<_IO_marker>>(0).value
        set(value) { memberAt<CPointerVar<_IO_marker>>(0).value = value }
    
    var _sbuf: CPointer<_IO_FILE>?
        get() = memberAt<CPointerVar<_IO_FILE>>(8).value
        set(value) { memberAt<CPointerVar<_IO_FILE>>(8).value = value }
    
    var _pos: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
}

class __mbstate_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var __count: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val __value: anonymousStruct1
        get() = memberAt(4)
    
}

class anonymousStruct1(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var __wch: UInt
        get() = memberAt<UIntVar>(0).value
        set(value) { memberAt<UIntVar>(0).value = value }
    
    val __wchb: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
}

class _G_fpos_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var __pos: __off_t
        get() = memberAt<__off_tVar>(0).value
        set(value) { memberAt<__off_tVar>(0).value = value }
    
    val __state: __mbstate_t
        get() = memberAt(8)
    
}

class _G_fpos64_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var __pos: __off64_t
        get() = memberAt<__off64_tVar>(0).value
        set(value) { memberAt<__off64_tVar>(0).value = value }
    
    val __state: __mbstate_t
        get() = memberAt(8)
    
}



class div_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var quot: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var rem: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class ldiv_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var quot: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    var rem: Long
        get() = memberAt<LongVar>(8).value
        set(value) { memberAt<LongVar>(8).value = value }
    
}

class lldiv_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var quot: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    var rem: Long
        get() = memberAt<LongVar>(8).value
        set(value) { memberAt<LongVar>(8).value = value }
    
}

class __sigset_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    val __val: CArrayPointer<ULongVar>
        get() = arrayMemberAt(0)
    
}

class timeval(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var tv_sec: __time_t
        get() = memberAt<__time_tVar>(0).value
        set(value) { memberAt<__time_tVar>(0).value = value }
    
    var tv_usec: __suseconds_t
        get() = memberAt<__suseconds_tVar>(8).value
        set(value) { memberAt<__suseconds_tVar>(8).value = value }
    
}

class timespec(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var tv_sec: __time_t
        get() = memberAt<__time_tVar>(0).value
        set(value) { memberAt<__time_tVar>(0).value = value }
    
    var tv_nsec: __syscall_slong_t
        get() = memberAt<__syscall_slong_tVar>(8).value
        set(value) { memberAt<__syscall_slong_tVar>(8).value = value }
    
}

class fd_set(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    val __fds_bits: CArrayPointer<__fd_maskVar>
        get() = arrayMemberAt(0)
    
}

class __pthread_rwlock_arch_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var __readers: UInt
        get() = memberAt<UIntVar>(0).value
        set(value) { memberAt<UIntVar>(0).value = value }
    
    var __writers: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var __wrphase_futex: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
    var __writers_futex: UInt
        get() = memberAt<UIntVar>(12).value
        set(value) { memberAt<UIntVar>(12).value = value }
    
    var __pad3: UInt
        get() = memberAt<UIntVar>(16).value
        set(value) { memberAt<UIntVar>(16).value = value }
    
    var __pad4: UInt
        get() = memberAt<UIntVar>(20).value
        set(value) { memberAt<UIntVar>(20).value = value }
    
    var __cur_writer: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var __shared: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var __rwelision: Byte
        get() = memberAt<ByteVar>(32).value
        set(value) { memberAt<ByteVar>(32).value = value }
    
    val __pad1: CArrayPointer<UByteVar>
        get() = arrayMemberAt(33)
    
    var __pad2: ULong
        get() = memberAt<ULongVar>(40).value
        set(value) { memberAt<ULongVar>(40).value = value }
    
    var __flags: UInt
        get() = memberAt<UIntVar>(48).value
        set(value) { memberAt<UIntVar>(48).value = value }
    
}

class __pthread_internal_list(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var __prev: CPointer<__pthread_internal_list>?
        get() = memberAt<CPointerVar<__pthread_internal_list>>(0).value
        set(value) { memberAt<CPointerVar<__pthread_internal_list>>(0).value = value }
    
    var __next: CPointer<__pthread_internal_list>?
        get() = memberAt<CPointerVar<__pthread_internal_list>>(8).value
        set(value) { memberAt<CPointerVar<__pthread_internal_list>>(8).value = value }
    
}

class __pthread_mutex_s(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var __lock: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var __count: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var __owner: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var __nusers: UInt
        get() = memberAt<UIntVar>(12).value
        set(value) { memberAt<UIntVar>(12).value = value }
    
    var __kind: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var __spins: Short
        get() = memberAt<ShortVar>(20).value
        set(value) { memberAt<ShortVar>(20).value = value }
    
    var __elision: Short
        get() = memberAt<ShortVar>(22).value
        set(value) { memberAt<ShortVar>(22).value = value }
    
    val __list: __pthread_list_t
        get() = memberAt(24)
    
}

class __pthread_cond_s(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var __wseq: ULong
        get() = memberAt<ULongVar>(0).value
        set(value) { memberAt<ULongVar>(0).value = value }
    
    val __wseq32: anonymousStruct2
        get() = memberAt(0)
    
    var __g1_start: ULong
        get() = memberAt<ULongVar>(8).value
        set(value) { memberAt<ULongVar>(8).value = value }
    
    val __g1_start32: anonymousStruct3
        get() = memberAt(8)
    
    val __g_refs: CArrayPointer<UIntVar>
        get() = arrayMemberAt(16)
    
    val __g_size: CArrayPointer<UIntVar>
        get() = arrayMemberAt(24)
    
    var __g1_orig_size: UInt
        get() = memberAt<UIntVar>(32).value
        set(value) { memberAt<UIntVar>(32).value = value }
    
    var __wrefs: UInt
        get() = memberAt<UIntVar>(36).value
        set(value) { memberAt<UIntVar>(36).value = value }
    
    val __g_signals: CArrayPointer<UIntVar>
        get() = arrayMemberAt(40)
    
}

class anonymousStruct2(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var __low: UInt
        get() = memberAt<UIntVar>(0).value
        set(value) { memberAt<UIntVar>(0).value = value }
    
    var __high: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
}

class anonymousStruct3(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var __low: UInt
        get() = memberAt<UIntVar>(0).value
        set(value) { memberAt<UIntVar>(0).value = value }
    
    var __high: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
}

class pthread_mutexattr_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    val __size: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var __align: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class pthread_condattr_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    val __size: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var __align: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class pthread_attr_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    val __size: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var __align: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class pthread_mutex_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    val __data: __pthread_mutex_s
        get() = memberAt(0)
    
    val __size: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var __align: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class pthread_cond_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    val __data: __pthread_cond_s
        get() = memberAt(0)
    
    val __size: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var __align: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class pthread_rwlock_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    val __data: __pthread_rwlock_arch_t
        get() = memberAt(0)
    
    val __size: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var __align: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class pthread_rwlockattr_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    val __size: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var __align: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class pthread_barrier_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    val __size: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var __align: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class pthread_barrierattr_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    val __size: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var __align: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class random_data(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var fptr: CPointer<int32_tVar>?
        get() = memberAt<CPointerVar<int32_tVar>>(0).value
        set(value) { memberAt<CPointerVar<int32_tVar>>(0).value = value }
    
    var rptr: CPointer<int32_tVar>?
        get() = memberAt<CPointerVar<int32_tVar>>(8).value
        set(value) { memberAt<CPointerVar<int32_tVar>>(8).value = value }
    
    var state: CPointer<int32_tVar>?
        get() = memberAt<CPointerVar<int32_tVar>>(16).value
        set(value) { memberAt<CPointerVar<int32_tVar>>(16).value = value }
    
    var rand_type: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var rand_deg: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var rand_sep: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var end_ptr: CPointer<int32_tVar>?
        get() = memberAt<CPointerVar<int32_tVar>>(40).value
        set(value) { memberAt<CPointerVar<int32_tVar>>(40).value = value }
    
}

class drand48_data(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    val __x: CArrayPointer<UShortVar>
        get() = arrayMemberAt(0)
    
    val __old_x: CArrayPointer<UShortVar>
        get() = arrayMemberAt(6)
    
    var __c: UShort
        get() = memberAt<UShortVar>(12).value
        set(value) { memberAt<UShortVar>(12).value = value }
    
    var __init: UShort
        get() = memberAt<UShortVar>(14).value
        set(value) { memberAt<UShortVar>(14).value = value }
    
    var __a: ULong
        get() = memberAt<ULongVar>(16).value
        set(value) { memberAt<ULongVar>(16).value = value }
    
}

class tm(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var tm_sec: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var tm_min: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var tm_hour: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var tm_mday: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var tm_mon: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var tm_year: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var tm_wday: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var tm_yday: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var tm_isdst: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var tm_gmtoff: Long
        get() = memberAt<LongVar>(40).value
        set(value) { memberAt<LongVar>(40).value = value }
    
    var tm_zone: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(48).value
        set(value) { memberAt<CPointerVar<ByteVar>>(48).value = value }
    
}

class itimerspec(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    val it_interval: timespec
        get() = memberAt(0)
    
    val it_value: timespec
        get() = memberAt(16)
    
}


class __locale_struct(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(232, 8)
    
    val __locales: CArrayPointer<CPointerVar<__locale_data>>
        get() = arrayMemberAt(0)
    
    var __ctype_b: CPointer<UShortVar>?
        get() = memberAt<CPointerVar<UShortVar>>(104).value
        set(value) { memberAt<CPointerVar<UShortVar>>(104).value = value }
    
    var __ctype_tolower: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(112).value
        set(value) { memberAt<CPointerVar<IntVar>>(112).value = value }
    
    var __ctype_toupper: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(120).value
        set(value) { memberAt<CPointerVar<IntVar>>(120).value = value }
    
    val __names: CArrayPointer<CPointerVar<ByteVar>>
        get() = arrayMemberAt(128)
    
}






class CRYPTO_dynlock(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var dummy: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class crypto_threadid_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var dummy: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class sched_param(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var sched_priority: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class cpu_set_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    val __bits: CArrayPointer<__cpu_maskVar>
        get() = arrayMemberAt(0)
    
}

class _pthread_cleanup_buffer(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var __routine: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(0).value = value }
    
    var __arg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var __canceltype: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var __prev: CPointer<_pthread_cleanup_buffer>?
        get() = memberAt<CPointerVar<_pthread_cleanup_buffer>>(24).value
        set(value) { memberAt<CPointerVar<_pthread_cleanup_buffer>>(24).value = value }
    
}

class __pthread_unwind_buf_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(104, 8)
    
    val __cancel_jmp_buf: CArrayPointer<anonymousStruct4>
        get() = arrayMemberAt(0)
    
    val __pad: CArrayPointer<COpaquePointerVar>
        get() = arrayMemberAt(72)
    
}

class anonymousStruct4(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    val __cancel_jmp_buf: __jmp_buf
        get() = arrayMemberAt(0)
    
    var __mask_was_saved: Int
        get() = memberAt<IntVar>(64).value
        set(value) { memberAt<IntVar>(64).value = value }
    
}

class __pthread_cleanup_frame(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var __cancel_routine: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(0).value = value }
    
    var __cancel_arg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var __do_it: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var __cancel_type: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
}







class BIO_sock_info_u(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var addr: CPointer<BIO_ADDR>?
        get() = memberAt<CPointerVar<BIO_ADDR>>(0).value
        set(value) { memberAt<CPointerVar<BIO_ADDR>>(0).value = value }
    
}


class ASN1_ENCODING_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var enc: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(0).value
        set(value) { memberAt<CPointerVar<UByteVar>>(0).value = value }
    
    var len: Long
        get() = memberAt<LongVar>(8).value
        set(value) { memberAt<LongVar>(8).value = value }
    
    var modified: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
}

class asn1_string_table_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var nid: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var minsize: Long
        get() = memberAt<LongVar>(8).value
        set(value) { memberAt<LongVar>(8).value = value }
    
    var maxsize: Long
        get() = memberAt<LongVar>(16).value
        set(value) { memberAt<LongVar>(16).value = value }
    
    var mask: ULong
        get() = memberAt<ULongVar>(24).value
        set(value) { memberAt<ULongVar>(24).value = value }
    
    var flags: ULong
        get() = memberAt<ULongVar>(32).value
        set(value) { memberAt<ULongVar>(32).value = value }
    
}








class asn1_type_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var type: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val value: anonymousStruct5
        get() = memberAt(8)
    
}

class anonymousStruct5(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var ptr: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var boolean: ASN1_BOOLEAN
        get() = memberAt<ASN1_BOOLEANVar>(0).value
        set(value) { memberAt<ASN1_BOOLEANVar>(0).value = value }
    
    var asn1_string: CPointer<ASN1_STRING>?
        get() = memberAt<CPointerVar<ASN1_STRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_STRING>>(0).value = value }
    
    var `object`: CPointer<ASN1_OBJECT>?
        get() = memberAt<CPointerVar<ASN1_OBJECT>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_OBJECT>>(0).value = value }
    
    var integer: CPointer<ASN1_INTEGER>?
        get() = memberAt<CPointerVar<ASN1_INTEGER>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_INTEGER>>(0).value = value }
    
    var enumerated: CPointer<ASN1_ENUMERATED>?
        get() = memberAt<CPointerVar<ASN1_ENUMERATED>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_ENUMERATED>>(0).value = value }
    
    var bit_string: CPointer<ASN1_BIT_STRING>?
        get() = memberAt<CPointerVar<ASN1_BIT_STRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_BIT_STRING>>(0).value = value }
    
    var octet_string: CPointer<ASN1_OCTET_STRING>?
        get() = memberAt<CPointerVar<ASN1_OCTET_STRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_OCTET_STRING>>(0).value = value }
    
    var printablestring: CPointer<ASN1_PRINTABLESTRING>?
        get() = memberAt<CPointerVar<ASN1_PRINTABLESTRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_PRINTABLESTRING>>(0).value = value }
    
    var t61string: CPointer<ASN1_T61STRING>?
        get() = memberAt<CPointerVar<ASN1_T61STRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_T61STRING>>(0).value = value }
    
    var ia5string: CPointer<ASN1_IA5STRING>?
        get() = memberAt<CPointerVar<ASN1_IA5STRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_IA5STRING>>(0).value = value }
    
    var generalstring: CPointer<ASN1_GENERALSTRING>?
        get() = memberAt<CPointerVar<ASN1_GENERALSTRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_GENERALSTRING>>(0).value = value }
    
    var bmpstring: CPointer<ASN1_BMPSTRING>?
        get() = memberAt<CPointerVar<ASN1_BMPSTRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_BMPSTRING>>(0).value = value }
    
    var universalstring: CPointer<ASN1_UNIVERSALSTRING>?
        get() = memberAt<CPointerVar<ASN1_UNIVERSALSTRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_UNIVERSALSTRING>>(0).value = value }
    
    var utctime: CPointer<ASN1_UTCTIME>?
        get() = memberAt<CPointerVar<ASN1_UTCTIME>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_UTCTIME>>(0).value = value }
    
    var generalizedtime: CPointer<ASN1_GENERALIZEDTIME>?
        get() = memberAt<CPointerVar<ASN1_GENERALIZEDTIME>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_GENERALIZEDTIME>>(0).value = value }
    
    var visiblestring: CPointer<ASN1_VISIBLESTRING>?
        get() = memberAt<CPointerVar<ASN1_VISIBLESTRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_VISIBLESTRING>>(0).value = value }
    
    var utf8string: CPointer<ASN1_UTF8STRING>?
        get() = memberAt<CPointerVar<ASN1_UTF8STRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_UTF8STRING>>(0).value = value }
    
    var set: CPointer<ASN1_STRING>?
        get() = memberAt<CPointerVar<ASN1_STRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_STRING>>(0).value = value }
    
    var sequence: CPointer<ASN1_STRING>?
        get() = memberAt<CPointerVar<ASN1_STRING>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_STRING>>(0).value = value }
    
    var asn1_value: CPointer<ASN1_VALUE>?
        get() = memberAt<CPointerVar<ASN1_VALUE>>(0).value
        set(value) { memberAt<CPointerVar<ASN1_VALUE>>(0).value = value }
    
}


class BIT_STRING_BITNAME_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var bitnum: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var lname: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var sname: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
}


class obj_name_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var type: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var alias: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var data: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
}

class EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var out: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(0).value
        set(value) { memberAt<CPointerVar<UByteVar>>(0).value = value }
    
    var inp: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(8).value
        set(value) { memberAt<CPointerVar<UByteVar>>(8).value = value }
    
    var len: size_t
        get() = memberAt<size_tVar>(16).value
        set(value) { memberAt<size_tVar>(16).value = value }
    
    var interleave: UInt
        get() = memberAt<UIntVar>(24).value
        set(value) { memberAt<UIntVar>(24).value = value }
    
}

class evp_cipher_info_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var cipher: CPointer<EVP_CIPHER>?
        get() = memberAt<CPointerVar<EVP_CIPHER>>(0).value
        set(value) { memberAt<CPointerVar<EVP_CIPHER>>(0).value = value }
    
    val iv: CArrayPointer<UByteVar>
        get() = arrayMemberAt(8)
    
}



class lhash_st_OPENSSL_STRING(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    val dummy: lh_OPENSSL_STRING_dummy
        get() = memberAt(0)
    
}

class lh_OPENSSL_STRING_dummy(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var d1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var d2: ULong
        get() = memberAt<ULongVar>(0).value
        set(value) { memberAt<ULongVar>(0).value = value }
    
    var d3: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class lhash_st_OPENSSL_CSTRING(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    val dummy: lh_OPENSSL_CSTRING_dummy
        get() = memberAt(0)
    
}

class lh_OPENSSL_CSTRING_dummy(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var d1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var d2: ULong
        get() = memberAt<ULongVar>(0).value
        set(value) { memberAt<ULongVar>(0).value = value }
    
    var d3: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class err_state_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(584, 8)
    
    val err_flags: CArrayPointer<IntVar>
        get() = arrayMemberAt(0)
    
    val err_buffer: CArrayPointer<ULongVar>
        get() = arrayMemberAt(64)
    
    val err_data: CArrayPointer<CPointerVar<ByteVar>>
        get() = arrayMemberAt(192)
    
    val err_data_flags: CArrayPointer<IntVar>
        get() = arrayMemberAt(320)
    
    val err_file: CArrayPointer<CPointerVar<ByteVar>>
        get() = arrayMemberAt(384)
    
    val err_line: CArrayPointer<IntVar>
        get() = arrayMemberAt(512)
    
    var top: Int
        get() = memberAt<IntVar>(576).value
        set(value) { memberAt<IntVar>(576).value = value }
    
    var bottom: Int
        get() = memberAt<IntVar>(580).value
        set(value) { memberAt<IntVar>(580).value = value }
    
}

class ERR_string_data_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var error: ULong
        get() = memberAt<ULongVar>(0).value
        set(value) { memberAt<ULongVar>(0).value = value }
    
    var string: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
}

class lhash_st_ERR_STRING_DATA(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    val dummy: lh_ERR_STRING_DATA_dummy
        get() = memberAt(0)
    
}

class lh_ERR_STRING_DATA_dummy(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var d1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var d2: ULong
        get() = memberAt<ULongVar>(0).value
        set(value) { memberAt<ULongVar>(0).value = value }
    
    var d3: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class CONF_VALUE(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var section: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var value: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
}






class MD5state_st(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(92, 4)
    
    var A: UInt
        get() = memberAt<UIntVar>(0).value
        set(value) { memberAt<UIntVar>(0).value = value }
    
    var B: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var C: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
    var D: UInt
        get() = memberAt<UIntVar>(12).value
        set(value) { memberAt<UIntVar>(12).value = value }
    
    var Nl: UInt
        get() = memberAt<UIntVar>(16).value
        set(value) { memberAt<UIntVar>(16).value = value }
    
    var Nh: UInt
        get() = memberAt<UIntVar>(20).value
        set(value) { memberAt<UIntVar>(20).value = value }
    
    val data: CArrayPointer<UIntVar>
        get() = arrayMemberAt(24)
    
    var num: UInt
        get() = memberAt<UIntVar>(88).value
        set(value) { memberAt<UIntVar>(88).value = value }
    
}

enum class __codecvt_result(override val value: UInt) : CEnum {
    __codecvt_ok(0u),
    __codecvt_partial(1u),
    __codecvt_error(2u),
    __codecvt_noconv(3u),
    ;
    
    companion object {
        fun byValue(value: UInt) = __codecvt_result.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: __codecvt_result
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class idtype_t(override val value: UInt) : CEnum {
    P_ALL(0u),
    P_PID(1u),
    P_PGID(2u),
    ;
    
    companion object {
        fun byValue(value: UInt) = idtype_t.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: idtype_t
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}


// enum (anonymous at /usr/include/pthread.h:43:1):
val PTHREAD_MUTEX_TIMED_NP: UInt get() = 0u
val PTHREAD_MUTEX_RECURSIVE_NP: UInt get() = 1u
val PTHREAD_MUTEX_ERRORCHECK_NP: UInt get() = 2u
val PTHREAD_MUTEX_ADAPTIVE_NP: UInt get() = 3u
val PTHREAD_MUTEX_NORMAL: UInt get() = 0u
val PTHREAD_MUTEX_RECURSIVE: UInt get() = 1u
val PTHREAD_MUTEX_ERRORCHECK: UInt get() = 2u
val PTHREAD_MUTEX_DEFAULT: UInt get() = 0u

// enum (anonymous at /usr/include/pthread.h:65:1):
val PTHREAD_MUTEX_STALLED: UInt get() = 0u
val PTHREAD_MUTEX_STALLED_NP: UInt get() = 0u
val PTHREAD_MUTEX_ROBUST: UInt get() = 1u
val PTHREAD_MUTEX_ROBUST_NP: UInt get() = 1u

// enum (anonymous at /usr/include/pthread.h:77:1):
val PTHREAD_PRIO_NONE: UInt get() = 0u
val PTHREAD_PRIO_INHERIT: UInt get() = 1u
val PTHREAD_PRIO_PROTECT: UInt get() = 2u

// enum (anonymous at /usr/include/pthread.h:115:1):
val PTHREAD_RWLOCK_PREFER_READER_NP: UInt get() = 0u
val PTHREAD_RWLOCK_PREFER_WRITER_NP: UInt get() = 1u
val PTHREAD_RWLOCK_PREFER_WRITER_NONRECURSIVE_NP: UInt get() = 2u
val PTHREAD_RWLOCK_DEFAULT_NP: UInt get() = 0u






enum class BIO_hostserv_priorities(override val value: UInt) : CEnum {
    BIO_PARSE_PRIO_HOST(0u),
    BIO_PARSE_PRIO_SERV(1u),
    ;
    
    companion object {
        fun byValue(value: UInt) = BIO_hostserv_priorities.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: BIO_hostserv_priorities
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class BIO_lookup_type(override val value: UInt) : CEnum {
    BIO_LOOKUP_CLIENT(0u),
    BIO_LOOKUP_SERVER(1u),
    ;
    
    companion object {
        fun byValue(value: UInt) = BIO_lookup_type.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: BIO_lookup_type
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class BIO_sock_info_type(override val value: UInt) : CEnum {
    BIO_SOCK_INFO_ADDRESS(0u),
    ;
    
    companion object {
        fun byValue(value: UInt) = BIO_sock_info_type.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: BIO_sock_info_type
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

typealias __u_charVar = UByteVarOf<__u_char>
typealias __u_char = UByte

typealias __u_shortVar = UShortVarOf<__u_short>
typealias __u_short = UShort

typealias __u_intVar = UIntVarOf<__u_int>
typealias __u_int = UInt

typealias __u_longVar = ULongVarOf<__u_long>
typealias __u_long = ULong

typealias __int8_tVar = ByteVarOf<__int8_t>
typealias __int8_t = Byte

typealias __uint8_tVar = UByteVarOf<__uint8_t>
typealias __uint8_t = UByte

typealias __int16_tVar = ShortVarOf<__int16_t>
typealias __int16_t = Short

typealias __uint16_tVar = UShortVarOf<__uint16_t>
typealias __uint16_t = UShort

typealias __int32_tVar = IntVarOf<__int32_t>
typealias __int32_t = Int

typealias __uint32_tVar = UIntVarOf<__uint32_t>
typealias __uint32_t = UInt

typealias __int64_tVar = LongVarOf<__int64_t>
typealias __int64_t = Long

typealias __uint64_tVar = ULongVarOf<__uint64_t>
typealias __uint64_t = ULong

typealias __quad_tVar = LongVarOf<__quad_t>
typealias __quad_t = Long

typealias __u_quad_tVar = ULongVarOf<__u_quad_t>
typealias __u_quad_t = ULong

typealias __intmax_tVar = LongVarOf<__intmax_t>
typealias __intmax_t = Long

typealias __uintmax_tVar = ULongVarOf<__uintmax_t>
typealias __uintmax_t = ULong

typealias __dev_tVar = ULongVarOf<__dev_t>
typealias __dev_t = ULong

typealias __uid_tVar = UIntVarOf<__uid_t>
typealias __uid_t = UInt

typealias __gid_tVar = UIntVarOf<__gid_t>
typealias __gid_t = UInt

typealias __ino_tVar = ULongVarOf<__ino_t>
typealias __ino_t = ULong

typealias __ino64_tVar = ULongVarOf<__ino64_t>
typealias __ino64_t = ULong

typealias __mode_tVar = UIntVarOf<__mode_t>
typealias __mode_t = UInt

typealias __nlink_tVar = ULongVarOf<__nlink_t>
typealias __nlink_t = ULong

typealias __off_tVar = LongVarOf<__off_t>
typealias __off_t = Long

typealias __off64_tVar = LongVarOf<__off64_t>
typealias __off64_t = Long

typealias __pid_tVar = IntVarOf<__pid_t>
typealias __pid_t = Int

typealias __clock_tVar = LongVarOf<__clock_t>
typealias __clock_t = Long

typealias __rlim_tVar = ULongVarOf<__rlim_t>
typealias __rlim_t = ULong

typealias __rlim64_tVar = ULongVarOf<__rlim64_t>
typealias __rlim64_t = ULong

typealias __id_tVar = UIntVarOf<__id_t>
typealias __id_t = UInt

typealias __time_tVar = LongVarOf<__time_t>
typealias __time_t = Long

typealias __useconds_tVar = UIntVarOf<__useconds_t>
typealias __useconds_t = UInt

typealias __suseconds_tVar = LongVarOf<__suseconds_t>
typealias __suseconds_t = Long

typealias __daddr_tVar = IntVarOf<__daddr_t>
typealias __daddr_t = Int

typealias __key_tVar = IntVarOf<__key_t>
typealias __key_t = Int

typealias __clockid_tVar = IntVarOf<__clockid_t>
typealias __clockid_t = Int

typealias __timer_tVar = CPointerVarOf<__timer_t>
typealias __timer_t = COpaquePointer

typealias __blksize_tVar = LongVarOf<__blksize_t>
typealias __blksize_t = Long

typealias __blkcnt_tVar = LongVarOf<__blkcnt_t>
typealias __blkcnt_t = Long

typealias __blkcnt64_tVar = LongVarOf<__blkcnt64_t>
typealias __blkcnt64_t = Long

typealias __fsblkcnt_tVar = ULongVarOf<__fsblkcnt_t>
typealias __fsblkcnt_t = ULong

typealias __fsblkcnt64_tVar = ULongVarOf<__fsblkcnt64_t>
typealias __fsblkcnt64_t = ULong

typealias __fsfilcnt_tVar = ULongVarOf<__fsfilcnt_t>
typealias __fsfilcnt_t = ULong

typealias __fsfilcnt64_tVar = ULongVarOf<__fsfilcnt64_t>
typealias __fsfilcnt64_t = ULong

typealias __fsword_tVar = LongVarOf<__fsword_t>
typealias __fsword_t = Long

typealias __ssize_tVar = LongVarOf<__ssize_t>
typealias __ssize_t = Long

typealias __syscall_slong_tVar = LongVarOf<__syscall_slong_t>
typealias __syscall_slong_t = Long

typealias __syscall_ulong_tVar = ULongVarOf<__syscall_ulong_t>
typealias __syscall_ulong_t = ULong

typealias __loff_tVar = LongVarOf<__loff_t>
typealias __loff_t = __off64_t

typealias __caddr_tVar = CPointerVarOf<__caddr_t>
typealias __caddr_t = CPointer<ByteVar>

typealias __intptr_tVar = LongVarOf<__intptr_t>
typealias __intptr_t = Long

typealias __socklen_tVar = UIntVarOf<__socklen_t>
typealias __socklen_t = UInt

typealias __sig_atomic_tVar = IntVarOf<__sig_atomic_t>
typealias __sig_atomic_t = Int

typealias int8_tVar = ByteVarOf<int8_t>
typealias int8_t = __int8_t

typealias int16_tVar = ShortVarOf<int16_t>
typealias int16_t = __int16_t

typealias int32_tVar = IntVarOf<int32_t>
typealias int32_t = __int32_t

typealias int64_tVar = LongVarOf<int64_t>
typealias int64_t = __int64_t

typealias uint8_tVar = UByteVarOf<uint8_t>
typealias uint8_t = __uint8_t

typealias uint16_tVar = UShortVarOf<uint16_t>
typealias uint16_t = __uint16_t

typealias uint32_tVar = UIntVarOf<uint32_t>
typealias uint32_t = __uint32_t

typealias uint64_tVar = ULongVarOf<uint64_t>
typealias uint64_t = __uint64_t

typealias int_least8_tVar = ByteVarOf<int_least8_t>
typealias int_least8_t = Byte

typealias int_least16_tVar = ShortVarOf<int_least16_t>
typealias int_least16_t = Short

typealias int_least32_tVar = IntVarOf<int_least32_t>
typealias int_least32_t = Int

typealias int_least64_tVar = LongVarOf<int_least64_t>
typealias int_least64_t = Long

typealias uint_least8_tVar = UByteVarOf<uint_least8_t>
typealias uint_least8_t = UByte

typealias uint_least16_tVar = UShortVarOf<uint_least16_t>
typealias uint_least16_t = UShort

typealias uint_least32_tVar = UIntVarOf<uint_least32_t>
typealias uint_least32_t = UInt

typealias uint_least64_tVar = ULongVarOf<uint_least64_t>
typealias uint_least64_t = ULong

typealias int_fast8_tVar = ByteVarOf<int_fast8_t>
typealias int_fast8_t = Byte

typealias int_fast16_tVar = LongVarOf<int_fast16_t>
typealias int_fast16_t = Long

typealias int_fast32_tVar = LongVarOf<int_fast32_t>
typealias int_fast32_t = Long

typealias int_fast64_tVar = LongVarOf<int_fast64_t>
typealias int_fast64_t = Long

typealias uint_fast8_tVar = UByteVarOf<uint_fast8_t>
typealias uint_fast8_t = UByte

typealias uint_fast16_tVar = ULongVarOf<uint_fast16_t>
typealias uint_fast16_t = ULong

typealias uint_fast32_tVar = ULongVarOf<uint_fast32_t>
typealias uint_fast32_t = ULong

typealias uint_fast64_tVar = ULongVarOf<uint_fast64_t>
typealias uint_fast64_t = ULong

typealias intptr_tVar = LongVarOf<intptr_t>
typealias intptr_t = Long

typealias uintptr_tVar = ULongVarOf<uintptr_t>
typealias uintptr_t = ULong

typealias intmax_tVar = LongVarOf<intmax_t>
typealias intmax_t = __intmax_t

typealias uintmax_tVar = ULongVarOf<uintmax_t>
typealias uintmax_t = __uintmax_t

typealias __gwchar_tVar = IntVarOf<__gwchar_t>
typealias __gwchar_t = Int

typealias ASN1_INTEGER = asn1_string_st

typealias ASN1_ENUMERATED = asn1_string_st

typealias ASN1_BIT_STRING = asn1_string_st

typealias ASN1_OCTET_STRING = asn1_string_st

typealias ASN1_PRINTABLESTRING = asn1_string_st

typealias ASN1_T61STRING = asn1_string_st

typealias ASN1_IA5STRING = asn1_string_st

typealias ASN1_GENERALSTRING = asn1_string_st

typealias ASN1_UNIVERSALSTRING = asn1_string_st

typealias ASN1_BMPSTRING = asn1_string_st

typealias ASN1_UTCTIME = asn1_string_st

typealias ASN1_TIME = asn1_string_st

typealias ASN1_GENERALIZEDTIME = asn1_string_st

typealias ASN1_VISIBLESTRING = asn1_string_st

typealias ASN1_UTF8STRING = asn1_string_st

typealias ASN1_STRING = asn1_string_st

typealias ASN1_BOOLEANVar = IntVarOf<ASN1_BOOLEAN>
typealias ASN1_BOOLEAN = Int

typealias ASN1_NULLVar = IntVarOf<ASN1_NULL>
typealias ASN1_NULL = Int

typealias ASN1_OBJECT = asn1_object_st

typealias ASN1_ITEM = ASN1_ITEM_st

typealias ASN1_PCTX = asn1_pctx_st

typealias ASN1_SCTX = asn1_sctx_st

typealias BIO = bio_st

typealias BIGNUM = bignum_st

typealias BN_CTX = bignum_ctx

typealias BN_BLINDING = bn_blinding_st

typealias BN_MONT_CTX = bn_mont_ctx_st

typealias BN_RECP_CTX = bn_recp_ctx_st

typealias BN_GENCB = bn_gencb_st

typealias BUF_MEM = buf_mem_st

typealias EVP_CIPHER = evp_cipher_st

typealias EVP_CIPHER_CTX = evp_cipher_ctx_st

typealias EVP_MD = evp_md_st

typealias EVP_MD_CTX = evp_md_ctx_st

typealias EVP_PKEY = evp_pkey_st

typealias EVP_PKEY_ASN1_METHOD = evp_pkey_asn1_method_st

typealias EVP_PKEY_METHOD = evp_pkey_method_st

typealias EVP_PKEY_CTX = evp_pkey_ctx_st

typealias EVP_ENCODE_CTX = evp_Encode_Ctx_st

typealias HMAC_CTX = hmac_ctx_st

typealias DH = dh_st

typealias DH_METHOD = dh_method

typealias DSA = dsa_st

typealias DSA_METHOD = dsa_method

typealias RSA = rsa_st

typealias RSA_METHOD = rsa_meth_st

typealias EC_KEY = ec_key_st

typealias EC_KEY_METHOD = ec_key_method_st

typealias RAND_METHOD = rand_meth_st

typealias SSL_DANE = ssl_dane_st

typealias X509 = x509_st

typealias X509_ALGOR = X509_algor_st

typealias X509_CRL = X509_crl_st

typealias X509_CRL_METHOD = x509_crl_method_st

typealias X509_REVOKED = x509_revoked_st

typealias X509_NAME = X509_name_st

typealias X509_PUBKEY = X509_pubkey_st

typealias X509_STORE = x509_store_st

typealias X509_STORE_CTX = x509_store_ctx_st

typealias X509_OBJECT = x509_object_st

typealias X509_LOOKUP = x509_lookup_st

typealias X509_LOOKUP_METHOD = x509_lookup_method_st

typealias X509_VERIFY_PARAM = X509_VERIFY_PARAM_st

typealias PKCS8_PRIV_KEY_INFO = pkcs8_priv_key_info_st

typealias X509V3_CTX = v3_ext_ctx

typealias CONF = conf_st

typealias CONF_METHOD = conf_method_st

typealias OPENSSL_INIT_SETTINGS = ossl_init_settings_st

typealias UI = ui_st

typealias UI_METHOD = ui_method_st

typealias ENGINE = engine_st

typealias SSL = ssl_st

typealias SSL_CTX = ssl_ctx_st

typealias COMP_CTX = comp_ctx_st

typealias COMP_METHOD = comp_method_st

typealias X509_POLICY_NODE = X509_POLICY_NODE_st

typealias X509_POLICY_LEVEL = X509_POLICY_LEVEL_st

typealias X509_POLICY_TREE = X509_POLICY_TREE_st

typealias X509_POLICY_CACHE = X509_POLICY_CACHE_st

typealias AUTHORITY_KEYID = AUTHORITY_KEYID_st

typealias DIST_POINT = DIST_POINT_st

typealias ISSUING_DIST_POINT = ISSUING_DIST_POINT_st

typealias NAME_CONSTRAINTS = NAME_CONSTRAINTS_st

typealias CRYPTO_EX_DATA = crypto_ex_data_st

typealias OCSP_REQ_CTX = ocsp_req_ctx_st

typealias OCSP_RESPONSE = ocsp_response_st

typealias OCSP_RESPID = ocsp_responder_id_st

typealias SCT = sct_st

typealias SCT_CTX = sct_ctx_st

typealias CTLOG = ctlog_st

typealias CTLOG_STORE = ctlog_store_st

typealias CT_POLICY_EVAL_CTX = ct_policy_eval_ctx_st

typealias ossl_intmax_tVar = LongVarOf<ossl_intmax_t>
typealias ossl_intmax_t = intmax_t

typealias ossl_uintmax_tVar = ULongVarOf<ossl_uintmax_t>
typealias ossl_uintmax_t = uintmax_t

typealias __FILE = _IO_FILE

typealias FILE = _IO_FILE

typealias __io_read_fn = CFunction<(COpaquePointer?, CPointer<ByteVar>?, size_t) -> __ssize_t>

typealias __io_write_fn = CFunction<(COpaquePointer?, CPointer<ByteVar>?, size_t) -> __ssize_t>

typealias __io_seek_fn = CFunction<(COpaquePointer?, CPointer<__off64_tVar>?, Int) -> Int>

typealias __io_close_fn = CFunction<(COpaquePointer?) -> Int>

typealias va_listVar = CPointerVarOf<va_list>
typealias va_list = __gnuc_va_list

typealias off_tVar = LongVarOf<off_t>
typealias off_t = __off_t

typealias ssize_tVar = LongVarOf<ssize_t>
typealias ssize_t = __ssize_t

typealias fpos_t = _G_fpos_t

typealias _Float32Var = FloatVarOf<_Float32>
typealias _Float32 = Float

typealias _Float64Var = DoubleVarOf<_Float64>
typealias _Float64 = Double

typealias _Float32xVar = DoubleVarOf<_Float32x>
typealias _Float32x = Double

typealias u_charVar = UByteVarOf<u_char>
typealias u_char = __u_char

typealias u_shortVar = UShortVarOf<u_short>
typealias u_short = __u_short

typealias u_intVar = UIntVarOf<u_int>
typealias u_int = __u_int

typealias u_longVar = ULongVarOf<u_long>
typealias u_long = __u_long

typealias quad_tVar = LongVarOf<quad_t>
typealias quad_t = __quad_t

typealias u_quad_tVar = ULongVarOf<u_quad_t>
typealias u_quad_t = __u_quad_t

typealias fsid_t = __fsid_t

typealias loff_tVar = LongVarOf<loff_t>
typealias loff_t = __loff_t

typealias ino_tVar = ULongVarOf<ino_t>
typealias ino_t = __ino_t

typealias dev_tVar = ULongVarOf<dev_t>
typealias dev_t = __dev_t

typealias gid_tVar = UIntVarOf<gid_t>
typealias gid_t = __gid_t

typealias mode_tVar = UIntVarOf<mode_t>
typealias mode_t = __mode_t

typealias nlink_tVar = ULongVarOf<nlink_t>
typealias nlink_t = __nlink_t

typealias uid_tVar = UIntVarOf<uid_t>
typealias uid_t = __uid_t

typealias pid_tVar = IntVarOf<pid_t>
typealias pid_t = __pid_t

typealias id_tVar = UIntVarOf<id_t>
typealias id_t = __id_t

typealias daddr_tVar = IntVarOf<daddr_t>
typealias daddr_t = __daddr_t

typealias caddr_tVar = CPointerVarOf<caddr_t>
typealias caddr_t = __caddr_t

typealias key_tVar = IntVarOf<key_t>
typealias key_t = __key_t

typealias clock_tVar = LongVarOf<clock_t>
typealias clock_t = __clock_t

typealias clockid_tVar = IntVarOf<clockid_t>
typealias clockid_t = __clockid_t

typealias time_tVar = LongVarOf<time_t>
typealias time_t = __time_t

typealias timer_tVar = CPointerVarOf<timer_t>
typealias timer_t = __timer_t

typealias ulongVar = ULongVarOf<ulong>
typealias ulong = ULong

typealias ushortVar = UShortVarOf<ushort>
typealias ushort = UShort

typealias uintVar = UIntVarOf<uint>
typealias uint = UInt

typealias u_int8_tVar = UByteVarOf<u_int8_t>
typealias u_int8_t = UByte

typealias u_int16_tVar = UShortVarOf<u_int16_t>
typealias u_int16_t = UShort

typealias u_int32_tVar = UIntVarOf<u_int32_t>
typealias u_int32_t = UInt

typealias u_int64_tVar = ULongVarOf<u_int64_t>
typealias u_int64_t = ULong

typealias register_tVar = LongVarOf<register_t>
typealias register_t = Long

typealias sigset_t = __sigset_t

typealias suseconds_tVar = LongVarOf<suseconds_t>
typealias suseconds_t = __suseconds_t

typealias __fd_maskVar = LongVarOf<__fd_mask>
typealias __fd_mask = Long

typealias fd_maskVar = LongVarOf<fd_mask>
typealias fd_mask = __fd_mask

typealias blksize_tVar = LongVarOf<blksize_t>
typealias blksize_t = __blksize_t

typealias blkcnt_tVar = LongVarOf<blkcnt_t>
typealias blkcnt_t = __blkcnt_t

typealias fsblkcnt_tVar = ULongVarOf<fsblkcnt_t>
typealias fsblkcnt_t = __fsblkcnt_t

typealias fsfilcnt_tVar = ULongVarOf<fsfilcnt_t>
typealias fsfilcnt_t = __fsfilcnt_t

typealias __pthread_list_t = __pthread_internal_list

typealias pthread_tVar = ULongVarOf<pthread_t>
typealias pthread_t = ULong

typealias pthread_key_tVar = UIntVarOf<pthread_key_t>
typealias pthread_key_t = UInt

typealias pthread_once_tVar = IntVarOf<pthread_once_t>
typealias pthread_once_t = Int

typealias pthread_spinlock_tVar = IntVarOf<pthread_spinlock_t>
typealias pthread_spinlock_t = Int

typealias __compar_fn_tVar = CPointerVarOf<__compar_fn_t>
typealias __compar_fn_t = CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>

typealias __locale_tVar = CPointerVarOf<__locale_t>
typealias __locale_t = CPointer<__locale_struct>

typealias locale_tVar = CPointerVarOf<locale_t>
typealias locale_t = __locale_t

typealias OPENSSL_STACK = stack_st

typealias OPENSSL_sk_compfuncVar = CPointerVarOf<OPENSSL_sk_compfunc>
typealias OPENSSL_sk_compfunc = CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>

typealias OPENSSL_sk_freefuncVar = CPointerVarOf<OPENSSL_sk_freefunc>
typealias OPENSSL_sk_freefunc = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias OPENSSL_sk_copyfuncVar = CPointerVarOf<OPENSSL_sk_copyfunc>
typealias OPENSSL_sk_copyfunc = CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>

typealias OPENSSL_STRINGVar = CPointerVarOf<OPENSSL_STRING>
typealias OPENSSL_STRING = CPointer<ByteVar>

typealias OPENSSL_CSTRINGVar = CPointerVarOf<OPENSSL_CSTRING>
typealias OPENSSL_CSTRING = CPointer<ByteVar>

typealias sk_OPENSSL_STRING_compfuncVar = CPointerVarOf<sk_OPENSSL_STRING_compfunc>
typealias sk_OPENSSL_STRING_compfunc = CPointer<CFunction<(CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>

typealias sk_OPENSSL_STRING_freefuncVar = CPointerVarOf<sk_OPENSSL_STRING_freefunc>
typealias sk_OPENSSL_STRING_freefunc = CPointer<CFunction<(CPointer<ByteVar>?) -> Unit>>

typealias sk_OPENSSL_STRING_copyfuncVar = CPointerVarOf<sk_OPENSSL_STRING_copyfunc>
typealias sk_OPENSSL_STRING_copyfunc = CPointer<CFunction<(CPointer<ByteVar>?) -> CPointer<ByteVar>?>>

typealias sk_OPENSSL_CSTRING_compfuncVar = CPointerVarOf<sk_OPENSSL_CSTRING_compfunc>
typealias sk_OPENSSL_CSTRING_compfunc = CPointer<CFunction<(CPointer<CPointerVar<ByteVar>>?, CPointer<CPointerVar<ByteVar>>?) -> Int>>

typealias sk_OPENSSL_CSTRING_freefuncVar = CPointerVarOf<sk_OPENSSL_CSTRING_freefunc>
typealias sk_OPENSSL_CSTRING_freefunc = CPointer<CFunction<(CPointer<ByteVar>?) -> Unit>>

typealias sk_OPENSSL_CSTRING_copyfuncVar = CPointerVarOf<sk_OPENSSL_CSTRING_copyfunc>
typealias sk_OPENSSL_CSTRING_copyfunc = CPointer<CFunction<(CPointer<ByteVar>?) -> CPointer<ByteVar>?>>

typealias OPENSSL_BLOCKVar = CPointerVarOf<OPENSSL_BLOCK>
typealias OPENSSL_BLOCK = COpaquePointer

typealias sk_OPENSSL_BLOCK_compfuncVar = CPointerVarOf<sk_OPENSSL_BLOCK_compfunc>
typealias sk_OPENSSL_BLOCK_compfunc = CPointer<CFunction<(CPointer<COpaquePointerVar>?, CPointer<COpaquePointerVar>?) -> Int>>

typealias sk_OPENSSL_BLOCK_freefuncVar = CPointerVarOf<sk_OPENSSL_BLOCK_freefunc>
typealias sk_OPENSSL_BLOCK_freefunc = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias sk_OPENSSL_BLOCK_copyfuncVar = CPointerVarOf<sk_OPENSSL_BLOCK_copyfunc>
typealias sk_OPENSSL_BLOCK_copyfunc = CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>

typealias sk_void_compfuncVar = CPointerVarOf<sk_void_compfunc>
typealias sk_void_compfunc = CPointer<CFunction<(CPointer<COpaquePointerVar>?, CPointer<COpaquePointerVar>?) -> Int>>

typealias sk_void_freefuncVar = CPointerVarOf<sk_void_freefunc>
typealias sk_void_freefunc = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias sk_void_copyfuncVar = CPointerVarOf<sk_void_copyfunc>
typealias sk_void_copyfunc = CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>

typealias CRYPTO_EX_new = CFunction<(COpaquePointer?, COpaquePointer?, CPointer<CRYPTO_EX_DATA>?, Int, Long, COpaquePointer?) -> Unit>

typealias CRYPTO_EX_free = CFunction<(COpaquePointer?, COpaquePointer?, CPointer<CRYPTO_EX_DATA>?, Int, Long, COpaquePointer?) -> Unit>

typealias CRYPTO_EX_dup = CFunction<(CPointer<CRYPTO_EX_DATA>?, CPointer<CRYPTO_EX_DATA>?, COpaquePointer?, Int, Long, COpaquePointer?) -> Int>

typealias CRYPTO_THREADID = crypto_threadid_st

typealias __cpu_maskVar = ULongVarOf<__cpu_mask>
typealias __cpu_mask = ULong

typealias __jmp_bufVar = CPointerVarOf<__jmp_buf>
typealias __jmp_buf = CArrayPointer<LongVar>

typealias CRYPTO_ONCEVar = IntVarOf<CRYPTO_ONCE>
typealias CRYPTO_ONCE = pthread_once_t

typealias CRYPTO_THREAD_LOCALVar = UIntVarOf<CRYPTO_THREAD_LOCAL>
typealias CRYPTO_THREAD_LOCAL = pthread_key_t

typealias CRYPTO_THREAD_IDVar = ULongVarOf<CRYPTO_THREAD_ID>
typealias CRYPTO_THREAD_ID = pthread_t

typealias BIO_ADDR = bio_addr_st

typealias BIO_ADDRINFO = bio_addrinfo_st

typealias BIO_callback_fnVar = CPointerVarOf<BIO_callback_fn>
typealias BIO_callback_fn = CPointer<CFunction<(CPointer<BIO>?, Int, CPointer<ByteVar>?, Int, Long, Long) -> Long>>

typealias BIO_METHOD = bio_method_st

typealias bio_info_cb = CFunction<(CPointer<BIO>?, Int, CPointer<ByteVar>?, Int, Long, Long) -> Unit>

typealias sk_BIO_compfuncVar = CPointerVarOf<sk_BIO_compfunc>
typealias sk_BIO_compfunc = CPointer<CFunction<(CPointer<CPointerVar<BIO>>?, CPointer<CPointerVar<BIO>>?) -> Int>>

typealias sk_BIO_freefuncVar = CPointerVarOf<sk_BIO_freefunc>
typealias sk_BIO_freefunc = CPointer<CFunction<(CPointer<BIO>?) -> Unit>>

typealias sk_BIO_copyfuncVar = CPointerVarOf<sk_BIO_copyfunc>
typealias sk_BIO_copyfunc = CPointer<CFunction<(CPointer<BIO>?) -> CPointer<BIO>?>>

typealias asn1_ps_func = CFunction<(CPointer<BIO>?, CPointer<CPointerVar<UByteVar>>?, CPointer<IntVar>?, COpaquePointer?) -> Int>

typealias sk_X509_ALGOR_compfuncVar = CPointerVarOf<sk_X509_ALGOR_compfunc>
typealias sk_X509_ALGOR_compfunc = CPointer<CFunction<(CPointer<CPointerVar<X509_ALGOR>>?, CPointer<CPointerVar<X509_ALGOR>>?) -> Int>>

typealias sk_X509_ALGOR_freefuncVar = CPointerVarOf<sk_X509_ALGOR_freefunc>
typealias sk_X509_ALGOR_freefunc = CPointer<CFunction<(CPointer<X509_ALGOR>?) -> Unit>>

typealias sk_X509_ALGOR_copyfuncVar = CPointerVarOf<sk_X509_ALGOR_copyfunc>
typealias sk_X509_ALGOR_copyfunc = CPointer<CFunction<(CPointer<X509_ALGOR>?) -> CPointer<X509_ALGOR>?>>

typealias ASN1_ENCODING = ASN1_ENCODING_st

typealias ASN1_STRING_TABLE = asn1_string_table_st

typealias sk_ASN1_STRING_TABLE_compfuncVar = CPointerVarOf<sk_ASN1_STRING_TABLE_compfunc>
typealias sk_ASN1_STRING_TABLE_compfunc = CPointer<CFunction<(CPointer<CPointerVar<ASN1_STRING_TABLE>>?, CPointer<CPointerVar<ASN1_STRING_TABLE>>?) -> Int>>

typealias sk_ASN1_STRING_TABLE_freefuncVar = CPointerVarOf<sk_ASN1_STRING_TABLE_freefunc>
typealias sk_ASN1_STRING_TABLE_freefunc = CPointer<CFunction<(CPointer<ASN1_STRING_TABLE>?) -> Unit>>

typealias sk_ASN1_STRING_TABLE_copyfuncVar = CPointerVarOf<sk_ASN1_STRING_TABLE_copyfunc>
typealias sk_ASN1_STRING_TABLE_copyfunc = CPointer<CFunction<(CPointer<ASN1_STRING_TABLE>?) -> CPointer<ASN1_STRING_TABLE>?>>

typealias ASN1_TEMPLATE = ASN1_TEMPLATE_st

typealias ASN1_TLC = ASN1_TLC_st

typealias ASN1_VALUE = ASN1_VALUE_st

typealias d2i_of_void = CFunction<(CPointer<COpaquePointerVar>?, CPointer<CPointerVar<UByteVar>>?, Long) -> COpaquePointer?>

typealias i2d_of_void = CFunction<(COpaquePointer?, CPointer<CPointerVar<UByteVar>>?) -> Int>

typealias ASN1_ITEM_EXP = ASN1_ITEM

typealias sk_ASN1_INTEGER_compfuncVar = CPointerVarOf<sk_ASN1_INTEGER_compfunc>
typealias sk_ASN1_INTEGER_compfunc = CPointer<CFunction<(CPointer<CPointerVar<ASN1_INTEGER>>?, CPointer<CPointerVar<ASN1_INTEGER>>?) -> Int>>

typealias sk_ASN1_INTEGER_freefuncVar = CPointerVarOf<sk_ASN1_INTEGER_freefunc>
typealias sk_ASN1_INTEGER_freefunc = CPointer<CFunction<(CPointer<ASN1_INTEGER>?) -> Unit>>

typealias sk_ASN1_INTEGER_copyfuncVar = CPointerVarOf<sk_ASN1_INTEGER_copyfunc>
typealias sk_ASN1_INTEGER_copyfunc = CPointer<CFunction<(CPointer<ASN1_INTEGER>?) -> CPointer<ASN1_INTEGER>?>>

typealias sk_ASN1_GENERALSTRING_compfuncVar = CPointerVarOf<sk_ASN1_GENERALSTRING_compfunc>
typealias sk_ASN1_GENERALSTRING_compfunc = CPointer<CFunction<(CPointer<CPointerVar<ASN1_GENERALSTRING>>?, CPointer<CPointerVar<ASN1_GENERALSTRING>>?) -> Int>>

typealias sk_ASN1_GENERALSTRING_freefuncVar = CPointerVarOf<sk_ASN1_GENERALSTRING_freefunc>
typealias sk_ASN1_GENERALSTRING_freefunc = CPointer<CFunction<(CPointer<ASN1_GENERALSTRING>?) -> Unit>>

typealias sk_ASN1_GENERALSTRING_copyfuncVar = CPointerVarOf<sk_ASN1_GENERALSTRING_copyfunc>
typealias sk_ASN1_GENERALSTRING_copyfunc = CPointer<CFunction<(CPointer<ASN1_GENERALSTRING>?) -> CPointer<ASN1_GENERALSTRING>?>>

typealias sk_ASN1_UTF8STRING_compfuncVar = CPointerVarOf<sk_ASN1_UTF8STRING_compfunc>
typealias sk_ASN1_UTF8STRING_compfunc = CPointer<CFunction<(CPointer<CPointerVar<ASN1_UTF8STRING>>?, CPointer<CPointerVar<ASN1_UTF8STRING>>?) -> Int>>

typealias sk_ASN1_UTF8STRING_freefuncVar = CPointerVarOf<sk_ASN1_UTF8STRING_freefunc>
typealias sk_ASN1_UTF8STRING_freefunc = CPointer<CFunction<(CPointer<ASN1_UTF8STRING>?) -> Unit>>

typealias sk_ASN1_UTF8STRING_copyfuncVar = CPointerVarOf<sk_ASN1_UTF8STRING_copyfunc>
typealias sk_ASN1_UTF8STRING_copyfunc = CPointer<CFunction<(CPointer<ASN1_UTF8STRING>?) -> CPointer<ASN1_UTF8STRING>?>>

typealias ASN1_TYPE = asn1_type_st

typealias sk_ASN1_TYPE_compfuncVar = CPointerVarOf<sk_ASN1_TYPE_compfunc>
typealias sk_ASN1_TYPE_compfunc = CPointer<CFunction<(CPointer<CPointerVar<ASN1_TYPE>>?, CPointer<CPointerVar<ASN1_TYPE>>?) -> Int>>

typealias sk_ASN1_TYPE_freefuncVar = CPointerVarOf<sk_ASN1_TYPE_freefunc>
typealias sk_ASN1_TYPE_freefunc = CPointer<CFunction<(CPointer<ASN1_TYPE>?) -> Unit>>

typealias sk_ASN1_TYPE_copyfuncVar = CPointerVarOf<sk_ASN1_TYPE_copyfunc>
typealias sk_ASN1_TYPE_copyfunc = CPointer<CFunction<(CPointer<ASN1_TYPE>?) -> CPointer<ASN1_TYPE>?>>

typealias ASN1_SEQUENCE_ANY = stack_st_ASN1_TYPE

typealias BIT_STRING_BITNAME = BIT_STRING_BITNAME_st

typealias sk_ASN1_OBJECT_compfuncVar = CPointerVarOf<sk_ASN1_OBJECT_compfunc>
typealias sk_ASN1_OBJECT_compfunc = CPointer<CFunction<(CPointer<CPointerVar<ASN1_OBJECT>>?, CPointer<CPointerVar<ASN1_OBJECT>>?) -> Int>>

typealias sk_ASN1_OBJECT_freefuncVar = CPointerVarOf<sk_ASN1_OBJECT_freefunc>
typealias sk_ASN1_OBJECT_freefunc = CPointer<CFunction<(CPointer<ASN1_OBJECT>?) -> Unit>>

typealias sk_ASN1_OBJECT_copyfuncVar = CPointerVarOf<sk_ASN1_OBJECT_copyfunc>
typealias sk_ASN1_OBJECT_copyfunc = CPointer<CFunction<(CPointer<ASN1_OBJECT>?) -> CPointer<ASN1_OBJECT>?>>

typealias OBJ_NAME = obj_name_st

typealias EVP_CIPHER_INFO = evp_cipher_info_st

typealias EVP_PBE_KEYGEN = CFunction<(CPointer<EVP_CIPHER_CTX>?, CPointer<ByteVar>?, Int, CPointer<ASN1_TYPE>?, CPointer<EVP_CIPHER>?, CPointer<EVP_MD>?, Int) -> Int>

typealias EVP_PKEY_gen_cb = CFunction<(CPointer<EVP_PKEY_CTX>?) -> Int>

typealias OPENSSL_LH_NODE = lhash_node_st

typealias OPENSSL_LH_COMPFUNCVar = CPointerVarOf<OPENSSL_LH_COMPFUNC>
typealias OPENSSL_LH_COMPFUNC = CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>

typealias OPENSSL_LH_HASHFUNCVar = CPointerVarOf<OPENSSL_LH_HASHFUNC>
typealias OPENSSL_LH_HASHFUNC = CPointer<CFunction<(COpaquePointer?) -> ULong>>

typealias OPENSSL_LH_DOALL_FUNCVar = CPointerVarOf<OPENSSL_LH_DOALL_FUNC>
typealias OPENSSL_LH_DOALL_FUNC = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias OPENSSL_LH_DOALL_FUNCARGVar = CPointerVarOf<OPENSSL_LH_DOALL_FUNCARG>
typealias OPENSSL_LH_DOALL_FUNCARG = CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>>

typealias OPENSSL_LHASH = lhash_st

typealias ERR_STATE = err_state_st

typealias ERR_STRING_DATA = ERR_string_data_st

typealias sk_CONF_VALUE_compfuncVar = CPointerVarOf<sk_CONF_VALUE_compfunc>
typealias sk_CONF_VALUE_compfunc = CPointer<CFunction<(CPointer<CPointerVar<CONF_VALUE>>?, CPointer<CPointerVar<CONF_VALUE>>?) -> Int>>

typealias sk_CONF_VALUE_freefuncVar = CPointerVarOf<sk_CONF_VALUE_freefunc>
typealias sk_CONF_VALUE_freefunc = CPointer<CFunction<(CPointer<CONF_VALUE>?) -> Unit>>

typealias sk_CONF_VALUE_copyfuncVar = CPointerVarOf<sk_CONF_VALUE_copyfunc>
typealias sk_CONF_VALUE_copyfunc = CPointer<CFunction<(CPointer<CONF_VALUE>?) -> CPointer<CONF_VALUE>?>>

typealias CONF_IMODULE = conf_imodule_st

typealias CONF_MODULE = conf_module_st

typealias sk_CONF_MODULE_compfuncVar = CPointerVarOf<sk_CONF_MODULE_compfunc>
typealias sk_CONF_MODULE_compfunc = CPointer<CFunction<(CPointer<CPointerVar<CONF_MODULE>>?, CPointer<CPointerVar<CONF_MODULE>>?) -> Int>>

typealias sk_CONF_MODULE_freefuncVar = CPointerVarOf<sk_CONF_MODULE_freefunc>
typealias sk_CONF_MODULE_freefunc = CPointer<CFunction<(CPointer<CONF_MODULE>?) -> Unit>>

typealias sk_CONF_MODULE_copyfuncVar = CPointerVarOf<sk_CONF_MODULE_copyfunc>
typealias sk_CONF_MODULE_copyfunc = CPointer<CFunction<(CPointer<CONF_MODULE>?) -> CPointer<CONF_MODULE>?>>

typealias sk_CONF_IMODULE_compfuncVar = CPointerVarOf<sk_CONF_IMODULE_compfunc>
typealias sk_CONF_IMODULE_compfunc = CPointer<CFunction<(CPointer<CPointerVar<CONF_IMODULE>>?, CPointer<CPointerVar<CONF_IMODULE>>?) -> Int>>

typealias sk_CONF_IMODULE_freefuncVar = CPointerVarOf<sk_CONF_IMODULE_freefunc>
typealias sk_CONF_IMODULE_freefunc = CPointer<CFunction<(CPointer<CONF_IMODULE>?) -> Unit>>

typealias sk_CONF_IMODULE_copyfuncVar = CPointerVarOf<sk_CONF_IMODULE_copyfunc>
typealias sk_CONF_IMODULE_copyfunc = CPointer<CFunction<(CPointer<CONF_IMODULE>?) -> CPointer<CONF_IMODULE>?>>

typealias conf_init_func = CFunction<(CPointer<CONF_IMODULE>?, CPointer<CONF>?) -> Int>

typealias conf_finish_func = CFunction<(CPointer<CONF_IMODULE>?) -> Unit>

typealias MD5_CTX = MD5state_st

@SymbolName("openssl_kniBridge0")
private external fun kniBridge0(p0: Long): Long
@SymbolName("openssl_kniBridge1")
private external fun kniBridge1(p0: Long, p1: Long, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge2")
private external fun kniBridge2(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("openssl_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: NativePtr, p2: Int): ULong
@SymbolName("openssl_kniBridge4")
private external fun kniBridge4(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("openssl_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: NativePtr, p2: Int): ULong
@SymbolName("openssl_kniBridge6")
private external fun kniBridge6(p0: NativePtr): Int
@SymbolName("openssl_kniBridge7")
private external fun kniBridge7(p0: NativePtr): Int
@SymbolName("openssl_kniBridge8")
private external fun kniBridge8(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge9")
private external fun kniBridge9(p0: NativePtr): Int
@SymbolName("openssl_kniBridge10")
private external fun kniBridge10(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge11")
private external fun kniBridge11(p0: NativePtr): Int
@SymbolName("openssl_kniBridge12")
private external fun kniBridge12(p0: NativePtr): Int
@SymbolName("openssl_kniBridge13")
private external fun kniBridge13(p0: NativePtr): Int
@SymbolName("openssl_kniBridge14")
private external fun kniBridge14(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge15")
private external fun kniBridge15(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge17")
private external fun kniBridge17(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge18")
private external fun kniBridge18(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge19")
private external fun kniBridge19(p0: NativePtr, p1: Int, p2: Long): Long
@SymbolName("openssl_kniBridge20")
private external fun kniBridge20(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("openssl_kniBridge21")
private external fun kniBridge21(p0: NativePtr, p1: Long, p2: Int, p3: Int): Long
@SymbolName("openssl_kniBridge22")
private external fun kniBridge22(p0: NativePtr, p1: Long, p2: Int): Long
@SymbolName("openssl_kniBridge23")
private external fun kniBridge23(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge24")
private external fun kniBridge24(p0: NativePtr): Int
@SymbolName("openssl_kniBridge25")
private external fun kniBridge25(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge26")
private external fun kniBridge26(p0: Int, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge27")
private external fun kniBridge27(): NativePtr
@SymbolName("openssl_kniBridge28")
private external fun kniBridge28(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge29")
private external fun kniBridge29(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge30")
private external fun kniBridge30(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge31")
private external fun kniBridge31(p0: NativePtr): Int
@SymbolName("openssl_kniBridge32")
private external fun kniBridge32(p0: NativePtr): Int
@SymbolName("openssl_kniBridge33")
private external fun kniBridge33(p0: NativePtr): Int
@SymbolName("openssl_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge36")
private external fun kniBridge36(p0: Int, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: ULong, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: NativePtr, p2: Int, p3: ULong): Int
@SymbolName("openssl_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("openssl_kniBridge42")
private external fun kniBridge42(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge43")
private external fun kniBridge43(): NativePtr
@SymbolName("openssl_kniBridge44")
private external fun kniBridge44(): NativePtr
@SymbolName("openssl_kniBridge45")
private external fun kniBridge45(): NativePtr
@SymbolName("openssl_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge49")
private external fun kniBridge49(): NativePtr
@SymbolName("openssl_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge51")
private external fun kniBridge51(p0: Int, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge52")
private external fun kniBridge52(): NativePtr
@SymbolName("openssl_kniBridge53")
private external fun kniBridge53(): NativePtr
@SymbolName("openssl_kniBridge54")
private external fun kniBridge54(): NativePtr
@SymbolName("openssl_kniBridge55")
private external fun kniBridge55(): NativePtr
@SymbolName("openssl_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge57")
private external fun kniBridge57(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge59")
private external fun kniBridge59(p0: NativePtr): Int
@SymbolName("openssl_kniBridge60")
private external fun kniBridge60(p0: NativePtr): Int
@SymbolName("openssl_kniBridge61")
private external fun kniBridge61(): Int
@SymbolName("openssl_kniBridge62")
private external fun kniBridge62(p0: NativePtr): Int
@SymbolName("openssl_kniBridge63")
private external fun kniBridge63(): Int
@SymbolName("openssl_kniBridge64")
private external fun kniBridge64(p0: NativePtr): Int
@SymbolName("openssl_kniBridge65")
private external fun kniBridge65(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge66")
private external fun kniBridge66(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge67")
private external fun kniBridge67(p0: Int): Int
@SymbolName("openssl_kniBridge68")
private external fun kniBridge68(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge69")
private external fun kniBridge69(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge70")
private external fun kniBridge70(p0: Int): Int
@SymbolName("openssl_kniBridge71")
private external fun kniBridge71(p0: NativePtr): Int
@SymbolName("openssl_kniBridge72")
private external fun kniBridge72(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge73")
private external fun kniBridge73(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge74")
private external fun kniBridge74(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Long
@SymbolName("openssl_kniBridge75")
private external fun kniBridge75(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Long
@SymbolName("openssl_kniBridge76")
private external fun kniBridge76(p0: NativePtr, p1: NativePtr, p2: NativePtr): Long
@SymbolName("openssl_kniBridge77")
private external fun kniBridge77(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge78")
private external fun kniBridge78(p0: NativePtr): Int
@SymbolName("openssl_kniBridge79")
private external fun kniBridge79(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: ULong, p2: ULong, p3: NativePtr): ULong
@SymbolName("openssl_kniBridge81")
private external fun kniBridge81(p0: NativePtr, p1: ULong, p2: ULong, p3: NativePtr): ULong
@SymbolName("openssl_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: ULong, p2: ULong, p3: NativePtr): ULong
@SymbolName("openssl_kniBridge83")
private external fun kniBridge83(p0: NativePtr, p1: ULong, p2: ULong, p3: NativePtr): ULong
@SymbolName("openssl_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: Long, p2: Int): Int
@SymbolName("openssl_kniBridge85")
private external fun kniBridge85(p0: NativePtr): Long
@SymbolName("openssl_kniBridge86")
private external fun kniBridge86(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge87")
private external fun kniBridge87(p0: NativePtr, p1: Long, p2: Int): Int
@SymbolName("openssl_kniBridge88")
private external fun kniBridge88(p0: NativePtr): Long
@SymbolName("openssl_kniBridge89")
private external fun kniBridge89(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge90")
private external fun kniBridge90(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge91")
private external fun kniBridge91(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge92")
private external fun kniBridge92(p0: NativePtr): Int
@SymbolName("openssl_kniBridge93")
private external fun kniBridge93(p0: NativePtr): Int
@SymbolName("openssl_kniBridge94")
private external fun kniBridge94(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge95")
private external fun kniBridge95(p0: NativePtr): Int
@SymbolName("openssl_kniBridge96")
private external fun kniBridge96(p0: NativePtr): Int
@SymbolName("openssl_kniBridge97")
private external fun kniBridge97(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge98")
private external fun kniBridge98(p0: NativePtr): Int
@SymbolName("openssl_kniBridge99")
private external fun kniBridge99(p0: NativePtr): Int
@SymbolName("openssl_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge101")
private external fun kniBridge101(p0: NativePtr): Int
@SymbolName("openssl_kniBridge102")
private external fun kniBridge102(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge103")
private external fun kniBridge103(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge104")
private external fun kniBridge104(p0: NativePtr): Int
@SymbolName("openssl_kniBridge105")
private external fun kniBridge105(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge106")
private external fun kniBridge106(): ULong
@SymbolName("openssl_kniBridge107")
private external fun kniBridge107(p0: NativePtr): Double
@SymbolName("openssl_kniBridge108")
private external fun kniBridge108(p0: NativePtr): Int
@SymbolName("openssl_kniBridge109")
private external fun kniBridge109(p0: NativePtr): Long
@SymbolName("openssl_kniBridge110")
private external fun kniBridge110(p0: NativePtr): Long
@SymbolName("openssl_kniBridge111")
private external fun kniBridge111(p0: NativePtr, p1: NativePtr): Double
@SymbolName("openssl_kniBridge112")
private external fun kniBridge112(p0: NativePtr, p1: NativePtr): Float
@SymbolName("openssl_kniBridge113")
private external fun kniBridge113(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("openssl_kniBridge114")
private external fun kniBridge114(p0: NativePtr, p1: NativePtr, p2: Int): ULong
@SymbolName("openssl_kniBridge115")
private external fun kniBridge115(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("openssl_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: NativePtr, p2: Int): ULong
@SymbolName("openssl_kniBridge117")
private external fun kniBridge117(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("openssl_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: NativePtr, p2: Int): ULong
@SymbolName("openssl_kniBridge119")
private external fun kniBridge119(p0: Long): NativePtr
@SymbolName("openssl_kniBridge120")
private external fun kniBridge120(p0: NativePtr): Long
@SymbolName("openssl_kniBridge121")
private external fun kniBridge121(p0: UShort): UShort
@SymbolName("openssl_kniBridge122")
private external fun kniBridge122(p0: UInt): UInt
@SymbolName("openssl_kniBridge123")
private external fun kniBridge123(p0: ULong): ULong
@SymbolName("openssl_kniBridge124")
private external fun kniBridge124(p0: Int, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge125")
private external fun kniBridge125(p0: Int, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge126")
private external fun kniBridge126(p0: ULong): UInt
@SymbolName("openssl_kniBridge127")
private external fun kniBridge127(p0: ULong): UInt
@SymbolName("openssl_kniBridge128")
private external fun kniBridge128(p0: UInt, p1: UInt): ULong
@SymbolName("openssl_kniBridge129")
private external fun kniBridge129(): Long
@SymbolName("openssl_kniBridge130")
private external fun kniBridge130(p0: UInt): Unit
@SymbolName("openssl_kniBridge131")
private external fun kniBridge131(p0: UInt, p1: NativePtr, p2: ULong): NativePtr
@SymbolName("openssl_kniBridge132")
private external fun kniBridge132(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge133")
private external fun kniBridge133(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge134")
private external fun kniBridge134(p0: UInt, p1: NativePtr): Int
@SymbolName("openssl_kniBridge135")
private external fun kniBridge135(p0: UInt, p1: NativePtr, p2: ULong, p3: NativePtr): Int
@SymbolName("openssl_kniBridge136")
private external fun kniBridge136(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge137")
private external fun kniBridge137(): Int
@SymbolName("openssl_kniBridge138")
private external fun kniBridge138(p0: UInt): Unit
@SymbolName("openssl_kniBridge139")
private external fun kniBridge139(p0: NativePtr): Int
@SymbolName("openssl_kniBridge140")
private external fun kniBridge140(): Double
@SymbolName("openssl_kniBridge141")
private external fun kniBridge141(p0: NativePtr): Double
@SymbolName("openssl_kniBridge142")
private external fun kniBridge142(): Long
@SymbolName("openssl_kniBridge143")
private external fun kniBridge143(p0: NativePtr): Long
@SymbolName("openssl_kniBridge144")
private external fun kniBridge144(): Long
@SymbolName("openssl_kniBridge145")
private external fun kniBridge145(p0: NativePtr): Long
@SymbolName("openssl_kniBridge146")
private external fun kniBridge146(p0: Long): Unit
@SymbolName("openssl_kniBridge147")
private external fun kniBridge147(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge148")
private external fun kniBridge148(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge149")
private external fun kniBridge149(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge151")
private external fun kniBridge151(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge153")
private external fun kniBridge153(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge154")
private external fun kniBridge154(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge155")
private external fun kniBridge155(p0: Long, p1: NativePtr): Int
@SymbolName("openssl_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge157")
private external fun kniBridge157(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge158")
private external fun kniBridge158(p0: ULong): NativePtr
@SymbolName("openssl_kniBridge159")
private external fun kniBridge159(p0: ULong, p1: ULong): NativePtr
@SymbolName("openssl_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("openssl_kniBridge161")
private external fun kniBridge161(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge162")
private external fun kniBridge162(p0: ULong): NativePtr
@SymbolName("openssl_kniBridge163")
private external fun kniBridge163(p0: ULong): NativePtr
@SymbolName("openssl_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: ULong, p2: ULong): Int
@SymbolName("openssl_kniBridge165")
private external fun kniBridge165(p0: ULong, p1: ULong): NativePtr
@SymbolName("openssl_kniBridge166")
private external fun kniBridge166(): Unit
@SymbolName("openssl_kniBridge167")
private external fun kniBridge167(p0: NativePtr): Int
@SymbolName("openssl_kniBridge168")
private external fun kniBridge168(p0: NativePtr): Int
@SymbolName("openssl_kniBridge169")
private external fun kniBridge169(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge170")
private external fun kniBridge170(p0: Int): Unit
@SymbolName("openssl_kniBridge171")
private external fun kniBridge171(p0: Int): Unit
@SymbolName("openssl_kniBridge172")
private external fun kniBridge172(p0: Int): Unit
@SymbolName("openssl_kniBridge173")
private external fun kniBridge173(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge174")
private external fun kniBridge174(p0: NativePtr): Int
@SymbolName("openssl_kniBridge175")
private external fun kniBridge175(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge176")
private external fun kniBridge176(p0: NativePtr): Int
@SymbolName("openssl_kniBridge177")
private external fun kniBridge177(): Int
@SymbolName("openssl_kniBridge178")
private external fun kniBridge178(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge179")
private external fun kniBridge179(p0: NativePtr): Int
@SymbolName("openssl_kniBridge180")
private external fun kniBridge180(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge181")
private external fun kniBridge181(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge182")
private external fun kniBridge182(p0: NativePtr): Int
@SymbolName("openssl_kniBridge183")
private external fun kniBridge183(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge184")
private external fun kniBridge184(p0: NativePtr, p1: NativePtr, p2: ULong, p3: ULong, p4: NativePtr): NativePtr
@SymbolName("openssl_kniBridge185")
private external fun kniBridge185(p0: NativePtr, p1: ULong, p2: ULong, p3: NativePtr): Unit
@SymbolName("openssl_kniBridge186")
private external fun kniBridge186(p0: Int): Int
@SymbolName("openssl_kniBridge187")
private external fun kniBridge187(p0: Long): Long
@SymbolName("openssl_kniBridge188")
private external fun kniBridge188(p0: Long): Long
@SymbolName("openssl_kniBridge189")
private external fun kniBridge189(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge190")
private external fun kniBridge190(p0: Long, p1: Long, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge191")
private external fun kniBridge191(p0: Long, p1: Long, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge192")
private external fun kniBridge192(p0: Double, p1: Int, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("openssl_kniBridge193")
private external fun kniBridge193(p0: Double, p1: Int, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("openssl_kniBridge194")
private external fun kniBridge194(p0: Double, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge195")
private external fun kniBridge195(p0: Double, p1: Int, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: ULong): Int
@SymbolName("openssl_kniBridge196")
private external fun kniBridge196(p0: Double, p1: Int, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: ULong): Int
@SymbolName("openssl_kniBridge197")
private external fun kniBridge197(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge198")
private external fun kniBridge198(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge199")
private external fun kniBridge199(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge200")
private external fun kniBridge200(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("openssl_kniBridge201")
private external fun kniBridge201(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("openssl_kniBridge202")
private external fun kniBridge202(p0: NativePtr): Int
@SymbolName("openssl_kniBridge203")
private external fun kniBridge203(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge204")
private external fun kniBridge204(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge205")
private external fun kniBridge205(): Long
@SymbolName("openssl_kniBridge206")
private external fun kniBridge206(p0: NativePtr): Long
@SymbolName("openssl_kniBridge207")
private external fun kniBridge207(p0: Long, p1: Long): Double
@SymbolName("openssl_kniBridge208")
private external fun kniBridge208(p0: NativePtr): Long
@SymbolName("openssl_kniBridge209")
private external fun kniBridge209(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): ULong
@SymbolName("openssl_kniBridge210")
private external fun kniBridge210(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr, p4: NativePtr): ULong
@SymbolName("openssl_kniBridge211")
private external fun kniBridge211(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge212")
private external fun kniBridge212(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge213")
private external fun kniBridge213(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge214")
private external fun kniBridge214(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge215")
private external fun kniBridge215(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge216")
private external fun kniBridge216(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge217")
private external fun kniBridge217(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge218")
private external fun kniBridge218(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge219")
private external fun kniBridge219(): Unit
@SymbolName("openssl_kniBridge220")
private external fun kniBridge220(p0: NativePtr): Int
@SymbolName("openssl_kniBridge221")
private external fun kniBridge221(p0: NativePtr): Long
@SymbolName("openssl_kniBridge222")
private external fun kniBridge222(p0: NativePtr): Long
@SymbolName("openssl_kniBridge223")
private external fun kniBridge223(p0: Int): Int
@SymbolName("openssl_kniBridge224")
private external fun kniBridge224(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge225")
private external fun kniBridge225(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge226")
private external fun kniBridge226(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge227")
private external fun kniBridge227(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge228")
private external fun kniBridge228(p0: Int, p1: Int, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge229")
private external fun kniBridge229(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge230")
private external fun kniBridge230(p0: Int, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge231")
private external fun kniBridge231(p0: NativePtr): Int
@SymbolName("openssl_kniBridge232")
private external fun kniBridge232(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge233")
private external fun kniBridge233(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge234")
private external fun kniBridge234(p0: NativePtr): Int
@SymbolName("openssl_kniBridge235")
private external fun kniBridge235(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge236")
private external fun kniBridge236(p0: NativePtr): Int
@SymbolName("openssl_kniBridge237")
private external fun kniBridge237(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge238")
private external fun kniBridge238(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge239")
private external fun kniBridge239(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge240")
private external fun kniBridge240(): NativePtr
@SymbolName("openssl_kniBridge241")
private external fun kniBridge241(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge242")
private external fun kniBridge242(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge243")
private external fun kniBridge243(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge244")
private external fun kniBridge244(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge245")
private external fun kniBridge245(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge246")
private external fun kniBridge246(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge247")
private external fun kniBridge247(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge248")
private external fun kniBridge248(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge249")
private external fun kniBridge249(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge250")
private external fun kniBridge250(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge251")
private external fun kniBridge251(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge252")
private external fun kniBridge252(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge253")
private external fun kniBridge253(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge254")
private external fun kniBridge254(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge255")
private external fun kniBridge255(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge256")
private external fun kniBridge256(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge257")
private external fun kniBridge257(p0: NativePtr): Int
@SymbolName("openssl_kniBridge258")
private external fun kniBridge258(p0: NativePtr): Int
@SymbolName("openssl_kniBridge259")
private external fun kniBridge259(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge260")
private external fun kniBridge260(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge261")
private external fun kniBridge261(): NativePtr
@SymbolName("openssl_kniBridge262")
private external fun kniBridge262(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge263")
private external fun kniBridge263(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge264")
private external fun kniBridge264(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge265")
private external fun kniBridge265(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge266")
private external fun kniBridge266(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge267")
private external fun kniBridge267(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge268")
private external fun kniBridge268(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge269")
private external fun kniBridge269(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge270")
private external fun kniBridge270(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge271")
private external fun kniBridge271(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge272")
private external fun kniBridge272(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge273")
private external fun kniBridge273(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge274")
private external fun kniBridge274(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge275")
private external fun kniBridge275(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge276")
private external fun kniBridge276(p0: NativePtr): Int
@SymbolName("openssl_kniBridge277")
private external fun kniBridge277(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge278")
private external fun kniBridge278(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge279")
private external fun kniBridge279(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge280")
private external fun kniBridge280(p0: NativePtr): Int
@SymbolName("openssl_kniBridge281")
private external fun kniBridge281(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge282")
private external fun kniBridge282(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge283")
private external fun kniBridge283(): NativePtr
@SymbolName("openssl_kniBridge284")
private external fun kniBridge284(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge285")
private external fun kniBridge285(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge286")
private external fun kniBridge286(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge287")
private external fun kniBridge287(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge288")
private external fun kniBridge288(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge289")
private external fun kniBridge289(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge290")
private external fun kniBridge290(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge291")
private external fun kniBridge291(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge292")
private external fun kniBridge292(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge293")
private external fun kniBridge293(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge294")
private external fun kniBridge294(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge295")
private external fun kniBridge295(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge296")
private external fun kniBridge296(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge297")
private external fun kniBridge297(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge298")
private external fun kniBridge298(p0: NativePtr): Int
@SymbolName("openssl_kniBridge299")
private external fun kniBridge299(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge300")
private external fun kniBridge300(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge301")
private external fun kniBridge301(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge302")
private external fun kniBridge302(p0: NativePtr): Int
@SymbolName("openssl_kniBridge303")
private external fun kniBridge303(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge304")
private external fun kniBridge304(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge305")
private external fun kniBridge305(): NativePtr
@SymbolName("openssl_kniBridge306")
private external fun kniBridge306(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge307")
private external fun kniBridge307(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge308")
private external fun kniBridge308(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge309")
private external fun kniBridge309(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge310")
private external fun kniBridge310(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge311")
private external fun kniBridge311(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge312")
private external fun kniBridge312(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge313")
private external fun kniBridge313(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge314")
private external fun kniBridge314(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge315")
private external fun kniBridge315(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge316")
private external fun kniBridge316(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge317")
private external fun kniBridge317(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge318")
private external fun kniBridge318(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge319")
private external fun kniBridge319(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge320")
private external fun kniBridge320(p0: NativePtr): Int
@SymbolName("openssl_kniBridge321")
private external fun kniBridge321(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge322")
private external fun kniBridge322(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge323")
private external fun kniBridge323(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge324")
private external fun kniBridge324(): NativePtr
@SymbolName("openssl_kniBridge325")
private external fun kniBridge325(p0: NativePtr): Int
@SymbolName("openssl_kniBridge326")
private external fun kniBridge326(p0: NativePtr): Int
@SymbolName("openssl_kniBridge327")
private external fun kniBridge327(p0: NativePtr): Int
@SymbolName("openssl_kniBridge328")
private external fun kniBridge328(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge329")
private external fun kniBridge329(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge330")
private external fun kniBridge330(p0: NativePtr): Int
@SymbolName("openssl_kniBridge331")
private external fun kniBridge331(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge332")
private external fun kniBridge332(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge333")
private external fun kniBridge333(): NativePtr
@SymbolName("openssl_kniBridge334")
private external fun kniBridge334(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge335")
private external fun kniBridge335(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge336")
private external fun kniBridge336(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge337")
private external fun kniBridge337(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge338")
private external fun kniBridge338(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge339")
private external fun kniBridge339(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge340")
private external fun kniBridge340(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge341")
private external fun kniBridge341(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge342")
private external fun kniBridge342(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge343")
private external fun kniBridge343(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge344")
private external fun kniBridge344(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge345")
private external fun kniBridge345(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge346")
private external fun kniBridge346(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge347")
private external fun kniBridge347(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge348")
private external fun kniBridge348(p0: NativePtr): Int
@SymbolName("openssl_kniBridge349")
private external fun kniBridge349(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge350")
private external fun kniBridge350(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge351")
private external fun kniBridge351(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge352")
private external fun kniBridge352(p0: Int): Int
@SymbolName("openssl_kniBridge353")
private external fun kniBridge353(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("openssl_kniBridge354")
private external fun kniBridge354(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("openssl_kniBridge355")
private external fun kniBridge355(p0: NativePtr, p1: ULong): ULong
@SymbolName("openssl_kniBridge356")
private external fun kniBridge356(p0: NativePtr, p1: Long): NativePtr
@SymbolName("openssl_kniBridge357")
private external fun kniBridge357(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge358")
private external fun kniBridge358(p0: UByte): Int
@SymbolName("openssl_kniBridge359")
private external fun kniBridge359(): ULong
@SymbolName("openssl_kniBridge360")
private external fun kniBridge360(p0: Int): NativePtr
@SymbolName("openssl_kniBridge361")
private external fun kniBridge361(): Int
@SymbolName("openssl_kniBridge362")
private external fun kniBridge362(p0: Int, p1: Long, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge363")
private external fun kniBridge363(p0: Int, p1: Int): Int
@SymbolName("openssl_kniBridge364")
private external fun kniBridge364(p0: Int, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge365")
private external fun kniBridge365(p0: Int, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge366")
private external fun kniBridge366(p0: Int, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge367")
private external fun kniBridge367(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge368")
private external fun kniBridge368(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge369")
private external fun kniBridge369(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge370")
private external fun kniBridge370(p0: Int): Int
@SymbolName("openssl_kniBridge371")
private external fun kniBridge371(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge372")
private external fun kniBridge372(p0: ULong, p1: NativePtr, p2: Int): NativePtr
@SymbolName("openssl_kniBridge373")
private external fun kniBridge373(p0: ULong, p1: NativePtr, p2: Int): NativePtr
@SymbolName("openssl_kniBridge374")
private external fun kniBridge374(p0: NativePtr, p1: ULong, p2: NativePtr, p3: Int): NativePtr
@SymbolName("openssl_kniBridge375")
private external fun kniBridge375(p0: NativePtr, p1: NativePtr, p2: Int): NativePtr
@SymbolName("openssl_kniBridge376")
private external fun kniBridge376(p0: NativePtr, p1: ULong, p2: NativePtr, p3: Int): NativePtr
@SymbolName("openssl_kniBridge377")
private external fun kniBridge377(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("openssl_kniBridge378")
private external fun kniBridge378(p0: NativePtr, p1: ULong, p2: NativePtr, p3: Int): Unit
@SymbolName("openssl_kniBridge379")
private external fun kniBridge379(p0: NativePtr, p1: ULong, p2: NativePtr, p3: Int): NativePtr
@SymbolName("openssl_kniBridge380")
private external fun kniBridge380(p0: NativePtr, p1: ULong, p2: ULong, p3: NativePtr, p4: Int): NativePtr
@SymbolName("openssl_kniBridge381")
private external fun kniBridge381(p0: ULong, p1: Int): Int
@SymbolName("openssl_kniBridge382")
private external fun kniBridge382(): Int
@SymbolName("openssl_kniBridge383")
private external fun kniBridge383(p0: ULong, p1: NativePtr, p2: Int): NativePtr
@SymbolName("openssl_kniBridge384")
private external fun kniBridge384(p0: ULong, p1: NativePtr, p2: Int): NativePtr
@SymbolName("openssl_kniBridge385")
private external fun kniBridge385(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("openssl_kniBridge386")
private external fun kniBridge386(p0: NativePtr, p1: ULong, p2: NativePtr, p3: Int): Unit
@SymbolName("openssl_kniBridge387")
private external fun kniBridge387(p0: NativePtr): Int
@SymbolName("openssl_kniBridge388")
private external fun kniBridge388(): Int
@SymbolName("openssl_kniBridge389")
private external fun kniBridge389(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge390")
private external fun kniBridge390(): ULong
@SymbolName("openssl_kniBridge391")
private external fun kniBridge391(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge392")
private external fun kniBridge392(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("openssl_kniBridge393")
private external fun kniBridge393(): Int
@SymbolName("openssl_kniBridge394")
private external fun kniBridge394(): Int
@SymbolName("openssl_kniBridge395")
private external fun kniBridge395(p0: Int): Int
@SymbolName("openssl_kniBridge396")
private external fun kniBridge396(): Unit
@SymbolName("openssl_kniBridge397")
private external fun kniBridge397(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge398")
private external fun kniBridge398(p0: NativePtr, p1: Int, p2: Long): Int
@SymbolName("openssl_kniBridge399")
private external fun kniBridge399(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge400")
private external fun kniBridge400(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge401")
private external fun kniBridge401(): Unit
@SymbolName("openssl_kniBridge402")
private external fun kniBridge402(p0: ULong, p1: NativePtr): Int
@SymbolName("openssl_kniBridge403")
private external fun kniBridge403(p0: NativePtr): Int
@SymbolName("openssl_kniBridge404")
private external fun kniBridge404(): Unit
@SymbolName("openssl_kniBridge405")
private external fun kniBridge405(): NativePtr
@SymbolName("openssl_kniBridge406")
private external fun kniBridge406(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge407")
private external fun kniBridge407(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge408")
private external fun kniBridge408(p0: ULong, p1: NativePtr): Int
@SymbolName("openssl_kniBridge409")
private external fun kniBridge409(p0: ULong): NativePtr
@SymbolName("openssl_kniBridge410")
private external fun kniBridge410(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge411")
private external fun kniBridge411(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge412")
private external fun kniBridge412(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge413")
private external fun kniBridge413(p0: Int, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge414")
private external fun kniBridge414(p0: Int): Int
@SymbolName("openssl_kniBridge415")
private external fun kniBridge415(): Int
@SymbolName("openssl_kniBridge416")
private external fun kniBridge416(p0: Int): Int
@SymbolName("openssl_kniBridge417")
private external fun kniBridge417(p0: Int): Int
@SymbolName("openssl_kniBridge418")
private external fun kniBridge418(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge419")
private external fun kniBridge419(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge420")
private external fun kniBridge420(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge421")
private external fun kniBridge421(p0: ULong, p1: NativePtr): Int
@SymbolName("openssl_kniBridge422")
private external fun kniBridge422(p0: ULong): Int
@SymbolName("openssl_kniBridge423")
private external fun kniBridge423(): ULong
@SymbolName("openssl_kniBridge424")
private external fun kniBridge424(p0: ULong, p1: ULong): Int
@SymbolName("openssl_kniBridge425")
private external fun kniBridge425(p0: NativePtr): Int
@SymbolName("openssl_kniBridge426")
private external fun kniBridge426(p0: NativePtr): Int
@SymbolName("openssl_kniBridge427")
private external fun kniBridge427(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge428")
private external fun kniBridge428(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge429")
private external fun kniBridge429(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge430")
private external fun kniBridge430(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge431")
private external fun kniBridge431(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge432")
private external fun kniBridge432(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge433")
private external fun kniBridge433(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge434")
private external fun kniBridge434(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge435")
private external fun kniBridge435(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge436")
private external fun kniBridge436(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge437")
private external fun kniBridge437(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge438")
private external fun kniBridge438(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge439")
private external fun kniBridge439(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge440")
private external fun kniBridge440(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge441")
private external fun kniBridge441(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge442")
private external fun kniBridge442(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge443")
private external fun kniBridge443(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge444")
private external fun kniBridge444(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge445")
private external fun kniBridge445(p0: ULong, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge446")
private external fun kniBridge446(p0: ULong, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge447")
private external fun kniBridge447(p0: ULong, p1: Int): Int
@SymbolName("openssl_kniBridge448")
private external fun kniBridge448(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge449")
private external fun kniBridge449(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge450")
private external fun kniBridge450(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge451")
private external fun kniBridge451(p0: ULong): Int
@SymbolName("openssl_kniBridge452")
private external fun kniBridge452(): Unit
@SymbolName("openssl_kniBridge453")
private external fun kniBridge453(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge454")
private external fun kniBridge454(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge455")
private external fun kniBridge455(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge456")
private external fun kniBridge456(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge457")
private external fun kniBridge457(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge458")
private external fun kniBridge458(p0: NativePtr): Int
@SymbolName("openssl_kniBridge459")
private external fun kniBridge459(p0: NativePtr): Int
@SymbolName("openssl_kniBridge460")
private external fun kniBridge460(p0: NativePtr): Int
@SymbolName("openssl_kniBridge461")
private external fun kniBridge461(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge462")
private external fun kniBridge462(p0: NativePtr): Int
@SymbolName("openssl_kniBridge463")
private external fun kniBridge463(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge464")
private external fun kniBridge464(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge465")
private external fun kniBridge465(p0: NativePtr): Int
@SymbolName("openssl_kniBridge466")
private external fun kniBridge466(p0: NativePtr): Int
@SymbolName("openssl_kniBridge467")
private external fun kniBridge467(p0: NativePtr): Int
@SymbolName("openssl_kniBridge468")
private external fun kniBridge468(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge469")
private external fun kniBridge469(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge470")
private external fun kniBridge470(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge471")
private external fun kniBridge471(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge472")
private external fun kniBridge472(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge473")
private external fun kniBridge473(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge474")
private external fun kniBridge474(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge475")
private external fun kniBridge475(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge476")
private external fun kniBridge476(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge477")
private external fun kniBridge477(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge478")
private external fun kniBridge478(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge479")
private external fun kniBridge479(p0: NativePtr): Int
@SymbolName("openssl_kniBridge480")
private external fun kniBridge480(p0: NativePtr): Int
@SymbolName("openssl_kniBridge481")
private external fun kniBridge481(p0: NativePtr): Int
@SymbolName("openssl_kniBridge482")
private external fun kniBridge482(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge483")
private external fun kniBridge483(p0: NativePtr): Int
@SymbolName("openssl_kniBridge484")
private external fun kniBridge484(p0: NativePtr): Int
@SymbolName("openssl_kniBridge485")
private external fun kniBridge485(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge486")
private external fun kniBridge486(p0: NativePtr): Int
@SymbolName("openssl_kniBridge487")
private external fun kniBridge487(p0: NativePtr): Int
@SymbolName("openssl_kniBridge488")
private external fun kniBridge488(p0: NativePtr): Int
@SymbolName("openssl_kniBridge489")
private external fun kniBridge489(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge490")
private external fun kniBridge490(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge491")
private external fun kniBridge491(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge492")
private external fun kniBridge492(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge493")
private external fun kniBridge493(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge494")
private external fun kniBridge494(p0: NativePtr): Int
@SymbolName("openssl_kniBridge495")
private external fun kniBridge495(p0: NativePtr): Int
@SymbolName("openssl_kniBridge496")
private external fun kniBridge496(p0: NativePtr): Int
@SymbolName("openssl_kniBridge497")
private external fun kniBridge497(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge498")
private external fun kniBridge498(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge499")
private external fun kniBridge499(p0: NativePtr): Int
@SymbolName("openssl_kniBridge500")
private external fun kniBridge500(p0: NativePtr): Int
@SymbolName("openssl_kniBridge501")
private external fun kniBridge501(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge502")
private external fun kniBridge502(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge503")
private external fun kniBridge503(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge504")
private external fun kniBridge504(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge505")
private external fun kniBridge505(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge506")
private external fun kniBridge506(p0: NativePtr): Int
@SymbolName("openssl_kniBridge507")
private external fun kniBridge507(p0: NativePtr): Int
@SymbolName("openssl_kniBridge508")
private external fun kniBridge508(p0: NativePtr): Int
@SymbolName("openssl_kniBridge509")
private external fun kniBridge509(p0: NativePtr): Int
@SymbolName("openssl_kniBridge510")
private external fun kniBridge510(p0: NativePtr, p1: NativePtr, p2: UInt): Int
@SymbolName("openssl_kniBridge511")
private external fun kniBridge511(p0: NativePtr): Int
@SymbolName("openssl_kniBridge512")
private external fun kniBridge512(p0: NativePtr): Int
@SymbolName("openssl_kniBridge513")
private external fun kniBridge513(p0: NativePtr): Int
@SymbolName("openssl_kniBridge514")
private external fun kniBridge514(p0: NativePtr): Int
@SymbolName("openssl_kniBridge515")
private external fun kniBridge515(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge516")
private external fun kniBridge516(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge517")
private external fun kniBridge517(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge518")
private external fun kniBridge518(p0: UInt): Int
@SymbolName("openssl_kniBridge519")
private external fun kniBridge519(p0: UInt): NativePtr
@SymbolName("openssl_kniBridge520")
private external fun kniBridge520(p0: UInt, p1: NativePtr): Int
@SymbolName("openssl_kniBridge521")
private external fun kniBridge521(p0: ULong, p1: NativePtr): Int
@SymbolName("openssl_kniBridge522")
private external fun kniBridge522(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge523")
private external fun kniBridge523(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge524")
private external fun kniBridge524(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge525")
private external fun kniBridge525(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge526")
private external fun kniBridge526(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge527")
private external fun kniBridge527(p0: NativePtr): Int
@SymbolName("openssl_kniBridge528")
private external fun kniBridge528(): ULong
@SymbolName("openssl_kniBridge529")
private external fun kniBridge529(p0: ULong, p1: ULong): Int
@SymbolName("openssl_kniBridge530")
private external fun kniBridge530(): Int
@SymbolName("openssl_kniBridge531")
private external fun kniBridge531(): Int
@SymbolName("openssl_kniBridge532")
private external fun kniBridge532(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge533")
private external fun kniBridge533(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge534")
private external fun kniBridge534(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge535")
private external fun kniBridge535(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge536")
private external fun kniBridge536(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge537")
private external fun kniBridge537(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge538")
private external fun kniBridge538(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge539")
private external fun kniBridge539(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge540")
private external fun kniBridge540(p0: NativePtr): Int
@SymbolName("openssl_kniBridge541")
private external fun kniBridge541(p0: NativePtr): Int
@SymbolName("openssl_kniBridge542")
private external fun kniBridge542(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge543")
private external fun kniBridge543(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge544")
private external fun kniBridge544(): NativePtr
@SymbolName("openssl_kniBridge545")
private external fun kniBridge545(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge546")
private external fun kniBridge546(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge547")
private external fun kniBridge547(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge548")
private external fun kniBridge548(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge549")
private external fun kniBridge549(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge550")
private external fun kniBridge550(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge551")
private external fun kniBridge551(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge552")
private external fun kniBridge552(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge553")
private external fun kniBridge553(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge554")
private external fun kniBridge554(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge555")
private external fun kniBridge555(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge556")
private external fun kniBridge556(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge557")
private external fun kniBridge557(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge558")
private external fun kniBridge558(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge559")
private external fun kniBridge559(p0: NativePtr): Int
@SymbolName("openssl_kniBridge560")
private external fun kniBridge560(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge561")
private external fun kniBridge561(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge562")
private external fun kniBridge562(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge563")
private external fun kniBridge563(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge564")
private external fun kniBridge564(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge565")
private external fun kniBridge565(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge566")
private external fun kniBridge566(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge567")
private external fun kniBridge567(p0: NativePtr): Int
@SymbolName("openssl_kniBridge568")
private external fun kniBridge568(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge569")
private external fun kniBridge569(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge570")
private external fun kniBridge570(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge571")
private external fun kniBridge571(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge572")
private external fun kniBridge572(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge573")
private external fun kniBridge573(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge574")
private external fun kniBridge574(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge575")
private external fun kniBridge575(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge576")
private external fun kniBridge576(): NativePtr
@SymbolName("openssl_kniBridge577")
private external fun kniBridge577(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge578")
private external fun kniBridge578(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge579")
private external fun kniBridge579(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge580")
private external fun kniBridge580(p0: NativePtr): Int
@SymbolName("openssl_kniBridge581")
private external fun kniBridge581(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge582")
private external fun kniBridge582(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge583")
private external fun kniBridge583(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge584")
private external fun kniBridge584(p0: NativePtr): Int
@SymbolName("openssl_kniBridge585")
private external fun kniBridge585(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge586")
private external fun kniBridge586(p0: NativePtr): Int
@SymbolName("openssl_kniBridge587")
private external fun kniBridge587(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge588")
private external fun kniBridge588(p0: NativePtr): Int
@SymbolName("openssl_kniBridge589")
private external fun kniBridge589(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge590")
private external fun kniBridge590(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge591")
private external fun kniBridge591(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge592")
private external fun kniBridge592(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge593")
private external fun kniBridge593(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("openssl_kniBridge594")
private external fun kniBridge594(p0: NativePtr, p1: Int, p2: Long, p3: NativePtr): Long
@SymbolName("openssl_kniBridge595")
private external fun kniBridge595(p0: NativePtr, p1: Int, p2: NativePtr): Long
@SymbolName("openssl_kniBridge596")
private external fun kniBridge596(p0: NativePtr, p1: Int, p2: Long): NativePtr
@SymbolName("openssl_kniBridge597")
private external fun kniBridge597(p0: NativePtr, p1: Int, p2: Long, p3: Int): Long
@SymbolName("openssl_kniBridge598")
private external fun kniBridge598(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge599")
private external fun kniBridge599(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge600")
private external fun kniBridge600(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge601")
private external fun kniBridge601(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge602")
private external fun kniBridge602(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge603")
private external fun kniBridge603(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge604")
private external fun kniBridge604(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge605")
private external fun kniBridge605(p0: NativePtr): Int
@SymbolName("openssl_kniBridge606")
private external fun kniBridge606(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge607")
private external fun kniBridge607(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge608")
private external fun kniBridge608(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge609")
private external fun kniBridge609(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge610")
private external fun kniBridge610(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge611")
private external fun kniBridge611(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge612")
private external fun kniBridge612(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: Long, p5: Long): Long
@SymbolName("openssl_kniBridge613")
private external fun kniBridge613(): NativePtr
@SymbolName("openssl_kniBridge614")
private external fun kniBridge614(): NativePtr
@SymbolName("openssl_kniBridge615")
private external fun kniBridge615(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge616")
private external fun kniBridge616(): NativePtr
@SymbolName("openssl_kniBridge617")
private external fun kniBridge617(): NativePtr
@SymbolName("openssl_kniBridge618")
private external fun kniBridge618(): NativePtr
@SymbolName("openssl_kniBridge619")
private external fun kniBridge619(): NativePtr
@SymbolName("openssl_kniBridge620")
private external fun kniBridge620(): NativePtr
@SymbolName("openssl_kniBridge621")
private external fun kniBridge621(): NativePtr
@SymbolName("openssl_kniBridge622")
private external fun kniBridge622(): NativePtr
@SymbolName("openssl_kniBridge623")
private external fun kniBridge623(): NativePtr
@SymbolName("openssl_kniBridge624")
private external fun kniBridge624(): NativePtr
@SymbolName("openssl_kniBridge625")
private external fun kniBridge625(): NativePtr
@SymbolName("openssl_kniBridge626")
private external fun kniBridge626(): NativePtr
@SymbolName("openssl_kniBridge627")
private external fun kniBridge627(): NativePtr
@SymbolName("openssl_kniBridge628")
private external fun kniBridge628(p0: Int): Int
@SymbolName("openssl_kniBridge629")
private external fun kniBridge629(p0: Int, p1: Int): NativePtr
@SymbolName("openssl_kniBridge630")
private external fun kniBridge630(p0: Int): Int
@SymbolName("openssl_kniBridge631")
private external fun kniBridge631(p0: Int): Int
@SymbolName("openssl_kniBridge632")
private external fun kniBridge632(p0: Int): Int
@SymbolName("openssl_kniBridge633")
private external fun kniBridge633(p0: Int): Int
@SymbolName("openssl_kniBridge634")
private external fun kniBridge634(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge635")
private external fun kniBridge635(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: Int): Int
@SymbolName("openssl_kniBridge636")
private external fun kniBridge636(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge637")
private external fun kniBridge637(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int): Int
@SymbolName("openssl_kniBridge638")
private external fun kniBridge638(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge639")
private external fun kniBridge639(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int): Int
@SymbolName("openssl_kniBridge640")
private external fun kniBridge640(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge641")
private external fun kniBridge641(): NativePtr
@SymbolName("openssl_kniBridge642")
private external fun kniBridge642(p0: NativePtr, p1: Int, p2: NativePtr, p3: ULong, p4: UShort): Int
@SymbolName("openssl_kniBridge643")
private external fun kniBridge643(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge644")
private external fun kniBridge644(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge645")
private external fun kniBridge645(p0: NativePtr): Int
@SymbolName("openssl_kniBridge646")
private external fun kniBridge646(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge647")
private external fun kniBridge647(p0: NativePtr): UShort
@SymbolName("openssl_kniBridge648")
private external fun kniBridge648(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge649")
private external fun kniBridge649(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge650")
private external fun kniBridge650(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge651")
private external fun kniBridge651(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge652")
private external fun kniBridge652(p0: NativePtr): Int
@SymbolName("openssl_kniBridge653")
private external fun kniBridge653(p0: NativePtr): Int
@SymbolName("openssl_kniBridge654")
private external fun kniBridge654(p0: NativePtr): Int
@SymbolName("openssl_kniBridge655")
private external fun kniBridge655(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge656")
private external fun kniBridge656(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge657")
private external fun kniBridge657(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: UInt): Int
@SymbolName("openssl_kniBridge658")
private external fun kniBridge658(p0: NativePtr, p1: NativePtr, p2: UInt, p3: Int, p4: Int, p5: NativePtr): Int
@SymbolName("openssl_kniBridge659")
private external fun kniBridge659(p0: Int): Int
@SymbolName("openssl_kniBridge660")
private external fun kniBridge660(p0: Int, p1: Long, p2: NativePtr): Int
@SymbolName("openssl_kniBridge661")
private external fun kniBridge661(p0: Int, p1: Int): Int
@SymbolName("openssl_kniBridge662")
private external fun kniBridge662(): Int
@SymbolName("openssl_kniBridge663")
private external fun kniBridge663(p0: Int, p1: Int): Int
@SymbolName("openssl_kniBridge664")
private external fun kniBridge664(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge665")
private external fun kniBridge665(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge666")
private external fun kniBridge666(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge667")
private external fun kniBridge667(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge668")
private external fun kniBridge668(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge669")
private external fun kniBridge669(p0: Int, p1: UInt, p2: NativePtr): Int
@SymbolName("openssl_kniBridge670")
private external fun kniBridge670(p0: Int, p1: Int, p2: Int, p3: Int): Int
@SymbolName("openssl_kniBridge671")
private external fun kniBridge671(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge672")
private external fun kniBridge672(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge673")
private external fun kniBridge673(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge674")
private external fun kniBridge674(p0: Int): Int
@SymbolName("openssl_kniBridge675")
private external fun kniBridge675(p0: Int, p1: Int): NativePtr
@SymbolName("openssl_kniBridge676")
private external fun kniBridge676(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge677")
private external fun kniBridge677(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge678")
private external fun kniBridge678(p0: Int, p1: Int): NativePtr
@SymbolName("openssl_kniBridge679")
private external fun kniBridge679(p0: NativePtr, p1: ULong, p2: NativePtr, p3: ULong): Int
@SymbolName("openssl_kniBridge680")
private external fun kniBridge680(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge681")
private external fun kniBridge681(): NativePtr
@SymbolName("openssl_kniBridge682")
private external fun kniBridge682(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge683")
private external fun kniBridge683(): NativePtr
@SymbolName("openssl_kniBridge684")
private external fun kniBridge684(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge685")
private external fun kniBridge685(p0: Int, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge686")
private external fun kniBridge686(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge687")
private external fun kniBridge687(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge688")
private external fun kniBridge688(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge689")
private external fun kniBridge689(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge690")
private external fun kniBridge690(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge691")
private external fun kniBridge691(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge692")
private external fun kniBridge692(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge693")
private external fun kniBridge693(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge694")
private external fun kniBridge694(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge695")
private external fun kniBridge695(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge696")
private external fun kniBridge696(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge697")
private external fun kniBridge697(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge698")
private external fun kniBridge698(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge699")
private external fun kniBridge699(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge700")
private external fun kniBridge700(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge701")
private external fun kniBridge701(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge702")
private external fun kniBridge702(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge703")
private external fun kniBridge703(): Int
@SymbolName("openssl_kniBridge704")
private external fun kniBridge704(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge705")
private external fun kniBridge705(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge706")
private external fun kniBridge706(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("openssl_kniBridge707")
private external fun kniBridge707(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("openssl_kniBridge708")
private external fun kniBridge708(): NativePtr
@SymbolName("openssl_kniBridge709")
private external fun kniBridge709(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge710")
private external fun kniBridge710(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge711")
private external fun kniBridge711(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge712")
private external fun kniBridge712(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge713")
private external fun kniBridge713(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge714")
private external fun kniBridge714(p0: NativePtr): Int
@SymbolName("openssl_kniBridge715")
private external fun kniBridge715(p0: NativePtr): Int
@SymbolName("openssl_kniBridge716")
private external fun kniBridge716(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge717")
private external fun kniBridge717(p0: NativePtr): Int
@SymbolName("openssl_kniBridge718")
private external fun kniBridge718(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge719")
private external fun kniBridge719(): NativePtr
@SymbolName("openssl_kniBridge720")
private external fun kniBridge720(): NativePtr
@SymbolName("openssl_kniBridge721")
private external fun kniBridge721(): NativePtr
@SymbolName("openssl_kniBridge722")
private external fun kniBridge722(): NativePtr
@SymbolName("openssl_kniBridge723")
private external fun kniBridge723(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge724")
private external fun kniBridge724(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge725")
private external fun kniBridge725(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge726")
private external fun kniBridge726(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge727")
private external fun kniBridge727(p0: NativePtr, p1: Int, p2: Int, p3: Int): Int
@SymbolName("openssl_kniBridge728")
private external fun kniBridge728(p0: NativePtr, p1: Int, p2: Int, p3: Int): Int
@SymbolName("openssl_kniBridge729")
private external fun kniBridge729(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge730")
private external fun kniBridge730(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge731")
private external fun kniBridge731(p0: NativePtr): Int
@SymbolName("openssl_kniBridge732")
private external fun kniBridge732(p0: ULong): Int
@SymbolName("openssl_kniBridge733")
private external fun kniBridge733(p0: Int, p1: Int): Int
@SymbolName("openssl_kniBridge734")
private external fun kniBridge734(): NativePtr
@SymbolName("openssl_kniBridge735")
private external fun kniBridge735(): NativePtr
@SymbolName("openssl_kniBridge736")
private external fun kniBridge736(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge737")
private external fun kniBridge737(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge738")
private external fun kniBridge738(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge739")
private external fun kniBridge739(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge740")
private external fun kniBridge740(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge741")
private external fun kniBridge741(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge742")
private external fun kniBridge742(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge743")
private external fun kniBridge743(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge744")
private external fun kniBridge744(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge745")
private external fun kniBridge745(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge746")
private external fun kniBridge746(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge747")
private external fun kniBridge747(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge748")
private external fun kniBridge748(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge749")
private external fun kniBridge749(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge750")
private external fun kniBridge750(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge751")
private external fun kniBridge751(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge752")
private external fun kniBridge752(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge753")
private external fun kniBridge753(p0: NativePtr): Int
@SymbolName("openssl_kniBridge754")
private external fun kniBridge754(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge755")
private external fun kniBridge755(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge756")
private external fun kniBridge756(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge757")
private external fun kniBridge757(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge758")
private external fun kniBridge758(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge759")
private external fun kniBridge759(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge760")
private external fun kniBridge760(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge761")
private external fun kniBridge761(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge762")
private external fun kniBridge762(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge763")
private external fun kniBridge763(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge764")
private external fun kniBridge764(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge765")
private external fun kniBridge765(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge766")
private external fun kniBridge766(p0: NativePtr, p1: ULong): ULong
@SymbolName("openssl_kniBridge767")
private external fun kniBridge767(p0: NativePtr, p1: ULong): ULong
@SymbolName("openssl_kniBridge768")
private external fun kniBridge768(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge769")
private external fun kniBridge769(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge770")
private external fun kniBridge770(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge771")
private external fun kniBridge771(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge772")
private external fun kniBridge772(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge773")
private external fun kniBridge773(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge774")
private external fun kniBridge774(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge775")
private external fun kniBridge775(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge776")
private external fun kniBridge776(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge777")
private external fun kniBridge777(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge778")
private external fun kniBridge778(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge779")
private external fun kniBridge779(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge780")
private external fun kniBridge780(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge781")
private external fun kniBridge781(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge782")
private external fun kniBridge782(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge783")
private external fun kniBridge783(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr): Int
@SymbolName("openssl_kniBridge784")
private external fun kniBridge784(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge785")
private external fun kniBridge785(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge786")
private external fun kniBridge786(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge787")
private external fun kniBridge787(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge788")
private external fun kniBridge788(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge789")
private external fun kniBridge789(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge790")
private external fun kniBridge790(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge791")
private external fun kniBridge791(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge792")
private external fun kniBridge792(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge793")
private external fun kniBridge793(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge794")
private external fun kniBridge794(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge795")
private external fun kniBridge795(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge796")
private external fun kniBridge796(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge797")
private external fun kniBridge797(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge798")
private external fun kniBridge798(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge799")
private external fun kniBridge799(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge800")
private external fun kniBridge800(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge801")
private external fun kniBridge801(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge802")
private external fun kniBridge802(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge803")
private external fun kniBridge803(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("openssl_kniBridge804")
private external fun kniBridge804(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("openssl_kniBridge805")
private external fun kniBridge805(p0: ULong, p1: NativePtr, p2: NativePtr, p3: Int): Unit
@SymbolName("openssl_kniBridge806")
private external fun kniBridge806(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("openssl_kniBridge807")
private external fun kniBridge807(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge808")
private external fun kniBridge808(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: Int): Int
@SymbolName("openssl_kniBridge809")
private external fun kniBridge809(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge810")
private external fun kniBridge810(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge811")
private external fun kniBridge811(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: NativePtr): Int
@SymbolName("openssl_kniBridge812")
private external fun kniBridge812(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge813")
private external fun kniBridge813(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr, p8: NativePtr): Int
@SymbolName("openssl_kniBridge814")
private external fun kniBridge814(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr, p8: NativePtr): Int
@SymbolName("openssl_kniBridge815")
private external fun kniBridge815(): NativePtr
@SymbolName("openssl_kniBridge816")
private external fun kniBridge816(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge817")
private external fun kniBridge817(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge818")
private external fun kniBridge818(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge819")
private external fun kniBridge819(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge820")
private external fun kniBridge820(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge821")
private external fun kniBridge821(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge822")
private external fun kniBridge822(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("openssl_kniBridge823")
private external fun kniBridge823(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge824")
private external fun kniBridge824(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge825")
private external fun kniBridge825(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge826")
private external fun kniBridge826(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge827")
private external fun kniBridge827(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge828")
private external fun kniBridge828(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge829")
private external fun kniBridge829(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge830")
private external fun kniBridge830(p0: NativePtr): Int
@SymbolName("openssl_kniBridge831")
private external fun kniBridge831(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge832")
private external fun kniBridge832(p0: NativePtr): Int
@SymbolName("openssl_kniBridge833")
private external fun kniBridge833(p0: NativePtr): Int
@SymbolName("openssl_kniBridge834")
private external fun kniBridge834(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge835")
private external fun kniBridge835(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge836")
private external fun kniBridge836(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("openssl_kniBridge837")
private external fun kniBridge837(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("openssl_kniBridge838")
private external fun kniBridge838(p0: Int): Int
@SymbolName("openssl_kniBridge839")
private external fun kniBridge839(): NativePtr
@SymbolName("openssl_kniBridge840")
private external fun kniBridge840(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge841")
private external fun kniBridge841(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge842")
private external fun kniBridge842(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge843")
private external fun kniBridge843(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge844")
private external fun kniBridge844(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge845")
private external fun kniBridge845(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge846")
private external fun kniBridge846(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge847")
private external fun kniBridge847(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge848")
private external fun kniBridge848(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge849")
private external fun kniBridge849(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge850")
private external fun kniBridge850(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge851")
private external fun kniBridge851(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge852")
private external fun kniBridge852(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge853")
private external fun kniBridge853(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge854")
private external fun kniBridge854(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge855")
private external fun kniBridge855(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge856")
private external fun kniBridge856(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge857")
private external fun kniBridge857(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge858")
private external fun kniBridge858(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge859")
private external fun kniBridge859(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge860")
private external fun kniBridge860(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge861")
private external fun kniBridge861(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge862")
private external fun kniBridge862(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge863")
private external fun kniBridge863(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge864")
private external fun kniBridge864(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge865")
private external fun kniBridge865(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge866")
private external fun kniBridge866(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge867")
private external fun kniBridge867(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge868")
private external fun kniBridge868(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge869")
private external fun kniBridge869(): NativePtr
@SymbolName("openssl_kniBridge870")
private external fun kniBridge870(): NativePtr
@SymbolName("openssl_kniBridge871")
private external fun kniBridge871(): NativePtr
@SymbolName("openssl_kniBridge872")
private external fun kniBridge872(): NativePtr
@SymbolName("openssl_kniBridge873")
private external fun kniBridge873(): NativePtr
@SymbolName("openssl_kniBridge874")
private external fun kniBridge874(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge875")
private external fun kniBridge875(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: ULong, p5: NativePtr): Int
@SymbolName("openssl_kniBridge876")
private external fun kniBridge876(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge877")
private external fun kniBridge877(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge878")
private external fun kniBridge878(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge879")
private external fun kniBridge879(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge880")
private external fun kniBridge880(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge881")
private external fun kniBridge881(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge882")
private external fun kniBridge882(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge883")
private external fun kniBridge883(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge884")
private external fun kniBridge884(p0: NativePtr, p1: Int, p2: Int, p3: Int): Int
@SymbolName("openssl_kniBridge885")
private external fun kniBridge885(): Int
@SymbolName("openssl_kniBridge886")
private external fun kniBridge886(p0: NativePtr): Int
@SymbolName("openssl_kniBridge887")
private external fun kniBridge887(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge888")
private external fun kniBridge888(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge889")
private external fun kniBridge889(): NativePtr
@SymbolName("openssl_kniBridge890")
private external fun kniBridge890(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge891")
private external fun kniBridge891(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge892")
private external fun kniBridge892(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge893")
private external fun kniBridge893(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge894")
private external fun kniBridge894(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge895")
private external fun kniBridge895(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge896")
private external fun kniBridge896(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge897")
private external fun kniBridge897(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge898")
private external fun kniBridge898(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge899")
private external fun kniBridge899(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge900")
private external fun kniBridge900(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge901")
private external fun kniBridge901(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge902")
private external fun kniBridge902(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge903")
private external fun kniBridge903(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge904")
private external fun kniBridge904(p0: NativePtr): Int
@SymbolName("openssl_kniBridge905")
private external fun kniBridge905(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge906")
private external fun kniBridge906(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge907")
private external fun kniBridge907(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge908")
private external fun kniBridge908(p0: NativePtr): Int
@SymbolName("openssl_kniBridge909")
private external fun kniBridge909(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge910")
private external fun kniBridge910(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge911")
private external fun kniBridge911(): NativePtr
@SymbolName("openssl_kniBridge912")
private external fun kniBridge912(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge913")
private external fun kniBridge913(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge914")
private external fun kniBridge914(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge915")
private external fun kniBridge915(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge916")
private external fun kniBridge916(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge917")
private external fun kniBridge917(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge918")
private external fun kniBridge918(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge919")
private external fun kniBridge919(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge920")
private external fun kniBridge920(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge921")
private external fun kniBridge921(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge922")
private external fun kniBridge922(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge923")
private external fun kniBridge923(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge924")
private external fun kniBridge924(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge925")
private external fun kniBridge925(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge926")
private external fun kniBridge926(p0: NativePtr): Int
@SymbolName("openssl_kniBridge927")
private external fun kniBridge927(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge928")
private external fun kniBridge928(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge929")
private external fun kniBridge929(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge930")
private external fun kniBridge930(p0: NativePtr): Int
@SymbolName("openssl_kniBridge931")
private external fun kniBridge931(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge932")
private external fun kniBridge932(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge933")
private external fun kniBridge933(): NativePtr
@SymbolName("openssl_kniBridge934")
private external fun kniBridge934(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge935")
private external fun kniBridge935(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge936")
private external fun kniBridge936(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge937")
private external fun kniBridge937(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge938")
private external fun kniBridge938(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge939")
private external fun kniBridge939(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge940")
private external fun kniBridge940(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge941")
private external fun kniBridge941(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge942")
private external fun kniBridge942(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge943")
private external fun kniBridge943(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge944")
private external fun kniBridge944(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge945")
private external fun kniBridge945(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge946")
private external fun kniBridge946(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge947")
private external fun kniBridge947(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge948")
private external fun kniBridge948(p0: NativePtr): Int
@SymbolName("openssl_kniBridge949")
private external fun kniBridge949(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge950")
private external fun kniBridge950(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge951")
private external fun kniBridge951(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge952")
private external fun kniBridge952(p0: NativePtr): Int
@SymbolName("openssl_kniBridge953")
private external fun kniBridge953(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge954")
private external fun kniBridge954(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge955")
private external fun kniBridge955(): NativePtr
@SymbolName("openssl_kniBridge956")
private external fun kniBridge956(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge957")
private external fun kniBridge957(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge958")
private external fun kniBridge958(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge959")
private external fun kniBridge959(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge960")
private external fun kniBridge960(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge961")
private external fun kniBridge961(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge962")
private external fun kniBridge962(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge963")
private external fun kniBridge963(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge964")
private external fun kniBridge964(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge965")
private external fun kniBridge965(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge966")
private external fun kniBridge966(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge967")
private external fun kniBridge967(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge968")
private external fun kniBridge968(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge969")
private external fun kniBridge969(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge970")
private external fun kniBridge970(p0: NativePtr): Int
@SymbolName("openssl_kniBridge971")
private external fun kniBridge971(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge972")
private external fun kniBridge972(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge973")
private external fun kniBridge973(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge974")
private external fun kniBridge974(p0: NativePtr): Int
@SymbolName("openssl_kniBridge975")
private external fun kniBridge975(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge976")
private external fun kniBridge976(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge977")
private external fun kniBridge977(): NativePtr
@SymbolName("openssl_kniBridge978")
private external fun kniBridge978(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge979")
private external fun kniBridge979(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge980")
private external fun kniBridge980(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge981")
private external fun kniBridge981(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge982")
private external fun kniBridge982(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge983")
private external fun kniBridge983(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge984")
private external fun kniBridge984(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge985")
private external fun kniBridge985(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge986")
private external fun kniBridge986(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge987")
private external fun kniBridge987(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge988")
private external fun kniBridge988(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge989")
private external fun kniBridge989(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge990")
private external fun kniBridge990(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge991")
private external fun kniBridge991(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge992")
private external fun kniBridge992(p0: NativePtr): Int
@SymbolName("openssl_kniBridge993")
private external fun kniBridge993(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge994")
private external fun kniBridge994(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge995")
private external fun kniBridge995(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge996")
private external fun kniBridge996(p0: NativePtr): Int
@SymbolName("openssl_kniBridge997")
private external fun kniBridge997(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge998")
private external fun kniBridge998(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge999")
private external fun kniBridge999(): NativePtr
@SymbolName("openssl_kniBridge1000")
private external fun kniBridge1000(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1001")
private external fun kniBridge1001(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1002")
private external fun kniBridge1002(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1003")
private external fun kniBridge1003(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1004")
private external fun kniBridge1004(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1005")
private external fun kniBridge1005(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1006")
private external fun kniBridge1006(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1007")
private external fun kniBridge1007(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1008")
private external fun kniBridge1008(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1009")
private external fun kniBridge1009(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1010")
private external fun kniBridge1010(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1011")
private external fun kniBridge1011(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1012")
private external fun kniBridge1012(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1013")
private external fun kniBridge1013(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1014")
private external fun kniBridge1014(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1015")
private external fun kniBridge1015(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1016")
private external fun kniBridge1016(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1017")
private external fun kniBridge1017(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1018")
private external fun kniBridge1018(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1019")
private external fun kniBridge1019(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1020")
private external fun kniBridge1020(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1021")
private external fun kniBridge1021(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1022")
private external fun kniBridge1022(): NativePtr
@SymbolName("openssl_kniBridge1023")
private external fun kniBridge1023(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1024")
private external fun kniBridge1024(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1025")
private external fun kniBridge1025(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1026")
private external fun kniBridge1026(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1027")
private external fun kniBridge1027(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1028")
private external fun kniBridge1028(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1029")
private external fun kniBridge1029(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1030")
private external fun kniBridge1030(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1031")
private external fun kniBridge1031(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1032")
private external fun kniBridge1032(): NativePtr
@SymbolName("openssl_kniBridge1033")
private external fun kniBridge1033(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1034")
private external fun kniBridge1034(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1035")
private external fun kniBridge1035(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1036")
private external fun kniBridge1036(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1037")
private external fun kniBridge1037(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1038")
private external fun kniBridge1038(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1039")
private external fun kniBridge1039(): NativePtr
@SymbolName("openssl_kniBridge1040")
private external fun kniBridge1040(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1041")
private external fun kniBridge1041(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1042")
private external fun kniBridge1042(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1043")
private external fun kniBridge1043(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1044")
private external fun kniBridge1044(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1045")
private external fun kniBridge1045(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1046")
private external fun kniBridge1046(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1047")
private external fun kniBridge1047(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1048")
private external fun kniBridge1048(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1049")
private external fun kniBridge1049(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1050")
private external fun kniBridge1050(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1051")
private external fun kniBridge1051(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1052")
private external fun kniBridge1052(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1053")
private external fun kniBridge1053(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1054")
private external fun kniBridge1054(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1055")
private external fun kniBridge1055(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1056")
private external fun kniBridge1056(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1057")
private external fun kniBridge1057(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1058")
private external fun kniBridge1058(): NativePtr
@SymbolName("openssl_kniBridge1059")
private external fun kniBridge1059(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1060")
private external fun kniBridge1060(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1061")
private external fun kniBridge1061(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1062")
private external fun kniBridge1062(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1063")
private external fun kniBridge1063(p0: Int): NativePtr
@SymbolName("openssl_kniBridge1064")
private external fun kniBridge1064(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1065")
private external fun kniBridge1065(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1066")
private external fun kniBridge1066(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("openssl_kniBridge1067")
private external fun kniBridge1067(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1068")
private external fun kniBridge1068(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge1069")
private external fun kniBridge1069(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1070")
private external fun kniBridge1070(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1071")
private external fun kniBridge1071(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1072")
private external fun kniBridge1072(): NativePtr
@SymbolName("openssl_kniBridge1073")
private external fun kniBridge1073(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1074")
private external fun kniBridge1074(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1075")
private external fun kniBridge1075(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1076")
private external fun kniBridge1076(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1077")
private external fun kniBridge1077(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("openssl_kniBridge1078")
private external fun kniBridge1078(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1079")
private external fun kniBridge1079(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1080")
private external fun kniBridge1080(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge1081")
private external fun kniBridge1081(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1082")
private external fun kniBridge1082(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1083")
private external fun kniBridge1083(): NativePtr
@SymbolName("openssl_kniBridge1084")
private external fun kniBridge1084(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1085")
private external fun kniBridge1085(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1086")
private external fun kniBridge1086(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1087")
private external fun kniBridge1087(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1088")
private external fun kniBridge1088(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1089")
private external fun kniBridge1089(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1090")
private external fun kniBridge1090(): NativePtr
@SymbolName("openssl_kniBridge1091")
private external fun kniBridge1091(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1092")
private external fun kniBridge1092(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1093")
private external fun kniBridge1093(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1094")
private external fun kniBridge1094(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1095")
private external fun kniBridge1095(p0: NativePtr, p1: Long): NativePtr
@SymbolName("openssl_kniBridge1096")
private external fun kniBridge1096(p0: NativePtr, p1: Long, p2: Int, p3: Long): NativePtr
@SymbolName("openssl_kniBridge1097")
private external fun kniBridge1097(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1098")
private external fun kniBridge1098(p0: NativePtr, p1: Long): Int
@SymbolName("openssl_kniBridge1099")
private external fun kniBridge1099(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1100")
private external fun kniBridge1100(p0: NativePtr, p1: Long): NativePtr
@SymbolName("openssl_kniBridge1101")
private external fun kniBridge1101(p0: NativePtr, p1: Long, p2: Int, p3: Long): NativePtr
@SymbolName("openssl_kniBridge1102")
private external fun kniBridge1102(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1103")
private external fun kniBridge1103(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1104")
private external fun kniBridge1104(): NativePtr
@SymbolName("openssl_kniBridge1105")
private external fun kniBridge1105(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1106")
private external fun kniBridge1106(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1107")
private external fun kniBridge1107(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1108")
private external fun kniBridge1108(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1109")
private external fun kniBridge1109(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1110")
private external fun kniBridge1110(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1111")
private external fun kniBridge1111(): NativePtr
@SymbolName("openssl_kniBridge1112")
private external fun kniBridge1112(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1113")
private external fun kniBridge1113(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1114")
private external fun kniBridge1114(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1115")
private external fun kniBridge1115(): NativePtr
@SymbolName("openssl_kniBridge1116")
private external fun kniBridge1116(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1117")
private external fun kniBridge1117(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1118")
private external fun kniBridge1118(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1119")
private external fun kniBridge1119(): NativePtr
@SymbolName("openssl_kniBridge1120")
private external fun kniBridge1120(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1121")
private external fun kniBridge1121(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1122")
private external fun kniBridge1122(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1123")
private external fun kniBridge1123(): NativePtr
@SymbolName("openssl_kniBridge1124")
private external fun kniBridge1124(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1125")
private external fun kniBridge1125(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1126")
private external fun kniBridge1126(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1127")
private external fun kniBridge1127(): NativePtr
@SymbolName("openssl_kniBridge1128")
private external fun kniBridge1128(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1129")
private external fun kniBridge1129(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1130")
private external fun kniBridge1130(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1131")
private external fun kniBridge1131(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1132")
private external fun kniBridge1132(p0: NativePtr, p1: Int, p2: ULong): Int
@SymbolName("openssl_kniBridge1133")
private external fun kniBridge1133(): NativePtr
@SymbolName("openssl_kniBridge1134")
private external fun kniBridge1134(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1135")
private external fun kniBridge1135(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1136")
private external fun kniBridge1136(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1137")
private external fun kniBridge1137(): NativePtr
@SymbolName("openssl_kniBridge1138")
private external fun kniBridge1138(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1139")
private external fun kniBridge1139(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1140")
private external fun kniBridge1140(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1141")
private external fun kniBridge1141(): NativePtr
@SymbolName("openssl_kniBridge1142")
private external fun kniBridge1142(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1143")
private external fun kniBridge1143(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1144")
private external fun kniBridge1144(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1145")
private external fun kniBridge1145(): NativePtr
@SymbolName("openssl_kniBridge1146")
private external fun kniBridge1146(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1147")
private external fun kniBridge1147(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1148")
private external fun kniBridge1148(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1149")
private external fun kniBridge1149(): NativePtr
@SymbolName("openssl_kniBridge1150")
private external fun kniBridge1150(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1151")
private external fun kniBridge1151(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1152")
private external fun kniBridge1152(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1153")
private external fun kniBridge1153(): NativePtr
@SymbolName("openssl_kniBridge1154")
private external fun kniBridge1154(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1155")
private external fun kniBridge1155(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1156")
private external fun kniBridge1156(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1157")
private external fun kniBridge1157(): NativePtr
@SymbolName("openssl_kniBridge1158")
private external fun kniBridge1158(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1159")
private external fun kniBridge1159(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1160")
private external fun kniBridge1160(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1161")
private external fun kniBridge1161(): NativePtr
@SymbolName("openssl_kniBridge1162")
private external fun kniBridge1162(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1163")
private external fun kniBridge1163(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1164")
private external fun kniBridge1164(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1165")
private external fun kniBridge1165(): NativePtr
@SymbolName("openssl_kniBridge1166")
private external fun kniBridge1166(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1167")
private external fun kniBridge1167(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1168")
private external fun kniBridge1168(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1169")
private external fun kniBridge1169(): NativePtr
@SymbolName("openssl_kniBridge1170")
private external fun kniBridge1170(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1171")
private external fun kniBridge1171(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1172")
private external fun kniBridge1172(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1173")
private external fun kniBridge1173(p0: NativePtr, p1: Long): NativePtr
@SymbolName("openssl_kniBridge1174")
private external fun kniBridge1174(p0: NativePtr, p1: Long, p2: Int, p3: Long): NativePtr
@SymbolName("openssl_kniBridge1175")
private external fun kniBridge1175(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1176")
private external fun kniBridge1176(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1177")
private external fun kniBridge1177(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1178")
private external fun kniBridge1178(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1179")
private external fun kniBridge1179(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge1180")
private external fun kniBridge1180(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1181")
private external fun kniBridge1181(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge1182")
private external fun kniBridge1182(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1183")
private external fun kniBridge1183(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge1184")
private external fun kniBridge1184(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1185")
private external fun kniBridge1185(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1186")
private external fun kniBridge1186(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge1187")
private external fun kniBridge1187(p0: Int, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1188")
private external fun kniBridge1188(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1189")
private external fun kniBridge1189(p0: NativePtr, p1: Long): Int
@SymbolName("openssl_kniBridge1190")
private external fun kniBridge1190(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1191")
private external fun kniBridge1191(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge1192")
private external fun kniBridge1192(p0: NativePtr, p1: Long): Int
@SymbolName("openssl_kniBridge1193")
private external fun kniBridge1193(p0: NativePtr): Long
@SymbolName("openssl_kniBridge1194")
private external fun kniBridge1194(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1195")
private external fun kniBridge1195(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1196")
private external fun kniBridge1196(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1197")
private external fun kniBridge1197(p0: NativePtr, p1: Long): Int
@SymbolName("openssl_kniBridge1198")
private external fun kniBridge1198(p0: NativePtr, p1: Long): Int
@SymbolName("openssl_kniBridge1199")
private external fun kniBridge1199(p0: NativePtr): Long
@SymbolName("openssl_kniBridge1200")
private external fun kniBridge1200(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1201")
private external fun kniBridge1201(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1202")
private external fun kniBridge1202(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1203")
private external fun kniBridge1203(p0: Int): ULong
@SymbolName("openssl_kniBridge1204")
private external fun kniBridge1204(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Long): Int
@SymbolName("openssl_kniBridge1205")
private external fun kniBridge1205(p0: NativePtr, p1: Long): Int
@SymbolName("openssl_kniBridge1206")
private external fun kniBridge1206(p0: NativePtr, p1: Long): Int
@SymbolName("openssl_kniBridge1207")
private external fun kniBridge1207(p0: NativePtr, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("openssl_kniBridge1208")
private external fun kniBridge1208(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1209")
private external fun kniBridge1209(p0: Int, p1: Int, p2: Int): Int
@SymbolName("openssl_kniBridge1210")
private external fun kniBridge1210(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1211")
private external fun kniBridge1211(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1212")
private external fun kniBridge1212(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1213")
private external fun kniBridge1213(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1214")
private external fun kniBridge1214(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1215")
private external fun kniBridge1215(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1216")
private external fun kniBridge1216(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge1217")
private external fun kniBridge1217(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1218")
private external fun kniBridge1218(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1219")
private external fun kniBridge1219(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1220")
private external fun kniBridge1220(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1221")
private external fun kniBridge1221(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1222")
private external fun kniBridge1222(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1223")
private external fun kniBridge1223(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1224")
private external fun kniBridge1224(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1225")
private external fun kniBridge1225(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1226")
private external fun kniBridge1226(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge1227")
private external fun kniBridge1227(p0: NativePtr, p1: NativePtr, p2: ULong, p3: Int): Int
@SymbolName("openssl_kniBridge1228")
private external fun kniBridge1228(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge1229")
private external fun kniBridge1229(p0: NativePtr, p1: NativePtr, p2: Long, p3: Int): Int
@SymbolName("openssl_kniBridge1230")
private external fun kniBridge1230(p0: NativePtr, p1: NativePtr, p2: Long, p3: Int, p4: Int): Int
@SymbolName("openssl_kniBridge1231")
private external fun kniBridge1231(p0: Int): NativePtr
@SymbolName("openssl_kniBridge1232")
private external fun kniBridge1232(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1233")
private external fun kniBridge1233(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1234")
private external fun kniBridge1234(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1235")
private external fun kniBridge1235(p0: NativePtr, p1: Long, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge1236")
private external fun kniBridge1236(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge1237")
private external fun kniBridge1237(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1238")
private external fun kniBridge1238(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1239")
private external fun kniBridge1239(p0: ULong): Unit
@SymbolName("openssl_kniBridge1240")
private external fun kniBridge1240(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1241")
private external fun kniBridge1241(): ULong
@SymbolName("openssl_kniBridge1242")
private external fun kniBridge1242(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: ULong): Int
@SymbolName("openssl_kniBridge1243")
private external fun kniBridge1243(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: ULong, p5: Long, p6: Long): Int
@SymbolName("openssl_kniBridge1244")
private external fun kniBridge1244(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: Int): NativePtr
@SymbolName("openssl_kniBridge1245")
private external fun kniBridge1245(p0: Int): NativePtr
@SymbolName("openssl_kniBridge1246")
private external fun kniBridge1246(p0: Int, p1: Long, p2: Long, p3: ULong, p4: ULong): Int
@SymbolName("openssl_kniBridge1247")
private external fun kniBridge1247(): Unit
@SymbolName("openssl_kniBridge1248")
private external fun kniBridge1248(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1249")
private external fun kniBridge1249(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1250")
private external fun kniBridge1250(p0: NativePtr, p1: NativePtr, p2: Long, p3: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1251")
private external fun kniBridge1251(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1252")
private external fun kniBridge1252(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1253")
private external fun kniBridge1253(): Unit
@SymbolName("openssl_kniBridge1254")
private external fun kniBridge1254(): Unit
@SymbolName("openssl_kniBridge1255")
private external fun kniBridge1255(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1256")
private external fun kniBridge1256(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1257")
private external fun kniBridge1257(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1258")
private external fun kniBridge1258(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge1259")
private external fun kniBridge1259(): NativePtr
@SymbolName("openssl_kniBridge1260")
private external fun kniBridge1260(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1261")
private external fun kniBridge1261(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1262")
private external fun kniBridge1262(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1263")
private external fun kniBridge1263(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1264")
private external fun kniBridge1264(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1265")
private external fun kniBridge1265(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1266")
private external fun kniBridge1266(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1267")
private external fun kniBridge1267(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1268")
private external fun kniBridge1268(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1269")
private external fun kniBridge1269(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1270")
private external fun kniBridge1270(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1271")
private external fun kniBridge1271(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1272")
private external fun kniBridge1272(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1273")
private external fun kniBridge1273(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1274")
private external fun kniBridge1274(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1275")
private external fun kniBridge1275(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1276")
private external fun kniBridge1276(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1277")
private external fun kniBridge1277(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1278")
private external fun kniBridge1278(): NativePtr
@SymbolName("openssl_kniBridge1279")
private external fun kniBridge1279(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1280")
private external fun kniBridge1280(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: NativePtr): Int
@SymbolName("openssl_kniBridge1281")
private external fun kniBridge1281(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge1282")
private external fun kniBridge1282(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: Int, p5: Int, p6: NativePtr, p7: NativePtr): Int
@SymbolName("openssl_kniBridge1283")
private external fun kniBridge1283(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1284")
private external fun kniBridge1284(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1285")
private external fun kniBridge1285(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1286")
private external fun kniBridge1286(): Int
@SymbolName("openssl_kniBridge1287")
private external fun kniBridge1287(): Int
@SymbolName("openssl_kniBridge1288")
private external fun kniBridge1288(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1289")
private external fun kniBridge1289(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1290")
private external fun kniBridge1290(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1291")
private external fun kniBridge1291(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1292")
private external fun kniBridge1292(p0: Int): Unit
@SymbolName("openssl_kniBridge1293")
private external fun kniBridge1293(p0: Int, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1294")
private external fun kniBridge1294(p0: Int, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1295")
private external fun kniBridge1295(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1296")
private external fun kniBridge1296(p0: Int): NativePtr
@SymbolName("openssl_kniBridge1297")
private external fun kniBridge1297(p0: Int): NativePtr
@SymbolName("openssl_kniBridge1298")
private external fun kniBridge1298(p0: Int): NativePtr
@SymbolName("openssl_kniBridge1299")
private external fun kniBridge1299(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1300")
private external fun kniBridge1300(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1301")
private external fun kniBridge1301(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge1302")
private external fun kniBridge1302(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1303")
private external fun kniBridge1303(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1304")
private external fun kniBridge1304(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1305")
private external fun kniBridge1305(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1306")
private external fun kniBridge1306(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1307")
private external fun kniBridge1307(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: NativePtr, p5: Int): NativePtr
@SymbolName("openssl_kniBridge1308")
private external fun kniBridge1308(p0: Int): Int
@SymbolName("openssl_kniBridge1309")
private external fun kniBridge1309(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1310")
private external fun kniBridge1310(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1311")
private external fun kniBridge1311(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1312")
private external fun kniBridge1312(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1313")
private external fun kniBridge1313(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1314")
private external fun kniBridge1314(p0: Int, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1315")
private external fun kniBridge1315(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("openssl_kniBridge1316")
private external fun kniBridge1316(p0: Int, p1: Int, p2: Int): Int
@SymbolName("openssl_kniBridge1317")
private external fun kniBridge1317(): Unit
@SymbolName("openssl_kniBridge1318")
private external fun kniBridge1318(): Int
@SymbolName("openssl_kniBridge1319")
private external fun kniBridge1319(p0: Int, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1320")
private external fun kniBridge1320(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1321")
private external fun kniBridge1321(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1322")
private external fun kniBridge1322(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1323")
private external fun kniBridge1323(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1324")
private external fun kniBridge1324(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1325")
private external fun kniBridge1325(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge1326")
private external fun kniBridge1326(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1327")
private external fun kniBridge1327(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1328")
private external fun kniBridge1328(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1329")
private external fun kniBridge1329(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1330")
private external fun kniBridge1330(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1331")
private external fun kniBridge1331(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1332")
private external fun kniBridge1332(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1333")
private external fun kniBridge1333(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1334")
private external fun kniBridge1334(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1335")
private external fun kniBridge1335(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1336")
private external fun kniBridge1336(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1337")
private external fun kniBridge1337(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1338")
private external fun kniBridge1338(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1339")
private external fun kniBridge1339(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1340")
private external fun kniBridge1340(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1341")
private external fun kniBridge1341(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1342")
private external fun kniBridge1342(p0: Int, p1: Int, p2: Int): NativePtr
@SymbolName("openssl_kniBridge1343")
private external fun kniBridge1343(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1344")
private external fun kniBridge1344(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1345")
private external fun kniBridge1345(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1346")
private external fun kniBridge1346(p0: NativePtr, p1: ULong): Int
@SymbolName("openssl_kniBridge1347")
private external fun kniBridge1347(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1348")
private external fun kniBridge1348(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1349")
private external fun kniBridge1349(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1350")
private external fun kniBridge1350(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1351")
private external fun kniBridge1351(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1352")
private external fun kniBridge1352(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1353")
private external fun kniBridge1353(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1354")
private external fun kniBridge1354(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1355")
private external fun kniBridge1355(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1356")
private external fun kniBridge1356(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1357")
private external fun kniBridge1357(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1358")
private external fun kniBridge1358(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1359")
private external fun kniBridge1359(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1360")
private external fun kniBridge1360(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1361")
private external fun kniBridge1361(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1362")
private external fun kniBridge1362(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1363")
private external fun kniBridge1363(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1364")
private external fun kniBridge1364(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1365")
private external fun kniBridge1365(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1366")
private external fun kniBridge1366(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1367")
private external fun kniBridge1367(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1368")
private external fun kniBridge1368(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1369")
private external fun kniBridge1369(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1370")
private external fun kniBridge1370(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1371")
private external fun kniBridge1371(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1372")
private external fun kniBridge1372(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1373")
private external fun kniBridge1373(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1374")
private external fun kniBridge1374(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1375")
private external fun kniBridge1375(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1376")
private external fun kniBridge1376(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1377")
private external fun kniBridge1377(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1378")
private external fun kniBridge1378(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1379")
private external fun kniBridge1379(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1380")
private external fun kniBridge1380(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1381")
private external fun kniBridge1381(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1382")
private external fun kniBridge1382(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1383")
private external fun kniBridge1383(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1384")
private external fun kniBridge1384(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1385")
private external fun kniBridge1385(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1386")
private external fun kniBridge1386(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1387")
private external fun kniBridge1387(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge1388")
private external fun kniBridge1388(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1389")
private external fun kniBridge1389(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1390")
private external fun kniBridge1390(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1391")
private external fun kniBridge1391(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1392")
private external fun kniBridge1392(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1393")
private external fun kniBridge1393(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: UInt): Int
@SymbolName("openssl_kniBridge1394")
private external fun kniBridge1394(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1395")
private external fun kniBridge1395(): NativePtr
@SymbolName("openssl_kniBridge1396")
private external fun kniBridge1396(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1397")
private external fun kniBridge1397(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1398")
private external fun kniBridge1398(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1399")
private external fun kniBridge1399(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge1400")
private external fun kniBridge1400(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge1401")
private external fun kniBridge1401(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1402")
private external fun kniBridge1402(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1403")
private external fun kniBridge1403(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge1404")
private external fun kniBridge1404(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1405")
private external fun kniBridge1405(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge1406")
private external fun kniBridge1406(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1407")
private external fun kniBridge1407(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1408")
private external fun kniBridge1408(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1409")
private external fun kniBridge1409(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("openssl_kniBridge1410")
private external fun kniBridge1410(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge1411")
private external fun kniBridge1411(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1412")
private external fun kniBridge1412(): NativePtr
@SymbolName("openssl_kniBridge1413")
private external fun kniBridge1413(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int, p5: Int, p6: NativePtr, p7: NativePtr): Int
@SymbolName("openssl_kniBridge1414")
private external fun kniBridge1414(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge1415")
private external fun kniBridge1415(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge1416")
private external fun kniBridge1416(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1417")
private external fun kniBridge1417(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1418")
private external fun kniBridge1418(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge1419")
private external fun kniBridge1419(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge1420")
private external fun kniBridge1420(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1421")
private external fun kniBridge1421(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1422")
private external fun kniBridge1422(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1423")
private external fun kniBridge1423(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge1424")
private external fun kniBridge1424(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge1425")
private external fun kniBridge1425(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1426")
private external fun kniBridge1426(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1427")
private external fun kniBridge1427(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge1428")
private external fun kniBridge1428(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: Int): Int
@SymbolName("openssl_kniBridge1429")
private external fun kniBridge1429(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge1430")
private external fun kniBridge1430(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1431")
private external fun kniBridge1431(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1432")
private external fun kniBridge1432(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1433")
private external fun kniBridge1433(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1434")
private external fun kniBridge1434(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge1435")
private external fun kniBridge1435(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1436")
private external fun kniBridge1436(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge1437")
private external fun kniBridge1437(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge1438")
private external fun kniBridge1438(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge1439")
private external fun kniBridge1439(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1440")
private external fun kniBridge1440(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: Int): Int
@SymbolName("openssl_kniBridge1441")
private external fun kniBridge1441(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1442")
private external fun kniBridge1442(): NativePtr
@SymbolName("openssl_kniBridge1443")
private external fun kniBridge1443(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1444")
private external fun kniBridge1444(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1445")
private external fun kniBridge1445(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1446")
private external fun kniBridge1446(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1447")
private external fun kniBridge1447(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge1448")
private external fun kniBridge1448(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1449")
private external fun kniBridge1449(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1450")
private external fun kniBridge1450(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1451")
private external fun kniBridge1451(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge1452")
private external fun kniBridge1452(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1453")
private external fun kniBridge1453(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1454")
private external fun kniBridge1454(): NativePtr
@SymbolName("openssl_kniBridge1455")
private external fun kniBridge1455(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1456")
private external fun kniBridge1456(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1457")
private external fun kniBridge1457(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1458")
private external fun kniBridge1458(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1459")
private external fun kniBridge1459(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1460")
private external fun kniBridge1460(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1461")
private external fun kniBridge1461(): NativePtr
@SymbolName("openssl_kniBridge1462")
private external fun kniBridge1462(): NativePtr
@SymbolName("openssl_kniBridge1463")
private external fun kniBridge1463(): NativePtr
@SymbolName("openssl_kniBridge1464")
private external fun kniBridge1464(): NativePtr
@SymbolName("openssl_kniBridge1465")
private external fun kniBridge1465(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("openssl_kniBridge1466")
private external fun kniBridge1466(): NativePtr
@SymbolName("openssl_kniBridge1467")
private external fun kniBridge1467(): NativePtr
@SymbolName("openssl_kniBridge1468")
private external fun kniBridge1468(): NativePtr
@SymbolName("openssl_kniBridge1469")
private external fun kniBridge1469(): NativePtr
@SymbolName("openssl_kniBridge1470")
private external fun kniBridge1470(): NativePtr
@SymbolName("openssl_kniBridge1471")
private external fun kniBridge1471(): NativePtr
@SymbolName("openssl_kniBridge1472")
private external fun kniBridge1472(): NativePtr
@SymbolName("openssl_kniBridge1473")
private external fun kniBridge1473(): NativePtr
@SymbolName("openssl_kniBridge1474")
private external fun kniBridge1474(): NativePtr
@SymbolName("openssl_kniBridge1475")
private external fun kniBridge1475(): NativePtr
@SymbolName("openssl_kniBridge1476")
private external fun kniBridge1476(): NativePtr
@SymbolName("openssl_kniBridge1477")
private external fun kniBridge1477(): NativePtr
@SymbolName("openssl_kniBridge1478")
private external fun kniBridge1478(): NativePtr
@SymbolName("openssl_kniBridge1479")
private external fun kniBridge1479(): NativePtr
@SymbolName("openssl_kniBridge1480")
private external fun kniBridge1480(): NativePtr
@SymbolName("openssl_kniBridge1481")
private external fun kniBridge1481(): NativePtr
@SymbolName("openssl_kniBridge1482")
private external fun kniBridge1482(): NativePtr
@SymbolName("openssl_kniBridge1483")
private external fun kniBridge1483(): NativePtr
@SymbolName("openssl_kniBridge1484")
private external fun kniBridge1484(): NativePtr
@SymbolName("openssl_kniBridge1485")
private external fun kniBridge1485(): NativePtr
@SymbolName("openssl_kniBridge1486")
private external fun kniBridge1486(): NativePtr
@SymbolName("openssl_kniBridge1487")
private external fun kniBridge1487(): NativePtr
@SymbolName("openssl_kniBridge1488")
private external fun kniBridge1488(): NativePtr
@SymbolName("openssl_kniBridge1489")
private external fun kniBridge1489(): NativePtr
@SymbolName("openssl_kniBridge1490")
private external fun kniBridge1490(): NativePtr
@SymbolName("openssl_kniBridge1491")
private external fun kniBridge1491(): NativePtr
@SymbolName("openssl_kniBridge1492")
private external fun kniBridge1492(): NativePtr
@SymbolName("openssl_kniBridge1493")
private external fun kniBridge1493(): NativePtr
@SymbolName("openssl_kniBridge1494")
private external fun kniBridge1494(): NativePtr
@SymbolName("openssl_kniBridge1495")
private external fun kniBridge1495(): NativePtr
@SymbolName("openssl_kniBridge1496")
private external fun kniBridge1496(): NativePtr
@SymbolName("openssl_kniBridge1497")
private external fun kniBridge1497(): NativePtr
@SymbolName("openssl_kniBridge1498")
private external fun kniBridge1498(): NativePtr
@SymbolName("openssl_kniBridge1499")
private external fun kniBridge1499(): NativePtr
@SymbolName("openssl_kniBridge1500")
private external fun kniBridge1500(): NativePtr
@SymbolName("openssl_kniBridge1501")
private external fun kniBridge1501(): NativePtr
@SymbolName("openssl_kniBridge1502")
private external fun kniBridge1502(): NativePtr
@SymbolName("openssl_kniBridge1503")
private external fun kniBridge1503(): NativePtr
@SymbolName("openssl_kniBridge1504")
private external fun kniBridge1504(): NativePtr
@SymbolName("openssl_kniBridge1505")
private external fun kniBridge1505(): NativePtr
@SymbolName("openssl_kniBridge1506")
private external fun kniBridge1506(): NativePtr
@SymbolName("openssl_kniBridge1507")
private external fun kniBridge1507(): NativePtr
@SymbolName("openssl_kniBridge1508")
private external fun kniBridge1508(): NativePtr
@SymbolName("openssl_kniBridge1509")
private external fun kniBridge1509(): NativePtr
@SymbolName("openssl_kniBridge1510")
private external fun kniBridge1510(): NativePtr
@SymbolName("openssl_kniBridge1511")
private external fun kniBridge1511(): NativePtr
@SymbolName("openssl_kniBridge1512")
private external fun kniBridge1512(): NativePtr
@SymbolName("openssl_kniBridge1513")
private external fun kniBridge1513(): NativePtr
@SymbolName("openssl_kniBridge1514")
private external fun kniBridge1514(): NativePtr
@SymbolName("openssl_kniBridge1515")
private external fun kniBridge1515(): NativePtr
@SymbolName("openssl_kniBridge1516")
private external fun kniBridge1516(): NativePtr
@SymbolName("openssl_kniBridge1517")
private external fun kniBridge1517(): NativePtr
@SymbolName("openssl_kniBridge1518")
private external fun kniBridge1518(): NativePtr
@SymbolName("openssl_kniBridge1519")
private external fun kniBridge1519(): NativePtr
@SymbolName("openssl_kniBridge1520")
private external fun kniBridge1520(): NativePtr
@SymbolName("openssl_kniBridge1521")
private external fun kniBridge1521(): NativePtr
@SymbolName("openssl_kniBridge1522")
private external fun kniBridge1522(): NativePtr
@SymbolName("openssl_kniBridge1523")
private external fun kniBridge1523(): NativePtr
@SymbolName("openssl_kniBridge1524")
private external fun kniBridge1524(): NativePtr
@SymbolName("openssl_kniBridge1525")
private external fun kniBridge1525(): NativePtr
@SymbolName("openssl_kniBridge1526")
private external fun kniBridge1526(): NativePtr
@SymbolName("openssl_kniBridge1527")
private external fun kniBridge1527(): NativePtr
@SymbolName("openssl_kniBridge1528")
private external fun kniBridge1528(): NativePtr
@SymbolName("openssl_kniBridge1529")
private external fun kniBridge1529(): NativePtr
@SymbolName("openssl_kniBridge1530")
private external fun kniBridge1530(): NativePtr
@SymbolName("openssl_kniBridge1531")
private external fun kniBridge1531(): NativePtr
@SymbolName("openssl_kniBridge1532")
private external fun kniBridge1532(): NativePtr
@SymbolName("openssl_kniBridge1533")
private external fun kniBridge1533(): NativePtr
@SymbolName("openssl_kniBridge1534")
private external fun kniBridge1534(): NativePtr
@SymbolName("openssl_kniBridge1535")
private external fun kniBridge1535(): NativePtr
@SymbolName("openssl_kniBridge1536")
private external fun kniBridge1536(): NativePtr
@SymbolName("openssl_kniBridge1537")
private external fun kniBridge1537(): NativePtr
@SymbolName("openssl_kniBridge1538")
private external fun kniBridge1538(): NativePtr
@SymbolName("openssl_kniBridge1539")
private external fun kniBridge1539(): NativePtr
@SymbolName("openssl_kniBridge1540")
private external fun kniBridge1540(): NativePtr
@SymbolName("openssl_kniBridge1541")
private external fun kniBridge1541(): NativePtr
@SymbolName("openssl_kniBridge1542")
private external fun kniBridge1542(): NativePtr
@SymbolName("openssl_kniBridge1543")
private external fun kniBridge1543(): NativePtr
@SymbolName("openssl_kniBridge1544")
private external fun kniBridge1544(): NativePtr
@SymbolName("openssl_kniBridge1545")
private external fun kniBridge1545(): NativePtr
@SymbolName("openssl_kniBridge1546")
private external fun kniBridge1546(): NativePtr
@SymbolName("openssl_kniBridge1547")
private external fun kniBridge1547(): NativePtr
@SymbolName("openssl_kniBridge1548")
private external fun kniBridge1548(): NativePtr
@SymbolName("openssl_kniBridge1549")
private external fun kniBridge1549(): NativePtr
@SymbolName("openssl_kniBridge1550")
private external fun kniBridge1550(): NativePtr
@SymbolName("openssl_kniBridge1551")
private external fun kniBridge1551(): NativePtr
@SymbolName("openssl_kniBridge1552")
private external fun kniBridge1552(): NativePtr
@SymbolName("openssl_kniBridge1553")
private external fun kniBridge1553(): NativePtr
@SymbolName("openssl_kniBridge1554")
private external fun kniBridge1554(): NativePtr
@SymbolName("openssl_kniBridge1555")
private external fun kniBridge1555(): NativePtr
@SymbolName("openssl_kniBridge1556")
private external fun kniBridge1556(): NativePtr
@SymbolName("openssl_kniBridge1557")
private external fun kniBridge1557(): NativePtr
@SymbolName("openssl_kniBridge1558")
private external fun kniBridge1558(): NativePtr
@SymbolName("openssl_kniBridge1559")
private external fun kniBridge1559(): NativePtr
@SymbolName("openssl_kniBridge1560")
private external fun kniBridge1560(): NativePtr
@SymbolName("openssl_kniBridge1561")
private external fun kniBridge1561(): NativePtr
@SymbolName("openssl_kniBridge1562")
private external fun kniBridge1562(): NativePtr
@SymbolName("openssl_kniBridge1563")
private external fun kniBridge1563(): NativePtr
@SymbolName("openssl_kniBridge1564")
private external fun kniBridge1564(): NativePtr
@SymbolName("openssl_kniBridge1565")
private external fun kniBridge1565(): NativePtr
@SymbolName("openssl_kniBridge1566")
private external fun kniBridge1566(): NativePtr
@SymbolName("openssl_kniBridge1567")
private external fun kniBridge1567(): NativePtr
@SymbolName("openssl_kniBridge1568")
private external fun kniBridge1568(): NativePtr
@SymbolName("openssl_kniBridge1569")
private external fun kniBridge1569(): NativePtr
@SymbolName("openssl_kniBridge1570")
private external fun kniBridge1570(): NativePtr
@SymbolName("openssl_kniBridge1571")
private external fun kniBridge1571(): NativePtr
@SymbolName("openssl_kniBridge1572")
private external fun kniBridge1572(): NativePtr
@SymbolName("openssl_kniBridge1573")
private external fun kniBridge1573(): NativePtr
@SymbolName("openssl_kniBridge1574")
private external fun kniBridge1574(): NativePtr
@SymbolName("openssl_kniBridge1575")
private external fun kniBridge1575(): NativePtr
@SymbolName("openssl_kniBridge1576")
private external fun kniBridge1576(): NativePtr
@SymbolName("openssl_kniBridge1577")
private external fun kniBridge1577(): NativePtr
@SymbolName("openssl_kniBridge1578")
private external fun kniBridge1578(): NativePtr
@SymbolName("openssl_kniBridge1579")
private external fun kniBridge1579(): NativePtr
@SymbolName("openssl_kniBridge1580")
private external fun kniBridge1580(): NativePtr
@SymbolName("openssl_kniBridge1581")
private external fun kniBridge1581(): NativePtr
@SymbolName("openssl_kniBridge1582")
private external fun kniBridge1582(): NativePtr
@SymbolName("openssl_kniBridge1583")
private external fun kniBridge1583(): NativePtr
@SymbolName("openssl_kniBridge1584")
private external fun kniBridge1584(): NativePtr
@SymbolName("openssl_kniBridge1585")
private external fun kniBridge1585(): NativePtr
@SymbolName("openssl_kniBridge1586")
private external fun kniBridge1586(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1587")
private external fun kniBridge1587(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1588")
private external fun kniBridge1588(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1589")
private external fun kniBridge1589(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1590")
private external fun kniBridge1590(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1591")
private external fun kniBridge1591(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1592")
private external fun kniBridge1592(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1593")
private external fun kniBridge1593(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1594")
private external fun kniBridge1594(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1595")
private external fun kniBridge1595(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1596")
private external fun kniBridge1596(p0: Int): Int
@SymbolName("openssl_kniBridge1597")
private external fun kniBridge1597(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1598")
private external fun kniBridge1598(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1599")
private external fun kniBridge1599(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1600")
private external fun kniBridge1600(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1601")
private external fun kniBridge1601(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1602")
private external fun kniBridge1602(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1603")
private external fun kniBridge1603(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1604")
private external fun kniBridge1604(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1605")
private external fun kniBridge1605(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1606")
private external fun kniBridge1606(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1607")
private external fun kniBridge1607(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1608")
private external fun kniBridge1608(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1609")
private external fun kniBridge1609(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1610")
private external fun kniBridge1610(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1611")
private external fun kniBridge1611(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1612")
private external fun kniBridge1612(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1613")
private external fun kniBridge1613(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1614")
private external fun kniBridge1614(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1615")
private external fun kniBridge1615(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1616")
private external fun kniBridge1616(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1617")
private external fun kniBridge1617(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1618")
private external fun kniBridge1618(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1619")
private external fun kniBridge1619(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1620")
private external fun kniBridge1620(): NativePtr
@SymbolName("openssl_kniBridge1621")
private external fun kniBridge1621(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1622")
private external fun kniBridge1622(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1623")
private external fun kniBridge1623(p0: Int, p1: NativePtr, p2: NativePtr, p3: Long): NativePtr
@SymbolName("openssl_kniBridge1624")
private external fun kniBridge1624(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1625")
private external fun kniBridge1625(p0: Int, p1: NativePtr, p2: NativePtr, p3: Long): NativePtr
@SymbolName("openssl_kniBridge1626")
private external fun kniBridge1626(p0: NativePtr, p1: NativePtr, p2: Long): NativePtr
@SymbolName("openssl_kniBridge1627")
private external fun kniBridge1627(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1628")
private external fun kniBridge1628(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1629")
private external fun kniBridge1629(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1630")
private external fun kniBridge1630(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1631")
private external fun kniBridge1631(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1632")
private external fun kniBridge1632(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1633")
private external fun kniBridge1633(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1634")
private external fun kniBridge1634(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1635")
private external fun kniBridge1635(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1636")
private external fun kniBridge1636(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1637")
private external fun kniBridge1637(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge1638")
private external fun kniBridge1638(p0: NativePtr, p1: NativePtr): ULong
@SymbolName("openssl_kniBridge1639")
private external fun kniBridge1639(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1640")
private external fun kniBridge1640(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1641")
private external fun kniBridge1641(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1642")
private external fun kniBridge1642(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1643")
private external fun kniBridge1643(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1644")
private external fun kniBridge1644(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: Int): Int
@SymbolName("openssl_kniBridge1645")
private external fun kniBridge1645(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: Int, p5: Int, p6: NativePtr): Int
@SymbolName("openssl_kniBridge1646")
private external fun kniBridge1646(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: Int, p5: NativePtr, p6: Int, p7: NativePtr): Int
@SymbolName("openssl_kniBridge1647")
private external fun kniBridge1647(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: Int): Int
@SymbolName("openssl_kniBridge1648")
private external fun kniBridge1648(p0: NativePtr, p1: ULong, p2: NativePtr, p3: ULong, p4: ULong, p5: ULong, p6: ULong, p7: ULong, p8: NativePtr, p9: ULong): Int
@SymbolName("openssl_kniBridge1649")
private external fun kniBridge1649(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: Int): Int
@SymbolName("openssl_kniBridge1650")
private external fun kniBridge1650(): Unit
@SymbolName("openssl_kniBridge1651")
private external fun kniBridge1651(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr, p5: Int): Int
@SymbolName("openssl_kniBridge1652")
private external fun kniBridge1652(p0: Int, p1: Int, p2: Int, p3: Int, p4: NativePtr): Int
@SymbolName("openssl_kniBridge1653")
private external fun kniBridge1653(p0: Int, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1654")
private external fun kniBridge1654(p0: Int, p1: Int, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge1655")
private external fun kniBridge1655(): Unit
@SymbolName("openssl_kniBridge1656")
private external fun kniBridge1656(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge1657")
private external fun kniBridge1657(): Int
@SymbolName("openssl_kniBridge1658")
private external fun kniBridge1658(p0: Int): NativePtr
@SymbolName("openssl_kniBridge1659")
private external fun kniBridge1659(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1660")
private external fun kniBridge1660(p0: NativePtr, p1: NativePtr, p2: Int): NativePtr
@SymbolName("openssl_kniBridge1661")
private external fun kniBridge1661(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1662")
private external fun kniBridge1662(p0: Int, p1: Int): Int
@SymbolName("openssl_kniBridge1663")
private external fun kniBridge1663(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("openssl_kniBridge1664")
private external fun kniBridge1664(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1665")
private external fun kniBridge1665(p0: Int, p1: Int, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1666")
private external fun kniBridge1666(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1667")
private external fun kniBridge1667(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1668")
private external fun kniBridge1668(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("openssl_kniBridge1669")
private external fun kniBridge1669(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openssl_kniBridge1670")
private external fun kniBridge1670(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("openssl_kniBridge1671")
private external fun kniBridge1671(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1672")
private external fun kniBridge1672(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1673")
private external fun kniBridge1673(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1674")
private external fun kniBridge1674(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1675")
private external fun kniBridge1675(p0: Int): NativePtr
@SymbolName("openssl_kniBridge1676")
private external fun kniBridge1676(p0: Int, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1677")
private external fun kniBridge1677(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1678")
private external fun kniBridge1678(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1679")
private external fun kniBridge1679(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1680")
private external fun kniBridge1680(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1681")
private external fun kniBridge1681(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1682")
private external fun kniBridge1682(p0: Int, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1683")
private external fun kniBridge1683(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1684")
private external fun kniBridge1684(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1685")
private external fun kniBridge1685(p0: NativePtr, p1: Int, p2: Int, p3: Int, p4: Int, p5: NativePtr): Int
@SymbolName("openssl_kniBridge1686")
private external fun kniBridge1686(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1687")
private external fun kniBridge1687(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1688")
private external fun kniBridge1688(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1689")
private external fun kniBridge1689(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1690")
private external fun kniBridge1690(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("openssl_kniBridge1691")
private external fun kniBridge1691(p0: Int, p1: NativePtr, p2: NativePtr, p3: Int): NativePtr
@SymbolName("openssl_kniBridge1692")
private external fun kniBridge1692(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1693")
private external fun kniBridge1693(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1694")
private external fun kniBridge1694(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1695")
private external fun kniBridge1695(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1696")
private external fun kniBridge1696(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1697")
private external fun kniBridge1697(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1698")
private external fun kniBridge1698(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1699")
private external fun kniBridge1699(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: ULong): Int
@SymbolName("openssl_kniBridge1700")
private external fun kniBridge1700(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1701")
private external fun kniBridge1701(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr, p4: ULong): Int
@SymbolName("openssl_kniBridge1702")
private external fun kniBridge1702(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1703")
private external fun kniBridge1703(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: ULong): Int
@SymbolName("openssl_kniBridge1704")
private external fun kniBridge1704(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1705")
private external fun kniBridge1705(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: ULong): Int
@SymbolName("openssl_kniBridge1706")
private external fun kniBridge1706(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1707")
private external fun kniBridge1707(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: ULong): Int
@SymbolName("openssl_kniBridge1708")
private external fun kniBridge1708(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1709")
private external fun kniBridge1709(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1710")
private external fun kniBridge1710(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1711")
private external fun kniBridge1711(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1712")
private external fun kniBridge1712(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1713")
private external fun kniBridge1713(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1714")
private external fun kniBridge1714(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1715")
private external fun kniBridge1715(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1716")
private external fun kniBridge1716(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1717")
private external fun kniBridge1717(p0: NativePtr, p1: Int): Int
@SymbolName("openssl_kniBridge1718")
private external fun kniBridge1718(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1719")
private external fun kniBridge1719(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1720")
private external fun kniBridge1720(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1721")
private external fun kniBridge1721(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1722")
private external fun kniBridge1722(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1723")
private external fun kniBridge1723(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1724")
private external fun kniBridge1724(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1725")
private external fun kniBridge1725(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1726")
private external fun kniBridge1726(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1727")
private external fun kniBridge1727(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1728")
private external fun kniBridge1728(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1729")
private external fun kniBridge1729(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1730")
private external fun kniBridge1730(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1731")
private external fun kniBridge1731(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1732")
private external fun kniBridge1732(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1733")
private external fun kniBridge1733(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1734")
private external fun kniBridge1734(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1735")
private external fun kniBridge1735(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1736")
private external fun kniBridge1736(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1737")
private external fun kniBridge1737(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1738")
private external fun kniBridge1738(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1739")
private external fun kniBridge1739(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1740")
private external fun kniBridge1740(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1741")
private external fun kniBridge1741(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1742")
private external fun kniBridge1742(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1743")
private external fun kniBridge1743(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1744")
private external fun kniBridge1744(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1745")
private external fun kniBridge1745(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1746")
private external fun kniBridge1746(): Unit
@SymbolName("openssl_kniBridge1747")
private external fun kniBridge1747(): Int
@SymbolName("openssl_kniBridge1748")
private external fun kniBridge1748(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1749")
private external fun kniBridge1749(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1750")
private external fun kniBridge1750(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1751")
private external fun kniBridge1751(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1752")
private external fun kniBridge1752(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1753")
private external fun kniBridge1753(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1754")
private external fun kniBridge1754(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1755")
private external fun kniBridge1755(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openssl_kniBridge1756")
private external fun kniBridge1756(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1757")
private external fun kniBridge1757(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1758")
private external fun kniBridge1758(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1759")
private external fun kniBridge1759(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1760")
private external fun kniBridge1760(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1761")
private external fun kniBridge1761(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1762")
private external fun kniBridge1762(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1763")
private external fun kniBridge1763(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1764")
private external fun kniBridge1764(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1765")
private external fun kniBridge1765(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1766")
private external fun kniBridge1766(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1767")
private external fun kniBridge1767(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1768")
private external fun kniBridge1768(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1769")
private external fun kniBridge1769(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1770")
private external fun kniBridge1770(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1771")
private external fun kniBridge1771(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1772")
private external fun kniBridge1772(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1773")
private external fun kniBridge1773(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1774")
private external fun kniBridge1774(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1775")
private external fun kniBridge1775(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1776")
private external fun kniBridge1776(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1777")
private external fun kniBridge1777(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1778")
private external fun kniBridge1778(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1779")
private external fun kniBridge1779(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1780")
private external fun kniBridge1780(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1781")
private external fun kniBridge1781(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1782")
private external fun kniBridge1782(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1783")
private external fun kniBridge1783(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1784")
private external fun kniBridge1784(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1785")
private external fun kniBridge1785(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1786")
private external fun kniBridge1786(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1787")
private external fun kniBridge1787(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1788")
private external fun kniBridge1788(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1789")
private external fun kniBridge1789(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1790")
private external fun kniBridge1790(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1791")
private external fun kniBridge1791(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1792")
private external fun kniBridge1792(): NativePtr
@SymbolName("openssl_kniBridge1793")
private external fun kniBridge1793(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1794")
private external fun kniBridge1794(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1795")
private external fun kniBridge1795(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1796")
private external fun kniBridge1796(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1797")
private external fun kniBridge1797(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1798")
private external fun kniBridge1798(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1799")
private external fun kniBridge1799(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1800")
private external fun kniBridge1800(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1801")
private external fun kniBridge1801(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1802")
private external fun kniBridge1802(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1803")
private external fun kniBridge1803(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1804")
private external fun kniBridge1804(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1805")
private external fun kniBridge1805(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1806")
private external fun kniBridge1806(p0: Int, p1: Int, p2: Int, p3: NativePtr, p4: Int): Unit
@SymbolName("openssl_kniBridge1807")
private external fun kniBridge1807(p0: NativePtr, p1: Int): Unit
@SymbolName("openssl_kniBridge1808")
private external fun kniBridge1808(): ULong
@SymbolName("openssl_kniBridge1809")
private external fun kniBridge1809(p0: NativePtr, p1: NativePtr): ULong
@SymbolName("openssl_kniBridge1810")
private external fun kniBridge1810(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): ULong
@SymbolName("openssl_kniBridge1811")
private external fun kniBridge1811(): ULong
@SymbolName("openssl_kniBridge1812")
private external fun kniBridge1812(p0: NativePtr, p1: NativePtr): ULong
@SymbolName("openssl_kniBridge1813")
private external fun kniBridge1813(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): ULong
@SymbolName("openssl_kniBridge1814")
private external fun kniBridge1814(): ULong
@SymbolName("openssl_kniBridge1815")
private external fun kniBridge1815(p0: NativePtr, p1: NativePtr): ULong
@SymbolName("openssl_kniBridge1816")
private external fun kniBridge1816(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): ULong
@SymbolName("openssl_kniBridge1817")
private external fun kniBridge1817(): Unit
@SymbolName("openssl_kniBridge1818")
private external fun kniBridge1818(p0: ULong, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1819")
private external fun kniBridge1819(p0: ULong, p1: NativePtr, p2: ULong): Unit
@SymbolName("openssl_kniBridge1820")
private external fun kniBridge1820(p0: ULong): NativePtr
@SymbolName("openssl_kniBridge1821")
private external fun kniBridge1821(p0: ULong): NativePtr
@SymbolName("openssl_kniBridge1822")
private external fun kniBridge1822(p0: ULong): NativePtr
@SymbolName("openssl_kniBridge1823")
private external fun kniBridge1823(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1824")
private external fun kniBridge1824(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1825")
private external fun kniBridge1825(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1826")
private external fun kniBridge1826(): NativePtr
@SymbolName("openssl_kniBridge1827")
private external fun kniBridge1827(p0: Int, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1828")
private external fun kniBridge1828(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1829")
private external fun kniBridge1829(p0: Int, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1830")
private external fun kniBridge1830(): Int
@SymbolName("openssl_kniBridge1831")
private external fun kniBridge1831(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1832")
private external fun kniBridge1832(p0: ULong): Unit
@SymbolName("openssl_kniBridge1833")
private external fun kniBridge1833(): NativePtr
@SymbolName("openssl_kniBridge1834")
private external fun kniBridge1834(): Int
@SymbolName("openssl_kniBridge1835")
private external fun kniBridge1835(): Int
@SymbolName("openssl_kniBridge1836")
private external fun kniBridge1836(): Int
@SymbolName("openssl_kniBridge1837")
private external fun kniBridge1837(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1838")
private external fun kniBridge1838(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1839")
private external fun kniBridge1839(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1840")
private external fun kniBridge1840(): NativePtr
@SymbolName("openssl_kniBridge1841")
private external fun kniBridge1841(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1842")
private external fun kniBridge1842(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1843")
private external fun kniBridge1843(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1844")
private external fun kniBridge1844(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1845")
private external fun kniBridge1845(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1846")
private external fun kniBridge1846(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1847")
private external fun kniBridge1847(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1848")
private external fun kniBridge1848(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1849")
private external fun kniBridge1849(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1850")
private external fun kniBridge1850(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1851")
private external fun kniBridge1851(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1852")
private external fun kniBridge1852(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1853")
private external fun kniBridge1853(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1854")
private external fun kniBridge1854(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1855")
private external fun kniBridge1855(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1856")
private external fun kniBridge1856(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1857")
private external fun kniBridge1857(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1858")
private external fun kniBridge1858(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1859")
private external fun kniBridge1859(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1860")
private external fun kniBridge1860(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1861")
private external fun kniBridge1861(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1862")
private external fun kniBridge1862(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1863")
private external fun kniBridge1863(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1864")
private external fun kniBridge1864(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1865")
private external fun kniBridge1865(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1866")
private external fun kniBridge1866(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1867")
private external fun kniBridge1867(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1868")
private external fun kniBridge1868(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1869")
private external fun kniBridge1869(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1870")
private external fun kniBridge1870(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1871")
private external fun kniBridge1871(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1872")
private external fun kniBridge1872(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1873")
private external fun kniBridge1873(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1874")
private external fun kniBridge1874(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1875")
private external fun kniBridge1875(): NativePtr
@SymbolName("openssl_kniBridge1876")
private external fun kniBridge1876(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1877")
private external fun kniBridge1877(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1878")
private external fun kniBridge1878(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1879")
private external fun kniBridge1879(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1880")
private external fun kniBridge1880(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1881")
private external fun kniBridge1881(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1882")
private external fun kniBridge1882(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1883")
private external fun kniBridge1883(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1884")
private external fun kniBridge1884(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1885")
private external fun kniBridge1885(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1886")
private external fun kniBridge1886(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1887")
private external fun kniBridge1887(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1888")
private external fun kniBridge1888(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1889")
private external fun kniBridge1889(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1890")
private external fun kniBridge1890(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1891")
private external fun kniBridge1891(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1892")
private external fun kniBridge1892(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1893")
private external fun kniBridge1893(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1894")
private external fun kniBridge1894(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1895")
private external fun kniBridge1895(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1896")
private external fun kniBridge1896(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1897")
private external fun kniBridge1897(): NativePtr
@SymbolName("openssl_kniBridge1898")
private external fun kniBridge1898(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1899")
private external fun kniBridge1899(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1900")
private external fun kniBridge1900(p0: NativePtr, p1: Int): NativePtr
@SymbolName("openssl_kniBridge1901")
private external fun kniBridge1901(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1902")
private external fun kniBridge1902(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1903")
private external fun kniBridge1903(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1904")
private external fun kniBridge1904(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1905")
private external fun kniBridge1905(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1906")
private external fun kniBridge1906(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1907")
private external fun kniBridge1907(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("openssl_kniBridge1908")
private external fun kniBridge1908(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1909")
private external fun kniBridge1909(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1910")
private external fun kniBridge1910(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1911")
private external fun kniBridge1911(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1912")
private external fun kniBridge1912(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1913")
private external fun kniBridge1913(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1914")
private external fun kniBridge1914(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1915")
private external fun kniBridge1915(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1916")
private external fun kniBridge1916(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1917")
private external fun kniBridge1917(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1918")
private external fun kniBridge1918(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1919")
private external fun kniBridge1919(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1920")
private external fun kniBridge1920(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1921")
private external fun kniBridge1921(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1922")
private external fun kniBridge1922(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1923")
private external fun kniBridge1923(p0: NativePtr, p1: NativePtr, p2: NativePtr): Long
@SymbolName("openssl_kniBridge1924")
private external fun kniBridge1924(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1925")
private external fun kniBridge1925(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1926")
private external fun kniBridge1926(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1927")
private external fun kniBridge1927(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1928")
private external fun kniBridge1928(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1929")
private external fun kniBridge1929(): NativePtr
@SymbolName("openssl_kniBridge1930")
private external fun kniBridge1930(): NativePtr
@SymbolName("openssl_kniBridge1931")
private external fun kniBridge1931(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1932")
private external fun kniBridge1932(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge1933")
private external fun kniBridge1933(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1934")
private external fun kniBridge1934(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1935")
private external fun kniBridge1935(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1936")
private external fun kniBridge1936(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1937")
private external fun kniBridge1937(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1938")
private external fun kniBridge1938(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Int
@SymbolName("openssl_kniBridge1939")
private external fun kniBridge1939(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1940")
private external fun kniBridge1940(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1941")
private external fun kniBridge1941(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge1942")
private external fun kniBridge1942(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge1943")
private external fun kniBridge1943(p0: Int): Unit
@SymbolName("openssl_kniBridge1944")
private external fun kniBridge1944(): Unit
@SymbolName("openssl_kniBridge1945")
private external fun kniBridge1945(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("openssl_kniBridge1946")
private external fun kniBridge1946(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1947")
private external fun kniBridge1947(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1948")
private external fun kniBridge1948(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1949")
private external fun kniBridge1949(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1950")
private external fun kniBridge1950(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1951")
private external fun kniBridge1951(p0: NativePtr): ULong
@SymbolName("openssl_kniBridge1952")
private external fun kniBridge1952(p0: NativePtr, p1: ULong): Unit
@SymbolName("openssl_kniBridge1953")
private external fun kniBridge1953(p0: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1954")
private external fun kniBridge1954(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1955")
private external fun kniBridge1955(): NativePtr
@SymbolName("openssl_kniBridge1956")
private external fun kniBridge1956(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("openssl_kniBridge1957")
private external fun kniBridge1957(): Unit
@SymbolName("openssl_kniBridge1958")
private external fun kniBridge1958(): Int
@SymbolName("openssl_kniBridge1959")
private external fun kniBridge1959(p0: NativePtr): Int
@SymbolName("openssl_kniBridge1960")
private external fun kniBridge1960(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("openssl_kniBridge1961")
private external fun kniBridge1961(p0: NativePtr, p1: NativePtr): Int
@SymbolName("openssl_kniBridge1962")
private external fun kniBridge1962(p0: NativePtr, p1: ULong, p2: NativePtr): NativePtr
@SymbolName("openssl_kniBridge1963")
private external fun kniBridge1963(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openssl_kniBridge1964")
private external fun kniBridge1964(): NativePtr
@SymbolName("openssl_kniBridge1965")
private external fun kniBridge1965(): NativePtr
@SymbolName("openssl_kniBridge1966")
private external fun kniBridge1966(): NativePtr
@SymbolName("openssl_kniBridge1967")
private external fun kniBridge1967(): NativePtr
@SymbolName("openssl_kniBridge1968")
private external fun kniBridge1968(): NativePtr
@SymbolName("openssl_kniBridge1969")
private external fun kniBridge1969(): NativePtr
@SymbolName("openssl_kniBridge1970")
private external fun kniBridge1970(): ULong
@SymbolName("openssl_kniBridge1971")
private external fun kniBridge1971(): NativePtr
@SymbolName("openssl_kniBridge1972")
private external fun kniBridge1972(): NativePtr
@SymbolName("openssl_kniBridge1973")
private external fun kniBridge1973(): NativePtr
@SymbolName("openssl_kniBridge1974")
private external fun kniBridge1974(): NativePtr
@SymbolName("openssl_kniBridge1975")
private external fun kniBridge1975(): NativePtr
@SymbolName("openssl_kniBridge1976")
private external fun kniBridge1976(): NativePtr
@SymbolName("openssl_kniBridge1977")
private external fun kniBridge1977(): NativePtr
@SymbolName("openssl_kniBridge1978")
private external fun kniBridge1978(): NativePtr
@SymbolName("openssl_kniBridge1979")
private external fun kniBridge1979(): NativePtr
@SymbolName("openssl_kniBridge1980")
private external fun kniBridge1980(): NativePtr
@SymbolName("openssl_kniBridge1981")
private external fun kniBridge1981(): NativePtr
@SymbolName("openssl_kniBridge1982")
private external fun kniBridge1982(): NativePtr
@SymbolName("openssl_kniBridge1983")
private external fun kniBridge1983(): NativePtr
@SymbolName("openssl_kniBridge1984")
private external fun kniBridge1984(): NativePtr
@SymbolName("openssl_kniBridge1985")
private external fun kniBridge1985(): NativePtr
@SymbolName("openssl_kniBridge1986")
private external fun kniBridge1986(): NativePtr
@SymbolName("openssl_kniBridge1987")
private external fun kniBridge1987(): NativePtr
@SymbolName("openssl_kniBridge1988")
private external fun kniBridge1988(): NativePtr
@SymbolName("openssl_kniBridge1989")
private external fun kniBridge1989(): NativePtr
@SymbolName("openssl_kniBridge1990")
private external fun kniBridge1990(): NativePtr
@SymbolName("openssl_kniBridge1991")
private external fun kniBridge1991(): NativePtr
@SymbolName("openssl_kniBridge1992")
private external fun kniBridge1992(): NativePtr
@SymbolName("openssl_kniBridge1993")
private external fun kniBridge1993(): NativePtr
@SymbolName("openssl_kniBridge1994")
private external fun kniBridge1994(): NativePtr
@SymbolName("openssl_kniBridge1995")
private external fun kniBridge1995(): NativePtr
@SymbolName("openssl_kniBridge1996")
private external fun kniBridge1996(): NativePtr
@SymbolName("openssl_kniBridge1997")
private external fun kniBridge1997(): NativePtr
@SymbolName("openssl_kniBridge1998")
private external fun kniBridge1998(): NativePtr
@SymbolName("openssl_kniBridge1999")
private external fun kniBridge1999(): NativePtr
@SymbolName("openssl_kniBridge2000")
private external fun kniBridge2000(): NativePtr
@SymbolName("openssl_kniBridge2001")
private external fun kniBridge2001(): NativePtr
@SymbolName("openssl_kniBridge2002")
private external fun kniBridge2002(): NativePtr
@SymbolName("openssl_kniBridge2003")
private external fun kniBridge2003(): NativePtr
@SymbolName("openssl_kniBridge2004")
private external fun kniBridge2004(): NativePtr
@SymbolName("openssl_kniBridge2005")
private external fun kniBridge2005(): NativePtr
@SymbolName("openssl_kniBridge2006")
private external fun kniBridge2006(): NativePtr
@SymbolName("openssl_kniBridge2007")
private external fun kniBridge2007(): NativePtr
@SymbolName("openssl_kniBridge2008")
private external fun kniBridge2008(): NativePtr
@SymbolName("openssl_kniBridge2009")
private external fun kniBridge2009(): NativePtr
@SymbolName("openssl_kniBridge2010")
private external fun kniBridge2010(): NativePtr
@SymbolName("openssl_kniBridge2011")
private external fun kniBridge2011(): NativePtr
@SymbolName("openssl_kniBridge2012")
private external fun kniBridge2012(): NativePtr
@SymbolName("openssl_kniBridge2013")
private external fun kniBridge2013(): NativePtr
@SymbolName("openssl_kniBridge2014")
private external fun kniBridge2014(): NativePtr
@SymbolName("openssl_kniBridge2015")
private external fun kniBridge2015(): NativePtr
@SymbolName("openssl_kniBridge2016")
private external fun kniBridge2016(): NativePtr
@SymbolName("openssl_kniBridge2017")
private external fun kniBridge2017(): NativePtr
@SymbolName("openssl_kniBridge2018")
private external fun kniBridge2018(): NativePtr
@SymbolName("openssl_kniBridge2019")
private external fun kniBridge2019(): NativePtr
@SymbolName("openssl_kniBridge2020")
private external fun kniBridge2020(): NativePtr
@SymbolName("openssl_kniBridge2021")
private external fun kniBridge2021(): NativePtr
@SymbolName("openssl_kniBridge2022")
private external fun kniBridge2022(): NativePtr
@SymbolName("openssl_kniBridge2023")
private external fun kniBridge2023(): NativePtr
@SymbolName("openssl_kniBridge2024")
private external fun kniBridge2024(): NativePtr
@SymbolName("openssl_kniBridge2025")
private external fun kniBridge2025(): NativePtr
@SymbolName("openssl_kniBridge2026")
private external fun kniBridge2026(): NativePtr
@SymbolName("openssl_kniBridge2027")
private external fun kniBridge2027(): NativePtr
@SymbolName("openssl_kniBridge2028")
private external fun kniBridge2028(): NativePtr
@SymbolName("openssl_kniBridge2029")
private external fun kniBridge2029(): NativePtr
@SymbolName("openssl_kniBridge2030")
private external fun kniBridge2030(): NativePtr
@SymbolName("openssl_kniBridge2031")
private external fun kniBridge2031(): NativePtr
@SymbolName("openssl_kniBridge2032")
private external fun kniBridge2032(): Int
@SymbolName("openssl_kniBridge2033")
private external fun kniBridge2033(): NativePtr
@SymbolName("openssl_kniBridge2034")
private external fun kniBridge2034(): NativePtr
@SymbolName("openssl_kniBridge2035")
private external fun kniBridge2035(): NativePtr
@SymbolName("openssl_kniBridge2036")
private external fun kniBridge2036(): NativePtr
@SymbolName("openssl_kniBridge2037")
private external fun kniBridge2037(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge2038")
private external fun kniBridge2038(): NativePtr
@SymbolName("openssl_kniBridge2039")
private external fun kniBridge2039(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge2040")
private external fun kniBridge2040(): NativePtr
@SymbolName("openssl_kniBridge2041")
private external fun kniBridge2041(p0: NativePtr): Unit
@SymbolName("openssl_kniBridge2042")
private external fun kniBridge2042(): Int
@SymbolName("openssl_kniBridge2043")
private external fun kniBridge2043(p0: Int): Unit
@SymbolName("openssl_kniBridge2044")
private external fun kniBridge2044(): NativePtr
@SymbolName("openssl_kniBridge2045")
private external fun kniBridge2045(): NativePtr
@SymbolName("openssl_kniBridge2046")
private external fun kniBridge2046(): Int
@SymbolName("openssl_kniBridge2047")
private external fun kniBridge2047(p0: Int): Unit
@SymbolName("openssl_kniBridge2048")
private external fun kniBridge2048(): Long
@SymbolName("openssl_kniBridge2049")
private external fun kniBridge2049(p0: Long): Unit
@SymbolName("openssl_kniBridge2050")
private external fun kniBridge2050(): NativePtr
@SymbolName("openssl_kniBridge2051")
private external fun kniBridge2051(): Int
@SymbolName("openssl_kniBridge2052")
private external fun kniBridge2052(p0: Int): Unit
@SymbolName("openssl_kniBridge2053")
private external fun kniBridge2053(): Long
@SymbolName("openssl_kniBridge2054")
private external fun kniBridge2054(p0: Long): Unit
@SymbolName("openssl_kniBridge2055")
private external fun kniBridge2055(): NativePtr
@SymbolName("openssl_kniBridge2056")
private external fun kniBridge2056(): NativePtr
@SymbolName("openssl_kniBridge2057")
private external fun kniBridge2057(): NativePtr
@SymbolName("openssl_kniBridge2058")
private external fun kniBridge2058(): NativePtr
@SymbolName("openssl_kniBridge2059")
private external fun kniBridge2059(): NativePtr
@SymbolName("openssl_kniBridge2060")
private external fun kniBridge2060(): NativePtr
@SymbolName("openssl_kniBridge2061")
private external fun kniBridge2061(): NativePtr
@SymbolName("openssl_kniBridge2062")
private external fun kniBridge2062(): NativePtr
@SymbolName("openssl_kniBridge2063")
private external fun kniBridge2063(): NativePtr
@SymbolName("openssl_kniBridge2064")
private external fun kniBridge2064(): NativePtr
@SymbolName("openssl_kniBridge2065")
private external fun kniBridge2065(): NativePtr
@SymbolName("openssl_kniBridge2066")
private external fun kniBridge2066(): NativePtr
@SymbolName("openssl_kniBridge2067")
private external fun kniBridge2067(): NativePtr
@SymbolName("openssl_kniBridge2068")
private external fun kniBridge2068(): NativePtr
@SymbolName("openssl_kniBridge2069")
private external fun kniBridge2069(): NativePtr
@SymbolName("openssl_kniBridge2070")
private external fun kniBridge2070(): NativePtr
@SymbolName("openssl_kniBridge2071")
private external fun kniBridge2071(): NativePtr
@SymbolName("openssl_kniBridge2072")
private external fun kniBridge2072(): NativePtr
@SymbolName("openssl_kniBridge2073")
private external fun kniBridge2073(): NativePtr
@SymbolName("openssl_kniBridge2074")
private external fun kniBridge2074(): NativePtr
@SymbolName("openssl_kniBridge2075")
private external fun kniBridge2075(): NativePtr
@SymbolName("openssl_kniBridge2076")
private external fun kniBridge2076(): NativePtr
@SymbolName("openssl_kniBridge2077")
private external fun kniBridge2077(): NativePtr
@SymbolName("openssl_kniBridge2078")
private external fun kniBridge2078(): NativePtr
