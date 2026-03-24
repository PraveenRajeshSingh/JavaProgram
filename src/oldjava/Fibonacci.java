package oldjava;

public class Fibonacci {
    private static void fibonacciSeries (int num) {
        int first = 0, second = 1;
        for ( int i = 1; i <= num; i++ ) {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
        }
    }

    public static void main (String[] args) {
        int num = 5;
        fibonacciSeries(num);
    }
}
