package com.interviewpractise;

public class ReplaceGarbageChar {
    public static String replace(String A){
        A = A.replaceAll("[^a-zA-Z0-9]","");
        return A;

    }
    public static void main(String arg[]){
        String B = "天津是home,()fdf";
        System.out.println(replace(B));

    }
}
