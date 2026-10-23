class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return diameter;
    }

    public int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = maxDepth(node.left);
        int right = maxDepth(node.right);

        // ⭐ new idea: check diameter at this node
        diameter = Math.max(diameter, left + right);

        // ⭐ same as before: return height
        return 1 + Math.max(left, right);
    }
}
