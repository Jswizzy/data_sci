package com.example

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    val randomInt = generateRandom(1, 6)

    println(randomInt)
}

fun generateRandom(min: Int, max: Int)= ThreadLocalRandom.current().nextInt(min , max + 1)
