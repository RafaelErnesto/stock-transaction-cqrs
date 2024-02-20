package com.stocktransaction.springcqrs.domain.core.entities

import com.stocktransaction.springcqrs.domain.core.valueobjects.Currency
import java.time.LocalDateTime
import java.util.UUID

data class Transaction(
    val id: Long,
    val externalId: UUID,
    val buyerId: UUID,
    val sellerId: UUID,
    val stockId: UUID,
    val amount: Long,
    val totalValue: Currency,
    val date: LocalDateTime
)
