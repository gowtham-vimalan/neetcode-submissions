class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode node) {
        if (node == null) return 0;

        return 1 + Math.max(
            maxDepth(node.left),
            maxDepth(node.right)
        );
    }
}
