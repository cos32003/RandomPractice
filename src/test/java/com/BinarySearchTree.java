package PracticeCoding;
/*
Binarysearchtree is tree with root, left less than root, right more than root
 */

public class BinarySearchTree {

    static class Node{
        char key;
        Node right,left;

        public Node(char key) {
        }

        void Node(char key){
            this.key = key;
        }
    }

    static class Binarysearchtreesolution{
        Node root;
        void insertkey(char key){
            root = insertIntree(root,key);

        }
        Node insertIntree(Node root, char key){
            if(root == null){
                root = new Node(key);
                return root; 

            }
            if(key<root.key){
                root.left=insertIntree(root.left,key);
            }
            if(key>root.key){
                root.right=insertIntree(root.right,key);
            }

            return root;
        }
        void preorder(Node root){
            if(root!=null){
                System.out.println(root.key + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }
    }
    public static void main(String[] args){
         Binarysearchtreesolution t2 = new Binarysearchtreesolution();
         t2.insertkey('C');
         t2.insertkey('I');
         t2.insertkey('B');
         t2.insertkey('G');
         t2.insertkey('M');
         t2.insertkey('A');
         t2.preorder(t2.root);



    }
}
