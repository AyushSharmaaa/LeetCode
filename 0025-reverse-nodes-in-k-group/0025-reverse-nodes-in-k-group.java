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
    public void reverseKgroup2(ListNode start , ListNode end){
        //It is for reverse the group
        ListNode prev = null;
        ListNode cur = start;
        ListNode nex = start.next;

        while (prev!=end){
            cur.next = prev;
            prev = cur;
            cur = nex;
           if (nex!=null){nex = nex.next;}
        }
    }
   public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode start = head;
        ListNode end = head;
        int inc = k - 1;
        while (inc-- != 0) {
            end = end.next;
            if (end == null) {
                return head;
            }
        }
        ListNode newHead = reverseKGroup(end.next, k);
        reverseKgroup2(start, end);
        start.next = newHead;
        return end;

}
}