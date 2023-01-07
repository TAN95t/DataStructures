package DynamicProgramming.MaximumCutSegments;
import java.util.*;
public class MAximumCutSegments {
    
    public static int solve(int n, int x, int y, int z){
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for(int i=1; i<dp.length; i++){
            if(i-x>=0 && dp[i-x] != -1){
                dp[i] = Math.max(dp[i], dp[i-x]+1);
            }
        }


        return dp[n];
    }

    public static void main(String[] args){

    }
}
