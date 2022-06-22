package com.bezkoder.kotlin.fold
fun main() {
    println(listOf(1, 2, 3, 4, 5).fold(10) { total, item -> total + item })
    // 15
    println(listOf(1, 2, 3, 4, 5).foldRight(0) { item, total -> total + item })
    // 15
    println(listOf(1, 2, 3, 4, 5).fold(1) { mul, item -> mul * item })
    // 120
    println(listOf(1, 2, 3, 4, 5).foldRight(1) { item, mul -> mul * item })
    // 120
    println(listOf(0, 1, 2, 3, 4, 5)
        .foldIndexed(0) { index, total, item -> if (index % 2 == 0) (total + item) else total })
    // 6
    println(listOf(0, 1, 2, 3, 4, 5)
        .foldRightIndexed(0) { index, item, total -> if (index % 2 == 0) (total + item) else total })
    // 6
    val list_1 = mutableListOf(1,2,3,4,5)
    println(list_1.fold(10){result, item -> result+item})



}
