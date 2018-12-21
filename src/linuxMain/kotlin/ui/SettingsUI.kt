package ui

import core.Wsocks
import data.Aes
import kotlinx.cinterop.*
import libui.*
import platform.posix.memcpy

@ExperimentalUnsignedTypes
@ThreadLocal
object SettingsUI {
    private lateinit var w:CPointer<uiWindow>
    private lateinit var localPortEntry:CPointer<uiEntry>
    private lateinit var gfwPathEntry:CPointer<uiEntry>
    private lateinit var useGfwCheckBox:CPointer<uiCheckbox>
    private lateinit var remoteIpEntry:CPointer<uiEntry>
    private lateinit var remotePortEntry:CPointer<uiEntry>
    private lateinit var userEntry:CPointer<uiEntry>
    private lateinit var passEntry:CPointer<uiEntry>
    private lateinit var keyEntry:CPointer<uiEntry>
    fun createUI(){
        w = uiNewWindow("连接设置", 320, 240, 0)!!
        uiWindowSetMargined(w, 1)
        uiWindowOnClosing(w, staticCFunction { _, _ ->
            1
        }, null)
        val box = uiNewHorizontalBox()!!
        uiBoxSetPadded(box,2)
        uiBoxAppend(box, createLocalBox().reinterpret(),0)
        uiBoxAppend(box,uiNewVerticalSeparator()!!.reinterpret(),0)
        uiBoxAppend(box, createRemoteBox().reinterpret(),0)
        uiWindowSetChild(w,box.reinterpret())
        uiControlShow(w.reinterpret())
    }

    private fun createLocalBox():CPointer<uiBox>{
        val box = uiNewVerticalBox()!!
        val grid = uiNewGrid()!!
        uiBoxAppend(box,grid.reinterpret(),0)
        uiGridSetPadded(grid,1)
        uiGridAppend(grid, uiNewLabel("本地端口")!!.reinterpret(),0,0,1,1
            ,0, uiAlignFill,0, uiAlignFill)
        localPortEntry = uiNewEntry()!!
        uiGridAppend(grid, localPortEntry.reinterpret(),0,1,1,1
            ,0, uiAlignFill,0, uiAlignFill)
        uiGridAppend(grid, uiNewLabel("GFW List路径")!!.reinterpret(),0,2,1,1
            ,0, uiAlignFill,0, uiAlignFill)
        gfwPathEntry = uiNewEntry()!!
        uiGridAppend(grid, gfwPathEntry.reinterpret(),0,3,1,1
            ,0, uiAlignFill,0, uiAlignFill)
        useGfwCheckBox = uiNewCheckbox("使用GFW List")!!
        uiGridAppend(grid, useGfwCheckBox.reinterpret(),0,4,1,1
            ,0, uiAlignFill,0, uiAlignFill)
        uiEntrySetText(localPortEntry, if(Wsocks.localPort==0) "1080" else Wsocks.localPort.toString())
        uiEntrySetText(gfwPathEntry, Wsocks.gfwListPath)
        return box
    }

    private fun createRemoteBox():CPointer<uiBox>{
        val box = uiNewVerticalBox()!!
        val grid = uiNewGrid()!!
        uiBoxAppend(box,grid.reinterpret(),0)
        uiGridSetPadded(grid,1)
        uiGridAppend(grid, uiNewLabel("服务器地址")!!.reinterpret(),0,0,1,1
            ,0, uiAlignEnd,0, uiAlignFill)
        remoteIpEntry = uiNewEntry()!!
        uiGridAppend(grid, remoteIpEntry.reinterpret(),1,0,1,1
            ,0, uiAlignFill,0, uiAlignFill)
        uiGridAppend(grid, uiNewLabel("服务器端口")!!.reinterpret(),0,1,1,1
            ,0, uiAlignEnd,0, uiAlignFill)
        remotePortEntry = uiNewEntry()!!
        uiGridAppend(grid, remotePortEntry.reinterpret(),1,1,1,1
            ,0, uiAlignFill,0, uiAlignFill)
        uiGridAppend(grid, uiNewLabel("用户名")!!.reinterpret(),0,2,1,1
            ,0, uiAlignEnd,0, uiAlignFill)
        userEntry = uiNewEntry()!!
        uiGridAppend(grid, userEntry.reinterpret(),1,2,1,1
            ,0, uiAlignFill,0, uiAlignFill)
        uiGridAppend(grid, uiNewLabel("密码")!!.reinterpret(),0,3,1,1
            ,0, uiAlignEnd,0, uiAlignFill)
        passEntry = uiNewPasswordEntry()!!
        uiGridAppend(grid, passEntry.reinterpret(),1,3,1,1
            ,0,uiAlignFill,0,uiAlignFill)
        uiGridAppend(grid, uiNewLabel("秘钥")!!.reinterpret(),0,4,1,1
            ,0, uiAlignEnd,0, uiAlignFill)
        keyEntry = uiNewEntry()!!
        uiGridAppend(grid, keyEntry.reinterpret(),1,4,1,1
            ,0, uiAlignFill,0, uiAlignFill)
        val button = uiNewButton("确定")!!
        uiButtonOnClicked(button, staticCFunction{_,_->
            buttonHandler()
        },null)
        uiGridAppend(grid,button.reinterpret(),1,5,1,1
            , 0, uiAlignFill,0, uiAlignFill)
        uiEntrySetText(remoteIpEntry,Wsocks.remoteIp)
        uiEntrySetText(remotePortEntry,Wsocks.remotePort.toString())
        uiEntrySetText(userEntry,Wsocks.user)
        uiEntrySetText(passEntry,Wsocks.pass)
        uiEntrySetText(keyEntry,Wsocks.key)
        return box
    }

    private fun buttonHandler(){
        val localPort = uiEntryText(localPortEntry)!!.toKString().toIntOrNull()
        val gfwListPath = uiEntryText(gfwPathEntry)!!.toKString()
        val useGFWList = uiCheckboxChecked(useGfwCheckBox)
        val remoteIp = uiEntryText(remoteIpEntry)!!.toKString()
        val remotePort = uiEntryText(remotePortEntry)!!.toKString().toIntOrNull()
        val user = uiEntryText(userEntry)!!.toKString()
        val pass = uiEntryText(passEntry)!!.toKString()
        val key = uiEntryText(keyEntry)!!.toKString()
        if(remoteIp.isEmpty() || remotePort==null || remotePort==0){
            uiMsgBoxError(w,"错误","远程服务器配置不正确")
            return
        }
        if(user.isEmpty() || pass.isEmpty()){
            uiMsgBoxError(w,"错误","用户名密码不可为空")
            return
        }
        if(localPort==null || localPort==0){
            uiMsgBoxError(w,"错误","非法的本地端口")
            return
        }
        if(key.length>16){
            uiMsgBoxError(w,"错误","秘钥长度应小于等于16")
            return
        }
        memcpy(Aes.key, uiEntryText(keyEntry),key.length.toULong())
        Wsocks.localPort = localPort
        Wsocks.useGFWList = useGFWList==1
        Wsocks.gfwListPath = gfwListPath
        Wsocks.remoteIp = remoteIp
        Wsocks.remotePort = remotePort
        Wsocks.user = user
        Wsocks.pass = pass
        Wsocks.key = key
        Wsocks.save()
        uiControlDestroy(w.reinterpret())
    }
}