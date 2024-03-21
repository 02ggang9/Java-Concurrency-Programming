package org.example.chapter02.exam03

fun main() {
    val lock = Object()
    val thread = Thread {
        synchronized(lock) {
            try {
                lock.wait()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }

    thread.start()
    Thread.sleep(100)
    println("스레드 상태: ${thread.state}")
}
