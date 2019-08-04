package com.nd035.lesson1;

import java.util.Arrays;

public class BinarySearch {
    public static int findTarget(int[] arr, int target) {
        int pos = arr.length / 2;
        if (pos == 0) {
            return -1;
        }
        if (arr[pos] == target) {
            return pos;
        } else if (arr[pos] > target) {
            return findTarget(Arrays.copyOfRange(arr, pos, arr.length), target);
        } else {
            return findTarget(Arrays.copyOfRange(arr, 0, pos), target);
        }
    }
}
