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
    public static List< List< Integer > > twoSumPair (int[] arr, int target) {
        Set< Integer > seen = new HashSet<>();
        List< List< Integer > > pair = new ArrayList<>();

        for ( int num : arr ) {
            int complement = target - num;
            if ( seen.contains(complement) ) {

                pair.add(Arrays.asList(complement, num));
            }

            seen.add(num);
        }
        return pair;
    }

    // Unique Pair Only
    public static List< List< Integer > > twoSumUniquePair (int[] arr, int target) {
        Set< Integer > seen = new HashSet<>();
        Set< List< Integer > > uniquePair = new HashSet<>();
        for ( int num : arr ) {
            int complement = target - num;
            if ( seen.contains(complement) ) {
                int first = Math.min(complement, num);
                int second = Math.max(complement, num);
                uniquePair.add(Arrays.asList(first, second));
            }

            seen.add(num);
        }
        return new ArrayList<>(uniquePair);
    }


    public static void main (String[] args) {
        int[] arr = { 2, 3, 5, -3, 1, 6, 1, -5, 8 };
        int target = 7;

        List< List< Integer > > result = twoSum(arr, target);
        System.out.println("Brute Force Two Sum Pair: ");
        for ( List< Integer > num : result ) {

            System.out.println(num);
        }

        System.out.println("Two Sum Pair Optimized : ");
        List< List< Integer > > twoSum = twoSumPair(arr, target);
        for ( List< Integer > pair : twoSum ) {

            System.out.println(pair);
        }

        System.out.println("Unique Pair Only :");
        List< List< Integer > > pairs = twoSumUniquePair(arr, target);
        for ( List< Integer > pair : pairs ) {
            System.out.println(pair);
        }
    }
}
