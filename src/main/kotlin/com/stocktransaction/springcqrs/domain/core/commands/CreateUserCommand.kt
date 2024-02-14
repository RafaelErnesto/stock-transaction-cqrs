package com.stocktransaction.springcqrs.domain.core.commands

import com.stocktransaction.springcqrs.domain.core.entities.User
import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.UUID

data class CreateUserCommand (
    @TargetAggregateIdentifier
    val id: String,
    val userId: UUID
)

fun User.toCreateUserCommand() = CreateUserCommand(
    id = UUID.randomUUID().toString(),
    userId = this.id
)