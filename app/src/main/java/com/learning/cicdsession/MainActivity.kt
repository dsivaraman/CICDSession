package com.learning.cicdsession

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.clickMe_button)

        clickMeButton.setOnClickListener { Toast.makeText(this, "You clicked Me..", Toast.LENGTH_LONG).show() }
    }

}
