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
    public TreeNode sortedArrayToBST(int[] nums) {
        return arrayToBSTHelper(nums, 0, nums.length-1); // A Helper method to generate the Tree
    }
    public TreeNode arrayToBSTHelper(int[] n, int start, int end){
        if(start>end) return null; // Base Case
        int mid = (start+end)/2; // Always taking the mid as the root of the tree
        TreeNode x = new TreeNode(n[mid]);
        x.left = arrayToBSTHelper(n, start, mid-1); // recursively following the same process for left half of the array
        x.right = arrayToBSTHelper(n, mid+1, end); // and right half of the array and storing in the respective children nodes (root.left, root.right)
        return x;
    }
} 
