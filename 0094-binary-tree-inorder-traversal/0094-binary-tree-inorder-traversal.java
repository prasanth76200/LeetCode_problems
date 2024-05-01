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
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//          recur(root,res);
//         return res;
//     }
//     public void recur(TreeNode root,List<Integer> res){
//         if(root==null){
//             return;
//         }
//         recur(root.left,res);
//         res.add(root.val);
//         recur(root.right,res);
        
//     }
// }


class Solution{
     public List<Integer> inorderTraversal(TreeNode root){
       List<Integer> res = new ArrayList<>();
         Stack<TreeNode> stack = new Stack<>();
         TreeNode curr = root;
         while(curr!=null || !stack.isEmpty()){
             
             if(curr!=null){
                 stack.push(curr);
                 curr = curr.left;
             }
             else{
               curr = stack.pop();
                 res.add(curr.val);
                 curr = curr.right;
             }
         }
         
         return res;
         
         
     }
  
}
