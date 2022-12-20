class Solution {
    public int minOperations(int[] nums, int x) {
        // Maximum length of subarray with sum total-k
        int target=0;
        for(int i:nums) target+=i;
        target-=x;
        if(target==0) return nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0;
        int ans=-1;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-target)){
                ans=Math.max(ans,i-map.get(sum-target));
            }
            map.put(sum,i);
        }
        int n=nums.length;
        
        return ans==-1?-1: n-ans;
        
        
        
    }
}