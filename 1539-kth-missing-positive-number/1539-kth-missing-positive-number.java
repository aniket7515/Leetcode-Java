class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set= new HashSet<>();
        
        for(int i:arr) set.add(i);
        int ans=0;
        for(int i=1;k>0;i++){
            if(set.contains(i)) continue;
            ans=i;
            k--;
        }
        return ans;
        
    }
}