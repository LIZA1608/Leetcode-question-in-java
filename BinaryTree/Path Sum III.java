/*https://leetcode.com/problems/path-sum-iii/*/

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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        int x=selfPath( root,targetSum);
        int l=pathSum(root.left,targetSum);
        int r=pathSum(root.right,targetSum);
        return x+l+r;
    }
public int selfPath(TreeNode n,long ts){
    if(n==null){
        return 0;
    }
    int ans=0;
    if(ts-n.val==0){
        ans++;
    }
    int l=selfPath(n.left,ts-n.val);
    int r=selfPath(n.right,ts-n.val);
    return l+r+ans;
}
}
