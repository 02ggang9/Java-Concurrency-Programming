package org.example.chapter02.exam03

fun main() {
    val thread = Thread {
        try {
            Thread.sleep(10000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

    thread.start()
    Thread.sleep(100)
    println("스레드 상태: ${thread.state}")
}