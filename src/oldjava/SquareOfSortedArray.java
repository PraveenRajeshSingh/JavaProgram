package oldjava;

import java.util.Arrays;

// input: num= [-4,-1,0,3,10]
// output: [0,1,9,16,100]
public class SquareOfSortedArray {

    private static int[] sortedSquare (int[] num) {
        int[] result = new int[num.length];
        int start = 0;
        int end = num.length - 1;
        int ptr = result.length - 1;
        while (start <= end) {
            int startSquare = num[start] * num[start];
            int endSquare = num[end] * num[end];
            if ( startSquare > endSquare ) {
                result[ptr] = startSquare;
                start++;
            } else {
                result[ptr] = endSquare;
                end--;
            }
            ptr--;
        }
        return result;
    }

    public static void main (String[] args) {
        int[] num = { -4, -1, 0, 3, 10 };
        int[] results = sortedSquare(num);
        System.out.println("Sorted Square :" + Arrays.toString(results));


    }
}
