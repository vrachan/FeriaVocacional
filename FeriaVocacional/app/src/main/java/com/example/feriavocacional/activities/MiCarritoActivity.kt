package com.example.feriavocacional.activities

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feriavocacional.R
import com.example.feriavocacional.adapters.MiCarritoAdapter
import com.example.feriavocacional.models.CarritoLocal

class MiCarritoActivity : AppCompatActivity() {

    private lateinit var recyclerMiCarrito: RecyclerView
    private lateinit var txtTotalCarrito: TextView
    private lateinit var btnConfirmarCompra: Button
    private lateinit var btnVaciarCarrito: Button

    private lateinit var adapter: MiCarritoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_mi_carrito)

        recyclerMiCarrito =
            findViewById(R.id.recyclerMiCarrito)

        txtTotalCarrito =
            findViewById(R.id.txtTotalCarrito)

        btnConfirmarCompra =
            findViewById(R.id.btnConfirmarCompra)

        btnVaciarCarrito =
            findViewById(R.id.btnVaciarCarrito)

        recyclerMiCarrito.layoutManager =
            LinearLayoutManager(this)

        adapter = MiCarritoAdapter(
            CarritoLocal.productos
        ) {
            actualizarTotal()
        }

        recyclerMiCarrito.adapter =
            adapter

        actualizarTotal()

        btnVaciarCarrito.setOnClickListener {

            CarritoLocal.productos.clear()

            adapter.notifyDataSetChanged()

            actualizarTotal()
        }

        btnConfirmarCompra.setOnClickListener {

            if (CarritoLocal.productos.isEmpty()) {

                return@setOnClickListener
            }

            CarritoLocal.compraConfirmada = true

            android.widget.Toast.makeText(
                this,
                "Compra confirmada correctamente",
                android.widget.Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun actualizarTotal() {

        var total = 0.0

        for (producto in CarritoLocal.productos) {
            total += producto.precio
        }

        txtTotalCarrito.text =
            "Total: Q$total"
    }
}