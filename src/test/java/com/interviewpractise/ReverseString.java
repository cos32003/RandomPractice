package com.interviewpractise;

public class ReverseString {
    static String reverse(String A){
        if(A==null){
            return null;
        }
        else {
            int len = A.length();
            String result = "";
            for (int i = len - 1; i >= 0; i--) {

                result = result + A.charAt(i);

            }
            return result;
        }
    }
    public static void main(String[] args){
        String B = "";
        System.out.println(reverse(B));
    }
}

/***
 * Use StringBuffer
 * StringBuffer sf = new StringBuffer(s);
 * System.out.print(sf.reverse());
 */
