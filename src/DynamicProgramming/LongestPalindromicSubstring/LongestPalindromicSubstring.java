package DynamicProgramming.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {
    
    public static int solve(String str){
        boolean dp[][] = new boolean[str.length()][str.length()];
        int length=Integer.MIN_VALUE;
        for(int g=0; g<dp.length; g++){
            for(int i=0, j=g; j<dp.length; i++, j++){
                if(g==0){
                    dp[i][j] = true;
                }
                else if(g==1){
                    dp[i][j] = str.charAt(i) == str.charAt(j) ? true : false;
                }
                else {
                    if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }

                if(dp[i][j] == true && j-i>length){
                    length = g+1;
                }
            }
        }

        return length;
    }

    public static void main(String[] args) {
        
    }
}
