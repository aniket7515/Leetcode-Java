class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans= new int[temperatures.length];
        int n=temperatures.length;
        Stack<Integer> s= new Stack<>();
        s.push(n-1);
        ans[0]=0;
        
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
            int nextGtr=(s.isEmpty()?(0):(s.peek()-i));
            ans[i]=nextGtr;
            s.push(i);
        }
        
        int i=0;
        int j=0;
        while(i<j){
            int temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
        }
        return ans;
        
        
    }
}