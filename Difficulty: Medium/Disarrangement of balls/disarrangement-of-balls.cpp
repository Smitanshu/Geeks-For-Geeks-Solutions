//{ Driver Code Starts
// Initial function Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    long int disarrange(int n) {
        // code here
        
       
        // Base cases
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return 0;
        }
        
        // Initialize base cases
        long long int prev1 = 0;  // D(1)
        long long int prev2 = 1;  // D(0)
        long long int sum = 0;

        // Calculate disarrangements using the recursive relation
        for(int i = 2; i <= n; i++) {
            sum = (i - 1) * (prev1 + prev2);
            
             sum = sum % 1000000007;
            prev2 = prev1;
            prev1 = sum;
        }

        return sum;
    

    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;

        Solution ob;
        cout << ob.disarrange(N) << "\n";
    }
    return 0;
}
// } Driver Code Ends