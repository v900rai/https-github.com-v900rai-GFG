//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.toLower(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
    static String toLower(String s) {
      String str=s.toLowerCase();
      return str;
    }
}