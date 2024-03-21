package org.example.chapter02.exam01

fun main() {
    Thread(MyRunnable()).start()
}

class MyRunnable : Runnable {
    override fun run() {
        println("${Thread.currentThread().name} : 쓰레드 실행 중..")
    }
}