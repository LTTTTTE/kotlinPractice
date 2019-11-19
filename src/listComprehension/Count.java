package listComprehension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Count {

    public static int count(char ch, String str){
        return (int) str.chars().mapToObj(x -> (char) x)
                .filter(x -> x == ch)
                .count();
    }
    public static int countRec(char ch, String str){
        if(str.length() < 1){
            return 0;
        }

        return str.charAt(0) == ch
                ? countRec(ch, str.substring(1)) + 1
                : countRec(ch, str.substring(1));
    }

    public static List<Integer> factors(int num){
        return IntStream.rangeClosed(1,num).filter(x-> num % x == 0)
                .boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(count('s',"Mississippi"));
        System.out.println(countRec('i',"Mississippi"));
        System.out.println(factors(15).toString());
    }
}
