package PracticeCoding;

public class SumOfNumber {
    static int Sum(int b) {
        int sum = 0;
        while (b > 0) {
            int c = b % 10;
            sum = sum + c;
            b = b / 10;
        }

        System.out.println(sum);
        return sum;


    }




    public static void main(String[] args){
        int a = 83456;
        Sum(a);

    }
}
