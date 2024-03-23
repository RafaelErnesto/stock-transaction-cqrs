package com.stocktransaction.springcqrs.config.services

import com.stocktransaction.springcqrs.domain.services.UserService
import org.axonframework.commandhandling.gateway.CommandGateway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UserServiceConfig(
    private val commandGateway: CommandGateway
) {

    @Bean
    fun userService(): UserService {
        return UserService(commandGateway)
    }
}