class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Map<Integer,Integer> map= new TreeMap<>();
        for(int[] i:items1){
            if(map.containsKey(i[0])){
                map.put(i[0],map.get(i[0])+i[1]);
            }else{
                map.put(i[0],i[1]);
            }
            
        }
        for(int[] i:items2){
            if(map.containsKey(i[0])){
                map.put(i[0],(map.get(i[0])+i[1]));
            }else{
                map.put(i[0],i[1]);
            }
            
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            List<Integer> arr= new ArrayList<>();
            arr.add(entry.getKey());
            arr.add(entry.getValue());
            ans.add(arr);
        }
        
        return ans;
        
        
    }
}