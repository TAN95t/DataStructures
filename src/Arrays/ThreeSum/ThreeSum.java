package Arrays.ThreeSum;

import java.util.*;

public class ThreeSum {

    public static ArrayList<ArrayList<Integer>> threeSum(int a[], int target){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = a.length;
        Arrays.sort(a);

        for(int i=0; i<n-2;i++){
            if(i==0 || (i>0 && a[i] != a[i-1])){
                int lo = i+1;
                int hi = n-1;
                int sum = target - a[i];

                while(lo < hi){
                    if(a[lo] + a[hi] == sum){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(a[i]);
                        list.add(a[lo]);
                        list.add(a[hi]);
                        ans.add(list);

                        while(lo < hi && a[lo] == a[lo+1]){
                            lo++;
                        }
                        while(lo < hi && a[hi] == a[hi-1]){
                            hi--;
                        }
                        lo++;
                        hi--;
                    }

                    else if(a[lo] + a[hi] < sum){
                        lo++;
                    }
                    else{
                        hi--;
                    }
                }
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
