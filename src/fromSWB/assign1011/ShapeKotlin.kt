package fromSWB.assign1011

import java.lang.IllegalArgumentException

interface Shape

class Triangle(val base : Double, val height : Double) : Shape
class Rectangle(val base : Double, val height : Double) : Shape
class Circle(val radius : Double) : Shape

fun size(s : Shape): Double =
    when (s) {
        is Triangle -> s.base * s.height * 0.5
        is Circle -> s.radius * s.radius * 3.141592
        is Rectangle -> s.base * s.height
        else -> throw IllegalArgumentException()
    }

fun main(){
    val shape1 = Circle(5.4)
    val shape2 = Triangle(12.1,3.7)
    val shape3 = Rectangle(7.7, 4.1)

    println(size(shape1))
    println(size(shape2))
    println(size(shape3))
}