package com.ret.demoapplication

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiCall {


    @FormUrlEncoded
    @POST(Constants.ChapterItemList)
    suspend fun chapterItemList(
        @Field("login_id") loginId: String = "3",
        @Field("course_chapter_id") courseChapterId: String = "1",
        @Field("school_id") schoolId: String = "1",
        @Field("batch_id") batchId: String = "2",
        @Field("course_id") courseId: String = "1",
        @Field("key") key: String  = "Qskills",
        @Field("tag") tag: String  = "chapter_item_list",
    ): BaseChapterItemModel


}