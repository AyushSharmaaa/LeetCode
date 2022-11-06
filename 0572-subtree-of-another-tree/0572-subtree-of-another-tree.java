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
       public static boolean isIdentical(TreeNode rootA,TreeNode rootB){
        if (rootA==null&&rootB==null){
            return true;
        }
        if (rootA!=null&&rootB!=null){
             boolean left = isIdentical(rootA.left,rootB.left);
             boolean right = isIdentical(rootA.right,rootB.right);
            if ((rootA.val==rootB.val) && left && right){
                return true;
            }
        }
        return false;
    }
    public static boolean isSubtree(TreeNode root,TreeNode subRoot) {
        if (root==null){
            return false;
        }
        if (subRoot==null){
            return true;
        }
        if (isIdentical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
}