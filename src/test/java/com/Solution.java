package PracticeCoding;
/* leecode 20
Use Stack to resolve it.

 */

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char a:s.toCharArray()){
            if(a =='(' || a =='{' || a=='['){
                stack.push(a);
            }else if(a == ')' && !stack.isEmpty() && stack.peek().equals('('))
            {
                stack.pop();
            }
            else if(a == '}' && !stack.isEmpty() && stack.peek().equals('{'))
            {
                    stack.pop();
                }
            else if(a == ']' && !stack.isEmpty() && stack.peek().equals('['))
            {
                    stack.pop();
                }
            else{
                return false;
            }


        }

        return stack.isEmpty();
    }
    public static void main(String[] args){
        String a = "[()]";
        isValid(a);
    }
}
