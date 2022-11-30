class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
       
        
        int low=1;
        int high=max;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int div= low + (high-low)/2;
            if(isPossible(nums,div,threshold)){
                ans=div;
                high=div-1;
            }else{
                low=div+1;
            }
        }
        return ans;
        
    }
    public boolean isPossible(int[] nums, int div, int th){
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+= (int)Math.ceil(nums[i]*1.0/div);
        }
        return res<=th;
    }
}