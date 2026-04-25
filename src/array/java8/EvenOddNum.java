package array.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddNum {
    public static void main (String[] args) {

        List< Integer > num = Arrays.asList(1, 3, 2, 4, 5, 7, 6, 8, 9);

        Map< Boolean, List< Integer > > evenOdd = num.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even Num :"+evenOdd.get(true));
        System.out.println("Odd Num :"+evenOdd.get(false));

        System.out.println(evenOdd);

        Map< String, List< Integer > > result = num.stream()
                .collect(Collectors.groupingBy(
                        n -> n % 2 == 0 ? "even" : "odd"
                ));
        System.out.println(result);

        Map< String, List< Integer > > evenOdds = num.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey() ? "even" : "odd", Map.Entry::getValue));

        System.out.println(evenOdds);
    }
}
