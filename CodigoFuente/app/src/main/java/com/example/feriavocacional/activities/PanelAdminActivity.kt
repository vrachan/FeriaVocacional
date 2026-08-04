package com.example.feriavocacional.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.feriavocacional.R

class PanelAdminActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paneladminactivity)

        // Saludo personalizado (por ahora temporal)
        val txtBienvenida = findViewById<TextView>(R.id.txtBienvenida)
        txtBienvenida.text = "¡Bienvenido, Administrador!"

        val btnProductos = findViewById<Button>(R.id.btnProductos)
        val btnPanelclientes = findViewById<Button>(R.id.btnClientes)
        val btnPanelcarrito = findViewById<Button>(R.id.btnCarrito)
        val btnConfiguracion = findViewById<Button>(R.id.btnConfiguracion)
        val btnCerrarsesion = findViewById<Button>(R.id.btnCerrarSesion)


        btnProductos.setOnClickListener {
            val intent1 = Intent(this, productos::class.java)
            startActivity(intent1)

        }

        btnPanelclientes.setOnClickListener {
            val intent2 = Intent(this, GestionClientes::class.java)
            startActivity(intent2)
        }

        btnPanelcarrito.setOnClickListener {
            val intent3 = Intent(this, CarritosActivity::class.java)
            startActivity(intent3)
        }

        btnConfiguracion.setOnClickListener {
            val intent4 = Intent(this, ConfiguracionActivity::class.java)
            startActivity(intent4)
        }
        btnCerrarsesion.setOnClickListener {
            val intent = Intent(this, iniciarsesion::class.java)
            startActivity(intent)
            finish()
        }
    }

}