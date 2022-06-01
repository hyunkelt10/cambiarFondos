package com.example.cambiar_fondos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cambiar_fondos.databinding.ActivityBotonRojo2Binding

class botonRojo : AppCompatActivity() {
    private lateinit var b : ActivityBotonRojo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        b = ActivityBotonRojo2Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.volverRojo.setOnClickListener {
            onBackPressed()
        }
        b.infoRojo.setOnClickListener {
            val rojo = b.infoRojo.layout
            val rojo2 = b.infoRojo.text
            val rojo3 =b.infoRojo.accessibilityClassName
            val rojo4 =b.infoRojo.alpha
            val rojo5 =b.infoRojo.animation
            b.textoRojo.text = " layout $rojo\n texto $rojo2\n nombre de clase $rojo3\n alpha $rojo4\n animacion $rojo5"


        }



    }
}