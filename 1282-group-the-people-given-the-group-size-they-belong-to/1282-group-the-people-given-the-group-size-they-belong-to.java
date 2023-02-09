class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map= new HashMap<>();
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<groupSizes.length;i++){
            int size=groupSizes[i];
            
            List<Integer> grp= map.getOrDefault(size,new ArrayList<>());
            grp.add(i);
            map.put(size,grp);
            
            if(grp.size()==size){
                ans.add(grp);
                map.remove(size);
            }
            
            
        }
        
        return ans;
        
        
        
        
        
    }
}