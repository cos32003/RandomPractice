package PracticeCoding;

import java.util.ArrayList;

public class SwapToSort {
    static void sort(int[] b){

      for(int i=0;i<b.length;i++){

          for(int j=i+1;j<b.length;j++){
              int temp=0;
              if(b[i]>b[j]){
                  temp=b[i];
                  b[i]=b[j];
                  b[j]=temp;

              }

          }
      }
     for(int k=0;k<b.length;k++){
         System.out.println(b[k]);
     }
    }


    public static void main(String[] args){

        int[] a = {5,4,1,2};
        sort(a);

    }
}
