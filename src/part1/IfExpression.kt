package part1

import java.util.concurrent.ThreadLocalRandom

fun main():Unit{
    val number1 = ThreadLocalRandom.current().nextInt(1, 100)
    val number2 = ThreadLocalRandom.current().nextInt(1, 100)

    val myString = if(number1 > number2){
        println("number1이 number2보다 크므로")
        "으하하 number1이 크다"
    } else {
        println("number1이 number2보다 작으므로")
        "뿌엑 number2 가 더 크다"
    }

    println(myString)

    println("\n")
    println("if else 가 모두 갖춰져 있으면 표현식으로 사용가능하다.")
    println("변수나 상수에 저장할수있다.")
}