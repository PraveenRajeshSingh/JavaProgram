package oldjava;

public class LinearSearch {

    private static int search (int[] arr, int key) {
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] == key ) return i;
        }
        return -1;
    }

    public static void main (String[] args) {
        int[] arr = { 3, 4, 6, 8, 2 };
        int target = 9;
        int result = search(arr, target);
        if ( result != -1 ) {
            System.out.println("Search Target :" + result);
        } else {
            System.out.println("Element not Found..!");
        }
    }
}
