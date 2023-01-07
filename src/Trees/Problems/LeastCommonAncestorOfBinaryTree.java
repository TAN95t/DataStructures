package Trees.Problems;



public class LeastCommonAncestorOfBinaryTree {
    
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node  LCA = null;

    public boolean LCA_DFS(Node root, int p, int q){
        if(root == null && LCA != null){
            return false;
        }

        boolean self = (root.data == p || root.data == q);

        boolean left = LCA_DFS(root.left, p, q);

        boolean right = LCA_DFS(root.right, p, q);

        if((left && right) || (left && self) || (right && self)){
            LCA = root;
        }

        return left || right || self;
    }

    public static void main(String[] args){

    }

}
