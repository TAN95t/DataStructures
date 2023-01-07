package Trees.TreeViews;

import Trees.BuildTreeClass.BinaryTree;

import java.util.*;

public class RightView {


    public static ArrayList<Integer> rightView(BinaryTree.Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<BinaryTree.Node> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            
            int n = q.size();
            for(int i=1; i<=n; i++){

                BinaryTree.Node curr = q.poll();
                
                if(i == n){
                    ans.add(curr.data);
                }

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
        }

        return ans;
    }
    

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        System.out.println(rightView(root).toString());
    }
}
