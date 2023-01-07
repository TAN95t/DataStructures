package Trees.Problems;

import Trees.BuildTreeClass.BinaryTree;
// import Trees.BuildTreeClass.BinaryTree.Node;

public class HeightBalancedBinaryTree {
    
    public static boolean isBal = true;

    static class BalPair {
        int ht;
        boolean Bal;
    }

    public static BalPair NodeData(BinaryTree.Node root){
        if(root == null){
            BalPair bp = new BalPair();
            bp.ht = 0;
            bp.Bal = true;
            return bp;
        }

        BalPair lp = NodeData(root.left);
        BalPair rp = NodeData(root.right);

        BalPair mp = new BalPair();
        mp.ht = Math.max(lp.ht, rp.ht) + 1;
        mp.Bal = Math.abs(lp.ht - rp.ht) <= 1 && lp.Bal && rp.Bal;

        return mp;
    }

    public static int isBalanced(BinaryTree.Node node){
        if(node == null){
            return 0;
        }

        int lh = isBalanced(node.left);
        int rh = isBalanced(node.right);

        int gap = Math.abs(lh-rh);
        if(gap > 1){
            isBal = false;
        }

        int th = Math.max(lh, rh) + 1;
        return th;
    }
    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        // BinaryTree.Node root1 = removeLeaves(root);

        // System.out.println(root1.data);
    }
}
