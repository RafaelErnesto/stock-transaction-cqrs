package com.stocktransaction.springcqrs.domain.core.aggregates

import com.stocktransaction.springcqrs.domain.core.commands.CreateWalletCommand
import com.stocktransaction.springcqrs.domain.core.entities.Wallet
import com.stocktransaction.springcqrs.domain.core.events.CreateWalletEvent
import com.stocktransaction.springcqrs.domain.repositories.WalletRepository
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate
import java.util.UUID

@Aggregate
class WalletAggregate(
    private val  walletRepository: WalletRepository
) {
    @AggregateIdentifier
    lateinit var userId: UUID

    @CommandHandler
    fun handler(command: CreateWalletCommand) {
        AggregateLifecycle.apply(CreateWalletEvent(userId = userId))
    }

    @EventSourcingHandler
    fun on(event: CreateWalletEvent) {
        walletRepository.save(Wallet(id = event.id, userId = event.userId))
    }
}