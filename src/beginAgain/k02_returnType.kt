package beginAgain

import part1.func

fun main() {
    println(func1())
    println(func2())
    println(func3(func3(func3(func3(func3(1))))));
}
// func1 = () -> Int
fun func1():Int{
    return 1
}
// func2 = () -> String
fun func2():String{
    return "hello"
}

// func3 = (Int) -> Int
fun func3(var1 : Int):Int{
    return var1 + 1
}