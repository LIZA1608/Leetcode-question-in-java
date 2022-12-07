/*https://leetcode.com/problems/path-sum-ii/*/

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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> x= new ArrayList<>();
        psum(ans,x,root,targetSum);
        return ans;
    }
    public void psum(List<List<Integer>> ans,List<Integer> x,TreeNode n, int ts){
        if(n==null){
            return;
        }
        x.add(n.val);
        if(n.left==null && n.right==null){
          if(ts-n.val==0){
              ans.add(new ArrayList(x));
                x.remove(x.size()-1);
              return;
          }
        }
        psum(ans,x,n.left,ts-n.val);
        psum(ans,x,n.right,ts-n.val);
        x.remove(x.size()-1);
       return;
    }
}
