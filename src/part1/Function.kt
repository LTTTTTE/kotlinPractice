package part1

fun main():Unit{

    val func1 = func1()
    println("func1 Supplied : $func1")

    hr()

    val func2 = func2()

    hr()

    val func3 = func3(10)

    hr()

    val func4 = func4(10.3F,20.9)
    println("func4 result : $func4")

}

fun hr(): Unit{
    println("----------------------------------------------------")
}

fun func1():Int{
    println("func1은 Int Supplier 함수 ")
    return 190
}

fun func2():Unit{
    println("func2는 Runnable 함수")
    println("꾸엑꾸엑")
}

fun func3(arg1:Int):Unit{
    println("func3는 Consumer 함수")
    var index = arg1

    while (index-- >0){
        print("*")
    }
    println()
}

fun func4(arg1:Float , arg2:Double):Int{
    println("func4는 Function 함수")
    return (arg1 + arg2).toInt()
}
