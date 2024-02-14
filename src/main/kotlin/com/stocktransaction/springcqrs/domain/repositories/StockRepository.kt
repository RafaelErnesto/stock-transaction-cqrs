package com.stocktransaction.springcqrs.domain.repositories

import com.stocktransaction.springcqrs.domain.core.entities.Stock

interface StockRepository {
    fun save(stock: Stock)
}