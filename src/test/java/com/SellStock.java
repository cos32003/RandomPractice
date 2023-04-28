package PracticeCoding;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class SellStock {
    static int indexofarray(int[] b,int c){
        for(int j=0;j<b.length;j++) {
            if (c == b[j]) {
                return j;
            }
        }
        return -1;
    }

    static int lowprice(int[] b) {
        int lowestprice = b[0];
        for (int i = 1; i < b.length; i++) {
            if (lowestprice > b[i]) {
                lowestprice = b[i];
            }


            return lowestprice;

        }
        return -1;
    }



    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};


        int actualowprice = lowprice(prices);

        System.out.println("The low prices is "+ actualowprice);
        int lowpriceindex = indexofarray(prices,actualowprice);
        System.out.println("Low price index is "+ lowpriceindex);

        int max=prices[lowpriceindex];
        for(int k=lowpriceindex;k<prices.length;k++){

            if(max<prices[k]){
                max=prices[k];
            }
        }
        System.out.println("Max price is "+max);

        System.out.println(max-actualowprice);



    }


}
