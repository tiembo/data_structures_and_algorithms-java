package com.songfamily.tiem;

public class MyBinaryTreeNode {
    private int payload;
    private MyBinaryTreeNode leftChild;
    private MyBinaryTreeNode rightChild;

    public MyBinaryTreeNode(int i) {
        payload = i;
        leftChild = null;
        rightChild = null;
    }

    public int getPayload() {
        return payload;
    }

    public MyBinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(MyBinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public MyBinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(MyBinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
