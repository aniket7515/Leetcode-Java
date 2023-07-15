class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int[][] ans= new int[intervals.length+1][2];
        ans[0][0]=newInterval[0];
        ans[0][1]=newInterval[1];
        for(int i=1;i<=intervals.length;i++){
            ans[i][0]=intervals[i-1][0];
            ans[i][1]=intervals[i-1][1];
            
            
            
        }
       
        
        Arrays.sort(ans, (a,b)->a[0]-b[0]);
        int start=ans[0][0];
        int end=ans[0][1];
        List<int[]> res= new ArrayList<>();
        for(int[] i:ans){
            if(end>=i[0]){
                end=Math.max(end,i[1]);
            }else{
                res.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        res.add(new int[]{start,end});
        int[][] interval= new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            interval[i][0]=res.get(i)[0];
            interval[i][1]=res.get(i)[1];
        }
        return interval;
        
//         List<int[]> ans= new ArrayList<>();
        
//         int start=intervals[0][0];
//         int end=intervals[0][1];
        
        
//         for(int[] i:intervals){
//             if(newInterval[0]<=end){
//                 end=Math.max(end,newInterval[1]);
//             }
//             if(i[0]<=end){
//                 end=Math.max(end,i[1]);
//             }else{
//                 ans.add(new int[]{start,end});
//                 start=i[0];
//                 end=i[1];
//             }
            
//         }
//         int[][] res=new int[ans.size()][2];
//         for(int i=0;i<ans.size();i++){
//             res[i][0]=ans.get(i)[0];
//             res[i][1]=ans.get(i)[1];
//         }
//         return res;
    }
}