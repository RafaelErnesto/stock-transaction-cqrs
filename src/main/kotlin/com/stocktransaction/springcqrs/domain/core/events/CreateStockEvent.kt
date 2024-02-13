package com.stocktransaction.springcqrs.domain.core.events

import java.util.*

data class CreateStockEvent(
    val stockId: UUID
)
