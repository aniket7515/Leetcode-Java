class CustomStack {
    List<Integer> arr= new ArrayList<>();
    int n;
    public CustomStack(int maxSize) {
            // arr= new ArrayList<>(maxSize);
        n=maxSize;
    }
    
    public void push(int x) {
        if(arr.size()<n){
            arr.add(x);
        }
    }
    
    public int pop() {
       if(arr.size()!=0) return arr.remove(arr.size()-1);
       else   return -1;
        
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<k && i<arr.size();i++){
            arr.set(i, arr.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */