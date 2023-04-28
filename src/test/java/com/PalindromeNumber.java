package PracticeCoding;

public class PalindromeNumber {
    static boolean verifyPalindromeNumber(int b){

        StringBuffer stringBuffer = new StringBuffer(String.valueOf(Math.abs(b)));
        String c = String.valueOf(stringBuffer.reverse());
        int d = Integer.valueOf(c);
        if(d==b){
            return true;
        }else{
            return false;
        }



    }

    public static void main(String[] args){
        int a = -121;
        verifyPalindromeNumber(a);
    }
}
