package org.example.clientes.mappers

import database.ClienteEntity
import org.example.clientes.dto.ClienteDto
import org.example.clientes.models.Cliente
import java.time.LocalDateTime
/*
fun ClienteEntity.toCliente(): Cliente {
    return Cliente(
        id = this.id,
        nombre = this.nombre,
        email = this.email,
        createdAt = LocalDateTime.parse(this.created_at),
        updatedAt = LocalDateTime.parse(this.updated_at),
        isDeleted = this.is_deleted.toInt() == 1
    )
}

fun Cliente.toClienteDto(): ClienteDto {
    return ClienteDto(
        id = this.id,
        nombre = this.nombre,
        email = this.email,
        createdAt = this.createdAt.toString(),
        updatedAt = this.updatedAt.toString(),
        isDeleted = this.isDeleted
    )
}*/