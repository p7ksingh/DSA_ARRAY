package com.arr.array;

import java.util.Arrays;

public class ShortArray1 {
    public static int[] shortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 9, 8, 7, 4, 2, 1 };
        System.out.println("Original Arrays: " + Arrays.toString(arr));
        System.out.println("Sorted Array" + Arrays.toString(shortedArray(arr)));
    }
}