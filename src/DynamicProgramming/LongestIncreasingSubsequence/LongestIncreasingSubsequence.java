package DynamicProgramming.LongestIncreasingSubsequence;

public class LongestIncreasingSubsequence {

    static int longestSubsequence(int size, int a[])
    {
        int dp[] = new int[size];
        int ans = 0;
        for(int i=0; i<dp.length; i++){
            int max = 0;
            
            for(int j=0; j<i; j++){
                if(a[i] > a[j]){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            
            dp[i] = max+1;
            
            ans = Math.max(ans, dp[i]);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        
    }
    
}
