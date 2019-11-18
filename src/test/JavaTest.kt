package test

fun main():Unit{
    println("hi")

    //val sum : (Int) -> ((Int)->Int) = {x:Int -> {y:Int -> x+ y}}
    val sum = {x:Int,y:Int ->x + y}
    print(sum(1,2))
}
