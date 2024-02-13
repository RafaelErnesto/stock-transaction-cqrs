package com.stocktransaction.springcqrs.domain.core.events

import java.util.*

data class CreateTransactionEvent(
    val transactionId: UUID,
    val buyerId: UUID,
    val sellerId: UUID,
    val stockId: UUID
)
