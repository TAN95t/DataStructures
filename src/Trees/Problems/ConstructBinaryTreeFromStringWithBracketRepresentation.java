package Trees.Problems;

public class ConstructBinaryTreeFromStringWithBracketRepresentation {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }


    int start = 0;

    public Node StringToTree(String s){
        if(start >= s.length()){
            return null;
        }

        boolean neg = false;

        if(s.charAt(start) == '-'){
            neg = true;
            start++;
        }


        int num = 0;

        while(start < s.length() && Character.isDigit(s.charAt(start))) {
            int digit = Character.getNumericValue(s.charAt(start));
            num = num * 10 + digit;
            start++;
        }

        if(neg) num = -num;

        Node root = new Node(num);

        if(start < s.length() && s.charAt(start) == '('){
            start++;
            root.left = StringToTree(s);
        }

        if(start < s.length() && s.charAt(start) == ')'){
            start++;
            return root;
        }

        if(start < s.length() && s.charAt(start) == '('){
            start++;
            root.right = StringToTree(s);
        }

        if(start < s.length() && s.charAt(start) == ')'){
            start++;
            return root;
        }

        return root;

    }
    

    public static void main(String[] args){

    }


}
