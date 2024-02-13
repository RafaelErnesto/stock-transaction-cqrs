package com.stocktransaction.springcqrs.domain.core.aggregates

import com.stocktransaction.springcqrs.domain.core.commands.CreateWalletCommand
import com.stocktransaction.springcqrs.domain.core.events.CreateWalletEvent
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate
import java.util.UUID

@Aggregate
class WalletAggregate {
    @AggregateIdentifier
    lateinit var userId: UUID

    @CommandHandler
    fun handler(command: CreateWalletCommand) {
        AggregateLifecycle.apply(CreateWalletEvent(userId))
    }

    @EventSourcingHandler
    fun on(event: CreateWalletEvent) {

    }
}