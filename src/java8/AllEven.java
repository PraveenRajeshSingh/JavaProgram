package java8;

import java.util.Arrays;
import java.util.List;

public class AllEven {

    public static void main (String[] args) {
        List< Integer > num = Arrays.asList(1, 4, 5, 7, 8, 5, 32, 2);
        Boolean allEven = num.stream().allMatch(n -> n % 2 == 0);
        System.out.println(allEven);

    }
}
