package com.stocktransaction.springcqrs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringStockTransactionCqrsApplication

fun main(args: Array<String>) {
	runApplication<SpringStockTransactionCqrsApplication>(*args)
}
