package Trees.TreeViews;

import Trees.BuildTreeClass.BinaryTree;
import java.util.*;

public class BottomView {
    
    public static ArrayList<Integer> bottomView(BinaryTree.Node root){
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<BinaryTree.Node> q = new ArrayDeque<>();
        TreeMap<Integer, Integer> map  = new TreeMap<>();

        root.hd = 0;
        q.offer(root);

        while(!q.isEmpty()){
            BinaryTree.Node curr = q.poll();
            int dist = curr.hd;

            map.put(dist, curr.data);

            if(curr.left != null){
                curr.left.hd = dist-1;
                q.offer(curr.left);
            }

            if(curr.right != null){
                curr.right.hd = dist+1;
                q.offer(curr.right);
            }
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            answer.add(it.getValue());
        }

        return answer;
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);
        
        System.out.println(bottomView(root).toString());
    }
}
