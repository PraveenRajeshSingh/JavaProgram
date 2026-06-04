package array.bruteForce;

import java.util.*;

public class MaximumSubArraySum {

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
    public static List< Integer > twoSum (int[] arr, int target) {
        Map< Integer, Integer > map = new HashMap<>();
        for ( int i = 0; i < arr.length; i++ ) {
            int complement = target - arr[i];

            if ( map.containsKey(complement) ) {
                // return new int[]{ map.get(complement), i }; //index return
                return Arrays.asList(complement, arr[i]); // value return Output [4, 6] instead of [1, 3]
            }
            map.put(arr[i], i);
        }
        return new ArrayList<>();
    }

    public static Set< List< Integer > > twoSumAll (int[] arr, int target) {
        Map< Integer, Integer > map = new HashMap<>();
        Set< List< Integer > > list = new HashSet<>();
        for ( int i = 0; i < arr.length; i++ ) {
            int completed = target - arr[i];
            if ( map.containsKey(completed) ) {
                int a = Math.min(arr[i], completed);
                int b = Math.max(arr[i], completed);
                list.add(Arrays.asList(a, b));
                //list.add(Arrays.asList(completed, arr[i]));
            }
            map.put(arr[i], i);
        }
        return list;
    }

    public static int maxSubArrayLength (int[] arr, int target) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        return 0;
    }

    public static void main (String[] args) {
        int[] num = { 2, 4, -3, -6, -4, 6, 5, 4, 1, 5 };
        int target = 10;

        int maxSum = maxSumArraySum(num);
        System.out.println("Max Sub Array Sum :" + maxSum);

        int maxSumBrute = maxSumArrayBrute(num);
        System.out.println("Max Sub Array Sum Brute :" + maxSumBrute);

        List< Integer > twoSum = twoSum(num, target);
        System.out.println("Two Sum :" + twoSum);

        Set< List< Integer > > twoSumAll = twoSumAll(num, target);
        System.out.println("Two Sum All :" + twoSumAll);
    }
}
