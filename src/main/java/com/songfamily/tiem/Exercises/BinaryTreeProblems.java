package com.songfamily.tiem.Exercises;

import com.songfamily.tiem.MyBinaryTree;
import com.songfamily.tiem.MyBinaryTreeNode;

// from http://cslibrary.stanford.edu/110/BinaryTrees.html#s2
public class BinaryTreeProblems extends MyBinaryTree {

    /*************************************************************************
     * Problem 1
     *************************************************************************/
    public void build123a() {
        rootNode = new MyBinaryTreeNode(2);
        MyBinaryTreeNode left = new MyBinaryTreeNode(1);
        MyBinaryTreeNode right = new MyBinaryTreeNode(3);
        rootNode.setLeftChild(left);
        rootNode.setRightChild(right);
    }

    public void build123b() {
        rootNode = new MyBinaryTreeNode(2);
        rootNode.setLeftChild(new MyBinaryTreeNode(1));
        rootNode.setRightChild(new MyBinaryTreeNode(3));
    }

    public void build123c() {
        rootNode = insert(2, null);
        rootNode = insert(1, rootNode);
        rootNode = insert(3, rootNode);
    }

    /*************************************************************************
     * Problem 2
     *************************************************************************/
    public int size() {
        return size(rootNode);
    }

    private int size(MyBinaryTreeNode node) {
        if (node == null)
            return 0;

        return 1 + size(node.getLeftChild()) + size(node.getRightChild());
    }

    /*************************************************************************
     * Problem 3
     *************************************************************************/
    public int maxDepth() {
        return maxDepth(rootNode);
    }

    private int maxDepth(MyBinaryTreeNode node) {
        if (node == null)
            return 0;

        int leftMax = maxDepth(node.getLeftChild());
        int rightMax = maxDepth(node.getRightChild());
        return 1 + Math.max(leftMax, rightMax);
    }

    /*************************************************************************
     * Problem 4
     *************************************************************************/
    public int minValue() {
        return minValue(rootNode);
    }

    private int minValue(MyBinaryTreeNode node) {
        if (node.getLeftChild() == null)
            return node.getPayload();
        else
            return minValue(node.getLeftChild());
    }

    public int maxValue() {
        return maxValue(rootNode);
    }

    private int maxValue(MyBinaryTreeNode node) {
        if (node.getRightChild() == null)
            return node.getPayload();
        else
            return maxValue(node.getRightChild());
    }
}
