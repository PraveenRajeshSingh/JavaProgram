package oldjava;

public class SecondHighest {
    private static int secondHighest (int[] num) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for ( int i = 0; i < num.length; i++ ) {
            if ( num[i] > highest ) {
                secondHighest = highest;
                highest = num[i];
            } else if ( num[i] > secondHighest && num[i] != highest ) {
                secondHighest = num[i];
            }
        }
        return secondHighest;
    }

    public static void main (String[] args) {
        int[] num = { 2, 4, 7, 9, 4, 6 };
        int result = secondHighest(num);
        System.out.println("Second Highest :" + result);
    }
}
