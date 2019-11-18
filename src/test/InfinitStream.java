package test;

import listComprehension.Prime;

import java.util.stream.IntStream;

public class InfinitStream {
    public static void main(String[] args) {
        IntStream.iterate(2, i -> i + 1).filter(Prime::isPrime).limit(20000)
                .forEachOrdered(System.out::println);
    }
}
