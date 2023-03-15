class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if (root==null){
            return true;
        }
        boolean checkNullNode = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            TreeNode currNode = q.remove();
            if (currNode==null){
                checkNullNode = true;
            }
            else {
                if (checkNullNode){
                    return false;
                }
                q.add(currNode.left);
                q.add(currNode.right);
            }
        }
        return true;
    }
}