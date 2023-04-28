package PracticeCoding;

public class SumOfDigitalOfNumber {
    static int  sumdigitalofnumber(int a){
        int sum = 0;
        while(a>0){
            sum = sum + a%10;
            a = a/10;
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args){
        int s = 2345;
        sumdigitalofnumber(s);
    }
}
