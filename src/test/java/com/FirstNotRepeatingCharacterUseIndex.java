package PracticeCoding;

public class FirstNotRepeatingCharacterUseIndex {
    static void useindexTofindfirstnotrepeatingchar(String b){
        for(int i=0; i<b.length();i++){
            if(b.indexOf(b.charAt(i)) == b.lastIndexOf(b.charAt(i))){
                System.out.println(b.charAt(i));
            }
        }
    }

    public static void main(String[] args){
        String a = "aabcdd";
        useindexTofindfirstnotrepeatingchar(a);
    }
}
