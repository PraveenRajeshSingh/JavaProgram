package string;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingCharacter {

    private static Character firstRepeatingCharacter (String words) {
        Map< Character, Integer > map = new HashMap<>();
        for ( char ch : words.toCharArray() ) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // first way
        for ( char ch : words.toCharArray() ) {
            if ( map.get(ch) > 1 ) {
                return ch;
            }
        }
        // Second way
        for ( Map.Entry< Character, Integer > entry : map.entrySet() ) {
            if ( entry.getValue() > 1 ) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main (String[] args) {
        String str = "wetrtf";
        Character result = firstRepeatingCharacter(str);
        System.out.println("First Repeating Character :" + result);
    }
}
