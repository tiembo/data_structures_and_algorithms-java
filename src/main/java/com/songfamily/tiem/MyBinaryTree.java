package com.songfamily.tiem;

public class MyBinaryTree {
    private MyBinaryTreeNode rootNode;

    public MyBinaryTree() {
        rootNode = null;
    }

    public void insert(int i) {
        rootNode = insert(i, rootNode);
    }

    private MyBinaryTreeNode insert(int i, MyBinaryTreeNode node) {
        if (node == null) {
            node = new MyBinaryTreeNode(i);
        } else {
            if (i <= node.getPayload())
                node.setLeftChild(insert(i, node.getLeftChild()));
            else
                node.setRightChild(insert(i, node.getRightChild()));
        }

        return node;
    }

    public String toStringPreOrder() {
        return toStringPreOrder(rootNode);
    }

    private String toStringPreOrder(MyBinaryTreeNode node) {
        if (node == null)
            return "";

        return String.valueOf(node.getPayload()) +
                toStringPreOrder(node.getLeftChild()) +
                toStringPreOrder(node.getRightChild());
    }

    public String toStringInOrder() {
        return toStringInOrder(rootNode);
    }

    private String toStringInOrder(MyBinaryTreeNode node) {
        if (node == null)
            return "";

        return toStringInOrder(node.getLeftChild()) +
                String.valueOf(node.getPayload()) +
                toStringInOrder(node.getRightChild());
    }

    public String toStringPostOrder() {
        return toStringPostOrder(rootNode);
    }

    private String toStringPostOrder(MyBinaryTreeNode node) {
        if (node == null)
            return "";

        return toStringPostOrder(node.getLeftChild()) +
                toStringPostOrder(node.getRightChild()) +
                String.valueOf(node.getPayload());
    }
}
