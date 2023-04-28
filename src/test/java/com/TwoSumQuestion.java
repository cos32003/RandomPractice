package PracticeCoding;

import java.util.HashMap;

public class TwoSumQuestion {

    public static int[] TwoSum(int[] arr,int target) {
        HashMap<Integer, Integer> result = new HashMap<>();
        int[] result_index = new int[0];
        for (int i = 0; i < arr.length; i++) {
            int rest = target - arr[i];
            if (!result.containsKey(rest)) {
                result.put(arr[i], i);
            } else {

                int another_index = result.get(rest);
                result_index = new int[]{i, another_index};


            }
        }
        System.out.println(result_index[0]);
        System.out.println(result_index[1]);
        return result_index;


    }

    public static void main(String[] args){
        int[] arr = {1,2,5,7};
        int target = 9;
        TwoSum(arr,target);
    }
}
