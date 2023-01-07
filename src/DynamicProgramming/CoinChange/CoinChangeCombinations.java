package DynamicProgramming.CoinChange;



public class CoinChangeCombinations {
    
    
    public static int count(int coins[], int amt){
        int ans = 0;

        int dp[] = new int[amt + 1];
        dp[0] = 1;

        for(int i=0; i<coins.length; i++){
            for(int j=coins[i]; j<dp.length; j++ ){
                dp[j] += dp[j - coins[i]];
            }
        }

        ans = dp[amt];

        return ans;
    }

    public static void main(String[] args){

    }
}
