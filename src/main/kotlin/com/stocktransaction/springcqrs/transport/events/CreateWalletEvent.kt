package com.stocktransaction.springcqrs.transport.events

import java.util.*

data class CreateWalletEvent(
    val userId: UUID
)
