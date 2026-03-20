package array.optimal;

import java.util.Arrays;

public class MoveZero {

    private static int[] moveZeroRight (int[] num) {

        int left = 0;
        for ( int right = 0; right < num.length; right++ ) {
            if ( num[right] != 0 ) {
                int temp = num[right];
                num[right] = num[left];
                num[left] = temp;
                left++;
            }
        }
        return num;
    }
    private static int[] moveZeroToLeft (int[] num) {
        int left = 0;
        for ( int right = 0; right < num.length; right++ ) {
        if ( num[right] == 0 ) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
        }
    }
        return num;
}




    public static void main (String[] args) {
        int[] arr = { 1, 3, 0, 2, 0, 6 };
        int[] num = moveZeroRight(arr);
        System.out.println("Move Zero :" + Arrays.toString(num));
        int[] left = moveZeroToLeft(arr);
        System.out.println("MoveZero to Left :" + Arrays.toString(left));

    }
}
