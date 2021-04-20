package com.javiereduardo.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {

    //Declaracion de variables globales
    var contador = 0
    lateinit var primerBoton: Button
    lateinit var segundoBoton: Button
    lateinit var btnIncrementar: Button
    lateinit var tvContador: TextView
    lateinit var btnDecrementar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        //Inicializar las variables
        primerBoton = findViewById(R.id.primer_boton)
        segundoBoton = findViewById(R.id.segundo_boton)
        btnIncrementar = findViewById(R.id.btn_incrementar)
        tvContador = findViewById(R.id.tvNumero)
        btnDecrementar = findViewById(R.id.btn_decrementar)

        primerBoton.setOnClickListener {
            var miIntent = Intent(this,MainActivity::class.java)
            startActivity(miIntent)
        }
        segundoBoton.setOnClickListener {
            var miIntent = Intent(this,TerceraActivity::class.java)
            startActivity(miIntent)
        }
        btnIncrementar.setOnClickListener {
            if (contador < 10) {
                contador++
                btnDecrementar.isEnabled = true
            } else{
                btnIncrementar.isEnabled = false
            }
                tvContador.text = "$contador"

        }
        btnDecrementar.setOnClickListener {
            if (contador > 0) {
                contador--
                btnIncrementar.isEnabled = true
            } else{
                btnDecrementar.isEnabled = false
            }
            tvContador.text = "$contador"
        }
    }
}