package com.stocktransaction.springcqrs.domain.core.aggregates

import com.stocktransaction.springcqrs.domain.core.commands.CreateUserCommand
import com.stocktransaction.springcqrs.domain.core.entities.User
import com.stocktransaction.springcqrs.domain.core.events.CreateUserEvent
import com.stocktransaction.springcqrs.domain.repositories.UserRepository
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate
import java.util.*

@Aggregate
class UserAggregate(
    private val userRepository: UserRepository
) {

    @AggregateIdentifier
    lateinit var userId: UUID

    @CommandHandler
    fun handleCreateUserCommand(command: CreateUserCommand){
        AggregateLifecycle.apply(CreateUserEvent(userId))
    }

    @EventSourcingHandler
    fun on(event: CreateUserEvent) {
        userRepository.save(User(id = event.userId))
    }

}