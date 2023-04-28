package PracticeCoding;

public class CalcuateFactorialNumber {
    public static int FactorialNumber(int num){
        int result = 1;
        if(num == 0 || num == 1 || num == -1 ){
            return num;
        }
        else if(num > 1) {

            for (int i = 1; i <= num; i++) {
                result = result * i;

            }
        }
        else if(num < -1){
            for(int i = -1;i >= num;i--){
                result = result * i;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int num = -5;
        int result = FactorialNumber(num);
        System.out.println(result);
    }
}
