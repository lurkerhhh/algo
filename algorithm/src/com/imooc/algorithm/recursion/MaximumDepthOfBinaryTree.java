package com.imooc.algorithm.recursion;

/**
 * @Author: Louis
 * @Date: Create in 2019/9/23 22:48
 * @Description:
 */
public class MaximumDepthOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 104 Maximum Depth of Binary Tree
     * https://leetcode.com/problems/maximum-depth-of-binary-tree/
     * 时间复杂度：O(n)，n是节点数
     * 空间复杂度：O(h)，h是树深度
     */
    public int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    /**
     * main
     */
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        // 成员内部类：[3,9,20,null,null,15,7]
        TreeNode treeNode = maximumDepthOfBinaryTree.new TreeNode(3);
        treeNode.left = maximumDepthOfBinaryTree.new TreeNode(9);
        treeNode.right = maximumDepthOfBinaryTree.new TreeNode(20);
        treeNode.right.left = maximumDepthOfBinaryTree.new TreeNode(15);
        treeNode.right.right = maximumDepthOfBinaryTree.new TreeNode(7);
        // ==> 3
        System.out.println(maximumDepthOfBinaryTree.maxDepth(treeNode));
    }
}
