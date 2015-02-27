package com.songfamily.tiem;

import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void testSize() throws Exception {
        MySet s = new MySet();
        Assert.assertEquals(0, s.size());

        s.add(1);
        Assert.assertEquals(1, s.size());
    }

    @Test
    public void testContains() throws Exception {
        MySet s = new MySet();
        Assert.assertFalse(s.contains(1));

        s.add(1);
        Assert.assertTrue(s.contains(1));
    }

    @Test
    public void testAdd() throws Exception {
        MySet s = new MySet();
        Assert.assertEquals("", s.toString());

        Assert.assertTrue(s.add(1));
        Assert.assertEquals("1", s.toString());

        Assert.assertTrue(s.add(2));
        Assert.assertTrue(s.add(3));
        Assert.assertEquals("1 2 3", s.toString());

        Assert.assertFalse(s.add(2));
        Assert.assertEquals("1 2 3", s.toString());

        // make sure storage expands
        s = new MySet(1);
        s.add(1);
        Assert.assertEquals("1", s.toString());
        s.add(2);
        Assert.assertEquals("1 2", s.toString());
    }

    @Test
    public void testExpandStorage() throws Exception {
        MySet s = new MySet(1);
        Assert.assertEquals(1, s.storageLength());

        s.expandStorage();
        Assert.assertEquals(2, s.storageLength());
    }

    @Test
    public void testStorageLength() throws Exception {
        MySet s = new MySet(1);
        Assert.assertEquals(1, s.storageLength());

        s = new MySet(10);
        Assert.assertEquals(10, s.storageLength());
    }
}
