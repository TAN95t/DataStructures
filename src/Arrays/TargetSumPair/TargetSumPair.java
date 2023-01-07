package Arrays.TargetSumPair;

import java.util.*;

public class TargetSumPair {
    
    public static int getPairCount(int a[], int target){
        int n = a.length;
        int ans = 0;

        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<n; i++){
            if(m.containsKey(target-a[i])){
                ans += m.get(target - a[i]);
            }
            if(m.containsKey(a[i])){
                m.put(a[i], m.get(a[i])+1);
            }
            else{
                m.put(a[i], 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
    }
}
