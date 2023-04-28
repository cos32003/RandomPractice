package PracticeCoding;

import java.util.Scanner;

public class PasswordVerify {

    public static String getpassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password:");
        return scanner.nextLine();

    }

    public static void verifypassword(String password){
        if(password.length()>9){
                System.out.println("Password length is correct");

        if(password.matches(".*[a-z].*")){
            System.out.println("Password contains lowercase letter");
        }else{
            System.out.println("Password does not contain lowercase letter");
        }
        if(password.matches(".*[A-Z].*")){
            System.out.println("Password contains uppercase letter");
        }else{
            System.out.println("Password does not contain uppercase letter");
        }
        if(password.matches(".*[0-9].*")){
            System.out.println("Password contains number");
        }else{
            System.out.println("Password does not contain number");
        }
        if(password.matches(".*[@#$%^&*()_+}{;':].*")){
            System.out.println("Password contains special character");
        }else{
            System.out.println("Password does not contain special character");
        }

    }
        else{
            System.out.println("Password should be at least 10 characters long");
        }
    }

    public static void main(String args[]) {
        String password = getpassword();
        verifypassword(password);
    }
}


