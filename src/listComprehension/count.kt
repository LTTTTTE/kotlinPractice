package listComprehension

fun main() : Unit {
    println(count('i', "Mississippi"));
    println(countRec('s', "Mississippi"))
}

fun count(char: Char, string: String) : Int {
    return string.filter { it == char }.count()
}

fun countRec(char: Char, string: String) : Int {
    if(string.length < 2){
        return 0;
    }

    return if(string.first() == char){
        countRec(char, string.drop(1)) + 1
    } else {
        countRec(char, string.drop(1))
    }
}