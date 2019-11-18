package test;

import java.util.function.*;
public class Functional {

    private Function<Integer, Function<Integer,Integer>> add2 = x -> y -> x+y;
    //add2는 반환형이 Integer 이고
    //파라메터(2개)의 자료형은 함수이다.
    //그런데 그함수는 Integer 받아 Integer 보내는 함수이다.
    private Function<Integer, Function<Integer,Integer>> f() { return add2; }
    //
    private Function<Integer,Integer> f1(Integer x) { return f().apply(x); }

    private Integer f2(Integer x, Integer y) { return f1(x).apply(y); }

    public static void main(String[] args) {
        Functional x = new Functional();
        System.out.println( x.add2.apply(10).apply(20));
        System.out.println(x.f().apply(10).apply(20));
        System.out.println(x.f1(10).apply(20));
        System.out.println(x.f2(10,20));

    }
}
