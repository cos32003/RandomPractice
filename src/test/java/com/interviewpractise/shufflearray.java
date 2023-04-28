package com.interviewpractise;

import java.util.ArrayList;
import java.util.List;

public class shufflearray {
    public static int[] shuffle(int[] a, int n){
        int length = a.length;
        if (length ==0){
            return a;
        }

        else{
            int pointer1 = 0;
            int pointer2 = n;
            ArrayList arrayList = new ArrayList();
            for(int i=0;i<n;i++){
                arrayList.add(a[pointer1]);
                arrayList.add(a[pointer2]);
                pointer1++;
                pointer2++;
            }
            int[] result = new int[arrayList.size()];
            for(int j=0;j<arrayList.size();j++){
                result[j] = (int) arrayList.get(j);
            }
            return result;






        }


    }
    public static void main(String[] args){
        int[] a = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(shuffle(a,n));
    }
}

