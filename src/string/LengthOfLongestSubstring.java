package string;


import java.util.HashMap;
import java.util.Map;

/*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
 */
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring (String str) {
        Map< Character, Integer > map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for ( int right = 0; right < str.length(); right++ ) {
            char ch = str.charAt(right);
            if ( map.containsKey(ch) ) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main (String[] args) {
        String str = "bbb";
        int result = lengthOfLongestSubstring(str);
        System.out.println("Length Of Longest Substring :" + result);

    }
}
