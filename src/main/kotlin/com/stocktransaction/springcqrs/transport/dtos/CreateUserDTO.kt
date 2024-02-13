package com.stocktransaction.springcqrs.transport.dtos

import com.stocktransaction.springcqrs.domain.core.entities.User
import java.util.*

data class CreateUserDTO(
    val id: UUID,
)

fun CreateUserDTO.toDomain() = User(id)