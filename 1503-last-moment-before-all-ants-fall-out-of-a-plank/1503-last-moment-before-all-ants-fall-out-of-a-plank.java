class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        int max1=0;
        int max2=0;
        // if(left.length==0) return right[right.length-1];
        // if(right.length==0) return left[left.length-1];
        
        for(int i=0;i<left.length;i++){
            max1=Math.max(max1,left[i]);
        }
        for(int i=0;i<right.length;i++){
            max2=Math.max(max2,n-right[i]);
        }
        return Math.max(max1,max2);
    }
}