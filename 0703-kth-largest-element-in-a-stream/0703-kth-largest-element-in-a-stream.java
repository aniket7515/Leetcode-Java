class KthLargest {
    ArrayList<Integer> arr= new ArrayList<>();
    int k=0;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums) arr.add(i);
    }
    
    public int add(int val) {
        arr.add(val);
        int n=arr.size();
        Collections.sort(arr);
        return arr.get(n-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */