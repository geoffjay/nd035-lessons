package com.nd035.lesson1;

import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculate("1+2"));
        System.out.println(calculate("1+2*5"));
    }

    private static int calculate(String s) {
        int result = 0;
        Stack<Integer> stack = new Stack<Integer>();

        if (s == null || s.length() == 0) {
            return 0;
        }

        // get character
        // check for sign
        // calculate value

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
            }
        }

        for (int val : stack) {
            result += val;
        }
        return result;
    }
}