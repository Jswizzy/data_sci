package com.example

import java.net.URL

fun main(args: Array<String>) {
    println(usStates)
}

val usStates by lazy {
    URL("HTTPS://goo.gl/S0xuOi").readText().split(Regex("\\r?\\n"))
}