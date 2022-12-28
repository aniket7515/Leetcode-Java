class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> chars=new Stack<>();
        Stack<Integer> count= new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(!chars.isEmpty() && chars.peek()==ch){
                count.push(count.peek()+1);
            }else count.push(1);
            
            chars.push(ch);
            
            if(count.peek()==k){
                for(int i=0;i<k;i++){
                    chars.pop();
                    count.pop();
                }
            }
            
        }
        
        StringBuilder sb= new StringBuilder();
        while(!chars.isEmpty()){
            sb.append(chars.pop());
        }
        return sb.reverse().toString();
        
    }
}