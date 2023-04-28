package PracticeCoding;
/*
Input: aaaabbcca
Output: 4a2b2c1a
aaaabbcca
i
j
 */

import java.util.ArrayList;
import java.util.List;

public class EncodingString {
    static void encodeString(String b){
        char[] ch = b.toCharArray();
        List<Character> arraylist = new ArrayList<>();
        while(b==null && b.length()==0){
            //return new String[] {"-1"};
            System.out.println("Array is invalid");
            //return "-1";
        }
        int i =0;

     while(i<b.length()){
          if(arraylist.isEmpty() || arraylist.contains(ch[i])){
              arraylist.add(ch[i]);
              i++;
              if(i==b.length()){
                  String c1=String.valueOf(arraylist.size());
                  String c2=String.valueOf(arraylist.get(0));
                  System.out.println(c1+c2);
              }

          }
          else if(!arraylist.isEmpty() && !arraylist.contains(ch[i])){
              String c1=String.valueOf(arraylist.size());
              String c2=String.valueOf(arraylist.get(0));
              System.out.println(c1+c2);
              arraylist.clear();
              arraylist.add(ch[i]);
              i++;
              if(i==b.length()){
                  String c3=String.valueOf(arraylist.size());
                  String c4=String.valueOf(arraylist.get(0));
                  System.out.println(c3+c4);
              }

          }
      }
    }

    public static void main(String[] args){
        String a = "aabcaaa";
        encodeString(a);

    }
}
