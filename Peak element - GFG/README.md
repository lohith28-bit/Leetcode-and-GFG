# Peak element
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">An element is called a peak element if its value&nbsp;is not smaller than the value of&nbsp;its adjacent elements(if they exists).<br style="user-select: auto;">
Given an array <strong style="user-select: auto;">arr[]</strong> of size&nbsp;<strong style="user-select: auto;">N</strong>,&nbsp;<strong style="user-select: auto;">Return the index of any one of its&nbsp;peak elements</strong>.<br style="user-select: auto;">
<strong style="user-select: auto;">Note:&nbsp;</strong>The generated output will always be&nbsp;1 if the index that you&nbsp;return is correct. Otherwise output will be 0.&nbsp;</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input: 
</span></strong><span style="font-size: 18px; user-select: auto;">N = 3
arr[] = {1,2,3}
</span><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Possible Answer: </span></strong><span style="font-size: 18px; user-select: auto;">2
<strong style="user-select: auto;">Generated Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0.</span>
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:
</span></strong><span style="font-size: 18px; user-select: auto;">N = 2
arr[] = {3,4}
</span><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Possible Answer: </span></strong><span style="font-size: 18px; user-select: auto;">1
<strong style="user-select: auto;">Output: </strong>1<strong style="user-select: auto;">
Explanation: </strong>4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.
</span><span style="font-size: 18px; user-select: auto;">If 1 is returned then the generated output will be 1 else 0.</span>
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">You don't have to read&nbsp;input or print anything. Complete the function <strong style="user-select: auto;">peakElement</strong>() which takes the array arr[] and its size N as input parameters and return the&nbsp;index of any one of its peak elements.<br style="user-select: auto;">
<br style="user-select: auto;">
Can you solve the problem in expected time complexity?</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(log N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ A[] ≤ 10<sup style="user-select: auto;">6</sup></span></p>
</div>