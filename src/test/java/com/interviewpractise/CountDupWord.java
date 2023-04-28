package com.interviewpractise;

import java.util.HashMap;
import java.util.Map;

public class CountDupWord {
    public static Map count(String a) {
        if (a.length() == 0) {
            return null;
        } else {
            String[] b = a.split(" ");
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < b.length; i++) {
                if (!hashMap.containsKey(b[i])) {
                    hashMap.put(b[i], 1);
                } else {
                    if (hashMap.containsKey(b[i])) {
                        int value = hashMap.get(b[i]);
                        hashMap.put(b[i], value + 1);
                    }
                }
            }

            HashMap<String, Integer> hashMapResult = new HashMap<>();
            for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
                if (e.getValue() > 1) {
                    hashMapResult.put(e.getKey(), e.getValue());
                }
            }
            return hashMapResult;
        }


    }
        public static void main(String[] args){
            String a = "Hey java is java best language is java";
            System.out.println(count(a));
        }

}
