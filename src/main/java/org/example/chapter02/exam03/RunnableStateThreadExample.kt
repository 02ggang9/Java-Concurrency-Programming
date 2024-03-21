package org.example.chapter02.exam03

fun main() {
    val thread = Thread {
        while (true) {
            for (i in 0 until 1000000000) {
                if (i % 1000000000 == 0) {
                    println("스레드 살태 ${Thread.currentThread().state}")
                }
            }
        }
    }

    thread.start()
}