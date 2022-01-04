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
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    public int minDiffInBST(TreeNode root) {
        if(root == null) return min;
        
        minDiffInBST(root.left);
        if(prev!=null){
            min = Math.min(min, root.val-prev);
        }
        prev=root.val;
        minDiffInBST(root.right);
        
        return min;
    }
}

// Explanation: https://leetcode.com/problems/minimum-absolute-difference-in-bst/discuss/585431/java-accepted-solution-inorder-with-clear-explanation
