package bubbleSort;

import java.util.Arrays;

public class SortArrayAscending {

    private static int[] sortArrayAscending (int[] arr) {

        for ( int i = 0; i < arr.length - 1; i++ ) {
            for ( int j = 0; j < arr.length - 1 - i; j++ ) {
                if ( arr[j] > arr[j + 1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        return arr;
    }

    private static int[] sortArrayDescending (int[] arr) {

        for ( int i = 0; i < arr.length - 1; i++ ) {
            for ( int j = 0; j < arr.length - 1 - i; j++ ) {
                if ( arr[j] < arr[j + 1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] arr = { 3, 6, 5, 8, 2, 9, 1 };
        int[] result = sortArrayAscending(arr);
        System.out.println("Sort Array Ascending Order :" + Arrays.toString(result));
        int[] descending = sortArrayDescending(arr);
        System.out.println("Sort Array in descending :" + Arrays.toString(descending));

    }
}
