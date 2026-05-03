package array.bruteForce;

import java.util.Arrays;

public class MoveZero {
    public static int[] moveZeroToRight (int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] != 0 ) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static int[] moveZeroToLeft (int[] arr) {
        int[] left = new int[arr.length];
        int index = arr.length - 1;
        for ( int i = arr.length - 1; i >= 0; i-- ) {
            if ( arr[i] != 0 ) {
                left[index] = arr[i];
                index--;
            }
        }
        return left;
    }

    public static void main (String[] args) {
        int[] arr = { 1, 3, 0, 2, 0, 6 };
        int[] num = moveZeroToRight(arr);
        int[] leftNum = moveZeroToLeft(arr);

        System.out.println("Move Zero To Left :" + Arrays.toString(leftNum));

        System.out.print("Move Zero Right :");
        for ( int n : num ) {
            System.out.print(n + " ");
        }
        System.out.println("Move Zero Right :" + Arrays.toString(num));

    }
}
