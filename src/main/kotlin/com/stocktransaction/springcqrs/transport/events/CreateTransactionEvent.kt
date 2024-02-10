package com.stocktransaction.springcqrs.transport.events

import java.util.*

data class CreateTransactionEvent(
    val transactionId: UUID,
    val buyerId: UUID,
    val sellerId: UUID,
    val stockId: UUID
)
