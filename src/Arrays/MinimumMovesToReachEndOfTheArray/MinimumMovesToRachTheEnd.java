package Arrays.MinimumMovesToReachEndOfTheArray;

public class MinimumMovesToRachTheEnd {
    
    public static int minMoves(int a[], int n){
        Integer dp[] = new Integer[n+1];
        //int ans = 0;

        dp[n-1] = 0;

        for(int i=n-2; i>=0; i--){
            if(a[i] > 0){
                int min = Integer.MAX_VALUE;

                for(int j=1; j<=a[i] && i+j<dp.length; j++){
                    if(dp[i+j] != null){
                        min = Math.min(min, dp[i+j]);
                    }
                }

                if(min != Integer.MAX_VALUE){
                    dp[i] = min+1;
                }
            }
        }

        if(dp[0] == null){
            return -1;
        }

        return dp[0];

        //return ans;
    }

    public static void main(String[] args) {
        
    }
}
