package array.bruteForce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumSubarraySum {

    private static int maxSumArrayBrute (int[] arr) {
        if ( arr.length == 0 ) return 0;
        int maxSum = arr[0];
        for ( int i = 0; i < arr.length; i++ ) {
            int sum = 0;
            for ( int j = i; j < arr.length; j++ ) {
                sum = sum + arr[j];
                maxSum = Math.max(maxSum, sum);

            }
        }
        return maxSum;
    }

    // finds the maximum sum of a contiguous sub array. Kadane’s Algorithm
    public static int maxSumArraySum (int[] num) {
        if ( num.length == 0 ) return 0;
        int maxSum = num[0];
        int currSum = num[0];
        for ( int i = 1; i < num.length; i++ ) {
            currSum = Math.max(num[i], currSum + num[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    // Two Sum Pattern
    public static int[] twoSum (int[] arr, int target) {
        Map< Integer, Integer > map = new HashMap<>();
        for ( int i = 0; i < arr.length; i++ ) {
            int complement = target - arr[i];

            if ( map.containsKey(complement) ) {
               // return new int[]{ map.get(complement), i }; //index return
                return new int[]{arr[i], complement}; // value return Output [4, 6] instead of [1, 3]
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    public static void main (String[] args) {
        int[] num = { 2, 4, -3, 6, 4, 6 };
        int target = 10;

        int maxSum = maxSumArraySum(num);
        int maxSumBrute = maxSumArrayBrute(num);
        System.out.println("Max Sub Array Sum :" + maxSum);
        System.out.println("Max Sub Array Sum Brute :" + maxSumBrute);

        int[] twoSum = twoSum(num, target);
        System.out.println("Two Sum :" + Arrays.toString(twoSum));
    }
}
