package ui

import kotlinx.cinterop.*
import libui.uiQueueMain
import core.Wsocks
import platform.posix.exit
import platform.posix.memcpy
import tray.tray
import tray.tray_init
import tray.tray_menu
import tray.tray_update

@ExperimentalUnsignedTypes
@ThreadLocal
object Tray {
    private val tray = nativeHeap.alloc<tray>()
    private val WAITING = "等待中".cstr
    private val QUIT = "退出".cstr
    private val LOCAL_SETTINGS = "设置".cstr
    private val REMOTE_SETTINGS = "连接".cstr
    private val ICON = (Wsocks.myHome + "wsocks.png").cstr
    private val menus = nativeHeap.allocArray<tray_menu>(5)
    private val localPtr = nativeHeap.allocArray<ByteVar>(LOCAL_SETTINGS.size)
    private val remotePtr = nativeHeap.allocArray<ByteVar>(REMOTE_SETTINGS.size)
    private val quitPtr = nativeHeap.allocArray<ByteVar>(QUIT.size)
    private val iconPtr = nativeHeap.allocArray<ByteVar>(ICON.size)
    val statusPtr = nativeHeap.allocArray<ByteVar>(128)
    fun init() {
        LOCAL_SETTINGS.getBytes().forEachIndexed { i, b -> }
        memScoped {
            memcpy(localPtr, LOCAL_SETTINGS.ptr, LOCAL_SETTINGS.size.toULong())
            memcpy(remotePtr, REMOTE_SETTINGS.ptr, REMOTE_SETTINGS.size.toULong())
            memcpy(quitPtr, QUIT.ptr, QUIT.size.toULong())
            memcpy(iconPtr, ICON.ptr, ICON.size.toULong())
            memcpy(statusPtr, WAITING.ptr, WAITING.size.toULong())
        }

        menus[3].text = quitPtr
        menus[3].cb = staticCFunction { _ ->
            exit(0)
        }

        menus[2].text = remotePtr
        menus[2].cb = staticCFunction { _ ->
            uiQueueMain(staticCFunction { _ ->
                Wsocks.tryStart()
                tray_update(tray.ptr)
            }, null)
        }

        menus[1].text = localPtr
        menus[1].cb = staticCFunction { _ ->
            uiQueueMain(staticCFunction { _ ->
                SettingsUI.createUI()
                tray_update(tray.ptr)
            }, null)
        }
        menus[0].text = statusPtr
        menus[0].disabled = 1

        tray.icon = iconPtr
        tray.menu = menus
        tray_init(tray.ptr)
    }

    fun update(){
        tray_update(tray.ptr)
    }
}