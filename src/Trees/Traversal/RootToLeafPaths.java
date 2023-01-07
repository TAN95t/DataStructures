package Trees.Traversal;

import Trees.BuildTreeClass.BinaryTree;

import java.util.*;

public class RootToLeafPaths {

    public static boolean isLeaf(BinaryTree.Node root){
        if(root.left == null && root.right == null){
            return true;
        }

        return false;
    }
    
    public static void findPaths(BinaryTree.Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> paths){
        if(root == null){
            return;
        }
        if(isLeaf(root)){
            path.add(root.data);
            paths.add(new ArrayList<Integer>(path));
            return;
        }
        path.add(root.data);
        findPaths(root.left,new ArrayList<>(path), paths);
        findPaths(root.right,new ArrayList<>(path), paths);
    }


    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();

        findPaths(root, path, paths);

        System.out.println(paths.toString());
    }
}
