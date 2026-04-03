package array.bruteForce;

public class MaximumSubarraySum {

    public static int maximumSubArraySum (int[] arr, int t) {
        if(arr.length == 0) return 0;
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for ( int i = 0; i <= n - t; i++ ) {
            int sum = 0;
            for ( int j = i; j < i + t; j++ ) {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    private static int maxSumArrayBrute (int[] arr) {
        if(arr.length == 0) return 0;
        int maxSum = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length; i++ ) {
            int sum = 0;
            for ( int j = i; j < arr.length; j++ ) {
                sum = sum + arr[j];
                maxSum = Math.max(maxSum, sum);

            }
        }
        return maxSum;
    }
   // finds the maximum sum of a contiguous subarray. Kadane’s Algorithm
    public static int maxSumArraySum (int[] num) {
        if(num.length == 0) return 0;
        int maxSum = num[0];
        int currSum = num[0];
        for ( int i = 1; i < num.length; i++ ) {
            currSum = Math.max(num[i], currSum + num[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main (String[] args) {
        int[] num = { 2, 4, 3, 6, 4, 6 };
        int target = 2;
        int result = maximumSubArraySum(num, target);
        int maxSum = maxSumArraySum(num);
        int maxSumBrute = maxSumArrayBrute(num);
        System.out.println("Maximum Sub Array Sum :" + result);
        System.out.println("Max Sub Array Sum :" + maxSum);
        System.out.println("Max Sub Array Sum Brute :" + maxSumBrute);
    }
}
