class Solution {
    public int minPartitions(String n) {
        int maxDig=0;
        for(int i=0;i<n.length();i++){
            maxDig=Math.max(maxDig,Integer.parseInt(n.charAt(i)+""));
        }
        
        return maxDig;
    }
}