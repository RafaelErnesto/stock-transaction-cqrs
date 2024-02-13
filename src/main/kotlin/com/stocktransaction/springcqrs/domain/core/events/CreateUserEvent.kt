package com.stocktransaction.springcqrs.domain.core.events

import java.util.*

data class CreateUserEvent(
    val userId: UUID
)
