package com.stocktransaction.springcqrs.domain.core.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.*

data class CreateStockCommand (

    @TargetAggregateIdentifier
    val stockId: UUID
)