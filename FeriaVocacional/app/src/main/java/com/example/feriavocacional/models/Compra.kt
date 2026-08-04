package com.example.feriavocacional.models

data class Compra(
    val cliente: String,
    val productos: MutableList<Producto>,
    val total: Double
)