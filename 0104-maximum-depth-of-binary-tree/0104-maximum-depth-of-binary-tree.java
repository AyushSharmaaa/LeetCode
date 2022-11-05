/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int d1 = maxDepth(root.left);
        int d2 = maxDepth(root.right);
        return 1+Math.max(d1,d2);
    }
}