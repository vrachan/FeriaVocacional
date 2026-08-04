package com.example.feriavocacional.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.feriavocacional.R
import com.example.feriavocacional.models.Cliente

class ClienteAdapter(
    private val listaClientes: List<Cliente>
) : RecyclerView.Adapter<ClienteAdapter.ClienteViewHolder>() {

    class ClienteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txtNombre: TextView = itemView.findViewById(R.id.txtNombre)
        val txtCorreo: TextView = itemView.findViewById(R.id.txtCorreo)
        val txtRol: TextView = itemView.findViewById(R.id.txtRol)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClienteViewHolder {

        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cliente, parent, false)

        return ClienteViewHolder(vista)

    }

    override fun getItemCount(): Int {

        return listaClientes.size

    }

    override fun onBindViewHolder(holder: ClienteViewHolder, position: Int) {

        val cliente = listaClientes[position]

        holder.txtNombre.text = cliente.nombre
        holder.txtCorreo.text = cliente.correo
        holder.txtRol.text = cliente.rol

    }

}