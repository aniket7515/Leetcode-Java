class StockSpanner {
    // List<Integer> arr;
    Stack<int[]> st;
    public StockSpanner() {
        // arr= new ArrayList<>();
        st=new Stack<>();
    }
    
    public int next(int price) {
        
        int span=1;
        
        while(!st.isEmpty() && st.peek()[0]<=price ){
            span+=st.pop()[1];
        }
        
        st.add(new int[]{price,span});
        return span;
        
        
        
//         arr.add(price);
//         int n= arr.size();
//         int cnt=0;
//         boolean flag=true;
//         for(int i=n-1;i>=0;i--){
//             if( flag && arr.get(i)<=price) cnt++;
//             else flag=false;
//         }
        
//         return cnt;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */