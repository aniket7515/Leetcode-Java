class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans= new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int cnt=0;
            int j=0;
            int start=0;
            int end=potions.length-1;
            while(start<=end){
                int mid= start + (end-start)/2;
                long product=(long)spells[i]*potions[mid];
                if( product>=success){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                
            }
//             for(;j<potions.length;j++){
//                 long product=(long)spells[i]*potions[j];
//                 if(product>=success){
//                     break;
//                 }
                
//             }
            ans[i]=potions.length-start;
        }
        
        return ans;
        
        
    }
}