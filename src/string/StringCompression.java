package string;

import java.util.*;

public class StringCompression {

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        return sb.toString();
    }

    // Input: aaawwmmy
    // Output: a3w2m2y
    private static String stringCompression (String str) {
        Map< Character, Integer > map = new LinkedHashMap<>();
        for ( char ch : str.toCharArray() ) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sd = new StringBuilder();
        for ( Map.Entry< Character, Integer > entry : map.entrySet() ) {
            //  sd.append(entry.getKey()).append(entry.getValue());
            sd.append(entry.getKey());
            if ( entry.getValue() > 1 ) {
                sd.append(entry.getValue());
            }
        }
        return sd.toString();
    }

    //Input:  aaawwmmy
    //Output: awmy
    private static String removeDuplicateCharacters (String str) {
        Map< Character, Integer > map = new HashMap<>();
        for ( char ch : str.toCharArray() ) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        StringBuilder sd = new StringBuilder();
        for ( Map.Entry< Character, Integer > entry : map.entrySet() ) {
            sd.append(entry.getKey());
        }
        return sd.toString();
    }
    public static String removeDuplicates(String str) {

        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }
    
    public static void main (String[] args) {
        String s = "aaawwmmy";
        System.out.println("String compression :" + stringCompression(s.toLowerCase()));

        System.out.println("remove duplicate :" + removeDuplicates(s));
        System.out.println("Remove Duplicate :" + removeDuplicateCharacters(s));

    }
}
