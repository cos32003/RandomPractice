package PracticeCoding;

import java.util.HashSet;

public class FindDuplicateNumberInArray {
    static void findduplicateNumber(int[] b){
        HashSet<Integer> hashset = new HashSet<>();
        for(int c:b){
            if(hashset.add(c) == false){
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args){
        int[] a = {4,3,2,7,8,2,3,1};
        findduplicateNumber(a);
    }
}
