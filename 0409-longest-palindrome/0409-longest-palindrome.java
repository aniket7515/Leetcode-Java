class Solution {
    public int longestPalindrome(String s) {
         Map<Character,Integer> map = new HashMap<>();
        int count=0;
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else
                map.put(c,1);            
        }
        boolean isOdd = false;    
         for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()%2==0)
                count +=  e.getValue();
        
            else{
                if(isOdd == false){
                    count +=  e.getValue();
                    isOdd = true;
                }
            
            else
                count +=  e.getValue()-1;
            }
        
        }
 
        return count;
    }
}