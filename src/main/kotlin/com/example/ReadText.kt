package com.example

import java.io.File
import java.time.LocalDate

fun main(args: Array<String>) {
    val reader = File("hello.txt").bufferedReader()

    reader.readLines()
            .drop(1)
            .map { it.split(",") }
            .map {
                CustomerOrder(
                        customerId = it[0].toInt(),
                        customerOrderId = it[1].toInt(),
                        orderDate = LocalDate.parse(it[2]),
                        productId = it[3].toInt(),
                        quantity = it[4].toInt()
                )
            }
}

data class CustomerOrder(
        val customerOrderId: Int,
        val customerId: Int,
        val orderDate: LocalDate,
        val productId: Int,
        val quantity: Int
)