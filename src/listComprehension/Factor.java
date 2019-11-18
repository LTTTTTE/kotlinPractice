package listComprehension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Factor {
    public static void main(String[] args) {
        System.out.println(factors(15).toString());
    }

    private static List<Integer> factors(int num){
        return IntStream.rangeClosed(1,num).filter(x-> num % x == 0)
                .boxed().collect(Collectors.toList());
    }
}
