package PracticeCoding;
/*
loveleetcode
 */

import java.util.*;

public class FindFirstNonRepeatChaIndex {
    /*
    Add each character of string into hashmap
    Use the string to compare with the hashmap again.
     */

    static int findIndex(String b) {
        Map<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);


            if (hashmap.containsKey(ch)) {
                hashmap.put(ch, hashmap.get(ch)+1);
            } else {
                hashmap.put(ch, 1);

            }
        }
        System.out.println(hashmap);

        for(int j=0;j<b.length();j++){
            int index=0;
            if(hashmap.get(b.charAt(j))==1){
                //index = b.indexOf((b.charAt(j)));
                //System.out.println(b.indexOf((b.charAt(j))));
                index = j;
                System.out.println(index);
                return index;
            }
        }
   /* List<String> arraylist = new ArrayList<>();
        for (Map.Entry<Character, Integer> map : hashmap.entrySet()) {
            if (map.getValue() == b.charAt()) {
                Character ch1 = map.getKey();
                arraylist.add(String.valueOf(ch1));
            }

        }
         System.out.println(arraylist);
        int smallindex = 0;
        for (int j = 0; j < arraylist.size(); j++) {
            smallindex = b.indexOf(arraylist.get(0));
            if (b.indexOf(arraylist.get(j)) < smallindex) {
                smallindex = b.indexOf(arraylist.get(j));
            }

        }
        System.out.println(smallindex);*/
        return -1;
    }

    public static void main(String[] args){
        String a = "loveleetcode";
        findIndex(a);

    }
}
