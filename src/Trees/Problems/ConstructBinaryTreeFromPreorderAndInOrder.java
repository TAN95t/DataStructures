package Trees.Problems;

import Trees.BuildTreeClass.BinaryTree;

public class ConstructBinaryTreeFromPreorderAndInOrder {
    

    public static BinaryTree.Node buildTree(int [] preOrder,int psi, int pei, int [] inOrder, int isi, int iei){
        if (isi > iei) return null;

        int idx = isi;
        while(inOrder[idx] != preOrder[psi]) idx++;

        int colse = idx-isi;

        BinaryTree.Node node = new BinaryTree.Node(preOrder[psi]);

        node.left = buildTree(preOrder, psi+1, psi+colse, inOrder, isi, idx-1);
        node.right = buildTree(preOrder, psi+colse+1, pei, inOrder, idx+1, iei);


        return node;
    }

    public static void printPostOrder(BinaryTree.Node root){
        if(root == null){
            return;
        }

        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+ " ");
    }

    public static void main(String[] args) {
        int preOrder[] = {0,1,3,7,8,4,9,10,2,5,11,6};
        int inOrder[] = {7,3,8,1,9,4,10,0,11,5,2,6};

        BinaryTree.Node root = buildTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
        System.out.println(root.data);


        System.out.println("postOrder Traversal:");
        printPostOrder(root);

    }

}
