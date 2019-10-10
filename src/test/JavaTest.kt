package test

import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*
import java.util.concurrent.ThreadLocalRandom

fun main():Unit{
    println("hi")


    ThreadLocalRandom.current().ints(1,100)
        .limit(50).boxed().forEach(System.out::println)

}