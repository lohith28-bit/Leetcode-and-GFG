# Search in Rotated Array 2
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a sorted and rotated array A of N&nbsp;elements which is rotated at some point, and may contain duplicates&nbsp;and given an element key. Check whether the key exist in the array A or not.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 7
A[] = {</span><span style="font-size: 18px; user-select: auto;">2,5,6,0,0,1,2}
key = 0
<strong style="user-select: auto;">Output</strong>:
1
<strong style="user-select: auto;">Explanation</strong>:
0 is found at index 3.</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2</strong>:</span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>:
N = 7
A[] = {</span><span style="font-size: 18px; user-select: auto;">2,5,6,0,0,1,2}
key = 3<strong style="user-select: auto;">
Output</strong>:
0<strong style="user-select: auto;">
Explanation</strong>:
There is no element that has value 3.</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task</strong>:<br style="user-select: auto;">
Complete the function&nbsp;search()&nbsp;which takes a integer N and&nbsp; an array A&nbsp;and the Key as input parameters, and returns the answer.</span><br style="user-select: auto;">
<br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity</strong>:&nbsp;O(log N).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space</strong>:&nbsp;O(1).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints</strong>:<br style="user-select: auto;">
1 ≤ N ≤ 5000<br style="user-select: auto;">
0 ≤ A[i] ≤ 10<sup style="user-select: auto;">8</sup><br style="user-select: auto;">
1 ≤ key ≤ 10<sup style="user-select: auto;">8</sup></span></p>
</div>