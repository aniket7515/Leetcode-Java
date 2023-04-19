class Solution {
    class Pair{
        int num;
        int ind;
        Pair(int num, int ind){
            this.num=num;
            this.ind=ind;
        }
    }
    public long findScore(int[] nums) {
        PriorityQueue<Pair> pq= new PriorityQueue<>((Pair a,Pair b)->{
            if(a.num!=b.num) return ( a.num-b.num);
            else return a.ind-b.ind;
        });
        
        
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            pq.add(new Pair(nums[i],i));
        }
      
        
        boolean[] marked= new boolean[nums.length];
        Arrays.fill(marked,false);
        long count=0;
        while(!pq.isEmpty()){
           Pair a= pq.poll();
            int no=a.num;
            int ind=a.ind;
            
            if(marked[ind])continue;
            
            count+=a.num;
            marked[ind]=true;
            
            if(ind-1>=0) marked[ind-1]=true;
            if(ind+1<n) marked[ind+1]=true;
            
        }
        
        return count;
    }
}