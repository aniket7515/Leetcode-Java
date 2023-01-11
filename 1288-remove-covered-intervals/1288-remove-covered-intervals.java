class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        
        int prevRange=-1;
        int count=0;
        for(int[] interval:intervals){
            if(prevRange>=interval[1])  count++;
            prevRange=Math.max(prevRange,interval[1]);
        }
        
        return intervals.length-count;
        
        
        
    }
}