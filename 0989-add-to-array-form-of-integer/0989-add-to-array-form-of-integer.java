class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans= new ArrayList<>();
        int i=num.length-1;
        while(i>=0 || k>0){
            if(i>=0) k=k+num[i];
            
            int nu=k%10;
            ans.add(nu);
            k=k/10;
            i--;
            
        }
        
        Collections.reverse(ans);
        return ans;
        
    }
}