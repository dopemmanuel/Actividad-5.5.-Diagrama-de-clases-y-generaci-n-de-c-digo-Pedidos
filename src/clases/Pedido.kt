package com.dam1.src.clases

data class Pedido(
    val id: Int,
    val fecha: String, // Puede ser Date en un caso más complejo
    var estado: String,
    val productos: MutableList<Producto> = mutableListOf()
) {
    fun calcularTotal(): Double {
        var total = 0.0
        for (producto in productos) {
            total += producto.calcularPrecioConImpuesto()
        }
        return total
    }

    fun actualizarEstado(nuevoEstado: String) {
        estado = nuevoEstado
    }
}