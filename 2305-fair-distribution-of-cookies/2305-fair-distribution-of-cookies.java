class Solution {
    int ans=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
       func(cookies,k,0,new int[k]);
        return ans;
    }
    public void func(int[] cookies, int k, int start, int[] temp){
        if(start==cookies.length){
            int max=0;
            for(int a:temp) max=Math.max(max,a);
            
            ans=Math.min(ans,max);
            return;
        }
        for(int i=0;i<k;i++){
            temp[i]+=cookies[start];
            func(cookies,k,start+1,temp);
            temp[i]-=cookies[start];
        }
        
    }
    
    
}