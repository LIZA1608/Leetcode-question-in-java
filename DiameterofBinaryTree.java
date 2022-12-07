/*https://leetcode.com/problems/diameter-of-binary-tree/*/

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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int x= diameterOfBinaryTree(root.left);
        int y= diameterOfBinaryTree(root.right);
        int z= ht(root.left)+ht(root.right)+2;
        return Math.max(x,Math.max(y,z));
        
    }
    public int ht(TreeNode n){
        if(n==null){
            return -1;
        }
        int x=ht(n.left);
        int y=ht(n.right);
        return Math.max(x,y)+1;
    }
}
