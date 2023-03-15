package com.example.intend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val i = Intent(this, MainActivityB::class.java)

        val editText: TextView = findViewById(R.id.editText)
        val myMessage = editText.text.toString()
        i.putExtra("pString", myMessage)
        startActivity(i)

    }
}