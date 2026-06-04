package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MargeAndSortRemoveDuplicate {
    public static List< Integer > margeSort (List< Integer > arr1, List< Integer > arr2) {

        List< Integer > result = Stream.concat(arr1.stream(), arr2.stream())
                .distinct().sorted().collect(Collectors.toList());
        return result;
    }

    public static void main (String[] args) {
        List< Integer > arr1 = Arrays.asList(3, 5, 7, 2, 4);
        List< Integer > arr2 = Arrays.asList(3, 6, 8, 4, 1, 4);
        List< Integer > output = margeSort(arr1, arr2);
        System.out.println(output);
    }
}
