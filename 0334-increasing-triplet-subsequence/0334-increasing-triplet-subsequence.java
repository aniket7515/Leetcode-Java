class Solution {
    public boolean increasingTriplet(int[] nums) {
        
           // return func(nums,nums.length,-1,3);\
        int first=Integer.MAX_VALUE;
        int second= Integer.MAX_VALUE;
        
        for(int num:nums){
            if(first>=num) first=num;
            else if(second>=num) second=num;
            else return true;
        }
        return false;
        
        
    }
    public boolean func(int[] nums, int ind, int prev, int k){
        if(ind==0 && k!=0){
            return false;
        }
        if(k==0) return true;
        
        boolean notTake= func(nums,ind-1,prev,k);
        boolean take=false;
        if(nums[ind-1]<nums[prev]){
            take= func(nums,ind-1,ind,k-1);
        }
        
        
        
        return take || notTake;
    }
   
}