package com.example.foodmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Carregamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carregamento)

        supportActionBar?.hide()



        Handler(Looper.getMainLooper()).postDelayed({
            AbirTelaLogin()
        },4155)

    }
    private fun AbirTelaLogin(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}