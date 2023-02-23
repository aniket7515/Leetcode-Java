class FreqStack {
    HashMap<Integer,Integer> fmap;
    HashMap<Integer,Stack<Integer>> st= new HashMap<>();
    int max=0;
    public FreqStack() {
        fmap= new HashMap<>();
        st= new HashMap<>();
    }
    
    public void push(int val) {
        fmap.put(val,fmap.getOrDefault(val,0)+1);
        int freq=fmap.get(val);
        if(st.containsKey(freq)){
            st.get(freq).push(val);
        }else{
            st.put(freq,new Stack<Integer>());
            st.get(freq).push(val);
        }
        max=Math.max(max,freq);
    }
    
    public int pop() {
        int ans=st.get(max).pop();
        fmap.put(ans,fmap.get(ans)-1);
        if(st.get(max).size()==0){
            max--;
        }
        return ans;
         
    }
    
   
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */