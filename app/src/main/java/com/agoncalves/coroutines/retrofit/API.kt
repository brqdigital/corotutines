package com.agoncalves.coroutines.retrofit

import retrofit2.http.GET

interface API {

    @GET("/users")
    suspend fun users() : Any
}