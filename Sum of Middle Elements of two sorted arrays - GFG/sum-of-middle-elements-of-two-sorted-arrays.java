//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        
        List<Integer> arr= new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j<n){
            arr.add(ar1[i]);
            arr.add(ar2[j]);
            i++;
            j++;
        }
        Collections.sort(arr);
        return arr.get(n)+arr.get(n-1);
        
        // code here
        // int m= n;
        // int i=0;
        // int j=0;
        // int cnt=0;
        // int sum=0;
        // while(i<n && j<n){
        //     if(ar1[i]>ar2[j]){
        //         if((j==n-1 || i==n) && cnt<2){
        //             sum+=ar2[j];
        //             cnt++;
        //         } 
        //         j++;
                
        //     }else if(ar2[j]>ar1[i]){
        //         if((i==n-1 || i==n) && cnt<2){
        //             sum+=ar1[i];
        //             cnt++;
        //         } 
        //         i++;
        //     }
        // }
        // return sum;
    }
}