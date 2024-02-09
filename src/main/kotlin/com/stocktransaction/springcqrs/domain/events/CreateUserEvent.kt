package com.stocktransaction.springcqrs.domain.events

import java.util.*

data class CreateUserEvent(
    val userId: UUID
)
