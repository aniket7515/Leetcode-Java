class Solution {
    public String reverseParentheses(String s) {
       
        Stack<Character> st= new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=')'){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                StringBuilder sb= new StringBuilder();
                while(st.peek()!='('){
                    char c=st.pop();
                    if(c!='(') sb.append(c);
                }
                st.pop();
                for(int j=0;j<sb.length();j++){
                    st.push(sb.charAt(j));
                }
                        
            }
        }
        StringBuilder ans= new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}