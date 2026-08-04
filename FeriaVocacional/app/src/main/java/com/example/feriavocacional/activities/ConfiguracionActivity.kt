package com.example.feriavocacional.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.feriavocacional.R
import android.content.Intent
import android.widget.Button
import android.widget.Toast

class ConfiguracionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_configuracion)

        val btnAcercaDe = findViewById<Button>(R.id.btnAcercaDe)

        btnAcercaDe.setOnClickListener {
            val intent1 = Intent(this, AcercaDeActivity::class.java)
            startActivity(intent1)
        }

    }
}