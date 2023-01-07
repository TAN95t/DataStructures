package Trees.Traversal;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class DiagonalTraversalOfBinaryTree {
    
    public static ArrayList<Integer> diagonalTraversal(Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Node> q = new ArrayDeque<>();
        
        if(root == null){
            return ans;
        }

        while(!q.isEmpty()){
            Node temp = q.peek();
            q.poll();
            while(temp != null){
                if(temp.left != null) q.offer(temp.left);
                ans.add(temp.data);
                temp = temp.right;
            }
        }

        return ans;
    }

    public static void main(String[] args){

    }
}
