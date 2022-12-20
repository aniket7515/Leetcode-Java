class Solution {
    public int minOperations(int[][] grid, int x) {
        
        int[] arr= new int[grid.length*grid[0].length];
        int idx=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[idx++]=grid[i][j];
            }
        }
        
        Arrays.sort(arr);
        int median=arr[(arr.length-1)/2];
        
        int ans=0;
        for(int num:arr){
            if(num==median) continue;
            if(Math.abs(num-median)%x!=0) return -1;
            
            ans+=(Math.abs(num-median)/x);
        }
        return ans;
        
//         List<Integer> arr = new ArrayList<>();
//         int rem=0;
//         rem=(grid[0][0])%x;
//         for(int[] a:grid){
            
//             for(int i=0;i<a.length;i++){
//                 arr.add(a[i]);
//                 if(a[i]%x!=rem) return -1;
//             } 
//         }
//         Collections.sort(arr);
//         int median=arr.get((arr.size())/2);
//         int count=0;
//         for(int i=0;i<arr.size();i++){
//             while(arr.get(i)!=median){
//                 if(arr.get(i)>median) arr.set(i,arr.get(i)-x);
//                 else if(arr.get(i)<median) arr.set(i,arr.get(i)+x);
                
//                 count++;
//             }
//         }
//         return count;
        
    }
}