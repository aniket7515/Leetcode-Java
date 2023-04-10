class Solution {
    public int diagonalPrime(int[][] nums) {
        
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i][i])){
                    max=Math.max(max,nums[i][i]);
            }
            if(isPrime(nums[i][nums.length-i-1])){ 
                    max=Math.max(max,nums[i][nums.length-i-1]);
            }
        }
        
        return max;
    }
    public boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}