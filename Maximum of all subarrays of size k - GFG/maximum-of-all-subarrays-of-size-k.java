//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    class Pair{
        int val;
        int index;
        Pair(int val, int index){
            this.val=val;
            this.index=index;
        }
    }
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> ans= new ArrayList<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int max=0;
        for(int i=0;i<k;i++){
            max=Math.max(max,arr[i]);
            pq.add(arr[i]);
        }
        ans.add(max);
        int j=0;
        for(int i=k;i<arr.length;i++){
            pq.remove(arr[j]);
            pq.add(arr[i]);
            max=pq.peek();
            ans.add(max);
            j++;
        }
        return ans;
        
    }
}