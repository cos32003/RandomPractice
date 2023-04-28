package PracticeCoding;

public class SwapTwoNumbersWithoutTemp {
    public static void Swap(int num1,int num2){
        int sum = num1 + num2;
        num1 = sum - num1;
        num2 = sum - num2;
        System.out.println(num1);
        System.out.println(num2);

    }
}
