package com.stocktransaction.springcqrs.domain.events

import java.util.*

data class AddStockToWalletEvent (
    val walletId: UUID,
    val stockId: UUID
)