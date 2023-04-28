package PracticeCoding;

import java.util.ArrayList;

public class RemoveElement {
    static int remove(int[] a,int b){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i] != b){
                arrayList.add(a[i]);
            }
        }
        System.out.println(arrayList);
        return arrayList.size();
    }


    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val =3;
        remove(nums,val);
    }
}
