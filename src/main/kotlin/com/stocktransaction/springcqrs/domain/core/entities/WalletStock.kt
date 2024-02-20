package com.stocktransaction.springcqrs.domain.core.entities

import com.stocktransaction.springcqrs.domain.core.valueobjects.Currency
import java.util.UUID

data class WalletStock(
    val id: Long,
    val walletId: UUID,
    val stockId: UUID,
    val amount: Long,
    val averagePrice: Currency
)
