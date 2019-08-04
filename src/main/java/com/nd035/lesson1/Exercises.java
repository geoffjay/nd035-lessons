package com.nd035.lesson1;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;

public class Exercises {
    /**
     * Example: input: "abcabc", return: 3
     * Example: input: "abcd", return: -1
     *
     * @param input String to check for duplicates
     * @return Position of the first duplicate
     */
    static int findDuplicate(@NotNull String input) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (set.contains(c)) {
                return i;
            }
            set.add(c);
        }
        return -1;
    }

    /**
     * Example1: input[1, 2, 3, 4], target:5, return true
     * Example2: input[1, 4, 5, 1, 6], target 12, return false
     *
     * @param nums
     * @param target
     * @return
     */
    static boolean twoSum(@NotNull int[] input, int target) {
        Set<Integer> set = new HashSet<Integer>();
        for (int value : input) {
            if (set.contains(target - value)) return true;
            set.add(value);
        }
        return false;
    }

    /**
     * Example1: input: "Hello World!", return "!dlroW olleH"
     * Example2: input: “abcde”, return “edcba”
     *
     * @param s
     * @return
     */
    static String reverseString(@NotNull String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result.concat(String.valueOf(s.charAt(i)));
        }
        return result;
    }

    /**
     * Example 1: [-1, 15, 59, 22, 6, 42, 45, 0], k=4, return {22, 42, 45, 59}
     * Example 2: [5, 10, 22, 100, 8], k=2, return {22, 100}
     *
     * @param arr
     * @param k
     * @return
     */
    @NotNull
    @Contract(pure = true)
    static ArrayList<Integer> findLargestNumbers(@NotNull int[] arr, int k) {
        TreeSet<Integer> set =  new TreeSet<Integer>();
        for (int n : arr) {
            set.add(n);
            if (set.size() > k) {
                set.pollFirst();
            }
        }
        return new ArrayList<Integer>(set);
    }

    /**
     * Example1:
     * Input: 10245
     * Output: "ten thousand two hundred forty five"
     *
     * Example2:
     * Input: 125
     * Output: "one hundred twenty five"
     *
     * @param number
     * @return
     */
    @NotNull
    @Contract(pure = true)
    static String translateNumberToWord(int number) {
        return "just thinking about doing this one is annoying";
    }
}
