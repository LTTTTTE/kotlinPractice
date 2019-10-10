package fromSWB.basicProp
class Address {
    var name = "Kotlin: " + "Addr1"
}

class Address2 {
    var name: String = "Kotlin2: "
    get() {
        return field + "Addr2"
    }
    set(value) {
        if (value == "a") field = "b" else field = value
    }
}

fun main (args: Array<String>) {
    val addr1 = Address()
    val addr2 = Address2()

    println("addr1.name: ${addr1.name}")
    println("addr2.name: ${addr2.name}")
    addr2.name = "a"                         // call set("a") for name in Addresss2
    println("addr2.name: ${addr2.name}")
}