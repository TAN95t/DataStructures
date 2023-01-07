package Trees.TreeDimensions;

import Trees.BuildTreeClass.BinaryTree;

public class DiameterOfTree {

    public static int height(BinaryTree.Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int th = Math.max(lh, rh) + 1;

        return th;
    }
    
    public static int diameter(BinaryTree.Node root){
        if(root == null){
            return 0;
        }
        // maximum distance between two nodes on lhs
        int ld = diameter(root.left);
        // maximum distance between two nodes on rhs
        int rd = diameter(root.right);
        // distance between lefts deepest and rights deepest nodes
        int f =  height(root.left) + height(root.right) + 2;

        int diameter = Math.max(Math.max(ld, rd), f);

        return diameter;
    }

    static class DiaPair{
        int ht;
        int dia;
    }

    public static DiaPair diameter2(BinaryTree.Node root){
        if(root == null){
            DiaPair bp = new DiaPair();
            bp.ht = -1;
            bp.dia = 0;
            return bp;
        }

        DiaPair lp = diameter2(root.left);
        DiaPair rp = diameter2(root.right);

        DiaPair mp = new DiaPair();
        mp.ht = Math.max(lp.ht, rp.ht)+ 1;

        int fes = lp.ht + rp.ht + 2;
        mp.dia = Math.max(fes, Math.max(lp.dia, rp.dia));

        return mp;
    }

    public static int findDia(BinaryTree.Node root){
        DiaPair pair = diameter2(root);


        return pair.dia;

    }
    
    public static void main(String[] args){
        int nodes[] = {50,25,12,-1,-1,37,30,-1,-1,-1,75,62,-1,70,-1,-1,87,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        System.out.println(diameter(root));

        System.out.println(findDia(root));
    }
}
