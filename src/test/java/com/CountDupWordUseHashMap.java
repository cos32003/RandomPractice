package PracticeCoding;

import java.util.HashMap;
import java.util.Map;

public class CountDupWordUseHashMap {
    static Map countdupword(String b){
        String[] c = b.split(" ");
        HashMap<String,Integer> hashmap = new HashMap<>();
        for(String d:c){
            if(!hashmap.containsKey(d)){
                hashmap.put(d,1);

            }else if(hashmap.containsKey(d)){
                hashmap.put(d,hashmap.get(d)+1);
            }
        }
        HashMap<String,Integer> hashmap1 = new HashMap<>();
        for(Map.Entry<String,Integer> e:hashmap.entrySet()){
            if(e.getValue()>1){
                hashmap1.put(e.getKey(),e.getValue());
            }
        }
        System.out.println(hashmap1);
        return hashmap1;

    }


    public static void main(String[] args){
        String a = "Hey java is java it is the best language";
        countdupword(a);

    }
}
