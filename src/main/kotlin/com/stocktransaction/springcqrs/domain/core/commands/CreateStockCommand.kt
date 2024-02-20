package com.stocktransaction.springcqrs.domain.core.commands

import com.stocktransaction.springcqrs.domain.core.valueobjects.StockCode
import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.*

data class CreateStockCommand (

    @TargetAggregateIdentifier
    val stockId: UUID,
    val stockCode: StockCode
)