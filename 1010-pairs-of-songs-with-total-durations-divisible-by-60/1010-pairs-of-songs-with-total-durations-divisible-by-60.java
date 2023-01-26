class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        // now we will solve it by makig an array of size[60] and adding its count of each elelment remainder at its indx position
        
        int[] count= new int[60];
        
        for(int i:time){
            count[i%60]++;
        }
        int pairSum=0;
        
        for(int i=1;i<30;i++){
            pairSum+=(count[i]*count[60-i]);
        }
        if(count[0]>1){
            if(count[0] %2 == 0){
                int c = count[0]/2;
                int d = c * (count[0] - 1);
                 pairSum += d;
            }else{
                int c = (count[0] - 1)/2;
                int d = c * count[0];
                 pairSum += d;
            }
        }
        if(count[30]>1) pairSum+=count[30]*(count[30]-1)/2;
        
        return pairSum;
 
        // Naiv solution
        // int count=0;
        // for(int i=0;i<time.length;i++){
        //     for(int j=i+1;j<time.length;j++){
        //         if((time[i]+time[j])%60==0){
        //             count++;
        //         }
        //     }
        // }return count;
        
    }
    public int sumOfN(int n){
        return n*(n+1)/2;
    }
}