//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().nextGreatest(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        
        
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));

        int maxFromRight = -1; // The last element should be -1
        for (int i = n - 1; i >= 0; i--) {
            result.set(i, maxFromRight); // Store the max value seen so far
            maxFromRight = Math.max(maxFromRight, arr[i]); // Update maxFromRight
        }

        return result;
        
    
    }
}