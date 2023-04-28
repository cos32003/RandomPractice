package PracticeCoding;
/*
Linkedlist is linear data structure. can access elements on linear fashion. elements can be stored as per memory available. dymanic size
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(3);
        l1.add(7);
        l1.add(10);
        l1.add(2,6);
        l1.remove(2);
        Iterator it=l1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+","+" ");
        }
        System.out.println("/n");
        System.out.println("The size of linkedlist is "+ l1.size());
        boolean b1 = l1.contains(9);
        System.out.println(b1);
        //copy all the elements from stack to linkedlist
        Stack<String> stack = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();
        stack.push("Hello");
        stack.push("everyone");
        l2.addAll(stack);
        System.out.println("The LinkedList list is: "+l2);




    }
}
