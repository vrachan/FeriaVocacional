package com.example.feriavocacional.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.feriavocacional.R

class MainActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_main)

       val entrar = findViewById<Button>(R.id.btnEntrar)

       entrar.setOnClickListener {
           val intento = Intent(this, iniciarsesion::class.java)
           startActivity(intento)
       }
   }
}