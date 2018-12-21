import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import libui.uiInit
import libui.uiInitOptions
import libui.uiMain
import core.Wsocks
import platform.posix.exit
import platform.posix.memset
import ui.Tray


@ExperimentalUnsignedTypes
fun main(args: Array<String>) {
    val options = nativeHeap.alloc<uiInitOptions>()
    memset(options.ptr, 0, options.Size)
    if (uiInit(options.ptr) != null) {
        exit(-1)
    }
    Wsocks.read()
    Tray.init()
    uiMain()
}


