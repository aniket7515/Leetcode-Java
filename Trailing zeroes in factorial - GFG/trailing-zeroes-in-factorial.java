//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
			
            Solution ob = new Solution();
            int ans  = ob.trailingZeroes(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int trailingZeroes(int N){
        // Write your code here
        int count=0;
        for(int i=5;i<=N;i*=5){
            count+=(N/i);
        }
        return count;
    }
    // as we know that for 0 ot depend on number of occurence of 5 in a factorial
    // so we will count number divided by five power and that will be our answer
}