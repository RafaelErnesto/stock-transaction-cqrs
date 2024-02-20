package com.stocktransaction.springcqrs.transport.listeners

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.stocktransaction.springcqrs.domain.core.entities.User
import com.stocktransaction.springcqrs.domain.services.UserService
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class CreateUserListener(
    val userService: UserService
) {
    private val log = Logger.getLogger(CreateUserListener::class.java.name)

    @KafkaListener(topics = ["create-user"], groupId = "group_id")
    fun consume(message: String) {
        userService.createUser(parseMessage(message))
    }

    private fun parseMessage(message: String): User {
        try {
            return jacksonObjectMapper().findAndRegisterModules().readValue(message, User::class.java)
        } catch(e: Exception) {
            log.severe("Error parsing message: $message")
            throw e
        }
    }
}