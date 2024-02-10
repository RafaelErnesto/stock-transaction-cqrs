package com.stocktransaction.springcqrs.transport.events

import java.util.*

data class CreateUserEvent(
    val userId: UUID
)
