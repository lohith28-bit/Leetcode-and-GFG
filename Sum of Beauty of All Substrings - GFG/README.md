# Sum of Beauty of All Substrings
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a&nbsp;string<strong style="user-select: auto;"> S</strong>, return the sum of <strong style="user-select: auto;">beauty</strong> of all its substrings.<br style="user-select: auto;">
The <strong style="user-select: auto;">beauty</strong> of a string is defined as the difference in frequencies between the most frequent and least frequent characters.</span></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">For example, the beauty of string "aaac" is 3 - 1 = 2.</span></li>
</ul>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<div style="background: rgb(43, 43, 43); border: 1px solid rgb(77, 77, 77); padding: 5px 10px; --darkreader-inline-bgimage:hsla(0,0%,75%,1); --darkreader-inline-bgcolor:hsla(0,0%,75%,1); --darkreader-inline-border-top:hsla(0,0%,75%,1); --darkreader-inline-border-right:hsla(0,0%,75%,1); --darkreader-inline-border-bottom:hsla(0,0%,75%,1); --darkreader-inline-border-left:hsla(0,0%,75%,1); --darkreader-inline-bgimage-night-eye:hsla(0,0%,35%,1); --darkreader-inline-bgcolor-night-eye:hsla(0,0%,35%,1); --darkreader-inline-border-top-night-eye:hsla(0,0%,35%,1); --darkreader-inline-border-right-night-eye:hsla(0,0%,35%,1); --darkreader-inline-border-bottom-night-eye:hsla(0,0%,35%,1); --darkreader-inline-border-left-night-eye:hsla(0,0%,35%,1); user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong><br style="user-select: auto;">
S = "aaac"<br style="user-select: auto;">
<strong style="user-select: auto;">Output: </strong><br style="user-select: auto;">
3<br style="user-select: auto;">
<strong style="user-select: auto;">Explanation:&nbsp;</strong>The substrings with non - zero&nbsp;beauty are ["aaac","aac"] where beauty of "aaac" is 2 and beauty of "aac" is 1.</span></div>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<div style="background: rgb(43, 43, 43); border: 1px solid rgb(77, 77, 77); padding: 5px 10px; --darkreader-inline-bgimage:hsla(0,0%,75%,1); --darkreader-inline-bgcolor:hsla(0,0%,75%,1); --darkreader-inline-border-top:hsla(0,0%,75%,1); --darkreader-inline-border-right:hsla(0,0%,75%,1); --darkreader-inline-border-bottom:hsla(0,0%,75%,1); --darkreader-inline-border-left:hsla(0,0%,75%,1); --darkreader-inline-bgimage-night-eye:hsla(0,0%,35%,1); --darkreader-inline-bgcolor-night-eye:hsla(0,0%,35%,1); --darkreader-inline-border-top-night-eye:hsla(0,0%,35%,1); --darkreader-inline-border-right-night-eye:hsla(0,0%,35%,1); --darkreader-inline-border-bottom-night-eye:hsla(0,0%,35%,1); --darkreader-inline-border-left-night-eye:hsla(0,0%,35%,1); user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong><br style="user-select: auto;">
S = "geeksforgeeks"<br style="user-select: auto;">
<strong style="user-select: auto;">Output: </strong><br style="user-select: auto;">
62<br style="user-select: auto;">
<strong style="user-select: auto;">Explanation:</strong> There are 91&nbsp;substrings of the given strings. Like, the beauty of substring "geek" is 1. In this way the sum of&nbsp;beauties of all substrings are 62.</span></div>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">beautySum()</strong> which takes&nbsp;string <strong style="user-select: auto;">S</strong> as input paramters&nbsp;and returns the sum of <strong style="user-select: auto;">beauty</strong> of all its substrings.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity: </strong>O(|S|<sup style="user-select: auto;">2</sup>)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space: </strong>O(1)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:&nbsp;</strong><br style="user-select: auto;">
1 ≤ |S|&nbsp;≤ 500<br style="user-select: auto;">
S only contains lower case alphabets.</span></p>
</div>