class Solution {
    public int countCollisions(String directions) {
        Stack<Character> st = new Stack<>();
        int count=0;
        st.push(directions.charAt(0));
        for(int i=1;i<directions.length();i++){
            char curr=directions.charAt(i);
            if(curr=='L'){
                if(!st.isEmpty() && st.peek()=='R'){
                    count+=2;
                    st.pop();
                    // st.push('S');
                    curr='S';
                }
                else if(!st.isEmpty() && st.peek()=='S'){
                    count++;
                    curr='S';
                }
            }
            else if(st.peek()=='S' && curr=='L'){
               
                    count++;
                    curr='S';
            }                
                
            while(!st.isEmpty() && (st.peek()=='R' && curr=='S')){
                count++;
                st.pop();
            }
            st.push(curr);
            
        }
        return count;
    }
}