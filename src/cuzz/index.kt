package cuzz
import  java.sql.*
import  java.sql.DriverManager

fun main(args: Array<String>) {
    val driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
    var dbURL = "jdbc:sqlserver://zsj439453290.zicp.net:5562;DatabaseName=Together"
    val userName = "sa"
    val userPwd = "!dd19881221"
    try {
        Class.forName(driverName)
        val dbConn :Connection = DriverManager.getConnection(dbURL, userName, userPwd)
        println("连接数据库成功")

    } catch (e: Exception) {
        e.printStackTrace()
        print("连接失败")

    }

}