package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

    // Reverse complete string using StringBuilder
    private static String reverse (String str) {

        return new StringBuilder(str).reverse().toString();
    }

    private static boolean isPalindrome (String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static void main (String[] args) {
        String str = "Java is a programming Language";

        String reverseEachWord = Arrays.stream(str.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println("Reverse Each Word :" + reverseEachWord);

        System.out.println("Reverse Strings :" + reverse(str));

        boolean results = isPalindrome(str);
        if ( results ) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

        //Reverse string using for loop
        String word = "Mohan";
        String rev = "";
        for ( int i = word.length() - 1; i >= 0; i-- ) {
            rev += word.charAt(i);
        }
        System.out.println("Reverse String : " + rev);

//        Input  : Java is easy
//        Output : easy is Java
        String words = "Java is easy";
        String reverseWords  = "";
        String[] split = words.split(" ");
        for ( int i = split.length - 1; i >= 0; i-- ) {
            reverseWords  += split[i] + " ";
        }
        System.out.println("Reverse Word Order  :" + reverseWords);

       // Reverse without StringBuilder
        char[] ch = str.toCharArray();

        int start = 0;
        int end = ch.length - 1;

        while (start < end) {

            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reverse using Char Array : " + new String(ch));

    }

}
