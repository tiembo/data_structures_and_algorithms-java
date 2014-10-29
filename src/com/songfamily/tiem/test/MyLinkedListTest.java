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


}