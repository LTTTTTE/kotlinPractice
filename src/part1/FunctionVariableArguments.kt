package part1

import java.util.concurrent.ThreadLocalRandom
import java.util.stream.Stream

fun main():Unit{

    val random = ThreadLocalRandom.current().nextInt().toLong()

    val stream = ThreadLocalRandom.current().ints(1, 100)
        .limit(random)
        .boxed()

    func(stream);
}
fun func(vararg numbers: Stream<Int>) {
    var sum:Int = 0
    val arrayOfStreams: Array<*> = numbers
    //미완성
}

