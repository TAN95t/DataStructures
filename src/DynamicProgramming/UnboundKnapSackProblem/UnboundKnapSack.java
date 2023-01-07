package DynamicProgramming.UnboundKnapSackProblem;

public class UnboundKnapSack {
    


    public static int solve(int [] vals, int wts[], int n, int target){
        int dp[] = new int [target+1];
        dp[0]=0;

        for(int bagc=0; bagc<=target; bagc++){
            int max = 0;
            for(int i=0; i<n; i++){

                if(wts[i] <= bagc){
                    int rbagc = bagc - wts[i];
                    int rbagv = dp[rbagc];
                    int tbagv = rbagv + vals[i];

                    if(tbagv > max){
                        max = tbagv;
                    }
                }
            }

            dp[bagc] = max;
        }


        return dp[target];
    }

    public static void main(String[] rags){

    }
}
