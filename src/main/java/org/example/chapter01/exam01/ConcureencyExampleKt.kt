package org.example.chapter01.exam01

fun main() {
    val cpuCore = Runtime.getRuntime().availableProcessors() + 1
    println("내 CPU CORED 개수 : $cpuCore")

    val data = mutableListOf<Int>()
    for (i in 0 until cpuCore) {
        data.add(i)
    }

    val startTime2 = System.currentTimeMillis()
    val sum2 = data.parallelStream().mapToLong {
        try {
            Thread.sleep(500)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        (it * it).toLong()
    }.sum()

    val endTime2 = System.currentTimeMillis()

    println("CPU 개수를 초과하는 데이터를 병령로 처리하는 데 걸린 시간: ${endTime2 - startTime2} ms")
    println("결과 : $sum2")

}
