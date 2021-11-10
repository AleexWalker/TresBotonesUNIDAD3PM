package com.example.tresbotonesunidad3pm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numeroAleatorio : Int = 0
        var validez : Boolean = false

        button3.setOnClickListener {
            Toast.makeText(this, "¡Hello Toast!", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            numeroAleatorio =  (1..100).random().toString().toInt()
            textView.text = numeroAleatorio.toString()
            validez = true
        }

        button.setOnClickListener {
            if (validez) {
                val intent = Intent(this, SegundaPantalla::class.java).apply {
                    putExtra("aleatorio", numeroAleatorio.toString())
                }
                startActivity(intent)
            } else
                Toast.makeText(this, "¡Genera un Aleatorio antes!", Toast.LENGTH_SHORT).show()

        }
    }
}