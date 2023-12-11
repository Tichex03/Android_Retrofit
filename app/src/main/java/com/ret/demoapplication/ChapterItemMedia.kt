package com.ret.demoapplication


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChapterItemMedia(
    @SerializedName("chapter_item_id")
    var chapterItemId: String = "",
    @SerializedName("chapter_media")
    var chapterMedia: String = "",
    @SerializedName("media_type")
    var mediaType: String = "",
    @SerializedName("thumb_image")
    var thumbImage: String = ""
) : Parcelable