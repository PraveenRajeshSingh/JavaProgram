package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

    private static String reverse (String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static boolean isPalindrome (String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main (String[] args) {
        String str = "Java is a programming Language";

        String result = Arrays.stream(str.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println("Reverse String :" + result);

        System.out.println("Reverse Strings :" + reverse(str));

        boolean results = isPalindrome(str);
        if ( results ) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
        String word = "Mohan";
        String rev = "";
        for ( int i = word.length() - 1; i >= 0; i-- ) {
            rev += word.charAt(i);
        }
        System.out.println("Reverse String : " + rev);

        String words = "Java is a";
        String r = "";
        String[] split = words.split(" ");
        for ( int i = split.length - 1; i >= 0; i-- ) {
            r += split[i] + " ";
        }
        System.out.println("Reverse Word :" + r);

    }
}
