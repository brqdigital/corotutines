package com.agoncalves.coroutines.ui.main

import android.util.Log
import com.agoncalves.coroutines.BaseViewModel
import com.agoncalves.coroutines.Interector.ItemInterector
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainViewModel : BaseViewModel() {

    val item = ItemInterector()
    fun callUsers() =
        launch {
            try {
               val response = item.getUsers()
            } catch (e: Exception) {
                //trata aqui
            }
        }
}


