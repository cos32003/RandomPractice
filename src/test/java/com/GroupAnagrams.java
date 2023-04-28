package PracticeCoding;
/*
sort eat, sort tea, sort ate, they have common sorted char aet
sort tan,nat, they have common sorted char ant

 */

import java.util.*;

public class GroupAnagrams {
    static List<List<String>> sortanagrams(String[] b) {
        Map<String, List<String>> map = new HashMap<>();
        for (String c : b) {
            String key = generateKey(c);

            if (map.containsKey(key)) {
               map.get(key).add(c);

            }else{
                //List<String> list = new LinkedList<>();
                ArrayList<String> list = new ArrayList<>();
                list.add(c);
                map.put(key,list);
            }
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
    }
    static String generateKey(String d){
        char[] ch = d.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static void main(String[] args){
        String[] a = {"eat","tea","tan","ate","nat","bat"};
        sortanagrams(a);



    }
}
