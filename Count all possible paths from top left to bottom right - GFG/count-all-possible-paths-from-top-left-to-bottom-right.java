//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int m = Integer.parseInt(input[0]); 
            int n = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.numberOfPaths(m,n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    long numberOfPaths(int m, int n)
    {
        // code here
        int[][] dp = new int[m+1][n+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        return (long)func(m-1,0,m,n,dp)%1000000007;
        
        
    }
    public int func(int i, int j, int m, int n, int[][] dp){
        if(i==0 && j==n-1) return 1;
        
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j]%1000000007;
        int up = func(i-1,j,m,n,dp);
        int right= func(i,j+1,m,n,dp);
        
        return dp[i][j]= (up+right)%1000000007;
        
    }
    
}