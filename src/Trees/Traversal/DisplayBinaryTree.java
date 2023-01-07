package Trees.Traversal;

import Trees.BuildTreeClass.BinaryTree;

public class DisplayBinaryTree {
    
    public static void display(BinaryTree.Node root){
        if(root == null){
            return;
        }

        String str = "";
        str += root.left == null ? "." : root.left.data + "";
        str += root.data;
        str += root.right == null ? "." : root.right.data + "";
        System.out.println(str);

        display(root.left);
        display(root.right);
    }


    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        display(root);
    }
}
