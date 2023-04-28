package PracticeCoding;

import java.util.ArrayList;
import java.util.Collections;


public class ReturnAnagramString {

    static boolean anagramString(String c, String d){
        ArrayList<Character> arrayList1 = new ArrayList<>();
        ArrayList<Character> arrayList2 = new ArrayList<>();

        for(int i=0; i<c.length(); i++){
            arrayList1.add(c.charAt(i));
        }
        for(int j=0; j<d.length();j++){
            arrayList2.add(d.charAt(j));
        }
        Collections.sort(arrayList1);

        Collections.sort(arrayList2);
        if(arrayList1.equals(arrayList2)){
            return true;
        }else{
            return false;
        }




/*        for(int h=0;h<c.length();h++){
            if(arrayList1.contains(arrayList2.get(h))){
                arrayList1.remove(arrayList2.get(h));
            }
        }
        if(arrayList1.isEmpty()){
            return true;
        }else{
            return false;
        }*/


    }

    public static void main(String[] args){
        String a = "aabc";
        String b = "bcaa";
        anagramString(a,b);


    }
}
