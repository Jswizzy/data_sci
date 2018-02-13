package com.example

import java.sql.DriverManager
import java.time.LocalDate

fun main(args: Array<String>) {
    val customerId = 1

    val conn = DriverManager.getConnection("jdbc:sqlite:~/usr/my-database.db")

    //avoids sql injection
    val ps = conn.prepareStatement("SELECT * FROM CUSTOMER_ORDER WHERE CUSTOMER_ID = ?")
    ps.setInt(1, customerId)
    val rs = ps.executeQuery()

    val orders = mutableListOf<CustomerOrder>()

    while (rs.next()) {
        orders += CustomerOrder(
                rs.getInt("CUSTOMER_ORDER_ID"),
                rs.getInt("CUSTOMER_ID"),
                LocalDate.parse(rs.getString("ORDER_DATE")), //sqlite has no dates
                rs.getInt("PRODUCT_ID"),
                rs.getInt("QUANTITY")
        )
    }
    ps.close()
}