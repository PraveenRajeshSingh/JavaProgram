package oldjava;

public class SwapTwoNumber {
    public static void main (String[] args) {
        int a = 4;
        int b = 5;
        a = (a + b) - (b = a);
        System.out.println("a :" + a + "  b:" + b);
    }
}
