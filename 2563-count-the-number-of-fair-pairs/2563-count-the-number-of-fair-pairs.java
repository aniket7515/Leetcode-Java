class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        
        int l=1;
        int h=nums.length-1;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            while(h>0 && nums[i]+nums[h]>upper) h--;
            l=i+1;
            while(l<nums.length && nums[i]+nums[l]<lower){
                l++;
            }
            
            if(l<=h) ans+=(h-l+1);
        }
        
        return ans;
        
        
    }
    
}