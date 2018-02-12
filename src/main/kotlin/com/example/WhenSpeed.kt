package com.example

fun main(args: Array<String>) {

    println("Enter a wind spped value: ")
    val windSpeed = readLine()?.toInt() ?: throw Exception("Please provide a wind speed!")

    val severity = when {
        windSpeed >= 40 -> "High"
        windSpeed >= 30 -> "Moderate"
        windSpeed >= 0 -> "Low"
        else -> throw Exception("Wind speed must be positive!")
    }

    println("$windSpeed MPH has a severity of $severity.")
}