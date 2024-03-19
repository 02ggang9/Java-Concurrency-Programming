package org.example.chapter01.exam01

fun main() {
    val cpuCores = Runtime.getRuntime().availableProcessors()

    val data = mutableListOf<Int>()
    for (i in 0 until cpuCores) {
        data.add(i)
    }

    val startTime = System.currentTimeMillis()
    val sum = data.parallelStream().mapToLong {
        try {
            Thread.sleep(500)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        (it * it).toLong()
    }.sum()

    val endTime = System.currentTimeMillis()

    println("Time taken to process data in parallel: ${endTime - startTime} ms")
    println("Result: $sum")
}