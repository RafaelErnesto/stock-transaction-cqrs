package com.stocktransaction.springcqrs.domain.core.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.UUID

data class AddStockToWalletCommand (
    @TargetAggregateIdentifier
    val walletId: UUID,
    val stockId: UUID
)
