package PracticeCoding;

import static java.lang.Math.min;

public class CountBinarySubstring {
    static int countsubstring(String b){
/*        int i=0;
        int j=0;
        int count=0;
        int balancecount=0;

      while(i<b.length() && j<b.length()){
          if(b.charAt(j) == '0'){
              count++;
              j++;
              if(count ==0){
                  balancecount++;
                  i++;
                  j=i;
              }

          }
          if(b.charAt(j) == '1'){
              count--;
              j++;
              if(count ==0){
                  balancecount++;
                  i++;
                  j=i;
              }
          }

      }
      System.out.println(balancecount);
      return balancecount;*/
        int current = 1;
        int previous = 0;
        int sum = 0;
        for(int i=1;i<b.length();i++){
            if (b.charAt(i) == b.charAt(i-1))
                current++;

            else{
                sum=sum+min(current,previous);
                previous = current;
                current =1;
            }

        }
        sum=sum+min(current,previous);
        System.out.println(sum);
        return sum;
    }




    public static void main(String[] args){
       //String a = "00110011";
        //String a = "00110";
        String a = "10101";
        countsubstring(a);

    }
}
