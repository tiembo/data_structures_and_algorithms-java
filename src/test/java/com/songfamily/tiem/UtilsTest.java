package com.songfamily.tiem;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

    @Test
    public void testAtoi() throws Exception {
        Assert.assertEquals(0, Utils.atoi("0"));
        Assert.assertEquals(12345, Utils.atoi("12345"));
        Assert.assertEquals(-12345, Utils.atoi("-12345"));

        // invalid ints
        Assert.assertEquals(0, Utils.atoi(""));
        Assert.assertEquals(0, Utils.atoi("-"));
        Assert.assertEquals(0, Utils.atoi("-12-345"));
        Assert.assertEquals(0, Utils.atoi("foo"));
        Assert.assertEquals(0, Utils.atoi("123bar"));
    }

    @Test
    public void testReverseWords() throws Exception {
        Assert.assertEquals("", Utils.reverseWords(""));
        Assert.assertEquals("abc", Utils.reverseWords("abc"));
        Assert.assertEquals("baz bar foo", Utils.reverseWords("foo bar baz"));
    }

    @Test
    public void testIsPalindrome() throws Exception {
        Assert.assertTrue(Utils.isPalindrome(""));
        Assert.assertTrue(Utils.isPalindrome("a"));
        Assert.assertTrue(Utils.isPalindrome("abba"));
        Assert.assertTrue(Utils.isPalindrome("abcba"));

        Assert.assertFalse(Utils.isPalindrome("ab"));
        Assert.assertFalse(Utils.isPalindrome("abcde"));
    }
}