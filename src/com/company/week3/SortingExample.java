package com.company.week3;

import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] arr = {34, 54, 23, 3, 12, 9, 0, 7, 456, 999};
        System.out.println("Before: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After: " + Arrays.toString(arr));

        int result = Arrays.binarySearch(arr, 7);
        System.out.println(result);

        sortOwnExample();

    }

    private static void sortOwnExample() {
        int[] arr = {10, 6, 1, 9, 15, 6};
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = arr[i];
        }
        for (int i = 0; i < sortedArr.length - 1; i++) {
            for (int j = 0; j < sortedArr.length - 1; j++) {
                if (sortedArr[j] > sortedArr[j + 1]) {
                    int temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sortedArr));
    }
}
