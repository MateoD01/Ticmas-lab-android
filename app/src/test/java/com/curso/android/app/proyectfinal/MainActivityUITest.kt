package com.curso.android.app.proyectfinal

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityUITest {

    @Test
    fun testCompareButton() {
        // Launch the activity with ActivityScenario
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        // Simulate text input and button click
        scenario.onActivity { activity ->
            activity.findViewById<EditText>(R.id.editText1).setText("hello")
            activity.findViewById<EditText>(R.id.editText2).setText("world")
            activity.findViewById<Button>(R.id.compareButton).performClick()
        }

        // Verify the result in the TextView
        scenario.onActivity { activity ->
            val resultTextView = activity.findViewById<TextView>(R.id.resultTextView)
            assertEquals("Las cadenas son diferentes", resultTextView.text.toString())
        }
    }
}


