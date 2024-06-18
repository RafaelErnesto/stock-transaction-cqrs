package com.stocktransaction.springcqrs.transport.listeners

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.stocktransaction.springcqrs.domain.core.entities.Wallet
import com.stocktransaction.springcqrs.domain.services.WalletService
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class CreateWalletListener(
    private val walletService: WalletService
) {
    private val log = Logger.getLogger(CreateWalletListener::class.java.name)

    @KafkaListener(topics = ["create-wallet"], groupId = "my-group-id")
    fun createWallet(message: String) {
        try {
            walletService.createWallet(parseMessage(message))
        } catch(e: Exception) {
            log.severe("Error creating wallet: $message")
            throw e
        }
    }

    private fun parseMessage(message: String): Wallet {
        try {
            return jacksonObjectMapper().findAndRegisterModules().readValue(message, Wallet::class.java)
        } catch(e: Exception) {
            log.severe("Error parsing message: $message")
            throw e
        }
    }
}