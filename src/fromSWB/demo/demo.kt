package fromSWB.demo

data class Person(val name: String, val age : Int? = null)

fun main(){
    val persons = listOf(Person("Alice",115), Person("Bob",20))

    val oldest = persons.maxBy { it.age?: throw Throwable().fillInStackTrace() }
    val test = persons.maxBy { person -> person.age ?: 0 }
    val test2 = persons.maxBy(Person::name)
    println("OLDEST : $oldest")
}