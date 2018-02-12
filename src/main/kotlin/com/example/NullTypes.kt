package com.example

fun main(args: Array<String>) {
    val myNull: String? = null

    if (myNull != null) {
        val length = myNull.length
    }

    val length = myNull?.length

    val lenghtWithDefault = myNull?.length ?: 0

    val lengthError = myNull!!.length //null pointer exception

}