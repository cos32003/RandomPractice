package PracticeCoding;

public class FindTheLargeAndSmallNumber {

    static int findthelargenumber(int[] b){
        int max=b[0];
        if(b.length==1){
            System.out.println(max);
            return max;
        }
        if(b.length<1){
            return -1;
        }
         for(int i=0;i<b.length-1;i++){
             if(b[i+1]>max){
                 max=b[i+1];
             }

         }
         System.out.println(max);
         return max;


    }

    public static void main(String[] args){
      //int a[] = {-10,32,34,12,10,-90,100,4,6};
        int a[] = {};
      findthelargenumber(a);
    }
}
