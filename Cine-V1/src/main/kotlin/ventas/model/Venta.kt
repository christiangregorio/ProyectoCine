package org.example.models.ticket.model

import org.example.clientes.models.Cliente
import org.example.ventas.model.LineaVenta
import java.time.LocalDateTime
import java.util.*

data class Venta(
    val id: UUID = UUID.randomUUID(),
    val cliente: Cliente,
    val lineas: List<LineaVenta>,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
) {
    val total: Double
        get() = lineas.sumOf { it.precio * it.cantidad }

    override fun toString(): String {
        return "Venta(id=$id, cliente=$cliente, lineas=$lineas, createdAt=$createdAt, updatedAt=$updatedAt, total=$total)"
    }
}