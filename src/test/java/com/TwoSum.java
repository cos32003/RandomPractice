package PracticeCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public static int[] twoSum(int[] nums,int target){
            Map<Integer,Integer> hashmap = new HashMap<>();

            for(int j=0;j< nums.length;j++){
                int rest = target -nums[j];
                while(hashmap.containsKey(rest)){
                    int another = (hashmap.get(rest));
                    return new int[] {j,another};
                }
                    hashmap.put(nums[j],j);


            }
            return new int[]{-1,-1};
            }

        public static void main(String[] args){
            int[] a = {2,11,7,5};
            int b = 9;
            int[] result = twoSum(a,b);
            System.out.println(result[0]+" "+result[1]);

        }
}
