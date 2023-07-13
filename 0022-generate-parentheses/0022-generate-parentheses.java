class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        
        func(ans,"",0,0,n);
        return ans;
        
    }
    public void func(List<String> arr,String s, int open, int close, int max){
        if(s.length()==max*2){
            arr.add(s);
            return;
        }
        if(open<max) func(arr,s+"(",open+1,close,max);
        if(close<open) func(arr,s+")",open,close+1,max);
    }
}