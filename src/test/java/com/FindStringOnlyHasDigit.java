package PracticeCoding;

public class FindStringOnlyHasDigit {
    static boolean findnumber(String a){
        if(a.isEmpty()){
            return false;
        }
        char[] chars = a.toCharArray();
        for(Character c:chars){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args){
        System.out.println(findnumber("12345"));
        System.out.println(findnumber("YuttEE"));
        System.out.println(findnumber("89UIuy"));
    }
}
