package oldjava;

public class PrimeNumber {
    private static boolean isPrime (int num) {
        if ( num <= 1 ) return false;
        for ( int i = 2; i <= Math.sqrt(num); i++ ) {
            if ( num % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        int num = 10;
        if ( isPrime(num) ) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
