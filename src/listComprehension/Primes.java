package listComprehension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Primes {
    public static void main(String[] args) {
        System.out.println(isPrime(1223));
        System.out.println(rangePrimes(30).toString());



    }
    public static boolean isPrime(int num){
        return IntStream.range(2, num).noneMatch(x -> num % x == 0);
    }

    public static List<Integer> rangePrimes(int num){
        return IntStream.rangeClosed(2, num)
                .filter(Primes::isPrime)
                .boxed()
                .collect(Collectors.toList());
    }
}
