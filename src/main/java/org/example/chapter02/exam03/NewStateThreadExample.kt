package org.example.chapter02.exam03

fun main() {
    val thread = Thread {
        println("스레드 실행 중")
    }

    println("스레드 상태: ${thread.state}")
}