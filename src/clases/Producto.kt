package com.dam1.src.clases

data class Producto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val impuestos: Double,
    var stock: Int
) {
    fun actualizarStock(cantidad: Int) {
        stock -= cantidad
    }

    fun calcularPrecioConImpuesto(): Double {
        return precio * (1 + impuestos)
    }
}