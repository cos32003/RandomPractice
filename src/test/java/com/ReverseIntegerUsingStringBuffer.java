package PracticeCoding;

public class ReverseIntegerUsingStringBuffer {

    public static void main(String[] args){
        long s = 32434;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(s));
        System.out.println(stringBuffer.reverse());

    }
}
