class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                if(!map.containsKey(entry.getKey()+1) && !map.containsKey(entry.getKey()-1)) ans.add(entry.getKey());
            }
            
        }
        return ans;
        
        
        
        
    }
}