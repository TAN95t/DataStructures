package Backtracking.WordBreakProblem;

import java.util.*;

public class WordBreakProblem {
    

    public static void solve(String str, ArrayList<String> list, ArrayList<ArrayList<String>> ans, ArrayList<String> dict){
        if(str.length() == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            String prefix = str.substring(0, i+1);
            String rem = str.substring(i+1);
            if(dict.contains(prefix)){
                list.add(prefix);
                solve(rem, list, ans, dict);
                list.remove(list.size()-1);
            }
        }
    }
    
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        solve(A, list, ans, B);
        if(ans.size()>0){
            return 1;
        }
        return 0;
    }

    public static void main(String args[]){

    }
}
