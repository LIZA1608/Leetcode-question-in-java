/*https://leetcode.com/problems/balanced-binary-tree/*/

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
 class Pair{
     boolean isB=true;
     int ht=-1;
 }
class Solution {
    public boolean isBalanced(TreeNode root) {
       return  isBal(root).isB;
    }
    public Pair isBal(TreeNode root){
        if(root==null){
            return new Pair();
        }
       Pair x= isBal(root.left);
       Pair y= isBal(root.right);
       Pair obj=new Pair();
       obj.ht=Math.max(x.ht,y.ht)+1;
      int bf=Math.abs(x.ht-y.ht);
     obj.isB= x.isB && y.isB && bf<=1;
     return obj;
    }
}
