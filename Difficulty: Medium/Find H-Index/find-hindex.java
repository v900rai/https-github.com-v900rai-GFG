//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine().trim());

        while (test_cases-- > 0) {
            // Read the array from input line
            String[] input = br.readLine().trim().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            // Solution instance to invoke the function
            Solution ob = new Solution();
            int result = ob.hIndex(arr);

            System.out.println(result);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        int[] freq= new int [citations.length+1];
        for(int i: citations){
            if(i>freq.length-1){
                freq[freq.length-1]++;
            }
            else{
                freq[i]++;
            }
        }
        //sum ko calculate krna h 
        int sum=0;
        for(int i=freq.length-1; i>=0; i--){
            sum+=freq[i];
            if(sum>=i){
                return i;
            }
        }
        return 0;
       
    }
}