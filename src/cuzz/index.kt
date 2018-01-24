package cuzz

import java.sql.*
import java.sql.DriverManager
import todo.pado.Xiz
import todo.pado.Xpact

fun main(args: Array<String>) {
    val driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
    var dbURL = "jdbc:sqlserver://zsj439453290.zicp.net:5562;DatabaseName=Together"
    val userName = "sa"
    val userPwd = "!dd19881221"
    try {
        Class.forName(driverName)
        val dbConn: Connection = DriverManager.getConnection(dbURL, userName, userPwd)
        println("连接数据库成功")

    } catch (e: Exception) {
        e.printStackTrace()
        print("连接失败")

    }

    var x: Int
    if (1 == 1) {
        x = 10
    } else if (1 != 2) {
        x = 8
    }


    val a: (Int) -> Int = {
        it + 2
    }

    a(2)

    val expr: (Int, Int) -> Int = { x: Int, y: Int ->
        val c = x + 1
        c + y;
    }

    println(expr(3, 4))

    val exprarray: (IntArray) -> Int = { list ->
        list[0] = 123
        var copylist = list.clone()
        copylist[0]
    }


    println(exprarray(intArrayOf(1, 2)))

    var exprobject: (Dog) -> Unit = { d ->
        d.clone()
        d.access()
        d.caluate()
        d.due()
        d.yarn()
    }


    exprobject(Dog("happy"))

}


class Dog(val name: String) : Cloneable, Animal, Xpact, Xiz() {

    override public fun yarn(): Int {
        return 0
    }

    override fun due(): Int = 0

    override fun caluate(): Int {
        return 0
    }

    fun access(): String {
        return "abc"
    }

    override public fun clone(): Any {
        return super.clone()
    }

}

interface Animal {
    fun caluate(): Int
}





