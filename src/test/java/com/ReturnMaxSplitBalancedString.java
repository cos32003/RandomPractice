package PracticeCoding;
/* To get how many max sub string can get which substring include equal R and L.

 */

public class ReturnMaxSplitBalancedString {

    static int balancedStringSplit(String b){
        int count = 0;
        int balancecount = 0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i) == 'R'){
                count++;
            }
            if(b.charAt(i) == 'L'){
                count--;
            }
            if(count == 0){
                balancecount++;
            }
        }
        return balancecount;
    }


    public static void main(String[] args){
        String a = "RLRRLLRLRL";
        balancedStringSplit(a);
        System.out.println(balancedStringSplit(a));
    }
}
