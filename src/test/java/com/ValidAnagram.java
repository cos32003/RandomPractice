package PracticeCoding;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {


    static boolean anagram(String a,String b){
        Map<Character,Integer> hashmap = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch1 = a.charAt(i);
            if(hashmap.containsKey(ch1)){
                hashmap.put(ch1,hashmap.get(ch1)+1);
            }else{
                hashmap.put(ch1,1);
            }
        }
        for(int j=0;j<b.length();j++){
            char ch2 = b.charAt(j);
            Integer count = hashmap.get(ch2);
            if(hashmap.containsKey(ch2)){
                count = hashmap.get(ch2) -1;
                hashmap.put(ch2,count);
            }
        }
        System.out.println(hashmap);
        for (Map.Entry<Character,Integer> map:hashmap.entrySet()){
            if(map.getValue()==0) return true;


        }
         return false;
    }





    public static void main(String[] args){
        //String c = "anagram";
        //String d = "nagaram";
        String c = "eat";
        String d = "atj";
        anagram(c,d);

    }
}
