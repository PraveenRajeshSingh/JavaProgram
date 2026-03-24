package oldjava;

public class CountDigits {

    private static int countDigit (int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main (String[] args) {
        int num = 23456;
        int result = countDigit(num);
        System.out.println("Count Digit :" + result);
    }
}
