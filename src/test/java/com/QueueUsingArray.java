package PracticeCoding;
/* queue is O(1), Linear data structure. First come first out*/

public class QueueUsingArray {
    static int front_Q;
    static int rear_Q;
    static int capabilityofQueue;
    static int[] q1;

    public QueueUsingArray(int size) {
        capabilityofQueue = size;
        q1 = new int[capabilityofQueue];

    }

       void enqueue(int value) {
            if(rear_Q == capabilityofQueue){
                System.out.println("Q is full, can't insert");
            }else{
                q1[rear_Q]=value;
                rear_Q++;
            }


        }
        void dequeue(){
        if(rear_Q==0){
            System.out.println("Queue is empty, there is nothing to delete");
        }else{
            for(int i=0;i<rear_Q-1;i++){
                q1[i]=q1[i+1];
            }
            rear_Q=rear_Q-1;
        }

        }
        void display(){
        if(rear_Q==0){
            System.out.println("Queue is empty, there is nothing to display");
        }else{
            for(int i=0;i<rear_Q;i++){
                System.out.println(q1[i]);
            }
        }
        }


    }



