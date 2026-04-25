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
            System.out.print(entry.getKey() + " -> " + entry.getValue());
        }
    }
    /*
    3. merge() Internal Flow
Check if key exists If NOT:
Insert given value
If YES:
Call lambda (oldVal, newVal)
If result != null → update
If null → remove key
     */

    public static Map< Character, Integer > frequencyOfOccurrenceUsingMerge (String str) {
        Map< Character, Integer > duplicate = new HashMap<>();
        for ( char ch : str.toCharArray() ) {
            if ( ch == ' ' ) continue;
            duplicate.merge(ch, 1, Integer::sum);
        }
        return duplicate;
    }

    /*
    Step-by-step
 First 'a'
Key not found → v = null
Lambda → returns 1
Insert → {a=1}
 Second 'a'
Key found → v = 1
Lambda → returns 2
Update → {a=2}
     */
    private static Map< Character, Integer > frequencyOfOccurrenceUsingCompute (String str) {
        Map< Character, Integer > duplicate = new HashMap<>();
        for ( char ch : str.toCharArray() ) {
            duplicate.compute(ch, (k, v) -> (k == null) ? 1 : v + 1);
        }
        return duplicate;
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

        // using getOrDefault()
        Map< Character, Integer > result = frequencyOfOccurrenceChars(str);
        System.out.print(result);

        // using merge()
        Map< Character, Integer > merge = frequencyOfOccurrenceUsingMerge(str);
        System.out.print("Merge :" + merge);

        // using compute()
        Map<Character,Integer> compute=frequencyOfOccurrenceUsingCompute(str);
        System.out.print("Compute :"+compute);
    }
}
