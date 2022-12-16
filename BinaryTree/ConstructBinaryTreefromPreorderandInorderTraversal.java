/*https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/*/

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
    public int search(int[] in,int x,int y,int c ){
  for(int i=x;i<=y;i++){
      if(in[i]==c){
          return i;
      }
  }
  return -1;
    }
    public TreeNode build(int []pre,int a,int b,int [] in,int x,int y){
        if(a>b || x>y){
            return null;
        }
        TreeNode n=new TreeNode(pre[a]);
        int z=search(in,x,y,pre[a]);
        n.left=build(pre,a+1,a+z-x,in,x,z-1);
        n.right=build(pre,a+z-x+1,b,in,z+1,y);
        return n;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      return  build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
}
