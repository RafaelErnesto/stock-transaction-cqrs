package com.stocktransaction.springcqrs.transport.events

import java.util.*

data class AddStockToWalletEvent (
    val walletId: UUID,
    val stockId: UUID
)