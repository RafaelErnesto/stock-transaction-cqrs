package com.stocktransaction.springcqrs.domain.core.entities

import java.util.UUID

data class Wallet(
    val id: Long,
    val userId: UUID
)
