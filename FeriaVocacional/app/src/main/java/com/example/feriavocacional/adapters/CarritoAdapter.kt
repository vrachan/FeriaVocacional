package com.example.feriavocacional.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.feriavocacional.R
import com.example.feriavocacional.activities.DetalleCarritoActivity
import com.example.feriavocacional.models.Compra

class CarritoAdapter(
    private val lista: MutableList<Compra>
) : RecyclerView.Adapter<CarritoAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val txtCliente: TextView =
            itemView.findViewById(R.id.txtCliente)

        val txtCantidad: TextView =
            itemView.findViewById(R.id.txtCantidad)

        val txtTotal: TextView =
            itemView.findViewById(R.id.txtTotal)

        val btnVer: Button =
            itemView.findViewById(R.id.btnVer)

        val btnEliminar: Button =
            itemView.findViewById(R.id.btnEliminar)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val vista = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.item_carrito,
                parent,
                false
            )

        return ViewHolder(vista)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {

        val compra = lista[position]

        holder.txtCliente.text =
            compra.cliente

        holder.txtCantidad.text =
            "${compra.productos.size} Productos"

        holder.txtTotal.text =
            "Q${compra.total}"

        holder.btnVer.setOnClickListener {

            val intent = Intent(
                holder.itemView.context,
                DetalleCarritoActivity::class.java
            )

            intent.putExtra(
                "cliente",
                compra.cliente
            )

            intent.putExtra(
                "cantidad",
                compra.productos.size
            )

            intent.putExtra(
                "total",
                compra.total
            )

            holder.itemView.context
                .startActivity(intent)
        }

        holder.btnEliminar.setOnClickListener {

            lista.removeAt(position)

            notifyItemRemoved(position)

            Toast.makeText(
                holder.itemView.context,
                "Carrito eliminado correctamente",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}