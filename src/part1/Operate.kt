package part1

fun main():Unit{
    val int = 100
    val double = 12.2
    val float = 11.1F
    val predicate = false
    val nullType = null

    val idk = double + float
    val idk2 = int + double
    val idk3 = int + float
    val idk4 = !predicate
    val idk5 = nullType + predicate
    val idk6 = nullType
    val idk7 = nullType + int

    println("double + float : " + idk.javaClass.name)
    println("int + double : "+idk2.javaClass.name)
    println("int + float : "+idk3.javaClass.name)
    println("!predicate(false) : "+idk4.javaClass.name)
    println("nullType + predicate : "+idk5.javaClass.name)
    println("nullType : $idk6")
    println("nullType + int : "+idk7.javaClass.name)

    val intToDouble = int.toDouble()
    val doubleToInt = double.toInt()

}