package com.example.app

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = Button(this).apply {
            tag = "button"
            text = "MainActivity"
            setOnClickListener {
                Log.i("MainActivity", "button on click")
            }
        }

        setContentView(button)
    }
}