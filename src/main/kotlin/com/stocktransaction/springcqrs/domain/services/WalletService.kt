package com.stocktransaction.springcqrs.domain.services

import com.stocktransaction.springcqrs.domain.core.commands.toCreateWalletCommand
import com.stocktransaction.springcqrs.domain.core.entities.Wallet
import org.axonframework.commandhandling.gateway.CommandGateway

class WalletService(
    private val commandGateway: CommandGateway
) {

    fun createWallet(wallet: Wallet) {
        commandGateway.sendAndWait<Unit>(wallet.toCreateWalletCommand())
    }
}