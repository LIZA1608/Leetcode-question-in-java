/*https://leetcode.com/problems/minimum-depth-of-binary-tree/description/*/

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
    public int minDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int x=minDepth(root.left);
        int y=minDepth(root.right);
        if(x==0||y==0){
            return x+y+1;
        }
        else{
         return Math.min(x,y)+1;
    }
}
}
