package com.agoncalves.coroutines.Interector

import com.agoncalves.coroutines.retrofit.API
import com.agoncalves.coroutines.retrofit.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ItemInterector {
    private val service: API = RetrofitService.getService()

     suspend fun getUsers() =
         withContext(Dispatchers.IO) {
             service.users()
         }
}