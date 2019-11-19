package listComprehension;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda {

    private final BiFunction<Character, String, Integer> biFuncCountRec = (ch, str) ->{
        if(str.length() < 1){
            return 0;
        }
        return str.charAt(0) == ch
                ? this.biFuncCountRec.apply(ch, str.substring(1)) + 1
                : this.biFuncCountRec.apply(ch, str.substring(1));
    };

    public static void main(String[] args) {
        Lambda lambda = new Lambda();

        BiFunction<Character, String, Integer> biFuncCount = (ch, str) ->
                (int) str.chars().mapToObj(x -> (char) x)
                        .filter(x -> x == ch)
                        .count();

        System.out.println(biFuncCount.apply('s', "Mississippi"));
        System.out.println(lambda.biFuncCountRec.apply('i', "Mississippi"));

        Function<Integer, List<Integer>> funcFactors = x ->
                IntStream.rangeClosed(1,x).filter(z -> x % z == 0).boxed().collect(Collectors.toList());
        System.out.println(funcFactors.apply(24).toString());

        Predicate<Integer> predicateIsPrime = x -> IntStream.range(2, x).noneMatch(z -> x % z == 0);
        System.out.println(predicateIsPrime.test(1153));

        Function<Integer, List<Integer>> funcPrimes = x ->
                IntStream.rangeClosed(2, x)
                        .filter(Primes::isPrime)
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println(funcPrimes.apply(50));
    }
}
