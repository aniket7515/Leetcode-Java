class Solution {
    public int maxCoins(int[] nums) {
        List<Integer> arr= new ArrayList<>();
        for(int i:nums) arr.add(i);
        arr.add(1);
        arr.add(0,1);
        int[][] dp= new int[arr.size()][arr.size()];
        for(int[] d:dp) Arrays.fill(d,-1);
        return func(1,nums.length,arr,dp);
        
    }
    public int func(int i, int j,List<Integer> arr, int[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int max=Integer.MIN_VALUE;
        for(int ind=i;ind<=j;ind++){
            int cost= (arr.get(ind)*arr.get(i-1)*arr.get(j+1))+ func(i,ind-1,arr,dp)+func(ind+1,j,arr,dp);
            max=Math.max(cost,max);
        }
        return dp[i][j]= max;
        
    }
}