package com.ret.demoapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TestViewModel(application: Application) : AndroidViewModel(application) {

    var testRepository : TestRepository= TestRepository()

    fun chapterItemList(passAnyListener: PassAnyListener<BaseChapterItemModel>){
        viewModelScope.launch{
            testRepository.chapterItemList(passAnyListener)
        }
    }



}
