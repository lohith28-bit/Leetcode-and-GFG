# Leaders in an array
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array A of positive integers. Your task is to find the leaders in the array.&nbsp;An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.&nbsp;</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 6
A[] = {16,17,4,3,5,2}
<strong style="user-select: auto;">Output: </strong>17 5 2<strong style="user-select: auto;">
Explanation: </strong>The first leader is 17 
as it is greater than all the elements
to its right.&nbsp; Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.</span>
</pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 5
A[] = {1,2,3,4,0}
<strong style="user-select: auto;">Output: </strong>4 0
</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything.&nbsp;The task is to complete the function <strong style="user-select: auto;">leader</strong>() which takes array A and n&nbsp;as input parameters and&nbsp;returns an array of leaders in order of their appearance.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong></span><span style="font-size: 18px; user-select: auto;">&nbsp;O(n)</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(n)</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= n&nbsp;&lt;= 10<sup style="user-select: auto;">7</sup><br style="user-select: auto;">
0 &lt;= A<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">7</sup></span></p>
</div>