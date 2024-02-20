package com.stocktransaction.springcqrs.domain.services

import com.stocktransaction.springcqrs.domain.core.commands.toCreateStockCommand
import com.stocktransaction.springcqrs.domain.core.entities.Stock
import org.axonframework.commandhandling.gateway.CommandGateway

class StockService(
    private val commandGateway: CommandGateway
) {

    fun createStock(stock: Stock) {
        val stockCommand = stock.toCreateStockCommand()
        commandGateway.sendAndWait<Unit>(stockCommand)
    }
}