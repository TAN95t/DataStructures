package DynamicProgramming.KnapSackProblem;

public class KnapSackProblem {
    
    

    public static int solve(int [] wts, int [] vals, int target) {
        int n = wts.length;
        int dp[][] = new int[n+1][target+1];

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                dp[i][j] = dp[i-1][j];
                if(j >= wts[i-1]){
                    int rcap = j - wts[i-1];
                    if(dp[i-1][rcap] + vals[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][rcap] + vals[i-1];
                    }
                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {

    }
}
