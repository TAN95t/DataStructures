package Trees.Traversal;

import Trees.BuildTreeClass.BinaryTree;

import java.util.*;

public class ZigZagTraversal {
    

    public static ArrayList<ArrayList<Integer>>  zigZagTraversal(BinaryTree.Node root){
        Queue<BinaryTree.Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();


        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1; i<=n; i++){
                BinaryTree.Node curr = q.poll();
                if (flag == true){
                    list.add(curr.data);
                }

                if(flag == false){
                    list.add(0,curr.data);
                }

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }

                
            }
            ans.add(list);
            flag = !flag;
        }

        return ans;
        
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        System.out.println(zigZagTraversal(root));
    }
}
