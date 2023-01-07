package Trees.Traversal;

import java.util.*;

import Trees.BuildTreeClass.BinaryTree;

public class BoundaryTraversal {

    public static boolean isLeaf(BinaryTree.Node root){
        if(root.left == null && root.right == null){
            return true;
        }

        return false;
    }

    public static void getLeftBoundary(BinaryTree.Node root, ArrayList<Integer> ans){
        BinaryTree.Node curr = root.left;
        while(curr != null && !isLeaf(curr)){
            ans.add(curr.data);
            if(curr.left != null){
                curr = curr.left;
            }
            else if(curr.right != null){
                curr = curr.right;
            }
        }
    }

    public static void getLeaves(BinaryTree.Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        if(isLeaf(root)){   
            ans.add(root.data);
            return;
        }

        getLeaves(root.left, ans);
        getLeaves(root.right, ans);

    }
    
    public static void boundaryTraversal(BinaryTree.Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);

        getLeftBoundary(root, ans);
        getLeaves(root, ans);
        getRightBoundary(root.right, ans);

        System.out.println(ans.toString());
    }

    public static void getRightBoundary(BinaryTree.Node root, ArrayList<Integer> ans) {
        if(root == null){
            return;
        }

        getRightBoundary(root.right, ans);
        getRightBoundary(root.left, ans);
        if(!isLeaf(root)){
            ans.add(root.data);
        }
        
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        boundaryTraversal(root);
    }
}
