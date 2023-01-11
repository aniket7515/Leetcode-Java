class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int i:map.keySet()){
            if(map.containsKey(i+1)){
                ans=Math.max(ans,map.get(i)+map.get(i+1));
            }
        }
        return ans;
        
    }
}