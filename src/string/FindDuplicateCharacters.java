package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Write a program to find duplicates in an array without using nested looping statements
//Input: [1, 2, 1, 3, 5, 6, 7, 4, 5]
//Output: [1, 5]

public class FindDuplicateCharacters {

    private static List< Character > findDuplicateCharacters (String words) {
        Map< Character, Integer > map = new HashMap<>();
        for ( char ch : words.toCharArray() ) {
            if ( ch == ' ' ) continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List< Character > duplicate = new ArrayList<>();
        for ( Map.Entry< Character, Integer > entry : map.entrySet() ) {
            if ( entry.getValue() > 1 ) {
                char ch = entry.getKey();
                duplicate.add(ch);
            }
        }

        return duplicate;
    }

    // find duplicate words
    private static List< String > findDuplicateWords (String str) {
        Map< String, Integer > map = new HashMap<>();
        for ( String w : str.split(" ") ) {
            map.put(w, map.getOrDefault(w, 0) + 1);

        }
        List< String > d = new ArrayList<>();
        for ( Map.Entry< String, Integer > entry : map.entrySet() ) {
            if ( entry.getValue() > 1 ) {
                d.add(entry.getKey());
            }
        }
        return d;
    }

    // find duplicate number
    private static List< Integer > findDuplicateInteger (int[] arr) {
        Map< Integer, Integer > map = new HashMap<>();
        for ( int a : arr ) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        List< Integer > dup = new ArrayList<>();
        for ( Map.Entry< Integer, Integer > entry : map.entrySet() ) {
            if ( entry.getValue() > 1 ) {
                dup.add(entry.getKey());
            }
        }
        return dup;
    }

    public static void main (String[] args) {
        String words = "java is a programming a java language";
        List< Character > duplicateChar = findDuplicateCharacters(words);
        System.out.println("Duplicate Character are :" + duplicateChar);

        List< String > duplicateWords = findDuplicateWords(words);
        System.out.println("Duplicate Words :" + duplicateWords);

        int[] arr = { 2, 4, 1, 2, 4, 3, 5, 3, 6 };
        List< Integer > result = findDuplicateInteger(arr);
        System.out.println("Duplicate Integer :" + result);

    }
}
