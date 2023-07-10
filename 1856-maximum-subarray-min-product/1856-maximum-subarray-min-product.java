class Solution {
    public int maxSumMinProduct(int[] nums) {
        long[] prefix= new long[nums.length+1];
        prefix[0]=0;
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        
        left= leftSmaller(nums,left);
        right= rightSmaller(nums,right);
        long max=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            long minProd= (long)nums[i]*(prefix[right[i]]-prefix[left[i]+1]);
            max=Math.max(max,minProd);
        }
        return (int)(max%1000_000_007);
        
        
    }
    public int[] leftSmaller(int[] nums, int[] left){
        Stack<Integer> st= new Stack<>();
        left[0]=-1;
        st.add(0);
        for(int i=1;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) left[i]=-1;
            else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        return left;
        
        
    }
    public int[] rightSmaller(int[] nums, int[] right){
        Stack<Integer> st= new Stack<>();
        right[right.length-1]=nums.length;
        st.add(nums.length-1);
        for(int i=nums.length-2;i>=0;i--){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) right[i]=nums.length;
            else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        return right;
        
        
    }
    
}
