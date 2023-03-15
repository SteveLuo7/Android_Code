package com.example.intend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_b)

        val extras = intent.extras ?: return
        val pMessage = extras.getString("PString")
        val textViewB = findViewById<TextView>(R.id.textViewB)
        textViewB.text = pMessage

    }
}