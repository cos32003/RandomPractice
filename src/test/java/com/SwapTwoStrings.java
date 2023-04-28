package PracticeCoding;

public class SwapTwoStrings {
    public static void main(String[] args){
        String a = "Hello";
        String b = "World";
        String c = a + b;

        a = c.substring(5,10);
        b = c.substring(0,5);

        System.out.println(a);
        System.out.println(b);
    }
}
