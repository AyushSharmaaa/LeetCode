class Solution {
     public static TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        while (head!=null){
            arrlist.add(head.val);
            head=head.next;
        }
        return findmid(arrlist,0,arrlist.size()-1);
    }

    private static TreeNode findmid(ArrayList<Integer> arrlist, int start, int end) {
        if (start>end){
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(arrlist.get(mid));
        node.left = findmid(arrlist,start,mid-1);
        node.right = findmid(arrlist,mid+1,end);
        return node;
    }
}