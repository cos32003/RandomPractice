package PracticeCoding;

public class ReverseInteger {
    static  int  reverseInt(int b) {
        int temp =0;
        while(b!=0){
            temp=temp*10+b%10;
            b=b/10;
        }
        System.out.println(temp);
        return temp;
    }


    public static void main(String[] args){
        int a = 3214;
        reverseInt(a);


    }
}
