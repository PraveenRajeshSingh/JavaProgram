package oldjava;

public class Fibonacci {
    private static void fibonacciSeries (int count) {
        int a = 0, b = 1;
        for ( int i = 1; i <= count; i++ ) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main (String[] args) {
        int count=5;
        fibonacciSeries(count);
    }
}
