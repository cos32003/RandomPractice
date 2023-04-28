package com.interviewpractise;

public class SplitStringInBalanceString {
    public static int balancedStringSplit(String s) {
        int count = 0;
        int result = 0;
        if (s.length() == 0) {
            return 0;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'L') {
                    count++;
                } else {
                    count--;
                }
                if (count == 0) {
                    result++;
                }
            }
            return result;
        }
    }
    public static void main(String[] args){
        String a = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(a));
    }
}
