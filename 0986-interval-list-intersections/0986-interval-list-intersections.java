class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length==0 || secondList.length==0) return new int[0][0];
        
        List<int[]> ans= new ArrayList<>();
        int i=0;
        int j=0;
        
        int startMax=0;
        int endMin=0;
        
        while(i<firstList.length && j<secondList.length){
            startMax=Math.max(firstList[i][0],secondList[j][0]);
            endMin=Math.min(firstList[i][1], secondList[j][1]);
            
            if(startMax<=endMin){
                ans.add(new int[]{startMax,endMin});
            }
            if(endMin==firstList[i][1]) i++;
            if(endMin==secondList[j][1]) j++;
            
        }
        return ans.toArray(new int[ans.size()][2]);
        
    }
}