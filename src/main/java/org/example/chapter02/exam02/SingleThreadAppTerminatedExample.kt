package org.example.chapter02.exam02

fun main() {

    var sum = 0;

    for(i in 0 until 1000) {
        sum += i
    }

    println("Sum : $sum")
    println("메인 스레드 종료")
}