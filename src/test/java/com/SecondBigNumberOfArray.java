package PracticeCoding;

import java.util.ArrayList;
import java.util.Collections;

public class SecondBigNumberOfArray {
    static Integer secondlargenumber(int[] a){
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int c: a){
            arraylist.add(c);
        }
        Collections.sort(arraylist);
        //Collections.sort(arraylist,Collections.reverseOrder());
        System.out.println(arraylist);
        System.out.println(arraylist.get(a.length-2));
        return arraylist.get(a.length-2);
    }


    public static void main(String[] args){
        int b[] = {2,3,6,4,7,3,5};
        secondlargenumber(b);
    }
}
