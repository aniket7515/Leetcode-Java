class Solution {
    public int wordCount(String[] startWords, String[] targetWords) {
        HashSet<String> set= new HashSet<>();
        for(int i=0;i<startWords.length;i++){
            char[] ch= startWords[i].toCharArray();
            Arrays.sort(ch);
            set.add(new String(ch));
        }
        int ans=0;
        for(String s:targetWords){
            int n=s.length();
            for(int i=0;i<n;i++){
                String rec=s.substring(0,i)+s.substring(i+1);
                char[] str=rec.toCharArray();
                Arrays.sort(str);
                String stored=new String(str);
                if(set.contains(stored)){
                    ans++;
                    break;
                } 
            }
        }
        return ans;
    }
}