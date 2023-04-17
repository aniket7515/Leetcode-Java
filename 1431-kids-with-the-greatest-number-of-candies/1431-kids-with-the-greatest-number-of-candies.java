class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        
        
        
        ArrayList<Boolean> ans=new ArrayList<>();
        
        for(int j=0;j<candies.length;j++){
            candies[j]+=extraCandies;
            if(candies[j]>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }return ans;
    }
}