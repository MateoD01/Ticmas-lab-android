package com.curso.android.app.proyectfinal

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    val resultLiveData = MutableLiveData<String>()

    fun compareStrings(text1: String, text2: String) {
        if (text1 == text2) {
            resultLiveData.value = "Las cadenas son iguales"
        } else {
            resultLiveData.value = "Las cadenas son diferentes"
        }
    }
}
