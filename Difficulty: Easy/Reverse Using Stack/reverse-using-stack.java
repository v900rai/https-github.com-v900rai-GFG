//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        
System.out.println("~");
}
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
         //code here
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<S.length();i++)
        {
            stack.push(S.charAt(i));
        }
        while(stack.size() > 0)
        {
            sb.append(stack.pop());
        }
        
        return sb.toString();
        
    }

}