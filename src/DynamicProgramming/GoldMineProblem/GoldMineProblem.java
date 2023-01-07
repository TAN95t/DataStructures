package DynamicProgramming.GoldMineProblem;

public class GoldMineProblem {
    
    public static int solve(int n, int m, int mine[][]){

        int dp[][] = new int[n][m];

        for(int j=m-1; j>=0; j--){
            for(int i=n-1; i>=0; i--){
                if(j == m-1){
                    dp[i][j] = mine[i][j];
                }
                else if(i==0){
                    dp[i][j] = Math.max(dp[i+1][j+1], dp[i][j+1]) + mine[i][j];
                }
                else if(i==n-1){
                    dp[i][j] = Math.max(dp[i-1][j+1], dp[i][j+1]) + mine[i][j];
                }
                else{
                    dp[i][j] = Math.max(Math.max(dp[i][j+1], dp[i+1][j+1]), dp[i-1][j+1]) + mine[i][j];
                }
            }
        }


        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, dp[i][0]);
        }

        return max;
    }

    public static void main(String[] args){

    }
}
