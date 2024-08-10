//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        
        if(matrix.length ==0) return null;
        
        ArrayList<Integer> list = new ArrayList<>();
        int colStart = 0 ;
        int colEnd = matrix[0].length-1;
        int rowStart = 0 ;
        int rowEnd = matrix.length-1 ;
        
        
        while(rowStart <= rowEnd && colStart <= colEnd){
            
            // from left to right
            
            for(int i = colStart ; i <= colEnd; i++){
                list.add(matrix[rowStart][i]);
            }
            rowStart++;
            
            // from top to bottom on right side
            
            for(int i = rowStart ; i <= rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            
            colEnd--;
            
            // from right to left at bottom
            
            if(rowStart <= rowEnd){
                
                for(int i = colEnd ; i >= colStart ; i--){
                    list.add(matrix[rowEnd][i]);
                }
                 rowEnd--;
            }
            
           // from bottom to up at left
            
            if(colStart <= colEnd){
                
                for(int i = rowEnd ; i >= rowStart ; i--){
                    list.add(matrix[i][colStart]);
                }
                colStart++;
            }
             
        }
        
        return list ;
    }
}

