package part1

fun main():Unit{

    val person = object{
        var name = "이름1"
        var age = 13
    }
    
    person.age = 10
    person.name = "이이름"
    println(person.age)
    println(person.name)
}

// object 키워드로 관련있는 변수를 한곳에 묶을수 있다.
// getter setter 가 장착 되어있다.
// 내부변수들을 property 라고한다.
// property 값들은 선언과 동시에 초기화 되어야 한다.
