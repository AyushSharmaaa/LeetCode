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
  public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode ansHead = null;
        ListNode ansTail = null;
        int carry = 0;
        while (head1!=null||head2!=null||carry!=0){
            int val1 = 0;
            if (head1!=null){
                val1= head1.val;
            }

            int val2 = 0;
            if (head2!=null){
                val2= head2.val;
            }

            int sum = carry + val1 + val2;
            int digit = sum%10;

            ListNode temp = new ListNode(digit);
            if (ansHead==null){
                ansHead = temp;
                ansTail = temp;
            }
            else {
                ansTail.next=temp;
                ansTail = temp;
            }
            carry = sum/10;
            if (head1!=null){
                head1=head1.next;
            }
            if (head2!=null){
                head2=head2.next;
            }
        }
        return ansHead;
    }
}