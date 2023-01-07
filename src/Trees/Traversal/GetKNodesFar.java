package Trees.Traversal;

import Trees.BuildTreeClass.BinaryTree;
import java.util.*;

public class GetKNodesFar {

    public static void printKlevelsDown(BinaryTree.Node root, int k, BinaryTree.Node blocker){
        if(k<0 || root == null || root == blocker){
            return;
        }
        if(k == 0){
            System.out.print(root.data);
        }
        printKlevelsDown(root.left, k-1, blocker);
        printKlevelsDown(root.right, k-1, blocker);

    }

    public static boolean findPath(BinaryTree.Node root, int data, ArrayList<BinaryTree.Node> path){
        if(root == null){
            return false;
        }

        if(root.data == data){
            path.add(root);
            return true;
        }

        boolean filc = findPath(root.left, data, path);
        if(filc){
            path.add(root);
            return true;
        }

        boolean firc = findPath(root.right, data, path);
        if(firc){
            path.add(root);
            return true;
        }

        return false;
    }

    public static void findKlevelsFar(BinaryTree.Node root, int data, int k){
        ArrayList<BinaryTree.Node> path = new ArrayList<>();
        findPath(root, data , path);
        for(int i=0; i<path.size() && i<=k; i++){
            printKlevelsDown(path.get(i), k-i, i == 0 ? null :  path.get(i-1));
        }
    }
    

    public static void main(String[] args){
        int nodes[] = {50,25,12,-1,-1,37,30,-1,-1,-1,75,62,-1,70,-1,-1,87,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        findKlevelsFar(root,75,2);
    }
}
