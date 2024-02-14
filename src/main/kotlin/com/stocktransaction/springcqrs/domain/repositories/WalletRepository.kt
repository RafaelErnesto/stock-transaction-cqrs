package com.stocktransaction.springcqrs.domain.repositories

import com.stocktransaction.springcqrs.domain.core.entities.Wallet

interface WalletRepository {

    fun save(wallet: Wallet)
}