package PracticeCoding;

import org.apache.commons.lang3.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthese {
    static boolean validStringParenthese(String b){


        Stack<Character> stack = new Stack<>();
        for(int i=0;i<b.length();i++){
       for(Character c:b.toCharArray()){
           if(c=='('|| c=='{' || c=='['){
               stack.push(c);
           }
           else if( c==')' && !stack.isEmpty() && stack.peek() =='('){
               stack.pop();
           }
           else if( c=='}' && !stack.isEmpty() && stack.peek() =='{'){
               stack.pop();
           }
           else if( c==']' && !stack.isEmpty() && stack.peek() == '['){
               stack.pop();
           }
        }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args){
        String a ="(){}";
        validStringParenthese(a);

    }
}
