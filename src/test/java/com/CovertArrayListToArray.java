package PracticeCoding;

import java.util.ArrayList;

public class CovertArrayListToArray {
    static String[] covert(ArrayList<String> arraylist1){

      String[] array = arraylist1.toArray(new String[0]);
      for(String a:array){
          System.out.println(a);
      }
      return array;
    }




    public static void main(String[] args){
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("ab");
        arraylist.add("cd");
        arraylist.add("ef");
        covert(arraylist);
    }
}
