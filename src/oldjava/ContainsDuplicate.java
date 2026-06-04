package oldjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate (int[] num) {
        Set< Integer > set = new HashSet<>();
        for ( int result : num ) {
            if ( set.contains(result) ) {
                return true;
            }
            set.add(result);
        }
        return false;
    }

    public static List< Integer > duplicate (int[] num) {
        Set< Integer > seen = new HashSet<>();
        List< Integer > duplicates = new ArrayList<>();

        for ( int value : num ) {
            if ( seen.contains(value) ) {
                duplicates.add(value);
            } else {
                seen.add(value);
            }
        }
        return duplicates;
    }

    public static void main (String[] args) {
        int[] num = { 2, 4, 6, 7, 4 };
        boolean result = containsDuplicate(num);
        System.out.println("Contains Duplicate :" + result);

        List< Integer > duplicateInt = duplicate(num);

        System.out.println("Duplicates: " + duplicateInt);

    }

}
