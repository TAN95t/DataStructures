package Strings.BalancedParenthesis;

import java.util.*;

public class BalancedParanthesis {
    

    public static boolean isBalancedParenthesis(String expression){
        Stack<Character> st = new Stack<>();

        for(char it : expression.toCharArray()){
            if(it == '(' || it == '{' || it == '['){
                st.push(it);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char ch = st.pop();
                if((it == ']' && ch == '[') || (it == '}' && ch == '{') || (it == ')' && ch == '(')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }

        if(!st.isEmpty()){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        
    }
}
