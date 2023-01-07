package Trees.Traversal;

import Trees.BuildTreeClass.BinaryTree;
import java.util.*;

public class RootToNodePath {
    
    public static boolean find(BinaryTree.Node root, int data, ArrayList<Integer> ans){
        if(root == null){
            return false;
        }

        if(root.data == data){
            ans.add(root.data);
            return true;
        }

        boolean filc = find(root.left, data, ans);
        if(filc){
            ans.add(root.data);
            return true;
        }

        boolean firc = find(root.right, data, ans);
        if(firc){
            ans.add(root.data);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        ArrayList<Integer> ans = new ArrayList<>();

        find(root, 6, ans);

        System.out.println(ans.toString());


    }
}
