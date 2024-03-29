class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length && n>0;i++){
            if(flowerbed[i]==0){
                int prev=(i==0)?0:flowerbed[i-1];
                int next=(i==flowerbed.length-1)?0:flowerbed[i+1];
                if(prev==0 && next==0){
                    flowerbed[i]=1;
                    n--;
                }
            }
        }
        if(n>0) return false;
        return true;
    }
}