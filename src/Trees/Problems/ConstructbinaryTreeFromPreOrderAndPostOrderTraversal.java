package Trees.Problems;

public class ConstructbinaryTreeFromPreOrderAndPostOrderTraversal {
    

    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static Node buildTree(int preOrder[], int psi, int pei, int postOrder[], int ppsi, int ppei){
        if(psi > pei) return null;

        Node node = new Node(preOrder[psi]);

        if(psi == pei) return node;

        int idx = ppsi;
        while(postOrder[idx] != preOrder[psi+1]) idx++;
        int colse = idx - ppsi + 1;

        node.left = buildTree(preOrder, psi+1, psi+colse, postOrder, ppsi, idx);
        node.right = buildTree(preOrder, psi+colse+1, pei, postOrder, idx+1, ppei-1);

        return node;

    } 


    public static void main(String[] args){
        int preOrder[] = {1,2,3};
        int postOrder[] = {2,3,1};

        Node root = buildTree(preOrder, 0, preOrder.length-1, postOrder, 0, postOrder.length-1);

        System.out.println(root.data);
    }
}
