//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
        int[][] dp= new int[price.length][n+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        return func(price,n-1,n,dp);
    }
    public int func(int[] arr, int ind, int n, int[][] dp){
        
        if(ind==0){
            return n*arr[0];
        }
        if(dp[ind][n]!=-1) return dp[ind][n];
        int notTake=func(arr,ind-1,n,dp);
        int take=Integer.MIN_VALUE;
        int len=ind+1;
        if(n>=len){
            take=arr[ind]+ func(arr,ind,n-len,dp);
        }
        
        return dp[ind][n]= Math.max(take,notTake);
    }
}