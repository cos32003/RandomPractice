package com.interviewpractise;

public class LongestCommonPrefix {

    public static String CommonPrefix(String[] m) {
        String min_word = m[0];
        for (String word : m) {
            if (word.length() < min_word.length()) {
                min_word = word;

            }


        }
        String result = null;
        for (int j = 0; j < min_word.length(); j++) {

            String prefix = min_word.substring(0, j + 1);
                for (String word : m) {
                    if (!word.startsWith(prefix)) {
                        return result;
                    }

            }
            result = prefix;
        }
        return result;

    }
    public static void main(String arg[]){
        String[] str={"flower","flow","flight"};
        System.out.println(CommonPrefix(str));

    }

}
