package Backtracking.PrintAllPalindromicPartitions;

import java.util.*;


public class PrintAllPalindromicPartitions {
    

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void solve(String str, ArrayList<String> list, ArrayList<ArrayList<String>> ans){
        if(str.length() == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0; i<str.length(); i++){
            String prefix = str.substring(0, i+1);
            String rem = str.substring(i+1);

            if(isPalindrome(prefix)){
                list.add(prefix);
                solve(rem, list, ans);
                list.remove(list.size()-1);
            }
        }
    }

    static ArrayList<ArrayList<String>> allPalidromicPerms(String str){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        solve(str, list, ans);
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
