class Solution {
    
    public boolean hasAllCodes(String s, int k) {
        if(k>s.length()) return false;
        HashSet<String> set= new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            set.add(s.substring(i,i+k));
        }
        
        return set.size()==Math.pow(2,k);
        
        
        
//         int[] arr= new int[k];
//         String s1="";
//         List<String> res= new ArrayList<>();
//         generate(k,0,s1, res);
        
        
       
//         for(int i=0;i<res.size();i++){
//             if(!s.contains(res.get(i))) return false;
//         }
//         return true;
        
    }
//     public void generate(int k, int i, String s, List res) {
//     if (i == k) {
//         res.add(s);
//         return;
//     }

//     generate(k, i + 1, s + "0", res);
//     generate(k, i + 1, s + "1", res);
// }
}