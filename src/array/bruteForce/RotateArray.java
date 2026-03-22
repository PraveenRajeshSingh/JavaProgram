package array.bruteForce;

import java.util.Arrays;

public class RotateArray {
    public static void reverse (int[] num, int left, int right) {
        while (left < right) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotate (int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void main (String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(arr, k);
        System.out.println("Rotate Array :" + Arrays.toString(arr));
    }
}
