package beginAgain

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val var1 = scanner.nextInt();

    val var2 = if(var1 >= 0) 20 else -20

    println(var2)
}