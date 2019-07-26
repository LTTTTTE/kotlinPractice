package part1

fun main():Unit{

    var i = 50
    Out@ while(i-- > 0){

        var j = 6
        while(j-- > 0){

            if(j == 1){
                println("j가 1이되었성")
                break@Out
            }
        }
    }

    println("2중 반복문을 @Label 로 빠져나올수있다.")
}