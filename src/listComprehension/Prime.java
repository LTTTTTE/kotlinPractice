package listComprehension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(1223));
        System.out.println(rangePrimes(30).toString());
    }
    public static boolean isPrime(int num){
        return IntStream.range(2, num).filter(x -> num % x == 0).count() == 0;
    }
    public static List<Integer> rangePrimes(int num){
        return IntStream.rangeClosed(2, num).filter(Prime::isPrime)
                .boxed().collect(Collectors.toList());
    }
}
