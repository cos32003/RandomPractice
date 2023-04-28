package PracticeCoding;

import java.util.HashMap;
import java.util.HashSet;

public class CountDupWordInSentence {

    static int countDupWords(String a){
        String[] c =a.split(" ");
        HashSet<String> hashset = new HashSet<>();
        int count =0;
        for(String d:c){
            if (hashset.add(d)==false){
                count++;

            }
        }
        System.out.print(count);
        return count;

    }




    public static void main(String[] args){
        String b = "Hey java is java best language is java";
        countDupWords(b);

    }
}
