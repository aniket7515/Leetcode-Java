class Solution {
    public int maximumTop(int[] nums, int k) {
        
        if(nums.length==1){
            if(k%2==1) return -1;
            else return nums[0];
        }
         int max=-1;
        if(k<nums.length) max=nums[k];
        else if(k>nums.length) k=nums.length+1;
        
       
        for(int i=0;i<k-1;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
}