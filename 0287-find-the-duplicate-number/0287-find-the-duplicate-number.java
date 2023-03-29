class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1) return entry.getKey();
        }
        
        return nums[0];
        
    }
}
