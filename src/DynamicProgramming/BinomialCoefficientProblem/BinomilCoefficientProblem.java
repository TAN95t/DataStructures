package DynamicProgramming.BinomialCoefficientProblem;

public class BinomilCoefficientProblem {
    
    public static int calculate(int n, int r){
        if(n < r){
            return 0;
        }
        if((n-r) < r){
            r = n-r;
        }
        int mod = 1000000007;
        int dp[] = new int[r+1];
        dp[0] = 1;

        for(int i=1; i<=n; i++){
            for(int j=Math.min(r,i); j>0; j--){
                dp[j] = (dp[j]+dp[j-1])%mod;
            }
        }

        return dp[r];
    }

    public static void main(String[] args){
        System.out.println(calculate(4, 2));
    }
}
