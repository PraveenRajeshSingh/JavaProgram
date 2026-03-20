package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfOccurrenceChar {

    private static void frequencyOfOccurrenceChar (String str) {
        Map< Character, Integer > map = new HashMap<>();
        for ( char ch : str.toCharArray() ) {
            if ( ch == ' ' )
                continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for ( Map.Entry< Character, Integer > entry : map.entrySet() ) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static Map< Character, Integer > frequencyOfOccurrenceChars (String str) {
        Map< Character, Integer > map = new LinkedHashMap<>();
        for ( char ch : str.toCharArray() ) {
            if ( ch == ' ' ) continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public static void main (String[] args) {
        String str = "java is a programming language";
        frequencyOfOccurrenceChar(str);
        Map< Character, Integer > result = frequencyOfOccurrenceChars(str);
        System.out.println(result);
    }
}
