//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    
    static int majorityElement(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            // Count occurrences of arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if count is greater than n/2
            if (count > n / 2) {
                return arr[i];
            }
        }

        // If no majority element exists
        return -1;
    

   

    }
}