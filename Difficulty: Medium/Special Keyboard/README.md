<h2><a href="https://www.geeksforgeeks.org/problems/special-keyboard3018/1?page=3&sortBy=submissions">Special Keyboard</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Imagine you have a special keyboard with the following keys:&nbsp;</span></p>
<p style="margin-left: 40px;"><span style="font-size: 18px;">Key 1: &nbsp;Prints 'A' on screen<br>Key 2: (Ctrl-A): Select screen<br>Key 3: (Ctrl-C): Copy selection to buffer<br>Key 4: (Ctrl-V): Print buffer on screen appending it after what has already been printed. </span></p>
<p><span style="font-size: 18px;">Find maximum numbers of A's that can be produced by pressing keys on the special keyboard N times.&nbsp;</span></p>
<p><br><strong><span style="font-size: 18px;">Example 1:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> N = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> Press key 1 three times.</span></pre>
<p><br><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> N = 7
<strong>Output:</strong> 9
<strong>Explanation:</strong> The best key sequence is 
key 1, key 1, key 1, key 2, key 3,
key4, key 4.</span></pre>
<p><br><span style="font-size: 18px;"><strong>Your Task:</strong><br>You do not need to read input or print anything. Your task is to complete the function <strong>optimalKeys()</strong> which takes N as input parameter and returns the maximum number of A's that can be on the screen after performing N operations.</span></p>
<p><br><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(N<sup>2</sup>)<br><strong>Expected Auxiliary Space:</strong> O(N)</span></p>
<p><br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt; N &lt; 76</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Paytm</code>&nbsp;<code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Recursion</code>&nbsp;<code>Algorithms</code>&nbsp;