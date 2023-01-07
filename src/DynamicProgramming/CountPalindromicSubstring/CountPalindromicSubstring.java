package DynamicProgramming.CountPalindromicSubstring;

public class CountPalindromicSubstring {
    
    public static int count(String str){
        int dp[][] = new int [str.length()][str.length()];
        int count = 0;
        for(int g=0; g<str.length(); g++){
            for(int i=0, j=g; j<dp.length; j++,i++){
                if(g == 0){
                    dp[i][j] = 1;
                    count++;
                }
                if(g == 1){
                    dp[i][j] = str.charAt(i) == str.charAt(j) ? 1 : 0;
                    if(dp[i][j] == 1){
                        count++;
                    }
                }
                else{
                    if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1] == 1){
                        dp[i][j] = 1;
                        count++;
                    }
                    else{
                        dp[i][j] = 0;
                    }
                }
            }
        }


        return count;
    }

    public static void main(String[] args) {
        
    }
}
