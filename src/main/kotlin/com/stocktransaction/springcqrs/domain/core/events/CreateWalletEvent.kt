package com.stocktransaction.springcqrs.domain.core.events

import java.util.*

data class CreateWalletEvent(
    val id: Long? = null,
    val userId: UUID
)
