package Trees.Traversal;

import Trees.BuildTreeClass.BinaryTree;

public class PrintKlevelsDown {
    
    public static void printKlevelsDown(BinaryTree.Node root, int k){
        if(root == null || k<0){
            return;
        }
        if(k == 0){
            System.out.print(root.data);
        }
        printKlevelsDown(root.left, k-1);
        printKlevelsDown(root.right, k-1);

    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        printKlevelsDown(root, 2);
    }
}
