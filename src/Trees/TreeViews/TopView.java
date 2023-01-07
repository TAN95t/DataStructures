package Trees.TreeViews;

import Trees.BuildTreeClass.BinaryTree;

import java.util.*;

public class TopView {

    public static ArrayList<Integer> topView (BinaryTree.Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<BinaryTree.Node> q = new ArrayDeque<>();
        root.hd = 0;
        q.offer(root);

        while(!q.isEmpty()){
            BinaryTree.Node curr = q.poll();
            int dist = curr.hd;
            if(!map.containsKey(dist)){
                map.put(dist, curr.data);
            }

            if(curr.left != null){
                curr.left.hd = curr.hd-1;
                q.offer(curr.left);
            }

            if(curr.right != null){
                curr.right.hd = curr.hd+1;
                q.offer(curr.right);
            }
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            ans.add(it.getValue());
        }

        return ans;
    }
    

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);
        
        System.out.println(topView(root).toString());
    }
}
