class Solution {
    // class Pair{
    //     int first;
    //     int second;
    //     Pair(int first, int second){
    //         first=this.first;
    //         second=this.second;
    //     }
    // }
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        
        int[] diff= new int[reward1.length];
        int res=0;
        
        for(int i=0;i<reward1.length;i++){
            diff[i]=reward1[i]-reward2[i];
            res+=reward2[i];
        }
        Arrays.sort(diff);
        for(int i=0;i<k;i++){
            res+=diff[diff.length-i-1];
        }
        return res;
        
        
        // if(k==reward1.length){
//             int sum=0;
//             for(int i:reward1) sum+=i;
//             return sum;
//         }
//         int sum2=0;
//         for(int i:reward2) sum2+=i;
        
//         List<Pair> arr= new ArrayList<>();
//         for(int i=0;i<reward1.length;i++){
//             arr.add(new Pair(reward1[i],reward2[i]));
//         }
//         for(Pair p:arr) System.out.println(p.first+" "+p.second);
//         Collections.sort(arr,(a,b)->b.first-a.first);
//         int sum=0;
//         int sum1=0;
//         for(int i=0;i<arr.size() && k-->0;i++){
//             sum+=arr.get(i).first;
//             sum1+=arr.get(i).second;
//         }
      
        
//         return (sum+(sum2-sum1));
        
    }
}