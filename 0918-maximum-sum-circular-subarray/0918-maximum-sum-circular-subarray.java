class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max1=0;
        max1=kadane(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=-nums[i];
        }
        int max2=kadane(nums);
        max2=sum+max2;
        if(max2==0) return max1;
        return Math.max(max1,max2);
    }
    public int kadane(int[] nums){
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(max,sum);
            
        }
        return max;
    }
}