class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp= new int[days[days.length-1]+1];
        Arrays.fill(dp,-1);
        return func(days[days.length-1],days,costs,dp);
    }
    
    public int func(int currDays,int[] days, int[] costs,int[] dp){
        if(currDays<days[0]) return 0;
        if(dp[currDays]!=-1) return dp[currDays];
        if(isToTravel( days, currDays)){
            int oneday=costs[0]+func(currDays-1,days,costs,dp);
            int sevenDay=costs[1]+func(currDays-7,days,costs,dp);
            int thirtyDay=costs[2]+func(currDays-30,days,costs,dp);
            
            return dp[currDays]= Math.min(oneday, Math.min(sevenDay,thirtyDay));
        }
        else{
            return dp[currDays]= func(currDays-1,days,costs,dp);
        }
    }
    public boolean isToTravel(int[] days, int day){
        for(int i:days){
            if(i==day) return true;
        }
        return false;
    }
}