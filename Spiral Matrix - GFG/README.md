# Spiral Matrix
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a matrix of size<strong style="user-select: auto;"> N x M</strong>. You have&nbsp;to find the <strong style="user-select: auto;">K<sup style="user-select: auto;">th</sup></strong> element which will&nbsp;obtain&nbsp;while traversing the matrix <strong style="user-select: auto;">spirally</strong> starting from the top-left corner of the matrix.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto; position: relative;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: 
</strong>N = 3, M = 3, K = 4
A[] = {</span><span style="font-size: 18px; user-select: auto;">{1, 2, 3}, 
       {4, 5, 6},&nbsp;
       {7, 8, 9</span><span style="font-size: 18px; user-select: auto;">}}</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong> 
6</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation: </strong>Spiral traversal of matrix: 
{1, 2, 3, 6, 9, 8, 7, 4, 5}. Fourth element
is 6.</span>
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto; position: relative;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: 
</strong>N = 2, M = 2, K = 2 
A[] = {</span><span style="font-size: 18px; user-select: auto;">{1, 2},
       {3, 4}</span><span style="font-size: 18px; user-select: auto;">}</span> 
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong> 
2
<strong style="user-select: auto;">Explanation: </strong>Spiral traversal of matrix: 
{1, 2, 4, 3}. Second element is 2.</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task: </strong>&nbsp;<br style="user-select: auto;">
You don't need to read input or print anything. Complete the function <strong style="user-select: auto;">findK()</strong> which takes the matrix <strong style="user-select: auto;">A[ ][ ]</strong>, number of rows <strong style="user-select: auto;">N</strong>, number of columns <strong style="user-select: auto;">M</strong>, and integer <strong style="user-select: auto;">K</strong> as input parameters and returns the<strong style="user-select: auto;"> K<sup style="user-select: auto;">th</sup> </strong>element in the spiral traversal of the matrix.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N*M)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ K&nbsp;≤ N*M ≤ 10<sup style="user-select: auto;">6</sup></span></p>
</div>