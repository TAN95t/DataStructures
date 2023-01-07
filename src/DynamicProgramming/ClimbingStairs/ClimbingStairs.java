package DynamicProgramming.ClimbingStairs;

public class ClimbingStairs {
    
    public static int countPaths(int n) {
        if(n == 0) {
            return 1;
        }
        else if(n < 0) {
            return 0;
        }   

        int nm1 = countPaths(n-1);
        int nm2 = countPaths(n-2);
        int nm3 = countPaths(n-3);

        int total  = nm1 + nm2 + nm3;
        return total;
    }


    public static int count(int n, int dp[]) {
        if (n == 0) {
            return 1;
        }
        else if (n < 0) {
            return 0;
        }

        if(dp[n] > 0){
            return dp[n];
        }


        int nm1 = count(n-1, dp);
        int nm2 = count(n-2, dp);
        int nm3 = count(n-3, dp);

        int total = nm1 + nm2 + nm3;
        dp[n] = total;
        return total;
    }


    public static int find(int n){
        int dp[] = new int[n+1];

        dp[0] = 1;
        for(int i=1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }
            else if(i == 2){
                dp[i] = dp[i-1]+dp[i-2];
            }
            else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }

        return dp[n];
    }

    public static void main(String[] args){
        int n = 10;
        int dp[] = new int[n+1];
        System.out.println(count(n, dp));
        System.out.println(find(n));
    }
}
