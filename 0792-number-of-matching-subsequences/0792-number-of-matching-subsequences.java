class Solution {
    public int numMatchingSubseq(String s, String[] words) {
       
        HashMap<String,Integer> map= new HashMap<>();
        for(String str:words) map.put(str, map.getOrDefault(str,0)+1);
        int cnt=0;
        for(String str:map.keySet()){
            char[] temp= str.toCharArray();
            int i=0;
            int j=0;
            
            while(i<s.length() && j<temp.length){
                if(s.charAt(i)==temp[j]){
                    i++;
                    j++;
                }else{
                    i++;
                }
                
            }
            if(j==temp.length)  cnt+=map.get(str);
        }
        return cnt;
        
        
        
        
        
        
        
        
        
        // int count=0;
        // for(int i=0;i<words.length;i++){
        //      boolean[][] dp= new boolean[words[i].length()+1][s.length()+1];
        //     if(func(words[i].length()-1,(s.length())-1,words[i],s,dp)==true) count++;
        // }
        // return count;
    }
//     public boolean func(int i, int j, String s, String t,boolean[][] dp){
//         if(i<0) return true;
//         if(j<0 && i>=0) return false;
//         if(dp[i][j]) return true;
//         if(s.charAt(i)==t.charAt(j)){
//             return dp[i][j]= func(i-1,j-1,s,t,dp);
//         }
//         return dp[i][j]= func(i,j-1,s,t,dp);
        
//     }
}