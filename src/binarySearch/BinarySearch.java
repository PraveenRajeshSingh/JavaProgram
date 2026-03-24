package binarySearch;

public class BinarySearch {

    private static int search (int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ( arr[mid] == target ) {
                return mid;
            } else if ( arr[mid] < target ) {
                return left = mid + 1;
            } else {
                return right = mid - 1;
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 9 };
        int target = 4;
        int result = search(arr, target);
        System.out.println("Search Target Number Index: " + result);
    }
}
