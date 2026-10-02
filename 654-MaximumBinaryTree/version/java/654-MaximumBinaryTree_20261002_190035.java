// Last updated: 02/10/2026, 19:00:35
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode constructMaximumBinaryTree(int[] nums) {
18        Deque<TreeNode> stack=new LinkedList<>();
19        for(int i=0;i<nums.length;i++){
20            TreeNode curr=new TreeNode(nums[i]);
21            while(!stack.isEmpty() && stack.peek().val<nums[i]){
22                curr.left=stack.pop();
23            }
24            if(!stack.isEmpty()){
25                stack.peek().right=curr;
26            }
27            stack.push(curr);
28        }
29        return stack.isEmpty()?null:stack.removeLast();
30    }
31}