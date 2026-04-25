package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public
class FrequencyOfElement {
    public static void main (String[] args) {
        /* -------------------  Integer ------------------ */
        List< Integer > num = Arrays.asList(1, 5, 3, 4, 2, 5, 2, 3, 6);

        Set< Integer > dup = new HashSet<>();
        List< Integer > result = num.stream()
                .filter(n -> !dup.add(n))
                .collect(Collectors.toList());

        List< Integer > duplicates = num.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(v -> v.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.print(" Duplicates :" + duplicates);


        System.out.println("Duplicate Element :" + result);
        // -------------------------------------------------------------
        // Count Frequency of Each Num
        Map< Integer, Long > frequencyOfOccurrenceNum = num.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Frequency Of (Occurrence) Number :" + frequencyOfOccurrenceNum);

        // Grouping Count Frequency of Each Num
        Map< Long, List< Integer > > frequencyOfOccurrenceNumber = num
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue, Collectors.mapping(
                                Map.Entry::getKey, Collectors.toList())));
        System.out.println("Grouping BY Frequency Of Occurrence Number Count :" + frequencyOfOccurrenceNumber);

        /* ---------------- String --------------------*/
        String name = "java programming language";

        //  Count Words in Sentence
        long wordsCount = Arrays.stream(name.split(" ")).count();
        System.out.println("Count Words in Sentence :" + wordsCount);

        // Find Longest Word in Sentence
        String maxWordLengthInString = Arrays.stream(name.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("Find Longest Word in Sentence :" + maxWordLengthInString);

        //Remove Duplicate Characters
        String removeDuplicateChar = name.chars().distinct()
                .mapToObj(w -> String.valueOf((char) w))
                .collect(Collectors.joining(""));
        System.out.println("Remove Duplicate Characters :" + removeDuplicateChar);

        // Count Total Characters
        long count = name.chars().map(c -> (char) c)
                .filter(c -> c != ' ')
                .count();
        System.out.println("Total Count Character :" + count);

        // Find Duplicate Characters
        Set< Character > ch = new HashSet<>();
        Set< Character > duplicateChar = name.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .filter(n -> !ch.add(n))
                .collect(Collectors.toSet());
        System.out.println("Duplicate Character :" + duplicateChar);

        // Find Duplicate Characters
        Set< Character > duplicate = name.chars().mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println("Duplicate Characters :" + duplicate);


        //  Find First Non-Repeating Character
        Character results = name.chars().mapToObj(c -> (char) c).filter(m -> m != ' ')
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First Non Repeating Char :" + results);


        // ------------------------------------------------------
        //Count Frequency of Each Character
        Map< Character, Long > frequencyOfOccurrenceString = name.toLowerCase()
                .chars().mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency Of Occurrence String Count :" + frequencyOfOccurrenceString);

        // Grouping Count Frequency of Each Character
        Map< Long, List< Character > > groupingByFrequencyOfOccurrenceString = name.toLowerCase().chars()
                .mapToObj(c -> (char) c).filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println("Frequency Of Occurrence String :" + groupingByFrequencyOfOccurrenceString);

        List< String > list = Arrays.asList("Java", "Python", "c++");
        Map< String, Integer > map = list.stream().collect(Collectors.toMap(s -> s, String::length));
        System.out.println("Length Of Each Word :" + map);
    }
}
