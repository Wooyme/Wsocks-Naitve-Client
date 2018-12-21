@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package cjson

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import platform.posix.size_t

// NOTE THIS FILE IS AUTO-GENERATED

fun cJSON_Version(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge0())
}

fun cJSON_InitHooks(hooks: CValuesRef<cJSON_Hooks>?): Unit {
    memScoped {
        return kniBridge1(hooks?.getPointer(memScope).rawValue)
    }
}

fun cJSON_Parse(value: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge2(value?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_ParseWithOpts(value: String?, return_parse_end: CValuesRef<CPointerVar<ByteVar>>?, require_null_terminated: cJSON_bool): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge3(value?.cstr?.getPointer(memScope).rawValue, return_parse_end?.getPointer(memScope).rawValue, require_null_terminated))
    }
}

fun cJSON_Print(item: CValuesRef<cJSON>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge4(item?.getPointer(memScope).rawValue))
    }
}

fun cJSON_PrintUnformatted(item: CValuesRef<cJSON>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge5(item?.getPointer(memScope).rawValue))
    }
}

fun cJSON_PrintBuffered(item: CValuesRef<cJSON>?, prebuffer: Int, fmt: cJSON_bool): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge6(item?.getPointer(memScope).rawValue, prebuffer, fmt))
    }
}

fun cJSON_PrintPreallocated(item: CValuesRef<cJSON>?, buffer: CValuesRef<ByteVar>?, length: Int, format: cJSON_bool): cJSON_bool {
    memScoped {
        return kniBridge7(item?.getPointer(memScope).rawValue, buffer?.getPointer(memScope).rawValue, length, format)
    }
}

fun cJSON_Delete(c: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge8(c?.getPointer(memScope).rawValue)
    }
}

fun cJSON_GetArraySize(array: CValuesRef<cJSON>?): Int {
    memScoped {
        return kniBridge9(array?.getPointer(memScope).rawValue)
    }
}

fun cJSON_GetArrayItem(array: CValuesRef<cJSON>?, index: Int): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge10(array?.getPointer(memScope).rawValue, index))
    }
}

fun cJSON_GetObjectItem(`object`: CValuesRef<cJSON>?, string: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge11(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_GetObjectItemCaseSensitive(`object`: CValuesRef<cJSON>?, string: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge12(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_HasObjectItem(`object`: CValuesRef<cJSON>?, string: String?): cJSON_bool {
    memScoped {
        return kniBridge13(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue)
    }
}

fun cJSON_GetErrorPtr(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge14())
}

fun cJSON_GetStringValue(item: CValuesRef<cJSON>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge15(item?.getPointer(memScope).rawValue))
    }
}

fun cJSON_IsInvalid(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge16(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_IsFalse(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge17(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_IsTrue(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge18(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_IsBool(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge19(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_IsNull(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge20(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_IsNumber(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge21(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_IsString(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge22(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_IsArray(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge23(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_IsObject(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge24(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_IsRaw(item: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge25(item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_CreateNull(): CPointer<cJSON>? {
    return interpretCPointer<cJSON>(kniBridge26())
}

fun cJSON_CreateTrue(): CPointer<cJSON>? {
    return interpretCPointer<cJSON>(kniBridge27())
}

fun cJSON_CreateFalse(): CPointer<cJSON>? {
    return interpretCPointer<cJSON>(kniBridge28())
}

fun cJSON_CreateBool(boolean: cJSON_bool): CPointer<cJSON>? {
    return interpretCPointer<cJSON>(kniBridge29(boolean))
}

fun cJSON_CreateNumber(num: Double): CPointer<cJSON>? {
    return interpretCPointer<cJSON>(kniBridge30(num))
}

fun cJSON_CreateString(string: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge31(string?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_CreateRaw(raw: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge32(raw?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_CreateArray(): CPointer<cJSON>? {
    return interpretCPointer<cJSON>(kniBridge33())
}

fun cJSON_CreateObject(): CPointer<cJSON>? {
    return interpretCPointer<cJSON>(kniBridge34())
}

fun cJSON_CreateStringReference(string: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge35(string?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_CreateObjectReference(child: CValuesRef<cJSON>?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge36(child?.getPointer(memScope).rawValue))
    }
}

fun cJSON_CreateArrayReference(child: CValuesRef<cJSON>?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge37(child?.getPointer(memScope).rawValue))
    }
}

fun cJSON_CreateIntArray(numbers: CValuesRef<IntVar>?, count: Int): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge38(numbers?.getPointer(memScope).rawValue, count))
    }
}

fun cJSON_CreateFloatArray(numbers: CValuesRef<FloatVar>?, count: Int): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge39(numbers?.getPointer(memScope).rawValue, count))
    }
}

fun cJSON_CreateDoubleArray(numbers: CValuesRef<DoubleVar>?, count: Int): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge40(numbers?.getPointer(memScope).rawValue, count))
    }
}

fun cJSON_CreateStringArray(strings: CValuesRef<CPointerVar<ByteVar>>?, count: Int): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge41(strings?.getPointer(memScope).rawValue, count))
    }
}

fun cJSON_AddItemToArray(array: CValuesRef<cJSON>?, item: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge42(array?.getPointer(memScope).rawValue, item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_AddItemToObject(`object`: CValuesRef<cJSON>?, string: String?, item: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge43(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue, item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_AddItemToObjectCS(`object`: CValuesRef<cJSON>?, string: String?, item: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge44(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue, item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_AddItemReferenceToArray(array: CValuesRef<cJSON>?, item: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge45(array?.getPointer(memScope).rawValue, item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_AddItemReferenceToObject(`object`: CValuesRef<cJSON>?, string: String?, item: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge46(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue, item?.getPointer(memScope).rawValue)
    }
}

fun cJSON_DetachItemViaPointer(parent: CValuesRef<cJSON>?, item: CValuesRef<cJSON>?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge47(parent?.getPointer(memScope).rawValue, item?.getPointer(memScope).rawValue))
    }
}

fun cJSON_DetachItemFromArray(array: CValuesRef<cJSON>?, which: Int): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge48(array?.getPointer(memScope).rawValue, which))
    }
}

fun cJSON_DeleteItemFromArray(array: CValuesRef<cJSON>?, which: Int): Unit {
    memScoped {
        return kniBridge49(array?.getPointer(memScope).rawValue, which)
    }
}

fun cJSON_DetachItemFromObject(`object`: CValuesRef<cJSON>?, string: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge50(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_DetachItemFromObjectCaseSensitive(`object`: CValuesRef<cJSON>?, string: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge51(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_DeleteItemFromObject(`object`: CValuesRef<cJSON>?, string: String?): Unit {
    memScoped {
        return kniBridge52(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue)
    }
}

fun cJSON_DeleteItemFromObjectCaseSensitive(`object`: CValuesRef<cJSON>?, string: String?): Unit {
    memScoped {
        return kniBridge53(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue)
    }
}

fun cJSON_InsertItemInArray(array: CValuesRef<cJSON>?, which: Int, newitem: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge54(array?.getPointer(memScope).rawValue, which, newitem?.getPointer(memScope).rawValue)
    }
}

fun cJSON_ReplaceItemViaPointer(parent: CValuesRef<cJSON>?, item: CValuesRef<cJSON>?, replacement: CValuesRef<cJSON>?): cJSON_bool {
    memScoped {
        return kniBridge55(parent?.getPointer(memScope).rawValue, item?.getPointer(memScope).rawValue, replacement?.getPointer(memScope).rawValue)
    }
}

fun cJSON_ReplaceItemInArray(array: CValuesRef<cJSON>?, which: Int, newitem: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge56(array?.getPointer(memScope).rawValue, which, newitem?.getPointer(memScope).rawValue)
    }
}

fun cJSON_ReplaceItemInObject(`object`: CValuesRef<cJSON>?, string: String?, newitem: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge57(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue, newitem?.getPointer(memScope).rawValue)
    }
}

fun cJSON_ReplaceItemInObjectCaseSensitive(`object`: CValuesRef<cJSON>?, string: String?, newitem: CValuesRef<cJSON>?): Unit {
    memScoped {
        return kniBridge58(`object`?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue, newitem?.getPointer(memScope).rawValue)
    }
}

fun cJSON_Duplicate(item: CValuesRef<cJSON>?, recurse: cJSON_bool): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge59(item?.getPointer(memScope).rawValue, recurse))
    }
}

fun cJSON_Compare(a: CValuesRef<cJSON>?, b: CValuesRef<cJSON>?, case_sensitive: cJSON_bool): cJSON_bool {
    memScoped {
        return kniBridge60(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, case_sensitive)
    }
}

fun cJSON_Minify(json: CValuesRef<ByteVar>?): Unit {
    memScoped {
        return kniBridge61(json?.getPointer(memScope).rawValue)
    }
}

fun cJSON_AddNullToObject(`object`: CValuesRef<cJSON>?, name: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge62(`object`?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_AddTrueToObject(`object`: CValuesRef<cJSON>?, name: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge63(`object`?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_AddFalseToObject(`object`: CValuesRef<cJSON>?, name: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge64(`object`?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_AddBoolToObject(`object`: CValuesRef<cJSON>?, name: String?, boolean: cJSON_bool): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge65(`object`?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, boolean))
    }
}

fun cJSON_AddNumberToObject(`object`: CValuesRef<cJSON>?, name: String?, number: Double): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge66(`object`?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, number))
    }
}

fun cJSON_AddStringToObject(`object`: CValuesRef<cJSON>?, name: String?, string: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge67(`object`?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_AddRawToObject(`object`: CValuesRef<cJSON>?, name: String?, raw: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge68(`object`?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, raw?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_AddObjectToObject(`object`: CValuesRef<cJSON>?, name: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge69(`object`?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_AddArrayToObject(`object`: CValuesRef<cJSON>?, name: String?): CPointer<cJSON>? {
    memScoped {
        return interpretCPointer<cJSON>(kniBridge70(`object`?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun cJSON_SetNumberHelper(`object`: CValuesRef<cJSON>?, number: Double): Double {
    memScoped {
        return kniBridge71(`object`?.getPointer(memScope).rawValue, number)
    }
}

fun cJSON_malloc(size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge72(size))
}

fun cJSON_free(`object`: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge73(`object`?.getPointer(memScope).rawValue)
    }
}

const val CJSON_VERSION_MAJOR: Int = 1

const val CJSON_VERSION_MINOR: Int = 7

const val CJSON_VERSION_PATCH: Int = 9

const val cJSON_Invalid: Int = 0

const val cJSON_False: Int = 1

const val cJSON_True: Int = 2

const val cJSON_NULL: Int = 4

const val cJSON_Number: Int = 8

const val cJSON_String: Int = 16

const val cJSON_Array: Int = 32

const val cJSON_Object: Int = 64

const val cJSON_Raw: Int = 128

const val cJSON_IsReference: Int = 256

const val cJSON_StringIsConst: Int = 512

const val CJSON_NESTING_LIMIT: Int = 1000

class cJSON(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 8)
    
    var next: CPointer<cJSON>?
        get() = memberAt<CPointerVar<cJSON>>(0).value
        set(value) { memberAt<CPointerVar<cJSON>>(0).value = value }
    
    var prev: CPointer<cJSON>?
        get() = memberAt<CPointerVar<cJSON>>(8).value
        set(value) { memberAt<CPointerVar<cJSON>>(8).value = value }
    
    var child: CPointer<cJSON>?
        get() = memberAt<CPointerVar<cJSON>>(16).value
        set(value) { memberAt<CPointerVar<cJSON>>(16).value = value }
    
    var type: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var valuestring: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
    var valueint: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var valuedouble: Double
        get() = memberAt<DoubleVar>(48).value
        set(value) { memberAt<DoubleVar>(48).value = value }
    
    var string: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(56).value
        set(value) { memberAt<CPointerVar<ByteVar>>(56).value = value }
    
}

class cJSON_Hooks(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var malloc_fn: CPointer<CFunction<(size_t) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(size_t) -> COpaquePointer?>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(size_t) -> COpaquePointer?>>>(0).value = value }
    
    var free_fn: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value = value }
    
}

typealias cJSON_boolVar = IntVarOf<cJSON_bool>
typealias cJSON_bool = Int

@SymbolName("cjson_kniBridge0")
private external fun kniBridge0(): NativePtr
@SymbolName("cjson_kniBridge1")
private external fun kniBridge1(p0: NativePtr): Unit
@SymbolName("cjson_kniBridge2")
private external fun kniBridge2(p0: NativePtr): NativePtr
@SymbolName("cjson_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: NativePtr, p2: Int): NativePtr
@SymbolName("cjson_kniBridge4")
private external fun kniBridge4(p0: NativePtr): NativePtr
@SymbolName("cjson_kniBridge5")
private external fun kniBridge5(p0: NativePtr): NativePtr
@SymbolName("cjson_kniBridge6")
private external fun kniBridge6(p0: NativePtr, p1: Int, p2: Int): NativePtr
@SymbolName("cjson_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int): Int
@SymbolName("cjson_kniBridge8")
private external fun kniBridge8(p0: NativePtr): Unit
@SymbolName("cjson_kniBridge9")
private external fun kniBridge9(p0: NativePtr): Int
@SymbolName("cjson_kniBridge10")
private external fun kniBridge10(p0: NativePtr, p1: Int): NativePtr
@SymbolName("cjson_kniBridge11")
private external fun kniBridge11(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge12")
private external fun kniBridge12(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge13")
private external fun kniBridge13(p0: NativePtr, p1: NativePtr): Int
@SymbolName("cjson_kniBridge14")
private external fun kniBridge14(): NativePtr
@SymbolName("cjson_kniBridge15")
private external fun kniBridge15(p0: NativePtr): NativePtr
@SymbolName("cjson_kniBridge16")
private external fun kniBridge16(p0: NativePtr): Int
@SymbolName("cjson_kniBridge17")
private external fun kniBridge17(p0: NativePtr): Int
@SymbolName("cjson_kniBridge18")
private external fun kniBridge18(p0: NativePtr): Int
@SymbolName("cjson_kniBridge19")
private external fun kniBridge19(p0: NativePtr): Int
@SymbolName("cjson_kniBridge20")
private external fun kniBridge20(p0: NativePtr): Int
@SymbolName("cjson_kniBridge21")
private external fun kniBridge21(p0: NativePtr): Int
@SymbolName("cjson_kniBridge22")
private external fun kniBridge22(p0: NativePtr): Int
@SymbolName("cjson_kniBridge23")
private external fun kniBridge23(p0: NativePtr): Int
@SymbolName("cjson_kniBridge24")
private external fun kniBridge24(p0: NativePtr): Int
@SymbolName("cjson_kniBridge25")
private external fun kniBridge25(p0: NativePtr): Int
@SymbolName("cjson_kniBridge26")
private external fun kniBridge26(): NativePtr
@SymbolName("cjson_kniBridge27")
private external fun kniBridge27(): NativePtr
@SymbolName("cjson_kniBridge28")
private external fun kniBridge28(): NativePtr
@SymbolName("cjson_kniBridge29")
private external fun kniBridge29(p0: Int): NativePtr
@SymbolName("cjson_kniBridge30")
private external fun kniBridge30(p0: Double): NativePtr
@SymbolName("cjson_kniBridge31")
private external fun kniBridge31(p0: NativePtr): NativePtr
@SymbolName("cjson_kniBridge32")
private external fun kniBridge32(p0: NativePtr): NativePtr
@SymbolName("cjson_kniBridge33")
private external fun kniBridge33(): NativePtr
@SymbolName("cjson_kniBridge34")
private external fun kniBridge34(): NativePtr
@SymbolName("cjson_kniBridge35")
private external fun kniBridge35(p0: NativePtr): NativePtr
@SymbolName("cjson_kniBridge36")
private external fun kniBridge36(p0: NativePtr): NativePtr
@SymbolName("cjson_kniBridge37")
private external fun kniBridge37(p0: NativePtr): NativePtr
@SymbolName("cjson_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: Int): NativePtr
@SymbolName("cjson_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: Int): NativePtr
@SymbolName("cjson_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: Int): NativePtr
@SymbolName("cjson_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: Int): NativePtr
@SymbolName("cjson_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cjson_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cjson_kniBridge44")
private external fun kniBridge44(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cjson_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cjson_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cjson_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: Int): NativePtr
@SymbolName("cjson_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: Int): Unit
@SymbolName("cjson_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge51")
private external fun kniBridge51(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cjson_kniBridge53")
private external fun kniBridge53(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cjson_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("cjson_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("cjson_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("cjson_kniBridge57")
private external fun kniBridge57(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cjson_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cjson_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: Int): NativePtr
@SymbolName("cjson_kniBridge60")
private external fun kniBridge60(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("cjson_kniBridge61")
private external fun kniBridge61(p0: NativePtr): Unit
@SymbolName("cjson_kniBridge62")
private external fun kniBridge62(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge63")
private external fun kniBridge63(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge65")
private external fun kniBridge65(p0: NativePtr, p1: NativePtr, p2: Int): NativePtr
@SymbolName("cjson_kniBridge66")
private external fun kniBridge66(p0: NativePtr, p1: NativePtr, p2: Double): NativePtr
@SymbolName("cjson_kniBridge67")
private external fun kniBridge67(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("cjson_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("cjson_kniBridge69")
private external fun kniBridge69(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("cjson_kniBridge71")
private external fun kniBridge71(p0: NativePtr, p1: Double): Double
@SymbolName("cjson_kniBridge72")
private external fun kniBridge72(p0: ULong): NativePtr
@SymbolName("cjson_kniBridge73")
private external fun kniBridge73(p0: NativePtr): Unit
