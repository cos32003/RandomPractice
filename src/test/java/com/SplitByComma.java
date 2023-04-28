package PracticeCoding;

public class SplitByComma {
    public static void main(String[] args){
        String a = "Java,Selenium,TestNg,Maven";
        String b[] = a.split(",");
        for(String c:b){
            System.out.println(c);
        }
    }
}
