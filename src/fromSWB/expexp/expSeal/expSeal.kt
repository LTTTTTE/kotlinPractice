/*  Haskell Code
 *  data Exp = Num Int | Sum Exp Exp | Mul Exp Exp
 *
 *  eval :: Exp -> Int
 *  eval (Num x)     = x
 *  eval (Sum x y)   = eval x + eval y
 *  eval (Mul x y)   = eval x * eval y
 *
 *  e2 = Sum (Num 1) (Mul (Num 2) (Num 3))   // 1 + 2 * 3 AST
 *  main = print $ eval e2
 */
package fromSWB.expexp.expSeal

sealed class Exp {
  class Num(val value: Int) : Exp()
  class Sum(val left: Exp, val right: Exp) : Exp()
  class Mul(val left: Exp, val right: Exp) : Exp()
}

fun eval(e: Exp): Int =
    when (e) {
        is Exp.Num -> e.value
        is Exp.Sum -> eval(e.right) + eval(e.left)
        is Exp.Mul -> eval(e.right) * eval(e.left)
    }

fun main(args: Array<String>) {
    val e1 = Exp.Sum(Exp.Sum(Exp.Num(1), Exp.Num(2)), Exp.Num(3)) // 1+2+3
    val e2 = Exp.Sum(Exp.Num(1), Exp.Mul(Exp.Num(2), Exp.Num(3))) // 1+2*3
    println(eval(e1))
    println(eval(e2))
}
