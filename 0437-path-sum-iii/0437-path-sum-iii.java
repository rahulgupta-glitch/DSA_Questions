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
    int path = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        solve(root, targetSum, 0);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return path;
    }

    public void solve(TreeNode root, int targetSum, long curSum) {
        if (root == null) {
            return;
        }
        curSum += root.val;
        if (curSum == targetSum) {
            path++;
        }
        solve(root.left, targetSum, curSum);
        solve(root.right, targetSum, curSum);
    }
}