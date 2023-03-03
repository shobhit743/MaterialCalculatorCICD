package com.shobhit.materialcalculatorcicd.domain

enum class Operation(val symbol:Char){
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('x'),
    DIVIDE('/'),
    PERCENT('%')
}

val operationsSymbols = Operation.values().map {
    it.symbol
}.joinToString("")

fun operationFromSymbol(symbol:Char) : Operation {
    return Operation.values().find {
        it.symbol == symbol
    } ?: throw IllegalArgumentException("Invalid Symbol")
}