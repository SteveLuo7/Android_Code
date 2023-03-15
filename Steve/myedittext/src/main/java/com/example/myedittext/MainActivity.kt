package com.example.myedittext


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et = findViewById<EditText>(R.id.et)
        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener{
            val text = et.toString()
            println("输入的内容为： $text")

        }
    }


}


