package string;

public class SortCharacters {
    private static String sortCharacters (String str) {
        char[] a = str.toCharArray();
        for ( int i = 0; i < str.length(); i++ ) {
            for ( int j = i + 1; j < str.length(); j++ ) {
                if ( a[i] > a[j] ) {
                    char ch = a[i];
                    a[i] = a[j];
                    a[j] = ch;
                }
            }
        }
        return new String(a);
    }

    public static void main (String[] args) {
        String str = "tfneheut";
        String result = sortCharacters(str);
        System.out.println("After Sort :" + result);
    }

}
