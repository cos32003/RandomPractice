package PracticeCoding;

public class ReverseInt {
    public static void main(String[] args){
        long num = 456787;
        long temp = 0;
        while(num!=0){
            temp = temp * 10 + num%10;
            num = num/10;
        }
        System.out.println(temp);
    }
}
