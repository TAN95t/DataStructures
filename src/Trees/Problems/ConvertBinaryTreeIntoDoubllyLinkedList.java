package Trees.Problems;


class Node {
    int data;
    Node left;
    Node right;

    Node (int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}



public class ConvertBinaryTreeIntoDoubllyLinkedList {

    static Node head = null;
    static Node prev = null;

    public static void flatten(Node root) {
        if(root == null){
            return;
        }

        flatten(root.left);

        if(head == null){
            head = prev = root;
        }

        else{
            prev.right = root;
            root.left = prev;
            prev = root;
        }
        flatten(root.right);
        
    }

    public static Node toDLL(Node root) {

        head = null;
        prev = null;

        // boolean f = false;

        flatten(root);

        return head;
    }
    

    public static void main(String[] args){

    }


}
