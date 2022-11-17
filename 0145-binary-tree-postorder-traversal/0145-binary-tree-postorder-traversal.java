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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ansList = new ArrayList<>();
        postOrder(root,ansList);
        return ansList;
    }
    public static void postOrder(TreeNode root , List<Integer> ansList){
        if(root==null){
            return;
        }
        postOrder(root.left,ansList);
        postOrder(root.right,ansList);
        ansList.add(root.val);
    }
}