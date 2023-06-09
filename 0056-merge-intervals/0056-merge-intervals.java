class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> arr= new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        
        for(int[] i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }else{
                arr.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        arr.add(new int[]{start,end});
        
        
        
        int[][] ans= new int[arr.size()][2];
        for(int i=0;i<arr.size();i++){
            ans[i][0]=(arr.get(i))[0];
            ans[i][1]=(arr.get(i))[1];
            
        }
        return ans;
    }
}