package com.example.demo

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navidemo.OnFragmentInteractionListener

class MainActivity : AppCompatActivity(), OnFragmentInteractionListener {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onFragmentInteraction(uri: Uri) {
        null
    }
}