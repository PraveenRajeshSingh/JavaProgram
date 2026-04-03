package oldjava;

import java.util.Scanner;// PRIME NUMBERS BETWEEN THE TWO NUMBERS(Range)


public class PrimeNumber {

    private static int primeCount (int num1, int num2) {
        int totalPrimes = 0;

        for ( int i = num1; i <= num2; i++ ) {
            if ( i < 2 ) continue; // skip 0 and 1

            int count = 0;

            for ( int j = 1; j <= i; j++ ) {
                if ( i % j == 0 ) {
                    count++;
                }
            }
            if ( count == 2 ) {
                totalPrimes++;
            }
        }

        return totalPrimes;
    }

    private static boolean isPrime (int num) {
        if ( num < 2 ) return false;
        boolean isPrime = true;
        for ( int i = 2; i <= Math.sqrt(num); i++ ) {
            if ( num % i == 0 ) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    private static int primeCount1 (int start, int end) {
        int totalPrimes = 0;
        for ( int i = start; i <= end; i++ ) {
            if ( i < 2 ) continue;
            boolean isPrime = true;
            for ( int j = 2; j <= Math.sqrt(i); j++ ) {
                if ( i % j == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if ( isPrime ) {
                totalPrimes++;
            }
        }
        return totalPrimes;
    }

    private static void primeNumber (int start, int end) {
        for ( int i = start; i <= end; i++ ) {
            if ( i < 2 ) continue;
            boolean isPrime = true;
            for ( int j = 2; j <= Math.sqrt(i); j++ ) {
                if ( i % j == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if ( isPrime ) {
                System.out.println(i);
            }
        }
    }

    public static void main (String[] args) {
        int num = 2;
        if ( isPrime(num) ) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        Scanner sc = new Scanner(System.in);

        // Taking input of starting and ending range number
        System.out.print("Enter first number: ");
        int start = sc.nextInt();

        System.out.print("Enter last number: ");
        int end = sc.nextInt();

        int result = primeCount(start, end);
        System.out.println("Prime Number : " + result);

        primeNumber(start, end);
    }
}
