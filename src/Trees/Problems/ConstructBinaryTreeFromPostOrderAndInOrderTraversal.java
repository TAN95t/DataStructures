package Trees.Problems;

public class ConstructBinaryTreeFromPostOrderAndInOrderTraversal {
    
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static Node buildTree(int[] postOrder, int psi, int pei, int[] inOrder, int isi, int iei){
        if(isi > iei) return null;

        int idx = isi;
        while(inOrder[idx] != postOrder[pei]) idx++;

        int colse = idx-isi;

        Node node = new Node(postOrder[pei]);
        node.left = buildTree(postOrder, psi, psi+colse-1, inOrder, isi, idx-1);
        node.right = buildTree(postOrder, psi+colse, pei-1, inOrder, idx+1, iei);

        return node;
    }

    public static void printPreOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);


    }
    

    public static void main(String[] args){
        int postOrder[] = {7,8,3,9,10,4,1,11,5,6,2,0};
        int inOrder[] = {7,3,8,1,9,4,10,0,11,5,2,6};

        Node root = buildTree(postOrder, 0, postOrder.length-1, inOrder, 0, inOrder.length-1);

        System.out.println(root.data);
        System.out.println("preorder traversal:");
        printPreOrder(root);

    }
}
