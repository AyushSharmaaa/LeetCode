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
   private static ListNode reverse(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode n = current.next;
        while (current!=null){
            current.next=previous;
            previous=current;
            current=n;
            if (n!=null){
                n=n.next;
            }
        }
        return previous;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null||n==0){
            return head;
        }
        int count=0;
        ListNode temp = reverse(head);
        ListNode dummy = new ListNode(-1);
        dummy.next=temp;
        temp=dummy;
        while (temp!=null){
            count++;
            if (count==n){
                temp.next=temp.next.next;
            }
            else {
                temp=temp.next;
            }
        }
        return reverse(dummy.next);
    }
}