package string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    private static Character findFirstNonRepeatingChar (String name) {

        Map< Character, Integer > map = new HashMap<>();
        for ( char ch : name.toCharArray() ) {
            if ( ch == ' ' ) continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for ( Map.Entry< Character, Integer > entry : map.entrySet() ) {
            if ( entry.getValue() == 1 ) {
                return entry.getKey();
            }
        }
//        for(char ch:name.toCharArray()){
//            if(map.get(ch)==1){
//                return ch;
//            }
//        }
        return null;
    }

    public static void main (String[] args) {

        String name = "java is a programming language";

        Character ch = findFirstNonRepeatingChar(name);
        System.out.println("First non repeating Char :" + ch);
    }

}
