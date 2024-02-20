package com.stocktransaction.springcqrs.domain.core.entities

import com.stocktransaction.springcqrs.domain.core.commands.CreateStockCommand
import com.stocktransaction.springcqrs.domain.core.valueobjects.StockCode
import java.util.UUID

data class Stock(
    val id: UUID,
    val code: StockCode
)

fun Stock.toCreateStockCommand() = CreateStockCommand(
    stockId = id,
    stockCode = StockCode(code.value)
)
