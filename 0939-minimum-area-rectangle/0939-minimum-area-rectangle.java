class Solution {
    public int minAreaRect(int[][] points) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int[] i:points){
            if(!map.containsKey(i[0])){
                map.put(i[0],new HashSet<>());
            }
            map.get(i[0]).add(i[1]);
        }
        int ans=Integer.MAX_VALUE;
        for(int[] p1:points){
            for(int[] p2:points){
                if(p1[0]==p2[0] || p1[1]==p2[1]) continue;
                
                if(map.get(p2[0]).contains(p1[1]) && map.get(p1[0]).contains(p2[1])){
                    ans=Math.min(ans, Math.abs(p1[0]-p2[0])*Math.abs(p1[1]-p2[1]));
                }
                
                
                
            }
        }
        
        return  ans==Integer.MAX_VALUE?0:ans;
        
    }
}