package com.ret.demoapplication

import android.util.Base64
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitHelper {


    var retrofit: Retrofit? = null
        get() {
            if (field == null) {

                val gson = GsonBuilder().setLenient().create()

                field = Retrofit.Builder().baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(builder.build())
                    .build()
            }
            return field
        }

    var loggingIntercepter = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    var builder: OkHttpClient.Builder = OkHttpClient.Builder()
        .addInterceptor(loggingIntercepter)
        .addInterceptor(
        Interceptor { chain->

            val originalRequest = chain.request()
            val builder = originalRequest.newBuilder()
            val authorization =
                "${"@Qskillsind@"}:${"@Qskillsind_Appuno@"}"
            val base64 = "Basic ${
                Base64.encodeToString(
                    authorization.toByteArray(),
                    Base64.NO_WRAP
                )
            }"
            builder.header("Authorization", base64)
            builder.method(originalRequest.method, originalRequest.body)
            chain.proceed(builder.build())
        })


}