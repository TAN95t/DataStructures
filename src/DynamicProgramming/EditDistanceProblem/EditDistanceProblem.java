package DynamicProgramming.EditDistanceProblem;

import java.util.*;

public class EditDistanceProblem {
    

    public static int solve(String a, String b, int i, int j, int dp[][]){
        if(i == a.length()){
            return b.length()-j;
        }
        if(j == b.length()){
            return a.length()-i;
        }
        if(a.charAt(i) == b.charAt(j)){
            return solve(a,b, i+1, j+1, dp);
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = 0;
        
        int insert = solve(a, b, i, j+1, dp) + 1;

        int delete = solve(a, b, i+1, j, dp) + 1;

        int replace = solve(a, b, i+1, j+1, dp) + 1;

        
        ans = Math.min(Math.min(insert, delete), replace);
        dp[i][j] = ans;

        return ans;
    }

    public static int findMinOperations(String a, String b){
        int dp[][] = new int[a.length()][b.length()];

        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return solve(a, b, 0, 0, dp);
    }


    public static void main(String[] args) {
        
    }
}

