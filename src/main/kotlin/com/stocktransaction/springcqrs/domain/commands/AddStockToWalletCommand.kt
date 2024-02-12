package com.stocktransaction.springcqrs.domain.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.UUID

data class AddStockToWalletCommand (
    @TargetAggregateIdentifier
    val walletId: UUID,
    val stockId: UUID
)
