package Trees.BuildTreeClass;

public class BinaryTree {
    public static class Node {
        public int data;
        public Node right;
        public Node left;
        public int hd;
        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }


    static int idx = -1;

    public static  Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
}
