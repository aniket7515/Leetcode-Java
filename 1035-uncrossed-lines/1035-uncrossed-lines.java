class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        
       int n=nums1.length;
        int m=nums2.length;
        int[][] dp= new int[n+1][m+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        return func(n-1,m-1,nums1,nums2,dp);
    }
    public int func(int i, int j,int[] arr1, int[] arr2, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(arr1[i]==arr2[j]) return 1+ func(i-1,j-1,arr1,arr2,dp);
        return dp[i][j]= Math.max(func(i-1,j,arr1,arr2,dp),func(i,j-1,arr1,arr2,dp));
    }
}