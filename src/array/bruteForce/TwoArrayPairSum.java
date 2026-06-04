package array.bruteForce;

import java.util.*;

public class TwoArrayPairSum {

    // Brute Force
    private static List< List< Integer > > twoSum (int[] arr, int target) {

        List< List< Integer > > result = new ArrayList<>();

        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = i + 1; j < arr.length; j++ ) {
                if ( arr[i] + arr[j] == target ) {
                    result.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }
        return result;
    }

    // Optimized using HashMap
    public static List< List< Integer > > twoSumPairOptimized (int[] arr, int target) {
        Map< Integer, Integer > map = new HashMap<>();
        List< List< Integer > > result = new ArrayList<>();

        for ( int i = 0; i < arr.length; i++ ) {
            int completed = target - arr[i];
            if ( map.containsKey(completed) ) {

                result.add(Arrays.asList(completed, arr[i]));
            }

            map.put(arr[i], i);
        }
        return result;
    }


    public static void main (String[] args) {
        int[] arr = { 2, 3, 5, -3, 1, 6, -5, 8 };
        int target = 7;

        List< List< Integer > > result = twoSum(arr, target);
        System.out.println("Brute Force Two Sum Pair: ");
        for ( List< Integer > num : result ) {

            System.out.println(num);
        }

        System.out.println("Two Sum Pair Optimized : ");
        List< List< Integer > > twoSum = twoSumPairOptimized(arr, target);
        for ( List< Integer > n : twoSum ) {

            System.out.println(n);
        }
    }
}
