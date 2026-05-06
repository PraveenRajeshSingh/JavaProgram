package array.bruteForce;

import java.util.*;

public class TwoArrayPairSum {

    private static List< int[] > twoSum (int[] arr, int target) {
        List< int[] > result = new ArrayList<>();
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = i + 1; j < arr.length; j++ ) {
                if ( arr[i] + arr[j] == target ) {
                    // return new int[]{ i, j };
                    result.add(new int[]{ i, j });
                }
            }
        }
        //return new int[]{};
        return result;
    }

    public static List<int[]> twoSumPair(int[] arr,int t){
        Map<Integer,List<Integer>> map=new HashMap<>();
        List<int[]> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int completed=t-arr[i];
            if(map.containsKey(completed)){
                for(int index:map.get(completed)) {
                    result.add(new int[]{index, i});
                }
            }
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        return result;
    }

    public static List< int[] > twoSumOptimized (int[] arr, int target) {
        Map< Integer, Integer > map = new HashMap<>();
        List< int[] > result = new ArrayList<>();
        for ( int i = 0; i < arr.length; i++ ) {
            int complement = target - arr[i];
            if ( map.containsKey(complement) ) {
               // result.add(new int[]{ map.get(complement), i });// return index
                result .add(new int[]{arr[i],complement}); // return value
            }
            map.put(arr[i], i);
        }
        return result;
    }

    public static void main (String[] args) {
        int[] arr = { 2, 3, 5, -3, 1, 6, -5, 8 };
        int target = 7;
        List< int[] > result = twoSum(arr, target);
        System.out.println("Two Sum Pair: ");
        for ( int[] num : result ) {
            
            System.out.println(Arrays.toString(num));
        }
        System.out.println("Two Sum Pair Optimized : ");
        List< int[] > re = twoSumOptimized(arr, target);
        for ( int[] n : re ) {
            System.out.println(Arrays.toString(n));
        }
    }
}
