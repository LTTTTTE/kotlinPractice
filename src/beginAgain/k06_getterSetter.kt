package beginAgain

data class Data(var name : String, var age : Int){
//    이런게 data 로 선언된  클래스는 컴파일시에 아래작업이 추가적으로 수행
//
//    인스턴스간 비교를 위한 equals() 자동생성
//    Hash 기반 container 에서 키로 사용할 수 있도록 hashCode() 자동 생성
//    property 순서대로 값을 반환해 주는 toString() 자동생성

}
class Foo(id: Int, name: String) {
    var id = id
        private set

    var name = name
        private set

    override fun toString(): String = "Foo(id=$id, name='$name')"
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {

}

