package PracticeCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DecendingArray {
    static void decending(int[] b){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int c:b){
            arrayList.add(c);
        }
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println(arrayList);
    }

    public static void main(String[] args){
        int a[] = {6,7,4,51,2,3,9,77,8,4};
        decending(a);

    }
}
