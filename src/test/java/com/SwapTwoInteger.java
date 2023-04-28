package PracticeCoding;

public class SwapTwoInteger {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int sum = 0;
        sum = x + y;
        x=sum - x;
        y=sum - y;
        System.out.println(x);
        System.out.println(y);
    }
}
