class Solution {
    public boolean isGoodArray(int[] nums) {
        int currGcd=nums[0];
        for(int i=1;i<nums.length;i++){
            currGcd=gcd(currGcd,nums[i]);
            if(currGcd==1) return true;
        }
        return currGcd==1;
    }
    public int gcd(int a, int b){
        if(b == 0) return a;     
        return gcd(b, a % b);  
    }
}