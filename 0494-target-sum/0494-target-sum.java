class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
       
        
        int sum=0;
        for(int i:nums) sum+=i;
        if((sum-target)<0 || (sum-target)%2==1) return 0;  
        return func(nums.length-1,(sum-target)/2,nums);
    }
    public int func(int ind, int target , int[] nums){
        if(ind==0){
            if(target==0 && nums[0]==0) return 2;
            if(target==0 || target==nums[0]) return 1;
            return 0;
        }
        int notTake=func(ind-1,target,nums);
        int Take=0;
        if(target>=nums[ind]) Take=func(ind-1,target-nums[ind],nums);
        
        return Take+notTake;
    }
}