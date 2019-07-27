package part1

const val variable = 10

fun main():Unit{
    val variable = 50
    println("메인이오 : $variable")
    func()
}

fun func():Unit{
    println("메인밖의 함수요 : $variable")
}


// 변수 이름 중복시 가장 가까운 스코프 내의 변수를 사용한다.