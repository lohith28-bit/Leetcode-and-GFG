# Floor in a Sorted Array
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a sorted array <strong style="user-select: auto;">arr</strong>[] of size <strong style="user-select: auto;">N</strong> without duplicates, and given a value <strong style="user-select: auto;">x</strong>. Floor of x is defined as the largest element <strong style="user-select: auto;">K</strong> in arr[] such that K is smaller than or equal to x.&nbsp;Find the index of K(0-based indexing).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 7, x = 0 
arr[] = {1,2,8,10,11,12,19}
<strong style="user-select: auto;">Output: </strong>-1<strong style="user-select: auto;">
Explanation: </strong>No element less 
than 0 is found. So output 
is "<strong style="user-select: auto;">-1</strong>".</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 7, x = 5 
arr[] = {1,2,8,10,11,12,19}
<strong style="user-select: auto;">Output: </strong>1<strong style="user-select: auto;">
Explanation: </strong>Largest Number less than 5 is
<strong style="user-select: auto;">2 (i.e K = 2)</strong>, whose index is <strong style="user-select: auto;">1</strong>(0-based 
indexing).</span>
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your&nbsp;Task:</strong><br style="user-select: auto;">
The task is to complete the function <strong style="user-select: auto;">findFloor</strong>() which returns an&nbsp;integer denoting the index value of K&nbsp;or return <strong style="user-select: auto;">-1</strong> if there isn't any such number.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(log N).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">7</sup><br style="user-select: auto;">
1 ≤ arr[i] ≤ 10<sup style="user-select: auto;">18</sup><br style="user-select: auto;">
0 ≤ X&nbsp;≤<sup style="user-select: auto;"> </sup>arr[n-1]</span></p>
</div>