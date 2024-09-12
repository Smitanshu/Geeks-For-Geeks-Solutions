//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int n) { 
         
         
         
         
         Set<Integer>seen=new HashSet<>();
         while(!seen.contains(n)){
             
             seen.add(n);
             int sum=0;
             while(n!=0){
                 
                 int bit=n%10;
                 sum+=bit*bit;
                 
                 n=n/10;
             }
            n=sum;
             if(n==1){
                 return 1;
             }
         }
         return 0;
     }
}