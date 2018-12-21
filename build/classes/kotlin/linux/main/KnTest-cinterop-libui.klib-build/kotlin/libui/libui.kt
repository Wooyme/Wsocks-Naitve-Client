@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package libui

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs.tm
import cnames.structs.uiArea
import cnames.structs.uiAttribute
import cnames.structs.uiAttributedString
import cnames.structs.uiBox
import cnames.structs.uiButton
import cnames.structs.uiCheckbox
import cnames.structs.uiColorButton
import cnames.structs.uiCombobox
import cnames.structs.uiDateTimePicker
import cnames.structs.uiDrawContext
import cnames.structs.uiDrawPath
import cnames.structs.uiDrawTextLayout
import cnames.structs.uiEditableCombobox
import cnames.structs.uiEntry
import cnames.structs.uiFontButton
import cnames.structs.uiForm
import cnames.structs.uiGrid
import cnames.structs.uiGroup
import cnames.structs.uiImage
import cnames.structs.uiLabel
import cnames.structs.uiMenu
import cnames.structs.uiMenuItem
import cnames.structs.uiMultilineEntry
import cnames.structs.uiOpenTypeFeatures
import cnames.structs.uiProgressBar
import cnames.structs.uiRadioButtons
import cnames.structs.uiSeparator
import cnames.structs.uiSlider
import cnames.structs.uiSpinbox
import cnames.structs.uiTab
import cnames.structs.uiTable
import cnames.structs.uiTableModel
import cnames.structs.uiTableValue
import cnames.structs.uiWindow
import platform.posix.size_t
import platform.posix.size_tVar
import platform.posix.uint32_t
import platform.posix.uint32_tVar
import platform.posix.uint64_t
import platform.posix.uint64_tVar
import platform.posix.uintptr_t

// NOTE THIS FILE IS AUTO-GENERATED

fun uiInit(options: CValuesRef<uiInitOptions>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge0(options?.getPointer(memScope).rawValue))
    }
}

fun uiUninit(): Unit {
    return kniBridge1()
}

fun uiFreeInitError(err: String?): Unit {
    memScoped {
        return kniBridge2(err?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiMain(): Unit {
    return kniBridge3()
}

fun uiMainSteps(): Unit {
    return kniBridge4()
}

fun uiMainStep(wait: Int): Int {
    return kniBridge5(wait)
}

fun uiQuit(): Unit {
    return kniBridge6()
}

fun uiQueueMain(f: CPointer<CFunction<(COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge7(f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiTimer(milliseconds: Int, f: CPointer<CFunction<(COpaquePointer?) -> Int>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge8(milliseconds, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiOnShouldQuit(f: CPointer<CFunction<(COpaquePointer?) -> Int>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge9(f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiFreeText(text: CValuesRef<ByteVar>?): Unit {
    memScoped {
        return kniBridge10(text?.getPointer(memScope).rawValue)
    }
}

fun uiControlDestroy(arg0: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge11(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiControlHandle(arg0: CValuesRef<uiControl>?): uintptr_t {
    memScoped {
        return kniBridge12(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiControlParent(arg0: CValuesRef<uiControl>?): CPointer<uiControl>? {
    memScoped {
        return interpretCPointer<uiControl>(kniBridge13(arg0?.getPointer(memScope).rawValue))
    }
}

fun uiControlSetParent(arg0: CValuesRef<uiControl>?, arg1: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge14(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue)
    }
}

fun uiControlToplevel(arg0: CValuesRef<uiControl>?): Int {
    memScoped {
        return kniBridge15(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiControlVisible(arg0: CValuesRef<uiControl>?): Int {
    memScoped {
        return kniBridge16(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiControlShow(arg0: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge17(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiControlHide(arg0: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge18(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiControlEnabled(arg0: CValuesRef<uiControl>?): Int {
    memScoped {
        return kniBridge19(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiControlEnable(arg0: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge20(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiControlDisable(arg0: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge21(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiAllocControl(n: size_t, OSsig: uint32_t, typesig: uint32_t, typenamestr: String?): CPointer<uiControl>? {
    memScoped {
        return interpretCPointer<uiControl>(kniBridge22(n, OSsig, typesig, typenamestr?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiFreeControl(arg0: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge23(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiControlVerifySetParent(arg0: CValuesRef<uiControl>?, arg1: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge24(arg0?.getPointer(memScope).rawValue, arg1?.getPointer(memScope).rawValue)
    }
}

fun uiControlEnabledToUser(arg0: CValuesRef<uiControl>?): Int {
    memScoped {
        return kniBridge25(arg0?.getPointer(memScope).rawValue)
    }
}

fun uiUserBugCannotSetParentOnToplevel(type: String?): Unit {
    memScoped {
        return kniBridge26(type?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiWindowTitle(w: CValuesRef<uiWindow>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge27(w?.getPointer(memScope).rawValue))
    }
}

fun uiWindowSetTitle(w: CValuesRef<uiWindow>?, title: String?): Unit {
    memScoped {
        return kniBridge28(w?.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiWindowContentSize(w: CValuesRef<uiWindow>?, width: CValuesRef<IntVar>?, height: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge29(w?.getPointer(memScope).rawValue, width?.getPointer(memScope).rawValue, height?.getPointer(memScope).rawValue)
    }
}

fun uiWindowSetContentSize(w: CValuesRef<uiWindow>?, width: Int, height: Int): Unit {
    memScoped {
        return kniBridge30(w?.getPointer(memScope).rawValue, width, height)
    }
}

fun uiWindowFullscreen(w: CValuesRef<uiWindow>?): Int {
    memScoped {
        return kniBridge31(w?.getPointer(memScope).rawValue)
    }
}

fun uiWindowSetFullscreen(w: CValuesRef<uiWindow>?, fullscreen: Int): Unit {
    memScoped {
        return kniBridge32(w?.getPointer(memScope).rawValue, fullscreen)
    }
}

fun uiWindowOnContentSizeChanged(w: CValuesRef<uiWindow>?, f: CPointer<CFunction<(CPointer<uiWindow>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge33(w?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiWindowOnClosing(w: CValuesRef<uiWindow>?, f: CPointer<CFunction<(CPointer<uiWindow>?, COpaquePointer?) -> Int>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge34(w?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiWindowBorderless(w: CValuesRef<uiWindow>?): Int {
    memScoped {
        return kniBridge35(w?.getPointer(memScope).rawValue)
    }
}

fun uiWindowSetBorderless(w: CValuesRef<uiWindow>?, borderless: Int): Unit {
    memScoped {
        return kniBridge36(w?.getPointer(memScope).rawValue, borderless)
    }
}

fun uiWindowSetChild(w: CValuesRef<uiWindow>?, child: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge37(w?.getPointer(memScope).rawValue, child?.getPointer(memScope).rawValue)
    }
}

fun uiWindowMargined(w: CValuesRef<uiWindow>?): Int {
    memScoped {
        return kniBridge38(w?.getPointer(memScope).rawValue)
    }
}

fun uiWindowSetMargined(w: CValuesRef<uiWindow>?, margined: Int): Unit {
    memScoped {
        return kniBridge39(w?.getPointer(memScope).rawValue, margined)
    }
}

fun uiNewWindow(title: String?, width: Int, height: Int, hasMenubar: Int): CPointer<uiWindow>? {
    memScoped {
        return interpretCPointer<uiWindow>(kniBridge40(title?.cstr?.getPointer(memScope).rawValue, width, height, hasMenubar))
    }
}

fun uiButtonText(b: CValuesRef<uiButton>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge41(b?.getPointer(memScope).rawValue))
    }
}

fun uiButtonSetText(b: CValuesRef<uiButton>?, text: String?): Unit {
    memScoped {
        return kniBridge42(b?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiButtonOnClicked(b: CValuesRef<uiButton>?, f: CPointer<CFunction<(CPointer<uiButton>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge43(b?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewButton(text: String?): CPointer<uiButton>? {
    memScoped {
        return interpretCPointer<uiButton>(kniBridge44(text?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiBoxAppend(b: CValuesRef<uiBox>?, child: CValuesRef<uiControl>?, stretchy: Int): Unit {
    memScoped {
        return kniBridge45(b?.getPointer(memScope).rawValue, child?.getPointer(memScope).rawValue, stretchy)
    }
}

fun uiBoxDelete(b: CValuesRef<uiBox>?, index: Int): Unit {
    memScoped {
        return kniBridge46(b?.getPointer(memScope).rawValue, index)
    }
}

fun uiBoxPadded(b: CValuesRef<uiBox>?): Int {
    memScoped {
        return kniBridge47(b?.getPointer(memScope).rawValue)
    }
}

fun uiBoxSetPadded(b: CValuesRef<uiBox>?, padded: Int): Unit {
    memScoped {
        return kniBridge48(b?.getPointer(memScope).rawValue, padded)
    }
}

fun uiNewHorizontalBox(): CPointer<uiBox>? {
    return interpretCPointer<uiBox>(kniBridge49())
}

fun uiNewVerticalBox(): CPointer<uiBox>? {
    return interpretCPointer<uiBox>(kniBridge50())
}

fun uiCheckboxText(c: CValuesRef<uiCheckbox>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge51(c?.getPointer(memScope).rawValue))
    }
}

fun uiCheckboxSetText(c: CValuesRef<uiCheckbox>?, text: String?): Unit {
    memScoped {
        return kniBridge52(c?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiCheckboxOnToggled(c: CValuesRef<uiCheckbox>?, f: CPointer<CFunction<(CPointer<uiCheckbox>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge53(c?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiCheckboxChecked(c: CValuesRef<uiCheckbox>?): Int {
    memScoped {
        return kniBridge54(c?.getPointer(memScope).rawValue)
    }
}

fun uiCheckboxSetChecked(c: CValuesRef<uiCheckbox>?, checked: Int): Unit {
    memScoped {
        return kniBridge55(c?.getPointer(memScope).rawValue, checked)
    }
}

fun uiNewCheckbox(text: String?): CPointer<uiCheckbox>? {
    memScoped {
        return interpretCPointer<uiCheckbox>(kniBridge56(text?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiEntryText(e: CValuesRef<uiEntry>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge57(e?.getPointer(memScope).rawValue))
    }
}

fun uiEntrySetText(e: CValuesRef<uiEntry>?, text: String?): Unit {
    memScoped {
        return kniBridge58(e?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiEntryOnChanged(e: CValuesRef<uiEntry>?, f: CPointer<CFunction<(CPointer<uiEntry>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge59(e?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiEntryReadOnly(e: CValuesRef<uiEntry>?): Int {
    memScoped {
        return kniBridge60(e?.getPointer(memScope).rawValue)
    }
}

fun uiEntrySetReadOnly(e: CValuesRef<uiEntry>?, readonly: Int): Unit {
    memScoped {
        return kniBridge61(e?.getPointer(memScope).rawValue, readonly)
    }
}

fun uiNewEntry(): CPointer<uiEntry>? {
    return interpretCPointer<uiEntry>(kniBridge62())
}

fun uiNewPasswordEntry(): CPointer<uiEntry>? {
    return interpretCPointer<uiEntry>(kniBridge63())
}

fun uiNewSearchEntry(): CPointer<uiEntry>? {
    return interpretCPointer<uiEntry>(kniBridge64())
}

fun uiLabelText(l: CValuesRef<uiLabel>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge65(l?.getPointer(memScope).rawValue))
    }
}

fun uiLabelSetText(l: CValuesRef<uiLabel>?, text: String?): Unit {
    memScoped {
        return kniBridge66(l?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiNewLabel(text: String?): CPointer<uiLabel>? {
    memScoped {
        return interpretCPointer<uiLabel>(kniBridge67(text?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiTabAppend(t: CValuesRef<uiTab>?, name: String?, c: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge68(t?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue)
    }
}

fun uiTabInsertAt(t: CValuesRef<uiTab>?, name: String?, before: Int, c: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge69(t?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, before, c?.getPointer(memScope).rawValue)
    }
}

fun uiTabDelete(t: CValuesRef<uiTab>?, index: Int): Unit {
    memScoped {
        return kniBridge70(t?.getPointer(memScope).rawValue, index)
    }
}

fun uiTabNumPages(t: CValuesRef<uiTab>?): Int {
    memScoped {
        return kniBridge71(t?.getPointer(memScope).rawValue)
    }
}

fun uiTabMargined(t: CValuesRef<uiTab>?, page: Int): Int {
    memScoped {
        return kniBridge72(t?.getPointer(memScope).rawValue, page)
    }
}

fun uiTabSetMargined(t: CValuesRef<uiTab>?, page: Int, margined: Int): Unit {
    memScoped {
        return kniBridge73(t?.getPointer(memScope).rawValue, page, margined)
    }
}

fun uiNewTab(): CPointer<uiTab>? {
    return interpretCPointer<uiTab>(kniBridge74())
}

fun uiGroupTitle(g: CValuesRef<uiGroup>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge75(g?.getPointer(memScope).rawValue))
    }
}

fun uiGroupSetTitle(g: CValuesRef<uiGroup>?, title: String?): Unit {
    memScoped {
        return kniBridge76(g?.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiGroupSetChild(g: CValuesRef<uiGroup>?, c: CValuesRef<uiControl>?): Unit {
    memScoped {
        return kniBridge77(g?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue)
    }
}

fun uiGroupMargined(g: CValuesRef<uiGroup>?): Int {
    memScoped {
        return kniBridge78(g?.getPointer(memScope).rawValue)
    }
}

fun uiGroupSetMargined(g: CValuesRef<uiGroup>?, margined: Int): Unit {
    memScoped {
        return kniBridge79(g?.getPointer(memScope).rawValue, margined)
    }
}

fun uiNewGroup(title: String?): CPointer<uiGroup>? {
    memScoped {
        return interpretCPointer<uiGroup>(kniBridge80(title?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiSpinboxValue(s: CValuesRef<uiSpinbox>?): Int {
    memScoped {
        return kniBridge81(s?.getPointer(memScope).rawValue)
    }
}

fun uiSpinboxSetValue(s: CValuesRef<uiSpinbox>?, value: Int): Unit {
    memScoped {
        return kniBridge82(s?.getPointer(memScope).rawValue, value)
    }
}

fun uiSpinboxOnChanged(s: CValuesRef<uiSpinbox>?, f: CPointer<CFunction<(CPointer<uiSpinbox>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge83(s?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewSpinbox(min: Int, max: Int): CPointer<uiSpinbox>? {
    return interpretCPointer<uiSpinbox>(kniBridge84(min, max))
}

fun uiSliderValue(s: CValuesRef<uiSlider>?): Int {
    memScoped {
        return kniBridge85(s?.getPointer(memScope).rawValue)
    }
}

fun uiSliderSetValue(s: CValuesRef<uiSlider>?, value: Int): Unit {
    memScoped {
        return kniBridge86(s?.getPointer(memScope).rawValue, value)
    }
}

fun uiSliderOnChanged(s: CValuesRef<uiSlider>?, f: CPointer<CFunction<(CPointer<uiSlider>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge87(s?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewSlider(min: Int, max: Int): CPointer<uiSlider>? {
    return interpretCPointer<uiSlider>(kniBridge88(min, max))
}

fun uiProgressBarValue(p: CValuesRef<uiProgressBar>?): Int {
    memScoped {
        return kniBridge89(p?.getPointer(memScope).rawValue)
    }
}

fun uiProgressBarSetValue(p: CValuesRef<uiProgressBar>?, n: Int): Unit {
    memScoped {
        return kniBridge90(p?.getPointer(memScope).rawValue, n)
    }
}

fun uiNewProgressBar(): CPointer<uiProgressBar>? {
    return interpretCPointer<uiProgressBar>(kniBridge91())
}

fun uiNewHorizontalSeparator(): CPointer<uiSeparator>? {
    return interpretCPointer<uiSeparator>(kniBridge92())
}

fun uiNewVerticalSeparator(): CPointer<uiSeparator>? {
    return interpretCPointer<uiSeparator>(kniBridge93())
}

fun uiComboboxAppend(c: CValuesRef<uiCombobox>?, text: String?): Unit {
    memScoped {
        return kniBridge94(c?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiComboboxSelected(c: CValuesRef<uiCombobox>?): Int {
    memScoped {
        return kniBridge95(c?.getPointer(memScope).rawValue)
    }
}

fun uiComboboxSetSelected(c: CValuesRef<uiCombobox>?, n: Int): Unit {
    memScoped {
        return kniBridge96(c?.getPointer(memScope).rawValue, n)
    }
}

fun uiComboboxOnSelected(c: CValuesRef<uiCombobox>?, f: CPointer<CFunction<(CPointer<uiCombobox>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge97(c?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewCombobox(): CPointer<uiCombobox>? {
    return interpretCPointer<uiCombobox>(kniBridge98())
}

fun uiEditableComboboxAppend(c: CValuesRef<uiEditableCombobox>?, text: String?): Unit {
    memScoped {
        return kniBridge99(c?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiEditableComboboxText(c: CValuesRef<uiEditableCombobox>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge100(c?.getPointer(memScope).rawValue))
    }
}

fun uiEditableComboboxSetText(c: CValuesRef<uiEditableCombobox>?, text: String?): Unit {
    memScoped {
        return kniBridge101(c?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiEditableComboboxOnChanged(c: CValuesRef<uiEditableCombobox>?, f: CPointer<CFunction<(CPointer<uiEditableCombobox>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge102(c?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewEditableCombobox(): CPointer<uiEditableCombobox>? {
    return interpretCPointer<uiEditableCombobox>(kniBridge103())
}

fun uiRadioButtonsAppend(r: CValuesRef<uiRadioButtons>?, text: String?): Unit {
    memScoped {
        return kniBridge104(r?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiRadioButtonsSelected(r: CValuesRef<uiRadioButtons>?): Int {
    memScoped {
        return kniBridge105(r?.getPointer(memScope).rawValue)
    }
}

fun uiRadioButtonsSetSelected(r: CValuesRef<uiRadioButtons>?, n: Int): Unit {
    memScoped {
        return kniBridge106(r?.getPointer(memScope).rawValue, n)
    }
}

fun uiRadioButtonsOnSelected(r: CValuesRef<uiRadioButtons>?, f: CPointer<CFunction<(CPointer<uiRadioButtons>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge107(r?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewRadioButtons(): CPointer<uiRadioButtons>? {
    return interpretCPointer<uiRadioButtons>(kniBridge108())
}

fun uiDateTimePickerTime(d: CValuesRef<uiDateTimePicker>?, time: CValuesRef<tm>?): Unit {
    memScoped {
        return kniBridge109(d?.getPointer(memScope).rawValue, time?.getPointer(memScope).rawValue)
    }
}

fun uiDateTimePickerSetTime(d: CValuesRef<uiDateTimePicker>?, time: CValuesRef<tm>?): Unit {
    memScoped {
        return kniBridge110(d?.getPointer(memScope).rawValue, time?.getPointer(memScope).rawValue)
    }
}

fun uiDateTimePickerOnChanged(d: CValuesRef<uiDateTimePicker>?, f: CPointer<CFunction<(CPointer<uiDateTimePicker>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge111(d?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewDateTimePicker(): CPointer<uiDateTimePicker>? {
    return interpretCPointer<uiDateTimePicker>(kniBridge112())
}

fun uiNewDatePicker(): CPointer<uiDateTimePicker>? {
    return interpretCPointer<uiDateTimePicker>(kniBridge113())
}

fun uiNewTimePicker(): CPointer<uiDateTimePicker>? {
    return interpretCPointer<uiDateTimePicker>(kniBridge114())
}

fun uiMultilineEntryText(e: CValuesRef<uiMultilineEntry>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge115(e?.getPointer(memScope).rawValue))
    }
}

fun uiMultilineEntrySetText(e: CValuesRef<uiMultilineEntry>?, text: String?): Unit {
    memScoped {
        return kniBridge116(e?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiMultilineEntryAppend(e: CValuesRef<uiMultilineEntry>?, text: String?): Unit {
    memScoped {
        return kniBridge117(e?.getPointer(memScope).rawValue, text?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiMultilineEntryOnChanged(e: CValuesRef<uiMultilineEntry>?, f: CPointer<CFunction<(CPointer<uiMultilineEntry>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge118(e?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiMultilineEntryReadOnly(e: CValuesRef<uiMultilineEntry>?): Int {
    memScoped {
        return kniBridge119(e?.getPointer(memScope).rawValue)
    }
}

fun uiMultilineEntrySetReadOnly(e: CValuesRef<uiMultilineEntry>?, readonly: Int): Unit {
    memScoped {
        return kniBridge120(e?.getPointer(memScope).rawValue, readonly)
    }
}

fun uiNewMultilineEntry(): CPointer<uiMultilineEntry>? {
    return interpretCPointer<uiMultilineEntry>(kniBridge121())
}

fun uiNewNonWrappingMultilineEntry(): CPointer<uiMultilineEntry>? {
    return interpretCPointer<uiMultilineEntry>(kniBridge122())
}

fun uiMenuItemEnable(m: CValuesRef<uiMenuItem>?): Unit {
    memScoped {
        return kniBridge123(m?.getPointer(memScope).rawValue)
    }
}

fun uiMenuItemDisable(m: CValuesRef<uiMenuItem>?): Unit {
    memScoped {
        return kniBridge124(m?.getPointer(memScope).rawValue)
    }
}

fun uiMenuItemOnClicked(m: CValuesRef<uiMenuItem>?, f: CPointer<CFunction<(CPointer<uiMenuItem>?, CPointer<uiWindow>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge125(m?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiMenuItemChecked(m: CValuesRef<uiMenuItem>?): Int {
    memScoped {
        return kniBridge126(m?.getPointer(memScope).rawValue)
    }
}

fun uiMenuItemSetChecked(m: CValuesRef<uiMenuItem>?, checked: Int): Unit {
    memScoped {
        return kniBridge127(m?.getPointer(memScope).rawValue, checked)
    }
}

fun uiMenuAppendItem(m: CValuesRef<uiMenu>?, name: String?): CPointer<uiMenuItem>? {
    memScoped {
        return interpretCPointer<uiMenuItem>(kniBridge128(m?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiMenuAppendCheckItem(m: CValuesRef<uiMenu>?, name: String?): CPointer<uiMenuItem>? {
    memScoped {
        return interpretCPointer<uiMenuItem>(kniBridge129(m?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiMenuAppendQuitItem(m: CValuesRef<uiMenu>?): CPointer<uiMenuItem>? {
    memScoped {
        return interpretCPointer<uiMenuItem>(kniBridge130(m?.getPointer(memScope).rawValue))
    }
}

fun uiMenuAppendPreferencesItem(m: CValuesRef<uiMenu>?): CPointer<uiMenuItem>? {
    memScoped {
        return interpretCPointer<uiMenuItem>(kniBridge131(m?.getPointer(memScope).rawValue))
    }
}

fun uiMenuAppendAboutItem(m: CValuesRef<uiMenu>?): CPointer<uiMenuItem>? {
    memScoped {
        return interpretCPointer<uiMenuItem>(kniBridge132(m?.getPointer(memScope).rawValue))
    }
}

fun uiMenuAppendSeparator(m: CValuesRef<uiMenu>?): Unit {
    memScoped {
        return kniBridge133(m?.getPointer(memScope).rawValue)
    }
}

fun uiNewMenu(name: String?): CPointer<uiMenu>? {
    memScoped {
        return interpretCPointer<uiMenu>(kniBridge134(name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiOpenFile(parent: CValuesRef<uiWindow>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge135(parent?.getPointer(memScope).rawValue))
    }
}

fun uiSaveFile(parent: CValuesRef<uiWindow>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge136(parent?.getPointer(memScope).rawValue))
    }
}

fun uiMsgBox(parent: CValuesRef<uiWindow>?, title: String?, description: String?): Unit {
    memScoped {
        return kniBridge137(parent?.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue, description?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiMsgBoxError(parent: CValuesRef<uiWindow>?, title: String?, description: String?): Unit {
    memScoped {
        return kniBridge138(parent?.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue, description?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiAreaSetSize(a: CValuesRef<uiArea>?, width: Int, height: Int): Unit {
    memScoped {
        return kniBridge139(a?.getPointer(memScope).rawValue, width, height)
    }
}

fun uiAreaQueueRedrawAll(a: CValuesRef<uiArea>?): Unit {
    memScoped {
        return kniBridge140(a?.getPointer(memScope).rawValue)
    }
}

fun uiAreaScrollTo(a: CValuesRef<uiArea>?, x: Double, y: Double, width: Double, height: Double): Unit {
    memScoped {
        return kniBridge141(a?.getPointer(memScope).rawValue, x, y, width, height)
    }
}

fun uiAreaBeginUserWindowMove(a: CValuesRef<uiArea>?): Unit {
    memScoped {
        return kniBridge142(a?.getPointer(memScope).rawValue)
    }
}

fun uiAreaBeginUserWindowResize(a: CValuesRef<uiArea>?, edge: uiWindowResizeEdge): Unit {
    memScoped {
        return kniBridge143(a?.getPointer(memScope).rawValue, edge)
    }
}

fun uiNewArea(ah: CValuesRef<uiAreaHandler>?): CPointer<uiArea>? {
    memScoped {
        return interpretCPointer<uiArea>(kniBridge144(ah?.getPointer(memScope).rawValue))
    }
}

fun uiNewScrollingArea(ah: CValuesRef<uiAreaHandler>?, width: Int, height: Int): CPointer<uiArea>? {
    memScoped {
        return interpretCPointer<uiArea>(kniBridge145(ah?.getPointer(memScope).rawValue, width, height))
    }
}

fun uiDrawNewPath(fillMode: uiDrawFillMode): CPointer<uiDrawPath>? {
    return interpretCPointer<uiDrawPath>(kniBridge146(fillMode))
}

fun uiDrawFreePath(p: CValuesRef<uiDrawPath>?): Unit {
    memScoped {
        return kniBridge147(p?.getPointer(memScope).rawValue)
    }
}

fun uiDrawPathNewFigure(p: CValuesRef<uiDrawPath>?, x: Double, y: Double): Unit {
    memScoped {
        return kniBridge148(p?.getPointer(memScope).rawValue, x, y)
    }
}

fun uiDrawPathNewFigureWithArc(p: CValuesRef<uiDrawPath>?, xCenter: Double, yCenter: Double, radius: Double, startAngle: Double, sweep: Double, negative: Int): Unit {
    memScoped {
        return kniBridge149(p?.getPointer(memScope).rawValue, xCenter, yCenter, radius, startAngle, sweep, negative)
    }
}

fun uiDrawPathLineTo(p: CValuesRef<uiDrawPath>?, x: Double, y: Double): Unit {
    memScoped {
        return kniBridge150(p?.getPointer(memScope).rawValue, x, y)
    }
}

fun uiDrawPathArcTo(p: CValuesRef<uiDrawPath>?, xCenter: Double, yCenter: Double, radius: Double, startAngle: Double, sweep: Double, negative: Int): Unit {
    memScoped {
        return kniBridge151(p?.getPointer(memScope).rawValue, xCenter, yCenter, radius, startAngle, sweep, negative)
    }
}

fun uiDrawPathBezierTo(p: CValuesRef<uiDrawPath>?, c1x: Double, c1y: Double, c2x: Double, c2y: Double, endX: Double, endY: Double): Unit {
    memScoped {
        return kniBridge152(p?.getPointer(memScope).rawValue, c1x, c1y, c2x, c2y, endX, endY)
    }
}

fun uiDrawPathCloseFigure(p: CValuesRef<uiDrawPath>?): Unit {
    memScoped {
        return kniBridge153(p?.getPointer(memScope).rawValue)
    }
}

fun uiDrawPathAddRectangle(p: CValuesRef<uiDrawPath>?, x: Double, y: Double, width: Double, height: Double): Unit {
    memScoped {
        return kniBridge154(p?.getPointer(memScope).rawValue, x, y, width, height)
    }
}

fun uiDrawPathEnd(p: CValuesRef<uiDrawPath>?): Unit {
    memScoped {
        return kniBridge155(p?.getPointer(memScope).rawValue)
    }
}

fun uiDrawStroke(c: CValuesRef<uiDrawContext>?, path: CValuesRef<uiDrawPath>?, b: CValuesRef<uiDrawBrush>?, p: CValuesRef<uiDrawStrokeParams>?): Unit {
    memScoped {
        return kniBridge156(c?.getPointer(memScope).rawValue, path?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, p?.getPointer(memScope).rawValue)
    }
}

fun uiDrawFill(c: CValuesRef<uiDrawContext>?, path: CValuesRef<uiDrawPath>?, b: CValuesRef<uiDrawBrush>?): Unit {
    memScoped {
        return kniBridge157(c?.getPointer(memScope).rawValue, path?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun uiDrawMatrixSetIdentity(m: CValuesRef<uiDrawMatrix>?): Unit {
    memScoped {
        return kniBridge158(m?.getPointer(memScope).rawValue)
    }
}

fun uiDrawMatrixTranslate(m: CValuesRef<uiDrawMatrix>?, x: Double, y: Double): Unit {
    memScoped {
        return kniBridge159(m?.getPointer(memScope).rawValue, x, y)
    }
}

fun uiDrawMatrixScale(m: CValuesRef<uiDrawMatrix>?, xCenter: Double, yCenter: Double, x: Double, y: Double): Unit {
    memScoped {
        return kniBridge160(m?.getPointer(memScope).rawValue, xCenter, yCenter, x, y)
    }
}

fun uiDrawMatrixRotate(m: CValuesRef<uiDrawMatrix>?, x: Double, y: Double, amount: Double): Unit {
    memScoped {
        return kniBridge161(m?.getPointer(memScope).rawValue, x, y, amount)
    }
}

fun uiDrawMatrixSkew(m: CValuesRef<uiDrawMatrix>?, x: Double, y: Double, xamount: Double, yamount: Double): Unit {
    memScoped {
        return kniBridge162(m?.getPointer(memScope).rawValue, x, y, xamount, yamount)
    }
}

fun uiDrawMatrixMultiply(dest: CValuesRef<uiDrawMatrix>?, src: CValuesRef<uiDrawMatrix>?): Unit {
    memScoped {
        return kniBridge163(dest?.getPointer(memScope).rawValue, src?.getPointer(memScope).rawValue)
    }
}

fun uiDrawMatrixInvertible(m: CValuesRef<uiDrawMatrix>?): Int {
    memScoped {
        return kniBridge164(m?.getPointer(memScope).rawValue)
    }
}

fun uiDrawMatrixInvert(m: CValuesRef<uiDrawMatrix>?): Int {
    memScoped {
        return kniBridge165(m?.getPointer(memScope).rawValue)
    }
}

fun uiDrawMatrixTransformPoint(m: CValuesRef<uiDrawMatrix>?, x: CValuesRef<DoubleVar>?, y: CValuesRef<DoubleVar>?): Unit {
    memScoped {
        return kniBridge166(m?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue, y?.getPointer(memScope).rawValue)
    }
}

fun uiDrawMatrixTransformSize(m: CValuesRef<uiDrawMatrix>?, x: CValuesRef<DoubleVar>?, y: CValuesRef<DoubleVar>?): Unit {
    memScoped {
        return kniBridge167(m?.getPointer(memScope).rawValue, x?.getPointer(memScope).rawValue, y?.getPointer(memScope).rawValue)
    }
}

fun uiDrawTransform(c: CValuesRef<uiDrawContext>?, m: CValuesRef<uiDrawMatrix>?): Unit {
    memScoped {
        return kniBridge168(c?.getPointer(memScope).rawValue, m?.getPointer(memScope).rawValue)
    }
}

fun uiDrawClip(c: CValuesRef<uiDrawContext>?, path: CValuesRef<uiDrawPath>?): Unit {
    memScoped {
        return kniBridge169(c?.getPointer(memScope).rawValue, path?.getPointer(memScope).rawValue)
    }
}

fun uiDrawSave(c: CValuesRef<uiDrawContext>?): Unit {
    memScoped {
        return kniBridge170(c?.getPointer(memScope).rawValue)
    }
}

fun uiDrawRestore(c: CValuesRef<uiDrawContext>?): Unit {
    memScoped {
        return kniBridge171(c?.getPointer(memScope).rawValue)
    }
}

fun uiFreeAttribute(a: CValuesRef<uiAttribute>?): Unit {
    memScoped {
        return kniBridge172(a?.getPointer(memScope).rawValue)
    }
}

fun uiAttributeGetType(a: CValuesRef<uiAttribute>?): uiAttributeType {
    memScoped {
        return kniBridge173(a?.getPointer(memScope).rawValue)
    }
}

fun uiNewFamilyAttribute(family: String?): CPointer<uiAttribute>? {
    memScoped {
        return interpretCPointer<uiAttribute>(kniBridge174(family?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiAttributeFamily(a: CValuesRef<uiAttribute>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge175(a?.getPointer(memScope).rawValue))
    }
}

fun uiNewSizeAttribute(size: Double): CPointer<uiAttribute>? {
    return interpretCPointer<uiAttribute>(kniBridge176(size))
}

fun uiAttributeSize(a: CValuesRef<uiAttribute>?): Double {
    memScoped {
        return kniBridge177(a?.getPointer(memScope).rawValue)
    }
}

fun uiNewWeightAttribute(weight: uiTextWeight): CPointer<uiAttribute>? {
    return interpretCPointer<uiAttribute>(kniBridge178(weight))
}

fun uiAttributeWeight(a: CValuesRef<uiAttribute>?): uiTextWeight {
    memScoped {
        return kniBridge179(a?.getPointer(memScope).rawValue)
    }
}

fun uiNewItalicAttribute(italic: uiTextItalic): CPointer<uiAttribute>? {
    return interpretCPointer<uiAttribute>(kniBridge180(italic))
}

fun uiAttributeItalic(a: CValuesRef<uiAttribute>?): uiTextItalic {
    memScoped {
        return kniBridge181(a?.getPointer(memScope).rawValue)
    }
}

fun uiNewStretchAttribute(stretch: uiTextStretch): CPointer<uiAttribute>? {
    return interpretCPointer<uiAttribute>(kniBridge182(stretch))
}

fun uiAttributeStretch(a: CValuesRef<uiAttribute>?): uiTextStretch {
    memScoped {
        return kniBridge183(a?.getPointer(memScope).rawValue)
    }
}

fun uiNewColorAttribute(r: Double, g: Double, b: Double, a: Double): CPointer<uiAttribute>? {
    return interpretCPointer<uiAttribute>(kniBridge184(r, g, b, a))
}

fun uiAttributeColor(a: CValuesRef<uiAttribute>?, r: CValuesRef<DoubleVar>?, g: CValuesRef<DoubleVar>?, b: CValuesRef<DoubleVar>?, alpha: CValuesRef<DoubleVar>?): Unit {
    memScoped {
        return kniBridge185(a?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, g?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, alpha?.getPointer(memScope).rawValue)
    }
}

fun uiNewBackgroundAttribute(r: Double, g: Double, b: Double, a: Double): CPointer<uiAttribute>? {
    return interpretCPointer<uiAttribute>(kniBridge186(r, g, b, a))
}

fun uiNewUnderlineAttribute(u: uiUnderline): CPointer<uiAttribute>? {
    return interpretCPointer<uiAttribute>(kniBridge187(u))
}

fun uiAttributeUnderline(a: CValuesRef<uiAttribute>?): uiUnderline {
    memScoped {
        return kniBridge188(a?.getPointer(memScope).rawValue)
    }
}

fun uiNewUnderlineColorAttribute(u: uiUnderlineColor, r: Double, g: Double, b: Double, a: Double): CPointer<uiAttribute>? {
    return interpretCPointer<uiAttribute>(kniBridge189(u, r, g, b, a))
}

fun uiAttributeUnderlineColor(a: CValuesRef<uiAttribute>?, u: CValuesRef<uiUnderlineColorVar>?, r: CValuesRef<DoubleVar>?, g: CValuesRef<DoubleVar>?, b: CValuesRef<DoubleVar>?, alpha: CValuesRef<DoubleVar>?): Unit {
    memScoped {
        return kniBridge190(a?.getPointer(memScope).rawValue, u?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, g?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, alpha?.getPointer(memScope).rawValue)
    }
}

fun uiNewOpenTypeFeatures(): CPointer<uiOpenTypeFeatures>? {
    return interpretCPointer<uiOpenTypeFeatures>(kniBridge191())
}

fun uiFreeOpenTypeFeatures(otf: CValuesRef<uiOpenTypeFeatures>?): Unit {
    memScoped {
        return kniBridge192(otf?.getPointer(memScope).rawValue)
    }
}

fun uiOpenTypeFeaturesClone(otf: CValuesRef<uiOpenTypeFeatures>?): CPointer<uiOpenTypeFeatures>? {
    memScoped {
        return interpretCPointer<uiOpenTypeFeatures>(kniBridge193(otf?.getPointer(memScope).rawValue))
    }
}

fun uiOpenTypeFeaturesAdd(otf: CValuesRef<uiOpenTypeFeatures>?, a: Byte, b: Byte, c: Byte, d: Byte, value: uint32_t): Unit {
    memScoped {
        return kniBridge194(otf?.getPointer(memScope).rawValue, a, b, c, d, value)
    }
}

fun uiOpenTypeFeaturesRemove(otf: CValuesRef<uiOpenTypeFeatures>?, a: Byte, b: Byte, c: Byte, d: Byte): Unit {
    memScoped {
        return kniBridge195(otf?.getPointer(memScope).rawValue, a, b, c, d)
    }
}

fun uiOpenTypeFeaturesGet(otf: CValuesRef<uiOpenTypeFeatures>?, a: Byte, b: Byte, c: Byte, d: Byte, value: CValuesRef<uint32_tVar>?): Int {
    memScoped {
        return kniBridge196(otf?.getPointer(memScope).rawValue, a, b, c, d, value?.getPointer(memScope).rawValue)
    }
}

fun uiOpenTypeFeaturesForEach(otf: CValuesRef<uiOpenTypeFeatures>?, f: uiOpenTypeFeaturesForEachFunc?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge197(otf?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewFeaturesAttribute(otf: CValuesRef<uiOpenTypeFeatures>?): CPointer<uiAttribute>? {
    memScoped {
        return interpretCPointer<uiAttribute>(kniBridge198(otf?.getPointer(memScope).rawValue))
    }
}

fun uiAttributeFeatures(a: CValuesRef<uiAttribute>?): CPointer<uiOpenTypeFeatures>? {
    memScoped {
        return interpretCPointer<uiOpenTypeFeatures>(kniBridge199(a?.getPointer(memScope).rawValue))
    }
}

fun uiNewAttributedString(initialString: String?): CPointer<uiAttributedString>? {
    memScoped {
        return interpretCPointer<uiAttributedString>(kniBridge200(initialString?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiFreeAttributedString(s: CValuesRef<uiAttributedString>?): Unit {
    memScoped {
        return kniBridge201(s?.getPointer(memScope).rawValue)
    }
}

fun uiAttributedStringString(s: CValuesRef<uiAttributedString>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge202(s?.getPointer(memScope).rawValue))
    }
}

fun uiAttributedStringLen(s: CValuesRef<uiAttributedString>?): size_t {
    memScoped {
        return kniBridge203(s?.getPointer(memScope).rawValue)
    }
}

fun uiAttributedStringAppendUnattributed(s: CValuesRef<uiAttributedString>?, str: String?): Unit {
    memScoped {
        return kniBridge204(s?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue)
    }
}

fun uiAttributedStringInsertAtUnattributed(s: CValuesRef<uiAttributedString>?, str: String?, at: size_t): Unit {
    memScoped {
        return kniBridge205(s?.getPointer(memScope).rawValue, str?.cstr?.getPointer(memScope).rawValue, at)
    }
}

fun uiAttributedStringDelete(s: CValuesRef<uiAttributedString>?, start: size_t, end: size_t): Unit {
    memScoped {
        return kniBridge206(s?.getPointer(memScope).rawValue, start, end)
    }
}

fun uiAttributedStringSetAttribute(s: CValuesRef<uiAttributedString>?, a: CValuesRef<uiAttribute>?, start: size_t, end: size_t): Unit {
    memScoped {
        return kniBridge207(s?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue, start, end)
    }
}

fun uiAttributedStringForEachAttribute(s: CValuesRef<uiAttributedString>?, f: uiAttributedStringForEachAttributeFunc?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge208(s?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiAttributedStringNumGraphemes(s: CValuesRef<uiAttributedString>?): size_t {
    memScoped {
        return kniBridge209(s?.getPointer(memScope).rawValue)
    }
}

fun uiAttributedStringByteIndexToGrapheme(s: CValuesRef<uiAttributedString>?, pos: size_t): size_t {
    memScoped {
        return kniBridge210(s?.getPointer(memScope).rawValue, pos)
    }
}

fun uiAttributedStringGraphemeToByteIndex(s: CValuesRef<uiAttributedString>?, pos: size_t): size_t {
    memScoped {
        return kniBridge211(s?.getPointer(memScope).rawValue, pos)
    }
}

fun uiDrawNewTextLayout(params: CValuesRef<uiDrawTextLayoutParams>?): CPointer<uiDrawTextLayout>? {
    memScoped {
        return interpretCPointer<uiDrawTextLayout>(kniBridge212(params?.getPointer(memScope).rawValue))
    }
}

fun uiDrawFreeTextLayout(tl: CValuesRef<uiDrawTextLayout>?): Unit {
    memScoped {
        return kniBridge213(tl?.getPointer(memScope).rawValue)
    }
}

fun uiDrawText(c: CValuesRef<uiDrawContext>?, tl: CValuesRef<uiDrawTextLayout>?, x: Double, y: Double): Unit {
    memScoped {
        return kniBridge214(c?.getPointer(memScope).rawValue, tl?.getPointer(memScope).rawValue, x, y)
    }
}

fun uiDrawTextLayoutExtents(tl: CValuesRef<uiDrawTextLayout>?, width: CValuesRef<DoubleVar>?, height: CValuesRef<DoubleVar>?): Unit {
    memScoped {
        return kniBridge215(tl?.getPointer(memScope).rawValue, width?.getPointer(memScope).rawValue, height?.getPointer(memScope).rawValue)
    }
}

fun uiFontButtonFont(b: CValuesRef<uiFontButton>?, desc: CValuesRef<uiFontDescriptor>?): Unit {
    memScoped {
        return kniBridge216(b?.getPointer(memScope).rawValue, desc?.getPointer(memScope).rawValue)
    }
}

fun uiFontButtonOnChanged(b: CValuesRef<uiFontButton>?, f: CPointer<CFunction<(CPointer<uiFontButton>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge217(b?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewFontButton(): CPointer<uiFontButton>? {
    return interpretCPointer<uiFontButton>(kniBridge218())
}

fun uiFreeFontButtonFont(desc: CValuesRef<uiFontDescriptor>?): Unit {
    memScoped {
        return kniBridge219(desc?.getPointer(memScope).rawValue)
    }
}

fun uiColorButtonColor(b: CValuesRef<uiColorButton>?, r: CValuesRef<DoubleVar>?, g: CValuesRef<DoubleVar>?, bl: CValuesRef<DoubleVar>?, a: CValuesRef<DoubleVar>?): Unit {
    memScoped {
        return kniBridge220(b?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, g?.getPointer(memScope).rawValue, bl?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun uiColorButtonSetColor(b: CValuesRef<uiColorButton>?, r: Double, g: Double, bl: Double, a: Double): Unit {
    memScoped {
        return kniBridge221(b?.getPointer(memScope).rawValue, r, g, bl, a)
    }
}

fun uiColorButtonOnChanged(b: CValuesRef<uiColorButton>?, f: CPointer<CFunction<(CPointer<uiColorButton>?, COpaquePointer?) -> Unit>>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge222(b?.getPointer(memScope).rawValue, f.rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun uiNewColorButton(): CPointer<uiColorButton>? {
    return interpretCPointer<uiColorButton>(kniBridge223())
}

fun uiFormAppend(f: CValuesRef<uiForm>?, label: String?, c: CValuesRef<uiControl>?, stretchy: Int): Unit {
    memScoped {
        return kniBridge224(f?.getPointer(memScope).rawValue, label?.cstr?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue, stretchy)
    }
}

fun uiFormDelete(f: CValuesRef<uiForm>?, index: Int): Unit {
    memScoped {
        return kniBridge225(f?.getPointer(memScope).rawValue, index)
    }
}

fun uiFormPadded(f: CValuesRef<uiForm>?): Int {
    memScoped {
        return kniBridge226(f?.getPointer(memScope).rawValue)
    }
}

fun uiFormSetPadded(f: CValuesRef<uiForm>?, padded: Int): Unit {
    memScoped {
        return kniBridge227(f?.getPointer(memScope).rawValue, padded)
    }
}

fun uiNewForm(): CPointer<uiForm>? {
    return interpretCPointer<uiForm>(kniBridge228())
}

fun uiGridAppend(g: CValuesRef<uiGrid>?, c: CValuesRef<uiControl>?, left: Int, top: Int, xspan: Int, yspan: Int, hexpand: Int, halign: uiAlign, vexpand: Int, valign: uiAlign): Unit {
    memScoped {
        return kniBridge229(g?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue, left, top, xspan, yspan, hexpand, halign, vexpand, valign)
    }
}

fun uiGridInsertAt(g: CValuesRef<uiGrid>?, c: CValuesRef<uiControl>?, existing: CValuesRef<uiControl>?, at: uiAt, xspan: Int, yspan: Int, hexpand: Int, halign: uiAlign, vexpand: Int, valign: uiAlign): Unit {
    memScoped {
        return kniBridge230(g?.getPointer(memScope).rawValue, c?.getPointer(memScope).rawValue, existing?.getPointer(memScope).rawValue, at, xspan, yspan, hexpand, halign, vexpand, valign)
    }
}

fun uiGridPadded(g: CValuesRef<uiGrid>?): Int {
    memScoped {
        return kniBridge231(g?.getPointer(memScope).rawValue)
    }
}

fun uiGridSetPadded(g: CValuesRef<uiGrid>?, padded: Int): Unit {
    memScoped {
        return kniBridge232(g?.getPointer(memScope).rawValue, padded)
    }
}

fun uiNewGrid(): CPointer<uiGrid>? {
    return interpretCPointer<uiGrid>(kniBridge233())
}

fun uiNewImage(width: Double, height: Double): CPointer<uiImage>? {
    return interpretCPointer<uiImage>(kniBridge234(width, height))
}

fun uiFreeImage(i: CValuesRef<uiImage>?): Unit {
    memScoped {
        return kniBridge235(i?.getPointer(memScope).rawValue)
    }
}

fun uiImageAppend(i: CValuesRef<uiImage>?, pixels: CValuesRef<*>?, pixelWidth: Int, pixelHeight: Int, byteStride: Int): Unit {
    memScoped {
        return kniBridge236(i?.getPointer(memScope).rawValue, pixels?.getPointer(memScope).rawValue, pixelWidth, pixelHeight, byteStride)
    }
}

fun uiFreeTableValue(v: CValuesRef<uiTableValue>?): Unit {
    memScoped {
        return kniBridge237(v?.getPointer(memScope).rawValue)
    }
}

fun uiTableValueGetType(v: CValuesRef<uiTableValue>?): uiTableValueType {
    memScoped {
        return kniBridge238(v?.getPointer(memScope).rawValue)
    }
}

fun uiNewTableValueString(str: String?): CPointer<uiTableValue>? {
    memScoped {
        return interpretCPointer<uiTableValue>(kniBridge239(str?.cstr?.getPointer(memScope).rawValue))
    }
}

fun uiTableValueString(v: CValuesRef<uiTableValue>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge240(v?.getPointer(memScope).rawValue))
    }
}

fun uiNewTableValueImage(img: CValuesRef<uiImage>?): CPointer<uiTableValue>? {
    memScoped {
        return interpretCPointer<uiTableValue>(kniBridge241(img?.getPointer(memScope).rawValue))
    }
}

fun uiTableValueImage(v: CValuesRef<uiTableValue>?): CPointer<uiImage>? {
    memScoped {
        return interpretCPointer<uiImage>(kniBridge242(v?.getPointer(memScope).rawValue))
    }
}

fun uiNewTableValueInt(i: Int): CPointer<uiTableValue>? {
    return interpretCPointer<uiTableValue>(kniBridge243(i))
}

fun uiTableValueInt(v: CValuesRef<uiTableValue>?): Int {
    memScoped {
        return kniBridge244(v?.getPointer(memScope).rawValue)
    }
}

fun uiNewTableValueColor(r: Double, g: Double, b: Double, a: Double): CPointer<uiTableValue>? {
    return interpretCPointer<uiTableValue>(kniBridge245(r, g, b, a))
}

fun uiTableValueColor(v: CValuesRef<uiTableValue>?, r: CValuesRef<DoubleVar>?, g: CValuesRef<DoubleVar>?, b: CValuesRef<DoubleVar>?, a: CValuesRef<DoubleVar>?): Unit {
    memScoped {
        return kniBridge246(v?.getPointer(memScope).rawValue, r?.getPointer(memScope).rawValue, g?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue, a?.getPointer(memScope).rawValue)
    }
}

fun uiNewTableModel(mh: CValuesRef<uiTableModelHandler>?): CPointer<uiTableModel>? {
    memScoped {
        return interpretCPointer<uiTableModel>(kniBridge247(mh?.getPointer(memScope).rawValue))
    }
}

fun uiFreeTableModel(m: CValuesRef<uiTableModel>?): Unit {
    memScoped {
        return kniBridge248(m?.getPointer(memScope).rawValue)
    }
}

fun uiTableModelRowInserted(m: CValuesRef<uiTableModel>?, newIndex: Int): Unit {
    memScoped {
        return kniBridge249(m?.getPointer(memScope).rawValue, newIndex)
    }
}

fun uiTableModelRowChanged(m: CValuesRef<uiTableModel>?, index: Int): Unit {
    memScoped {
        return kniBridge250(m?.getPointer(memScope).rawValue, index)
    }
}

fun uiTableModelRowDeleted(m: CValuesRef<uiTableModel>?, oldIndex: Int): Unit {
    memScoped {
        return kniBridge251(m?.getPointer(memScope).rawValue, oldIndex)
    }
}

fun uiTableAppendTextColumn(t: CValuesRef<uiTable>?, name: String?, textModelColumn: Int, textEditableModelColumn: Int, textParams: CValuesRef<uiTableTextColumnOptionalParams>?): Unit {
    memScoped {
        return kniBridge252(t?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, textModelColumn, textEditableModelColumn, textParams?.getPointer(memScope).rawValue)
    }
}

fun uiTableAppendImageColumn(t: CValuesRef<uiTable>?, name: String?, imageModelColumn: Int): Unit {
    memScoped {
        return kniBridge253(t?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, imageModelColumn)
    }
}

fun uiTableAppendImageTextColumn(t: CValuesRef<uiTable>?, name: String?, imageModelColumn: Int, textModelColumn: Int, textEditableModelColumn: Int, textParams: CValuesRef<uiTableTextColumnOptionalParams>?): Unit {
    memScoped {
        return kniBridge254(t?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, imageModelColumn, textModelColumn, textEditableModelColumn, textParams?.getPointer(memScope).rawValue)
    }
}

fun uiTableAppendCheckboxColumn(t: CValuesRef<uiTable>?, name: String?, checkboxModelColumn: Int, checkboxEditableModelColumn: Int): Unit {
    memScoped {
        return kniBridge255(t?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, checkboxModelColumn, checkboxEditableModelColumn)
    }
}

fun uiTableAppendCheckboxTextColumn(t: CValuesRef<uiTable>?, name: String?, checkboxModelColumn: Int, checkboxEditableModelColumn: Int, textModelColumn: Int, textEditableModelColumn: Int, textParams: CValuesRef<uiTableTextColumnOptionalParams>?): Unit {
    memScoped {
        return kniBridge256(t?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, checkboxModelColumn, checkboxEditableModelColumn, textModelColumn, textEditableModelColumn, textParams?.getPointer(memScope).rawValue)
    }
}

fun uiTableAppendProgressBarColumn(t: CValuesRef<uiTable>?, name: String?, progressModelColumn: Int): Unit {
    memScoped {
        return kniBridge257(t?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, progressModelColumn)
    }
}

fun uiTableAppendButtonColumn(t: CValuesRef<uiTable>?, name: String?, buttonModelColumn: Int, buttonClickableModelColumn: Int): Unit {
    memScoped {
        return kniBridge258(t?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, buttonModelColumn, buttonClickableModelColumn)
    }
}

fun uiNewTable(params: CValuesRef<uiTableParams>?): CPointer<uiTable>? {
    memScoped {
        return interpretCPointer<uiTable>(kniBridge259(params?.getPointer(memScope).rawValue))
    }
}

val uiPi: Double get() = bitsToDouble(4614256656552045848) /* == 3.141592653589793 */

val uiDrawDefaultMiterLimit: Double get() = bitsToDouble(4621819117588971520) /* == 10.0 */

const val uiTableModelColumnNeverEditable: Int = -1

const val uiTableModelColumnAlwaysEditable: Int = -2

class uiInitOptions(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var Size: size_t
        get() = memberAt<size_tVar>(0).value
        set(value) { memberAt<size_tVar>(0).value = value }
    
}

class uiControl(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(104, 8)
    
    var Signature: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var OSSignature: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
    var TypeSignature: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
    
    var Destroy: CPointer<CFunction<(CPointer<uiControl>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(16).value = value }
    
    var Handle: CPointer<CFunction<(CPointer<uiControl>?) -> uintptr_t>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> uintptr_t>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> uintptr_t>>>(24).value = value }
    
    var Parent: CPointer<CFunction<(CPointer<uiControl>?) -> CPointer<uiControl>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> CPointer<uiControl>?>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> CPointer<uiControl>?>>>(32).value = value }
    
    var SetParent: CPointer<CFunction<(CPointer<uiControl>?, CPointer<uiControl>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?, CPointer<uiControl>?) -> Unit>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?, CPointer<uiControl>?) -> Unit>>>(40).value = value }
    
    var Toplevel: CPointer<CFunction<(CPointer<uiControl>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Int>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Int>>>(48).value = value }
    
    var Visible: CPointer<CFunction<(CPointer<uiControl>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Int>>>(56).value = value }
    
    var Show: CPointer<CFunction<(CPointer<uiControl>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(64).value = value }
    
    var Hide: CPointer<CFunction<(CPointer<uiControl>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(72).value = value }
    
    var Enabled: CPointer<CFunction<(CPointer<uiControl>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Int>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Int>>>(80).value = value }
    
    var Enable: CPointer<CFunction<(CPointer<uiControl>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(88).value = value }
    
    var Disable: CPointer<CFunction<(CPointer<uiControl>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiControl>?) -> Unit>>>(96).value = value }
    
}






















class uiAreaHandler(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var Draw: CPointer<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, CPointer<uiAreaDrawParams>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, CPointer<uiAreaDrawParams>?) -> Unit>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, CPointer<uiAreaDrawParams>?) -> Unit>>>(0).value = value }
    
    var MouseEvent: CPointer<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, CPointer<uiAreaMouseEvent>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, CPointer<uiAreaMouseEvent>?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, CPointer<uiAreaMouseEvent>?) -> Unit>>>(8).value = value }
    
    var MouseCrossed: CPointer<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, Int) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, Int) -> Unit>>>(16).value = value }
    
    var DragBroken: CPointer<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?) -> Unit>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?) -> Unit>>>(24).value = value }
    
    var KeyEvent: CPointer<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, CPointer<uiAreaKeyEvent>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, CPointer<uiAreaKeyEvent>?) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiAreaHandler>?, CPointer<uiArea>?, CPointer<uiAreaKeyEvent>?) -> Int>>>(32).value = value }
    
}

class uiAreaDrawParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var Context: CPointer<uiDrawContext>?
        get() = memberAt<CPointerVar<uiDrawContext>>(0).value
        set(value) { memberAt<CPointerVar<uiDrawContext>>(0).value = value }
    
    var AreaWidth: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
    var AreaHeight: Double
        get() = memberAt<DoubleVar>(16).value
        set(value) { memberAt<DoubleVar>(16).value = value }
    
    var ClipX: Double
        get() = memberAt<DoubleVar>(24).value
        set(value) { memberAt<DoubleVar>(24).value = value }
    
    var ClipY: Double
        get() = memberAt<DoubleVar>(32).value
        set(value) { memberAt<DoubleVar>(32).value = value }
    
    var ClipWidth: Double
        get() = memberAt<DoubleVar>(40).value
        set(value) { memberAt<DoubleVar>(40).value = value }
    
    var ClipHeight: Double
        get() = memberAt<DoubleVar>(48).value
        set(value) { memberAt<DoubleVar>(48).value = value }
    
}


class uiAreaMouseEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 8)
    
    var X: Double
        get() = memberAt<DoubleVar>(0).value
        set(value) { memberAt<DoubleVar>(0).value = value }
    
    var Y: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
    var AreaWidth: Double
        get() = memberAt<DoubleVar>(16).value
        set(value) { memberAt<DoubleVar>(16).value = value }
    
    var AreaHeight: Double
        get() = memberAt<DoubleVar>(24).value
        set(value) { memberAt<DoubleVar>(24).value = value }
    
    var Down: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var Up: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var Count: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var Modifiers: uiModifiers
        get() = memberAt<uiModifiersVar>(44).value
        set(value) { memberAt<uiModifiersVar>(44).value = value }
    
    var Held1To64: uint64_t
        get() = memberAt<uint64_tVar>(48).value
        set(value) { memberAt<uint64_tVar>(48).value = value }
    
}

class uiAreaKeyEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    var Key: Byte
        get() = memberAt<ByteVar>(0).value
        set(value) { memberAt<ByteVar>(0).value = value }
    
    var ExtKey: uiExtKey
        get() = memberAt<uiExtKeyVar>(4).value
        set(value) { memberAt<uiExtKeyVar>(4).value = value }
    
    var Modifier: uiModifiers
        get() = memberAt<uiModifiersVar>(8).value
        set(value) { memberAt<uiModifiersVar>(8).value = value }
    
    var Modifiers: uiModifiers
        get() = memberAt<uiModifiersVar>(12).value
        set(value) { memberAt<uiModifiersVar>(12).value = value }
    
    var Up: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
}


class uiDrawBrush(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(96, 8)
    
    var Type: uiDrawBrushType
        get() = memberAt<uiDrawBrushTypeVar>(0).value
        set(value) { memberAt<uiDrawBrushTypeVar>(0).value = value }
    
    var R: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
    var G: Double
        get() = memberAt<DoubleVar>(16).value
        set(value) { memberAt<DoubleVar>(16).value = value }
    
    var B: Double
        get() = memberAt<DoubleVar>(24).value
        set(value) { memberAt<DoubleVar>(24).value = value }
    
    var A: Double
        get() = memberAt<DoubleVar>(32).value
        set(value) { memberAt<DoubleVar>(32).value = value }
    
    var X0: Double
        get() = memberAt<DoubleVar>(40).value
        set(value) { memberAt<DoubleVar>(40).value = value }
    
    var Y0: Double
        get() = memberAt<DoubleVar>(48).value
        set(value) { memberAt<DoubleVar>(48).value = value }
    
    var X1: Double
        get() = memberAt<DoubleVar>(56).value
        set(value) { memberAt<DoubleVar>(56).value = value }
    
    var Y1: Double
        get() = memberAt<DoubleVar>(64).value
        set(value) { memberAt<DoubleVar>(64).value = value }
    
    var OuterRadius: Double
        get() = memberAt<DoubleVar>(72).value
        set(value) { memberAt<DoubleVar>(72).value = value }
    
    var Stops: CPointer<uiDrawBrushGradientStop>?
        get() = memberAt<CPointerVar<uiDrawBrushGradientStop>>(80).value
        set(value) { memberAt<CPointerVar<uiDrawBrushGradientStop>>(80).value = value }
    
    var NumStops: size_t
        get() = memberAt<size_tVar>(88).value
        set(value) { memberAt<size_tVar>(88).value = value }
    
}

class uiDrawBrushGradientStop(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var Pos: Double
        get() = memberAt<DoubleVar>(0).value
        set(value) { memberAt<DoubleVar>(0).value = value }
    
    var R: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
    var G: Double
        get() = memberAt<DoubleVar>(16).value
        set(value) { memberAt<DoubleVar>(16).value = value }
    
    var B: Double
        get() = memberAt<DoubleVar>(24).value
        set(value) { memberAt<DoubleVar>(24).value = value }
    
    var A: Double
        get() = memberAt<DoubleVar>(32).value
        set(value) { memberAt<DoubleVar>(32).value = value }
    
}

class uiDrawStrokeParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var Cap: uiDrawLineCap
        get() = memberAt<uiDrawLineCapVar>(0).value
        set(value) { memberAt<uiDrawLineCapVar>(0).value = value }
    
    var Join: uiDrawLineJoin
        get() = memberAt<uiDrawLineJoinVar>(4).value
        set(value) { memberAt<uiDrawLineJoinVar>(4).value = value }
    
    var Thickness: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
    var MiterLimit: Double
        get() = memberAt<DoubleVar>(16).value
        set(value) { memberAt<DoubleVar>(16).value = value }
    
    var Dashes: CPointer<DoubleVar>?
        get() = memberAt<CPointerVar<DoubleVar>>(24).value
        set(value) { memberAt<CPointerVar<DoubleVar>>(24).value = value }
    
    var NumDashes: size_t
        get() = memberAt<size_tVar>(32).value
        set(value) { memberAt<size_tVar>(32).value = value }
    
    var DashPhase: Double
        get() = memberAt<DoubleVar>(40).value
        set(value) { memberAt<DoubleVar>(40).value = value }
    
}

class uiDrawMatrix(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var M11: Double
        get() = memberAt<DoubleVar>(0).value
        set(value) { memberAt<DoubleVar>(0).value = value }
    
    var M12: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
    var M21: Double
        get() = memberAt<DoubleVar>(16).value
        set(value) { memberAt<DoubleVar>(16).value = value }
    
    var M22: Double
        get() = memberAt<DoubleVar>(24).value
        set(value) { memberAt<DoubleVar>(24).value = value }
    
    var M31: Double
        get() = memberAt<DoubleVar>(32).value
        set(value) { memberAt<DoubleVar>(32).value = value }
    
    var M32: Double
        get() = memberAt<DoubleVar>(40).value
        set(value) { memberAt<DoubleVar>(40).value = value }
    
}




class uiFontDescriptor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var Family: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var Size: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
    var Weight: uiTextWeight
        get() = memberAt<uiTextWeightVar>(16).value
        set(value) { memberAt<uiTextWeightVar>(16).value = value }
    
    var Italic: uiTextItalic
        get() = memberAt<uiTextItalicVar>(20).value
        set(value) { memberAt<uiTextItalicVar>(20).value = value }
    
    var Stretch: uiTextStretch
        get() = memberAt<uiTextStretchVar>(24).value
        set(value) { memberAt<uiTextStretchVar>(24).value = value }
    
}


class uiDrawTextLayoutParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var String: CPointer<uiAttributedString>?
        get() = memberAt<CPointerVar<uiAttributedString>>(0).value
        set(value) { memberAt<CPointerVar<uiAttributedString>>(0).value = value }
    
    var DefaultFont: CPointer<uiFontDescriptor>?
        get() = memberAt<CPointerVar<uiFontDescriptor>>(8).value
        set(value) { memberAt<CPointerVar<uiFontDescriptor>>(8).value = value }
    
    var Width: Double
        get() = memberAt<DoubleVar>(16).value
        set(value) { memberAt<DoubleVar>(16).value = value }
    
    var Align: uiDrawTextAlign
        get() = memberAt<uiDrawTextAlignVar>(24).value
        set(value) { memberAt<uiDrawTextAlignVar>(24).value = value }
    
}








class uiTableModelHandler(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var NumColumns: CPointer<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?) -> Int>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?) -> Int>>>(0).value = value }
    
    var ColumnType: CPointer<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?, Int) -> uiTableValueType>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?, Int) -> uiTableValueType>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?, Int) -> uiTableValueType>>>(8).value = value }
    
    var NumRows: CPointer<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?) -> Int>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?) -> Int>>>(16).value = value }
    
    var CellValue: CPointer<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?, Int, Int) -> CPointer<uiTableValue>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?, Int, Int) -> CPointer<uiTableValue>?>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?, Int, Int) -> CPointer<uiTableValue>?>>>(24).value = value }
    
    var SetCellValue: CPointer<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?, Int, Int, CPointer<uiTableValue>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?, Int, Int, CPointer<uiTableValue>?) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<uiTableModelHandler>?, CPointer<uiTableModel>?, Int, Int, CPointer<uiTableValue>?) -> Unit>>>(32).value = value }
    
}

class uiTableTextColumnOptionalParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var ColorModelColumn: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class uiTableParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var Model: CPointer<uiTableModel>?
        get() = memberAt<CPointerVar<uiTableModel>>(0).value
        set(value) { memberAt<CPointerVar<uiTableModel>>(0).value = value }
    
    var RowBackgroundColorModelColumn: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}


// enum (anonymous at /usr/include/ui.h:43:1):
val uiForEachContinue: UInt get() = 0u
val uiForEachStop: UInt get() = 1u

// enum (anonymous at /usr/include/ui.h:321:1):
val uiWindowResizeEdgeLeft: UInt get() = 0u
val uiWindowResizeEdgeTop: UInt get() = 1u
val uiWindowResizeEdgeRight: UInt get() = 2u
val uiWindowResizeEdgeBottom: UInt get() = 3u
val uiWindowResizeEdgeTopLeft: UInt get() = 4u
val uiWindowResizeEdgeTopRight: UInt get() = 5u
val uiWindowResizeEdgeBottomLeft: UInt get() = 6u
val uiWindowResizeEdgeBottomRight: UInt get() = 7u

// enum (anonymous at /usr/include/ui.h:372:1):
val uiDrawBrushTypeSolid: UInt get() = 0u
val uiDrawBrushTypeLinearGradient: UInt get() = 1u
val uiDrawBrushTypeRadialGradient: UInt get() = 2u
val uiDrawBrushTypeImage: UInt get() = 3u

// enum (anonymous at /usr/include/ui.h:379:1):
val uiDrawLineCapFlat: UInt get() = 0u
val uiDrawLineCapRound: UInt get() = 1u
val uiDrawLineCapSquare: UInt get() = 2u

// enum (anonymous at /usr/include/ui.h:385:1):
val uiDrawLineJoinMiter: UInt get() = 0u
val uiDrawLineJoinRound: UInt get() = 1u
val uiDrawLineJoinBevel: UInt get() = 2u

// enum (anonymous at /usr/include/ui.h:396:1):
val uiDrawFillModeWinding: UInt get() = 0u
val uiDrawFillModeAlternate: UInt get() = 1u

// enum (anonymous at /usr/include/ui.h:529:1):
val uiAttributeTypeFamily: UInt get() = 0u
val uiAttributeTypeSize: UInt get() = 1u
val uiAttributeTypeWeight: UInt get() = 2u
val uiAttributeTypeItalic: UInt get() = 3u
val uiAttributeTypeStretch: UInt get() = 4u
val uiAttributeTypeColor: UInt get() = 5u
val uiAttributeTypeBackground: UInt get() = 6u
val uiAttributeTypeUnderline: UInt get() = 7u
val uiAttributeTypeUnderlineColor: UInt get() = 8u
val uiAttributeTypeFeatures: UInt get() = 9u

// enum (anonymous at /usr/include/ui.h:579:1):
val uiTextWeightMinimum: UInt get() = 0u
val uiTextWeightThin: UInt get() = 100u
val uiTextWeightUltraLight: UInt get() = 200u
val uiTextWeightLight: UInt get() = 300u
val uiTextWeightBook: UInt get() = 350u
val uiTextWeightNormal: UInt get() = 400u
val uiTextWeightMedium: UInt get() = 500u
val uiTextWeightSemiBold: UInt get() = 600u
val uiTextWeightBold: UInt get() = 700u
val uiTextWeightUltraBold: UInt get() = 800u
val uiTextWeightHeavy: UInt get() = 900u
val uiTextWeightUltraHeavy: UInt get() = 950u
val uiTextWeightMaximum: UInt get() = 1000u

// enum (anonymous at /usr/include/ui.h:610:1):
val uiTextItalicNormal: UInt get() = 0u
val uiTextItalicOblique: UInt get() = 1u
val uiTextItalicItalic: UInt get() = 2u

// enum (anonymous at /usr/include/ui.h:636:1):
val uiTextStretchUltraCondensed: UInt get() = 0u
val uiTextStretchExtraCondensed: UInt get() = 1u
val uiTextStretchCondensed: UInt get() = 2u
val uiTextStretchSemiCondensed: UInt get() = 3u
val uiTextStretchNormal: UInt get() = 4u
val uiTextStretchSemiExpanded: UInt get() = 5u
val uiTextStretchExpanded: UInt get() = 6u
val uiTextStretchExtraExpanded: UInt get() = 7u
val uiTextStretchUltraExpanded: UInt get() = 8u

// enum (anonymous at /usr/include/ui.h:674:1):
val uiUnderlineNone: UInt get() = 0u
val uiUnderlineSingle: UInt get() = 1u
val uiUnderlineDouble: UInt get() = 2u
val uiUnderlineSuggestion: UInt get() = 3u

// enum (anonymous at /usr/include/ui.h:702:1):
val uiUnderlineColorCustom: UInt get() = 0u
val uiUnderlineColorSpelling: UInt get() = 1u
val uiUnderlineColorGrammar: UInt get() = 2u
val uiUnderlineColorAuxiliary: UInt get() = 3u

// enum (anonymous at /usr/include/ui.h:942:1):
val uiDrawTextAlignLeft: UInt get() = 0u
val uiDrawTextAlignCenter: UInt get() = 1u
val uiDrawTextAlignRight: UInt get() = 2u

// enum (anonymous at /usr/include/ui.h:1014:1):
val uiModifierCtrl: UInt get() = 1u
val uiModifierAlt: UInt get() = 2u
val uiModifierShift: UInt get() = 4u
val uiModifierSuper: UInt get() = 8u

// enum (anonymous at /usr/include/ui.h:1041:1):
val uiExtKeyEscape: UInt get() = 1u
val uiExtKeyInsert: UInt get() = 2u
val uiExtKeyDelete: UInt get() = 3u
val uiExtKeyHome: UInt get() = 4u
val uiExtKeyEnd: UInt get() = 5u
val uiExtKeyPageUp: UInt get() = 6u
val uiExtKeyPageDown: UInt get() = 7u
val uiExtKeyUp: UInt get() = 8u
val uiExtKeyDown: UInt get() = 9u
val uiExtKeyLeft: UInt get() = 10u
val uiExtKeyRight: UInt get() = 11u
val uiExtKeyF1: UInt get() = 12u
val uiExtKeyF2: UInt get() = 13u
val uiExtKeyF3: UInt get() = 14u
val uiExtKeyF4: UInt get() = 15u
val uiExtKeyF5: UInt get() = 16u
val uiExtKeyF6: UInt get() = 17u
val uiExtKeyF7: UInt get() = 18u
val uiExtKeyF8: UInt get() = 19u
val uiExtKeyF9: UInt get() = 20u
val uiExtKeyF10: UInt get() = 21u
val uiExtKeyF11: UInt get() = 22u
val uiExtKeyF12: UInt get() = 23u
val uiExtKeyN0: UInt get() = 24u
val uiExtKeyN1: UInt get() = 25u
val uiExtKeyN2: UInt get() = 26u
val uiExtKeyN3: UInt get() = 27u
val uiExtKeyN4: UInt get() = 28u
val uiExtKeyN5: UInt get() = 29u
val uiExtKeyN6: UInt get() = 30u
val uiExtKeyN7: UInt get() = 31u
val uiExtKeyN8: UInt get() = 32u
val uiExtKeyN9: UInt get() = 33u
val uiExtKeyNDot: UInt get() = 34u
val uiExtKeyNEnter: UInt get() = 35u
val uiExtKeyNAdd: UInt get() = 36u
val uiExtKeyNSubtract: UInt get() = 37u
val uiExtKeyNMultiply: UInt get() = 38u
val uiExtKeyNDivide: UInt get() = 39u

// enum (anonymous at /usr/include/ui.h:1108:1):
val uiAlignFill: UInt get() = 0u
val uiAlignStart: UInt get() = 1u
val uiAlignCenter: UInt get() = 2u
val uiAlignEnd: UInt get() = 3u

// enum (anonymous at /usr/include/ui.h:1115:1):
val uiAtLeading: UInt get() = 0u
val uiAtTop: UInt get() = 1u
val uiAtTrailing: UInt get() = 2u
val uiAtBottom: UInt get() = 3u

// enum (anonymous at /usr/include/ui.h:1199:1):
val uiTableValueTypeString: UInt get() = 0u
val uiTableValueTypeImage: UInt get() = 1u
val uiTableValueTypeInt: UInt get() = 2u
val uiTableValueTypeColor: UInt get() = 3u

typealias uiForEachVar = UIntVarOf<uiForEach>
typealias uiForEach = UInt

typealias uiModifiersVar = UIntVarOf<uiModifiers>
typealias uiModifiers = UInt

typealias uiExtKeyVar = UIntVarOf<uiExtKey>
typealias uiExtKey = UInt

typealias uiWindowResizeEdgeVar = UIntVarOf<uiWindowResizeEdge>
typealias uiWindowResizeEdge = UInt

typealias uiDrawBrushTypeVar = UIntVarOf<uiDrawBrushType>
typealias uiDrawBrushType = UInt

typealias uiDrawLineCapVar = UIntVarOf<uiDrawLineCap>
typealias uiDrawLineCap = UInt

typealias uiDrawLineJoinVar = UIntVarOf<uiDrawLineJoin>
typealias uiDrawLineJoin = UInt

typealias uiDrawFillModeVar = UIntVarOf<uiDrawFillMode>
typealias uiDrawFillMode = UInt

typealias uiAttributeTypeVar = UIntVarOf<uiAttributeType>
typealias uiAttributeType = UInt

typealias uiTextWeightVar = UIntVarOf<uiTextWeight>
typealias uiTextWeight = UInt

typealias uiTextItalicVar = UIntVarOf<uiTextItalic>
typealias uiTextItalic = UInt

typealias uiTextStretchVar = UIntVarOf<uiTextStretch>
typealias uiTextStretch = UInt

typealias uiUnderlineVar = UIntVarOf<uiUnderline>
typealias uiUnderline = UInt

typealias uiUnderlineColorVar = UIntVarOf<uiUnderlineColor>
typealias uiUnderlineColor = UInt

typealias uiOpenTypeFeaturesForEachFuncVar = CPointerVarOf<uiOpenTypeFeaturesForEachFunc>
typealias uiOpenTypeFeaturesForEachFunc = CPointer<CFunction<(CPointer<uiOpenTypeFeatures>?, Byte, Byte, Byte, Byte, uint32_t, COpaquePointer?) -> uiForEach>>

typealias uiAttributedStringForEachAttributeFuncVar = CPointerVarOf<uiAttributedStringForEachAttributeFunc>
typealias uiAttributedStringForEachAttributeFunc = CPointer<CFunction<(CPointer<uiAttributedString>?, CPointer<uiAttribute>?, size_t, size_t, COpaquePointer?) -> uiForEach>>

typealias uiDrawTextAlignVar = UIntVarOf<uiDrawTextAlign>
typealias uiDrawTextAlign = UInt

typealias uiAlignVar = UIntVarOf<uiAlign>
typealias uiAlign = UInt

typealias uiAtVar = UIntVarOf<uiAt>
typealias uiAt = UInt

typealias uiTableValueTypeVar = UIntVarOf<uiTableValueType>
typealias uiTableValueType = UInt

@SymbolName("libui_kniBridge0")
private external fun kniBridge0(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge1")
private external fun kniBridge1(): Unit
@SymbolName("libui_kniBridge2")
private external fun kniBridge2(p0: NativePtr): Unit
@SymbolName("libui_kniBridge3")
private external fun kniBridge3(): Unit
@SymbolName("libui_kniBridge4")
private external fun kniBridge4(): Unit
@SymbolName("libui_kniBridge5")
private external fun kniBridge5(p0: Int): Int
@SymbolName("libui_kniBridge6")
private external fun kniBridge6(): Unit
@SymbolName("libui_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge8")
private external fun kniBridge8(p0: Int, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge10")
private external fun kniBridge10(p0: NativePtr): Unit
@SymbolName("libui_kniBridge11")
private external fun kniBridge11(p0: NativePtr): Unit
@SymbolName("libui_kniBridge12")
private external fun kniBridge12(p0: NativePtr): ULong
@SymbolName("libui_kniBridge13")
private external fun kniBridge13(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge14")
private external fun kniBridge14(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge15")
private external fun kniBridge15(p0: NativePtr): Int
@SymbolName("libui_kniBridge16")
private external fun kniBridge16(p0: NativePtr): Int
@SymbolName("libui_kniBridge17")
private external fun kniBridge17(p0: NativePtr): Unit
@SymbolName("libui_kniBridge18")
private external fun kniBridge18(p0: NativePtr): Unit
@SymbolName("libui_kniBridge19")
private external fun kniBridge19(p0: NativePtr): Int
@SymbolName("libui_kniBridge20")
private external fun kniBridge20(p0: NativePtr): Unit
@SymbolName("libui_kniBridge21")
private external fun kniBridge21(p0: NativePtr): Unit
@SymbolName("libui_kniBridge22")
private external fun kniBridge22(p0: ULong, p1: UInt, p2: UInt, p3: NativePtr): NativePtr
@SymbolName("libui_kniBridge23")
private external fun kniBridge23(p0: NativePtr): Unit
@SymbolName("libui_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge25")
private external fun kniBridge25(p0: NativePtr): Int
@SymbolName("libui_kniBridge26")
private external fun kniBridge26(p0: NativePtr): Unit
@SymbolName("libui_kniBridge27")
private external fun kniBridge27(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge28")
private external fun kniBridge28(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge29")
private external fun kniBridge29(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge30")
private external fun kniBridge30(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("libui_kniBridge31")
private external fun kniBridge31(p0: NativePtr): Int
@SymbolName("libui_kniBridge32")
private external fun kniBridge32(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge35")
private external fun kniBridge35(p0: NativePtr): Int
@SymbolName("libui_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge38")
private external fun kniBridge38(p0: NativePtr): Int
@SymbolName("libui_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: Int, p2: Int, p3: Int): NativePtr
@SymbolName("libui_kniBridge41")
private external fun kniBridge41(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge44")
private external fun kniBridge44(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("libui_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge47")
private external fun kniBridge47(p0: NativePtr): Int
@SymbolName("libui_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge49")
private external fun kniBridge49(): NativePtr
@SymbolName("libui_kniBridge50")
private external fun kniBridge50(): NativePtr
@SymbolName("libui_kniBridge51")
private external fun kniBridge51(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge53")
private external fun kniBridge53(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge54")
private external fun kniBridge54(p0: NativePtr): Int
@SymbolName("libui_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge56")
private external fun kniBridge56(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge57")
private external fun kniBridge57(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge60")
private external fun kniBridge60(p0: NativePtr): Int
@SymbolName("libui_kniBridge61")
private external fun kniBridge61(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge62")
private external fun kniBridge62(): NativePtr
@SymbolName("libui_kniBridge63")
private external fun kniBridge63(): NativePtr
@SymbolName("libui_kniBridge64")
private external fun kniBridge64(): NativePtr
@SymbolName("libui_kniBridge65")
private external fun kniBridge65(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge66")
private external fun kniBridge66(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge67")
private external fun kniBridge67(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge69")
private external fun kniBridge69(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Unit
@SymbolName("libui_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge71")
private external fun kniBridge71(p0: NativePtr): Int
@SymbolName("libui_kniBridge72")
private external fun kniBridge72(p0: NativePtr, p1: Int): Int
@SymbolName("libui_kniBridge73")
private external fun kniBridge73(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("libui_kniBridge74")
private external fun kniBridge74(): NativePtr
@SymbolName("libui_kniBridge75")
private external fun kniBridge75(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge76")
private external fun kniBridge76(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge77")
private external fun kniBridge77(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge78")
private external fun kniBridge78(p0: NativePtr): Int
@SymbolName("libui_kniBridge79")
private external fun kniBridge79(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge80")
private external fun kniBridge80(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge81")
private external fun kniBridge81(p0: NativePtr): Int
@SymbolName("libui_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge83")
private external fun kniBridge83(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge84")
private external fun kniBridge84(p0: Int, p1: Int): NativePtr
@SymbolName("libui_kniBridge85")
private external fun kniBridge85(p0: NativePtr): Int
@SymbolName("libui_kniBridge86")
private external fun kniBridge86(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge87")
private external fun kniBridge87(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge88")
private external fun kniBridge88(p0: Int, p1: Int): NativePtr
@SymbolName("libui_kniBridge89")
private external fun kniBridge89(p0: NativePtr): Int
@SymbolName("libui_kniBridge90")
private external fun kniBridge90(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge91")
private external fun kniBridge91(): NativePtr
@SymbolName("libui_kniBridge92")
private external fun kniBridge92(): NativePtr
@SymbolName("libui_kniBridge93")
private external fun kniBridge93(): NativePtr
@SymbolName("libui_kniBridge94")
private external fun kniBridge94(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge95")
private external fun kniBridge95(p0: NativePtr): Int
@SymbolName("libui_kniBridge96")
private external fun kniBridge96(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge97")
private external fun kniBridge97(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge98")
private external fun kniBridge98(): NativePtr
@SymbolName("libui_kniBridge99")
private external fun kniBridge99(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge100")
private external fun kniBridge100(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge101")
private external fun kniBridge101(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge102")
private external fun kniBridge102(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge103")
private external fun kniBridge103(): NativePtr
@SymbolName("libui_kniBridge104")
private external fun kniBridge104(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge105")
private external fun kniBridge105(p0: NativePtr): Int
@SymbolName("libui_kniBridge106")
private external fun kniBridge106(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge107")
private external fun kniBridge107(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge108")
private external fun kniBridge108(): NativePtr
@SymbolName("libui_kniBridge109")
private external fun kniBridge109(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge110")
private external fun kniBridge110(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge111")
private external fun kniBridge111(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge112")
private external fun kniBridge112(): NativePtr
@SymbolName("libui_kniBridge113")
private external fun kniBridge113(): NativePtr
@SymbolName("libui_kniBridge114")
private external fun kniBridge114(): NativePtr
@SymbolName("libui_kniBridge115")
private external fun kniBridge115(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge117")
private external fun kniBridge117(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge119")
private external fun kniBridge119(p0: NativePtr): Int
@SymbolName("libui_kniBridge120")
private external fun kniBridge120(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge121")
private external fun kniBridge121(): NativePtr
@SymbolName("libui_kniBridge122")
private external fun kniBridge122(): NativePtr
@SymbolName("libui_kniBridge123")
private external fun kniBridge123(p0: NativePtr): Unit
@SymbolName("libui_kniBridge124")
private external fun kniBridge124(p0: NativePtr): Unit
@SymbolName("libui_kniBridge125")
private external fun kniBridge125(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge126")
private external fun kniBridge126(p0: NativePtr): Int
@SymbolName("libui_kniBridge127")
private external fun kniBridge127(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge128")
private external fun kniBridge128(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("libui_kniBridge129")
private external fun kniBridge129(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("libui_kniBridge130")
private external fun kniBridge130(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge131")
private external fun kniBridge131(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge132")
private external fun kniBridge132(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge133")
private external fun kniBridge133(p0: NativePtr): Unit
@SymbolName("libui_kniBridge134")
private external fun kniBridge134(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge135")
private external fun kniBridge135(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge136")
private external fun kniBridge136(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge137")
private external fun kniBridge137(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge138")
private external fun kniBridge138(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge139")
private external fun kniBridge139(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("libui_kniBridge140")
private external fun kniBridge140(p0: NativePtr): Unit
@SymbolName("libui_kniBridge141")
private external fun kniBridge141(p0: NativePtr, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("libui_kniBridge142")
private external fun kniBridge142(p0: NativePtr): Unit
@SymbolName("libui_kniBridge143")
private external fun kniBridge143(p0: NativePtr, p1: UInt): Unit
@SymbolName("libui_kniBridge144")
private external fun kniBridge144(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge145")
private external fun kniBridge145(p0: NativePtr, p1: Int, p2: Int): NativePtr
@SymbolName("libui_kniBridge146")
private external fun kniBridge146(p0: UInt): NativePtr
@SymbolName("libui_kniBridge147")
private external fun kniBridge147(p0: NativePtr): Unit
@SymbolName("libui_kniBridge148")
private external fun kniBridge148(p0: NativePtr, p1: Double, p2: Double): Unit
@SymbolName("libui_kniBridge149")
private external fun kniBridge149(p0: NativePtr, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Int): Unit
@SymbolName("libui_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: Double, p2: Double): Unit
@SymbolName("libui_kniBridge151")
private external fun kniBridge151(p0: NativePtr, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Int): Unit
@SymbolName("libui_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double): Unit
@SymbolName("libui_kniBridge153")
private external fun kniBridge153(p0: NativePtr): Unit
@SymbolName("libui_kniBridge154")
private external fun kniBridge154(p0: NativePtr, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("libui_kniBridge155")
private external fun kniBridge155(p0: NativePtr): Unit
@SymbolName("libui_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("libui_kniBridge157")
private external fun kniBridge157(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge158")
private external fun kniBridge158(p0: NativePtr): Unit
@SymbolName("libui_kniBridge159")
private external fun kniBridge159(p0: NativePtr, p1: Double, p2: Double): Unit
@SymbolName("libui_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("libui_kniBridge161")
private external fun kniBridge161(p0: NativePtr, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("libui_kniBridge162")
private external fun kniBridge162(p0: NativePtr, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("libui_kniBridge163")
private external fun kniBridge163(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge164")
private external fun kniBridge164(p0: NativePtr): Int
@SymbolName("libui_kniBridge165")
private external fun kniBridge165(p0: NativePtr): Int
@SymbolName("libui_kniBridge166")
private external fun kniBridge166(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge167")
private external fun kniBridge167(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge168")
private external fun kniBridge168(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge169")
private external fun kniBridge169(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge170")
private external fun kniBridge170(p0: NativePtr): Unit
@SymbolName("libui_kniBridge171")
private external fun kniBridge171(p0: NativePtr): Unit
@SymbolName("libui_kniBridge172")
private external fun kniBridge172(p0: NativePtr): Unit
@SymbolName("libui_kniBridge173")
private external fun kniBridge173(p0: NativePtr): UInt
@SymbolName("libui_kniBridge174")
private external fun kniBridge174(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge175")
private external fun kniBridge175(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge176")
private external fun kniBridge176(p0: Double): NativePtr
@SymbolName("libui_kniBridge177")
private external fun kniBridge177(p0: NativePtr): Double
@SymbolName("libui_kniBridge178")
private external fun kniBridge178(p0: UInt): NativePtr
@SymbolName("libui_kniBridge179")
private external fun kniBridge179(p0: NativePtr): UInt
@SymbolName("libui_kniBridge180")
private external fun kniBridge180(p0: UInt): NativePtr
@SymbolName("libui_kniBridge181")
private external fun kniBridge181(p0: NativePtr): UInt
@SymbolName("libui_kniBridge182")
private external fun kniBridge182(p0: UInt): NativePtr
@SymbolName("libui_kniBridge183")
private external fun kniBridge183(p0: NativePtr): UInt
@SymbolName("libui_kniBridge184")
private external fun kniBridge184(p0: Double, p1: Double, p2: Double, p3: Double): NativePtr
@SymbolName("libui_kniBridge185")
private external fun kniBridge185(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("libui_kniBridge186")
private external fun kniBridge186(p0: Double, p1: Double, p2: Double, p3: Double): NativePtr
@SymbolName("libui_kniBridge187")
private external fun kniBridge187(p0: UInt): NativePtr
@SymbolName("libui_kniBridge188")
private external fun kniBridge188(p0: NativePtr): UInt
@SymbolName("libui_kniBridge189")
private external fun kniBridge189(p0: UInt, p1: Double, p2: Double, p3: Double, p4: Double): NativePtr
@SymbolName("libui_kniBridge190")
private external fun kniBridge190(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("libui_kniBridge191")
private external fun kniBridge191(): NativePtr
@SymbolName("libui_kniBridge192")
private external fun kniBridge192(p0: NativePtr): Unit
@SymbolName("libui_kniBridge193")
private external fun kniBridge193(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge194")
private external fun kniBridge194(p0: NativePtr, p1: Byte, p2: Byte, p3: Byte, p4: Byte, p5: UInt): Unit
@SymbolName("libui_kniBridge195")
private external fun kniBridge195(p0: NativePtr, p1: Byte, p2: Byte, p3: Byte, p4: Byte): Unit
@SymbolName("libui_kniBridge196")
private external fun kniBridge196(p0: NativePtr, p1: Byte, p2: Byte, p3: Byte, p4: Byte, p5: NativePtr): Int
@SymbolName("libui_kniBridge197")
private external fun kniBridge197(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge198")
private external fun kniBridge198(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge199")
private external fun kniBridge199(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge200")
private external fun kniBridge200(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge201")
private external fun kniBridge201(p0: NativePtr): Unit
@SymbolName("libui_kniBridge202")
private external fun kniBridge202(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge203")
private external fun kniBridge203(p0: NativePtr): ULong
@SymbolName("libui_kniBridge204")
private external fun kniBridge204(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge205")
private external fun kniBridge205(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("libui_kniBridge206")
private external fun kniBridge206(p0: NativePtr, p1: ULong, p2: ULong): Unit
@SymbolName("libui_kniBridge207")
private external fun kniBridge207(p0: NativePtr, p1: NativePtr, p2: ULong, p3: ULong): Unit
@SymbolName("libui_kniBridge208")
private external fun kniBridge208(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge209")
private external fun kniBridge209(p0: NativePtr): ULong
@SymbolName("libui_kniBridge210")
private external fun kniBridge210(p0: NativePtr, p1: ULong): ULong
@SymbolName("libui_kniBridge211")
private external fun kniBridge211(p0: NativePtr, p1: ULong): ULong
@SymbolName("libui_kniBridge212")
private external fun kniBridge212(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge213")
private external fun kniBridge213(p0: NativePtr): Unit
@SymbolName("libui_kniBridge214")
private external fun kniBridge214(p0: NativePtr, p1: NativePtr, p2: Double, p3: Double): Unit
@SymbolName("libui_kniBridge215")
private external fun kniBridge215(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge216")
private external fun kniBridge216(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("libui_kniBridge217")
private external fun kniBridge217(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge218")
private external fun kniBridge218(): NativePtr
@SymbolName("libui_kniBridge219")
private external fun kniBridge219(p0: NativePtr): Unit
@SymbolName("libui_kniBridge220")
private external fun kniBridge220(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("libui_kniBridge221")
private external fun kniBridge221(p0: NativePtr, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("libui_kniBridge222")
private external fun kniBridge222(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("libui_kniBridge223")
private external fun kniBridge223(): NativePtr
@SymbolName("libui_kniBridge224")
private external fun kniBridge224(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Unit
@SymbolName("libui_kniBridge225")
private external fun kniBridge225(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge226")
private external fun kniBridge226(p0: NativePtr): Int
@SymbolName("libui_kniBridge227")
private external fun kniBridge227(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge228")
private external fun kniBridge228(): NativePtr
@SymbolName("libui_kniBridge229")
private external fun kniBridge229(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: UInt, p8: Int, p9: UInt): Unit
@SymbolName("libui_kniBridge230")
private external fun kniBridge230(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: UInt, p4: Int, p5: Int, p6: Int, p7: UInt, p8: Int, p9: UInt): Unit
@SymbolName("libui_kniBridge231")
private external fun kniBridge231(p0: NativePtr): Int
@SymbolName("libui_kniBridge232")
private external fun kniBridge232(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge233")
private external fun kniBridge233(): NativePtr
@SymbolName("libui_kniBridge234")
private external fun kniBridge234(p0: Double, p1: Double): NativePtr
@SymbolName("libui_kniBridge235")
private external fun kniBridge235(p0: NativePtr): Unit
@SymbolName("libui_kniBridge236")
private external fun kniBridge236(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("libui_kniBridge237")
private external fun kniBridge237(p0: NativePtr): Unit
@SymbolName("libui_kniBridge238")
private external fun kniBridge238(p0: NativePtr): UInt
@SymbolName("libui_kniBridge239")
private external fun kniBridge239(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge240")
private external fun kniBridge240(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge241")
private external fun kniBridge241(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge242")
private external fun kniBridge242(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge243")
private external fun kniBridge243(p0: Int): NativePtr
@SymbolName("libui_kniBridge244")
private external fun kniBridge244(p0: NativePtr): Int
@SymbolName("libui_kniBridge245")
private external fun kniBridge245(p0: Double, p1: Double, p2: Double, p3: Double): NativePtr
@SymbolName("libui_kniBridge246")
private external fun kniBridge246(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("libui_kniBridge247")
private external fun kniBridge247(p0: NativePtr): NativePtr
@SymbolName("libui_kniBridge248")
private external fun kniBridge248(p0: NativePtr): Unit
@SymbolName("libui_kniBridge249")
private external fun kniBridge249(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge250")
private external fun kniBridge250(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge251")
private external fun kniBridge251(p0: NativePtr, p1: Int): Unit
@SymbolName("libui_kniBridge252")
private external fun kniBridge252(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: NativePtr): Unit
@SymbolName("libui_kniBridge253")
private external fun kniBridge253(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("libui_kniBridge254")
private external fun kniBridge254(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: Int, p5: NativePtr): Unit
@SymbolName("libui_kniBridge255")
private external fun kniBridge255(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int): Unit
@SymbolName("libui_kniBridge256")
private external fun kniBridge256(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: Int, p5: Int, p6: NativePtr): Unit
@SymbolName("libui_kniBridge257")
private external fun kniBridge257(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("libui_kniBridge258")
private external fun kniBridge258(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int): Unit
@SymbolName("libui_kniBridge259")
private external fun kniBridge259(p0: NativePtr): NativePtr
