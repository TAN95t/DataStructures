package Trees.Problems;

import Trees.BuildTreeClass.BinaryTree;

public class RemoveLeavesFromTree {
    
    public static boolean isLeaf(BinaryTree.Node root){
        if(root.left == null && root.right == null){
            return true;
        }

        return false;
    }

    public static BinaryTree.Node removeLeaves(BinaryTree.Node root){
        if(root == null){
            return null;
        }

        if(isLeaf(root)){
            return null;
        }

        BinaryTree.Node lst = removeLeaves(root.left);
        BinaryTree.Node rst = removeLeaves(root.right);

        root.left = lst;
        root.right = rst;

        return root;
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        BinaryTree.Node root1 = removeLeaves(root);

        System.out.println(root1.data);
    }
}
