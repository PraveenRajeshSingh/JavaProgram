package oldjava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxMinNumber {

    private static void minMaxNumber (int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for ( int i : arr ) {
            if ( i > max ) max = i;
            if ( i < min ) min = i;
        }
        System.out.println("Max :" + max + "  Min :" + min);
    }

    public static void main (String[] args) {
        int[] arr = { 1, 3, 2, 6, 8, 3, 9 };
        minMaxNumber(arr);

        int target = 3;

        int maxIndex = IntStream.range(0, arr.length)
                .reduce((i, j) -> arr[i] > arr[j] ? i : j)
                .orElse(-1);
        System.out.println("Max Index :" + maxIndex);

        int minIndex = IntStream.range(0, arr.length)
                .reduce((i, j) -> arr[i] < arr[j] ? i : j)
                .orElse(-1);
        System.out.println("Min Index :" + minIndex);

        List< Integer > allTargetIndex = IntStream.range(0, arr.length)
                .filter(t -> arr[t] == target)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("All Target Indexs :" + allTargetIndex);
    }
}
