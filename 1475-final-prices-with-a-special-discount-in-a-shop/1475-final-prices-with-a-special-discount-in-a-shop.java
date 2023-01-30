class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans= new int[prices.length];
        for(int i=0;i<prices.length-1;i++){
            ans[i]=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    ans[i]=(ans[i]-prices[j]);
                    break;
                }
            }
        }
        ans[prices.length-1]=prices[prices.length-1];
        
        return ans;
    } 
}