package com.javiereduardo.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Declaracion de variables globales
    lateinit var primerBoton:Button
    lateinit var segundoBoton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Inicializar las variables
        primerBoton = findViewById(R.id.primer_boton)
        segundoBoton = findViewById(R.id.segundo_boton)

        primerBoton.setOnClickListener {
            var miIntent = Intent(this,SegundaActivity::class.java)
            startActivity(miIntent)
        }
        segundoBoton.setOnClickListener {
            var miIntent = Intent(this,TerceraActivity::class.java)
            startActivity(miIntent)
        }
    }
}