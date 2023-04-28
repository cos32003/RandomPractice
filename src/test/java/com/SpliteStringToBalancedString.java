package PracticeCoding;

public class SpliteStringToBalancedString {

    static int spliteToBalancedString(String a){
        int lcounter=0;
        int rcounter=0;
        int totalcounter=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == 'R'){
                rcounter++;
            }
            if(a.charAt(i) == 'L'){
                lcounter++;
            }
            if(rcounter == lcounter){
                totalcounter++;
            }
        }



            System.out.println(totalcounter);
            return totalcounter;
    }

    public static void main(String[] args){
        String b = "RLLLLRRRLR";
        spliteToBalancedString(b);
    }
}
