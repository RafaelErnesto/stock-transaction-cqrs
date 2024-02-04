package com.stocktransaction.springcqrs.domain.entities

import com.stocktransaction.springcqrs.domain.valueobjects.Monetary
import java.util.UUID

data class WalletStock(
    val id: Long,
    val walletId: UUID,
    val stockId: UUID,
    val amount: Long,
    val averagePrice: Monetary
)
