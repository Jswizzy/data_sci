package com.example

import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {
    val patient = Patient("Justin", "Smith", LocalDate.of(1984, 1, 23))

    println("${patient.firstName}'s age is ${patient.age}")
}

class Patient(val firstName: String, val lastName: String, val birthday: LocalDate) {
    val age get() = ChronoUnit.YEARS.between(birthday, LocalDate.now())
}