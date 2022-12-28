class Solution {
    public boolean isValid(String s) {
        char[] arr= s.toCharArray();
        Stack<Character> st= new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]=='c'){
                if(st.size()>=2 && st.pop()=='b' && st.pop()=='a') continue;
                else return false;
            }
            
            st.add(arr[i]);
        }
        return st.isEmpty();
        
    }
}