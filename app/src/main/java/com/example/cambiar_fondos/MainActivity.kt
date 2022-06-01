package com.example.cambiar_fondos

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import com.example.cambiar_fondos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)




        b.verde.setOnClickListener{

            b.nombreLayout.setBackgroundResource(R.drawable.ryunueva)
            val intentVerde = Intent (this, botonVerde::class.java)
            startActivity(intentVerde)

        }

        b.amarillo.setOnClickListener {
            b.nombreLayout.setBackgroundColor(Color.YELLOW)
            val intentAmarillo = Intent (this, botonAmarillo::class.java)
            startActivity(intentAmarillo)
        }

        b.rojo.setOnClickListener {
            b.nombreLayout.setBackgroundColor(Color.RED)
            val intentRojo = Intent ( this, botonRojo::class.java)
            startActivity(intentRojo)

        }













    }




}