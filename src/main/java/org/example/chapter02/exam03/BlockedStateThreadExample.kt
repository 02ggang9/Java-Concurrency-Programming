package org.example.chapter02.exam03

fun main() {
    val lock = Object()
    val thread1 = Thread {
        synchronized(lock) {
            while (true) {

            }
        }
    }

    val thread2 = Thread {
        synchronized(lock) {
                println("Thread 2 실행 중")
        }
    }

    thread1.start()
    Thread.sleep(100)
    thread2.start()
    Thread.sleep(100)
    println("스레드 2 상태: ${thread2.state}")
}