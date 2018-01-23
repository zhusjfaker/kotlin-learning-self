package cuzz

import kotlinx.coroutines.experimental.*
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    val x = test()
    println(x)
    println(".....ending....")
//    Thread.sleep(5000L)
}


fun test() = runBlocking {
    var a: Int = 0;
    var task = launch(CommonPool) {
        delay(3000L, TimeUnit.MICROSECONDS)
        println(".....begin....")
        a = doSomething()
    }
    var k = async(CommonPool) {
        var a = doSomething()
        print()
    }
    var m = k.await()
    task.join()
    m
}

suspend fun doSomething(): Int = 1
suspend fun print(): String = "abc"


fun <T> async(block: suspend () -> T) {
}
