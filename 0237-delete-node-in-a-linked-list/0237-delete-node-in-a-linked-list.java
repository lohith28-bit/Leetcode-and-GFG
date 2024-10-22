/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       int data = node.next.val;
       node.val = data;
       ListNode temp = node.next;
       node.next = node.next.next; 
       temp.next = null;
    }
}