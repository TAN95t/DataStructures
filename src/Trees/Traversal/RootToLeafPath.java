package Trees.Traversal;

import Trees.BuildTreeClass.BinaryTree;

public class RootToLeafPath {
    public static boolean isLeaf(BinaryTree.Node root){
        if(root.left == null && root.right == null){
            return true;
        }

        return false;
    }

    public static void pathToLeafFromRoot(BinaryTree.Node root,String path, int sum, int lo, int high){
        if(root == null){
            return;
        }
        if(isLeaf(root)){
            sum += root.data;
            if(sum  >= lo && sum <= high){
                System.out.println(path+root.data);
            }
            return;
        }

        pathToLeafFromRoot(root.left, path + root.data + " ", sum + root.data, lo, high);
        pathToLeafFromRoot(root.right, path + root.data + " ", sum + root.data, lo, high);

    }

    public static void main(String[] args){
        int nodes[] = {50,25,12,-1,-1,37,30,-1,-1,-1,75,62,-1,70,-1,-1,87,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);
    }
}
