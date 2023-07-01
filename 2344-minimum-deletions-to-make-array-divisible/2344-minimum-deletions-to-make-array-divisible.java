class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        
        int gcd=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            gcd=GCD(numsDivide[i],gcd);
        }
        // HashMap<Integer,Integer> map= new HashMap<>();
        // for(int i:nums) map.put(i, map.getOrDefault(i,0)+1);
        Arrays.sort(nums);
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
           
                if(gcd%nums[i]==0){
                    return cnt;
                }else{
                    cnt++;
                }
            
        }  
        return -1;
    }
    public int GCD(int a, int b){
        if(b==0) return a;
        else return GCD(b,a%b);
    }
}