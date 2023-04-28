package PracticeCoding;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatSubString {
    static int nonRepeatSubString(String b) {
        int i = 0;
        int j = 0;
        int max = 0;

        Set<Character> hashset = new HashSet<>();
        while (b.length() <= 1) {
            return -1;
        }
        while(i<b.length()){
            char chi = b.charAt(i);
            while(hashset.contains(chi)){
                hashset.remove(b.charAt(j));
                System.out.println("i pointer"+hashset);
                j++;
            }
            hashset.add(chi);
            max=Math.max(max,i-j+1);
            System.out.println("j pointer"+hashset);
            i++;

        }

        System.out.println(max);
        return max;

    }




        public static void main (String[]args){
            String a = "pwwkew";
            nonRepeatSubString(a);
        }
    }

