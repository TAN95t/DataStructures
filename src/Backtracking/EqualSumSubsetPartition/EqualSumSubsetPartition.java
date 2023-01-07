package Backtracking.EqualSumSubsetPartition;

import java.util.*;

public class EqualSumSubsetPartition {
    
    public static void solution(int [] arr, int vidx, int n, int k, int []subsetSum, int ssssf, ArrayList<ArrayList<Integer>> ans){
        
        if(vidx == arr.length){
            if(ssssf == k){
                boolean flag = true;
                for(int i=0; i<subsetSum.length -1; i++){
                    if(subsetSum[i] != subsetSum[i+1]){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    for(ArrayList<Integer> partition : ans){
                        System.out.println(partition + " ");
                    }
                }
            }
            return;
        }

        for(int i=0; i<ans.size(); i++){
            if(ans.get(i).size() > 0){
                ans.get(i).add(arr[vidx]);
                subsetSum[i] += arr[vidx];
                solution(arr, vidx + 1, n, k, subsetSum, ssssf, ans);
                subsetSum[i] -= arr[vidx];
                ans.get(i).remove(ans.get(i).size() - 1);
            }
            else{
                ans.get(i).add(arr[vidx]);
                subsetSum[i] += arr[vidx];
                solution(arr, vidx + 1, n, k, subsetSum, ssssf+1, ans);
                subsetSum[i] -= arr[vidx];
                ans.get(i).remove(ans.get(i).size() - 1);
                break;
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> equalSumSubsets(int [] arr, int k){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(k>arr.length){
            return ans;
        }
        if(k == 1){
            return ans;
        }
        int [] subsetSum = new int [k];

        for(int i=0; i<k; i++){
            ans.add(new ArrayList<>());
        }

        solution(arr, 0,arr.length, k, subsetSum, 0, ans);

        return ans;
    }

    public static void main(String[] args){

    }
}
