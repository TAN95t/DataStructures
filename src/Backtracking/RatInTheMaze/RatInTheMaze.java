package Backtracking.RatInTheMaze;

import java.util.*;

public class RatInTheMaze {
    

    public static void solve(int i, int j, int[][] m, int n, ArrayList<String> ans,String move,int[][] vis){
        
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        
        if(i+1<n && vis[i+1][j]==0 && m[i+1][j]==1){
            vis[i][j]=1;
            solve(i+1,j,m,n,ans,move+'D',vis);
            vis[i][j]=0;
        }
        
        if(j-1>=0 && vis[i][j-1]==0 && m[i][j-1]==1){
            vis[i][j]=1;
            solve(i,j-1,m,n,ans,move+'L',vis);
            vis[i][j]=0;
        }
        
        if(j+1<n && vis[i][j+1]==0 && m[i][j+1]==1){
            vis[i][j]=1;
            solve(i,j+1,m,n,ans,move+'R',vis);
            vis[i][j]=0;
        }
        
        if(i-1>=0 && vis[i-1][j]==0 && m[i-1][j]==1){
            vis[i][j]=1;
            solve(i-1,j,m,n,ans,move+'U',vis);
            vis[i][j]=0;
        }
        
    }
    
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        
        int vis[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                vis[i][j] = 0;
            }
        }
        
        ArrayList<String> ans = new ArrayList<>();
        if(m[0][0] == 1){
            solve(0,0,m,n,ans,"",vis);
        }
        
        return ans;
    }


    public static void main(String[] args) {
        
    }
}
