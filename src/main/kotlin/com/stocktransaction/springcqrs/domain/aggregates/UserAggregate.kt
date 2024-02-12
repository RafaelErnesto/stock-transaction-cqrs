package com.stocktransaction.springcqrs.domain.aggregates

import com.stocktransaction.springcqrs.domain.commands.CreateUserCommand
import com.stocktransaction.springcqrs.domain.events.CreateUserEvent
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate
import java.util.*

@Aggregate
class UserAggregate {

    @AggregateIdentifier
    lateinit var userId: UUID

    @CommandHandler
    fun handleCreateUserCommand(command: CreateUserCommand){
        AggregateLifecycle.apply(CreateUserEvent(userId))
    }

    @EventSourcingHandler
    fun on(event: CreateUserEvent) {

    }

}