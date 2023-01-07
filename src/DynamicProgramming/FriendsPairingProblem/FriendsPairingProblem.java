package DynamicProgramming.FriendsPairingProblem;

public class FriendsPairingProblem {
    
    public static int solve(int n){
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2] * (i-1);
        }

        return dp[n];
    }

    public static void main(String[] args){

    }
}