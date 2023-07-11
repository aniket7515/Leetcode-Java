class Solution {
    int ans=0;
    public int findLength(int[] nums1, int[] nums2) {
        Integer[][] dp= new Integer[nums1.length][nums2.length];
        
        
         func(nums1,0,nums2,0,dp);
        return ans;
    }
    public int func(int[] nums1, int i, int[] nums2, int j, Integer[][] dp){
        if(i>=nums1.length || j>=nums2.length ) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int same=0;
        
        if(nums1[i]==nums2[j]){
            same=1+func(nums1,i+1,nums2,j+1,dp);
            ans=Math.max(ans,same);
        }
        func(nums1,i+1,nums2,j,dp);
        func(nums1,i,nums2,j+1,dp);
        
        return dp[i][j]= same;
        
    }
}