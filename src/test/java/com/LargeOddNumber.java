package PracticeCoding;

public class LargeOddNumber {
    static String largeoddnumber(String b){
        for(int i=b.length()-1;i>=0;i--){
            if(Integer.parseInt(""+ b.charAt(i)) % 2 !=0 ){
                System.out.println(b.substring(0,i+1));
                return b.substring(0,i+1);
            }
        }
        return "";
    }

    public static void main(String[] args){
        String a = "765";
        largeoddnumber(a);
    }
}
