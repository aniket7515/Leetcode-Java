class Solution {
    public int minCost(int n, int[] cuts) {
        
        List<Integer> arr= new ArrayList<>();
        for(int i:cuts) arr.add(i);
        arr.add(n);
        arr.add(0,0);
        int[][] dp= new int[arr.size()][arr.size()];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        Collections.sort(arr);
        return func(1,cuts.length,arr,dp);
        
    }
    public int func(int i, int j, List<Integer> arr, int[][] dp){
        if(i>j) return 0;
        int min=Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        for(int ind=i;ind<=j;ind++){
            int cost=arr.get(j+1)-arr.get(i-1)+ func(i,ind-1,arr,dp)+func(ind+1,j,arr,dp);
            min=Math.min(min,cost);
        }
        return dp[i][j]= min;
        
    }
}