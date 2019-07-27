package part1

import java.util.concurrent.ThreadLocalRandom
import java.util.stream.Stream

fun main():Unit{

    println(func(1,2,3,4,5,6,7,8,9))
    println(func(1,3,4,6,1,7,65,43,3,456,78,76,54,3))
    println(func(1,2,3))
}
fun func(vararg numbers:Int):Int{
    var sum = 0
    for(i in numbers){
        sum += i
    }
    return sum
}

//vararg 로 N개의 인수를 받을수있다.

