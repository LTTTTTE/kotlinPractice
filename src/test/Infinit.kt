package test

fun main():Unit{
    val limit = 50;
    generateSequence(0) { i -> i + 2 }
        .take(limit)
        .forEach { println(it) }
}