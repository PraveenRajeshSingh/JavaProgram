package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    private static List< Integer > removeDuplicates (int[] arr) {
        Set< Integer > duplicate = new HashSet<>();
        Set< Integer > seen = new HashSet<>();

        for ( int a : arr ) {
            if ( !seen.add(a) ) {
                duplicate.add(a);
            }
        }
        return new ArrayList<>(duplicate);
    }

    private static List< Integer > removeDuplicateBrute (int[] arr) {
        List< Integer > res = new ArrayList<>();
        for ( int i = 0; i < arr.length; i++ ) {
            boolean isDuplicate = false;
            for ( int j = i + 1; j < arr.length; j++ ) {
                if ( arr[i] == arr[j] ) {
                    isDuplicate = true;
                    break;
                }
            }
            if ( isDuplicate && !res.contains(arr[i]) ) {
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main (String[] args) {
        int[] arr = { 3, 2, 4, 1, 5, 2, 3, 5 };
        List< Integer > ans = removeDuplicates(arr);
        System.out.println(ans);

        List< Integer > dup = removeDuplicateBrute(arr);
        System.out.println(dup);
    }
}
