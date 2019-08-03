package com.nd035.lesson1;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testFindTarget() {
        Assert.assertEquals(BinarySearch.findTarget(new int[]{1, 5, 7, 8, 9, 11, 18, 19, 20, 25}, 11), 5);
        Assert.assertEquals(BinarySearch.findTarget(new int[]{1, 2, 3, 4, 5}, 10), -1);
    }
}
