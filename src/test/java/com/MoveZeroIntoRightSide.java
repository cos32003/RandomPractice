package PracticeCoding;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroIntoRightSide {

    static  Object[] movezero(int [] b){
    List<Integer> list = new ArrayList<>();
    int[] result;
    for(int i=0; i<b.length;i++){
       if(b[i] != 0) {
           list.add(b[i]);
       }


    }
    System.out.println(list);
    for(int j=0; j<b.length;j++){
        if(b[j] == 0){
            list.add(b[j]);
        }
    }
    System.out.println(list);
    return list.toArray();


    }




    public static void main(String[] args){
      int [] a = {1,2,3,0,0,3,0,6};
      movezero(a);
    }
}
