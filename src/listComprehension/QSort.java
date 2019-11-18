package listComprehension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QSort {
    public static void main(String[] args) {

        Integer[] integers = new Integer[]{3,5,8,4,6,1,9,2,7};
        System.out.println(qsort(Arrays.asList(integers)));

    }

    public static List<Integer> qsort(List<Integer> list){
        if (list.size() <= 1) return list;

        Integer pivot = list.remove(0);
        List<Integer> lesser;
        List<Integer> greater;

        lesser = list.stream()
                .filter(n -> n <= pivot)
                .collect(Collectors.toList());
        greater = list.stream()
                .filter(n -> n > pivot)
                .collect(Collectors.toList());

        lesser = qsort(lesser);  greater = qsort(greater);

        // List Concatenation
         lesser.add(pivot);  lesser.addAll(greater);
         return lesser;

        // Concatenation using stream
        // concat is a stactic method
//        lesser.add(pivot);
//        Stream<Integer> combined
//                = Stream.concat(lesser.stream(), greater.stream());
//        return combined.collect(Collectors.toList());
    }
}
