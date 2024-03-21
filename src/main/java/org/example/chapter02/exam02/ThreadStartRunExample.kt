package org.example.chapter02.exam02

fun main() {
    val myRunnable = MyRunnable()
    val thread = Thread {
        println("${Thread.currentThread().name} : 쓰레드 실행 중..")
    }

    thread.start()
//    thread.run()
    myRunnable.run()
}

class MyRunnable: Runnable {
    override fun run() {
        println("${Thread.currentThread().name} : 쓰레드 실행 중..")
    }
}


