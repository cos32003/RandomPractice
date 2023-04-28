package PracticeCoding;

public class Print1To100WithoutLoop {
    static void printnumberfromonetoone(int c,int d){
        if(c<=d){
           System.out.println(c);
           c=c+1;
           printnumberfromonetoone(c,d);
        }

    }


    public static void main(String[] args){
        int a = 1;
        int b = 5;
        printnumberfromonetoone(a,b);
    }
}
