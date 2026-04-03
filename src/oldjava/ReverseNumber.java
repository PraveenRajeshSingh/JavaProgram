package oldjava;
/*
| Step | num    | rem = num % 10 | rev = rev*10 + rem    | new num |
| ---- | ------ | -------------- | --------------------- | ------- |
| 1    | 123423 | 3              | 0*10 + 3 = 3          | 12342   |
| 2    | 12342  | 2              | 3*10 + 2 = 32         | 1234    |
| 3    | 1234   | 4              | 32*10 + 4 = 324       | 123     |
| 4    | 123    | 3              | 324*10 + 3 = 3243     | 12      |
| 5    | 12     | 2              | 3243*10 + 2 = 32432   | 1       |
| 6    | 1      | 1              | 32432*10 + 1 = 324321 | 0       |
*/
public class ReverseNumber {
    private static int reverseNumber (int num) {
        int rev = 0;
        int rem;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }
    public static void main (String[] args) {
        int num = 123423;
        System.out.println("Reverse number :" + reverseNumber(num));
    }
}

