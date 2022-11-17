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
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ansList = new ArrayList<>();
        preOrder(root,ansList);
        return ansList;
    }
    public static void preOrder(TreeNode root , List<Integer> ansList){
         if(root==null){
            return;
        }
        ansList.add(root.val);
        preOrder(root.left,ansList);
        preOrder(root.right,ansList);
    }
}