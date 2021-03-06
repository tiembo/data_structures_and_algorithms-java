package com.songfamily.tiem.Exercises;

import com.songfamily.tiem.MyBinaryTreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeProblemsTest {
    BinaryTreeProblems tree;

    @Before
    public void before() {
        tree = new BinaryTreeProblems();
    }

    @Test
    public void testProblem1() throws Exception {
        tree.build123a();
        Assert.assertEquals("123", tree.toStringInOrder());

        tree.build123b();
        Assert.assertEquals("123", tree.toStringInOrder());

        tree.build123c();
        Assert.assertEquals("123", tree.toStringInOrder());
    }

    @Test
    public void testProblem2() throws Exception {
        Assert.assertEquals(0, tree.size());

        tree.insert(1);
        Assert.assertEquals(1, tree.size());

        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        Assert.assertEquals(4, tree.size());
    }

    @Test
    public void testProblem3() throws Exception {
        Assert.assertEquals(0, tree.maxDepth());

        tree.insert(5);
        Assert.assertEquals(1, tree.maxDepth());

        // add to right side of tree
        tree.insert(6);
        tree.insert(7);
        Assert.assertEquals(3, tree.maxDepth());

        // add to left side of tree, but not as much as right side
        tree.insert(4);
        Assert.assertEquals(3, tree.maxDepth());

        // add more to left side of tree, more than the right side
        tree.insert(3);
        tree.insert(2);
        Assert.assertEquals(4, tree.maxDepth());
    }

    @Test
    public void testProblem4() throws Exception {
        tree.insert(5);
        Assert.assertEquals(5, tree.minValue());
        Assert.assertEquals(5, tree.maxValue());

        tree.insert(3);
        tree.insert(7);
        Assert.assertEquals(3, tree.minValue());
        Assert.assertEquals(7, tree.maxValue());

        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        Assert.assertEquals(2, tree.minValue());
        Assert.assertEquals(8, tree.maxValue());
    }

    // all trees from http://cslibrary.stanford.edu/110/BinaryTrees.html#s2, problem 13
    @Test
    public void testProblem13And14() throws Exception {
        MyBinaryTreeNode five = new MyBinaryTreeNode(5);
        MyBinaryTreeNode two = new MyBinaryTreeNode(2);
        MyBinaryTreeNode seven = new MyBinaryTreeNode(7);
        MyBinaryTreeNode one = new MyBinaryTreeNode(1);
        MyBinaryTreeNode six = new MyBinaryTreeNode(6);

        // construct tree a
        tree.rootNode = five;
        five.setLeftChild(two);
        five.setRightChild(seven);
        Assert.assertTrue(tree.isBst());
        Assert.assertTrue(tree.isBst2());

        // construct tree b
        five.setLeftChild(six);
        Assert.assertFalse(tree.isBst());
        Assert.assertFalse(tree.isBst2());

        // construct tree c
        five.setLeftChild(two);
        two.setLeftChild(one);
        Assert.assertTrue(tree.isBst());
        Assert.assertTrue(tree.isBst2());

        // construct tree d
        two.setRightChild(six);
        Assert.assertFalse(tree.isBst());
        Assert.assertFalse(tree.isBst2());
    }
}