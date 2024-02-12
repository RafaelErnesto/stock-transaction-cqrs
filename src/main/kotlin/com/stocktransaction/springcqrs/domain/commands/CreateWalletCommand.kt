package com.stocktransaction.springcqrs.domain.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.UUID

data class CreateWalletCommand (
    @TargetAggregateIdentifier
    val userId: UUID
)