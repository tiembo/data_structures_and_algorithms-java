package com.songfamily.tiem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyBinaryTreeTest {
    MyBinaryTree tree;

    @Before
    public void before() {

        /*        6
         *    2       7
         *  1   4       9
         *     3 5     8
          */

        tree = new MyBinaryTree();
        tree.insert(6);

        tree.insert(2);
        tree.insert(7);

        tree.insert(1);
        tree.insert(4);
        tree.insert(9);

        tree.insert(3);
        tree.insert(5);
        tree.insert(8);
    }

    @Test
    public void testToStringPreOrder() throws Exception {
        Assert.assertEquals("621435798", tree.toStringPreOrder());
    }

    @Test
    public void testToStringInOrder() throws Exception {
        Assert.assertEquals("123456789", tree.toStringInOrder());
    }

    @Test
    public void testToStringPostOrder() throws Exception {
        Assert.assertEquals("135428976", tree.toStringPostOrder());
    }
}