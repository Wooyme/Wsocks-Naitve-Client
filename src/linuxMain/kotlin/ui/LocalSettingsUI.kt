package ui

import cnames.structs.uiButton
import kotlinx.cinterop.*
import libui.*
import core.Wsocks

@ExperimentalUnsignedTypes
@ThreadLocal
object LocalSettingsUI {
    private lateinit var w: CPointer<uiWindow>
    private lateinit var portLabel:CPointer<uiLabel>
    private lateinit var portEntry:CPointer<uiEntry>
    private lateinit var gfwPathLabel:CPointer<uiLabel>
    private lateinit var gfwPathEntry:CPointer<uiEntry>
    private lateinit var useGFWCheckBox:CPointer<uiCheckbox>
    private lateinit var button:CPointer<uiButton>
    fun createUI() {
        w = uiNewWindow("Settings", 320, 240, 0)!!
        uiWindowSetMargined(w, 1)
        uiWindowOnClosing(w, staticCFunction { _, _ ->
            1
        }, null)
        val box = uiNewHorizontalBox()!!
        uiBoxSetPadded(box,2)
        uiBoxAppend(box,createBox().reinterpret(),0)
        uiBoxAppend(box,RemoteSettingsUI.createBox().reinterpret(),0)
        uiWindowSetChild(w, box.reinterpret())
        uiControlShow(w.reinterpret())
    }

    private fun createBox():CPointer<uiBox>{
        val box = uiNewVerticalBox()!!
        portLabel = uiNewLabel("本地端口")!!
        portEntry = uiNewEntry()!!
        gfwPathLabel = uiNewLabel("GFW List路径")!!
        gfwPathEntry = uiNewEntry()!!
        useGFWCheckBox = uiNewCheckbox("使用GFW List")!!
        button = uiNewButton("确定")!!
        uiBoxSetPadded(box, 1)
        uiEntrySetText(portEntry, if(Wsocks.localPort==0) "1080" else Wsocks.localPort.toString())
        uiEntrySetText(gfwPathEntry, Wsocks.gfwListPath)
        uiButtonOnClicked(button, staticCFunction { _, _ ->
            handleButton(null, null)
        }, null)
        uiBoxAppend(box, portLabel.reinterpret(), 0)
        uiBoxAppend(box, portEntry.reinterpret(), 0)
        uiBoxAppend(box, gfwPathLabel.reinterpret(), 0)
        uiBoxAppend(box, gfwPathEntry.reinterpret(), 0)
        uiBoxAppend(box, useGFWCheckBox.reinterpret(), 0)
        uiBoxAppend(box, button.reinterpret(), 0)
        return box
    }

    private fun handleButton(button: CPointer<uiButton>?, void: COpaquePointer?) {
        val port = uiEntryText(portEntry)!!.toKString().toInt()
        val gfwListPath = uiEntryText(gfwPathEntry)!!.toKString()
        val useGFWList = uiCheckboxChecked(useGFWCheckBox)
        Wsocks.localPort = port
        Wsocks.useGFWList = useGFWList==1
        Wsocks.gfwListPath = gfwListPath
        Wsocks.tryStart()
        Wsocks.save()
        uiControlDestroy(w.reinterpret())
    }
}