class Solution {
    public int minimumDeletions(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int maxIdx=map.get(max);
        int minIdx=map.get(min);
        
        int front=Math.max(minIdx,maxIdx)+1;
        int back=nums.length-Math.min(minIdx,maxIdx);
        int frontBack=Math.min(minIdx,maxIdx)+1+(nums.length-Math.max(minIdx,maxIdx));
        
        int ans=Math.min(front,back);
        ans=Math.min(ans,frontBack);
        
        return ans;
        
        
        
        
        
    }
}