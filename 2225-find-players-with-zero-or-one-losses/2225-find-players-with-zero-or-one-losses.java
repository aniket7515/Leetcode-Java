class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        List<Integer> los= new ArrayList<>();
        for(int[] a: matches){
            if(map.containsKey(a[1])){
                map.put(a[1],map.get(a[1])+1);
            }else{
                map.put(a[1],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1) los.add(entry.getKey());
        }
        TreeSet<Integer> set= new TreeSet<>();
        
        for(int i=0;i<matches.length;i++){
            if(!map.containsKey(matches[i][0]))  set.add(matches[i][0]);
        }
        List<Integer> win= new ArrayList<>(set);
        List<List<Integer>> ans= new ArrayList<>();
        ans.add(win);
        ans.add(los);
        return ans;
    }
}