package com.stocktransaction.springcqrs.transport.events

import java.util.*

data class CreateStockEvent(
    val stockId: UUID
)
