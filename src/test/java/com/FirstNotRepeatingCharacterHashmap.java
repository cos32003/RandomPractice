
package PracticeCoding;

import java.util.HashMap;

public class FirstNotRepeatingCharacterHashmap {
    static void firstnotrepeatingcharacter(String b){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<b.length();i++){
            if(!hashMap.containsKey(b.charAt(i))){
                hashMap.put(b.charAt(i),1);
            }else if(hashMap.containsKey(b.charAt(i))){
                Integer value = hashMap.get(b.charAt(i));
                hashMap.put(b.charAt(i),value+1);
            }
        }
        for(int j=0;j<b.length();j++){
            Integer value1 = hashMap.get(b.charAt(j));
            if(hashMap.containsKey(b.charAt(j)) && value1 ==1){
                System.out.println(b.charAt(j));
            }
        }

    }


    public static void main(String[] args){
        String a = "aabccdd";
        firstnotrepeatingcharacter(a);
    }
}
