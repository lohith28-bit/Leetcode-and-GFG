# Rotation
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an ascending&nbsp;sorted rotated&nbsp;array&nbsp;<strong style="user-select: auto;">Arr&nbsp;</strong>of distinct integers&nbsp;of size <strong style="user-select: auto;">N</strong>. The array is right rotated <strong style="user-select: auto;">K</strong>&nbsp;times. Find the value of <strong style="user-select: auto;">K</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 5
Arr[] = {5, 1, 2, 3, 4}
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 
1 times to the right.
</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 5
Arr[] = {1, 2, 3, 4, 5}
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong>&nbsp;The given array is not rotated.
</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Complete the function <strong style="user-select: auto;">findKRotation()</strong>&nbsp;which takes array <strong style="user-select: auto;">arr</strong> and size&nbsp;<strong style="user-select: auto;">n</strong>,&nbsp;as input parameters&nbsp;and returns an integer representing the answer.&nbsp;You don't to print answer or take inputs.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(log(N))<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N &lt;=10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 &lt;= Arr<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">7</sup></span></p>

<p style="user-select: auto;">&nbsp;</p>
</div>