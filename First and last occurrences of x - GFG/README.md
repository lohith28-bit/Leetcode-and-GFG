# First and last occurrences of x
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a sorted array <strong style="user-select: auto;">arr</strong> containing <strong style="user-select: auto;">n</strong> elements with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element <strong style="user-select: auto;">x</strong> in the given array.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
<strong style="user-select: auto;">Output:</strong>  2 5
<strong style="user-select: auto;">Explanation</strong>: First occurrence of 5 is at index 2 and last
&nbsp;            occurrence of 5 is at index 5. 
</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
<strong style="user-select: auto;">Output:</strong>  6 6 

</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong style="user-select: auto;">find</strong>() that takes <strong style="user-select: auto;">array arr, integer n and integer x</strong> as parameters and returns the required answer.<br style="user-select: auto;">
<strong style="user-select: auto;">Note:</strong> If the number <strong style="user-select: auto;">x</strong> is not found in the array just return both index as -1.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(logN)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1).</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">7</sup></span></p>

<p style="user-select: auto;">&nbsp;</p>
</div>