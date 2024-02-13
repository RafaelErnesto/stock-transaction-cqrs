package com.stocktransaction.springcqrs.domain.core.events

import java.util.*

data class CreateWalletEvent(
    val userId: UUID
)
