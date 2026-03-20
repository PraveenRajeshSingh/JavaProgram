package array.bruteForce;

public class MaximumSubarraySum {

    public static int maximumSubArraySum (int[] arr, int t) {
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

    public static void main (String[] args) {
        int[] num = { 2, 4, 3, 6, 4, 6 };
        int target = 2;
        int result = maximumSubArraySum(num, target);
        System.out.println("Maximum Sub Array Sum :" + result);
    }
}
