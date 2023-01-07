package Trees.Problems;

import Trees.BuildTreeClass.BinaryTree;

public class TransformToLeftClonedTree {
    

    public static BinaryTree.Node transformToLeftClonedTree(BinaryTree.Node root){
        if(root == null){
            return null;
        }

        BinaryTree.Node lcr = transformToLeftClonedTree(root.left);
        BinaryTree.Node rcr = transformToLeftClonedTree(root.right);

        BinaryTree.Node nn = new BinaryTree.Node(root.data);
        nn.right = null;
        nn.left = lcr;

        root.left = nn;
        root.right = rcr;

        return root;
    }

    public static BinaryTree.Node transformBackFromLeftClonedTree(BinaryTree.Node root){
        if(root == null){
            return null;
        }

        BinaryTree.Node lnn = transformBackFromLeftClonedTree(root.left.left);
        BinaryTree.Node rnn = transformBackFromLeftClonedTree(root.right);

        root.left = lnn;
        root.right = rnn;

        return root;
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        BinaryTree.Node Clonedroot = transformToLeftClonedTree(root);

        System.out.println(Clonedroot.data);

        BinaryTree.Node UnclonedRoot = transformBackFromLeftClonedTree(Clonedroot);

        System.out.println(UnclonedRoot.data);
    }
}
