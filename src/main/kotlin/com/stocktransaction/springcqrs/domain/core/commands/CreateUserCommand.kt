package com.stocktransaction.springcqrs.domain.core.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.UUID

data class CreateUserCommand (
    @TargetAggregateIdentifier
    val userId: UUID
)