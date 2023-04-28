package PracticeCoding;

import java.util.ArrayList;
import java.util.List;

public class FindThreeInt {

    static void findthreeelement(int[] a) {
        List<Integer> arraylist = new ArrayList<>();



        for (int i = 0; i < a.length-2; i++) {
            if (a[i] == a[i + 2]) {
                System.out.println(a[i]);
                System.out.println(a[i + 1]);
                System.out.println(a[i + 2]);

            }
        }

    }
    public static void main(String[] args){

        int[] a={1,2,1,2,7,8,3,3,3};
        findthreeelement(a);

    }

}
