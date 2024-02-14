package com.stocktransaction.springcqrs.domain.repositories

import com.stocktransaction.springcqrs.domain.core.entities.User

interface UserRepository {
    fun save(user: User)
}