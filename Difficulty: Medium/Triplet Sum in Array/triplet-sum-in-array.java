//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution();
            boolean ans =
                ob.hasTripletSum(nums, target); // Call the function and store result
            System.out.println(ans ? "true" : "false"); // Output the result
        }
    }
}

// } Driver Code Ends


// User function Template for Java


class Solution {
    public static boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        for(int i =0 ; i<arr.length-2 ; i++){
            int k = i+1;
            int j = arr.length - 1;
            while (k < j) { 
                int sum = arr[i] + arr[k] + arr[j];
                
                if (sum == target) {
                    return true; 
                } else if (sum < target) {
                    k++; 
                } else {
                    j--; 
                }
            }
        }
        return false;
    }
}