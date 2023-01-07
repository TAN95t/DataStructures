package Trees.Traversal;

import Trees.BuildTreeClass.BinaryTree;

public class PrePostIn {
    
    public static void preOrder(BinaryTree.Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(BinaryTree.Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(BinaryTree.Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args){
        int nodes[] = {50,25,12,-1,-1,37,30,-1,-1,-1,75,62,-1,70,-1,-1,87,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        System.out.print("PreOrder Traversal: ");
        preOrder(root);
        System.out.println();
        System.out.print("PostOrder Traversal: ");
        postOrder(root);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        inOrder(root);
    }
}
