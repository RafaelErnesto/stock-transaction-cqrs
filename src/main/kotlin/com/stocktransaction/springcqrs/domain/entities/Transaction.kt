package com.stocktransaction.springcqrs.domain.entities

import com.stocktransaction.springcqrs.domain.valueobjects.Monetary
import java.time.LocalDateTime
import java.util.UUID

data class Transaction(
    val id: Long,
    val externalId: UUID,
    val buyerId: UUID,
    val sellerId: UUID,
    val stockId: UUID,
    val amount: Long,
    val totalValue: Monetary,
    val date: LocalDateTime
)
