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
    public boolean isSameTree(TreeNode rootA,TreeNode rootB){
        if (rootA==null&&rootB==null){
            return true;
        }
        if (rootA!=null&&rootB!=null){
             boolean left = isSameTree(rootA.left,rootB.left);
             boolean right = isSameTree(rootA.right,rootB.right);
            if ((rootA.val==rootB.val) && left && right){
                return true;
            }
        }
        return false;
    }
}