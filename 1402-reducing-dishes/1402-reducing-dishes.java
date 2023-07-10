class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int[][] dp= new int[satisfaction.length+1][satisfaction.length+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        return func(satisfaction,0,0,dp);
    }
    public int func(int[] arr, int i, int time, int[][] dp){
        
        if(i==arr.length) return 0;
        if(dp[i][time]!=-1) return dp[i][time];
        int notTake= func(arr,i+1,time,dp);
        int take= arr[i]*(time+1) + func(arr,i+1,time+1,dp);
        
        return dp[i][time]= Math.max(take,notTake);
        
        
    }
}