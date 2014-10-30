package com.songfamily.tiem;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListNodeTest {

    // TODO: use before / after

    @Test
    public void testGetPayload() throws Exception {
        MyLinkedListNode node = new MyLinkedListNode("foo");
        Assert.assertEquals("foo", node.getPayload());
    }

    @Test
    public void testGetNextNode() throws Exception {
        MyLinkedListNode node = new MyLinkedListNode("foo");
        Assert.assertEquals(null, node.getNextNode());

        MyLinkedListNode nextnode = new MyLinkedListNode("bar");
        node.setNextNode(nextnode);
        Assert.assertEquals(nextnode, node.getNextNode());

    }
}