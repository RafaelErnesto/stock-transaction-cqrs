package com.stocktransaction.springcqrs.config.services

import com.stocktransaction.springcqrs.domain.services.StockService
import org.axonframework.commandhandling.gateway.CommandGateway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class StockServiceConfig(
    private val commandGateway: CommandGateway
) {

    @Bean
    fun stockService(): StockService {
        return StockService(commandGateway)
    }
}