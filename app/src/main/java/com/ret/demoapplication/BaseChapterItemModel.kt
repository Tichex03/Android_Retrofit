package com.ret.demoapplication


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BaseChapterItemModel(
    @SerializedName("flag")
    var flag: Int = 0,
    @SerializedName("msg")
    var msg: String = "",
    @SerializedName("data")
    var data: ArrayList<ChapterItemModel> = arrayListOf(),

    ) : Parcelable