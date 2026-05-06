package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class StringCompression {

    // Input: aaawwmmy
    //Output: a3w2m2y
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
    private static String compressFrequency(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        StringBuilder sd=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            sd.append(entry.getKey());
        }
        return sd.toString();
    }
    private static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main (String[] args) {
        String s = "aaawwmmy";
        System.out.println("String compression :" + stringCompression(s.toLowerCase()));

        System.out.println("remove duplicate :"+removeDuplicates(s));
        System.out.println("Remove Duplicate :"+compressFrequency(s));

    }
}
