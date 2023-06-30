class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String s1=s.substring(i,j);
                if(s1.length()>2)ans+=func(s1);
            }
        }
        return ans;
        
    }
    public int func(String s){
        if(s.length()==1) return 0;
        // HashMap<Character,Integer> map= new HashMap<>();
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            // map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            freq[s.charAt(i)-'a']++;
        }
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<26;i++){
            if(freq[i]!=0) min=Math.min(min,freq[i]);
            max=Math.max(max,freq[i]);
        }
        
        // for(Map.Entry<Character,Integer> entry: map.entrySet()){
        //     min=Math.min(min,entry.getValue());
        //     max=Math.max(max,entry.getValue());
        // }
        
        return Math.abs(max-min);
    }
}
