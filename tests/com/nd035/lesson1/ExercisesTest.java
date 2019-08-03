package com.nd035.lesson1;

import org.junit.Assert;
import org.junit.Test;

public class ExercisesTest {
    @Test
    public void testFindDuplicate() {
        Assert.assertEquals(Exercises.findDuplicate("abcabc"), 3);
        Assert.assertEquals(Exercises.findDuplicate("abcd"), -1);
    }

    @Test
    public void testTwoSum() {
        Assert.assertTrue(Exercises.twoSum(new int[]{1, 2, 3, 4}, 5));
        Assert.assertFalse(Exercises.twoSum(new int[]{1, 4, 5, 1, 6}, 12));
    }

    @Test
    public void testReverseString() {
        Assert.assertEquals(Exercises.reverseString("Hello World!"), "!dlroW olleH");
        Assert.assertEquals(Exercises.reverseString("abcde"), "edcba");
    }

    @Test
    public void testFindLargestNums() {
        Integer[] nums1 = (Integer[])Exercises.findLargestNumbers(new int[]{-1, 15, 59, 22, 6, 42, 45, 0}, 4).toArray();
        Integer[] nums2 = (Integer[])Exercises.findLargestNumbers(new int[]{5, 10, 22, 100, 8}, 2).toArray();
        Assert.assertArrayEquals(nums1, new Integer[]{});
        Assert.assertArrayEquals(nums2, new Integer[]{});
    }

    @Test
    public void testTranslateNumberToWord() {
        Assert.assertEquals(Exercises.translateNumberToWord(10245), "ten thousand two hundred forty five");
        Assert.assertEquals(Exercises.translateNumberToWord(125), "one hundred twenty five");
    }
}
