package part1

fun main():Unit{

    val variable = 0

    fun localFunc1(variable:Int):Unit{
        println(variable+100)
    }

    fun localFunc2(variable:Int):Unit{

        fun localFunc3(variable:Int):Unit{
            println(variable+10000)
        }

        localFunc1(variable+1000)
        localFunc3(variable+1000)

    }

    localFunc1(variable)
    localFunc2(variable)

}

//함수안에 함수가 선언가능?