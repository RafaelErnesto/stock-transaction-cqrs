package com.stocktransaction.springcqrs.domain.services

import com.stocktransaction.springcqrs.domain.core.commands.toCreateUserCommand
import com.stocktransaction.springcqrs.domain.core.entities.User
import org.axonframework.commandhandling.gateway.CommandGateway

class UserService(
    private val commandGateway: CommandGateway
) {

    fun createUser(user: User) {
        val command = user.toCreateUserCommand()
        commandGateway.sendAndWait<Unit>(command)
    }
}