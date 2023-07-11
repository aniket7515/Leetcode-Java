class Solution {
    static int mod = (int)(1e9 + 7);
    public int sumDistance(int[] arr, String s, int d) {
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                arr[i]+=d;
            }
            else{
                arr[i]-=d;
            }
        }

        Arrays.sort(arr);

        long sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum = (sum + i*(long)arr[i] - (n-1-i)*(long)arr[i])%mod;
        }
 
        return (int)sum;
        // while(d-->0){
        //     for(int i=0;i<nums.length;i++){
        //         if(s.charAt(i)=='L') nums[i]-=1;
        //         else nums[i]+=1;
        //     }
        // }
        // long sum=0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         sum+=Math.abs(nums[i]-nums[j])%1000000007;
        //     }
        // }
        // return (int)(sum%1000000007);
    }
}