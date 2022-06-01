package com.example.cambiar_fondos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cambiar_fondos.databinding.ActivityBotonAmarilloBinding


class botonAmarillo : AppCompatActivity() {
    private lateinit var b: ActivityBotonAmarilloBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityBotonAmarilloBinding.inflate(layoutInflater)
        setContentView(b.root)



        b.volverAmarillo.setOnClickListener {
            onBackPressed()
        }







    }
}