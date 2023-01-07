package Trees.Traversal;

import Trees.BuildTreeClass.BinaryTree;
import java.util.*;

class Pair{
    BinaryTree.Node node;
    int state;
    Pair(BinaryTree.Node node, int state){
        this.node = node;
        this.state = state;
    }
}

public class IterativePrePostIn {

    public static void Traversals(BinaryTree.Node root){

        Stack<Pair> st = new Stack<>();
        Pair rtp = new Pair(root, 1);
        st.push(rtp);
        String pre = "";
        String post = "";
        String in = "";
        while(st.size()  > 0){
            Pair top = st.peek();
            if(top.state == 1){ // pre, s++, left
                pre += top.node.data + " ";
                top.state++;

                if(top.node.left != null){
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }
            }
            else if(top.state == 2){ // in, s++, right
                in += top.node.data + " ";
                top.state++;

                if(top.node.right != null){
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }
            }
            else{ // post, pop
                post += top.node.data + " ";
                st.pop();
            }
        }

        System.out.println("Preorder: "+ pre);
        System.out.println("Inorder: "+ in);
        System.out.println("PostOrder: "+ post);
    }
    

    public static void main(String[] args){
        int nodes[] = {50,25,12,-1,-1,37,30,-1,-1,-1,75,62,-1,70,-1,-1,87,-1,-1};

        BinaryTree.Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);

        Traversals(root);
    }
}
