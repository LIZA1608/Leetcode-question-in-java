

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
   public List<Integer> postorderTraversal(TreeNode root) {
        Deque<Integer> res = new ArrayDeque<>();
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(s.size() > 0) {
            TreeNode node = s.pop();
            if(node != null) {
                res.addFirst(node.val);
                s.push(node.left);
                s.push(node.right);
            }
        }
        return new ArrayList<>(res);
    }
}
