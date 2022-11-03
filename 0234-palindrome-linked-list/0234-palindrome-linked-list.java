/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode n = current.next;

        while (current != null) {
            current.next = previous;
            previous = current;
            current = n;
            if (n != null) {
                n = n.next;
            }
        }
        return previous;
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       slow.next = reverseList(slow.next);
        ListNode start = head;
        ListNode mid = slow.next;
        while (mid!=null){
            if (mid.val!=start.val){
                return false;
            }
            start=start.next;
            mid=mid.next;
        }
        return true;
    }
}