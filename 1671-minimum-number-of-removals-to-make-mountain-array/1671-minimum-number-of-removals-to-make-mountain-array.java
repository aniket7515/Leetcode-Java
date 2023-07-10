class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n=nums.length;
        int[] lis= new int[n];
        for(int i=0;i<n;i++){
            int max=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    max=Math.max(max,lis[j]+1);
                }
            }
            lis[i]=max;
        }
        int[] lds= new int[n];
        for(int i=n-1;i>=0;i--){
            int max=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    max=Math.max(max,lds[j]+1);
                }
            }
            lds[i]=max;
        }
        for(int i:lis) System.out.print(i+" ");
        System.out.println();
        for(int i:lds) System.out.print(i+" ");
        int ans=0;
        for(int i=0;i<lds.length;i++){
           if(lis[i]>1 && lds[i]>1)  ans=Math.max(ans,(lis[i]+lds[i]-1));
        }
        return n-ans;
    }
}