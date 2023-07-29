class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()) return false;
                if(!isMatch(st.peek(),s.charAt(i))) return false;
                else st.pop();
            }
        }
        return st.size()==0;
    }
    public boolean isMatch(char a, char b){
        return (a=='(' && b==')' || a=='[' && b==']' || a=='{' && b=='}');
        
    }
    
}