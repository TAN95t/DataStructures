package DynamicProgramming.ClimbStairsInMinimumJumps;

public class ClimbStairsInMinimumJumps {
    

    public static int solve(int arr[], int n){


        Integer dp[] = new Integer[n+1];
        dp[n-1] = 0;

        for(int i=n-2; i>=0; i--){
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for(int j=1; j<=arr[i] && i+j<dp.length; j++){
                    if(dp[i+j] != null){
                        min = Math.min(min, dp[i+j]); 
                    }
                }

                if(min != Integer.MAX_VALUE){
                    dp[i] = min+1;
                }
            }
        }


        return dp[0];
    }

    public static void main(String[] args){
        int arr[] = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        System.out.println(solve(arr, arr.length));
    }
}
