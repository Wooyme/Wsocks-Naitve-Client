package ui

import cnames.structs.uiBox
import cnames.structs.uiEntry
import cnames.structs.uiLabel
import cnames.structs.uiWindow
import data.Aes
import kotlinx.cinterop.*
import libui.*
import core.Wsocks
import platform.posix.memcpy

@ExperimentalUnsignedTypes
@ThreadLocal
object RemoteSettingsUI {
    private lateinit var w: CPointer<uiWindow>
    private lateinit var hostLabel: CPointer<uiLabel>
    private lateinit var hostEntry: CPointer<uiEntry>
    private lateinit var portLabel: CPointer<uiLabel>
    private lateinit var portEntry: CPointer<uiEntry>
    private lateinit var userLabel: CPointer<uiLabel>
    private lateinit var userEntry: CPointer<uiEntry>
    private lateinit var passLabel: CPointer<uiLabel>
    private lateinit var passEntry: CPointer<uiEntry>
    private lateinit var keyLabel: CPointer<uiLabel>
    private lateinit var keyEntry: CPointer<uiEntry>
    private lateinit var button:CPointer<uiButton>

    fun createUI() {
        w = uiNewWindow("连接设置", 320, 320, 0)!!
        uiWindowSetMargined(w, 1)
        uiWindowOnClosing(w, staticCFunction { _, _ ->
            1
        }, null)

        uiWindowSetChild(w,createBox().reinterpret())
        uiControlShow(w.reinterpret())
    }

    fun createBox():CPointer<uiBox>{
        val box = uiNewVerticalBox()!!
        hostLabel = uiNewLabel("地址")!!
        hostEntry = uiNewEntry()!!
        portLabel = uiNewLabel("端口")!!
        portEntry = uiNewEntry()!!
        userLabel = uiNewLabel("用户")!!
        userEntry = uiNewEntry()!!
        passLabel = uiNewLabel("密码")!!
        passEntry = uiNewPasswordEntry()!!
        keyLabel = uiNewLabel("秘钥")!!
        keyEntry = uiNewEntry()!!
        button = uiNewButton("确定")!!
        uiButtonOnClicked(button,staticCFunction {_,_->
            handleButton()
        },null)
        uiBoxSetPadded(box, 1)
        uiBoxAppend(box, hostLabel.reinterpret(), 0)
        uiBoxAppend(box, hostEntry.reinterpret(), 0)
        uiEntrySetText(hostEntry,Wsocks.remoteIp)
        uiBoxAppend(box, portLabel.reinterpret(), 0)
        uiBoxAppend(box, portEntry.reinterpret(), 0)
        uiEntrySetText(portEntry,Wsocks.remotePort.toString())
        uiBoxAppend(box, userLabel.reinterpret(), 0)
        uiBoxAppend(box, userEntry.reinterpret(), 0)
        uiEntrySetText(userEntry,Wsocks.user)
        uiBoxAppend(box, passLabel.reinterpret(), 0)
        uiBoxAppend(box, passEntry.reinterpret(), 0)
        uiEntrySetText(passEntry,Wsocks.pass)
        uiBoxAppend(box, keyLabel.reinterpret(), 0)
        uiBoxAppend(box, keyEntry.reinterpret(), 0)
        uiEntrySetText(keyEntry,Wsocks.key)
        uiBoxAppend(box, uiNewLabel("")!!.reinterpret(),0)
        uiBoxAppend(box,button.reinterpret(),0)
        return box
    }

    private fun handleButton(){
        val host = uiEntryText(hostEntry)!!.toKString()
        val port = uiEntryText(portEntry)!!.toKString().toInt()
        val user = uiEntryText(userEntry)!!.toKString()
        val pass = uiEntryText(passEntry)!!.toKString()
        val key = uiEntryText(keyEntry)!!.toKString()
        if(key.length>16){
            uiMsgBoxError(w,"错误","秘钥长度应小于等于16")
            return
        }
        memcpy(Aes.key, uiEntryText(keyEntry),key.length.toULong())
        Wsocks.remoteIp = host
        Wsocks.remotePort = port
        Wsocks.user = user
        Wsocks.pass = pass
        Wsocks.key = key
        Wsocks.tryStart()
        Wsocks.save()
        uiControlDestroy(w.reinterpret())
    }
}