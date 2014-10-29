package com.songfamily.tiem.test;

import com.songfamily.tiem.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void testAdd() throws Exception {
        MyLinkedList list = new MyLinkedList();

        // base case
        Assert.assertEquals(null, list.toString());

        // one element
        list.add("foo");
        Assert.assertEquals("foo", list.toString());

        // multiple elements
        list.add("bar");
        list.add("baz");
        Assert.assertEquals("foobarbaz", list.toString());
    }

    @Test
    public void testReverse() throws Exception {
        MyLinkedList list = new MyLinkedList();

        // base case
        list.reverse();
        Assert.assertEquals(null, list.toString());

        // one element
        list = new MyLinkedList();
        list.add("foo");
        list.reverse();
        Assert.assertEquals("foo", list.toString());

        // two elements
        list = new MyLinkedList();
        list.add("foo");
        list.add("bar");
        list.reverse();
        Assert.assertEquals("barfoo", list.toString());

        // multiple elements
        list = new MyLinkedList();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        list.add("hello");
        list.add("world");
        list.reverse();
        Assert.assertEquals("worldhellobazbarfoo", list.toString());
    }
}