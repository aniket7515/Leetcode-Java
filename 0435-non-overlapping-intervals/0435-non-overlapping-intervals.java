class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        int previous=0;
        int ans=0;
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        for(int i=1;i<intervals.length;i++){
            int current= i;
            
            if(intervals[current][0]<intervals[previous][1]){
                ans++;
                if(intervals[previous][1] > intervals[current][1]){
                    previous=current;
                }
            }else{
                previous=current;
            }
        }
        return ans;
        
    }
   
}