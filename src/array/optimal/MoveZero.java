package array.optimal;

import java.util.Arrays;

public class MoveZero {

    private static int[] moveZeroRight (int[] num) {

        int j = 0;
        for ( int i = 0; i < num.length; i++ ) {
            if ( num[i] != 0 ) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }
        return num;
    }

    private static int[] moveZeroToLeft (int[] num) {
        int j = num.length - 1;
        for ( int i = num.length - 1; i >= 0; i-- ) {
            if ( num[i] != 0 ) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j--;
            }
        }
        return num;
    }

    public static void main (String[] args) {
        int[] arr = { 1, 3, 0, 2, 0, 6 };

        int[] right = moveZeroRight(arr);
        System.out.println("Move Zero Right :" + Arrays.toString(right));

        int[] left = moveZeroToLeft(arr);
        System.out.println("MoveZero to Left :" + Arrays.toString(left));

    }
}
