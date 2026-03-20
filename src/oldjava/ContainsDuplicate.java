package oldjava;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] num){
        HashSet<Integer> set=new HashSet<>();
        for(int result:num){
            if(set.contains(num)){
                return true;
            }
            set.add(result);
        }
        return false;
    }

    public static void main (String[] args) {
        int[] num={2,4,6,7};
        boolean result=containsDuplicate(num);
        System.out.println("Contains Duplicate :"+result);
    }

}
