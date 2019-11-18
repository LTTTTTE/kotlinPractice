package test;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingTest {
    public static void main(String[] args) {
        Stream<Integer> numbers = ThreadLocalRandom.current()
                .ints(1, 100).limit(200).boxed();



        filterCountAndSorting(numbers);
    }

    private static void allCounting(Stream<Integer> numbers){
        numbers.collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .forEach((a,b)->{
                    System.out.println(a + "는"+ b + "개");
                });
    }

    private static void filterCounting(Stream<Integer> numbers){
        numbers.collect(Collectors.partitioningBy(x->x%2==0,Collectors.groupingBy(x->x,Collectors.counting())))
                .forEach((a,b)->{
                    System.out.println("짝수가"+ a + "인"+ b + "개");
                });
    }

    private static void filterCountAndSorting(Stream<Integer> numbers){
        Map<Boolean, Map<Integer, Long>> collect = numbers.collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.groupingBy(x -> x, Collectors.counting())));
        collect.forEach((a,b)->{
            b.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        });
    }
}
