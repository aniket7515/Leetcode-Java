//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        HashMap<Integer, Integer> map= new HashMap<>();
        
        for(int i=0;i<N;i++){
            map.put(A1[i],map.getOrDefault(A1[i],0)+1);
        }
        int res[]=new int[N];
        int x=0;
        for(int i=0;i<M;i++){
            if(map.containsKey(A2[i])){
                int y=map.get(A2[i]);
                while(y-->0){
                    res[x]=A2[i];
                    x++;
                }
                map.remove(A2[i]);
            }
        }
        List<Integer> ls=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int y=e.getValue();
            while(y-->0){
                ls.add(e.getKey());
            }
        }
        Collections.sort(ls);
        for(int i=0;i<ls.size();i++){
            res[x]=ls.get(i);
            x++;
        }
        return res;
        //Your code here\
        /*HashMap<Integer, Integer> map= new HashMap<>();
        
        for(int i=0;i<N;i++){
            if(map.containsKey(A1[i])){
                map.put(A1[i],map.get(A1[i])+1);
            }else{
                map.put(A1[i],1);
            }
        }
        
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<A2.length;i++){
            int a=map.get(A2[i]);
            while(a-->0){
                arr.add(A2[i]);
            }
            map.remove(A2[i]);
            
            
        }
        List<Integer> arr1= new ArrayList<>();
        if(map.size()!=0){
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int a=entry.getValue();
            while(a-->0){
                arr1.add(entry.getKey());
            }
        }
        Collections.sort(arr1);
        for(Integer i:arr1){
            arr.add(i);
        }
        }
        int[] ans= new int[arr.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr.get(i);
        }
        return ans;*/
        
    }
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends