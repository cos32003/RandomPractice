package PracticeCoding;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArray {

    public static void main(String[] args){
        int[] a={1,2,3,0,0,0};
        int[] b={2,5,6};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(Integer c:a){
            if(c !=0){
                arrayList.add(c);
            }
        }
        for(Integer d:b){
            if(d!=0){
                arrayList.add(d);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
