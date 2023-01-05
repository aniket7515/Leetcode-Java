class Solution {
    public String removeOccurrences(String s, String part) {
        int size=part.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
            if(st.size()>=size){
                String a="";
                for(int j=size-1;j>=0;j--){
                    if(part.charAt(j)!=st.peek()){
                        for(int k=0;k<a.length();k++){
                            st.push(a.charAt(k));
                        }
                        break;
                    }else{
                        a=st.peek()+a;
                        st.pop();
                    }
                    
                }
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
        
    }
}