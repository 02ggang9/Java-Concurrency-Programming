package org.example.chapter02.exam01

fun main() {
    val myThread = MyThread()
    myThread.start()
}

class MyThread : Thread() {
    override fun run() {
        println("${Thread.currentThread().name} : 쓰레드 실행 중..")
    }
}