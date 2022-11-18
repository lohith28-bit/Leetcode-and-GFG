# Ceil The Floor
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an unsorted array <strong style="user-select: auto;">Arr[]</strong>&nbsp;of <strong style="user-select: auto;">N</strong> integers and an integer&nbsp;<strong style="user-select: auto;">X</strong>, find floor and ceiling of <strong style="user-select: auto;">X</strong>&nbsp;in <strong style="user-select: auto;">Arr[0..N-1]</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Floor</strong>&nbsp;of <strong style="user-select: auto;">X</strong> is the largest element which is smaller than or equal to <strong style="user-select: auto;">X</strong>. Floor of <strong style="user-select: auto;">X</strong>&nbsp;doesn’t exist if <strong style="user-select: auto;">X</strong>&nbsp;is smaller than smallest element of <strong style="user-select: auto;">Arr[]</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Ceil</strong>&nbsp;of <strong style="user-select: auto;">X</strong>&nbsp;is the smallest element which is greater than or equal to <strong style="user-select: auto;">X</strong>. Ceil of <strong style="user-select: auto;">X</strong>&nbsp;doesn’t exist if <strong style="user-select: auto;">X</strong> is greater than greatest element of <strong style="user-select: auto;">Arr[]</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 8, X = 7
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
<strong style="user-select: auto;">Output:</strong> 6 8
<strong style="user-select: auto;">Explanation:
</strong>Floor of 7 is 6 and ceil of 7 
is 8.
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 8, X = 10
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
<strong style="user-select: auto;">Output:</strong> 9 -1
<strong style="user-select: auto;">Explanation:
</strong>Floor of 10 is 9 but ceil of 10 is not 
possible.
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">getFloorAndCeil()</strong>&nbsp;which takes the array of integers&nbsp;<strong style="user-select: auto;">arr, n</strong>&nbsp;and&nbsp;<strong style="user-select: auto;">x&nbsp;</strong>as parameters and returns a pair&nbsp;of integers denoting the answer. Return <strong style="user-select: auto;">-1</strong> if floor or ceil is not present.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints :</strong><br style="user-select: auto;">
1 ≤ N&nbsp;≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ Arr[i], X ≤ 10<sup style="user-select: auto;">6</sup></span></p>

<p style="user-select: auto;">&nbsp;</p>
</div>