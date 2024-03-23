package com.stocktransaction.springcqrs.config.services

import com.stocktransaction.springcqrs.domain.services.WalletService
import org.axonframework.commandhandling.gateway.CommandGateway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class WalletServiceConfig(
    private val commandGateway: CommandGateway
) {

    @Bean
    fun walletService(): WalletService {
        return WalletService(commandGateway)
    }
}