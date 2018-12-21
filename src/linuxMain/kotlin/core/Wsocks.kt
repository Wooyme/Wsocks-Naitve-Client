package core

import cjson.*
import data.Aes
import kotlinx.cinterop.*
import mongoose.mg_mgr
import mongoose.mg_mgr_free
import mongoose.mg_mgr_init
import mongoose.mg_mgr_poll
import platform.posix.*
import ui.Tray
import kotlin.native.concurrent.Future
import kotlin.native.concurrent.TransferMode
import kotlin.native.concurrent.Worker

@ThreadLocal
@ExperimentalUnsignedTypes
object Wsocks {
    private const val VERSION = "0.1.0"
    private val flagPtr = nativeHeap.alloc<BooleanVar>().ptr
    private lateinit var future: Future<Unit>
    var remoteIp:String =""
    var user:String =""
    var pass:String =""
    var key:String =""
    var localPort = 0
    var remotePort = 0
    var useGFWList = false
    var gfwListPath: String
    val myHome: String
    init {
        val linuxHome = getenv("HOME")
        myHome = if (linuxHome != null) {
            linuxHome.toKString() + "/.wsocks2/"
        } else {
            val drive = getenv("HOMEDRIVE")
            val path = getenv("HOMEPATH")
            if (drive != null && path != null) {
                drive.toKString() + "\\" + path.toKString() + "\\.wsocks\\"
            } else {
                ""
            }
        }
        mkdir(myHome, (S_IRUSR or S_IWUSR).toUInt())
        gfwListPath = myHome + "gfw.lst"
    }
    fun tryStart() {
        if(remotePort==0 || localPort==0){
            println("Need init")
            return
        }
        if(flagPtr.pointed.value){
            memset(flagPtr,0,1)
        }
        if(Wsocks::future.isInitialized){
            future.consume {}
        }
        val mgr = nativeHeap.alloc<mg_mgr>().ptr
        mg_mgr_init(mgr, null)
        memset(flagPtr,1,1)
        if(!Socks5.init(mgr,localPort)){
            memScoped {
                val fail = "本地监听失败".cstr
                memcpy(Tray.statusPtr,fail.ptr,fail.size.toULong())
            }
            Tray.update()
            return
        }else{
            println("Bind at $localPort")
        }
        if(!Transport.init(mgr,user,pass, remotePort,remoteIp)){
            memScoped {
                val fail = "远程连接失败".cstr
                memcpy(Tray.statusPtr,fail.ptr,fail.size.toULong())
            }
            Tray.update()
            return
        }
        memScoped {
            val success = "$remoteIp:$remotePort".cstr
            memcpy(Tray.statusPtr,success.ptr,success.size.toULong())
        }
        Tray.update()
        //将主线程中初始化的mgr和Transport.nc传到新的线程里
        //暂时(Maybe Never)无法支持多核优化
        future = Worker.start().execute(TransferMode.SAFE, {
            WorkerInitData(mgr,Transport.nc,Aes.key,flagPtr)
        }) {
            val (_mgr, _nc,_key,_flag) = it
            Transport.nc = _nc
            Aes.init(_key)
            while (_flag.pointed.value) {
                mg_mgr_poll(_mgr, 50)
            }
            Socks5.clear()
            println("Finish")
            mg_mgr_free(_mgr)
        }
    }

    fun save(){
        val fp = fopen(myHome+"save.json","w")
        val json = cJSON_CreateObject()
        cJSON_AddStringToObject(json,"remote.ip",remoteIp)
        cJSON_AddStringToObject(json,"user", user)
        cJSON_AddStringToObject(json,"pass", pass)
        cJSON_AddStringToObject(json,"key",key)
        cJSON_AddNumberToObject(json,"remote.port", remotePort.toDouble())
        cJSON_AddNumberToObject(json,"local.port", localPort.toDouble())
        cJSON_AddBoolToObject(json,"gfw.use", if(useGFWList) 1 else 0)
        cJSON_AddStringToObject(json,"gfw.path", gfwListPath)
        cJSON_AddStringToObject(json,"version", VERSION)
        fputs(cJSON_Print(json)!!.toKString(),fp)
        fclose(fp)
    }

    fun read(){
        val fp = fopen(myHome+"save.json", "r") ?: return println("Cannot open")
        val fileStat = nativeHeap.alloc<stat>()
        stat(myHome+"save.json",fileStat.ptr)
        val size = fileStat.st_size.toInt()+1
        val bytes = nativeHeap.allocArray<ByteVar>(size)
        fread(bytes,size.toULong(),size.toULong(),fp)
        val info = cJSON_Parse(bytes.toKString()) ?: return println("Cannot parse")
        cJSON_GetObjectItemCaseSensitive(info,"remote.ip")?.pointed?.valuestring?.toKString()?.let {
            remoteIp = it
        }
        cJSON_GetObjectItemCaseSensitive(info,"user")?.pointed?.valuestring?.toKString()?.let {
            user = it
        }
        cJSON_GetObjectItemCaseSensitive(info,"pass")?.pointed?.valuestring?.toKString()?.let {
            pass = it
        }
        cJSON_GetObjectItemCaseSensitive(info,"key")?.pointed?.valuestring?.toKString()?.let {
            key = it
            memcpy(Aes.key, it.cstr,key.length.toULong())
        }
        cJSON_GetObjectItemCaseSensitive(info,"gfw.path")?.pointed?.valuestring?.toKString()?.let {
            gfwListPath = it
        }
        cJSON_GetObjectItemCaseSensitive(info,"remote.port")?.pointed?.valueint?.let {
            remotePort = it
        }
        cJSON_GetObjectItemCaseSensitive(info,"local.port")?.pointed?.valueint?.let {
            localPort = it
        }
        if(cJSON_IsFalse(cJSON_GetObjectItemCaseSensitive(info,"gfw.use"))!=0){
            useGFWList = true
        }
        nativeHeap.free(fileStat.ptr)
        fclose(fp)
    }
}