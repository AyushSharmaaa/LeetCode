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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> AnsList = new ArrayList<>();
        inorder(root , AnsList);
        return AnsList;
    }
    public void inorder(TreeNode root ,  List<Integer> AnsList) {
        if(root==null){
            return;
        }
        inorder(root.left,AnsList);
        AnsList.add(root.val);
        inorder(root.right,AnsList);
    } 
}