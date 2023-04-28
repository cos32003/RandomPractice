package PracticeCoding;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {
    static int removeduplicate(int[] b){
        Set<Integer> hashset = new HashSet<>();
        for(int i=0;i<b.length;i++){
            hashset.add(b[i]);
        }
        System.out.println(hashset);
        System.out.println(hashset.size());
        return hashset.size();

    }

    public static void main(String[] args){
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        removeduplicate(a);
    }
}
