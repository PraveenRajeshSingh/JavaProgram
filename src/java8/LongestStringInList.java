package java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestStringInList {
    public static void main (String[] args) {
        List<String> str=List.of("Java","Static","final","constructor");

        String result=str.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("Longest String In List :"+result);
    }
}
