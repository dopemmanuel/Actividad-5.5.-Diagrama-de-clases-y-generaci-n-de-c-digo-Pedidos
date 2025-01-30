package com.dam1.src

import com.dam1.src.clases.Cliente
import com.dam1.src.clases.Pedido
import com.dam1.src.clases.Producto

abstract class Pago {
    abstract val cantidad: Double

    abstract fun registrarPago()
}
class PagoTarjeta(
    val numero: String,
    val fechaCaducidad: String,
    val tipo: String,
    override val cantidad: Double
) : Pago() {
    override fun registrarPago() {
        println("Pago realizado con tarjeta $tipo por $cantidad")
    }
}
class PagoEfectivo(
    val tipoMoneda: String,
    override val cantidad: Double
) : Pago() {
    override fun registrarPago() {
        println("Pago realizado en efectivo ($tipoMoneda) por $cantidad")
    }
}
class PagoCheque(
    val nombre: String,
    val banco: String,
    override val cantidad: Double
) : Pago() {
    override fun registrarPago() {
        println("Pago realizado por cheque de $banco a nombre de $nombre por $cantidad")
    }
}

fun main(){
    val producto1 = Producto(1, "Camiseta", "Camiseta de algodón", 25.0, 0.18, 10)
    val producto2 = Producto(2, "Pantalón", "Pantalón de mezclilla", 40.0, 0.18, 5)
    val cliente = Cliente(1, "TesterA", "tester11@example.com", "Calle inexistente 123")

    val pedido = Pedido(id = 1, fecha = "2025-01-30", estado = "pdte")

    pedido.productos.add(producto1)
    pedido.productos.add(producto2)

    cliente.realizarPedido(pedido)

    val total = pedido.calcularTotal()
    println("El total del pedido es: $total")

    pedido.actualizarEstado("pgdo")
    println("Estado del pedido actualizado: ${pedido.estado}")

    val pagoTarjeta = PagoTarjeta("1234 5678 9101 1121", "12/25", "VISA", total)
    pagoTarjeta.registrarPago()

    val pagoEfectivo = PagoEfectivo("USD", 100.0)
    pagoEfectivo.registrarPago()

    val pagoCheque = PagoCheque("Carlos Gómez", "Banco Nacional", 50.0)
    pagoCheque.registrarPago()
    producto1.actualizarStock(2)
    producto2.actualizarStock(1)
    println("Stock actualizado: Camiseta - ${producto1.stock}, Pantalón - ${producto2.stock}")

}
