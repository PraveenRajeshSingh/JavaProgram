package java8;

import java.util.Comparator;
import java.util.List;

public class SecondHighestNum {
    public static void main (String[] args) {
        List< Integer > num = List.of(1, 3, 5, 7, 2, 4, 9);
        int result = num.stream().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(0);
        System.out.println("Second Highest :" + result);
    }
}
