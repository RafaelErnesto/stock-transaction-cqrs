package com.stocktransaction.springcqrs.domain.valueobjects

import java.lang.RuntimeException

data class StockCode(
    val value: String,
) {
    init {
        validateCode(value)
    }

}

private fun validateCode(value: String) {
    val matched = Regex("^[A-Z]{3}[0-1]{2}\$").matches(value)
    if(!matched) {
        throw RuntimeException("Invalid stock code")
    }
}
