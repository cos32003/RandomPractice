package PracticeCoding;

public class ReverseString {

    static String reserse(String b){
             int i = 0;
             int j= b.length()-1;
             char[] ch = b.toCharArray();
             while(i<j){
                 char temp = ch[i];
                 ch[i] = ch[j];
                 ch[j] = temp;
                 i++;
                 if(i!=j){
                 j--;}



             }
             System.out.println(ch);
             return ch.toString();
  }

    public static void main(String[] args){
        String a = "amazon";
        reserse(a);

    }
}
