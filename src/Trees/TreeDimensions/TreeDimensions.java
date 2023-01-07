package Trees.TreeDimensions;

import Trees.BuildTreeClass.BinaryTree;

public class TreeDimensions {

    public static int size(BinaryTree.Node root){
        if(root == null){
            return 0;
        }

        int ls = size(root.left);
        int rs = size(root.right);
        int ts = ls + rs + 1;
        return ts;
    }

    public static int sum(BinaryTree.Node root){
        if(root == null){
            return 0;
        }
        int lsm = sum(root.left);
        int rsm = sum(root.right);
        int tsm = lsm + rsm + root.data;

        return tsm;
    }

    public static int max(BinaryTree.Node root){

        if(root == null){
            return Integer.MIN_VALUE;
        }

        int lm = max(root.left);
        int rm = max(root.right);
        int max = (Math.max(Math.max(lm, rm), root.data));

        return max;
    }

    public static int height(BinaryTree.Node root){
        if(root == null){
            return 0; // height in terms of nodes return 0
            // return -1 if height in terms of edges in needed
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int th = Math.max(lh, rh) + 1;

        return th;
    }
    

    public static void main(String[] args) {
        int nodes[] = {50,25,12,-1,-1,37,30,-1,-1,-1,75,62,-1,70,-1,-1,87,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        System.out.println("sum of all nodes: "+sum(root));
        System.out.println("size of binary tree: "+size(root));
        System.out.println("Maximum of  binary tree: "+ max(root));
        System.out.println("Height in terms of nodes: "+ height(root));
    }
}
