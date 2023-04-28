package PracticeCoding;
/*
define prefix as first string of the array, “flower"
if this second one "flow" is  start with "flower", get substring which means delete last letter until find the start substring "flow"
Then
 */

import java.util.HashSet;

public class LongestCommonPrefix {
    static String longcommprofxi(String[] str1){
        if(str1 == null || str1.length ==0){
            return "";
        }
         String prefix = str1[0];
         for(int i=1;i< str1.length;i++){
             while (!str1[i].startsWith(prefix)){
                 prefix = prefix.substring(0,prefix.length()-1);
             }
         }

         System.out.println(prefix);
         return prefix;
    }

    public static void main(String[] args){
        String[] str={"flower","flow","flight"};//find the longest prefix common substring, for this case it should be "fl"
        longcommprofxi(str);
    }
}
