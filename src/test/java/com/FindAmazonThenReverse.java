package PracticeCoding;
/*
covert string to string [] using split(" ")
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindAmazonThenReverse {
    static String reverseAmazon(String b) {
       // Set<String> hashset = new HashSet<>(Arrays.asList(b.split(" ")));
        String[] c = b.split(" ");
        String f = null;
        for(String d: c ){
            if(d.equals("Amazon")){
                StringBuffer stringBuffer = new StringBuffer(d);
                f = String.valueOf(stringBuffer.reverse());
                System.out.print(f);

            }
        }
       /* while (b.length() == 0) {
            return "-1";
        }
        String[] c = b.split(" ");
        String f = null;
        for (String d : c) {
            if (d.equals("Amazon")) {
                StringBuffer stringBuffer = new StringBuffer(d);
                f = String.valueOf(stringBuffer.reverse());
                System.out.print(f);
                return f;

            }

        }
        return f;*/
        return f;
    }







    public static void main(String[] args){
        String a = "I am working for Amazon";
        reverseAmazon(a);


    }
}
