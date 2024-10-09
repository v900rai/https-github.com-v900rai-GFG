//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node right, down;

    Node(int data) {
        this.data = data;
        right = null;
        down = null;
    }
}

public class Linked_list_2D_Matrix {

    // Non-static display method
    void display(Node head) {
        Node Dp = head;
        while (Dp != null) {
            Node Rp = Dp;
            while (Rp != null) {
                System.out.print(Rp.data + " ");
                if (Rp.right != null)
                    System.out.print(Rp.right.data + " ");
                else
                    System.out.print("null ");
                if (Rp.down != null)
                    System.out.print(Rp.down.data + " ");
                else
                    System.out.print("null ");
                Rp = Rp.right;
            }
            Dp = Dp.down;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linked_list_2D_Matrix ll2d =
            new Linked_list_2D_Matrix(); // Create an instance of the class

        try {
            int t = Integer.parseInt(scanner.nextLine().trim());

            while (t-- > 0) {
                // Read and process the first line of input
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue; // Skip empty lines
                }

                String[] elements = line.split("\\s+");
                int n = elements.length;

                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(elements[i]);
                }

                int[][] mat = new int[n][n];
                mat[0] = arr;

                // Read the remaining rows of the matrix
                for (int i = 1; i < n; i++) {
                    line = scanner.nextLine().trim();
                    elements = line.split("\\s+");
                    for (int j = 0; j < n; j++) {
                        mat[i][j] = Integer.parseInt(elements[j]);
                    }
                }

                Solution obj = new Solution();
                Node head = obj.construct(mat);
                ll2d.display(head); // Call non-static method using instance
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.err.println(
                "Error reading input. Please ensure the input is in the correct format.");
        } finally {
            scanner.close();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

/*class Node

class Node
{
   int data;
   Node right,down;

   Node(int data){
       this.data = data;
       right = null;
       down = null;
   }
}
*/
/*Function should return the head of the 2D LL.*/
/*class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    static Node construct(int arr[][]) {
        // Add your code here
        int n = arr.length, m = arr[0].length;
        Node ans = null;
        Node startOfNextRow = null;
        for(int i = 0; i < n; i++) {

            Node lastInRow = null;  // horizontal previous node
            Node nextLastInRow = null;  // next rows horizontal previous node
            Node newer = null;
            for(int j = 0; j < m; j++) {
                if (i == 0) {   // first row
                    newer = new Node(arr[i][j]);
                } else {    // second row onwards
                    if (j == 0)
                        newer = startOfNextRow;
                    else newer = newer.right;
                }
                // one time
                if(ans == null)
                    ans = newer;
                    
                // previous pointer in row
                if (lastInRow != null) 
                    lastInRow.right = newer;
                lastInRow = newer;
                
                if (i + 1 < n) {
                    // downward node creation
                    Node down = new Node(arr[i + 1][j]);
                    if (j == 0)
                        startOfNextRow = down;  // mark start of next row
                    newer.down = down;
                    
                    // set previous pointer in row (of next row)
                    if (nextLastInRow == null) {
                        nextLastInRow = down;
                    } else {
                        nextLastInRow.right = down;
                        nextLastInRow = down;
                    }
                }   
            }
        }
        return ans;
    }
}
 
