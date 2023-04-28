package PracticeCoding;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args){
        int[] a = {2,11,7,9};
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<a.length;i++){
            hashmap.put(a[i],i);


        }
     System.out.println(hashmap.get(7));
    }
}
