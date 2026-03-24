package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {

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

    public static void main (String[] args) {
        String s = "aaawwmmy";
        System.out.println("String compression :" + stringCompression(s.toLowerCase()));
    }
}
