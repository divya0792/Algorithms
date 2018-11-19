package com.leetcode.medium;

public class Leetcode_814_PruneBinaryTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode pruneTree(TreeNode root) {
        helper(root);
        return root;

    }

    private void helper(TreeNode node) {
        if(node == null) {
            return;
        }
        if(node.left != null) {
            helper(node.left);
            if(node.left.val == 0 && node.left.left == null && node.left.right == null) {
                node.left = null;
            }
        }
        if(node.right != null) {
            helper(node.right);
            if(node.right.val == 0 && node.right.left == null && node.right.right == null)
                node.right = null;
        }
    }
}
