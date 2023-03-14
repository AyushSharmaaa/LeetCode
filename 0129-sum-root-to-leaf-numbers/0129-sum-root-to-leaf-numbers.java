
  class Solution {
    int ans = 0; // Sum of the all numbers
    public int sumNumbers(TreeNode root) {
        sumNumberHelper(root,0);
        return ans;
    }

    private void sumNumberHelper(TreeNode root, int num) {
        if (root==null){
            return;
        }

        // Number currently form
        num = num*10+(int)root.val;

        if (root.left==null && root.right==null){
            ans+=num;
            return;
        }
        sumNumberHelper(root.left,num);
        sumNumberHelper(root.right,num);
    }
}

       