package com.dam1.src.clases

data class Cliente(
    val id: Int,
    val nombre: String,
    val correo: String,
    val direccion: String
) {
    fun realizarPedido(pedido: Pedido) {
        println("Pedido realizado por $nombre")
    }
}