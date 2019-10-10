/*
 * Haskell Code
 * data Exp = Num Int | Plus Exp Exp | Mul Exp Exp
 *  eval :: Exp -> Int
 *  eval (Num x)     = x
 *  eval (Sum x y)   = eval x + eval y
 *  eval (Mul x y)   = eval x * eval y
 *
 *  e2 = Sum (Num 1) (Mul (Num 2) (Num 3))   // 1 + 2 * 3 AST
 *  main = print $ eval e2
 */

internal interface Exp {
    fun eval(): Int         // public
}

internal class Num(var number: Int) : Exp {
    override fun eval(): Int {
        return this.number
    }
}

internal class Plus(var left: Exp?, var right: Exp?) : Exp {
    override fun eval(): Int {
        return left!!.eval() + right!!.eval()
    }
}

internal class Mul(var left: Exp?, var right: Exp?) : Exp {
    override fun eval(): Int {
        return left!!.eval() * right!!.eval()
    }
}

object ExpEval {
    @JvmStatic
    fun main(args: Array<String>) {
        // 1 + 2 * 3
        val e = Plus(
            Num(1),
            Mul(Num(2), Num(3))
        )

        val result = e.eval()
        println(result)
    }
}

