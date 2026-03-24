package oldjava;

import java.util.Scanner;
//Input  arr = {3, 4, 6, 8, 2} target = 8
//Output  Search Target Index: 3
public class LinearSearch {

    private static int search (int[] arr, int key) {
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] == key )
                return i; // found
        }
        return -1; // not found
    }
    // 2. Last Occurrence
    private static int lastOccurrence(int[] arr, int key) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // 1. Linear Search (First Occurrence)
    private static int firstOccurrence(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
    // 3. Count Occurrences
    private static int countOccurrences(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) count++;
        }
        return count;
    }

    public static void main (String[] args) {
        int[] arr = { 3, 4, 6, 8, 2 };
        int target = 8;
        int result = search(arr, target);
        int lastOccurrence=lastOccurrence(arr,target);
        System.out.println("Last Occurrence :"+lastOccurrence);

        if ( result != -1 ) {
            System.out.println("Search Target :" + result);
        } else {
            System.out.println("Element not Found..!");
        }

        Scanner sc=new Scanner(System.in);
        // input size
        System.out.print("Enter Array Size :");
        int length=sc.nextInt();
        int[] num=new int[length];

        // input elements
        System.out.println("Entre Elements :");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        // input key
        System.out.println("Enter number to search : ");
        int key=sc.nextInt();

        sc.close();
    }
}
