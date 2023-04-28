package PracticeCoding;

public class InnerClass {
    static class Innerclass1{
        void method1(){
            System.out.println("Use method1");
        }
    }
    class Innerclass2{
        void method2(){
            System.out.println("Use method2");
        }
    }

    public static void main(String[] args){
        InnerClass object1 = new InnerClass();
        InnerClass.Innerclass2 object2 = object1.new Innerclass2();
        InnerClass.Innerclass1 object3 = new InnerClass.Innerclass1();
        object3.method1();
        object2.method2();
    }
}


