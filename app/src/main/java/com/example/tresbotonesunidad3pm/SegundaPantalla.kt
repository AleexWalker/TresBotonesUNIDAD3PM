package com.example.tresbotonesunidad3pm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda_pantalla.*

class SegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        val aleatorio = intent.getStringExtra("aleatorio")?.toInt()
        val numeroGenerado : Int

        textView2.text = "¡Here it is a random number between 1 & " + aleatorio + "!"
        numeroGenerado = (1..aleatorio!!).random()
        textView3.text = numeroGenerado.toString()
    }
}