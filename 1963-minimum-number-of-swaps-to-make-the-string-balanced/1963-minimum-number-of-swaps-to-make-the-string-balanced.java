class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='[') st.push(c);
            else{
                if(!st.isEmpty() && c==']') st.pop();
                else{
                    count++;
                }
            }
        }
        return (count+1)/2;
    }
}