package com.ret.demoapplication

import android.util.Log

class TestRepository : BaseRepository() {

    suspend fun chapterItemList(passAnyListener: PassAnyListener<BaseChapterItemModel>){
        try {
           val result= execute(apiCall?.chapterItemList())
            passAnyListener.passData(result)
        } catch (e: Exception) {
            Log.e("chapterItemList","${e.stackTrace}")
            Log.e("chapterItemList", e.localizedMessage?.toString() ?: "")
        }
    }


}
