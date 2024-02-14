package com.stocktransaction.springcqrs.domain.core.events

import com.stocktransaction.springcqrs.domain.core.valueobjects.StockCode
import java.util.*

data class CreateStockEvent(
    val stockId: UUID,
    val stockCode: StockCode
)
