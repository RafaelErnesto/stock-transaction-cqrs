package com.stocktransaction.springcqrs.transport.listeners

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.stocktransaction.springcqrs.domain.core.entities.Stock
import com.stocktransaction.springcqrs.domain.services.StockService
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class CreateStockListener(
    private val stockService: StockService
) {
    private val log = Logger.getLogger(CreateStockListener::class.java.name)

    @KafkaListener(topics = ["create-stock"], groupId = "my-group-id")
    fun createStock(message: String) {
        try {
           stockService.createStock(parseMessage(message))
        } catch(e: Exception) {
            log.severe("Error receiving message: $message")
            throw e
        }
    }

    private fun parseMessage(message: String): Stock{
        try {
            return jacksonObjectMapper().findAndRegisterModules().readValue(message, Stock::class.java)
        } catch(e: Exception) {
            log.severe("Error parsing message: $message")
            throw e
        }
    }
}