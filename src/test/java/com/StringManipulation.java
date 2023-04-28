package PracticeCoding;

public class StringManipulation {
    public static void main(String[] args){
        String str = "The rains have started over";
        String str1 = "The rains Have started over";
        System.out.println(str.length());
        System.out.println(str.charAt(5));//return the fifth character
        System.out.println(str.indexOf("rains"));//return what is the first index of string s
        System.out.println(str.indexOf("s",9));//return the index of s but it start to count from index 9
        System.out.println(str.indexOf("have"));
        System.out.println(str.indexOf("HELLO"));//the string doesn't exist, it returns -1

        //compare string
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        //trim
        String s = "   Hello     Sarah  ";
        System.out.println(s.trim());//only trim before the string and after the string, it doesn't trim the middle.
        System.out.println(s.replaceAll("Sarah","Sumit"));

        //get substring
        System.out.println("Substring is "+ str.substring(0,2)); //substring, the begin index is include and end index is exclude.

        //split
        String test = "Hello_world_Test_Selenium";
        String aftersplit[] = test.split("_");
        for(String a:aftersplit){
            System.out.println(a);
        }
        String s2 = "cares";
        System.out.println(s2.concat("s"));
    }
}
