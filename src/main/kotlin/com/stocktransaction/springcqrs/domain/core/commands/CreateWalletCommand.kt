package com.stocktransaction.springcqrs.domain.core.commands

import com.stocktransaction.springcqrs.domain.core.entities.Stock
import com.stocktransaction.springcqrs.domain.core.entities.Wallet
import com.stocktransaction.springcqrs.domain.core.valueobjects.StockCode
import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.UUID

data class CreateWalletCommand (
    @TargetAggregateIdentifier
    val userId: UUID
)

fun Wallet.toCreateWalletCommand() = CreateWalletCommand(
    userId = userId
)