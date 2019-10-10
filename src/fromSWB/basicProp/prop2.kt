package fromSWB.basicProp

class Person(val name:String, var isMarried: Boolean)

fun main (args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name)                    // call getter
    println(person.isMarried)               // call getter
    person.isMarried = false                // call setter
    println(person.isMarried)               // call getter
}