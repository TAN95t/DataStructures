package DynamicProgramming.MinimumCostPath;

public class MinimumCostPath {
    

    public static int solve(int cost[][], int n, int m){
        int dp[][] = new int[n][m];


        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){

                if(i==n-1 && j==m-1){
                    dp[i][j] = cost[i][j];
                }
                else if(i == n-1){
                    dp[i][j] = dp[i][j+1] + cost[i][j];
                }
                else if(j == m-1){
                    dp[i][j] = dp[i+1][j] + cost[i][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + cost[i][j];
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args){
        
    }
}
