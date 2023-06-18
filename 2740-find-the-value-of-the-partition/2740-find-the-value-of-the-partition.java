class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
         int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])<min) min= Math.abs(nums[i]-nums[i+1]);
        }
        
        return min;
    }
}