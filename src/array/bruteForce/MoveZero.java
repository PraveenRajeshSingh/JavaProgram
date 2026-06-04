package array.bruteForce;

import java.util.Arrays;

public class MoveZero {

    public static int[] moveZeroToRight (int[] arr) {
        int[] right = new int[arr.length]; // default all 0
        int index = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] != 0 ) {
                right[index] = arr[i];
                index++;
            }
        }
        return right;
    }

    public static int[] moveZeroToLeft (int[] arr) {
        int[] left = new int[arr.length]; // default all 0
        int index = arr.length - 1;
        for ( int i = arr.length - 1; i >= 0; i-- ) {
            if ( arr[i] != 0 ) {
                left[index] = arr[i];
                index--;
            }
        }
        return left;
    }

    //Two Pointer approach:
    private static int[] moveZeroLeft (int[] arr) {
        int index = arr.length - 1;
        for ( int i = arr.length - 1; i >= 0; i-- ) {
            if ( arr[i] != 0 ) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index--;
            }
        }
        return arr;
    }

    private static int[] moveZeroRight (int[] arr) {
        int index = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] != 0 ) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] arr = { 1, 3, 0, 2, 0, 6 };

        int[] leftNum = moveZeroToLeft(arr);
        System.out.println("Move Zero To Left :" + Arrays.toString(leftNum));

        System.out.print("Move Zero Right :");
        int[] num = moveZeroToRight(arr);
        for ( int n : num ) {
            System.out.print(n + " ");
        }
        System.out.println();
        //Two Pointer approach:
        int[] moveToLeft = moveZeroLeft(arr);
        System.out.println("Two Pointer Move Zero To Left :" + Arrays.toString(moveToLeft));
    }
}
