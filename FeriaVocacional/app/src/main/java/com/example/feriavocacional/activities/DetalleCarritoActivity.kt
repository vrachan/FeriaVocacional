package com.example.feriavocacional.activities

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.feriavocacional.R

class
DetalleCarritoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detalle_carrito)

        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)
        val btnCancelar = findViewById<Button>(R.id.btnCancelar)
        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnConfirmar.setOnClickListener {

            Toast.makeText(
                this,
                "Compra confirmada ",
                Toast.LENGTH_SHORT
            ).show()

        }

        b
        tnCancelar.setOnClickListener {

            Toast.makeText(
                this,
                "Compra cancelada",
                Toast.LENGTH_SHORT
            ).show()

        }

        btnVolver.setOnClickListener {

            finish()

        }

    }

}