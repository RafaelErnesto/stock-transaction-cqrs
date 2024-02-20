package com.stocktransaction.springcqrs.domain.core.aggregates

import com.stocktransaction.springcqrs.domain.core.commands.CreateStockCommand
import com.stocktransaction.springcqrs.domain.core.entities.Stock
import com.stocktransaction.springcqrs.domain.core.events.CreateStockEvent
import com.stocktransaction.springcqrs.domain.core.valueobjects.StockCode
import com.stocktransaction.springcqrs.domain.repositories.StockRepository
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate
import java.util.UUID

@Aggregate
class StockAggregate(
    private val stockRepository: StockRepository
) {
    @AggregateIdentifier
    lateinit var stockId: UUID
    lateinit var stockCode: StockCode

    @CommandHandler
    fun handler(command: CreateStockCommand) {
        AggregateLifecycle.apply(CreateStockCommand(stockId, stockCode))
    }

    @EventSourcingHandler
    fun on(event: CreateStockEvent) {
        stockRepository.save(Stock(id = event.stockId, code = event.stockCode))
    }

}