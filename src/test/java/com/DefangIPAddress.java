package PracticeCoding;

public class DefangIPAddress {
    public static String IPAddress(String address){
      return address.replace(".","[.]");

    }

    public static void main(String[] args){
        String a = "1.1.1.1";
        IPAddress(a);
        System.out.println(IPAddress(a));

    }
}
