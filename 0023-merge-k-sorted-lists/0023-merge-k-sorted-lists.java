
class Solution {
        public static ListNode mergeKLists(ListNode[] lists) {
        //Min Heap of PriorityQueue
        PriorityQueue<Integer> q = new PriorityQueue<>();
        //Dummy Node
        ListNode dummy = new ListNode(-1);
        //Tail for inserting at the tail
        ListNode tail = dummy;
        //Loop for adding all the nodes value in Min Heap
        for (int i=0; i<lists.length; i++){
            while (lists[i]!=null){
                q.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        //Create Merged List 
        while (!q.isEmpty()){
            int temp = q.peek();
            ListNode node = new ListNode(temp);
            tail.next=node;
            tail = node;
            q.remove();
        }
        //Return Merged List
        return dummy.next;
    }
}