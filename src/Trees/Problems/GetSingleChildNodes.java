package Trees.Problems;

import java.util.*;
import Trees.BuildTreeClass.BinaryTree;

public class GetSingleChildNodes {
    
    public static boolean hasSingleChild(BinaryTree.Node root, BinaryTree.Node parent){
        if(parent != null && parent.right == null && parent.left == root){
            return true;
        }
        else if(parent != null && parent.left == null && parent.right == root){
            return true;
        }

        return false;
    }

    public static void getSingleChildrens(BinaryTree.Node root, BinaryTree.Node parent, ArrayList<Integer> singles){
        if(root == null){
            return;
        }

        if(hasSingleChild(root, parent)){
            singles.add(root.data);
        }

        getSingleChildrens(root.left, root, singles);
        getSingleChildrens(root.right, root, singles);
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        ArrayList<Integer> singles = new ArrayList<>();

        getSingleChildrens(root, null, singles);

        System.out.println(singles.toString());
    }
}
