package com.stocktransaction.springcqrs.domain.events

import java.util.*

data class CreateStockEvent(
    val stockId: UUID
)
