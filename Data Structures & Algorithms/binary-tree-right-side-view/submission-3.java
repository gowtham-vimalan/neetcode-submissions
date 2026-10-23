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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return List.of();
        }
        List<Integer> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node != null) {
                    level.add(node.val);
                    if(node.left != null){
                    queue.add(node.left);
                    }
                    if(node.right != null){
                    queue.add(node.right);
                    }
                }
            }
            result.add(level.get(level.size() - 1));
        }

        return result;

    }
}
