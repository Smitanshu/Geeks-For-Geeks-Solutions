class Solution {
    public int countPairs(int[] arr, int k)
    {
        // Sort the array in non-decreasing order
        Arrays.sort(arr);

        int total = 0;
        int s = 0;

        // Iterate with right pointer i
        for (int i = 0; i < arr.length; i++) {

            // Shrink the window from the left until the
            // condition holds
            while (arr[i] - arr[s] >= k) {
                s++;
            }

            // All elements between 's' and 'i-1' form
            // a valid pair with 'arr[i]'
            total += (i - s);
        }

        return total;
    }
}
