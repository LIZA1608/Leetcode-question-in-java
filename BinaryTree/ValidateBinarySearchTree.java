/*https://leetcode.com/problems/validate-binary-search-tree/*/

class Pair{
    long min=Long.MAX_VALUE;
    long max=Long.MIN_VALUE;
    boolean isBST=true;
}
class Solution {
    public boolean isValidBST(TreeNode root){
        return isValidBS(root).isBST;
    }
    public Pair isValidBS(TreeNode root) {
        if(root==null){
            return new Pair();
        }
        Pair x=isValidBS(root.left);
        Pair y=isValidBS(root.right);
        Pair obj=new Pair();
        if(x.isBST==true && y.isBST==true && x.max<root.val && y.min>root.val){
            obj.isBST=true;
             obj.min=Math.min(root.val,Math.min(x.min,y.min));
        obj.max=Math.max(root.val,Math.max(x.max,y.max));
            return obj;
        }
        obj.isBST=false;
        obj.min=Math.min(root.val,Math.min(x.min,y.min));
        obj.max=Math.max(root.val,Math.max(x.max,y.max));
        return obj;
    }
}
