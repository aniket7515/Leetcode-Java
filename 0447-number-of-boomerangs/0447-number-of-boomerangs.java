class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ans=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int[] p1:points){
            for(int[] p2:points){
                int dis= ((p2[0]-p1[0])*(p2[0]-p1[0])+(p2[1]-p1[1])*(p2[1]-p1[1]));
                map.put(dis, map.getOrDefault(dis,0)+1);
            }
            for(Integer val:map.values()){
                ans+=(val*(val-1));
            }
            map.clear();
        }
        return ans;
    }
}