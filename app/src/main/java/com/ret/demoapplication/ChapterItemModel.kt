package com.ret.demoapplication


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChapterItemModel(
    @SerializedName("chapter_item_id")
    var chapterItemId: String = "",
    @SerializedName("chapter_item_media")
    var chapterItemMedia: List<ChapterItemMedia> = listOf(),
    @SerializedName("chapter_item_name")
    var chapterItemName: String = "",
    @SerializedName("ci_id")
    var ciId: String = "",
    @SerializedName("complete_status")
    var completeStatus: Int = 0,
    @SerializedName("course_chapter_id")
    var courseChapterId: String = "",
    @SerializedName("course_id")
    var courseId: String = "",
    @SerializedName("created_at")
    var createdAt: String = "",
    @SerializedName("days")
    var days: String = "",
    @SerializedName("last_update")
    var lastUpdate: String = "",
    @SerializedName("status")
    var status: String = ""
) : Parcelable