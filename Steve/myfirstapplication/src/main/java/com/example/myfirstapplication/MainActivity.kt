package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var sum = 0

    fun increment(view: View ) {
        sum++
        showscore(sum)
    }

    fun decrement(v: View) {
        sum--
        showscore(sum)
    }

    private fun showscore(sum: Int) {
        val textView: TextView = findViewById(R.id.textView)
        textView.text = sum.toString()

    }


}