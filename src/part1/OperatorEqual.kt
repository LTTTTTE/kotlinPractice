package part1

fun main():Unit{

    var a = "hi"
    var b = "Hello"
    var c = "hi"

    var d = 10-5
    var e = 5

    println(a===b)
    println(a===c)

    println(a==b)
    println(a==c)

    println(d==e)
}

// == 이 === 의 기능을 포함 하고 있기에
// ==만 써도 되겠다.(java equals 와 같다)