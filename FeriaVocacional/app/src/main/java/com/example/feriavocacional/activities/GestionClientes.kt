package com.example.feriavocacional.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.feriavocacional.R
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.feriavocacional.adapters.ClienteAdapter
import com.example.feriavocacional.models.Cliente
class GestionClientes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestion_clientes)
        val recycler = findViewById<RecyclerView>(R.id.recyclerClientes)

        recycler.layoutManager = LinearLayoutManager(this)

        val clientes = listOf(

            Cliente(
                "Bryan Vargas",
                "bryan@nubetoys.com",
                "Administrador"
            ),

            Cliente(
                "Emily",
                "emily@nubetoys.com",
                "Cliente"
            ),

            Cliente(
                "Kevin",
                "kevin@nubetoys.com",
                "Cliente"
            ),

            Cliente(
                "Yohana",
                "yohana@nubetoys.com",
                "Administrador"
            ),

            Cliente(
                "José",
                "jose@nubetoys.com",
                "Cliente"
            )

        )

        recycler.adapter = ClienteAdapter(clientes)
    }
}