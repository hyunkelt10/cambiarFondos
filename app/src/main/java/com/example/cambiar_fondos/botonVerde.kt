package com.example.cambiar_fondos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cambiar_fondos.databinding.ActivityBotonVerde2Binding
import com.example.cambiar_fondos.databinding.ActivityBotonVerdeBinding

class botonVerde : AppCompatActivity() {
    private lateinit var b:ActivityBotonVerde2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityBotonVerde2Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.vovlerVerde.setOnClickListener {
            onBackPressed()
        }

        b.infoVerde.setOnClickListener {
           val verde = b.infoVerde.layout
           val verde2 =b.infoVerde.text
           val verde3 =b.infoVerde.accessibilityClassName
           val verde4 =b.infoVerde.alpha
           val verde5 = b.infoVerde.animation
            b.textoVerde.text = " layout: $verde\n texto: $verde2\n nombre de clase: $verde3\n alpha $verde4\n animation: $verde5 "
        }





    }
}