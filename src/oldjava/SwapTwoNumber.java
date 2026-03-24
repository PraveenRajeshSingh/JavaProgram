package oldjava;

public class SwapTwoNumber {
    public static void main (String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("Before a :" + a + "  Before b:" + b);
        a = (a + b) - (b = a);
        System.out.println("After a :" + a + "  After b:" + b);
    }
}
