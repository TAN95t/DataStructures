package Trees.Problems;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ConvertBinaryTreeIntoSumTree {
    

    public static int getSumTree(Node root) {
        if(root == null) {
            return 0;
        }

        int lstSum = getSumTree(root.left);
        int rstSum = getSumTree(root.right);
        int x = root.data;
        root.data = lstSum + rstSum;

        int totalSum = lstSum + rstSum + x;

        return totalSum;
    }

    public static void main(String[] args){

    }
}
