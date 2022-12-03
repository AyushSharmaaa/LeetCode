public class MinStack {
    private ListNode head;
    private int size;
    public MinStack() {
        head = null;
        size=0;
    }

    public void push(int val) {
        ListNode newNode = new ListNode(val);
        size++;
        newNode.next=head;
        head=newNode;
    }
   public void pop() {
       if (head!=null){
           size--;
           head = head.next;
       }
    }
     public int top() {
        if (head==null){
            return 0;
        }
        else {
            return (int) head.val;
        }
    }

    public int getMin() {
        if (head==null){
            return 0;
        }
        else {
            ListNode temp = head;
            int min = (int) temp.val;
            while (temp != null) {
                if ((int) temp.val < min) {
                    min = (int) temp.val;
                }
                temp = temp.next;
            }
            return min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */