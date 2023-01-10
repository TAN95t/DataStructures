package Arrays.LongestConsecutiveSubsequence;

import java.util.*;

public class LongestConsecutiveSubsequence {
    
    public static int find(int arr[], int n){
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            if(set.contains(arr[i]-1)){
                int j = arr[i] + 1;
                while(set.contains(j)) j++;
                ans = Math.max(ans, j-arr[i]);
            }
        }
        return ans;
    }

    public static int findLongestConsecutiveSubsequence(int arr[], int n){
        int max = 0, count = 0;
        int freq[] = new int[100000 + 1];
        int maxn = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            freq[arr[i]]++;
            maxn = Math.max(maxn, arr[i]);
        }

        for(int i=0; i<maxn; i++){
            if(freq[i] > 0){
                count++;
                max = Math.max(count, max);
            }
            else{
                count=0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println(findLongestConsecutiveSubsequence(arr, n));
    }
}
