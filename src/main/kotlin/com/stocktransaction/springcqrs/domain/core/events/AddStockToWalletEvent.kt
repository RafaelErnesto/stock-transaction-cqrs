package com.stocktransaction.springcqrs.domain.core.events

import java.util.*

data class AddStockToWalletEvent (
    val walletId: UUID,
    val stockId: UUID
)