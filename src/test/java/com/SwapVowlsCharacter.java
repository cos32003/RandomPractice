package PracticeCoding;

public class SwapVowlsCharacter {
    static String findvowel(String b){
        char[] ch = b.toCharArray();
        int leftpointer = 0;
        int rightpointer = b.length()-1;
        while(leftpointer<rightpointer){
            boolean leftvowel = isVowel(ch[leftpointer]);
            boolean rightvowel =isVowel(ch[rightpointer]);
            if(leftvowel && rightvowel){
                swap(ch,leftpointer,rightpointer);
                leftpointer++;
                rightpointer--;

            }
            else if(leftvowel == false){
                leftpointer++;

            }
            else if(!rightvowel== false){
                rightpointer--;
            }

        }
        System.out.println(ch);
       return new String(ch);



    }
    static boolean isVowel(char letter){
        char c = Character.toLowerCase(letter);
       if(c == 'a' || c =='e' || c =='i' || c =='o' || c == 'u'){
            return true;
        }else{
            return false;
        }
         //return c == 'a' || c =='e' || c =='i' || c =='o' || c == 'u';

    }
    static void swap(char[] arr, int i, int j){
        char temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }






    public static void main(String[] args){
        String a ="ApplePie";
        findvowel(a);




    }
}
