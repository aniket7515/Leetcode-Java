class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            int sumOfDivisor=0;
            for(int j=1;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    if(j*j==num){
                        count++;
                        sumOfDivisor+=j;
                    }else{
                        count+=2;
                        sumOfDivisor+=(j+(num/j));
                    }
                }
            }
            if(count==4) sum+=sumOfDivisor;
        }
        return sum;
    }
   
}