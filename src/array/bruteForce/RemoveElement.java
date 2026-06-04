package array.bruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    // Two Pointer Approach (In-place)
    public static int removeElement (int[] arr, int val) {
        int index = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] != val ) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    // ArrayList Approach
    public static List< Integer > removeElements (int[] arr, int val) {
        List< Integer > list = new ArrayList<>();
        for ( int num : arr ) {
            if ( num != val ) {
                list.add(num);
            }
        }
        return list;
    }

    public static void main (String[] args) {
        int[] num = { 2, 4, 6, 5, 2 };
        int k = 2;

        int[] num1 = num.clone();
        int length = removeElement(num1, k);
        int[] result = Arrays.copyOf(num1, length);
        System.out.println("Two pointer Array after removal: " + Arrays.toString(result));

        int[] num2 = num.clone();
        // Streams
        int[] remove = Arrays.stream(num2).filter(n -> n != 2).toArray();
        System.out.println("Array after remove Stream:" + Arrays.toString(remove));

        int[] num3 = num.clone();
        List< Integer > removeElement = removeElements(num3, k);
        System.out.println("Remove Element :" + removeElement);
    }
}
