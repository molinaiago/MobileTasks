package com.example.atv1.layout

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.atv1.R

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d("HomeActivity","ON CREATE AQUI ----------------------------")
    }

    override fun onStart() {
        super.onStart()
        Log.d("HomeActivity", "ON START AQUI ----------------------------")
    }

    override fun onResume() {
        super.onResume()
        Log.d("HomeActivity", "ON RESUME AQUI ---------------------------")
    }

    override fun onPause() {
        super.onPause()
        Log.d("HomeActivity", "ON PAUSE AQUI ----------------------------")
    }

    override fun onStop() {
        super.onStop()
        Log.d("HomeActivity", "ON STOP AQUI -----------------------------")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("HomeActivity", "ON DESTROY AQUI --------------------------")
    }

}