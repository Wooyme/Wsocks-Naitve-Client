package core

import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CPointer
import mongoose.mg_connection
import mongoose.mg_mgr

data class WorkerInitData(val mgr:CPointer<mg_mgr>,val nc:CPointer<mg_connection>,val key:CArrayPointer<ByteVar>,val flagPtr:CPointer<BooleanVar>)