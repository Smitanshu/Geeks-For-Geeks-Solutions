//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        while (T > 0) {
            String[] input = sc.nextLine().trim().split(" ");
            int[] a = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            Solution ob = new Solution();
            ob.segregateElements(a);
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            T--;
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
       int[] newArr = new int[arr.length];
       for(int i=0; i<arr.length;i++){
           newArr[i]=arr[i];
       }
        int n=arr.length;
        int index=0;
        for(int i=0; i<n;i++){
            if(newArr[i]>=0){
                arr[index]=newArr[i];
                index++;
            }
        }
        for(int i=0; i<n;i++){
            if(newArr[i]<=-1){
                arr[index]=newArr[i];
                index++;
            }
        }
    }
}