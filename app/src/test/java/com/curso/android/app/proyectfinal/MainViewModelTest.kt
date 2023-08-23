package com.curso.android.app.proyectfinal

import org.junit.Assert.assertEquals
import org.junit.Test

class MainViewModelTest {

    @Test
    fun testCompareStrings() {
        val viewModel = MainViewModel()

        viewModel.compareStrings("hello", "hello")
        assertEquals("Las cadenas son iguales", viewModel.resultLiveData.value)

        viewModel.compareStrings("hello", "world")
        assertEquals("Las cadenas son diferentes", viewModel.resultLiveData.value)
    }
}
