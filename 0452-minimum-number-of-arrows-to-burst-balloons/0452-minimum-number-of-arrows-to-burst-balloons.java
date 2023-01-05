class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
       // Arrays.sort(points, (int[] p1, int[] p2)->{
       //      return p1[1] < p2[1] ? -1 : 1; 
       //  });
         Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int currPos=points[0][1];
        int arrowCnt=1;
        for(int i=1;i<points.length;i++){
            if(currPos>=points[i][0]) continue;
            
            arrowCnt++;
            currPos=points[i][1];
            
        }
        return arrowCnt;
    }
}