package PracticeCoding;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    static String commonword(String paragraph, String[] banned){
        String fixparagraph=paragraph.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase();//replace non letter and number with space

        String[] seperateparagraph = fixparagraph.split(" ");


        Map<String,Integer> hashmap = new HashMap<>();
        for(String word:seperateparagraph){
            if(!hashmap.containsKey(word)){
                hashmap.put(word,1);
            }
            if(hashmap.containsKey(word)){
                hashmap.put(word,hashmap.get(word)+1);
            }
        }
        hashmap.remove(banned[0]);
        System.out.println(hashmap);
        System.out.println(Collections.max(hashmap.entrySet(),Map.Entry.comparingByValue()).getKey());
        return Collections.max(hashmap.entrySet(),Map.Entry.comparingByValue()).getKey();


    }


    public static void main(String[] args){
        String[] banned1 = {"hit"};
        commonword("Bob hit a ball, the hit BALL flew far after it was hit.", banned1);

    }
}
