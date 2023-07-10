class Solution {
    public int validSubarraySize(int[] nums, int threshold) {
        int[] left=new int[nums.length];
        int[] right= new int[nums.length];
        
        left= leftSmaller(nums,left);
        right= rightSmaller(nums,right);
        int max=0;
        for(int i=0;i<nums.length;i++){
            int ll=left[i];
            int rr=right[i];
            int len=rr-ll-1;
            
            if(threshold/(double)len <nums[i]) return len;
            
        }
        return -1;
        
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