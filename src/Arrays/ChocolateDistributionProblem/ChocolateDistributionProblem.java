package Arrays.ChocolateDistributionProblem;

import java.util.*;

public class ChocolateDistributionProblem {
    
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long ans = Integer.MAX_VALUE;
        Collections.sort(a);
        for(int i=0; i+m-1<n; i++){
            int d = a.get(i+m-1)-a.get(i);
            if(d < ans){
                ans = d;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
