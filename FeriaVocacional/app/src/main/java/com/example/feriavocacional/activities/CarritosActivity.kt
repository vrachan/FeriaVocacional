package com.example.feriavocacional.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feriavocacional.R
import com.example.feriavocacional.adapters.MiCarritoAdapter
import com.example.feriavocacional.models.CarritoLocal

class CarritosActivity : AppCompatActivity() {

    private lateinit var recycler: RecyclerView
    private lateinit var adapter: MiCarritoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_carrito)

        recycler =
            findViewById(R.id.recyclerCarritos)

        recycler.layoutManager =
            LinearLayoutManager(this)

        adapter = MiCarritoAdapter(
            CarritoLocal.productos
        ) {
            // Actualización cuando se elimina un producto
        }

        recycler.adapter =
            adapter
    }

    override fun onResume() {
        super.onResume()

        if (::adapter.isInitialized) {
            adapter.notifyDataSetChanged()
        }
    }
}