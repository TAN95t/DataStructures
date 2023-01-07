package DynamicProgramming.EggDroppingProblem;

public class EggDroppingProblem {
    

    public static int solve(int e, int f){


        int dp[][] = new int[e+1][f+1];

        for(int i=1; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i==1){
                    dp[i][j] = j;
                }
                else if(j == 1){
                    dp[i][j] = 1;
                }
                else{
                    int min = Integer.MAX_VALUE;
                    for(int mj=j-1, pj=0; mj>=0; mj--, pj++){
                        int v1 = dp[i][mj]; //egg survives
                        int v2 = dp[i-1][pj]; //egg breaks
                        int val = Math.max(v1, v2);
                        min = Math.min(min, val);
                    }
                    
                    dp[i][j] = min+1;
                }
            }
        }

        return dp[e][f];
    }


    public static void main(String[] args){

    }
}
