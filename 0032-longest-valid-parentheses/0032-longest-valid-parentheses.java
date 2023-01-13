class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                if(!st.isEmpty() &&s.charAt(st.peek())=='(') st.pop();
                else{
                    st.push(i);
                }
            }
        }
        int maxLen=0;
        int start=0;
        int end=s.length();
        while(!st.isEmpty()){
            start=st.pop();
            maxLen=Math.max(maxLen,end-start-1);
            end=start;
        }
        
        return Math.max(end,maxLen);
        
    }
}