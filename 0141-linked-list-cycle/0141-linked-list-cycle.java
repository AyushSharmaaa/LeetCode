/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList <ListNode> visited = new ArrayList<>();
        if (head==null || head.next==null){
            return false;
        }
        while (head!=null){
            visited.add(head);
            if (head.next==null){
                return false;
            }
            head=head.next;
            for (int i=0; i<visited.size(); i++){
                if (visited.get(i)==head){
                    return true;
                }
            }
        }
        return true;
    }
}