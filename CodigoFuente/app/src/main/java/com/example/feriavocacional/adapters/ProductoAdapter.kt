package com.example.feriavocacional.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.feriavocacional.R
import com.example.feriavocacional.models.CarritoLocal
import com.example.feriavocacional.models.Producto

class ProductoAdapter(
    private var listaProductos: List<Producto>
) : RecyclerView.Adapter<ProductoAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imagenProducto: ImageView =
            itemView.findViewById(R.id.imgProducto)

        val nombreProducto: TextView =
            itemView.findViewById(R.id.txtNombre)

        val descripcionProducto: TextView =
            itemView.findViewById(R.id.txtDescripcion)

        val precioProducto: TextView =
            itemView.findViewById(R.id.txtPrecio)

        val btnAgregar: Button =
            itemView.findViewById(R.id.btnAgregar)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val vista = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_producto,
                parent,
                false
            )

        return ViewHolder(vista)
    }

    override fun getItemCount(): Int {
        return listaProductos.size
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {

        val producto = listaProductos[position]

        holder.imagenProducto.setImageResource(
            producto.imagen
        )

        holder.nombreProducto.text =
            producto.nombre

        holder.descripcionProducto.text =
            producto.descripcion

        holder.precioProducto.text =
            "Q${producto.precio}"

        // ⭐ ESTE ES EL BLOQUE QUE AGREGA EL PRODUCTO AL CARRITO
        holder.btnAgregar.setOnClickListener {

            CarritoLocal.productos.add(producto)

            Toast.makeText(
                holder.itemView.context,
                "${producto.nombre} agregado al carrito",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    // ⭐ Esta función debe estar aquí, fuera de onBindViewHolder
    fun actualizarLista(
        nuevaLista: List<Producto>
    ) {

        listaProductos = nuevaLista

        notifyDataSetChanged()
    }
}