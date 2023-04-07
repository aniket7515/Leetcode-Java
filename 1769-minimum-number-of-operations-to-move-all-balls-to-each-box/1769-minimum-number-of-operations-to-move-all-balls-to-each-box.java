class Solution {
    public int[] minOperations(String boxes) {
        HashSet<Integer> set= new HashSet<>();
        
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1')set.add(i);
        }
        int[] ans= new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            ans[i]=count(i,set);
        }
        
        return ans;
        
        
        
    }
    public int count(int i, HashSet<Integer> set){
        int count=0;
        for(int j:set){
            if(i!=j){
                count+= Math.abs(j-i);     
            }
        }
        return count;
    }
}