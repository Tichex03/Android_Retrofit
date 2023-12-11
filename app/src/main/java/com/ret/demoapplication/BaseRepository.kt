package com.ret.demoapplication

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

open class BaseRepository {
     var apiCall: ApiCall? =null
    init {
        apiCall  = RetrofitHelper.retrofit?.create(ApiCall::class.java)
    }

     suspend fun <T> execute(t: T): T? = withContext(Dispatchers.IO) { return@withContext t }

}
