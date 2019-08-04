package com.nd035.lesson1;

public class FindPermutations {
    public static void main(String[] args) {
        printPermutation(new int[]{1, 2}, 0);
        printPermutation(new int[]{1, 2, 3}, 0);
    }

    private static void printPermutation(int[] arr, int index) {
        if (arr.length == index + 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            //if (index < arr.length - 1) {
            //    System.out.print(", ");
            //}
            System.out.print('\n');
        } else {
            // print all options
            for (int i = index; i < arr.length; i++) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                printPermutation(arr, index + 1);
            }
        }
    }
}
