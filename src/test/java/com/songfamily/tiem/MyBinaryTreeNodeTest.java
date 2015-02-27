package com.songfamily.tiem;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeNodeTest {

    @Test
    public void testGetPayload() throws Exception {
        MyBinaryTreeNode node = new MyBinaryTreeNode(1);
        Assert.assertEquals(1, node.getPayload());
    }

    @Test
    public void testSetAndGetChild() throws Exception {
        MyBinaryTreeNode node = new MyBinaryTreeNode(1);
        Assert.assertNull(node.getLeftChild());
        Assert.assertNull(node.getRightChild());

        node.setLeftChild(new MyBinaryTreeNode(0));
        Assert.assertEquals(0, node.getLeftChild().getPayload());
        Assert.assertNull(node.getRightChild());

        node.setRightChild(new MyBinaryTreeNode(2));
        Assert.assertEquals(0, node.getLeftChild().getPayload());
        Assert.assertEquals(2, node.getRightChild().getPayload());
    }
}