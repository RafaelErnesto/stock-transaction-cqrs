package com.stocktransaction.springcqrs.transport.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.UUID

data class CreateTransactionCommand (
    @TargetAggregateIdentifier
    val transactionId: UUID,
    val buyerId: UUID,
    val sellerId: UUID,
    val stockId: UUID
)