class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);
        if(costs[0]>coins) return 0;
        int count=0;
        for(int i=0;i<costs.length && coins>0 ;i++){
            if(coins-costs[i]<0) break;
            coins-=costs[i];
            count++;
        }
        return count;
        
    }
}