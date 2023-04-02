class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        
        
        while(!map.isEmpty()){
            List<Integer> sub= new ArrayList<>();
            int i=0;
            HashSet<Integer> set= new HashSet<>();
            for(;i<nums.length;i++){
                if(map.containsKey(i)){
                    if(!set.contains(map.get(i))){
                        sub.add(map.get(i));
                        set.add( map.get(i));
                        map.remove(i);
                    }
                }
            }
            ans.add(sub);
        }
        return ans;
        
        
        
    }
}