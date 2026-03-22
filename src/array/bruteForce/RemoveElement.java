package array.bruteForce;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement (int[] arr, int val) {
        int index = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] != val ) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    public static void main (String[] args) {
        int[] num = { 2, 4, 6, 5 };
        int k = 2;
        removeElement(num, k);

        System.out.println("Array after removal: " + Arrays.toString(num));
    }
}
