package com.stocktransaction.springcqrs.domain.events

import java.util.*

data class CreateWalletEvent(
    val userId: UUID
)
