package Backtracking.CombinationSum1;

import java.util.*;

public class CombinationSum {
    

    public static void solve(int arr[], int idx, int target, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<Integer>(list));
                return;
            }
            return;
        }

        if(arr[idx]  <= target){
            list.add(arr[idx]);
            solve(arr, idx, target-arr[idx], list, ans);
            list.remove(list.size()-1);
        }
        solve(arr, idx+1, target, list, ans);
        
    }

    public static void main(String[] args) {
        
    }
}
