package com.stocktransaction.springcqrs.domain.entities

import com.stocktransaction.springcqrs.domain.valueobjects.StockCode
import java.util.UUID

data class Stock(
    val id: UUID,
    val code: StockCode
)
