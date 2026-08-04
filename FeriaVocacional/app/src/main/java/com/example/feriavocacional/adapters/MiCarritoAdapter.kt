package com.example.feriavocacional.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.feriavocacional.R
import com.example.feriavocacional.models.Producto

class MiCarritoAdapter(
    private val lista: MutableList<Producto>,
    private val actualizarTotal: () -> Unit
) : RecyclerView.Adapter<MiCarritoAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txtNombreCarrito: TextView =
            itemView.findViewById(R.id.txtNombreCarrito)

        val txtPrecioCarrito: TextView =
            itemView.findViewById(R.id.txtPrecioCarrito)

        val btnEliminarProducto: Button =
            itemView.findViewById(R.id.btnEliminarProducto)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val vista = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_mi_carrito,
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

        val producto = lista[position]

        holder.txtNombreCarrito.text =
            producto.nombre

        holder.txtPrecioCarrito.text =
            "Q${producto.precio}"

        holder.btnEliminarProducto.setOnClickListener {

            lista.removeAt(position)

            notifyItemRemoved(position)

            actualizarTotal()

            Toast.makeText(
                holder.itemView.context,
                "Producto eliminado del carrito",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}