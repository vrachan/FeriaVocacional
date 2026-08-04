package com.example.feriavocacional.models

import android.content.Intent
import android.widget.Button
data class Producto(

    val id_producto: Int,
    val nombre: String,
    val descripcion: String,
    val categoria: String,
    val precio: Double,
    val stock: Int,
    val imagen: Int,
    val disponible: Boolean



)
