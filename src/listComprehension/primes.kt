package listComprehension

fun main() : Unit {
    println(factors(20))
    println(isPrime(2))
    println(primes(100))

    val list = listOf(3,5,8,4,7,1,9,2,6)
    val sortedList = listOf(1,2,3,4,5,6,7,7,8,9)
    println(pairs(list))
    println(isSorted(list))
    println(isSorted(sortedList))
}

fun factors(n : Int) : List<Int> {
    return (1..n).filter { x -> n % x == 0 }.toList()
}

fun isPrime(n : Int) : Boolean {
    return (2 until n).all{ x -> n % x != 0 }
}

fun primes(n : Int) : List<Int> {
    return (2..n).filter { isPrime(it) }.toList()
}

fun pairs(list : List<Int>) : List<Pair<Int, Int>> {
    return list.zipWithNext()
}

fun isSorted(list : List<Int>) : Boolean {
    return pairs(list).map { it.first <= it.second }.all { it }
}