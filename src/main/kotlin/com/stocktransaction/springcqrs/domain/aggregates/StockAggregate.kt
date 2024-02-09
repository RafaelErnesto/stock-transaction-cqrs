package com.stocktransaction.springcqrs.domain.aggregates

import com.stocktransaction.springcqrs.domain.commands.CreateStockCommand
import com.stocktransaction.springcqrs.domain.events.CreateStockEvent
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate
import java.util.UUID

@Aggregate
class StockAggregate {
    @AggregateIdentifier
    lateinit var stockId: UUID

    @CommandHandler
    fun handler(command: CreateStockCommand) {
        AggregateLifecycle.apply(CreateStockCommand(stockId))
    }

    @EventSourcingHandler
    fun on(event: CreateStockEvent) {

    }

}