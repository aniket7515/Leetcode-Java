class Solution {
    public int maxDistToClosest(int[] seats) {
        int[] left=new int[seats.length];
        int[] right= new int[seats.length];
        Arrays.fill(left,-1);
        Arrays.fill(right,-1);
        int i=0;
        int lastOne=-1;
        while(i<seats.length){
            if(seats[i]==1){
                lastOne=i;
            }else{
                left[i]=lastOne;
            }
            i++;
        }
        i=seats.length-1;
        lastOne=-1;
        while(i>=0){
            if(seats[i]==1){
                lastOne=i;
            }else{
                right[i]=lastOne;
            }
            i--;
        }
        int maxDis=0;
        for( i=0;i<seats.length;i++){
            if(seats[i]==0){
                int leftDis=(left[i]!=-1)?i-left[i]:Integer.MAX_VALUE;
                int rightDis=(right[i]!=-1)?right[i]-i:Integer.MAX_VALUE;
                int currDis=Math.min(leftDis,rightDis);
                if(maxDis<currDis){
                    maxDis=currDis;
                }
            }
        }
        return maxDis;
        
        
        
       
    }
}