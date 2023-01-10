package Strings.CheckForAnagrams;

import java.util.*;

public class CheckForAnagrams {



    public static boolean isAnagram(String a,String b)
    {
        
        int arr[] = new int[26];
        Arrays.fill(arr,0);
        for(int i=0; i<a.length(); i++){
            char curr = a.charAt(i);
            arr[curr-'a']++;
        }
        
        for(int i=0; i<b.length(); i++){
            char curr = b.charAt(i);
            arr[curr-'a']--;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        
        return true;
        
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str1 = sc.nextLine();
        // String str2 = sc.nextLine();
        // boolean ans = isAnagram(str1, str2);
        // if(ans){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }
    }
    
}
