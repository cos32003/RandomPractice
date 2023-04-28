package com.interviewpractise;

public class sumof1darray {
    public static int[] sum(int[] a){
        int length = a.length;
        int[] result = new int[length];
        int sum = 0;
        for(int i=0;i<length;i++){
            sum = sum + a[i];
            result[i] = sum;
        }
        return result;
    }
}
