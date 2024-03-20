package org.example.chapter02

fun main() {
    Thread {
        println("${Thread.currentThread().name} : 쓰레드 실행 중..")
    }.start()
}