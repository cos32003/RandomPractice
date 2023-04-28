package PracticeCoding;

public class BinaryTreeExample {
    static class Node{
        char key;
        Node left,right;
        Node(char key){
            this.key=key;
        }

    }
    static class TreeTravelsal{
        Node root;
        //Node n means the root
        void preorderTravelsal(Node n){
            //preorder mean root/left/right
            if(n!=null){
                System.out.println(n.key+" ");
                preorderTravelsal(n.left);
                preorderTravelsal(n.right);
            }

        }
        void postorderTravelsal(Node n){
            //postorder mean left/right/root
            if(n!=null){
                postorderTravelsal(n.left);
                postorderTravelsal(n.right);
                System.out.println(n.key+" ");
            }

        }
        void inorderTravelsal(Node n){
           //inorder means left/root/right
            if(n!=null){
                inorderTravelsal(n.left);
                System.out.println(n.key+" ");
                inorderTravelsal(n.right);

            }
        }
    }
    public static void main(String[] args){
        TreeTravelsal t1 = new TreeTravelsal();
        //create a binary tree
        t1.root = new Node('A');
        t1.root.left = new Node('B');
        t1.root.right = new Node('C');
        t1.root.left.left = new Node('D');
        t1.root.left.right = new Node('E');
        t1.preorderTravelsal(t1.root);
        System.out.println();
        t1.postorderTravelsal(t1.root);
        System.out.println();
        t1.inorderTravelsal(t1.root);
    }
}
