class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] ans=new int[intervals.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<intervals.length;i++){
            int smallest=Integer.MAX_VALUE;
            for(int j=0;j<intervals.length;j++){
                // if(i!=j){
                    if(intervals[j][0]>=intervals[i][1]){
                        if(intervals[j][0]<=smallest){
                            smallest=intervals[j][0];
                            ans[i]=j;
                        } 
                        
                        
                    }
                // }
            }
        }
        return ans;
    }
}