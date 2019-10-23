package com.agoncalves.coroutines.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitService {

    private const val API_URL = "https://jsonplaceholder.typicode.com"
//com
//    private val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
//        level = HttpLoggingInterceptor.Level.BODY
//    }
//
//    private val httpClient = OkHttpClient.Builder()
//        .readTimeout(30, TimeUnit.SECONDS)
//        .connectTimeout(30, TimeUnit.SECONDS)
//        .writeTimeout(30, TimeUnit.SECONDS)
//        .addInterceptor(httpLoggingInterceptor)
//        .build()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(API_URL)
//        .client(httpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getService(): API = retrofit.create(API::class.java)

}