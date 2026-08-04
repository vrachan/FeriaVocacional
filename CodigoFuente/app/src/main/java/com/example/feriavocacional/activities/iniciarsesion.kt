package com.example.feriavocacional.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.example.feriavocacional.R

class iniciarsesion : AppCompatActivity() {

    private lateinit var etCorreo: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_iniciarsesion)

        etCorreo = findViewById(R.id.etCorreo)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            iniciarSesion()
        }
    }

    private fun iniciarSesion() {

        val correo = etCorreo.text.toString().trim()
        val password = etPassword.text.toString().trim()

        // Datos del administrador
        val correoAdmin = "admin@nubetoys.com"
        val passwordAdmin = "1234"

        // Datos del cliente
        val correoCliente = "cliente@nubetoys.com"
        val passwordCliente = "1234"

        if (correo.isEmpty() || password.isEmpty()) {

            Toast.makeText(
                this,
                "Complete todos los campos",
                Toast.LENGTH_SHORT
            ).show()

            return
        }

        // LOGIN DEL ADMINISTRADOR
        if (correo == correoAdmin && password == passwordAdmin) {

            Toast.makeText(
                this,
                "¡Bienvenido Administrador!",
                Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(
                this,
                PanelAdminActivity::class.java
            )

            startActivity(intent)
            finish()

        }

        // LOGIN DEL CLIENTE
        else if (correo == correoCliente && password == passwordCliente) {

            Toast.makeText(
                this,
                "¡Bienvenido a Nube Toys!",
                Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(
                this,
                productos::class.java
            )

            startActivity(intent)
            finish()

        }

        // DATOS INCORRECTOS
        else {

            Toast.makeText(
                this,
                "Correo o contraseña incorrectos",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}