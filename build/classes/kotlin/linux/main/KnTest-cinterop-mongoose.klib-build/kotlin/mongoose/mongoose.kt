@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package mongoose

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import platform.posix.FILE
import platform.posix.int64_t
import platform.posix.size_t
import platform.posix.size_tVar
import platform.posix.sockaddr
import platform.posix.sockaddr_in
import platform.posix.stat
import platform.posix.time_t
import platform.posix.time_tVar
import platform.posix.tm
import platform.posix.uint16_t
import platform.posix.uint16_tVar
import platform.posix.uint32_t
import platform.posix.uint32_tVar
import platform.posix.uint8_t
import platform.posix.uint8_tVar
import platform.posix.va_list

// NOTE THIS FILE IS AUTO-GENERATED

fun strtoll(arg0: String?, arg1: CValuesRef<CPointerVar<ByteVar>>?, arg2: Int): Long {
    memScoped {
        return kniBridge0(arg0?.cstr?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue, arg2)
    }
}

fun cs_md5_init(c: CValuesRef<cs_md5_ctx>?): Unit {
    memScoped {
        return kniBridge1(c?.getPointer(memScope).rawValue)
    }
}

fun cs_md5_update(c: CValuesRef<cs_md5_ctx>?, data: CValuesRef<UByteVar>?, len: size_t): Unit {
    memScoped {
        return kniBridge2(c?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun cs_md5_final(md: CValuesRef<UByteVar>?, c: CValuesRef<cs_md5_ctx>?): Unit {
    memScoped {
        return kniBridge3(md?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue)
    }
}

fun cs_sha1_init(arg0: CValuesRef<cs_sha1_ctx>?): Unit {
    memScoped {
        return kniBridge4(arg0?.getPointer(memScope).rawValue)
    }
}

fun cs_sha1_update(arg0: CValuesRef<cs_sha1_ctx>?, data: CValuesRef<UByteVar>?, len: uint32_t): Unit {
    memScoped {
        return kniBridge5(arg0?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun cs_sha1_final(digest: CValuesRef<UByteVar>?, arg1: CValuesRef<cs_sha1_ctx>?): Unit {
    memScoped {
        return kniBridge6(digest?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue)
    }
}

fun cs_hmac_sha1(key: CValuesRef<UByteVar>?, key_len: size_t, text: CValuesRef<UByteVar>?, text_len: size_t, out: CValuesRef<UByteVar>?): Unit {
    memScoped {
        return kniBridge7(key?.getPointer(memScope).rawValue, key_len, text?.getPointer(memScope).rawValue, text_len, out?.getPointer(memScope).rawValue)
    }
}

fun cs_time(): Double {
    return kniBridge8()
}

fun cs_timegm(tm: CValuesRef<tm>?): Double {
    memScoped {
        return kniBridge9(tm?.getPointer(memScope).rawValue)
    }
}

fun mg_mk_str(s: String?): CValue<mg_str> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<mg_str>()
        try {
            kniBridge10(s?.cstr?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun mg_mk_str_n(s: String?, len: size_t): CValue<mg_str> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<mg_str>()
        try {
            kniBridge11(s?.cstr?.getPointer(memScope).rawValue, len, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun mg_vcmp(str2: CValuesRef<mg_str>?, str1: String?): Int {
    memScoped {
        return kniBridge12(str2?.getPointer(memScope).rawValue, str1?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_vcasecmp(str2: CValuesRef<mg_str>?, str1: String?): Int {
    memScoped {
        return kniBridge13(str2?.getPointer(memScope).rawValue, str1?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_strdup(s: CValue<mg_str>): CValue<mg_str> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<mg_str>()
        try {
            kniBridge14(s.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun mg_strdup_nul(s: CValue<mg_str>): CValue<mg_str> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<mg_str>()
        try {
            kniBridge15(s.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun mg_strchr(s: CValue<mg_str>, c: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge16(s.getPointer(memScope).rawValue, c))
    }
}

fun mg_strcmp(str1: CValue<mg_str>, str2: CValue<mg_str>): Int {
    memScoped {
        return kniBridge17(str1.getPointer(memScope).rawValue, str2.getPointer(memScope).rawValue)
    }
}

fun mg_strncmp(str1: CValue<mg_str>, str2: CValue<mg_str>, n: size_t): Int {
    memScoped {
        return kniBridge18(str1.getPointer(memScope).rawValue, str2.getPointer(memScope).rawValue, n)
    }
}

fun mg_strstr(haystack: CValue<mg_str>, needle: CValue<mg_str>): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge19(haystack.getPointer(memScope).rawValue, needle.getPointer(memScope).rawValue))
    }
}

fun mg_strstrip(s: CValue<mg_str>): CValue<mg_str> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<mg_str>()
        try {
            kniBridge20(s.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun mbuf_init(arg0: CValuesRef<mbuf>?, initial_capacity: size_t): Unit {
    memScoped {
        return kniBridge21(arg0?.getPointer(memScope).rawValue, initial_capacity)
    }
}

fun mbuf_free(arg0: CValuesRef<mbuf>?): Unit {
    memScoped {
        return kniBridge22(arg0?.getPointer(memScope).rawValue)
    }
}

fun mbuf_append(arg0: CValuesRef<mbuf>?, data: CValuesRef<*>?, data_size: size_t): size_t {
    memScoped {
        return kniBridge23(arg0?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, data_size)
    }
}

fun mbuf_insert(arg0: CValuesRef<mbuf>?, arg1: size_t, arg2: CValuesRef<*>?, arg3: size_t): size_t {
    memScoped {
        return kniBridge24(arg0?.getPointer(memScope).rawValue, arg1, arg2?.getPointer(memScope).rawValue, arg3)
    }
}

fun mbuf_remove(arg0: CValuesRef<mbuf>?, data_size: size_t): Unit {
    memScoped {
        return kniBridge25(arg0?.getPointer(memScope).rawValue, data_size)
    }
}

fun mbuf_resize(arg0: CValuesRef<mbuf>?, new_size: size_t): Unit {
    memScoped {
        return kniBridge26(arg0?.getPointer(memScope).rawValue, new_size)
    }
}

fun mbuf_trim(arg0: CValuesRef<mbuf>?): Unit {
    memScoped {
        return kniBridge27(arg0?.getPointer(memScope).rawValue)
    }
}

fun cs_base64_init(ctx: CValuesRef<cs_base64_ctx>?, putc: cs_base64_putc_t?, user_data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge28(ctx?.getPointer(memScope).rawValue, putc.rawValue, user_data?.getPointer(memScope).rawValue)
    }
}

fun cs_base64_update(ctx: CValuesRef<cs_base64_ctx>?, str: String?, len: size_t): Unit {
    memScoped {
        return kniBridge29(ctx?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue, len)
    }
}

fun cs_base64_finish(ctx: CValuesRef<cs_base64_ctx>?): Unit {
    memScoped {
        return kniBridge30(ctx?.getPointer(memScope).rawValue)
    }
}

fun cs_base64_encode(src: CValuesRef<UByteVar>?, src_len: Int, dst: CValuesRef<ByteVar>?): Unit {
    memScoped {
        return kniBridge31(src?.getPointer(memScope).rawValue, src_len, dst?.getPointer(memScope).rawValue)
    }
}

fun cs_fprint_base64(f: CValuesRef<FILE>?, src: CValuesRef<UByteVar>?, src_len: Int): Unit {
    memScoped {
        return kniBridge32(f?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue, src_len)
    }
}

fun cs_base64_decode(s: CValuesRef<UByteVar>?, len: Int, dst: CValuesRef<ByteVar>?, dec_len: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge33(s?.getPointer(memScope).rawValue, len, dst?.getPointer(memScope).rawValue, dec_len?.getPointer(memScope).rawValue)
    }
}

fun c_strnlen(s: String?, maxlen: size_t): size_t {
    memScoped {
        return kniBridge34(s?.cstr?.getPointer(memScope).rawValue, maxlen)
    }
}

fun c_snprintf(buf: CValuesRef<ByteVar>?, buf_size: size_t, format: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge35(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(buf?.getPointer(memScope), buf_size, format?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun c_vsnprintf(buf: CValuesRef<ByteVar>?, buf_size: size_t, format: String?, ap: va_list?): Int {
    memScoped {
        return kniBridge36(buf?.getPointer(memScope).rawValue, buf_size, format?.cstr?.getPointer(memScope).rawValue, ap.rawValue)
    }
}

fun c_strnstr(s: String?, find: String?, slen: size_t): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge37(s?.cstr?.getPointer(memScope).rawValue, find?.cstr?.getPointer(memScope).rawValue, slen))
    }
}

fun cs_to_hex(to: CValuesRef<ByteVar>?, p: CValuesRef<UByteVar>?, len: size_t): Unit {
    memScoped {
        return kniBridge38(to?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue, len)
    }
}

fun cs_from_hex(to: CValuesRef<ByteVar>?, p: String?, len: size_t): Unit {
    memScoped {
        return kniBridge39(to?.getPointer(memScope).rawValue, p?.cstr?.getPointer(memScope).rawValue, len)
    }
}

fun mg_ncasecmp(s1: String?, s2: String?, len: size_t): Int {
    memScoped {
        return kniBridge40(s1?.cstr?.getPointer(memScope).rawValue, s2?.cstr?.getPointer(memScope).rawValue, len)
    }
}

fun mg_casecmp(s1: String?, s2: String?): Int {
    memScoped {
        return kniBridge41(s1?.cstr?.getPointer(memScope).rawValue, s2?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_asprintf(buf: CValuesRef<CPointerVar<ByteVar>>?, size: size_t, fmt: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge42(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(buf?.getPointer(memScope), size, fmt?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun mg_avprintf(buf: CValuesRef<CPointerVar<ByteVar>>?, size: size_t, fmt: String?, ap: va_list?): Int {
    memScoped {
        return kniBridge43(buf?.getPointer(memScope).rawValue, size, fmt?.cstr?.getPointer(memScope).rawValue, ap.rawValue)
    }
}

fun mg_next_comma_list_entry(list: String?, `val`: CValuesRef<mg_str>?, eq_val: CValuesRef<mg_str>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge44(list?.cstr?.getPointer(memScope).rawValue, `val`?.getPointer(memScope).rawValue, eq_val?.getPointer(memScope).rawValue))
    }
}

fun mg_next_comma_list_entry_n(list: CValue<mg_str>, `val`: CValuesRef<mg_str>?, eq_val: CValuesRef<mg_str>?): CValue<mg_str> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<mg_str>()
        try {
            kniBridge45(list.getPointer(memScope).rawValue, `val`?.getPointer(memScope).rawValue, eq_val?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun mg_match_prefix(pattern: String?, pattern_len: Int, str: String?): size_t {
    memScoped {
        return kniBridge46(pattern?.cstr?.getPointer(memScope).rawValue, pattern_len, str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_match_prefix_n(pattern: CValue<mg_str>, str: CValue<mg_str>): size_t {
    memScoped {
        return kniBridge47(pattern.getPointer(memScope).rawValue, str.getPointer(memScope).rawValue)
    }
}

fun mg_if_create_iface(vtable: CValuesRef<mg_iface_vtable>?, mgr: CValuesRef<mg_mgr>?): CPointer<mg_iface>? {
    memScoped {
        return interpretCPointer<mg_iface>(kniBridge48(vtable?.getPointer(memScope).rawValue, mgr?.getPointer(memScope).rawValue))
    }
}

fun mg_find_iface(mgr: CValuesRef<mg_mgr>?, vtable: CValuesRef<mg_iface_vtable>?, from: CValuesRef<mg_iface>?): CPointer<mg_iface>? {
    memScoped {
        return interpretCPointer<mg_iface>(kniBridge49(mgr?.getPointer(memScope).rawValue, vtable?.getPointer(memScope).rawValue, from?.getPointer(memScope).rawValue))
    }
}

fun mg_if_accept_new_conn(lc: CValuesRef<mg_connection>?): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge50(lc?.getPointer(memScope).rawValue))
    }
}

fun mg_if_accept_tcp_cb(nc: CValuesRef<mg_connection>?, sa: CValuesRef<socket_address>?, sa_len: size_t): Unit {
    memScoped {
        return kniBridge51(nc?.getPointer(memScope).rawValue, sa?.getPointer(memScope).rawValue, sa_len)
    }
}

fun mg_if_connect_cb(nc: CValuesRef<mg_connection>?, err: Int): Unit {
    memScoped {
        return kniBridge52(nc?.getPointer(memScope).rawValue, err)
    }
}

fun mg_if_can_recv_cb(nc: CValuesRef<mg_connection>?): Unit {
    memScoped {
        return kniBridge53(nc?.getPointer(memScope).rawValue)
    }
}

fun mg_if_can_send_cb(nc: CValuesRef<mg_connection>?): Unit {
    memScoped {
        return kniBridge54(nc?.getPointer(memScope).rawValue)
    }
}

fun mg_if_recv_udp_cb(nc: CValuesRef<mg_connection>?, buf: CValuesRef<*>?, len: Int, sa: CValuesRef<socket_address>?, sa_len: size_t): Unit {
    memScoped {
        return kniBridge55(nc?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, len, sa?.getPointer(memScope).rawValue, sa_len)
    }
}

fun mg_if_poll(nc: CValuesRef<mg_connection>?, now: Double): Int {
    memScoped {
        return kniBridge56(nc?.getPointer(memScope).rawValue, now)
    }
}

fun mg_mgr_min_timer(mgr: CValuesRef<mg_mgr>?): Double {
    memScoped {
        return kniBridge57(mgr?.getPointer(memScope).rawValue)
    }
}

fun mg_mgr_init(mgr: CValuesRef<mg_mgr>?, user_data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge58(mgr?.getPointer(memScope).rawValue, user_data?.getPointer(memScope).rawValue)
    }
}

fun mg_mgr_init_opt(mgr: CValuesRef<mg_mgr>?, user_data: CValuesRef<*>?, opts: CValue<mg_mgr_init_opts>): Unit {
    memScoped {
        return kniBridge59(mgr?.getPointer(memScope).rawValue, user_data?.getPointer(memScope).rawValue, opts.getPointer(memScope).rawValue)
    }
}

fun mg_mgr_free(mgr: CValuesRef<mg_mgr>?): Unit {
    memScoped {
        return kniBridge60(mgr?.getPointer(memScope).rawValue)
    }
}

fun mg_mgr_poll(mgr: CValuesRef<mg_mgr>?, milli: Int): Int {
    memScoped {
        return kniBridge61(mgr?.getPointer(memScope).rawValue, milli)
    }
}

fun mg_broadcast(mgr: CValuesRef<mg_mgr>?, cb: mg_event_handler_t?, data: CValuesRef<*>?, len: size_t): Unit {
    memScoped {
        return kniBridge62(mgr?.getPointer(memScope).rawValue, cb.rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun mg_next(mgr: CValuesRef<mg_mgr>?, c: CValuesRef<mg_connection>?): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge63(mgr?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue))
    }
}

fun mg_add_sock(mgr: CValuesRef<mg_mgr>?, sock: sock_t, handler: mg_event_handler_t?): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge64(mgr?.getPointer(memScope).rawValue, sock, handler.rawValue))
    }
}

fun mg_add_sock_opt(mgr: CValuesRef<mg_mgr>?, sock: sock_t, handler: mg_event_handler_t?, opts: CValue<mg_add_sock_opts>): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge65(mgr?.getPointer(memScope).rawValue, sock, handler.rawValue, opts.getPointer(memScope).rawValue))
    }
}

fun mg_bind(mgr: CValuesRef<mg_mgr>?, address: String?, handler: mg_event_handler_t?): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge66(mgr?.getPointer(memScope).rawValue, address?.cstr?.getPointer(memScope).rawValue, handler.rawValue))
    }
}

fun mg_bind_opt(mgr: CValuesRef<mg_mgr>?, address: String?, handler: mg_event_handler_t?, opts: CValue<mg_bind_opts>): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge67(mgr?.getPointer(memScope).rawValue, address?.cstr?.getPointer(memScope).rawValue, handler.rawValue, opts.getPointer(memScope).rawValue))
    }
}

fun mg_connect(mgr: CValuesRef<mg_mgr>?, address: String?, handler: mg_event_handler_t?): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge68(mgr?.getPointer(memScope).rawValue, address?.cstr?.getPointer(memScope).rawValue, handler.rawValue))
    }
}

fun mg_connect_opt(mgr: CValuesRef<mg_mgr>?, address: String?, handler: mg_event_handler_t?, opts: CValue<mg_connect_opts>): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge69(mgr?.getPointer(memScope).rawValue, address?.cstr?.getPointer(memScope).rawValue, handler.rawValue, opts.getPointer(memScope).rawValue))
    }
}

fun mg_send(arg0: CValuesRef<mg_connection>?, buf: CValuesRef<*>?, len: Int): Unit {
    memScoped {
        return kniBridge70(arg0?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, len)
    }
}

fun mg_printf(arg0: CValuesRef<mg_connection>?, fmt: String?, vararg variadicArguments: Any?): Int {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
        callWithVarargs(kniBridge71(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0?.getPointer(memScope), fmt?.cstr?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun mg_vprintf(arg0: CValuesRef<mg_connection>?, fmt: String?, ap: va_list?): Int {
    memScoped {
        return kniBridge72(arg0?.getPointer(memScope).rawValue, fmt?.cstr?.getPointer(memScope).rawValue, ap.rawValue)
    }
}

fun mg_socketpair(arg0: CValuesRef<sock_tVar>?, sock_type: Int): Int {
    memScoped {
        return kniBridge73(arg0?.getPointer(memScope).rawValue, sock_type)
    }
}

fun mg_check_ip_acl(acl: String?, remote_ip: uint32_t): Int {
    memScoped {
        return kniBridge74(acl?.cstr?.getPointer(memScope).rawValue, remote_ip)
    }
}

fun mg_set_timer(c: CValuesRef<mg_connection>?, timestamp: Double): Double {
    memScoped {
        return kniBridge75(c?.getPointer(memScope).rawValue, timestamp)
    }
}

fun mg_time(): Double {
    return kniBridge76()
}

fun mg_parse_uri(uri: CValue<mg_str>, scheme: CValuesRef<mg_str>?, user_info: CValuesRef<mg_str>?, host: CValuesRef<mg_str>?, port: CValuesRef<UIntVar>?, path: CValuesRef<mg_str>?, query: CValuesRef<mg_str>?, fragment: CValuesRef<mg_str>?): Int {
    memScoped {
        return kniBridge77(uri.getPointer(memScope).rawValue, scheme?.getPointer(memScope).rawValue, user_info?.getPointer(memScope).rawValue, host?.getPointer(memScope).rawValue, port?.getPointer(memScope).rawValue, path?.getPointer(memScope).rawValue, query?.getPointer(memScope).rawValue, fragment?.getPointer(memScope).rawValue)
    }
}

fun mg_assemble_uri(scheme: CValuesRef<mg_str>?, user_info: CValuesRef<mg_str>?, host: CValuesRef<mg_str>?, port: UInt, path: CValuesRef<mg_str>?, query: CValuesRef<mg_str>?, fragment: CValuesRef<mg_str>?, normalize_path: Int, uri: CValuesRef<mg_str>?): Int {
    memScoped {
        return kniBridge78(scheme?.getPointer(memScope).rawValue, user_info?.getPointer(memScope).rawValue, host?.getPointer(memScope).rawValue, port, path?.getPointer(memScope).rawValue, query?.getPointer(memScope).rawValue, fragment?.getPointer(memScope).rawValue, normalize_path, uri?.getPointer(memScope).rawValue)
    }
}

fun mg_normalize_uri_path(`in`: CValuesRef<mg_str>?, out: CValuesRef<mg_str>?): Int {
    memScoped {
        return kniBridge79(`in`?.getPointer(memScope).rawValue, out?.getPointer(memScope).rawValue)
    }
}

fun mg_skip(s: String?, end_string: String?, delimiters: String?, v: CValuesRef<mg_str>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge80(s?.cstr?.getPointer(memScope).rawValue, end_string?.cstr?.getPointer(memScope).rawValue, delimiters?.cstr?.getPointer(memScope).rawValue, v?.getPointer(memScope).rawValue))
    }
}

fun mg_base64_decode(s: CValuesRef<UByteVar>?, len: Int, dst: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge81(s?.getPointer(memScope).rawValue, len, dst?.getPointer(memScope).rawValue)
    }
}

fun mg_base64_encode(src: CValuesRef<UByteVar>?, src_len: Int, dst: CValuesRef<ByteVar>?): Unit {
    memScoped {
        return kniBridge82(src?.getPointer(memScope).rawValue, src_len, dst?.getPointer(memScope).rawValue)
    }
}

fun mg_stat(path: String?, st: CValuesRef<cs_stat_t>?): Int {
    memScoped {
        return kniBridge83(path?.cstr?.getPointer(memScope).rawValue, st?.getPointer(memScope).rawValue)
    }
}

fun mg_fopen(path: String?, mode: String?): CPointer<FILE>? {
    memScoped {
        return interpretCPointer<FILE>(kniBridge84(path?.cstr?.getPointer(memScope).rawValue, mode?.cstr?.getPointer(memScope).rawValue))
    }
}

fun mg_open(path: String?, flag: Int, mode: Int): Int {
    memScoped {
        return kniBridge85(path?.cstr?.getPointer(memScope).rawValue, flag, mode)
    }
}

fun mg_fread(ptr: CValuesRef<*>?, size: size_t, count: size_t, f: CValuesRef<FILE>?): size_t {
    memScoped {
        return kniBridge86(ptr?.getPointer(memScope).rawValue, size, count, f?.getPointer(memScope).rawValue)
    }
}

fun mg_fwrite(ptr: CValuesRef<*>?, size: size_t, count: size_t, f: CValuesRef<FILE>?): size_t {
    memScoped {
        return kniBridge87(ptr?.getPointer(memScope).rawValue, size, count, f?.getPointer(memScope).rawValue)
    }
}

fun mg_set_close_on_exec(arg0: sock_t): Unit {
    return kniBridge88(arg0)
}

fun mg_conn_addr_to_str(c: CValuesRef<mg_connection>?, buf: CValuesRef<ByteVar>?, len: size_t, flags: Int): Int {
    memScoped {
        return kniBridge89(c?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, len, flags)
    }
}

fun mg_sock_to_str(sock: sock_t, buf: CValuesRef<ByteVar>?, len: size_t, flags: Int): Unit {
    memScoped {
        return kniBridge90(sock, buf?.getPointer(memScope).rawValue, len, flags)
    }
}

fun mg_sock_addr_to_str(sa: CValuesRef<socket_address>?, buf: CValuesRef<ByteVar>?, len: size_t, flags: Int): Int {
    memScoped {
        return kniBridge91(sa?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, len, flags)
    }
}

fun mg_hexdump(buf: CValuesRef<*>?, len: Int, dst: CValuesRef<ByteVar>?, dst_len: Int): Int {
    memScoped {
        return kniBridge92(buf?.getPointer(memScope).rawValue, len, dst?.getPointer(memScope).rawValue, dst_len)
    }
}

fun mg_hexdumpf(fp: CValuesRef<FILE>?, buf: CValuesRef<*>?, len: Int): Unit {
    memScoped {
        return kniBridge93(fp?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, len)
    }
}

fun mg_hexdump_connection(nc: CValuesRef<mg_connection>?, path: String?, buf: CValuesRef<*>?, num_bytes: Int, ev: Int): Unit {
    memScoped {
        return kniBridge94(nc?.getPointer(memScope).rawValue, path?.cstr?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, num_bytes, ev)
    }
}

fun mg_is_big_endian(): Int {
    return kniBridge95()
}

fun mg_mbuf_append_base64_putc(ch: Byte, user_data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge96(ch, user_data?.getPointer(memScope).rawValue)
    }
}

fun mg_mbuf_append_base64(mbuf: CValuesRef<mbuf>?, data: CValuesRef<*>?, len: size_t): Unit {
    memScoped {
        return kniBridge97(mbuf?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, len)
    }
}

fun mg_basic_auth_header(user: CValue<mg_str>, pass: CValue<mg_str>, buf: CValuesRef<mbuf>?): Unit {
    memScoped {
        return kniBridge98(user.getPointer(memScope).rawValue, pass.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue)
    }
}

fun mg_url_encode_opt(src: CValue<mg_str>, safe: CValue<mg_str>, flags: UInt): CValue<mg_str> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<mg_str>()
        try {
            kniBridge99(src.getPointer(memScope).rawValue, safe.getPointer(memScope).rawValue, flags, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun mg_url_encode(src: CValue<mg_str>): CValue<mg_str> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<mg_str>()
        try {
            kniBridge100(src.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun mg_set_protocol_http_websocket(nc: CValuesRef<mg_connection>?): Unit {
    memScoped {
        return kniBridge101(nc?.getPointer(memScope).rawValue)
    }
}

fun mg_send_websocket_handshake(nc: CValuesRef<mg_connection>?, uri: String?, extra_headers: String?): Unit {
    memScoped {
        return kniBridge102(nc?.getPointer(memScope).rawValue, uri?.cstr?.getPointer(memScope).rawValue, extra_headers?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_send_websocket_handshake2(nc: CValuesRef<mg_connection>?, path: String?, host: String?, protocol: String?, extra_headers: String?): Unit {
    memScoped {
        return kniBridge103(nc?.getPointer(memScope).rawValue, path?.cstr?.getPointer(memScope).rawValue, host?.cstr?.getPointer(memScope).rawValue, protocol?.cstr?.getPointer(memScope).rawValue, extra_headers?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_send_websocket_handshake3(nc: CValuesRef<mg_connection>?, path: String?, host: String?, protocol: String?, extra_headers: String?, user: String?, pass: String?): Unit {
    memScoped {
        return kniBridge104(nc?.getPointer(memScope).rawValue, path?.cstr?.getPointer(memScope).rawValue, host?.cstr?.getPointer(memScope).rawValue, protocol?.cstr?.getPointer(memScope).rawValue, extra_headers?.cstr?.getPointer(memScope).rawValue, user?.cstr?.getPointer(memScope).rawValue, pass?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_send_websocket_handshake3v(nc: CValuesRef<mg_connection>?, path: CValue<mg_str>, host: CValue<mg_str>, protocol: CValue<mg_str>, extra_headers: CValue<mg_str>, user: CValue<mg_str>, pass: CValue<mg_str>): Unit {
    memScoped {
        return kniBridge105(nc?.getPointer(memScope).rawValue, path.getPointer(memScope).rawValue, host.getPointer(memScope).rawValue, protocol.getPointer(memScope).rawValue, extra_headers.getPointer(memScope).rawValue, user.getPointer(memScope).rawValue, pass.getPointer(memScope).rawValue)
    }
}

fun mg_connect_ws(mgr: CValuesRef<mg_mgr>?, event_handler: mg_event_handler_t?, url: String?, protocol: String?, extra_headers: String?): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge106(mgr?.getPointer(memScope).rawValue, event_handler.rawValue, url?.cstr?.getPointer(memScope).rawValue, protocol?.cstr?.getPointer(memScope).rawValue, extra_headers?.cstr?.getPointer(memScope).rawValue))
    }
}

fun mg_connect_ws_opt(mgr: CValuesRef<mg_mgr>?, ev_handler: mg_event_handler_t?, opts: CValue<mg_connect_opts>, url: String?, protocol: String?, extra_headers: String?): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge107(mgr?.getPointer(memScope).rawValue, ev_handler.rawValue, opts.getPointer(memScope).rawValue, url?.cstr?.getPointer(memScope).rawValue, protocol?.cstr?.getPointer(memScope).rawValue, extra_headers?.cstr?.getPointer(memScope).rawValue))
    }
}

fun mg_send_websocket_frame(nc: CValuesRef<mg_connection>?, op_and_flags: Int, data: CValuesRef<*>?, data_len: size_t): Unit {
    memScoped {
        return kniBridge108(nc?.getPointer(memScope).rawValue, op_and_flags, data?.getPointer(memScope).rawValue, data_len)
    }
}

fun mg_send_websocket_framev(nc: CValuesRef<mg_connection>?, op_and_flags: Int, strings: CValuesRef<mg_str>?, num_strings: Int): Unit {
    memScoped {
        return kniBridge109(nc?.getPointer(memScope).rawValue, op_and_flags, strings?.getPointer(memScope).rawValue, num_strings)
    }
}

fun mg_printf_websocket_frame(nc: CValuesRef<mg_connection>?, op_and_flags: Int, fmt: String?, vararg variadicArguments: Any?): Unit {
    memScoped {
        callWithVarargs(kniBridge110(), nativeNullPtr, FFI_TYPE_KIND_VOID, arrayOf(nc?.getPointer(memScope), op_and_flags, fmt?.cstr?.getPointer(memScope)), variadicArguments, memScope)
    }
}

fun mg_url_decode(src: String?, src_len: Int, dst: CValuesRef<ByteVar>?, dst_len: Int, is_form_url_encoded: Int): Int {
    memScoped {
        return kniBridge111(src?.cstr?.getPointer(memScope).rawValue, src_len, dst?.getPointer(memScope).rawValue, dst_len, is_form_url_encoded)
    }
}

fun mg_hash_md5_v(num_msgs: size_t, msgs: CValuesRef<CPointerVar<uint8_tVar>>?, msg_lens: CValuesRef<size_tVar>?, digest: CValuesRef<uint8_tVar>?): Unit {
    memScoped {
        return kniBridge112(num_msgs, msgs?.getPointer(memScope).rawValue, msg_lens?.getPointer(memScope).rawValue, digest?.getPointer(memScope).rawValue)
    }
}

fun mg_hash_sha1_v(num_msgs: size_t, msgs: CValuesRef<CPointerVar<uint8_tVar>>?, msg_lens: CValuesRef<size_tVar>?, digest: CValuesRef<uint8_tVar>?): Unit {
    memScoped {
        return kniBridge113(num_msgs, msgs?.getPointer(memScope).rawValue, msg_lens?.getPointer(memScope).rawValue, digest?.getPointer(memScope).rawValue)
    }
}

fun mg_http_is_authorized(hm: CValuesRef<http_message>?, path: CValue<mg_str>, domain: String?, passwords_file: String?, flags: Int): Int {
    memScoped {
        return kniBridge114(hm?.getPointer(memScope).rawValue, path.getPointer(memScope).rawValue, domain?.cstr?.getPointer(memScope).rawValue, passwords_file?.cstr?.getPointer(memScope).rawValue, flags)
    }
}

fun mg_http_send_digest_auth_request(c: CValuesRef<mg_connection>?, domain: String?): Unit {
    memScoped {
        return kniBridge115(c?.getPointer(memScope).rawValue, domain?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_parse_http(s: String?, n: Int, hm: CValuesRef<http_message>?, is_req: Int): Int {
    memScoped {
        return kniBridge116(s?.cstr?.getPointer(memScope).rawValue, n, hm?.getPointer(memScope).rawValue, is_req)
    }
}

fun mg_get_http_header(hm: CValuesRef<http_message>?, name: String?): CPointer<mg_str>? {
    memScoped {
        return interpretCPointer<mg_str>(kniBridge117(hm?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun mg_http_parse_header2(hdr: CValuesRef<mg_str>?, var_name: String?, buf: CValuesRef<CPointerVar<ByteVar>>?, buf_size: size_t): Int {
    memScoped {
        return kniBridge118(hdr?.getPointer(memScope).rawValue, var_name?.cstr?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, buf_size)
    }
}

fun mg_http_parse_header(hdr: CValuesRef<mg_str>?, var_name: String?, buf: CValuesRef<ByteVar>?, buf_size: size_t): Int {
    memScoped {
        return kniBridge119(hdr?.getPointer(memScope).rawValue, var_name?.cstr?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, buf_size)
    }
}

fun mg_get_http_basic_auth(hm: CValuesRef<http_message>?, user: CValuesRef<ByteVar>?, user_len: size_t, pass: CValuesRef<ByteVar>?, pass_len: size_t): Int {
    memScoped {
        return kniBridge120(hm?.getPointer(memScope).rawValue, user?.getPointer(memScope).rawValue, user_len, pass?.getPointer(memScope).rawValue, pass_len)
    }
}

fun mg_parse_http_basic_auth(hdr: CValuesRef<mg_str>?, user: CValuesRef<ByteVar>?, user_len: size_t, pass: CValuesRef<ByteVar>?, pass_len: size_t): Int {
    memScoped {
        return kniBridge121(hdr?.getPointer(memScope).rawValue, user?.getPointer(memScope).rawValue, user_len, pass?.getPointer(memScope).rawValue, pass_len)
    }
}

fun mg_parse_multipart(buf: String?, buf_len: size_t, var_name: CValuesRef<ByteVar>?, var_name_len: size_t, file_name: CValuesRef<ByteVar>?, file_name_len: size_t, chunk: CValuesRef<CPointerVar<ByteVar>>?, chunk_len: CValuesRef<size_tVar>?): size_t {
    memScoped {
        return kniBridge122(buf?.cstr?.getPointer(memScope).rawValue, buf_len, var_name?.getPointer(memScope).rawValue, var_name_len, file_name?.getPointer(memScope).rawValue, file_name_len, chunk?.getPointer(memScope).rawValue, chunk_len?.getPointer(memScope).rawValue)
    }
}

fun mg_get_http_var(buf: CValuesRef<mg_str>?, name: String?, dst: CValuesRef<ByteVar>?, dst_len: size_t): Int {
    memScoped {
        return kniBridge123(buf?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, dst?.getPointer(memScope).rawValue, dst_len)
    }
}

fun mg_serve_http(nc: CValuesRef<mg_connection>?, hm: CValuesRef<http_message>?, opts: CValue<mg_serve_http_opts>): Unit {
    memScoped {
        return kniBridge124(nc?.getPointer(memScope).rawValue, hm?.getPointer(memScope).rawValue, opts.getPointer(memScope).rawValue)
    }
}

fun mg_http_serve_file(nc: CValuesRef<mg_connection>?, hm: CValuesRef<http_message>?, path: String?, mime_type: CValue<mg_str>, extra_headers: CValue<mg_str>): Unit {
    memScoped {
        return kniBridge125(nc?.getPointer(memScope).rawValue, hm?.getPointer(memScope).rawValue, path?.cstr?.getPointer(memScope).rawValue, mime_type.getPointer(memScope).rawValue, extra_headers.getPointer(memScope).rawValue)
    }
}

fun mg_register_http_endpoint(nc: CValuesRef<mg_connection>?, uri_path: String?, handler: mg_event_handler_t?): Unit {
    memScoped {
        return kniBridge126(nc?.getPointer(memScope).rawValue, uri_path?.cstr?.getPointer(memScope).rawValue, handler.rawValue)
    }
}

fun mg_register_http_endpoint_opt(nc: CValuesRef<mg_connection>?, uri_path: String?, handler: mg_event_handler_t?, opts: CValue<mg_http_endpoint_opts>): Unit {
    memScoped {
        return kniBridge127(nc?.getPointer(memScope).rawValue, uri_path?.cstr?.getPointer(memScope).rawValue, handler.rawValue, opts.getPointer(memScope).rawValue)
    }
}

fun mg_http_check_digest_auth(hm: CValuesRef<http_message>?, auth_domain: String?, fp: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge128(hm?.getPointer(memScope).rawValue, auth_domain?.cstr?.getPointer(memScope).rawValue, fp?.getPointer(memScope).rawValue)
    }
}

fun mg_check_digest_auth(method: CValue<mg_str>, uri: CValue<mg_str>, username: CValue<mg_str>, cnonce: CValue<mg_str>, response: CValue<mg_str>, qop: CValue<mg_str>, nc: CValue<mg_str>, nonce: CValue<mg_str>, auth_domain: CValue<mg_str>, fp: CValuesRef<FILE>?): Int {
    memScoped {
        return kniBridge129(method.getPointer(memScope).rawValue, uri.getPointer(memScope).rawValue, username.getPointer(memScope).rawValue, cnonce.getPointer(memScope).rawValue, response.getPointer(memScope).rawValue, qop.getPointer(memScope).rawValue, nc.getPointer(memScope).rawValue, nonce.getPointer(memScope).rawValue, auth_domain.getPointer(memScope).rawValue, fp?.getPointer(memScope).rawValue)
    }
}

fun mg_send_http_chunk(nc: CValuesRef<mg_connection>?, buf: String?, len: size_t): Unit {
    memScoped {
        return kniBridge130(nc?.getPointer(memScope).rawValue, buf?.cstr?.getPointer(memScope).rawValue, len)
    }
}

fun mg_printf_http_chunk(nc: CValuesRef<mg_connection>?, fmt: String?, vararg variadicArguments: Any?): Unit {
    memScoped {
        callWithVarargs(kniBridge131(), nativeNullPtr, FFI_TYPE_KIND_VOID, arrayOf(nc?.getPointer(memScope), fmt?.cstr?.getPointer(memScope)), variadicArguments, memScope)
    }
}

fun mg_send_response_line(nc: CValuesRef<mg_connection>?, status_code: Int, extra_headers: String?): Unit {
    memScoped {
        return kniBridge132(nc?.getPointer(memScope).rawValue, status_code, extra_headers?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_http_send_error(nc: CValuesRef<mg_connection>?, code: Int, reason: String?): Unit {
    memScoped {
        return kniBridge133(nc?.getPointer(memScope).rawValue, code, reason?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_http_send_redirect(nc: CValuesRef<mg_connection>?, status_code: Int, location: CValue<mg_str>, extra_headers: CValue<mg_str>): Unit {
    memScoped {
        return kniBridge134(nc?.getPointer(memScope).rawValue, status_code, location.getPointer(memScope).rawValue, extra_headers.getPointer(memScope).rawValue)
    }
}

fun mg_send_head(n: CValuesRef<mg_connection>?, status_code: Int, content_length: int64_t, extra_headers: String?): Unit {
    memScoped {
        return kniBridge135(n?.getPointer(memScope).rawValue, status_code, content_length, extra_headers?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_printf_html_escape(nc: CValuesRef<mg_connection>?, fmt: String?, vararg variadicArguments: Any?): Unit {
    memScoped {
        callWithVarargs(kniBridge136(), nativeNullPtr, FFI_TYPE_KIND_VOID, arrayOf(nc?.getPointer(memScope), fmt?.cstr?.getPointer(memScope)), variadicArguments, memScope)
    }
}

fun mg_http_reverse_proxy(nc: CValuesRef<mg_connection>?, hm: CValuesRef<http_message>?, mount: CValue<mg_str>, upstream: CValue<mg_str>): Unit {
    memScoped {
        return kniBridge137(nc?.getPointer(memScope).rawValue, hm?.getPointer(memScope).rawValue, mount.getPointer(memScope).rawValue, upstream.getPointer(memScope).rawValue)
    }
}

fun mg_connect_http(mgr: CValuesRef<mg_mgr>?, event_handler: mg_event_handler_t?, url: String?, extra_headers: String?, post_data: String?): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge138(mgr?.getPointer(memScope).rawValue, event_handler.rawValue, url?.cstr?.getPointer(memScope).rawValue, extra_headers?.cstr?.getPointer(memScope).rawValue, post_data?.cstr?.getPointer(memScope).rawValue))
    }
}

fun mg_connect_http_opt(mgr: CValuesRef<mg_mgr>?, ev_handler: mg_event_handler_t?, opts: CValue<mg_connect_opts>, url: String?, extra_headers: String?, post_data: String?): CPointer<mg_connection>? {
    memScoped {
        return interpretCPointer<mg_connection>(kniBridge139(mgr?.getPointer(memScope).rawValue, ev_handler.rawValue, opts.getPointer(memScope).rawValue, url?.cstr?.getPointer(memScope).rawValue, extra_headers?.cstr?.getPointer(memScope).rawValue, post_data?.cstr?.getPointer(memScope).rawValue))
    }
}

fun mg_http_create_digest_auth_header(buf: CValuesRef<ByteVar>?, buf_len: size_t, method: String?, uri: String?, auth_domain: String?, user: String?, passwd: String?, nonce: String?): Int {
    memScoped {
        return kniBridge140(buf?.getPointer(memScope).rawValue, buf_len, method?.cstr?.getPointer(memScope).rawValue, uri?.cstr?.getPointer(memScope).rawValue, auth_domain?.cstr?.getPointer(memScope).rawValue, user?.cstr?.getPointer(memScope).rawValue, passwd?.cstr?.getPointer(memScope).rawValue, nonce?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_set_protocol_mqtt(nc: CValuesRef<mg_connection>?): Unit {
    memScoped {
        return kniBridge141(nc?.getPointer(memScope).rawValue)
    }
}

fun mg_send_mqtt_handshake(nc: CValuesRef<mg_connection>?, client_id: String?): Unit {
    memScoped {
        return kniBridge142(nc?.getPointer(memScope).rawValue, client_id?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_send_mqtt_handshake_opt(nc: CValuesRef<mg_connection>?, client_id: String?, arg2: CValue<mg_send_mqtt_handshake_opts>): Unit {
    memScoped {
        return kniBridge143(nc?.getPointer(memScope).rawValue, client_id?.cstr?.getPointer(memScope).rawValue, arg2.getPointer(memScope).rawValue)
    }
}

fun mg_mqtt_publish(nc: CValuesRef<mg_connection>?, topic: String?, message_id: uint16_t, flags: Int, data: CValuesRef<*>?, len: size_t): Unit {
    memScoped {
        return kniBridge144(nc?.getPointer(memScope).rawValue, topic?.cstr?.getPointer(memScope).rawValue, message_id, flags, data?.getPointer(memScope).rawValue, len)
    }
}

fun mg_mqtt_subscribe(nc: CValuesRef<mg_connection>?, topics: CValuesRef<mg_mqtt_topic_expression>?, topics_len: size_t, message_id: uint16_t): Unit {
    memScoped {
        return kniBridge145(nc?.getPointer(memScope).rawValue, topics?.getPointer(memScope).rawValue, topics_len, message_id)
    }
}

fun mg_mqtt_unsubscribe(nc: CValuesRef<mg_connection>?, topics: CValuesRef<CPointerVar<ByteVar>>?, topics_len: size_t, message_id: uint16_t): Unit {
    memScoped {
        return kniBridge146(nc?.getPointer(memScope).rawValue, topics?.getPointer(memScope).rawValue, topics_len, message_id)
    }
}

fun mg_mqtt_disconnect(nc: CValuesRef<mg_connection>?): Unit {
    memScoped {
        return kniBridge147(nc?.getPointer(memScope).rawValue)
    }
}

fun mg_mqtt_connack(nc: CValuesRef<mg_connection>?, return_code: uint8_t): Unit {
    memScoped {
        return kniBridge148(nc?.getPointer(memScope).rawValue, return_code)
    }
}

fun mg_mqtt_puback(nc: CValuesRef<mg_connection>?, message_id: uint16_t): Unit {
    memScoped {
        return kniBridge149(nc?.getPointer(memScope).rawValue, message_id)
    }
}

fun mg_mqtt_pubrec(nc: CValuesRef<mg_connection>?, message_id: uint16_t): Unit {
    memScoped {
        return kniBridge150(nc?.getPointer(memScope).rawValue, message_id)
    }
}

fun mg_mqtt_pubrel(nc: CValuesRef<mg_connection>?, message_id: uint16_t): Unit {
    memScoped {
        return kniBridge151(nc?.getPointer(memScope).rawValue, message_id)
    }
}

fun mg_mqtt_pubcomp(nc: CValuesRef<mg_connection>?, message_id: uint16_t): Unit {
    memScoped {
        return kniBridge152(nc?.getPointer(memScope).rawValue, message_id)
    }
}

fun mg_mqtt_suback(nc: CValuesRef<mg_connection>?, qoss: CValuesRef<uint8_tVar>?, qoss_len: size_t, message_id: uint16_t): Unit {
    memScoped {
        return kniBridge153(nc?.getPointer(memScope).rawValue, qoss?.getPointer(memScope).rawValue, qoss_len, message_id)
    }
}

fun mg_mqtt_unsuback(nc: CValuesRef<mg_connection>?, message_id: uint16_t): Unit {
    memScoped {
        return kniBridge154(nc?.getPointer(memScope).rawValue, message_id)
    }
}

fun mg_mqtt_ping(nc: CValuesRef<mg_connection>?): Unit {
    memScoped {
        return kniBridge155(nc?.getPointer(memScope).rawValue)
    }
}

fun mg_mqtt_pong(nc: CValuesRef<mg_connection>?): Unit {
    memScoped {
        return kniBridge156(nc?.getPointer(memScope).rawValue)
    }
}

fun mg_mqtt_next_subscribe_topic(msg: CValuesRef<mg_mqtt_message>?, topic: CValuesRef<mg_str>?, qos: CValuesRef<uint8_tVar>?, pos: Int): Int {
    memScoped {
        return kniBridge157(msg?.getPointer(memScope).rawValue, topic?.getPointer(memScope).rawValue, qos?.getPointer(memScope).rawValue, pos)
    }
}

fun mg_mqtt_match_topic_expression(exp: CValue<mg_str>, topic: CValue<mg_str>): Int {
    memScoped {
        return kniBridge158(exp.getPointer(memScope).rawValue, topic.getPointer(memScope).rawValue)
    }
}

fun mg_mqtt_vmatch_topic_expression(exp: String?, topic: CValue<mg_str>): Int {
    memScoped {
        return kniBridge159(exp?.cstr?.getPointer(memScope).rawValue, topic.getPointer(memScope).rawValue)
    }
}

fun mg_dns_next_record(msg: CValuesRef<mg_dns_message>?, query: Int, prev: CValuesRef<mg_dns_resource_record>?): CPointer<mg_dns_resource_record>? {
    memScoped {
        return interpretCPointer<mg_dns_resource_record>(kniBridge160(msg?.getPointer(memScope).rawValue, query, prev?.getPointer(memScope).rawValue))
    }
}

fun mg_dns_parse_record_data(msg: CValuesRef<mg_dns_message>?, rr: CValuesRef<mg_dns_resource_record>?, data: CValuesRef<*>?, data_len: size_t): Int {
    memScoped {
        return kniBridge161(msg?.getPointer(memScope).rawValue, rr?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, data_len)
    }
}

fun mg_send_dns_query(nc: CValuesRef<mg_connection>?, name: String?, query_type: Int): Unit {
    memScoped {
        return kniBridge162(nc?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, query_type)
    }
}

fun mg_dns_insert_header(io: CValuesRef<mbuf>?, pos: size_t, msg: CValuesRef<mg_dns_message>?): Int {
    memScoped {
        return kniBridge163(io?.getPointer(memScope).rawValue, pos, msg?.getPointer(memScope).rawValue)
    }
}

fun mg_dns_copy_questions(io: CValuesRef<mbuf>?, msg: CValuesRef<mg_dns_message>?): Int {
    memScoped {
        return kniBridge164(io?.getPointer(memScope).rawValue, msg?.getPointer(memScope).rawValue)
    }
}

fun mg_dns_encode_record(io: CValuesRef<mbuf>?, rr: CValuesRef<mg_dns_resource_record>?, name: String?, nlen: size_t, rdata: CValuesRef<*>?, rlen: size_t): Int {
    memScoped {
        return kniBridge165(io?.getPointer(memScope).rawValue, rr?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, nlen, rdata?.getPointer(memScope).rawValue, rlen)
    }
}

fun mg_dns_encode_name(io: CValuesRef<mbuf>?, name: String?, len: size_t): Int {
    memScoped {
        return kniBridge166(io?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, len)
    }
}

fun mg_parse_dns(buf: String?, len: Int, msg: CValuesRef<mg_dns_message>?): Int {
    memScoped {
        return kniBridge167(buf?.cstr?.getPointer(memScope).rawValue, len, msg?.getPointer(memScope).rawValue)
    }
}

fun mg_dns_uncompress_name(msg: CValuesRef<mg_dns_message>?, name: CValuesRef<mg_str>?, dst: CValuesRef<ByteVar>?, dst_len: Int): size_t {
    memScoped {
        return kniBridge168(msg?.getPointer(memScope).rawValue, name?.getPointer(memScope).rawValue, dst?.getPointer(memScope).rawValue, dst_len)
    }
}

fun mg_set_protocol_dns(nc: CValuesRef<mg_connection>?): Unit {
    memScoped {
        return kniBridge169(nc?.getPointer(memScope).rawValue)
    }
}

fun mg_resolve_async(mgr: CValuesRef<mg_mgr>?, name: String?, query: Int, cb: mg_resolve_callback_t?, data: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge170(mgr?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, query, cb.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun mg_set_nameserver(mgr: CValuesRef<mg_mgr>?, nameserver: String?): Unit {
    memScoped {
        return kniBridge171(mgr?.getPointer(memScope).rawValue, nameserver?.cstr?.getPointer(memScope).rawValue)
    }
}

fun mg_resolve_async_opt(mgr: CValuesRef<mg_mgr>?, name: String?, query: Int, cb: mg_resolve_callback_t?, data: CValuesRef<*>?, opts: CValue<mg_resolve_async_opts>): Int {
    memScoped {
        return kniBridge172(mgr?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, query, cb.rawValue, data?.getPointer(memScope).rawValue, opts.getPointer(memScope).rawValue)
    }
}

fun mg_resolve_from_hosts_file(host: String?, usa: CValuesRef<socket_address>?): Int {
    memScoped {
        return kniBridge173(host?.cstr?.getPointer(memScope).rawValue, usa?.getPointer(memScope).rawValue)
    }
}

val MG_VERSION: String get() = "6.13"

const val CS_P_CUSTOM: Int = 0

const val CS_P_UNIX: Int = 1

const val CS_P_WINDOWS: Int = 2

const val CS_P_ESP32: Int = 15

const val CS_P_ESP8266: Int = 3

const val CS_P_CC3100: Int = 6

const val CS_P_CC3200: Int = 4

const val CS_P_CC3220: Int = 17

const val CS_P_MSP432: Int = 5

const val CS_P_TM4C129: Int = 14

const val CS_P_MBED: Int = 7

const val CS_P_WINCE: Int = 8

const val CS_P_NXP_LPC: Int = 13

const val CS_P_NXP_KINETIS: Int = 9

const val CS_P_NRF51: Int = 12

const val CS_P_NRF52: Int = 10

const val CS_P_PIC32: Int = 11

const val CS_P_STM32: Int = 16

const val CS_PLATFORM: Int = 1

const val MG_NET_IF_SOCKET: Int = 1

const val MG_NET_IF_SIMPLELINK: Int = 2

const val MG_NET_IF_LWIP_LOW_LEVEL: Int = 3

const val MG_NET_IF_PIC32: Int = 4

const val MG_NET_IF_NULL: Int = 5

const val MG_SSL_IF_OPENSSL: Int = 1

const val MG_SSL_IF_MBEDTLS: Int = 2

const val MG_SSL_IF_SIMPLELINK: Int = 3

const val _XOPEN_SOURCE: Int = 600

const val _LARGEFILE_SOURCE: Int = 1

const val _FILE_OFFSET_BITS: Int = 64

const val `true`: Int = 1

const val `false`: Int = 0

const val __bool_true_false_are_defined: Int = 1

const val INVALID_SOCKET: Int = -1

val SIZE_T_FMT: String get() = "zu"

const val DIRSEP: Int = 47

val INT64_FMT: String get() = "ld"

val INT64_X_FMT: String get() = "lx"

const val MG_MAX_HTTP_REQUEST_SIZE: Int = 8192

const val MG_MAX_HTTP_SEND_MBUF: Int = 4096

const val MG_MAX_HTTP_HEADERS: Int = 40

const val CS_ENABLE_STDIO: Int = 1

const val MG_ENABLE_BROADCAST: Int = 1

const val MG_ENABLE_DIRECTORY_LISTING: Int = 1

const val MG_ENABLE_FILESYSTEM: Int = 1

const val MG_ENABLE_HTTP_CGI: Int = 1

const val MG_NET_IF: Int = 1

val MG_HOSTS_FILE_NAME: String get() = "\u002Fetc\u002Fhosts"

val MG_RESOLV_CONF_FILE_NAME: String get() = "\u002Fetc\u002Fresolv.conf"

const val MG_LWIP: Int = 0

const val CS_DISABLE_MD5: Int = 0

const val CS_DISABLE_SHA1: Int = 0

val MBUF_SIZE_MULTIPLIER: Double get() = bitsToDouble(4609434218613702656) /* == 1.5 */

const val MBUF_SIZE_MAX_HEADROOM: Int = 8192

const val DISABLE_BASE64: Int = 0

const val CS_ENABLE_STRDUP: Int = 0

const val CS_ENABLE_TO64: Int = 0

const val MG_DISABLE_HTTP_DIGEST_AUTH: Int = 0

const val MG_DISABLE_HTTP_KEEP_ALIVE: Int = 0

const val MG_DISABLE_PFS: Int = 0

const val MG_DISABLE_WS_RANDOM_MASK: Int = 0

const val MG_ENABLE_ASYNC_RESOLVER: Int = 1

const val MG_ENABLE_COAP: Int = 0

const val MG_ENABLE_DEBUG: Int = 0

const val MG_ENABLE_DNS: Int = 1

const val MG_ENABLE_DNS_SERVER: Int = 0

const val MG_ENABLE_FAKE_DAVLOCK: Int = 0

const val MG_ENABLE_GETADDRINFO: Int = 0

const val MG_ENABLE_HEXDUMP: Int = 1

const val MG_ENABLE_HTTP: Int = 1

const val MG_ENABLE_HTTP_SSI: Int = 1

const val MG_ENABLE_HTTP_SSI_EXEC: Int = 0

const val MG_ENABLE_HTTP_STREAMING_MULTIPART: Int = 0

const val MG_ENABLE_HTTP_WEBDAV: Int = 0

const val MG_ENABLE_HTTP_WEBSOCKET: Int = 1

const val MG_ENABLE_IPV6: Int = 0

const val MG_ENABLE_MQTT: Int = 1

const val MG_ENABLE_SOCKS: Int = 0

const val MG_ENABLE_MQTT_BROKER: Int = 0

const val MG_ENABLE_SSL: Int = 0

const val MG_ENABLE_SYNC_RESOLVER: Int = 0

const val MG_ENABLE_STDIO: Int = 1

const val MG_SSL_IF: Int = 1

const val MG_ENABLE_THREADS: Int = 0

const val MG_ENABLE_HTTP_URL_REWRITES: Int = 1

const val MG_ENABLE_SNTP: Int = 0

const val MG_ENABLE_EXTRA_ERRORS_DESC: Int = 0

const val MG_ENABLE_CALLBACK_USERDATA: Int = 0

const val MG_MAIN_IFACE: Int = 0

const val MG_VPRINTF_BUFFER_SIZE: Int = 100

const val MG_EV_POLL: Int = 0

const val MG_EV_ACCEPT: Int = 1

const val MG_EV_CONNECT: Int = 2

const val MG_EV_RECV: Int = 3

const val MG_EV_SEND: Int = 4

const val MG_EV_CLOSE: Int = 5

const val MG_EV_TIMER: Int = 6

const val MG_F_LISTENING: Int = 1

const val MG_F_UDP: Int = 2

const val MG_F_RESOLVING: Int = 4

const val MG_F_CONNECTING: Int = 8

const val MG_F_SSL: Int = 16

const val MG_F_SSL_HANDSHAKE_DONE: Int = 32

const val MG_F_WANT_READ: Int = 64

const val MG_F_WANT_WRITE: Int = 128

const val MG_F_IS_WEBSOCKET: Int = 256

const val MG_F_SEND_AND_CLOSE: Int = 1024

const val MG_F_CLOSE_IMMEDIATELY: Int = 2048

const val MG_F_WEBSOCKET_NO_DEFRAG: Int = 4096

const val MG_F_DELETE_CHUNK: Int = 8192

const val MG_F_ENABLE_BROADCAST: Int = 16384

const val MG_F_USER_1: Int = 1048576

const val MG_F_USER_2: Int = 2097152

const val MG_F_USER_3: Int = 4194304

const val MG_F_USER_4: Int = 8388608

const val MG_F_USER_5: Int = 16777216

const val MG_F_USER_6: Int = 33554432

const val MG_MAX_PATH: Int = 4096

const val MG_SOCK_STRINGIFY_IP: Int = 1

const val MG_SOCK_STRINGIFY_PORT: Int = 2

const val MG_SOCK_STRINGIFY_REMOTE: Int = 4

const val MG_URL_ENCODE_F_SPACE_AS_PLUS: Int = 1

const val MG_URL_ENCODE_F_UPPERCASE_HEX: Int = 2

const val MG_CGI_ENVIRONMENT_SIZE: Int = 8192

const val MG_EV_HTTP_REQUEST: Int = 100

const val MG_EV_HTTP_REPLY: Int = 101

const val MG_EV_HTTP_CHUNK: Int = 102

const val MG_EV_SSI_CALL: Int = 105

const val MG_EV_SSI_CALL_CTX: Int = 106

const val MG_EV_WEBSOCKET_HANDSHAKE_REQUEST: Int = 111

const val MG_EV_WEBSOCKET_HANDSHAKE_DONE: Int = 112

const val MG_EV_WEBSOCKET_FRAME: Int = 113

const val MG_EV_WEBSOCKET_CONTROL_FRAME: Int = 114

const val WEBSOCKET_OP_CONTINUE: Int = 0

const val WEBSOCKET_OP_TEXT: Int = 1

const val WEBSOCKET_OP_BINARY: Int = 2

const val WEBSOCKET_OP_CLOSE: Int = 8

const val WEBSOCKET_OP_PING: Int = 9

const val WEBSOCKET_OP_PONG: Int = 10

const val WEBSOCKET_DONT_FIN: Int = 256

const val MG_AUTH_FLAG_IS_DIRECTORY: Int = 1

const val MG_AUTH_FLAG_IS_GLOBAL_PASS_FILE: Int = 2

const val MG_AUTH_FLAG_ALLOW_MISSING_FILE: Int = 4

const val MG_MQTT_CMD_CONNECT: Int = 1

const val MG_MQTT_CMD_CONNACK: Int = 2

const val MG_MQTT_CMD_PUBLISH: Int = 3

const val MG_MQTT_CMD_PUBACK: Int = 4

const val MG_MQTT_CMD_PUBREC: Int = 5

const val MG_MQTT_CMD_PUBREL: Int = 6

const val MG_MQTT_CMD_PUBCOMP: Int = 7

const val MG_MQTT_CMD_SUBSCRIBE: Int = 8

const val MG_MQTT_CMD_SUBACK: Int = 9

const val MG_MQTT_CMD_UNSUBSCRIBE: Int = 10

const val MG_MQTT_CMD_UNSUBACK: Int = 11

const val MG_MQTT_CMD_PINGREQ: Int = 12

const val MG_MQTT_CMD_PINGRESP: Int = 13

const val MG_MQTT_CMD_DISCONNECT: Int = 14

const val MG_MQTT_EVENT_BASE: Int = 200

const val MG_EV_MQTT_CONNECT: Int = 201

const val MG_EV_MQTT_CONNACK: Int = 202

const val MG_EV_MQTT_PUBLISH: Int = 203

const val MG_EV_MQTT_PUBACK: Int = 204

const val MG_EV_MQTT_PUBREC: Int = 205

const val MG_EV_MQTT_PUBREL: Int = 206

const val MG_EV_MQTT_PUBCOMP: Int = 207

const val MG_EV_MQTT_SUBSCRIBE: Int = 208

const val MG_EV_MQTT_SUBACK: Int = 209

const val MG_EV_MQTT_UNSUBSCRIBE: Int = 210

const val MG_EV_MQTT_UNSUBACK: Int = 211

const val MG_EV_MQTT_PINGREQ: Int = 212

const val MG_EV_MQTT_PINGRESP: Int = 213

const val MG_EV_MQTT_DISCONNECT: Int = 214

const val MG_MQTT_RETAIN: Int = 1

const val MG_MQTT_DUP: Int = 4

const val MG_MQTT_CLEAN_SESSION: Int = 2

const val MG_MQTT_HAS_WILL: Int = 4

const val MG_MQTT_WILL_RETAIN: Int = 32

const val MG_MQTT_HAS_PASSWORD: Int = 64

const val MG_MQTT_HAS_USER_NAME: Int = 128

const val MG_EV_MQTT_CONNACK_ACCEPTED: Int = 0

const val MG_EV_MQTT_CONNACK_UNACCEPTABLE_VERSION: Int = 1

const val MG_EV_MQTT_CONNACK_IDENTIFIER_REJECTED: Int = 2

const val MG_EV_MQTT_CONNACK_SERVER_UNAVAILABLE: Int = 3

const val MG_EV_MQTT_CONNACK_BAD_AUTH: Int = 4

const val MG_EV_MQTT_CONNACK_NOT_AUTHORIZED: Int = 5

const val MG_DNS_A_RECORD: Int = 1

const val MG_DNS_CNAME_RECORD: Int = 5

const val MG_DNS_PTR_RECORD: Int = 12

const val MG_DNS_TXT_RECORD: Int = 16

const val MG_DNS_AAAA_RECORD: Int = 28

const val MG_DNS_SRV_RECORD: Int = 33

const val MG_DNS_MX_RECORD: Int = 15

const val MG_DNS_ANY_RECORD: Int = 255

const val MG_DNS_NSEC_RECORD: Int = 47

const val MG_MAX_DNS_QUESTIONS: Int = 32

const val MG_MAX_DNS_ANSWERS: Int = 32

const val MG_DNS_MESSAGE: Int = 100

val mg_ifaces: CArrayPointer<CPointerVar<mg_iface_vtable>>
    get() = interpretCPointer<CPointerVar<mg_iface_vtable>>(kniBridge174())!!

var mg_num_ifaces: Int
    get() = kniBridge175()
    set(value) { kniBridge176(value) }

class cs_md5_ctx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(88, 4)
    
    val buf: CArrayPointer<uint32_tVar>
        get() = arrayMemberAt(0)
    
    val bits: CArrayPointer<uint32_tVar>
        get() = arrayMemberAt(16)
    
    val `in`: CArrayPointer<UByteVar>
        get() = arrayMemberAt(24)
    
}

class cs_sha1_ctx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(92, 4)
    
    val state: CArrayPointer<uint32_tVar>
        get() = arrayMemberAt(0)
    
    val count: CArrayPointer<uint32_tVar>
        get() = arrayMemberAt(20)
    
    val buffer: CArrayPointer<UByteVar>
        get() = arrayMemberAt(28)
    
}

class mg_str(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var p: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var len: size_t
        get() = memberAt<size_tVar>(8).value
        set(value) { memberAt<size_tVar>(8).value = value }
    
}

class mbuf(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var buf: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var len: size_t
        get() = memberAt<size_tVar>(8).value
        set(value) { memberAt<size_tVar>(8).value = value }
    
    var size: size_t
        get() = memberAt<size_tVar>(16).value
        set(value) { memberAt<size_tVar>(16).value = value }
    
}

class cs_base64_ctx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var b64_putc: cs_base64_putc_t?
        get() = memberAt<cs_base64_putc_tVar>(0).value
        set(value) { memberAt<cs_base64_putc_tVar>(0).value = value }
    
    val chunk: CArrayPointer<UByteVar>
        get() = arrayMemberAt(8)
    
    var chunk_size: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var user_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
}

class mg_mgr(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var active_connections: CPointer<mg_connection>?
        get() = memberAt<CPointerVar<mg_connection>>(0).value
        set(value) { memberAt<CPointerVar<mg_connection>>(0).value = value }
    
    var hexdump_file: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    val ctl: CArrayPointer<sock_tVar>
        get() = arrayMemberAt(16)
    
    var user_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
    
    var num_ifaces: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var num_calls: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var ifaces: CPointer<CPointerVar<mg_iface>>?
        get() = memberAt<CPointerVar<CPointerVar<mg_iface>>>(40).value
        set(value) { memberAt<CPointerVar<CPointerVar<mg_iface>>>(40).value = value }
    
    var nameserver: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(48).value
        set(value) { memberAt<CPointerVar<ByteVar>>(48).value = value }
    
}

class mg_connection(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(208, 8)
    
    var next: CPointer<mg_connection>?
        get() = memberAt<CPointerVar<mg_connection>>(0).value
        set(value) { memberAt<CPointerVar<mg_connection>>(0).value = value }
    
    var prev: CPointer<mg_connection>?
        get() = memberAt<CPointerVar<mg_connection>>(8).value
        set(value) { memberAt<CPointerVar<mg_connection>>(8).value = value }
    
    var listener: CPointer<mg_connection>?
        get() = memberAt<CPointerVar<mg_connection>>(16).value
        set(value) { memberAt<CPointerVar<mg_connection>>(16).value = value }
    
    var mgr: CPointer<mg_mgr>?
        get() = memberAt<CPointerVar<mg_mgr>>(24).value
        set(value) { memberAt<CPointerVar<mg_mgr>>(24).value = value }
    
    var sock: sock_t
        get() = memberAt<sock_tVar>(32).value
        set(value) { memberAt<sock_tVar>(32).value = value }
    
    var err: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    val sa: socket_address
        get() = memberAt(40)
    
    var recv_mbuf_limit: size_t
        get() = memberAt<size_tVar>(56).value
        set(value) { memberAt<size_tVar>(56).value = value }
    
    val recv_mbuf: mbuf
        get() = memberAt(64)
    
    val send_mbuf: mbuf
        get() = memberAt(88)
    
    var last_io_time: time_t
        get() = memberAt<time_tVar>(112).value
        set(value) { memberAt<time_tVar>(112).value = value }
    
    var ev_timer_time: Double
        get() = memberAt<DoubleVar>(120).value
        set(value) { memberAt<DoubleVar>(120).value = value }
    
    var proto_handler: mg_event_handler_t?
        get() = memberAt<mg_event_handler_tVar>(128).value
        set(value) { memberAt<mg_event_handler_tVar>(128).value = value }
    
    var proto_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(136).value
        set(value) { memberAt<COpaquePointerVar>(136).value = value }
    
    var proto_data_destructor: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(144).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(144).value = value }
    
    var handler: mg_event_handler_t?
        get() = memberAt<mg_event_handler_tVar>(152).value
        set(value) { memberAt<mg_event_handler_tVar>(152).value = value }
    
    var user_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(160).value
        set(value) { memberAt<COpaquePointerVar>(160).value = value }
    
    val priv_1: anonymousStruct1
        get() = memberAt(168)
    
    var priv_2: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(176).value
        set(value) { memberAt<COpaquePointerVar>(176).value = value }
    
    var mgr_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(184).value
        set(value) { memberAt<COpaquePointerVar>(184).value = value }
    
    var iface: CPointer<mg_iface>?
        get() = memberAt<CPointerVar<mg_iface>>(192).value
        set(value) { memberAt<CPointerVar<mg_iface>>(192).value = value }
    
    var flags: ULong
        get() = memberAt<ULongVar>(200).value
        set(value) { memberAt<ULongVar>(200).value = value }
    
}

class socket_address(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    val sa: sockaddr
        get() = memberAt(0)
    
    val sin: sockaddr_in
        get() = memberAt(0)
    
    val sin6: sockaddr
        get() = memberAt(0)
    
}

class anonymousStruct1(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var v: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var f: mg_event_handler_t?
        get() = memberAt<mg_event_handler_tVar>(0).value
        set(value) { memberAt<mg_event_handler_tVar>(0).value = value }
    
}

class mg_iface(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var mgr: CPointer<mg_mgr>?
        get() = memberAt<CPointerVar<mg_mgr>>(0).value
        set(value) { memberAt<CPointerVar<mg_mgr>>(0).value = value }
    
    var data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var vtable: CPointer<mg_iface_vtable>?
        get() = memberAt<CPointerVar<mg_iface_vtable>>(16).value
        set(value) { memberAt<CPointerVar<mg_iface_vtable>>(16).value = value }
    
}

class mg_iface_vtable(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(136, 8)
    
    var init: CPointer<CFunction<(CPointer<mg_iface>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_iface>?) -> Unit>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_iface>?) -> Unit>>>(0).value = value }
    
    var free: CPointer<CFunction<(CPointer<mg_iface>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_iface>?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_iface>?) -> Unit>>>(8).value = value }
    
    var add_conn: CPointer<CFunction<(CPointer<mg_connection>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Unit>>>(16).value = value }
    
    var remove_conn: CPointer<CFunction<(CPointer<mg_connection>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Unit>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Unit>>>(24).value = value }
    
    var poll: CPointer<CFunction<(CPointer<mg_iface>?, Int) -> time_t>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_iface>?, Int) -> time_t>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_iface>?, Int) -> time_t>>>(32).value = value }
    
    var listen_tcp: CPointer<CFunction<(CPointer<mg_connection>?, CPointer<socket_address>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, CPointer<socket_address>?) -> Int>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, CPointer<socket_address>?) -> Int>>>(40).value = value }
    
    var listen_udp: CPointer<CFunction<(CPointer<mg_connection>?, CPointer<socket_address>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, CPointer<socket_address>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, CPointer<socket_address>?) -> Int>>>(48).value = value }
    
    var connect_tcp: CPointer<CFunction<(CPointer<mg_connection>?, CPointer<socket_address>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, CPointer<socket_address>?) -> Unit>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, CPointer<socket_address>?) -> Unit>>>(56).value = value }
    
    var connect_udp: CPointer<CFunction<(CPointer<mg_connection>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Unit>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Unit>>>(64).value = value }
    
    var tcp_send: CPointer<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t) -> Int>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t) -> Int>>>(72).value = value }
    
    var udp_send: CPointer<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t) -> Int>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t) -> Int>>>(80).value = value }
    
    var tcp_recv: CPointer<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t) -> Int>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t) -> Int>>>(88).value = value }
    
    var udp_recv: CPointer<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t, CPointer<socket_address>?, CPointer<size_tVar>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t, CPointer<socket_address>?, CPointer<size_tVar>?) -> Int>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, COpaquePointer?, size_t, CPointer<socket_address>?, CPointer<size_tVar>?) -> Int>>>(96).value = value }
    
    var create_conn: CPointer<CFunction<(CPointer<mg_connection>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Int>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Int>>>(104).value = value }
    
    var destroy_conn: CPointer<CFunction<(CPointer<mg_connection>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Unit>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?) -> Unit>>>(112).value = value }
    
    var sock_set: CPointer<CFunction<(CPointer<mg_connection>?, sock_t) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, sock_t) -> Unit>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, sock_t) -> Unit>>>(120).value = value }
    
    var get_conn_addr: CPointer<CFunction<(CPointer<mg_connection>?, Int, CPointer<socket_address>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, Int, CPointer<socket_address>?) -> Unit>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<mg_connection>?, Int, CPointer<socket_address>?) -> Unit>>>(128).value = value }
    
}

class mg_mgr_init_opts(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var main_iface: CPointer<mg_iface_vtable>?
        get() = memberAt<CPointerVar<mg_iface_vtable>>(0).value
        set(value) { memberAt<CPointerVar<mg_iface_vtable>>(0).value = value }
    
    var num_ifaces: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var ifaces: CPointer<CPointerVar<mg_iface_vtable>>?
        get() = memberAt<CPointerVar<CPointerVar<mg_iface_vtable>>>(16).value
        set(value) { memberAt<CPointerVar<CPointerVar<mg_iface_vtable>>>(16).value = value }
    
    var nameserver: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
}

class mg_add_sock_opts(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var user_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var flags: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
    var error_string: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(16).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(16).value = value }
    
    var iface: CPointer<mg_iface>?
        get() = memberAt<CPointerVar<mg_iface>>(24).value
        set(value) { memberAt<CPointerVar<mg_iface>>(24).value = value }
    
}

class mg_bind_opts(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var user_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var flags: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
    var error_string: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(16).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(16).value = value }
    
    var iface: CPointer<mg_iface>?
        get() = memberAt<CPointerVar<mg_iface>>(24).value
        set(value) { memberAt<CPointerVar<mg_iface>>(24).value = value }
    
}

class mg_connect_opts(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var user_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var flags: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
    var error_string: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(16).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(16).value = value }
    
    var iface: CPointer<mg_iface>?
        get() = memberAt<CPointerVar<mg_iface>>(24).value
        set(value) { memberAt<CPointerVar<mg_iface>>(24).value = value }
    
    var nameserver: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
}

class http_message(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1400, 8)
    
    val message: mg_str
        get() = memberAt(0)
    
    val body: mg_str
        get() = memberAt(16)
    
    val method: mg_str
        get() = memberAt(32)
    
    val uri: mg_str
        get() = memberAt(48)
    
    val proto: mg_str
        get() = memberAt(64)
    
    var resp_code: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    val resp_status_msg: mg_str
        get() = memberAt(88)
    
    val query_string: mg_str
        get() = memberAt(104)
    
    val header_names: CArrayPointer<mg_str>
        get() = arrayMemberAt(120)
    
    val header_values: CArrayPointer<mg_str>
        get() = arrayMemberAt(760)
    
}

class websocket_message(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var data: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(0).value
        set(value) { memberAt<CPointerVar<UByteVar>>(0).value = value }
    
    var size: size_t
        get() = memberAt<size_tVar>(8).value
        set(value) { memberAt<size_tVar>(8).value = value }
    
    var flags: UByte
        get() = memberAt<UByteVar>(16).value
        set(value) { memberAt<UByteVar>(16).value = value }
    
}

class mg_http_multipart_part(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var file_name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var var_name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    val data: mg_str
        get() = memberAt(16)
    
    var status: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var user_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(40).value
        set(value) { memberAt<COpaquePointerVar>(40).value = value }
    
}

class mg_ssi_call_ctx(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var req: CPointer<http_message>?
        get() = memberAt<CPointerVar<http_message>>(0).value
        set(value) { memberAt<CPointerVar<http_message>>(0).value = value }
    
    val file: mg_str
        get() = memberAt(8)
    
    val arg: mg_str
        get() = memberAt(24)
    
}

class mg_serve_http_opts(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    var document_root: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var index_files: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var per_directory_auth_file: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var auth_domain: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var global_auth_file: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
    var enable_directory_listing: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var ssi_pattern: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(48).value
        set(value) { memberAt<CPointerVar<ByteVar>>(48).value = value }
    
    var ip_acl: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(56).value
        set(value) { memberAt<CPointerVar<ByteVar>>(56).value = value }
    
    var url_rewrites: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(64).value
        set(value) { memberAt<CPointerVar<ByteVar>>(64).value = value }
    
    var dav_document_root: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(72).value
        set(value) { memberAt<CPointerVar<ByteVar>>(72).value = value }
    
    var dav_auth_file: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(80).value
        set(value) { memberAt<CPointerVar<ByteVar>>(80).value = value }
    
    var hidden_file_pattern: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(88).value
        set(value) { memberAt<CPointerVar<ByteVar>>(88).value = value }
    
    var cgi_file_pattern: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(96).value
        set(value) { memberAt<CPointerVar<ByteVar>>(96).value = value }
    
    var cgi_interpreter: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(104).value
        set(value) { memberAt<CPointerVar<ByteVar>>(104).value = value }
    
    var custom_mime_types: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(112).value
        set(value) { memberAt<CPointerVar<ByteVar>>(112).value = value }
    
    var extra_headers: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(120).value
        set(value) { memberAt<CPointerVar<ByteVar>>(120).value = value }
    
}

class mg_http_endpoint_opts(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var user_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var auth_domain: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var auth_file: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
}

class mg_mqtt_message(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(152, 8)
    
    var cmd: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var qos: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var len: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    val topic: mg_str
        get() = memberAt(16)
    
    val payload: mg_str
        get() = memberAt(32)
    
    var connack_ret_code: uint8_t
        get() = memberAt<uint8_tVar>(48).value
        set(value) { memberAt<uint8_tVar>(48).value = value }
    
    var message_id: uint16_t
        get() = memberAt<uint16_tVar>(50).value
        set(value) { memberAt<uint16_tVar>(50).value = value }
    
    var protocol_version: uint8_t
        get() = memberAt<uint8_tVar>(52).value
        set(value) { memberAt<uint8_tVar>(52).value = value }
    
    var connect_flags: uint8_t
        get() = memberAt<uint8_tVar>(53).value
        set(value) { memberAt<uint8_tVar>(53).value = value }
    
    var keep_alive_timer: uint16_t
        get() = memberAt<uint16_tVar>(54).value
        set(value) { memberAt<uint16_tVar>(54).value = value }
    
    val protocol_name: mg_str
        get() = memberAt(56)
    
    val client_id: mg_str
        get() = memberAt(72)
    
    val will_topic: mg_str
        get() = memberAt(88)
    
    val will_message: mg_str
        get() = memberAt(104)
    
    val user_name: mg_str
        get() = memberAt(120)
    
    val password: mg_str
        get() = memberAt(136)
    
}

class mg_mqtt_topic_expression(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var topic: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var qos: uint8_t
        get() = memberAt<uint8_tVar>(8).value
        set(value) { memberAt<uint8_tVar>(8).value = value }
    
}

class mg_send_mqtt_handshake_opts(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var flags: UByte
        get() = memberAt<UByteVar>(0).value
        set(value) { memberAt<UByteVar>(0).value = value }
    
    var keep_alive: uint16_t
        get() = memberAt<uint16_tVar>(2).value
        set(value) { memberAt<uint16_tVar>(2).value = value }
    
    var will_topic: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var will_message: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var user_name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var password: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
}

class mg_mqtt_proto_data(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var keep_alive: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var last_control_time: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
}

class mg_dns_resource_record(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    val name: mg_str
        get() = memberAt(0)
    
    var rtype: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var rclass: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var ttl: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var kind: mg_dns_resource_record_kind
        get() = memberAt<mg_dns_resource_record_kindVar>(28).value
        set(value) { memberAt<mg_dns_resource_record_kindVar>(28).value = value }
    
    val rdata: mg_str
        get() = memberAt(32)
    
}

class mg_dns_message(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(3104, 8)
    
    val pkt: mg_str
        get() = memberAt(0)
    
    var flags: uint16_t
        get() = memberAt<uint16_tVar>(16).value
        set(value) { memberAt<uint16_tVar>(16).value = value }
    
    var transaction_id: uint16_t
        get() = memberAt<uint16_tVar>(18).value
        set(value) { memberAt<uint16_tVar>(18).value = value }
    
    var num_questions: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var num_answers: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    val questions: CArrayPointer<mg_dns_resource_record>
        get() = arrayMemberAt(32)
    
    val answers: CArrayPointer<mg_dns_resource_record>
        get() = arrayMemberAt(1568)
    
}

class mg_resolve_async_opts(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var nameserver: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var max_retries: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var timeout: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var accept_literal: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var only_literal: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var dns_conn: CPointer<CPointerVar<mg_connection>>?
        get() = memberAt<CPointerVar<CPointerVar<mg_connection>>>(24).value
        set(value) { memberAt<CPointerVar<CPointerVar<mg_connection>>>(24).value = value }
    
}

typealias mg_dns_resource_record_kindVar = UIntVarOf<mg_dns_resource_record_kind>
typealias mg_dns_resource_record_kind = UInt

val MG_DNS_INVALID_RECORD: mg_dns_resource_record_kind get() = 0u
val MG_DNS_QUESTION: mg_dns_resource_record_kind get() = 1u
val MG_DNS_ANSWER: mg_dns_resource_record_kind get() = 2u

typealias mg_resolve_errVar = UIntVarOf<mg_resolve_err>
typealias mg_resolve_err = UInt

val MG_RESOLVE_OK: mg_resolve_err get() = 0u
val MG_RESOLVE_NO_ANSWERS: mg_resolve_err get() = 1u
val MG_RESOLVE_EXCEEDED_RETRY_COUNT: mg_resolve_err get() = 2u
val MG_RESOLVE_TIMEOUT: mg_resolve_err get() = 3u

typealias sock_tVar = IntVarOf<sock_t>
typealias sock_t = Int

typealias cs_stat_t = stat

typealias cs_base64_putc_tVar = CPointerVarOf<cs_base64_putc_t>
typealias cs_base64_putc_t = CPointer<CFunction<(Byte, COpaquePointer?) -> Unit>>

typealias mg_event_handler_tVar = CPointerVarOf<mg_event_handler_t>
typealias mg_event_handler_t = CPointer<CFunction<(CPointer<mg_connection>?, Int, COpaquePointer?) -> Unit>>

typealias mg_resolve_callback_tVar = CPointerVarOf<mg_resolve_callback_t>
typealias mg_resolve_callback_t = CPointer<CFunction<(CPointer<mg_dns_message>?, COpaquePointer?, mg_resolve_err) -> Unit>>

@SymbolName("mongoose_kniBridge0")
private external fun kniBridge0(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("mongoose_kniBridge1")
private external fun kniBridge1(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge2")
private external fun kniBridge2(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("mongoose_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge4")
private external fun kniBridge4(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: NativePtr, p2: UInt): Unit
@SymbolName("mongoose_kniBridge6")
private external fun kniBridge6(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: ULong, p2: NativePtr, p3: ULong, p4: NativePtr): Unit
@SymbolName("mongoose_kniBridge8")
private external fun kniBridge8(): Double
@SymbolName("mongoose_kniBridge9")
private external fun kniBridge9(p0: NativePtr): Double
@SymbolName("mongoose_kniBridge10")
private external fun kniBridge10(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge11")
private external fun kniBridge11(p0: NativePtr, p1: ULong, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge12")
private external fun kniBridge12(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge13")
private external fun kniBridge13(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge14")
private external fun kniBridge14(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge15")
private external fun kniBridge15(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge16")
private external fun kniBridge16(p0: NativePtr, p1: Int): NativePtr
@SymbolName("mongoose_kniBridge17")
private external fun kniBridge17(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge18")
private external fun kniBridge18(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("mongoose_kniBridge19")
private external fun kniBridge19(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge20")
private external fun kniBridge20(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge21")
private external fun kniBridge21(p0: NativePtr, p1: ULong): Unit
@SymbolName("mongoose_kniBridge22")
private external fun kniBridge22(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("mongoose_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: ULong, p2: NativePtr, p3: ULong): ULong
@SymbolName("mongoose_kniBridge25")
private external fun kniBridge25(p0: NativePtr, p1: ULong): Unit
@SymbolName("mongoose_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: ULong): Unit
@SymbolName("mongoose_kniBridge27")
private external fun kniBridge27(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge28")
private external fun kniBridge28(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge29")
private external fun kniBridge29(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("mongoose_kniBridge30")
private external fun kniBridge30(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge31")
private external fun kniBridge31(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge32")
private external fun kniBridge32(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("mongoose_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Int
@SymbolName("mongoose_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: ULong): ULong
@SymbolName("mongoose_kniBridge35")
private external fun kniBridge35(): NativePtr
@SymbolName("mongoose_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): Int
@SymbolName("mongoose_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@SymbolName("mongoose_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("mongoose_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("mongoose_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("mongoose_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge42")
private external fun kniBridge42(): NativePtr
@SymbolName("mongoose_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): Int
@SymbolName("mongoose_kniBridge44")
private external fun kniBridge44(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("mongoose_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: Int, p2: NativePtr): ULong
@SymbolName("mongoose_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: NativePtr): ULong
@SymbolName("mongoose_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge50")
private external fun kniBridge50(p0: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge51")
private external fun kniBridge51(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("mongoose_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: Int): Unit
@SymbolName("mongoose_kniBridge53")
private external fun kniBridge53(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge54")
private external fun kniBridge54(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: ULong): Unit
@SymbolName("mongoose_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: Double): Int
@SymbolName("mongoose_kniBridge57")
private external fun kniBridge57(p0: NativePtr): Double
@SymbolName("mongoose_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge60")
private external fun kniBridge60(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge61")
private external fun kniBridge61(p0: NativePtr, p1: Int): Int
@SymbolName("mongoose_kniBridge62")
private external fun kniBridge62(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Unit
@SymbolName("mongoose_kniBridge63")
private external fun kniBridge63(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge65")
private external fun kniBridge65(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge66")
private external fun kniBridge66(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge67")
private external fun kniBridge67(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge69")
private external fun kniBridge69(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("mongoose_kniBridge71")
private external fun kniBridge71(): NativePtr
@SymbolName("mongoose_kniBridge72")
private external fun kniBridge72(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("mongoose_kniBridge73")
private external fun kniBridge73(p0: NativePtr, p1: Int): Int
@SymbolName("mongoose_kniBridge74")
private external fun kniBridge74(p0: NativePtr, p1: UInt): Int
@SymbolName("mongoose_kniBridge75")
private external fun kniBridge75(p0: NativePtr, p1: Double): Double
@SymbolName("mongoose_kniBridge76")
private external fun kniBridge76(): Double
@SymbolName("mongoose_kniBridge77")
private external fun kniBridge77(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr): Int
@SymbolName("mongoose_kniBridge78")
private external fun kniBridge78(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: UInt, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: Int, p8: NativePtr): Int
@SymbolName("mongoose_kniBridge79")
private external fun kniBridge79(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge81")
private external fun kniBridge81(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("mongoose_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge83")
private external fun kniBridge83(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge85")
private external fun kniBridge85(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("mongoose_kniBridge86")
private external fun kniBridge86(p0: NativePtr, p1: ULong, p2: ULong, p3: NativePtr): ULong
@SymbolName("mongoose_kniBridge87")
private external fun kniBridge87(p0: NativePtr, p1: ULong, p2: ULong, p3: NativePtr): ULong
@SymbolName("mongoose_kniBridge88")
private external fun kniBridge88(p0: Int): Unit
@SymbolName("mongoose_kniBridge89")
private external fun kniBridge89(p0: NativePtr, p1: NativePtr, p2: ULong, p3: Int): Int
@SymbolName("mongoose_kniBridge90")
private external fun kniBridge90(p0: Int, p1: NativePtr, p2: ULong, p3: Int): Unit
@SymbolName("mongoose_kniBridge91")
private external fun kniBridge91(p0: NativePtr, p1: NativePtr, p2: ULong, p3: Int): Int
@SymbolName("mongoose_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("mongoose_kniBridge93")
private external fun kniBridge93(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("mongoose_kniBridge94")
private external fun kniBridge94(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: Int): Unit
@SymbolName("mongoose_kniBridge95")
private external fun kniBridge95(): Int
@SymbolName("mongoose_kniBridge96")
private external fun kniBridge96(p0: Byte, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge97")
private external fun kniBridge97(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("mongoose_kniBridge98")
private external fun kniBridge98(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge99")
private external fun kniBridge99(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr): Unit
@SymbolName("mongoose_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge101")
private external fun kniBridge101(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge102")
private external fun kniBridge102(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge103")
private external fun kniBridge103(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("mongoose_kniBridge104")
private external fun kniBridge104(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("mongoose_kniBridge105")
private external fun kniBridge105(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("mongoose_kniBridge106")
private external fun kniBridge106(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge107")
private external fun kniBridge107(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge108")
private external fun kniBridge108(p0: NativePtr, p1: Int, p2: NativePtr, p3: ULong): Unit
@SymbolName("mongoose_kniBridge109")
private external fun kniBridge109(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int): Unit
@SymbolName("mongoose_kniBridge110")
private external fun kniBridge110(): NativePtr
@SymbolName("mongoose_kniBridge111")
private external fun kniBridge111(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: Int): Int
@SymbolName("mongoose_kniBridge112")
private external fun kniBridge112(p0: ULong, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("mongoose_kniBridge113")
private external fun kniBridge113(p0: ULong, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("mongoose_kniBridge114")
private external fun kniBridge114(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int): Int
@SymbolName("mongoose_kniBridge115")
private external fun kniBridge115(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("mongoose_kniBridge117")
private external fun kniBridge117(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Int
@SymbolName("mongoose_kniBridge119")
private external fun kniBridge119(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Int
@SymbolName("mongoose_kniBridge120")
private external fun kniBridge120(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr, p4: ULong): Int
@SymbolName("mongoose_kniBridge121")
private external fun kniBridge121(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr, p4: ULong): Int
@SymbolName("mongoose_kniBridge122")
private external fun kniBridge122(p0: NativePtr, p1: ULong, p2: NativePtr, p3: ULong, p4: NativePtr, p5: ULong, p6: NativePtr, p7: NativePtr): ULong
@SymbolName("mongoose_kniBridge123")
private external fun kniBridge123(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Int
@SymbolName("mongoose_kniBridge124")
private external fun kniBridge124(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge125")
private external fun kniBridge125(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("mongoose_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge127")
private external fun kniBridge127(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("mongoose_kniBridge128")
private external fun kniBridge128(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("mongoose_kniBridge129")
private external fun kniBridge129(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr, p8: NativePtr, p9: NativePtr): Int
@SymbolName("mongoose_kniBridge130")
private external fun kniBridge130(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("mongoose_kniBridge131")
private external fun kniBridge131(): NativePtr
@SymbolName("mongoose_kniBridge132")
private external fun kniBridge132(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge133")
private external fun kniBridge133(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge134")
private external fun kniBridge134(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("mongoose_kniBridge135")
private external fun kniBridge135(p0: NativePtr, p1: Int, p2: Long, p3: NativePtr): Unit
@SymbolName("mongoose_kniBridge136")
private external fun kniBridge136(): NativePtr
@SymbolName("mongoose_kniBridge137")
private external fun kniBridge137(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("mongoose_kniBridge138")
private external fun kniBridge138(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge139")
private external fun kniBridge139(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge140")
private external fun kniBridge140(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr): Int
@SymbolName("mongoose_kniBridge141")
private external fun kniBridge141(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge142")
private external fun kniBridge142(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge143")
private external fun kniBridge143(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("mongoose_kniBridge144")
private external fun kniBridge144(p0: NativePtr, p1: NativePtr, p2: UShort, p3: Int, p4: NativePtr, p5: ULong): Unit
@SymbolName("mongoose_kniBridge145")
private external fun kniBridge145(p0: NativePtr, p1: NativePtr, p2: ULong, p3: UShort): Unit
@SymbolName("mongoose_kniBridge146")
private external fun kniBridge146(p0: NativePtr, p1: NativePtr, p2: ULong, p3: UShort): Unit
@SymbolName("mongoose_kniBridge147")
private external fun kniBridge147(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge148")
private external fun kniBridge148(p0: NativePtr, p1: UByte): Unit
@SymbolName("mongoose_kniBridge149")
private external fun kniBridge149(p0: NativePtr, p1: UShort): Unit
@SymbolName("mongoose_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: UShort): Unit
@SymbolName("mongoose_kniBridge151")
private external fun kniBridge151(p0: NativePtr, p1: UShort): Unit
@SymbolName("mongoose_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: UShort): Unit
@SymbolName("mongoose_kniBridge153")
private external fun kniBridge153(p0: NativePtr, p1: NativePtr, p2: ULong, p3: UShort): Unit
@SymbolName("mongoose_kniBridge154")
private external fun kniBridge154(p0: NativePtr, p1: UShort): Unit
@SymbolName("mongoose_kniBridge155")
private external fun kniBridge155(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge156")
private external fun kniBridge156(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge157")
private external fun kniBridge157(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("mongoose_kniBridge158")
private external fun kniBridge158(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge159")
private external fun kniBridge159(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: Int, p2: NativePtr): NativePtr
@SymbolName("mongoose_kniBridge161")
private external fun kniBridge161(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Int
@SymbolName("mongoose_kniBridge162")
private external fun kniBridge162(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("mongoose_kniBridge163")
private external fun kniBridge163(p0: NativePtr, p1: ULong, p2: NativePtr): Int
@SymbolName("mongoose_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge165")
private external fun kniBridge165(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong, p4: NativePtr, p5: ULong): Int
@SymbolName("mongoose_kniBridge166")
private external fun kniBridge166(p0: NativePtr, p1: NativePtr, p2: ULong): Int
@SymbolName("mongoose_kniBridge167")
private external fun kniBridge167(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("mongoose_kniBridge168")
private external fun kniBridge168(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): ULong
@SymbolName("mongoose_kniBridge169")
private external fun kniBridge169(p0: NativePtr): Unit
@SymbolName("mongoose_kniBridge170")
private external fun kniBridge170(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("mongoose_kniBridge171")
private external fun kniBridge171(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("mongoose_kniBridge172")
private external fun kniBridge172(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("mongoose_kniBridge173")
private external fun kniBridge173(p0: NativePtr, p1: NativePtr): Int
@SymbolName("mongoose_kniBridge174")
private external fun kniBridge174(): NativePtr
@SymbolName("mongoose_kniBridge175")
private external fun kniBridge175(): Int
@SymbolName("mongoose_kniBridge176")
private external fun kniBridge176(p0: Int): Unit
