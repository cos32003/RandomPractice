package PracticeCoding;

public class MaximumSubarray {
    static int maxnumber(int[] b){
        int max =b[0];
        int dp = b[0];
        for(int i=1;i<b.length;i++){
            dp=Math.max(dp+b[i],b[i]);
            max=Math.max(max,dp);
        }
        return max;
    }

    public static void main(String[] args){
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        maxnumber(a);
    }
}
