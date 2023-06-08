class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr=null;
        List<Integer> prev= null;
        
       
        for(int i=0;i<numRows;i++){
            curr= new ArrayList<>(i);
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) curr.add(1);
                else{
                    curr.add(prev.get(j)+prev.get(j-1));
                }
                
            }
            ans.add(curr);
            prev=curr;
        }
        return ans;
        
        
        
   }
}