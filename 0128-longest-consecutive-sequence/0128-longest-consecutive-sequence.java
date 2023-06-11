class Solution {
    public int longestConsecutive(int[] nums) {
      if(nums.length==0 || nums==null) return 0;
        Arrays.sort(nums);
        int prev=nums[0];
        int curr=1;
        int max=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==(prev+1)) curr++;
            else if(nums[i]!=(prev)) curr=1;
            prev=nums[i];
            max=Math.max(max,curr);
        }
        return max;
        
    }
}