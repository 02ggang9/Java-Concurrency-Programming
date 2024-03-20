package org.example.chapter01.exam02

fun main() {
    val thread1 = Thread {
        for (i in 0 until 5) {
            println("Thread 1: $i")
            try {
                Thread.sleep(1)
            } catch (e: InterruptedException) {
                throw RuntimeException(e)
            }
    }}

    val thread2 = Thread {
        for (i in 0 until 5) {
            println("Thread 2: $i")
            try {
                Thread.sleep(1)
            } catch (e: InterruptedException) {
                throw RuntimeException(e)
            }
    }}

    val thread3 = Thread {
        for (i in 0 until 5) {
            println("Thread 3: $i")
            try {
                Thread.sleep(1)
            } catch (e: InterruptedException) {
                throw RuntimeException(e)
            }
    }}

    thread1.start()
    thread2.start()
    thread3.start()
}