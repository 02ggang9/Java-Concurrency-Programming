package org.example.chapter02.exam02

fun main() {
    for(i in 1..3) {
        val thread = Thread(MyRunnable1(i))
        thread.start()
    }
}

class MyRunnable1(
    private val threadId: Int,
) : Runnable {

    override fun run() {
        println("${Thread.currentThread().name} : 쓰레드 실행 중..")
        firstMethod(threadId)
    }

    fun firstMethod(threadId: Int) {
        val localValue = threadId + 100
        secoundMethod(localValue)
    }

    fun secoundMethod(localValue: Int) {
        val objectReference = "${this.threadId} Hello World"
        println("${Thread.currentThread().name} : 스레드 ID : ${this.threadId}, Value: $localValue")
    }
}