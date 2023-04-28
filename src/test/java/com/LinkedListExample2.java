package PracticeCoding;
/*
 circular linkedlist: every node has head, data, last node's tail point to first element. If the head node lost, the whole linkedlist is lose
 */

public class LinkedListExample2 {
    Node head,tail;

    class Node{
        int data;
        Node next;
        Node(int data){
             this.data = data;

        }
    }
    void insertElement(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            tail.next = head;

        }else{
            tail.next=newnode;
            tail = newnode;
            tail.next = head;
        }


    }
    void displayElements(){
        Node n1 = head;
        if(tail==null && head==null) {
            System.out.println("The linkedlist is empty");
        }else{
            do{
                System.out.println(n1.data);
                n1=n1.next;

            }while(n1!=head);
        }
    }
    void deleteElements(){
        if(tail!=head){
            //delete the first one
            head=head.next;
            tail.next=head;

        }else{
            head=tail=null;
        }
    }
    public static void main(String[] args){

        LinkedListExample2 list1 = new LinkedListExample2();
        list1.insertElement(2);
        list1.insertElement(7);
        list1.insertElement(8);
        list1.displayElements();
        list1.deleteElements();
        list1.displayElements();


    }
}
