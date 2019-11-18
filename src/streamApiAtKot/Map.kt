package streamApiAtKot

fun main():Unit{

    val list = listOf(1,2,3,4,5,6,7,8,9,10)
    println(list)
    val mapped = list.map { i -> inc(i) }
    println(mapped)
    val filtered = list.filter { it % 2 == 0 }
                                        //x -> x % 2 == 0와 같음
    println(filtered)

    list.map { x -> x + 100 }
        .filter { x -> x % 2 != 0 }
        .groupBy { x-> x < 105 }
        .values.flatten()
        .forEach(::println)

}

fun inc(x : Int) : Int{
    return x + 1;
}